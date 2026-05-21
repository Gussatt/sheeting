package k1;

import android.os.Bundle;
import android.util.SparseArray;
import q1.InterfaceC1492a;

/* JADX INFO: loaded from: classes.dex */
public final class G4 implements InterfaceC1492a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K6 f9048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9049b;

    public G4(C1238j5 c1238j5, K6 k6) {
        this.f9048a = k6;
        this.f9049b = c1238j5;
    }

    @Override // q1.InterfaceC1492a
    public final void a(Throwable th) {
        C1238j5 c1238j5 = this.f9049b;
        c1238j5.h();
        c1238j5.f9504i = false;
        C1363z3 c1363z3 = c1238j5.f9366a;
        int iE0 = (c1363z3.B().P(null, AbstractC1291q2.f9724a1) ? C1238j5.e0(c1238j5, th) : 2) - 1;
        if (iE0 == 0) {
            c1363z3.c().w().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", K2.z(c1238j5.f9366a.D().t()), K2.z(th.toString()));
            c1238j5.f9505j = 1;
            c1238j5.v0().add(this.f9048a);
            return;
        }
        if (iE0 != 1) {
            c1363z3.c().r().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", K2.z(c1238j5.f9366a.D().t()), th);
            c();
            c1238j5.f9505j = 1;
            c1238j5.I();
            return;
        }
        c1238j5.v0().add(this.f9048a);
        if (c1238j5.f9505j > ((Integer) AbstractC1291q2.f9786w0.a(null)).intValue()) {
            c1238j5.f9505j = 1;
            c1363z3.c().w().c("registerTriggerAsync failed. May try later. App ID, throwable", K2.z(c1238j5.f9366a.D().t()), K2.z(th.toString()));
        } else {
            c1363z3.c().w().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", K2.z(c1238j5.f9366a.D().t()), K2.z(String.valueOf(c1238j5.f9505j)), K2.z(th.toString()));
            C1238j5.t(c1238j5, c1238j5.f9505j);
            int i4 = c1238j5.f9505j;
            c1238j5.f9505j = i4 + i4;
        }
    }

    @Override // q1.InterfaceC1492a
    public final void b(Object obj) {
        C1238j5 c1238j5 = this.f9049b;
        c1238j5.h();
        c();
        c1238j5.f9504i = false;
        c1238j5.f9505j = 1;
        c1238j5.f9366a.c().q().b("Successfully registered trigger URI", this.f9048a.f9121m);
        c1238j5.I();
    }

    public final void c() {
        C1363z3 c1363z3 = this.f9049b.f9366a;
        SparseArray sparseArrayR = c1363z3.H().r();
        K6 k6 = this.f9048a;
        sparseArrayR.put(k6.f9123o, Long.valueOf(k6.f9122n));
        Z2 z2H = c1363z3.H();
        int[] iArr = new int[sparseArrayR.size()];
        long[] jArr = new long[sparseArrayR.size()];
        for (int i4 = 0; i4 < sparseArrayR.size(); i4++) {
            iArr[i4] = sparseArrayR.keyAt(i4);
            jArr[i4] = ((Long) sparseArrayR.valueAt(i4)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        z2H.f9324p.b(bundle);
    }
}
