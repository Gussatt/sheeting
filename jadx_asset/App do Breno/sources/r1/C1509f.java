package r1;

import U0.ComponentCallbacks2C0519c;
import U0.X;
import V0.AbstractC0548g;
import V0.AbstractC0549h;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import b1.AbstractC0635c;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import g2.AbstractC0970c;
import g2.C0969b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p.C1475a;
import w1.C1604c;
import w1.C1607f;
import w1.n;
import w1.w;
import x1.EnumC1633B;

/* JADX INFO: renamed from: r1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1509f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f11196k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map f11197l = new C1475a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f11200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1.n f11201d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f11204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U1.b f11205h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11202e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f11203f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f11206i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f11207j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: r1.f$a */
    public interface a {
        void a(boolean z3);
    }

    /* JADX INFO: renamed from: r1.f$b */
    public static class b implements ComponentCallbacks2C0519c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference f11208a = new AtomicReference();

        public static void c(Context context) {
            if (b1.k.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f11208a.get() == null) {
                    b bVar = new b();
                    if (X.a(f11208a, null, bVar)) {
                        ComponentCallbacks2C0519c.c(application);
                        ComponentCallbacks2C0519c.b().a(bVar);
                    }
                }
            }
        }

        @Override // U0.ComponentCallbacks2C0519c.a
        public void a(boolean z3) {
            synchronized (C1509f.f11196k) {
                try {
                    for (C1509f c1509f : new ArrayList(C1509f.f11197l.values())) {
                        if (c1509f.f11202e.get()) {
                            c1509f.A(z3);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r1.f$c */
    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static AtomicReference f11209b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f11210a;

        public c(Context context) {
            this.f11210a = context;
        }

        public static void b(Context context) {
            if (f11209b.get() == null) {
                c cVar = new c(context);
                if (X.a(f11209b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f11210a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C1509f.f11196k) {
                try {
                    Iterator it = C1509f.f11197l.values().iterator();
                    while (it.hasNext()) {
                        ((C1509f) it.next()).t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public C1509f(final Context context, String str, n nVar) {
        this.f11198a = (Context) AbstractC0549h.j(context);
        this.f11199b = AbstractC0549h.d(str);
        this.f11200c = (n) AbstractC0549h.j(nVar);
        o oVarB = FirebaseInitProvider.b();
        AbstractC0970c.b("Firebase");
        AbstractC0970c.b("ComponentDiscovery");
        List listB = C1607f.c(context, ComponentDiscoveryService.class).b();
        AbstractC0970c.a();
        AbstractC0970c.b("Runtime");
        n.b bVarF = w1.n.m(EnumC1633B.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C1604c.q(context, Context.class, new Class[0])).b(C1604c.q(this, C1509f.class, new Class[0])).b(C1604c.q(nVar, n.class, new Class[0])).f(new C0969b());
        if (y.k.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C1604c.q(oVarB, o.class, new Class[0]));
        }
        w1.n nVarE = bVarF.e();
        this.f11201d = nVarE;
        AbstractC0970c.a();
        this.f11204g = new w(new U1.b() { // from class: r1.d
            @Override // U1.b
            public final Object get() {
                return C1509f.b(this.f11193a, context);
            }
        });
        this.f11205h = nVarE.e(T1.f.class);
        g(new a() { // from class: r1.e
            @Override // r1.C1509f.a
            public final void a(boolean z3) {
                C1509f.a(this.f11195a, z3);
            }
        });
        AbstractC0970c.a();
    }

    public static /* synthetic */ void a(C1509f c1509f, boolean z3) {
        if (z3) {
            c1509f.getClass();
        } else {
            ((T1.f) c1509f.f11205h.get()).g();
        }
    }

    public static /* synthetic */ Z1.a b(C1509f c1509f, Context context) {
        return new Z1.a(context, c1509f.s(), (S1.c) c1509f.f11201d.a(S1.c.class));
    }

    public static List l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f11196k) {
            try {
                Iterator it = f11197l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1509f) it.next()).q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List n(Context context) {
        ArrayList arrayList;
        synchronized (f11196k) {
            arrayList = new ArrayList(f11197l.values());
        }
        return arrayList;
    }

    public static C1509f o() {
        C1509f c1509f;
        synchronized (f11196k) {
            try {
                c1509f = (C1509f) f11197l.get("[DEFAULT]");
                if (c1509f == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + b1.n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((T1.f) c1509f.f11205h.get()).g();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1509f;
    }

    public static C1509f p(String str) {
        C1509f c1509f;
        String str2;
        synchronized (f11196k) {
            try {
                c1509f = (C1509f) f11197l.get(z(str));
                if (c1509f == null) {
                    List listL = l();
                    if (listL.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listL);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((T1.f) c1509f.f11205h.get()).g();
            } finally {
            }
        }
        return c1509f;
    }

    public static C1509f u(Context context) {
        synchronized (f11196k) {
            try {
                if (f11197l.containsKey("[DEFAULT]")) {
                    return o();
                }
                n nVarA = n.a(context);
                if (nVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return v(context, nVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C1509f v(Context context, n nVar) {
        return w(context, nVar, "[DEFAULT]");
    }

    public static C1509f w(Context context, n nVar, String str) {
        C1509f c1509f;
        b.c(context);
        String strZ = z(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f11196k) {
            Map map = f11197l;
            AbstractC0549h.o(!map.containsKey(strZ), "FirebaseApp name " + strZ + " already exists!");
            AbstractC0549h.k(context, "Application context cannot be null.");
            c1509f = new C1509f(context, strZ, nVar);
            map.put(strZ, c1509f);
        }
        c1509f.t();
        return c1509f;
    }

    public static String z(String str) {
        return str.trim();
    }

    public final void A(boolean z3) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f11206i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z3);
        }
    }

    public final void B() {
        Iterator it = this.f11207j.iterator();
        while (it.hasNext()) {
            ((InterfaceC1510g) it.next()).a(this.f11199b, this.f11200c);
        }
    }

    public void C(boolean z3) {
        i();
        if (this.f11202e.compareAndSet(!z3, z3)) {
            boolean zD = ComponentCallbacks2C0519c.b().d();
            if (z3 && zD) {
                A(true);
            } else {
                if (z3 || !zD) {
                    return;
                }
                A(false);
            }
        }
    }

    public void D(Boolean bool) {
        i();
        ((Z1.a) this.f11204g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1509f) {
            return this.f11199b.equals(((C1509f) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f11202e.get() && ComponentCallbacks2C0519c.b().d()) {
            aVar.a(true);
        }
        this.f11206i.add(aVar);
    }

    public void h(InterfaceC1510g interfaceC1510g) {
        i();
        AbstractC0549h.j(interfaceC1510g);
        this.f11207j.add(interfaceC1510g);
    }

    public int hashCode() {
        return this.f11199b.hashCode();
    }

    public final void i() {
        AbstractC0549h.o(!this.f11203f.get(), "FirebaseApp was deleted");
    }

    public void j() {
        if (this.f11203f.compareAndSet(false, true)) {
            synchronized (f11196k) {
                f11197l.remove(this.f11199b);
            }
            B();
        }
    }

    public Object k(Class cls) {
        i();
        return this.f11201d.a(cls);
    }

    public Context m() {
        i();
        return this.f11198a;
    }

    public String q() {
        i();
        return this.f11199b;
    }

    public n r() {
        i();
        return this.f11200c;
    }

    public String s() {
        return AbstractC0635c.a(q().getBytes(Charset.defaultCharset())) + "+" + AbstractC0635c.a(r().c().getBytes(Charset.defaultCharset()));
    }

    public final void t() {
        if (!y.k.a(this.f11198a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f11198a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f11201d.p(y());
        ((T1.f) this.f11205h.get()).g();
    }

    public String toString() {
        return AbstractC0548g.c(this).a("name", this.f11199b).a("options", this.f11200c).toString();
    }

    public boolean x() {
        i();
        return ((Z1.a) this.f11204g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
