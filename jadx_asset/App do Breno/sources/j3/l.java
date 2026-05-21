package j3;

import h3.AbstractC1005f0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static final void a(s sVar, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC1005f0.a("Channel was consumed, consumer had failed", th);
            }
        }
        sVar.e(cancellationExceptionA);
    }
}
