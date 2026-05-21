package p1;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import o1.AbstractC1471h;
import p1.j;

/* JADX INFO: loaded from: classes.dex */
public final class u extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f10955t = new u(null, new Object[0], 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Object f10956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient Object[] f10957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f10958s;

    public static class a extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final transient j f10959o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final transient Object[] f10960p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final transient int f10961q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final transient int f10962r;

        /* JADX INFO: renamed from: p1.u$a$a, reason: collision with other inner class name */
        public class C0153a extends i {
            public C0153a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i4) {
                AbstractC1471h.f(i4, a.this.f10962r);
                int i5 = i4 * 2;
                Object obj = a.this.f10960p[a.this.f10961q + i5];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f10960p[i5 + (a.this.f10961q ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f10962r;
            }
        }

        public a(j jVar, Object[] objArr, int i4, int i5) {
            this.f10959o = jVar;
            this.f10960p = objArr;
            this.f10961q = i4;
            this.f10962r = i5;
        }

        @Override // p1.h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f10959o.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // p1.h
        public int d(Object[] objArr, int i4) {
            return i().d(objArr, i4);
        }

        @Override // p1.k
        public i o() {
            return new C0153a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: s */
        public z iterator() {
            return i().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f10962r;
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final transient j f10964o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final transient i f10965p;

        public b(j jVar, i iVar) {
            this.f10964o = jVar;
            this.f10965p = iVar;
        }

        @Override // p1.h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f10964o.get(obj) != null;
        }

        @Override // p1.h
        public int d(Object[] objArr, int i4) {
            return i().d(objArr, i4);
        }

        @Override // p1.k
        public i i() {
            return this.f10965p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: s */
        public z iterator() {
            return i().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f10964o.size();
        }
    }

    public static final class c extends i {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final transient Object[] f10966o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final transient int f10967p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final transient int f10968q;

        public c(Object[] objArr, int i4, int i5) {
            this.f10966o = objArr;
            this.f10967p = i4;
            this.f10968q = i5;
        }

        @Override // java.util.List
        public Object get(int i4) {
            AbstractC1471h.f(i4, this.f10968q);
            Object obj = this.f10966o[(i4 * 2) + this.f10967p];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10968q;
        }
    }

    public u(Object obj, Object[] objArr, int i4) {
        this.f10956q = obj;
        this.f10957r = objArr;
        this.f10958s = i4;
    }

    public static u l(int i4, Object[] objArr) {
        return m(i4, objArr, null);
    }

    public static u m(int i4, Object[] objArr, j.a aVar) {
        if (i4 == 0) {
            return (u) f10955t;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return new u(null, objArr, 1);
        }
        AbstractC1471h.j(i4, objArr.length >> 1);
        Object objN = n(objArr, i4, k.k(i4), 0);
        if (objN instanceof Object[]) {
            Object[] objArr2 = (Object[]) objN;
            j.a.C0151a c0151a = (j.a.C0151a) objArr2[2];
            if (aVar == null) {
                throw c0151a.a();
            }
            aVar.f10942e = c0151a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objN = obj3;
            i4 = iIntValue;
        }
        return new u(objN, objArr, i4);
    }

    public static Object n(Object[] objArr, int i4, int i5, int i6) {
        int i7;
        j.a.C0151a c0151a = null;
        int i8 = 1;
        if (i4 == 1) {
            Object obj = objArr[i6];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i6 ^ 1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return null;
        }
        int i9 = i5 - 1;
        if (i5 <= 128) {
            byte[] bArr = new byte[i5];
            Arrays.fill(bArr, (byte) -1);
            int i10 = 0;
            for (int i11 = 0; i11 < i4; i11++) {
                int i12 = (i11 * 2) + i6;
                int i13 = (i10 * 2) + i6;
                Object obj3 = objArr[i12];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i12 ^ 1];
                Objects.requireNonNull(obj4);
                d.a(obj3, obj4);
                int iA = g.a(obj3.hashCode());
                while (true) {
                    int i14 = iA & i9;
                    int i15 = bArr[i14] & 255;
                    if (i15 == 255) {
                        bArr[i14] = (byte) i13;
                        if (i10 < i11) {
                            objArr[i13] = obj3;
                            objArr[i13 ^ 1] = obj4;
                        }
                        i10++;
                    } else {
                        if (obj3.equals(objArr[i15])) {
                            int i16 = i15 ^ 1;
                            Object obj5 = objArr[i16];
                            Objects.requireNonNull(obj5);
                            c0151a = new j.a.C0151a(obj3, obj4, obj5);
                            objArr[i16] = obj4;
                            break;
                        }
                        iA = i14 + 1;
                    }
                }
            }
            return i10 == i4 ? bArr : new Object[]{bArr, Integer.valueOf(i10), c0151a};
        }
        if (i5 <= 32768) {
            short[] sArr = new short[i5];
            Arrays.fill(sArr, (short) -1);
            int i17 = 0;
            for (int i18 = 0; i18 < i4; i18++) {
                int i19 = (i18 * 2) + i6;
                int i20 = (i17 * 2) + i6;
                Object obj6 = objArr[i19];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i19 ^ 1];
                Objects.requireNonNull(obj7);
                d.a(obj6, obj7);
                int iA2 = g.a(obj6.hashCode());
                while (true) {
                    int i21 = iA2 & i9;
                    int i22 = sArr[i21] & 65535;
                    if (i22 == 65535) {
                        sArr[i21] = (short) i20;
                        if (i17 < i18) {
                            objArr[i20] = obj6;
                            objArr[i20 ^ 1] = obj7;
                        }
                        i17++;
                    } else {
                        if (obj6.equals(objArr[i22])) {
                            int i23 = i22 ^ 1;
                            Object obj8 = objArr[i23];
                            Objects.requireNonNull(obj8);
                            c0151a = new j.a.C0151a(obj6, obj7, obj8);
                            objArr[i23] = obj7;
                            break;
                        }
                        iA2 = i21 + 1;
                    }
                }
            }
            return i17 == i4 ? sArr : new Object[]{sArr, Integer.valueOf(i17), c0151a};
        }
        int[] iArr = new int[i5];
        Arrays.fill(iArr, -1);
        int i24 = 0;
        int i25 = 0;
        while (i24 < i4) {
            int i26 = (i24 * 2) + i6;
            int i27 = (i25 * 2) + i6;
            Object obj9 = objArr[i26];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i26 ^ i8];
            Objects.requireNonNull(obj10);
            d.a(obj9, obj10);
            int iA3 = g.a(obj9.hashCode());
            while (true) {
                int i28 = iA3 & i9;
                int i29 = iArr[i28];
                if (i29 == -1) {
                    iArr[i28] = i27;
                    if (i25 < i24) {
                        objArr[i27] = obj9;
                        objArr[i27 ^ 1] = obj10;
                    }
                    i25++;
                    i7 = i8;
                } else {
                    i7 = i8;
                    if (obj9.equals(objArr[i29])) {
                        int i30 = i29 ^ 1;
                        Object obj11 = objArr[i30];
                        Objects.requireNonNull(obj11);
                        c0151a = new j.a.C0151a(obj9, obj10, obj11);
                        objArr[i30] = obj10;
                        break;
                    }
                    iA3 = i28 + 1;
                    i8 = i7;
                }
            }
            i24++;
            i8 = i7;
        }
        int i31 = i8;
        if (i25 == i4) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i31] = Integer.valueOf(i25);
        objArr2[2] = c0151a;
        return objArr2;
    }

    public static Object o(Object obj, Object[] objArr, int i4, int i5, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i4 == 1) {
            Object obj3 = objArr[i5];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i5 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA = g.a(obj2.hashCode());
            while (true) {
                int i6 = iA & length;
                int i7 = bArr[i6] & 255;
                if (i7 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                iA = i6 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA2 = g.a(obj2.hashCode());
            while (true) {
                int i8 = iA2 & length2;
                int i9 = sArr[i8] & 65535;
                if (i9 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i9])) {
                    return objArr[i9 ^ 1];
                }
                iA2 = i8 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA3 = g.a(obj2.hashCode());
            while (true) {
                int i10 = iA3 & length3;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                iA3 = i10 + 1;
            }
        }
    }

    @Override // p1.j
    public k c() {
        return new a(this, this.f10957r, 0, this.f10958s);
    }

    @Override // p1.j
    public k d() {
        return new b(this, new c(this.f10957r, 0, this.f10958s));
    }

    @Override // p1.j
    public h e() {
        return new c(this.f10957r, 1, this.f10958s);
    }

    @Override // p1.j, java.util.Map
    public Object get(Object obj) {
        Object objO = o(this.f10956q, this.f10957r, this.f10958s, 0, obj);
        if (objO == null) {
            return null;
        }
        return objO;
    }

    @Override // java.util.Map
    public int size() {
        return this.f10958s;
    }
}
