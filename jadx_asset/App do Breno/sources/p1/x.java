package p1;

import o1.AbstractC1471h;

/* JADX INFO: loaded from: classes.dex */
public final class x extends k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object f10981o;

    public x(Object obj) {
        this.f10981o = AbstractC1471h.h(obj);
    }

    @Override // p1.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f10981o.equals(obj);
    }

    @Override // p1.h
    public int d(Object[] objArr, int i4) {
        objArr[i4] = this.f10981o;
        return i4 + 1;
    }

    @Override // p1.k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f10981o.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: s */
    public z iterator() {
        return l.b(this.f10981o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f10981o.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
