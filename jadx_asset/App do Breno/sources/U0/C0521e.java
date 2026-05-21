package U0;

import S0.C0504b;
import S0.C0512j;
import V0.AbstractC0545d;
import V0.AbstractC0554m;
import V0.C0547f;
import V0.C0550i;
import V0.C0551j;
import V0.C0553l;
import V0.C0563w;
import V0.InterfaceC0555n;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import f1.HandlerC0949h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import n1.AbstractC1445l;
import n1.C1446m;
import p.C1476b;

/* JADX INFO: renamed from: U0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0521e implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f3561p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f3562q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f3563r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static C0521e f3564s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0553l f3567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0555n f3568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f3569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0512j f3570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0563w f3571g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f3578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f3579o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3565a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3566b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f3572h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f3573i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f3574j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0533q f3575k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f3576l = new C1476b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f3577m = new C1476b();

    public C0521e(Context context, Looper looper, C0512j c0512j) {
        this.f3579o = true;
        this.f3569e = context;
        HandlerC0949h handlerC0949h = new HandlerC0949h(looper, this);
        this.f3578n = handlerC0949h;
        this.f3570f = c0512j;
        this.f3571g = new C0563w(c0512j);
        if (b1.h.a(context)) {
            this.f3579o = false;
        }
        handlerC0949h.sendMessage(handlerC0949h.obtainMessage(6));
    }

    public static Status f(C0518b c0518b, C0504b c0504b) {
        return new Status(c0504b, "API: " + c0518b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c0504b));
    }

    public static C0521e t(Context context) {
        C0521e c0521e;
        synchronized (f3563r) {
            try {
                if (f3564s == null) {
                    f3564s = new C0521e(context.getApplicationContext(), AbstractC0545d.b().getLooper(), C0512j.m());
                }
                c0521e = f3564s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0521e;
    }

    public final void A(C0547f c0547f, int i4, long j4, int i5) {
        this.f3578n.sendMessage(this.f3578n.obtainMessage(18, new I(c0547f, i4, j4, i5)));
    }

    public final void B(C0504b c0504b, int i4) {
        if (e(c0504b, i4)) {
            return;
        }
        Handler handler = this.f3578n;
        handler.sendMessage(handler.obtainMessage(5, i4, 0, c0504b));
    }

    public final void C() {
        Handler handler = this.f3578n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void D(T0.e eVar) {
        Handler handler = this.f3578n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void a(C0533q c0533q) {
        synchronized (f3563r) {
            try {
                if (this.f3575k != c0533q) {
                    this.f3575k = c0533q;
                    this.f3576l.clear();
                }
                this.f3576l.addAll(c0533q.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(C0533q c0533q) {
        synchronized (f3563r) {
            try {
                if (this.f3575k == c0533q) {
                    this.f3575k = null;
                    this.f3576l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.f3566b) {
            return false;
        }
        C0551j c0551jA = C0550i.b().a();
        if (c0551jA != null && !c0551jA.g()) {
            return false;
        }
        int iA = this.f3571g.a(this.f3569e, 203400000);
        return iA == -1 || iA == 0;
    }

    public final boolean e(C0504b c0504b, int i4) {
        return this.f3570f.w(this.f3569e, c0504b, i4);
    }

    public final C0540y g(T0.e eVar) {
        Map map = this.f3574j;
        C0518b c0518bE = eVar.e();
        C0540y c0540y = (C0540y) map.get(c0518bE);
        if (c0540y == null) {
            c0540y = new C0540y(this, eVar);
            this.f3574j.put(c0518bE, c0540y);
        }
        if (c0540y.b()) {
            this.f3577m.add(c0518bE);
        }
        c0540y.E();
        return c0540y;
    }

    public final InterfaceC0555n h() {
        if (this.f3568d == null) {
            this.f3568d = AbstractC0554m.a(this.f3569e);
        }
        return this.f3568d;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        C0540y c0540y = null;
        switch (i4) {
            case 1:
                this.f3565a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f3578n.removeMessages(12);
                for (C0518b c0518b : this.f3574j.keySet()) {
                    Handler handler = this.f3578n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c0518b), this.f3565a);
                }
                return true;
            case 2:
                i.d.a(message.obj);
                throw null;
            case 3:
                for (C0540y c0540y2 : this.f3574j.values()) {
                    c0540y2.D();
                    c0540y2.E();
                }
                return true;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                J j4 = (J) message.obj;
                C0540y c0540yG = (C0540y) this.f3574j.get(j4.f3522c.e());
                if (c0540yG == null) {
                    c0540yG = g(j4.f3522c);
                }
                if (!c0540yG.b() || this.f3573i.get() == j4.f3521b) {
                    c0540yG.F(j4.f3520a);
                } else {
                    j4.f3520a.a(f3561p);
                    c0540yG.K();
                }
                return true;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                int i5 = message.arg1;
                C0504b c0504b = (C0504b) message.obj;
                Iterator it = this.f3574j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C0540y c0540y3 = (C0540y) it.next();
                        if (c0540y3.q() == i5) {
                            c0540y = c0540y3;
                        }
                    }
                }
                if (c0540y == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i5 + " while trying to fail enqueued calls.", new Exception());
                } else if (c0504b.d() == 13) {
                    c0540y.f(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f3570f.e(c0504b.d()) + ": " + c0504b.f()));
                } else {
                    c0540y.f(f(c0540y.f3605n, c0504b));
                }
                return true;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                if (this.f3569e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0519c.c((Application) this.f3569e.getApplicationContext());
                    ComponentCallbacks2C0519c.b().a(new C0535t(this));
                    if (!ComponentCallbacks2C0519c.b().e(true)) {
                        this.f3565a = 300000L;
                    }
                }
                return true;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                g((T0.e) message.obj);
                return true;
            case 9:
                if (this.f3574j.containsKey(message.obj)) {
                    ((C0540y) this.f3574j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f3577m.iterator();
                while (it2.hasNext()) {
                    C0540y c0540y4 = (C0540y) this.f3574j.remove((C0518b) it2.next());
                    if (c0540y4 != null) {
                        c0540y4.K();
                    }
                }
                this.f3577m.clear();
                return true;
            case 11:
                if (this.f3574j.containsKey(message.obj)) {
                    ((C0540y) this.f3574j.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f3574j.containsKey(message.obj)) {
                    ((C0540y) this.f3574j.get(message.obj)).c();
                }
                return true;
            case 14:
                i.d.a(message.obj);
                throw null;
            case 15:
                A a4 = (A) message.obj;
                if (this.f3574j.containsKey(a4.f3498a)) {
                    C0540y.B((C0540y) this.f3574j.get(a4.f3498a), a4);
                }
                return true;
            case 16:
                A a5 = (A) message.obj;
                if (this.f3574j.containsKey(a5.f3498a)) {
                    C0540y.C((C0540y) this.f3574j.get(a5.f3498a), a5);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                I i6 = (I) message.obj;
                if (i6.f3518c == 0) {
                    h().a(new C0553l(i6.f3517b, Arrays.asList(i6.f3516a)));
                } else {
                    C0553l c0553l = this.f3567c;
                    if (c0553l != null) {
                        List listF = c0553l.f();
                        if (c0553l.d() != i6.f3517b || (listF != null && listF.size() >= i6.f3519d)) {
                            this.f3578n.removeMessages(17);
                            i();
                        } else {
                            this.f3567c.g(i6.f3516a);
                        }
                    }
                    if (this.f3567c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(i6.f3516a);
                        this.f3567c = new C0553l(i6.f3517b, arrayList);
                        Handler handler2 = this.f3578n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), i6.f3518c);
                    }
                }
                return true;
            case 19:
                this.f3566b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i4);
                return false;
        }
    }

    public final void i() {
        C0553l c0553l = this.f3567c;
        if (c0553l != null) {
            if (c0553l.d() > 0 || d()) {
                h().a(c0553l);
            }
            this.f3567c = null;
        }
    }

    public final void j(C1446m c1446m, int i4, T0.e eVar) {
        H hB;
        if (i4 == 0 || (hB = H.b(this, i4, eVar.e())) == null) {
            return;
        }
        AbstractC1445l abstractC1445lA = c1446m.a();
        final Handler handler = this.f3578n;
        handler.getClass();
        abstractC1445lA.b(new Executor() { // from class: U0.s
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, hB);
    }

    public final int k() {
        return this.f3572h.getAndIncrement();
    }

    public final C0540y s(C0518b c0518b) {
        return (C0540y) this.f3574j.get(c0518b);
    }

    public final void z(T0.e eVar, int i4, AbstractC0530n abstractC0530n, C1446m c1446m, InterfaceC0529m interfaceC0529m) {
        j(c1446m, abstractC0530n.d(), eVar);
        this.f3578n.sendMessage(this.f3578n.obtainMessage(4, new J(new Q(i4, abstractC0530n, c1446m, interfaceC0529m), this.f3573i.get(), eVar)));
    }
}
