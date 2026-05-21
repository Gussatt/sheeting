package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static VirtualDisplay.Callback f7996i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f7997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1069a f7999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1083o f8002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnFocusChangeListener f8003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VirtualDisplay f8004h;

    public class a extends VirtualDisplay.Callback {
        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onPaused() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onResumed() {
        }
    }

    public class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f8005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f8006c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f8005b.postDelayed(bVar.f8006c, 128L);
            }
        }

        public b(View view, Runnable runnable) {
            this.f8005b = view;
            this.f8006c = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c.a(this.f8005b, new a());
            this.f8005b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static class c implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f8009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f8010b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f8009a.getViewTreeObserver().removeOnDrawListener(c.this);
            }
        }

        public c(View view, Runnable runnable) {
            this.f8009a = view;
            this.f8010b = runnable;
        }

        public static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new c(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f8010b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f8010b = null;
            this.f8009a.post(new a());
        }
    }

    public b0(Context context, C1069a c1069a, VirtualDisplay virtualDisplay, InterfaceC1079k interfaceC1079k, InterfaceC1083o interfaceC1083o, View.OnFocusChangeListener onFocusChangeListener, int i4, Object obj) {
        this.f7998b = context;
        this.f7999c = c1069a;
        this.f8002f = interfaceC1083o;
        this.f8003g = onFocusChangeListener;
        this.f8001e = i4;
        this.f8004h = virtualDisplay;
        this.f8000d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f8004h.getDisplay(), interfaceC1079k, c1069a, i4, onFocusChangeListener);
        this.f7997a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static b0 b(Context context, C1069a c1069a, InterfaceC1079k interfaceC1079k, InterfaceC1083o interfaceC1083o, int i4, int i5, int i6, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        if (i4 == 0 || i5 == 0) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        interfaceC1083o.b(i4, i5);
        VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i6, i4, i5, displayMetrics.densityDpi, interfaceC1083o.getSurface(), 0, f7996i, null);
        if (virtualDisplayCreateVirtualDisplay == null) {
            return null;
        }
        return new b0(context, c1069a, virtualDisplayCreateVirtualDisplay, interfaceC1079k, interfaceC1083o, onFocusChangeListener, i6, obj);
    }

    public void a() {
        this.f8004h.setSurface(null);
    }

    public void c(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f7997a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void d() {
        this.f7997a.cancel();
        this.f7997a.detachState();
        this.f8004h.release();
        this.f8002f.release();
    }

    public int e() {
        InterfaceC1083o interfaceC1083o = this.f8002f;
        if (interfaceC1083o != null) {
            return interfaceC1083o.getHeight();
        }
        return 0;
    }

    public int f() {
        InterfaceC1083o interfaceC1083o = this.f8002f;
        if (interfaceC1083o != null) {
            return interfaceC1083o.getWidth();
        }
        return 0;
    }

    public View g() {
        SingleViewPresentation singleViewPresentation = this.f7997a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    public void h() {
        SingleViewPresentation singleViewPresentation = this.f7997a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f7997a.getView().e();
    }

    public void i() {
        SingleViewPresentation singleViewPresentation = this.f7997a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f7997a.getView().b();
    }

    public void j() {
        int iF = f();
        int iE = e();
        boolean zIsFocused = g().isFocused();
        SingleViewPresentation.d dVarDetachState = this.f7997a.detachState();
        this.f8004h.setSurface(null);
        this.f8004h.release();
        this.f8004h = ((DisplayManager) this.f7998b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.f8001e, iF, iE, this.f8000d, this.f8002f.getSurface(), 0, f7996i, null);
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f7998b, this.f8004h.getDisplay(), this.f7999c, dVarDetachState, this.f8003g, zIsFocused);
        singleViewPresentation.show();
        this.f7997a.cancel();
        this.f7997a = singleViewPresentation;
    }

    public void k(int i4, int i5, Runnable runnable) {
        if (i4 == f() && i5 == e()) {
            g().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            l(g(), i4, i5, runnable);
            return;
        }
        boolean zIsFocused = g().isFocused();
        SingleViewPresentation.d dVarDetachState = this.f7997a.detachState();
        this.f8004h.setSurface(null);
        this.f8004h.release();
        DisplayManager displayManager = (DisplayManager) this.f7998b.getSystemService("display");
        this.f8002f.b(i4, i5);
        this.f8004h = displayManager.createVirtualDisplay("flutter-vd#" + this.f8001e, i4, i5, this.f8000d, this.f8002f.getSurface(), 0, f7996i, null);
        View viewG = g();
        viewG.addOnAttachStateChangeListener(new b(viewG, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f7998b, this.f8004h.getDisplay(), this.f7999c, dVarDetachState, this.f8003g, zIsFocused);
        singleViewPresentation.show();
        this.f7997a.cancel();
        this.f7997a = singleViewPresentation;
    }

    public final void l(View view, int i4, int i5, Runnable runnable) {
        this.f8002f.b(i4, i5);
        this.f8004h.resize(i4, i5, this.f8000d);
        this.f8004h.setSurface(this.f8002f.getSurface());
        view.postDelayed(runnable, 0L);
    }
}
