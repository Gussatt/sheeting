package h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 extends F {
    public abstract B0 U();

    public final String V() {
        B0 b0U;
        B0 b0C = W.c();
        if (this == b0C) {
            return "Dispatchers.Main";
        }
        try {
            b0U = b0C.U();
        } catch (UnsupportedOperationException unused) {
            b0U = null;
        }
        if (this == b0U) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
