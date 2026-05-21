package p1;

import java.util.Objects;
import o1.AbstractC1471h;

/* JADX INFO: loaded from: classes.dex */
public class t extends i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final i f10952q = new t(new Object[0], 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object[] f10953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient int f10954p;

    public t(Object[] objArr, int i4) {
        this.f10953o = objArr;
        this.f10954p = i4;
    }

    @Override // p1.i, p1.h
    public int d(Object[] objArr, int i4) {
        System.arraycopy(this.f10953o, 0, objArr, i4, this.f10954p);
        return i4 + this.f10954p;
    }

    @Override // p1.h
    public Object[] f() {
        return this.f10953o;
    }

    @Override // p1.h
    public int g() {
        return this.f10954p;
    }

    @Override // java.util.List
    public Object get(int i4) {
        AbstractC1471h.f(i4, this.f10954p);
        Object obj = this.f10953o[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p1.h
    public int h() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10954p;
    }
}
