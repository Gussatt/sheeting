package k1;

import com.google.android.gms.internal.measurement.C0697a3;
import com.google.android.gms.internal.measurement.C0706b3;
import com.google.android.gms.internal.measurement.C0877v6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.C1475a;

/* JADX INFO: loaded from: classes.dex */
public final class E7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.Z2 f8964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BitSet f8965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitSet f8966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f8967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f8968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1199f f8969h;

    public /* synthetic */ E7(C1199f c1199f, String str, AbstractC1190e abstractC1190e) {
        this.f8969h = c1199f;
        this.f8962a = str;
        this.f8963b = true;
        this.f8965d = new BitSet();
        this.f8966e = new BitSet();
        this.f8967f = new C1475a();
        this.f8968g = new C1475a();
    }

    public final com.google.android.gms.internal.measurement.E2 a(int i4) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.D2 d2G = com.google.android.gms.internal.measurement.E2.G();
        d2G.u(i4);
        d2G.w(this.f8963b);
        com.google.android.gms.internal.measurement.Z2 z22 = this.f8964c;
        if (z22 != null) {
            d2G.x(z22);
        }
        com.google.android.gms.internal.measurement.Y2 y2J = com.google.android.gms.internal.measurement.Z2.J();
        y2J.v(r7.R(this.f8965d));
        y2J.x(r7.R(this.f8966e));
        Map map = this.f8967f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f8967f.keySet()) {
                int iIntValue = num.intValue();
                Long l4 = (Long) this.f8967f.get(num);
                if (l4 != null) {
                    com.google.android.gms.internal.measurement.F2 f2H = com.google.android.gms.internal.measurement.G2.H();
                    f2H.v(iIntValue);
                    f2H.u(l4.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.G2) f2H.q());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            y2J.u(arrayList);
        }
        Map map2 = this.f8968g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f8968g.keySet()) {
                C0697a3 c0697a3I = C0706b3.I();
                c0697a3I.v(num2.intValue());
                List list2 = (List) this.f8968g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c0697a3I.u(list2);
                }
                arrayList3.add((C0706b3) c0697a3I.q());
            }
            list = arrayList3;
        }
        y2J.w(list);
        d2G.v(y2J);
        return (com.google.android.gms.internal.measurement.E2) d2G.q();
    }

    public final void c(AbstractC1172c abstractC1172c) {
        int iA = abstractC1172c.a();
        if (abstractC1172c.f9379c != null) {
            this.f8966e.set(iA, true);
        }
        Boolean bool = abstractC1172c.f9380d;
        if (bool != null) {
            this.f8965d.set(iA, bool.booleanValue());
        }
        if (abstractC1172c.f9381e != null) {
            Map map = this.f8967f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l4 = (Long) map.get(numValueOf);
            long jLongValue = abstractC1172c.f9381e.longValue() / 1000;
            if (l4 == null || jLongValue > l4.longValue()) {
                this.f8967f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (abstractC1172c.f9382f != null) {
            Map map2 = this.f8968g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f8968g.put(numValueOf2, arrayList);
            }
            if (abstractC1172c.c()) {
                arrayList.clear();
            }
            C0877v6.b();
            C1363z3 c1363z3 = this.f8969h.f9366a;
            C1264n c1264nB = c1363z3.B();
            String str = this.f8962a;
            C1275o2 c1275o2 = AbstractC1291q2.f9681F0;
            if (c1264nB.P(str, c1275o2) && abstractC1172c.b()) {
                arrayList.clear();
            }
            C0877v6.b();
            if (!c1363z3.B().P(this.f8962a, c1275o2)) {
                arrayList.add(Long.valueOf(abstractC1172c.f9382f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(abstractC1172c.f9382f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public /* synthetic */ E7(C1199f c1199f, String str, com.google.android.gms.internal.measurement.Z2 z22, BitSet bitSet, BitSet bitSet2, Map map, Map map2, AbstractC1190e abstractC1190e) {
        this.f8969h = c1199f;
        this.f8962a = str;
        this.f8965d = bitSet;
        this.f8966e = bitSet2;
        this.f8967f = map;
        this.f8968g = new C1475a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f8968g.put(num, arrayList);
        }
        this.f8963b = false;
        this.f8964c = z22;
    }
}
