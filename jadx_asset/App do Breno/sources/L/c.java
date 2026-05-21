package L;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends IOException {
    public /* synthetic */ c(String str, Throwable th, int i4, X2.g gVar) {
        this(str, (i4 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Throwable th) {
        super(str, th);
        X2.l.e(str, "message");
    }
}
