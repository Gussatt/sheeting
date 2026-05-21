package L1;

/* JADX INFO: loaded from: classes.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f2737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2738c;

    public a(int i4, d... dVarArr) {
        this.f2736a = i4;
        this.f2737b = dVarArr;
        this.f2738c = new b(i4);
    }

    @Override // L1.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f2736a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f2737b) {
            if (stackTraceElementArrA.length <= this.f2736a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f2736a ? this.f2738c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
