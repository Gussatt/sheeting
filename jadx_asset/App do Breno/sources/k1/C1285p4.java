package k1;

import android.util.Log;

/* JADX INFO: renamed from: k1.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1285p4 implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1363z3 f9653a;

    public C1285p4(C1293q4 c1293q4, C1363z3 c1363z3) {
        this.f9653a = c1363z3;
    }

    @Override // k1.B2
    public final boolean a() {
        C1363z3 c1363z3 = this.f9653a;
        return c1363z3.q() && Log.isLoggable(c1363z3.c().D(), 3);
    }
}
