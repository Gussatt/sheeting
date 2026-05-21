package L1;

import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f2743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f2744d;

    public e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f2741a = str;
        this.f2742b = str2;
        this.f2743c = stackTraceElementArr;
        this.f2744d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
