package k1;

import V0.AbstractC0549h;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: k1.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1198e7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x7 f9415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l7 f9416b;

    public CallableC1198e7(l7 l7Var, x7 x7Var) {
        this.f9415a = x7Var;
        this.f9416b = l7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        x7 x7Var = this.f9415a;
        String str = (String) AbstractC0549h.j(x7Var.f9967m);
        l7 l7Var = this.f9416b;
        C1229i4 c1229i4N0 = l7Var.N0(str);
        EnumC1221h4 enumC1221h4 = EnumC1221h4.ANALYTICS_STORAGE;
        if (c1229i4N0.r(enumC1221h4) && C1229i4.k(x7Var.f9954G, 100).r(enumC1221h4)) {
            return l7Var.B0(x7Var).d();
        }
        l7Var.c().v().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
