package Q2;

import L2.AbstractC0480c;
import L2.j;
import X2.l;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0480c implements a, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Enum[] f2940n;

    public c(Enum[] enumArr) {
        l.e(enumArr, "entries");
        this.f2940n = enumArr;
    }

    @Override // L2.AbstractC0479b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return false;
    }

    @Override // L2.AbstractC0479b
    public int f() {
        return this.f2940n.length;
    }

    public boolean h(Enum r32) {
        l.e(r32, "element");
        return ((Enum) j.p(this.f2940n, r32.ordinal())) == r32;
    }

    @Override // L2.AbstractC0480c, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum get(int i4) {
        AbstractC0480c.f2746m.a(i4, this.f2940n.length);
        return this.f2940n[i4];
    }

    @Override // L2.AbstractC0480c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }

    public int k(Enum r32) {
        l.e(r32, "element");
        int iOrdinal = r32.ordinal();
        if (((Enum) j.p(this.f2940n, iOrdinal)) == r32) {
            return iOrdinal;
        }
        return -1;
    }

    public int l(Enum r22) {
        l.e(r22, "element");
        return indexOf(r22);
    }

    @Override // L2.AbstractC0480c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return l((Enum) obj);
        }
        return -1;
    }
}
