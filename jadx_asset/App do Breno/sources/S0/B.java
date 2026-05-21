package S0;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class B extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final WeakReference f3389n = new WeakReference(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WeakReference f3390m;

    public B(byte[] bArr) {
        super(bArr);
        this.f3390m = f3389n;
    }

    public abstract byte[] o1();

    @Override // S0.z
    public final byte[] u() {
        byte[] bArrO1;
        synchronized (this) {
            try {
                bArrO1 = (byte[]) this.f3390m.get();
                if (bArrO1 == null) {
                    bArrO1 = o1();
                    this.f3390m = new WeakReference(bArrO1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrO1;
    }
}
