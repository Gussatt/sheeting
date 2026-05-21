package U0;

import S0.C0504b;
import V0.C0544c;
import V0.C0547f;
import V0.C0550i;
import V0.C0551j;
import android.os.SystemClock;
import b1.AbstractC0634b;
import com.google.android.gms.common.api.Status;
import n1.AbstractC1445l;
import n1.InterfaceC1439f;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC1439f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0521e f3511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0518b f3513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3515e;

    public H(C0521e c0521e, int i4, C0518b c0518b, long j4, long j5, String str, String str2) {
        this.f3511a = c0521e;
        this.f3512b = i4;
        this.f3513c = c0518b;
        this.f3514d = j4;
        this.f3515e = j5;
    }

    public static H b(C0521e c0521e, int i4, C0518b c0518b) {
        boolean zH;
        if (!c0521e.d()) {
            return null;
        }
        C0551j c0551jA = C0550i.b().a();
        if (c0551jA == null) {
            zH = true;
        } else {
            if (!c0551jA.g()) {
                return null;
            }
            zH = c0551jA.h();
            C0540y c0540yS = c0521e.s(c0518b);
            if (c0540yS != null) {
                if (!(c0540yS.v() instanceof com.google.android.gms.common.internal.a)) {
                    return null;
                }
                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) c0540yS.v();
                if (aVar.J() && !aVar.h()) {
                    C0544c c0544cC = c(c0540yS, aVar, i4);
                    if (c0544cC == null) {
                        return null;
                    }
                    c0540yS.G();
                    zH = c0544cC.i();
                }
            }
        }
        return new H(c0521e, i4, c0518b, zH ? System.currentTimeMillis() : 0L, zH ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static C0544c c(C0540y c0540y, com.google.android.gms.common.internal.a aVar, int i4) {
        int[] iArrF;
        int[] iArrG;
        C0544c c0544cH = aVar.H();
        if (c0544cH == null || !c0544cH.h() || ((iArrF = c0544cH.f()) != null ? !AbstractC0634b.a(iArrF, i4) : !((iArrG = c0544cH.g()) == null || !AbstractC0634b.a(iArrG, i4))) || c0540y.s() >= c0544cH.d()) {
            return null;
        }
        return c0544cH;
    }

    @Override // n1.InterfaceC1439f
    public final void a(AbstractC1445l abstractC1445l) {
        C0540y c0540yS;
        int i4;
        int i5;
        int i6;
        int iD;
        long j4;
        long j5;
        if (this.f3511a.d()) {
            C0551j c0551jA = C0550i.b().a();
            if ((c0551jA == null || c0551jA.g()) && (c0540yS = this.f3511a.s(this.f3513c)) != null && (c0540yS.v() instanceof com.google.android.gms.common.internal.a)) {
                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) c0540yS.v();
                int i7 = 0;
                boolean zH = this.f3514d > 0;
                int iZ = aVar.z();
                int iF = 100;
                if (c0551jA != null) {
                    zH &= c0551jA.h();
                    int iD2 = c0551jA.d();
                    int iF2 = c0551jA.f();
                    i4 = c0551jA.i();
                    if (aVar.J() && !aVar.h()) {
                        C0544c c0544cC = c(c0540yS, aVar, this.f3512b);
                        if (c0544cC == null) {
                            return;
                        }
                        boolean z3 = c0544cC.i() && this.f3514d > 0;
                        iF2 = c0544cC.d();
                        zH = z3;
                    }
                    i6 = iD2;
                    i5 = iF2;
                } else {
                    i4 = 0;
                    i5 = 100;
                    i6 = 5000;
                }
                C0521e c0521e = this.f3511a;
                int iElapsedRealtime = -1;
                if (abstractC1445l.m()) {
                    iD = 0;
                } else if (abstractC1445l.k()) {
                    i7 = iF;
                    iD = -1;
                } else {
                    Exception excI = abstractC1445l.i();
                    if (excI instanceof T0.b) {
                        Status statusA = ((T0.b) excI).a();
                        iF = statusA.f();
                        C0504b c0504bD = statusA.d();
                        if (c0504bD != null) {
                            iD = c0504bD.d();
                            i7 = iF;
                        }
                        i7 = iF;
                        iD = -1;
                    } else {
                        i7 = 101;
                        iD = -1;
                    }
                }
                if (zH) {
                    long j6 = this.f3514d;
                    long j7 = this.f3515e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j7);
                    j5 = jCurrentTimeMillis;
                    j4 = j6;
                } else {
                    j4 = 0;
                    j5 = 0;
                }
                c0521e.A(new C0547f(this.f3512b, i7, iD, j4, j5, null, null, iZ, iElapsedRealtime), i4, i6, i5);
            }
        }
    }
}
