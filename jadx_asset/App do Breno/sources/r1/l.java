package r1;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends Exception {
    public l() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(str);
        AbstractC0549h.e(str, "Detail message must not be empty");
    }
}
