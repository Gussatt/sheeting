package X0;

import T0.a;
import T0.e;
import U0.AbstractC0530n;
import U0.InterfaceC0528l;
import V0.C0553l;
import V0.C0556o;
import V0.InterfaceC0555n;
import android.content.Context;
import f1.AbstractC0944c;
import n1.AbstractC1445l;
import n1.C1446m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends T0.e implements InterfaceC0555n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a.g f3927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a.AbstractC0073a f3928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final T0.a f3929m;

    static {
        a.g gVar = new a.g();
        f3927k = gVar;
        d dVar = new d();
        f3928l = dVar;
        f3929m = new T0.a("ClientTelemetry.API", dVar, gVar);
    }

    public e(Context context, C0556o c0556o) {
        super(context, f3929m, c0556o, e.a.f3475c);
    }

    @Override // V0.InterfaceC0555n
    public final AbstractC1445l a(final C0553l c0553l) {
        AbstractC0530n.a aVarA = AbstractC0530n.a();
        aVarA.d(AbstractC0944c.f7202a);
        aVarA.c(false);
        aVarA.b(new InterfaceC0528l() { // from class: X0.c
            @Override // U0.InterfaceC0528l
            public final void a(Object obj, Object obj2) {
                a.g gVar = e.f3927k;
                ((a) ((f) obj).D()).o1(c0553l);
                ((C1446m) obj2).c(null);
            }
        });
        return c(aVarA.a());
    }
}
