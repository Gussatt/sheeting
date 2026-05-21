package l3;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient k3.e f10263m;

    public a(k3.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f10263m = eVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
