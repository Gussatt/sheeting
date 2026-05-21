package n1;

/* JADX INFO: renamed from: n1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1437d extends IllegalStateException {
    public C1437d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(AbstractC1445l abstractC1445l) {
        if (!abstractC1445l.l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excI = abstractC1445l.i();
        return new C1437d("Complete with: ".concat(excI != null ? "failure" : abstractC1445l.m() ? "result ".concat(String.valueOf(abstractC1445l.j())) : abstractC1445l.k() ? "cancellation" : "unknown issue"), excI);
    }
}
