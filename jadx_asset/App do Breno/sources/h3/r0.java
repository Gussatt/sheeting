package h3;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends CancellationException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient InterfaceC1027q0 f7560m;

    public r0(String str, Throwable th, InterfaceC1027q0 interfaceC1027q0) {
        super(str);
        this.f7560m = interfaceC1027q0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return X2.l.a(r0Var.getMessage(), getMessage()) && X2.l.a(r0Var.f7560m, this.f7560m) && X2.l.a(r0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        X2.l.b(message);
        int iHashCode = ((message.hashCode() * 31) + this.f7560m.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f7560m;
    }
}
