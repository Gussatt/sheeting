package k1;

import V0.AbstractC0549h;
import android.os.Bundle;

/* JADX INFO: renamed from: k1.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1207f7 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f9439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g7 f9440p;

    public RunnableC1207f7(g7 g7Var, String str, String str2, Bundle bundle) {
        this.f9437m = str;
        this.f9438n = str2;
        this.f9439o = bundle;
        this.f9440p = g7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l7 l7Var = this.f9440p.f9449a;
        w7 w7VarG = l7Var.g();
        long jA = l7Var.f().a();
        String str = this.f9437m;
        l7Var.y((C1150J) AbstractC0549h.j(w7VarG.q(str, this.f9438n, this.f9439o, "auto", jA, false, true)), str);
    }
}
