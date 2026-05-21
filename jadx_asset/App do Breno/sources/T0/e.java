package T0;

import T0.a;
import U0.AbstractC0530n;
import U0.AbstractServiceConnectionC0526j;
import U0.C0517a;
import U0.C0518b;
import U0.C0521e;
import U0.C0533q;
import U0.C0540y;
import U0.D;
import U0.InterfaceC0529m;
import V0.AbstractC0549h;
import V0.C0543b;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zact;
import java.util.Collections;
import n1.AbstractC1445l;
import n1.C1446m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T0.a f3467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.d f3468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0518b f3469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f3470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f3472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC0529m f3473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0521e f3474j;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f3475c = new C0074a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0529m f3476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f3477b;

        /* JADX INFO: renamed from: T0.e$a$a, reason: collision with other inner class name */
        public static class C0074a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public InterfaceC0529m f3478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Looper f3479b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f3478a == null) {
                    this.f3478a = new C0517a();
                }
                if (this.f3479b == null) {
                    this.f3479b = Looper.getMainLooper();
                }
                return new a(this.f3478a, this.f3479b);
            }
        }

        public a(InterfaceC0529m interfaceC0529m, Account account, Looper looper) {
            this.f3476a = interfaceC0529m;
            this.f3477b = looper;
        }
    }

    public e(Context context, Activity activity, T0.a aVar, a.d dVar, a aVar2) {
        AbstractC0549h.k(context, "Null context is not permitted.");
        AbstractC0549h.k(aVar, "Api must not be null.");
        AbstractC0549h.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC0549h.k(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f3465a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : d(context);
        this.f3466b = attributionTag;
        this.f3467c = aVar;
        this.f3468d = dVar;
        this.f3470f = aVar2.f3477b;
        C0518b c0518bA = C0518b.a(aVar, dVar, attributionTag);
        this.f3469e = c0518bA;
        this.f3472h = new D(this);
        C0521e c0521eT = C0521e.t(context2);
        this.f3474j = c0521eT;
        this.f3471g = c0521eT.k();
        this.f3473i = aVar2.f3476a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C0533q.u(activity, c0521eT, c0518bA);
        }
        c0521eT.D(this);
    }

    public C0543b.a b() {
        C0543b.a aVar = new C0543b.a();
        aVar.d(null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.f3465a.getClass().getName());
        aVar.b(this.f3465a.getPackageName());
        return aVar;
    }

    public AbstractC1445l c(AbstractC0530n abstractC0530n) {
        return j(2, abstractC0530n);
    }

    public String d(Context context) {
        return null;
    }

    public final C0518b e() {
        return this.f3469e;
    }

    public String f() {
        return this.f3466b;
    }

    public final int g() {
        return this.f3471g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f h(Looper looper, C0540y c0540y) {
        C0543b c0543bA = b().a();
        a.f fVarA = ((a.AbstractC0073a) AbstractC0549h.j(this.f3467c.a())).a(this.f3465a, looper, c0543bA, this.f3468d, c0540y, c0540y);
        String strF = f();
        if (strF != null && (fVarA instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) fVarA).P(strF);
        }
        if (strF == null || !(fVarA instanceof AbstractServiceConnectionC0526j)) {
            return fVarA;
        }
        i.d.a(fVarA);
        throw null;
    }

    public final zact i(Context context, Handler handler) {
        return new zact(context, handler, b().a());
    }

    public final AbstractC1445l j(int i4, AbstractC0530n abstractC0530n) {
        C1446m c1446m = new C1446m();
        this.f3474j.z(this, i4, abstractC0530n, c1446m, this.f3473i);
        return c1446m.a();
    }

    public e(Context context, T0.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
