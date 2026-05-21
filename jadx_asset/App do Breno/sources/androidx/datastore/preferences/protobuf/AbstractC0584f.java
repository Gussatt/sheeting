package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0584f implements Iterable, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC0584f f4709n = new i(AbstractC0598u.f4925d);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final InterfaceC0090f f4710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Comparator f4711p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4712m = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$a */
    public class a extends c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4713m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f4714n;

        public a() {
            this.f4714n = AbstractC0584f.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f.g
        public byte b() {
            int i4 = this.f4713m;
            if (i4 >= this.f4714n) {
                throw new NoSuchElementException();
            }
            this.f4713m = i4 + 1;
            return AbstractC0584f.this.p(i4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4713m < this.f4714n;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$b */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0584f abstractC0584f, AbstractC0584f abstractC0584f2) {
            g gVarS = abstractC0584f.s();
            g gVarS2 = abstractC0584f2.s();
            while (gVarS.hasNext() && gVarS2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC0584f.x(gVarS.b())).compareTo(Integer.valueOf(AbstractC0584f.x(gVarS2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC0584f.size()).compareTo(Integer.valueOf(abstractC0584f2.size()));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$c */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$d */
    public static final class d implements InterfaceC0090f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f.InterfaceC0090f
        public byte[] a(byte[] bArr, int i4, int i5) {
            return Arrays.copyOfRange(bArr, i4, i5 + i4);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$e */
    public static final class e extends i {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f4716r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f4717s;

        public e(byte[] bArr, int i4, int i5) {
            super(bArr);
            AbstractC0584f.h(i4, i4 + i5, bArr.length);
            this.f4716r = i4;
            this.f4717s = i5;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f.i
        public int D() {
            return this.f4716r;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f.i, androidx.datastore.preferences.protobuf.AbstractC0584f
        public byte f(int i4) {
            AbstractC0584f.g(i4, size());
            return this.f4718q[this.f4716r + i4];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f.i, androidx.datastore.preferences.protobuf.AbstractC0584f
        public void o(byte[] bArr, int i4, int i5, int i6) {
            System.arraycopy(this.f4718q, D() + i4, bArr, i5, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f.i, androidx.datastore.preferences.protobuf.AbstractC0584f
        public byte p(int i4) {
            return this.f4718q[this.f4716r + i4];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f.i, androidx.datastore.preferences.protobuf.AbstractC0584f
        public int size() {
            return this.f4717s;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$f, reason: collision with other inner class name */
    public interface InterfaceC0090f {
        byte[] a(byte[] bArr, int i4, int i5);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$g */
    public interface g extends Iterator {
        byte b();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$h */
    public static abstract class h extends AbstractC0584f {
        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.s();
        }

        public h() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$i */
    public static class i extends h {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final byte[] f4718q;

        public i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f4718q = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f
        public final void B(AbstractC0583e abstractC0583e) {
            abstractC0583e.a(this.f4718q, D(), size());
        }

        public final boolean C(AbstractC0584f abstractC0584f, int i4, int i5) {
            if (i5 > abstractC0584f.size()) {
                throw new IllegalArgumentException("Length too large: " + i5 + size());
            }
            int i6 = i4 + i5;
            if (i6 > abstractC0584f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i4 + ", " + i5 + ", " + abstractC0584f.size());
            }
            if (!(abstractC0584f instanceof i)) {
                return abstractC0584f.v(i4, i6).equals(v(0, i5));
            }
            i iVar = (i) abstractC0584f;
            byte[] bArr = this.f4718q;
            byte[] bArr2 = iVar.f4718q;
            int iD = D() + i5;
            int iD2 = D();
            int iD3 = iVar.D() + i4;
            while (iD2 < iD) {
                if (bArr[iD2] != bArr2[iD3]) {
                    return false;
                }
                iD2++;
                iD3++;
            }
            return true;
        }

        public int D() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0584f) || size() != ((AbstractC0584f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iU = u();
            int iU2 = iVar.u();
            if (iU == 0 || iU2 == 0 || iU == iU2) {
                return C(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f
        public byte f(int i4) {
            return this.f4718q[i4];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f
        public void o(byte[] bArr, int i4, int i5, int i6) {
            System.arraycopy(this.f4718q, i4, bArr, i5, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f
        public byte p(int i4) {
            return this.f4718q[i4];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f
        public int size() {
            return this.f4718q.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f
        public final int t(int i4, int i5, int i6) {
            return AbstractC0598u.g(i4, this.f4718q, D() + i5, i6);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f
        public final AbstractC0584f v(int i4, int i5) {
            int iH = AbstractC0584f.h(i4, i5, size());
            return iH == 0 ? AbstractC0584f.f4709n : new e(this.f4718q, D() + i4, iH);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f$j */
    public static final class j implements InterfaceC0090f {
        public j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0584f.InterfaceC0090f
        public byte[] a(byte[] bArr, int i4, int i5) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            return bArr2;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f4710o = AbstractC0582d.c() ? new j(aVar) : new d(aVar);
        f4711p = new b();
    }

    public static AbstractC0584f A(byte[] bArr, int i4, int i5) {
        return new e(bArr, i4, i5);
    }

    public static void g(int i4, int i5) {
        if (((i5 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i4);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i4 + ", " + i5);
        }
    }

    public static int h(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i4 + " < 0");
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i4 + ", " + i5);
        }
        throw new IndexOutOfBoundsException("End index: " + i5 + " >= " + i6);
    }

    public static AbstractC0584f i(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static AbstractC0584f k(byte[] bArr, int i4, int i5) {
        h(i4, i4 + i5, bArr.length);
        return new i(f4710o.a(bArr, i4, i5));
    }

    public static AbstractC0584f l(String str) {
        return new i(str.getBytes(AbstractC0598u.f4923b));
    }

    public static int x(byte b4) {
        return b4 & 255;
    }

    public static AbstractC0584f z(byte[] bArr) {
        return new i(bArr);
    }

    public abstract void B(AbstractC0583e abstractC0583e);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i4);

    public final int hashCode() {
        int iT = this.f4712m;
        if (iT == 0) {
            int size = size();
            iT = t(size, 0, size);
            if (iT == 0) {
                iT = 1;
            }
            this.f4712m = iT;
        }
        return iT;
    }

    public abstract void o(byte[] bArr, int i4, int i5, int i6);

    public abstract byte p(int i4);

    public g s() {
        return new a();
    }

    public abstract int size();

    public abstract int t(int i4, int i5, int i6);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), y());
    }

    public final int u() {
        return this.f4712m;
    }

    public abstract AbstractC0584f v(int i4, int i5);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return AbstractC0598u.f4925d;
        }
        byte[] bArr = new byte[size];
        o(bArr, 0, 0, size);
        return bArr;
    }

    public final String y() {
        if (size() <= 50) {
            return d0.a(this);
        }
        return d0.a(v(0, 47)) + "...";
    }
}
