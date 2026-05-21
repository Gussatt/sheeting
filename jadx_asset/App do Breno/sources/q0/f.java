package q0;

import X2.z;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import r0.InterfaceC1503a;
import s0.AbstractC1525a;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11038a = a.f11039a;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f11040b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f11039a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f11041c = z.b(f.class).c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final K2.f f11042d = K2.g.a(C0159a.f11044n);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static g f11043e = b.f11014a;

        /* JADX INFO: renamed from: q0.f$a$a, reason: collision with other inner class name */
        public static final class C0159a extends X2.m implements W2.a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0159a f11044n = new C0159a();

            public C0159a() {
                super(0);
            }

            @Override // W2.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC1503a e() {
                WindowLayoutComponent windowLayoutComponentG;
                try {
                    ClassLoader classLoader = f.class.getClassLoader();
                    e eVar = classLoader != null ? new e(classLoader, new n0.d(classLoader)) : null;
                    if (eVar == null || (windowLayoutComponentG = eVar.g()) == null) {
                        return null;
                    }
                    AbstractC1525a.C0171a c0171a = AbstractC1525a.f11315a;
                    X2.l.d(classLoader, "loader");
                    return c0171a.a(windowLayoutComponentG, new n0.d(classLoader));
                } catch (Throwable unused) {
                    if (a.f11040b) {
                        Log.d(a.f11041c, "Failed to load WindowExtensions");
                    }
                    return null;
                }
            }
        }

        public final InterfaceC1503a c() {
            return (InterfaceC1503a) f11042d.getValue();
        }

        public final f d(Context context) {
            X2.l.e(context, "context");
            InterfaceC1503a interfaceC1503aC = c();
            if (interfaceC1503aC == null) {
                interfaceC1503aC = androidx.window.layout.adapter.sidecar.b.f5525c.a(context);
            }
            return f11043e.a(new i(o.f11061b, interfaceC1503aC));
        }
    }

    k3.d a(Activity activity);
}
