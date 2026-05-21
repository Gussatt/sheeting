package androidx.window.layout.adapter.sidecar;

import K2.p;
import L2.m;
import X2.g;
import X2.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n0.k;
import q0.j;
import t0.C1538a;

/* JADX INFO: loaded from: classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5513f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f5514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1538a f5515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f5517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f5518e;

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecarInterfaceG;
            l.e(sidecarDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = SidecarCompat.this.f5516c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.f5513f.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterfaceG = sidecarCompat.g()) != null) {
                    windowLayoutInfo = sidecarInterfaceG.getWindowLayoutInfo(iBinderA);
                }
                b bVar = sidecarCompat.f5518e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f5515b.f(windowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            l.e(iBinder, "windowToken");
            l.e(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f5516c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            C1538a c1538a = SidecarCompat.this.f5515b;
            SidecarInterface sidecarInterfaceG = SidecarCompat.this.g();
            if (sidecarInterfaceG == null || (sidecarDeviceState = sidecarInterfaceG.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            j jVarF = c1538a.f(sidecarWindowLayoutInfo, sidecarDeviceState);
            b bVar = SidecarCompat.this.f5518e;
            if (bVar != null) {
                bVar.a(activity, jVarF);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            l.e(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return k.f10610r.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public static final class b implements a.InterfaceC0105a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0105a f5520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReentrantLock f5521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakHashMap f5522c;

        public b(a.InterfaceC0105a interfaceC0105a) {
            l.e(interfaceC0105a, "callbackInterface");
            this.f5520a = interfaceC0105a;
            this.f5521b = new ReentrantLock();
            this.f5522c = new WeakHashMap();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0105a
        public void a(Activity activity, j jVar) {
            l.e(activity, "activity");
            l.e(jVar, "newLayout");
            ReentrantLock reentrantLock = this.f5521b;
            reentrantLock.lock();
            try {
                if (l.a(jVar, (j) this.f5522c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.f5520a.a(activity, jVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            l.e(activity, "activity");
            ReentrantLock reentrantLock = this.f5521b;
            reentrantLock.lock();
            try {
                this.f5522c.put(activity, null);
                p pVar = p.f2516a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SidecarCompat f5523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakReference f5524c;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            l.e(sidecarCompat, "sidecarCompat");
            l.e(activity, "activity");
            this.f5523b = sidecarCompat;
            this.f5524c = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            l.e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f5524c.get();
            IBinder iBinderA = SidecarCompat.f5513f.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f5523b.i(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            l.e(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, C1538a c1538a) {
        l.e(c1538a, "sidecarAdapter");
        this.f5514a = sidecarInterface;
        this.f5515b = c1538a;
        this.f5516c = new LinkedHashMap();
        this.f5517d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(a.InterfaceC0105a interfaceC0105a) {
        l.e(interfaceC0105a, "extensionCallback");
        this.f5518e = new b(interfaceC0105a);
        SidecarInterface sidecarInterface = this.f5514a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f5515b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        l.e(activity, "activity");
        IBinder iBinderA = f5513f.a(activity);
        if (iBinderA != null) {
            i(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        l.e(activity, "activity");
        IBinder iBinderA = f5513f.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f5514a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        k(activity);
        b bVar = this.f5518e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z3 = this.f5516c.size() == 1;
        this.f5516c.remove(iBinderA);
        if (!z3 || (sidecarInterface = this.f5514a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface g() {
        return this.f5514a;
    }

    public final j h(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        l.e(activity, "activity");
        IBinder iBinderA = f5513f.a(activity);
        if (iBinderA == null) {
            return new j(m.f());
        }
        SidecarInterface sidecarInterface = this.f5514a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        C1538a c1538a = this.f5515b;
        SidecarInterface sidecarInterface2 = this.f5514a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return c1538a.f(windowLayoutInfo, sidecarDeviceState);
    }

    public final void i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        l.e(iBinder, "windowToken");
        l.e(activity, "activity");
        this.f5516c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f5514a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f5516c.size() == 1 && (sidecarInterface = this.f5514a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f5518e;
        if (bVar != null) {
            bVar.a(activity, h(activity));
        }
        j(activity);
    }

    public final void j(Activity activity) {
        this.f5517d.get(activity);
    }

    public final void k(Activity activity) {
        if (((B.a) this.f5517d.get(activity)) == null) {
            return;
        }
        this.f5517d.remove(activity);
    }

    public boolean l() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f5514a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!l.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f5514a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f5514a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f5514a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!l.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f5514a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!l.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f5514a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!l.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                l.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            l.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                l.c(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!l.a(arrayList, (List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f5513f.b(context), new C1538a(null, 1, null));
        l.e(context, "context");
    }
}
