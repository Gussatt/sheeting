package k1;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class H2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f9057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f9058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f9059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K2 f9060r;

    public H2(K2 k22, int i4, String str, Object obj, Object obj2, Object obj3) {
        this.f9055m = i4;
        this.f9056n = str;
        this.f9057o = obj;
        this.f9058p = obj2;
        this.f9059q = obj3;
        this.f9060r = k22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K2 k22 = this.f9060r;
        Z2 z2H = k22.f9366a.H();
        if (!z2H.n()) {
            Log.println(6, k22.D(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (k22.f9102c == 0) {
            C1363z3 c1363z3 = k22.f9366a;
            if (c1363z3.B().l()) {
                c1363z3.b();
                k22.f9102c = 'C';
            } else {
                c1363z3.b();
                k22.f9102c = 'c';
            }
        }
        if (k22.f9103d < 0) {
            k22.f9366a.B().B();
            k22.f9103d = 119002L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f9055m);
        char c4 = k22.f9102c;
        long j4 = k22.f9103d;
        String str = this.f9056n;
        String strSubstring = "2" + cCharAt + c4 + j4 + ":" + K2.A(true, str, this.f9057o, this.f9058p, this.f9059q);
        if (strSubstring.length() > 1024) {
            strSubstring = str.substring(0, 1024);
        }
        W2 w22 = z2H.f9314f;
        if (w22 != null) {
            w22.b(strSubstring, 1L);
        }
    }
}
