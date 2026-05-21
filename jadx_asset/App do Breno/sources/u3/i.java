package u3;

import L2.C;
import L2.u;
import W2.p;
import X2.l;
import X2.m;
import X2.v;
import X2.x;
import X2.y;
import f3.q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import t3.AbstractC1550f;
import t3.AbstractC1552h;
import t3.C1551g;
import t3.F;
import t3.InterfaceC1548d;
import t3.J;
import t3.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return M2.a.a(((h) obj).a(), ((h) obj2).a());
        }
    }

    public static final class b extends m implements p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f11505n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f11506o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ x f11507p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1548d f11508q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ x f11509r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ x f11510s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, long j4, x xVar, InterfaceC1548d interfaceC1548d, x xVar2, x xVar3) {
            super(2);
            this.f11505n = vVar;
            this.f11506o = j4;
            this.f11507p = xVar;
            this.f11508q = interfaceC1548d;
            this.f11509r = xVar2;
            this.f11510s = xVar3;
        }

        public final void a(int i4, long j4) throws IOException {
            if (i4 == 1) {
                v vVar = this.f11505n;
                if (vVar.f3989m) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                vVar.f3989m = true;
                if (j4 < this.f11506o) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                x xVar = this.f11507p;
                long jE = xVar.f3991m;
                if (jE == 4294967295L) {
                    jE = this.f11508q.E();
                }
                xVar.f3991m = jE;
                x xVar2 = this.f11509r;
                xVar2.f3991m = xVar2.f3991m == 4294967295L ? this.f11508q.E() : 0L;
                x xVar3 = this.f11510s;
                xVar3.f3991m = xVar3.f3991m == 4294967295L ? this.f11508q.E() : 0L;
            }
        }

        @Override // W2.p
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) throws IOException {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return K2.p.f2516a;
        }
    }

    public static final class c extends m implements p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1548d f11511n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ y f11512o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ y f11513p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ y f11514q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC1548d interfaceC1548d, y yVar, y yVar2, y yVar3) {
            super(2);
            this.f11511n = interfaceC1548d;
            this.f11512o = yVar;
            this.f11513p = yVar2;
            this.f11514q = yVar3;
        }

        public final void a(int i4, long j4) throws IOException {
            if (i4 == 21589) {
                if (j4 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b4 = this.f11511n.readByte();
                boolean z3 = (b4 & 1) == 1;
                boolean z4 = (b4 & 2) == 2;
                boolean z5 = (b4 & 4) == 4;
                InterfaceC1548d interfaceC1548d = this.f11511n;
                long j5 = z3 ? 5L : 1L;
                if (z4) {
                    j5 += 4;
                }
                if (z5) {
                    j5 += 4;
                }
                if (j4 < j5) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z3) {
                    this.f11512o.f3992m = Long.valueOf(((long) interfaceC1548d.p()) * 1000);
                }
                if (z4) {
                    this.f11513p.f3992m = Long.valueOf(((long) this.f11511n.p()) * 1000);
                }
                if (z5) {
                    this.f11514q.f3992m = Long.valueOf(((long) this.f11511n.p()) * 1000);
                }
            }
        }

        @Override // W2.p
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) throws IOException {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return K2.p.f2516a;
        }
    }

    public static final Map a(List list) {
        J jE = J.a.e(J.f11359n, "/", false, 1, null);
        Map mapF = C.f(K2.m.a(jE, new h(jE, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (h hVar : u.D(list, new a())) {
            if (((h) mapF.put(hVar.a(), hVar)) == null) {
                while (true) {
                    J jM = hVar.a().m();
                    if (jM != null) {
                        h hVar2 = (h) mapF.get(jM);
                        if (hVar2 != null) {
                            hVar2.b().add(hVar.a());
                            break;
                        }
                        h hVar3 = new h(jM, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        mapF.put(jM, hVar3);
                        hVar3.b().add(hVar.a());
                        hVar = hVar3;
                    }
                }
            }
        }
        return mapF;
    }

    public static final Long b(int i4, int i5) {
        if (i5 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i4 >> 9) & 127) + 1980, ((i4 >> 5) & 15) - 1, i4 & 31, (i5 >> 11) & 31, (i5 >> 5) & 63, (i5 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    public static final String c(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String string = Integer.toString(i4, f3.a.a(16));
        l.d(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static final T d(J j4, AbstractC1552h abstractC1552h, W2.l lVar) throws IllegalAccessException, IOException, InvocationTargetException {
        long jZ;
        long j5;
        InterfaceC1548d interfaceC1548dB;
        l.e(j4, "zipPath");
        l.e(abstractC1552h, "fileSystem");
        l.e(lVar, "predicate");
        AbstractC1550f abstractC1550fI = abstractC1552h.i(j4);
        try {
            jZ = abstractC1550fI.z() - ((long) 22);
        } finally {
        }
        if (jZ < 0) {
            throw new IOException("not a zip: size=" + abstractC1550fI.z());
        }
        long jMax = Math.max(jZ - 65536, 0L);
        do {
            InterfaceC1548d interfaceC1548dB2 = F.b(abstractC1550fI.C(jZ));
            try {
                if (interfaceC1548dB2.p() == 101010256) {
                    e eVarF = f(interfaceC1548dB2);
                    String strH = interfaceC1548dB2.h(eVarF.b());
                    interfaceC1548dB2.close();
                    long j6 = jZ - ((long) 20);
                    if (j6 > 0) {
                        interfaceC1548dB = F.b(abstractC1550fI.C(j6));
                        try {
                            if (interfaceC1548dB.p() == 117853008) {
                                int iP = interfaceC1548dB.p();
                                long jE = interfaceC1548dB.E();
                                if (interfaceC1548dB.p() != 1 || iP != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                interfaceC1548dB = F.b(abstractC1550fI.C(jE));
                                try {
                                    int iP2 = interfaceC1548dB.p();
                                    if (iP2 != 101075792) {
                                        throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(iP2));
                                    }
                                    eVarF = j(interfaceC1548dB, eVarF);
                                    K2.p pVar = K2.p.f2516a;
                                    U2.a.a(interfaceC1548dB, null);
                                } finally {
                                }
                            }
                            K2.p pVar2 = K2.p.f2516a;
                            U2.a.a(interfaceC1548dB, null);
                        } finally {
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    interfaceC1548dB = F.b(abstractC1550fI.C(eVarF.a()));
                    try {
                        long jC = eVarF.c();
                        for (j5 = 0; j5 < jC; j5++) {
                            h hVarE = e(interfaceC1548dB);
                            if (hVarE.f() >= eVarF.a()) {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                            if (((Boolean) lVar.k(hVarE)).booleanValue()) {
                                arrayList.add(hVarE);
                            }
                        }
                        K2.p pVar3 = K2.p.f2516a;
                        U2.a.a(interfaceC1548dB, null);
                        T t4 = new T(j4, abstractC1552h, a(arrayList), strH);
                        U2.a.a(abstractC1550fI, null);
                        return t4;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                interfaceC1548dB2.close();
                jZ--;
            } finally {
                interfaceC1548dB2.close();
            }
        } while (jZ >= jMax);
        throw new IOException("not a zip: end of central directory signature not found");
    }

    public static final h e(InterfaceC1548d interfaceC1548d) throws IOException {
        l.e(interfaceC1548d, "<this>");
        int iP = interfaceC1548d.p();
        if (iP != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iP));
        }
        interfaceC1548d.skip(4L);
        short sA = interfaceC1548d.A();
        int i4 = sA & 65535;
        if ((sA & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i4));
        }
        int iA = interfaceC1548d.A() & 65535;
        Long lB = b(interfaceC1548d.A() & 65535, interfaceC1548d.A() & 65535);
        long jP = ((long) interfaceC1548d.p()) & 4294967295L;
        x xVar = new x();
        xVar.f3991m = ((long) interfaceC1548d.p()) & 4294967295L;
        x xVar2 = new x();
        xVar2.f3991m = ((long) interfaceC1548d.p()) & 4294967295L;
        int iA2 = interfaceC1548d.A() & 65535;
        int iA3 = interfaceC1548d.A() & 65535;
        int iA4 = interfaceC1548d.A() & 65535;
        interfaceC1548d.skip(8L);
        x xVar3 = new x();
        xVar3.f3991m = ((long) interfaceC1548d.p()) & 4294967295L;
        String strH = interfaceC1548d.h(iA2);
        if (q.w(strH, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j4 = xVar2.f3991m == 4294967295L ? 8 : 0L;
        if (xVar.f3991m == 4294967295L) {
            j4 += (long) 8;
        }
        if (xVar3.f3991m == 4294967295L) {
            j4 += (long) 8;
        }
        v vVar = new v();
        g(interfaceC1548d, iA3, new b(vVar, j4, xVar2, interfaceC1548d, xVar, xVar3));
        if (j4 <= 0 || vVar.f3989m) {
            return new h(J.a.e(J.f11359n, "/", false, 1, null).o(strH), f3.p.o(strH, "/", false, 2, null), interfaceC1548d.h(iA4), jP, xVar.f3991m, xVar2.f3991m, iA, lB, xVar3.f3991m);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final e f(InterfaceC1548d interfaceC1548d) throws IOException {
        int iA = interfaceC1548d.A() & 65535;
        int iA2 = interfaceC1548d.A() & 65535;
        long jA = interfaceC1548d.A() & 65535;
        if (jA != (interfaceC1548d.A() & 65535) || iA != 0 || iA2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC1548d.skip(4L);
        return new e(jA, 4294967295L & ((long) interfaceC1548d.p()), interfaceC1548d.A() & 65535);
    }

    public static final void g(InterfaceC1548d interfaceC1548d, int i4, p pVar) throws IOException {
        long j4 = i4;
        while (j4 != 0) {
            if (j4 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iA = interfaceC1548d.A() & 65535;
            long jA = ((long) interfaceC1548d.A()) & 65535;
            long j5 = j4 - ((long) 4);
            if (j5 < jA) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC1548d.K(jA);
            long jO = interfaceC1548d.s().O();
            pVar.j(Integer.valueOf(iA), Long.valueOf(jA));
            long jO2 = (interfaceC1548d.s().O() + jA) - jO;
            if (jO2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iA);
            }
            if (jO2 > 0) {
                interfaceC1548d.s().skip(jO2);
            }
            j4 = j5 - jA;
        }
    }

    public static final C1551g h(InterfaceC1548d interfaceC1548d, C1551g c1551g) throws IOException {
        l.e(interfaceC1548d, "<this>");
        l.e(c1551g, "basicMetadata");
        C1551g c1551gI = i(interfaceC1548d, c1551g);
        l.b(c1551gI);
        return c1551gI;
    }

    public static final C1551g i(InterfaceC1548d interfaceC1548d, C1551g c1551g) throws IOException {
        y yVar = new y();
        yVar.f3992m = c1551g != null ? c1551g.a() : null;
        y yVar2 = new y();
        y yVar3 = new y();
        int iP = interfaceC1548d.p();
        if (iP != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iP));
        }
        interfaceC1548d.skip(2L);
        short sA = interfaceC1548d.A();
        int i4 = sA & 65535;
        if ((sA & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i4));
        }
        interfaceC1548d.skip(18L);
        long jA = ((long) interfaceC1548d.A()) & 65535;
        int iA = interfaceC1548d.A() & 65535;
        interfaceC1548d.skip(jA);
        if (c1551g == null) {
            interfaceC1548d.skip(iA);
            return null;
        }
        g(interfaceC1548d, iA, new c(interfaceC1548d, yVar, yVar2, yVar3));
        return new C1551g(c1551g.d(), c1551g.c(), null, c1551g.b(), (Long) yVar3.f3992m, (Long) yVar.f3992m, (Long) yVar2.f3992m, null, 128, null);
    }

    public static final e j(InterfaceC1548d interfaceC1548d, e eVar) throws IOException {
        interfaceC1548d.skip(12L);
        int iP = interfaceC1548d.p();
        int iP2 = interfaceC1548d.p();
        long jE = interfaceC1548d.E();
        if (jE != interfaceC1548d.E() || iP != 0 || iP2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC1548d.skip(8L);
        return new e(jE, interfaceC1548d.E(), eVar.b());
    }

    public static final void k(InterfaceC1548d interfaceC1548d) {
        l.e(interfaceC1548d, "<this>");
        i(interfaceC1548d, null);
    }
}
