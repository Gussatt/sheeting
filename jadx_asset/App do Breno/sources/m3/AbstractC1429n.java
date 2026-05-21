package m3;

/* JADX INFO: renamed from: m3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1429n {
    public static final void a(int i4) {
        if (i4 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i4).toString());
    }
}
