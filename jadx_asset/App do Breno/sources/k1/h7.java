package k1;

import V0.AbstractC0549h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.T2 f9468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f9469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f9470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l7 f9472e;

    public /* synthetic */ h7(l7 l7Var, k7 k7Var) {
        this.f9472e = l7Var;
    }

    public static final long b(com.google.android.gms.internal.measurement.I2 i22) {
        return ((i22.I() / 1000) / 60) / 60;
    }

    public final boolean a(long j4, com.google.android.gms.internal.measurement.I2 i22) {
        AbstractC0549h.j(i22);
        if (this.f9470c == null) {
            this.f9470c = new ArrayList();
        }
        if (this.f9469b == null) {
            this.f9469b = new ArrayList();
        }
        if (!this.f9470c.isEmpty() && b((com.google.android.gms.internal.measurement.I2) this.f9470c.get(0)) != b(i22)) {
            return false;
        }
        long jC = this.f9471d + ((long) i22.c());
        l7 l7Var = this.f9472e;
        if (!l7Var.D0().P(null, AbstractC1291q2.f9775r1)) {
            l7Var.D0();
            if (jC >= C1264n.o()) {
                return false;
            }
        } else if (!this.f9470c.isEmpty()) {
            l7Var.D0();
            if (jC >= C1264n.o()) {
                return false;
            }
        }
        this.f9471d = jC;
        this.f9470c.add(i22);
        this.f9469b.add(Long.valueOf(j4));
        int size = this.f9470c.size();
        l7Var.D0();
        return size < Math.max(1, ((Integer) AbstractC1291q2.f9752k.a(null)).intValue());
    }
}
