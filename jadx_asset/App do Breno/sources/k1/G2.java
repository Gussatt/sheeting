package k1;

import V0.AbstractC0554m;
import V0.C0547f;
import V0.C0553l;
import V0.C0556o;
import V0.InterfaceC0555n;
import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import n1.InterfaceC1440g;

/* JADX INFO: loaded from: classes.dex */
public final class G2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static G2 f9042d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1363z3 f9043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0555n f9044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f9045c = new AtomicLong(-1);

    public G2(Context context, C1363z3 c1363z3) {
        this.f9044b = AbstractC0554m.b(context, C0556o.a().b("measurement:api").a());
        this.f9043a = c1363z3;
    }

    public static G2 a(C1363z3 c1363z3) {
        if (f9042d == null) {
            f9042d = new G2(c1363z3.d(), c1363z3);
        }
        return f9042d;
    }

    public final synchronized void c(int i4, int i5, long j4, long j5, int i6) {
        final long jB = this.f9043a.f().b();
        AtomicLong atomicLong = this.f9045c;
        if (atomicLong.get() != -1 && jB - atomicLong.get() <= 1800000) {
            return;
        }
        this.f9044b.a(new C0553l(0, Arrays.asList(new C0547f(36301, i5, 0, j4, j5, null, null, 0, i6)))).e(new InterfaceC1440g() { // from class: k1.E2
            @Override // n1.InterfaceC1440g
            public final void c(Exception exc) {
                this.f8951a.f9045c.set(jB);
            }
        });
    }
}
