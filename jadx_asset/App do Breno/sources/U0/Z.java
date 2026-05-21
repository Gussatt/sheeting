package U0;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends Fragment implements InterfaceC0524h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f3542c = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f3543b = new b0();

    public static Z b(Activity activity) {
        Z z3;
        WeakHashMap weakHashMap = f3542c;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (z3 = (Z) weakReference.get()) != null) {
            return z3;
        }
        try {
            Z z4 = (Z) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (z4 == null || z4.isRemoving()) {
                z4 = new Z();
                activity.getFragmentManager().beginTransaction().add(z4, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(z4));
            return z4;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e4);
        }
    }

    @Override // U0.InterfaceC0524h
    public final void a(String str, AbstractC0523g abstractC0523g) {
        this.f3543b.d(str, abstractC0523g);
    }

    @Override // U0.InterfaceC0524h
    public final AbstractC0523g d(String str, Class cls) {
        return this.f3543b.c(str, cls);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f3543b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // U0.InterfaceC0524h
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        this.f3543b.f(i4, i5, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3543b.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f3543b.h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f3543b.i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f3543b.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f3543b.k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f3543b.l();
    }
}
