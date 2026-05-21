package k1;

/* JADX INFO: loaded from: classes.dex */
public final class I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K2 f9076d;

    public I2(K2 k22, int i4, boolean z3, boolean z4) {
        this.f9076d = k22;
        this.f9073a = i4;
        this.f9074b = z3;
        this.f9075c = z4;
    }

    public final void a(String str) {
        this.f9076d.G(this.f9073a, this.f9074b, this.f9075c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f9076d.G(this.f9073a, this.f9074b, this.f9075c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f9076d.G(this.f9073a, this.f9074b, this.f9075c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f9076d.G(this.f9073a, this.f9074b, this.f9075c, str, obj, obj2, obj3);
    }
}
