package m3;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final C b(Object obj) {
        if (obj == AbstractC1419d.f10534a) {
            throw new IllegalStateException("Does not contain segment");
        }
        X2.l.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (C) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC1419d.f10534a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
