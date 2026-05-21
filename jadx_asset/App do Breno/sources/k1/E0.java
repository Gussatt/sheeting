package k1;

import V0.AbstractC0549h;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p.C1475a;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends G1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f8949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8950d;

    public E0(C1363z3 c1363z3) {
        super(c1363z3);
        this.f8949c = new C1475a();
        this.f8948b = new C1475a();
    }

    public static /* synthetic */ void i(E0 e02, String str, long j4) {
        e02.h();
        AbstractC0549h.d(str);
        Map map = e02.f8949c;
        if (map.isEmpty()) {
            e02.f8950d = j4;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            e02.f9366a.c().w().a("Too many ads visible");
        } else {
            map.put(str, 1);
            e02.f8948b.put(str, Long.valueOf(j4));
        }
    }

    public static /* synthetic */ void j(E0 e02, String str, long j4) {
        e02.h();
        AbstractC0549h.d(str);
        Map map = e02.f8949c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            e02.f9366a.c().r().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C1333v5 c1333v5T = e02.f9366a.N().t(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = e02.f8948b;
        Long l4 = (Long) map2.get(str);
        if (l4 == null) {
            e02.f9366a.c().r().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j4 - l4.longValue();
            map2.remove(str);
            e02.p(str, jLongValue, c1333v5T);
        }
        if (map.isEmpty()) {
            long j5 = e02.f8950d;
            if (j5 == 0) {
                e02.f9366a.c().r().a("First ad exposure time was never set");
            } else {
                e02.o(j4 - j5, c1333v5T);
                e02.f8950d = 0L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long j4) {
        Map map = this.f8948b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j4));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f8950d = j4;
    }

    public final void l(String str, long j4) {
        if (str == null || str.length() == 0) {
            this.f9366a.c().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f9366a.e().A(new RunnableC1154a(this, str, j4));
        }
    }

    public final void m(String str, long j4) {
        if (str == null || str.length() == 0) {
            this.f9366a.c().r().a("Ad unit id must be a non-empty string");
        } else {
            this.f9366a.e().A(new RunnableC1142B(this, str, j4));
        }
    }

    public final void n(long j4) {
        C1333v5 c1333v5T = this.f9366a.N().t(false);
        Map map = this.f8948b;
        for (String str : map.keySet()) {
            p(str, j4 - ((Long) map.get(str)).longValue(), c1333v5T);
        }
        if (!map.isEmpty()) {
            o(j4 - this.f8950d, c1333v5T);
        }
        q(j4);
    }

    public final void o(long j4, C1333v5 c1333v5) {
        if (c1333v5 == null) {
            this.f9366a.c().v().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.f9366a.c().v().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j4);
        w7.B(c1333v5, bundle, true);
        this.f9366a.K().F("am", "_xa", bundle);
    }

    public final void p(String str, long j4, C1333v5 c1333v5) {
        if (c1333v5 == null) {
            this.f9366a.c().v().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.f9366a.c().v().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j4);
        w7.B(c1333v5, bundle, true);
        this.f9366a.K().F("am", "_xu", bundle);
    }
}
