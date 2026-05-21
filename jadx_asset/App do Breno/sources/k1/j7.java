package k1;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f9520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9521b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9522c = d();

    public j7(l7 l7Var) {
        this.f9520a = l7Var;
    }

    public final void b() {
        this.f9521b++;
        this.f9522c = d();
    }

    public final boolean c() {
        return this.f9520a.f().a() >= this.f9522c;
    }

    public final long d() {
        l7 l7Var = this.f9520a;
        AbstractC0549h.j(l7Var);
        long jLongValue = ((Long) AbstractC1291q2.f9783v.a(null)).longValue();
        long jLongValue2 = ((Long) AbstractC1291q2.f9785w.a(null)).longValue();
        for (int i4 = 1; i4 < this.f9521b; i4++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        return l7Var.f().a() + Math.min(jLongValue, jLongValue2);
    }
}
