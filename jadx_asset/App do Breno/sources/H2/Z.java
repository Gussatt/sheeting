package H2;

import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f1955a;

    public class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f1956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DisplayManager f1957b;

        public a(ArrayList arrayList, DisplayManager displayManager) {
            this.f1956a = arrayList;
            this.f1957b = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i4) {
            Iterator it = this.f1956a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i4);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i4) {
            if (this.f1957b.getDisplay(i4) == null) {
                return;
            }
            Iterator it = this.f1956a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i4);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i4) {
            Iterator it = this.f1956a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i4);
            }
        }
    }

    public static ArrayList c(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList arrayList2 = new ArrayList();
            Field field = null;
            for (Object obj2 : arrayList) {
                if (field == null) {
                    field = obj2.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
            }
            return arrayList2;
        } catch (IllegalAccessException | NoSuchFieldException e4) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e4);
            return new ArrayList();
        }
    }

    public void a(DisplayManager displayManager) {
        ArrayList arrayListC = c(displayManager);
        arrayListC.removeAll(this.f1955a);
        if (arrayListC.isEmpty()) {
            return;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
            displayManager.registerDisplayListener(new a(arrayListC, displayManager), null);
        }
    }

    public void b(DisplayManager displayManager) {
        this.f1955a = c(displayManager);
    }
}
