package p1;

import java.util.NoSuchElementException;
import o1.AbstractC1471h;

/* JADX INFO: renamed from: p1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1486b extends z {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EnumC0150b f10914m = EnumC0150b.NOT_READY;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f10915n;

    /* JADX INFO: renamed from: p1.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10916a;

        static {
            int[] iArr = new int[EnumC0150b.values().length];
            f10916a = iArr;
            try {
                iArr[EnumC0150b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10916a[EnumC0150b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: p1.b$b, reason: collision with other inner class name */
    public enum EnumC0150b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object c();

    public final Object d() {
        this.f10914m = EnumC0150b.DONE;
        return null;
    }

    public final boolean e() {
        this.f10914m = EnumC0150b.FAILED;
        this.f10915n = c();
        if (this.f10914m == EnumC0150b.DONE) {
            return false;
        }
        this.f10914m = EnumC0150b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC1471h.m(this.f10914m != EnumC0150b.FAILED);
        int i4 = a.f10916a[this.f10914m.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10914m = EnumC0150b.NOT_READY;
        Object objA = p.a(this.f10915n);
        this.f10915n = null;
        return objA;
    }
}
