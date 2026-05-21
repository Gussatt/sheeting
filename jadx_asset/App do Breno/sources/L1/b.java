package L1;

/* JADX INFO: loaded from: classes.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2739a;

    public b(int i4) {
        this.f2739a = i4;
    }

    @Override // L1.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i4 = this.f2739a;
        if (length <= i4) {
            return stackTraceElementArr;
        }
        int i5 = i4 / 2;
        int i6 = i4 - i5;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i6);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i5, stackTraceElementArr2, i6, i5);
        return stackTraceElementArr2;
    }
}
