package u3;

import X2.l;
import java.io.EOFException;
import java.io.IOException;
import t3.AbstractC1553i;
import t3.C1546b;
import t3.Q;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1553i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f11487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f11489p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Q q4, long j4, boolean z3) {
        super(q4);
        l.e(q4, "delegate");
        this.f11487n = j4;
        this.f11488o = z3;
    }

    public final void a(C1546b c1546b, long j4) throws EOFException {
        C1546b c1546b2 = new C1546b();
        c1546b2.W(c1546b);
        c1546b.m(c1546b2, j4);
        c1546b2.a();
    }

    @Override // t3.AbstractC1553i, t3.Q
    public long o(C1546b c1546b, long j4) throws IOException {
        l.e(c1546b, "sink");
        long j5 = this.f11489p;
        long j6 = this.f11487n;
        if (j5 > j6) {
            j4 = 0;
        } else if (this.f11488o) {
            long j7 = j6 - j5;
            if (j7 == 0) {
                return -1L;
            }
            j4 = Math.min(j4, j7);
        }
        long jO = super.o(c1546b, j4);
        if (jO != -1) {
            this.f11489p += jO;
        }
        long j8 = this.f11489p;
        long j9 = this.f11487n;
        if ((j8 >= j9 || jO != -1) && j8 <= j9) {
            return jO;
        }
        if (jO > 0 && j8 > j9) {
            a(c1546b, c1546b.O() - (this.f11489p - this.f11487n));
        }
        throw new IOException("expected " + this.f11487n + " bytes but got " + this.f11489p);
    }
}
