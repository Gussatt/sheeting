package n2;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0609f;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l2.AbstractC1388b;
import m2.InterfaceC1401d;
import s2.InterfaceC1536a;
import t2.InterfaceC1544a;
import w2.InterfaceC1619l;
import w2.InterfaceC1620m;

/* JADX INFO: renamed from: n2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1451b implements s2.b, t2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.a f10686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1536a.b f10687c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1401d f10689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f10690f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Service f10693i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BroadcastReceiver f10695k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ContentProvider f10697m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10685a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f10688d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10691g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f10692h = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f10694j = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f10696l = new HashMap();

    /* JADX INFO: renamed from: n2.b$b, reason: collision with other inner class name */
    public static class C0141b implements InterfaceC1536a.InterfaceC0172a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q2.d f10698a;

        @Override // s2.InterfaceC1536a.InterfaceC0172a
        public String a(String str) {
            return this.f10698a.j(str);
        }

        public C0141b(q2.d dVar) {
            this.f10698a = dVar;
        }
    }

    /* JADX INFO: renamed from: n2.b$c */
    public static class c implements t2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f10699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HiddenLifecycleReference f10700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f10701c = new HashSet();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f10702d = new HashSet();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Set f10703e = new HashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Set f10704f = new HashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f10705g = new HashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Set f10706h = new HashSet();

        public c(Activity activity, AbstractC0609f abstractC0609f) {
            this.f10699a = activity;
            this.f10700b = new HiddenLifecycleReference(abstractC0609f);
        }

        @Override // t2.c
        public void a(InterfaceC1620m interfaceC1620m) {
            this.f10703e.add(interfaceC1620m);
        }

        @Override // t2.c
        public void b(InterfaceC1619l interfaceC1619l) {
            this.f10702d.remove(interfaceC1619l);
        }

        @Override // t2.c
        public void c(InterfaceC1620m interfaceC1620m) {
            this.f10703e.remove(interfaceC1620m);
        }

        @Override // t2.c
        public Activity d() {
            return this.f10699a;
        }

        @Override // t2.c
        public void e(InterfaceC1619l interfaceC1619l) {
            this.f10702d.add(interfaceC1619l);
        }

        public boolean f(int i4, int i5, Intent intent) {
            Iterator it = new HashSet(this.f10702d).iterator();
            while (true) {
                boolean z3 = false;
                while (it.hasNext()) {
                    if (((InterfaceC1619l) it.next()).a(i4, i5, intent) || z3) {
                        z3 = true;
                    }
                }
                return z3;
            }
        }

        public void g(Intent intent) {
            Iterator it = this.f10703e.iterator();
            while (it.hasNext()) {
                ((InterfaceC1620m) it.next()).b(intent);
            }
        }

        public boolean h(int i4, String[] strArr, int[] iArr) {
            Iterator it = this.f10701c.iterator();
            if (!it.hasNext()) {
                return false;
            }
            i.d.a(it.next());
            throw null;
        }

        public void i(Bundle bundle) {
            Iterator it = this.f10706h.iterator();
            if (it.hasNext()) {
                i.d.a(it.next());
                throw null;
            }
        }

        public void j(Bundle bundle) {
            Iterator it = this.f10706h.iterator();
            if (it.hasNext()) {
                i.d.a(it.next());
                throw null;
            }
        }

        public void k() {
            Iterator it = this.f10704f.iterator();
            if (it.hasNext()) {
                i.d.a(it.next());
                throw null;
            }
        }
    }

    public C1451b(Context context, io.flutter.embedding.engine.a aVar, q2.d dVar, io.flutter.embedding.engine.b bVar) {
        this.f10686b = aVar;
        this.f10687c = new InterfaceC1536a.b(context, aVar, aVar.l(), aVar.w(), aVar.r().X(), new C0141b(dVar), bVar);
    }

    @Override // t2.b
    public boolean a(int i4, int i5, Intent intent) {
        if (!s()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean zF = this.f10690f.f(i4, i5, intent);
            if (eVarG != null) {
                eVarG.close();
            }
            return zF;
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t2.b
    public void b(Intent intent) {
        if (!s()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f10690f.g(intent);
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t2.b
    public boolean c(int i4, String[] strArr, int[] iArr) {
        if (!s()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean zH = this.f10690f.h(i4, strArr, iArr);
            if (eVarG != null) {
                eVarG.close();
            }
            return zH;
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // s2.b
    public void d(InterfaceC1536a interfaceC1536a) {
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#add " + interfaceC1536a.getClass().getSimpleName());
        try {
            if (r(interfaceC1536a.getClass())) {
                AbstractC1388b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC1536a + ") but it was already registered with this FlutterEngine (" + this.f10686b + ").");
                if (eVarG != null) {
                    eVarG.close();
                    return;
                }
                return;
            }
            AbstractC1388b.f("FlutterEngineCxnRegstry", "Adding plugin: " + interfaceC1536a);
            this.f10685a.put(interfaceC1536a.getClass(), interfaceC1536a);
            interfaceC1536a.c(this.f10687c);
            if (interfaceC1536a instanceof InterfaceC1544a) {
                InterfaceC1544a interfaceC1544a = (InterfaceC1544a) interfaceC1536a;
                this.f10688d.put(interfaceC1536a.getClass(), interfaceC1544a);
                if (s()) {
                    interfaceC1544a.h(this.f10690f);
                }
            }
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t2.b
    public void e() {
        if (!s()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f10691g = true;
            Iterator it = this.f10688d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC1544a) it.next()).i();
            }
            m();
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t2.b
    public void f(Bundle bundle) {
        if (!s()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f10690f.i(bundle);
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t2.b
    public void g() {
        if (!s()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f10688d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC1544a) it.next()).d();
            }
            m();
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t2.b
    public void h(InterfaceC1401d interfaceC1401d, AbstractC0609f abstractC0609f) {
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            InterfaceC1401d interfaceC1401d2 = this.f10689e;
            if (interfaceC1401d2 != null) {
                interfaceC1401d2.e();
            }
            n();
            this.f10689e = interfaceC1401d;
            k((Activity) interfaceC1401d.f(), abstractC0609f);
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t2.b
    public void i(Bundle bundle) {
        if (!s()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f10690f.j(bundle);
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // t2.b
    public void j() {
        if (!s()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f10690f.k();
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void k(Activity activity, AbstractC0609f abstractC0609f) {
        this.f10690f = new c(activity, abstractC0609f);
        this.f10686b.r().r0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f10686b.t().n(activity, this.f10686b.w(), this.f10686b.l());
        for (InterfaceC1544a interfaceC1544a : this.f10688d.values()) {
            if (this.f10691g) {
                interfaceC1544a.f(this.f10690f);
            } else {
                interfaceC1544a.h(this.f10690f);
            }
        }
        this.f10691g = false;
    }

    public void l() {
        AbstractC1388b.f("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public final void m() {
        this.f10686b.r().O();
        this.f10686b.s().r();
        this.f10689e = null;
        this.f10690f = null;
    }

    public final void n() {
        if (s()) {
            g();
            return;
        }
        if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    public void o() {
        if (!t()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator it = this.f10694j.values().iterator();
            if (it.hasNext()) {
                i.d.a(it.next());
                throw null;
            }
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void p() {
        if (!u()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator it = this.f10696l.values().iterator();
            if (it.hasNext()) {
                i.d.a(it.next());
                throw null;
            }
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void q() {
        if (!v()) {
            AbstractC1388b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator it = this.f10692h.values().iterator();
            if (it.hasNext()) {
                i.d.a(it.next());
                throw null;
            }
            this.f10693i = null;
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean r(Class cls) {
        return this.f10685a.containsKey(cls);
    }

    public final boolean s() {
        return this.f10689e != null;
    }

    public final boolean t() {
        return this.f10695k != null;
    }

    public final boolean u() {
        return this.f10697m != null;
    }

    public final boolean v() {
        return this.f10693i != null;
    }

    public void w(Class cls) {
        InterfaceC1536a interfaceC1536a = (InterfaceC1536a) this.f10685a.get(cls);
        if (interfaceC1536a == null) {
            return;
        }
        I2.e eVarG = I2.e.g("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (interfaceC1536a instanceof InterfaceC1544a) {
                if (s()) {
                    ((InterfaceC1544a) interfaceC1536a).d();
                }
                this.f10688d.remove(cls);
            }
            interfaceC1536a.r(this.f10687c);
            this.f10685a.remove(cls);
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void x(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w((Class) it.next());
        }
    }

    public void y() {
        x(new HashSet(this.f10685a.keySet()));
        this.f10685a.clear();
    }
}
