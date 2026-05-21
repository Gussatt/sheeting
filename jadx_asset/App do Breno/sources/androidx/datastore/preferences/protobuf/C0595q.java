package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0595q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0595q f4837d = new C0595q(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f4838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4840c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4842b;

        static {
            int[] iArr = new int[k0.b.values().length];
            f4842b = iArr;
            try {
                iArr[k0.b.f4801o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4842b[k0.b.f4802p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4842b[k0.b.f4803q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4842b[k0.b.f4804r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4842b[k0.b.f4805s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4842b[k0.b.f4806t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4842b[k0.b.f4807u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4842b[k0.b.f4808v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4842b[k0.b.f4810x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4842b[k0.b.f4811y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4842b[k0.b.f4809w.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4842b[k0.b.f4812z.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4842b[k0.b.f4794A.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4842b[k0.b.f4796C.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4842b[k0.b.f4797D.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4842b[k0.b.f4798E.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4842b[k0.b.f4799F.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4842b[k0.b.f4795B.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[k0.c.values().length];
            f4841a = iArr2;
            try {
                iArr2[k0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4841a[k0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4841a[k0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4841a[k0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4841a[k0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4841a[k0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4841a[k0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4841a[k0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4841a[k0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$b */
    public interface b extends Comparable {
        int a();

        boolean b();

        k0.b c();

        boolean e();
    }

    public C0595q() {
        this.f4838a = b0.q();
    }

    public static int b(k0.b bVar, int i4, Object obj) {
        int iO = AbstractC0587i.O(i4);
        if (bVar == k0.b.f4810x) {
            iO *= 2;
        }
        return iO + c(bVar, obj);
    }

    public static int c(k0.b bVar, Object obj) {
        switch (a.f4842b[bVar.ordinal()]) {
            case 1:
                return AbstractC0587i.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC0587i.q(((Float) obj).floatValue());
            case 3:
                return AbstractC0587i.x(((Long) obj).longValue());
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return AbstractC0587i.S(((Long) obj).longValue());
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return AbstractC0587i.v(((Integer) obj).intValue());
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC0587i.o(((Long) obj).longValue());
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC0587i.m(((Integer) obj).intValue());
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return AbstractC0587i.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC0587i.s((J) obj);
            case 10:
                return AbstractC0587i.A((J) obj);
            case 11:
                return obj instanceof AbstractC0584f ? AbstractC0587i.g((AbstractC0584f) obj) : AbstractC0587i.N((String) obj);
            case 12:
                return obj instanceof AbstractC0584f ? AbstractC0587i.g((AbstractC0584f) obj) : AbstractC0587i.e((byte[]) obj);
            case 13:
                return AbstractC0587i.Q(((Integer) obj).intValue());
            case 14:
                return AbstractC0587i.F(((Integer) obj).intValue());
            case 15:
                return AbstractC0587i.H(((Long) obj).longValue());
            case 16:
                return AbstractC0587i.J(((Integer) obj).intValue());
            case 17:
                return AbstractC0587i.L(((Long) obj).longValue());
            case 18:
                return AbstractC0587i.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        k0.b bVarC = bVar.c();
        int iA = bVar.a();
        if (!bVar.b()) {
            return b(bVarC, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i4 = 0;
        if (!bVar.e()) {
            int iB = 0;
            while (i4 < size) {
                iB += b(bVarC, iA, list.get(i4));
                i4++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i4 < size) {
            iC += c(bVarC, list.get(i4));
            i4++;
        }
        return AbstractC0587i.O(iA) + iC + AbstractC0587i.Q(iC);
    }

    public static int i(k0.b bVar, boolean z3) {
        if (z3) {
            return 2;
        }
        return bVar.f();
    }

    public static boolean l(Map.Entry entry) {
        i.d.a(entry.getKey());
        throw null;
    }

    public static boolean m(k0.b bVar, Object obj) {
        AbstractC0598u.a(obj);
        switch (a.f4841a[bVar.d().ordinal()]) {
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                if ((obj instanceof AbstractC0584f) || (obj instanceof byte[])) {
                }
                break;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof Integer)) {
                }
                break;
            case 9:
                if (!(obj instanceof J)) {
                }
                break;
        }
        return false;
    }

    public static C0595q r() {
        return new C0595q();
    }

    public static void u(AbstractC0587i abstractC0587i, k0.b bVar, int i4, Object obj) {
        if (bVar == k0.b.f4810x) {
            abstractC0587i.q0(i4, (J) obj);
        } else {
            abstractC0587i.M0(i4, i(bVar, false));
            v(abstractC0587i, bVar, obj);
        }
    }

    public static void v(AbstractC0587i abstractC0587i, k0.b bVar, Object obj) {
        switch (a.f4842b[bVar.ordinal()]) {
            case 1:
                abstractC0587i.h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC0587i.p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC0587i.x0(((Long) obj).longValue());
                break;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                abstractC0587i.Q0(((Long) obj).longValue());
                break;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                abstractC0587i.v0(((Integer) obj).intValue());
                break;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                abstractC0587i.n0(((Long) obj).longValue());
                break;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                abstractC0587i.l0(((Integer) obj).intValue());
                break;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                abstractC0587i.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC0587i.s0((J) obj);
                break;
            case 10:
                abstractC0587i.z0((J) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0584f)) {
                    abstractC0587i.L0((String) obj);
                } else {
                    abstractC0587i.f0((AbstractC0584f) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC0584f)) {
                    abstractC0587i.c0((byte[]) obj);
                } else {
                    abstractC0587i.f0((AbstractC0584f) obj);
                }
                break;
            case 13:
                abstractC0587i.O0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC0587i.D0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC0587i.F0(((Long) obj).longValue());
                break;
            case 16:
                abstractC0587i.H0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC0587i.J0(((Long) obj).longValue());
                break;
            case 18:
                abstractC0587i.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0595q clone() {
        C0595q c0595qR = r();
        int iK = this.f4838a.k();
        for (int i4 = 0; i4 < iK; i4++) {
            Map.Entry entryJ = this.f4838a.j(i4);
            i.d.a(entryJ.getKey());
            c0595qR.s(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f4838a.m()) {
            i.d.a(entry.getKey());
            c0595qR.s(null, entry.getValue());
        }
        c0595qR.f4840c = this.f4840c;
        return c0595qR;
    }

    public Iterator e() {
        return j() ? Collections.emptyIterator() : this.f4840c ? new C0601x(this.f4838a.h().iterator()) : this.f4838a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0595q) {
            return this.f4838a.equals(((C0595q) obj).f4838a);
        }
        return false;
    }

    public int f() {
        int iK = this.f4838a.k();
        int iG = 0;
        for (int i4 = 0; i4 < iK; i4++) {
            iG += g(this.f4838a.j(i4));
        }
        Iterator it = this.f4838a.m().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public final int g(Map.Entry entry) {
        i.d.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int iK = this.f4838a.k();
        int iD = 0;
        for (int i4 = 0; i4 < iK; i4++) {
            Map.Entry entryJ = this.f4838a.j(i4);
            i.d.a(entryJ.getKey());
            iD += d(null, entryJ.getValue());
        }
        for (Map.Entry entry : this.f4838a.m()) {
            i.d.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f4838a.hashCode();
    }

    public boolean j() {
        return this.f4838a.isEmpty();
    }

    public boolean k() {
        int iK = this.f4838a.k();
        for (int i4 = 0; i4 < iK; i4++) {
            if (!l(this.f4838a.j(i4))) {
                return false;
            }
        }
        Iterator it = this.f4838a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return j() ? Collections.emptyIterator() : this.f4840c ? new C0601x(this.f4838a.entrySet().iterator()) : this.f4838a.entrySet().iterator();
    }

    public void o() {
        if (this.f4839b) {
            return;
        }
        int iK = this.f4838a.k();
        for (int i4 = 0; i4 < iK; i4++) {
            Map.Entry entryJ = this.f4838a.j(i4);
            if (entryJ.getValue() instanceof AbstractC0597t) {
                ((AbstractC0597t) entryJ.getValue()).D();
            }
        }
        this.f4838a.p();
        this.f4839b = true;
    }

    public void p(C0595q c0595q) {
        int iK = c0595q.f4838a.k();
        for (int i4 = 0; i4 < iK; i4++) {
            q(c0595q.f4838a.j(i4));
        }
        Iterator it = c0595q.f4838a.m().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        i.d.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.b()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f4838a.r(bVar, obj);
    }

    public final void t(b bVar, Object obj) {
        if (!m(bVar.c(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.a()), bVar.c().d(), obj.getClass().getName()));
        }
    }

    public C0595q(boolean z3) {
        this(b0.q());
        o();
    }

    public C0595q(b0 b0Var) {
        this.f4838a = b0Var;
        o();
    }
}
