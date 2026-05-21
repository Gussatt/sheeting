package k;

/* JADX INFO: loaded from: classes.dex */
public class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8722a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8723b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8724c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8725d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8726e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8727f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8728g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8729h = false;

    public int a() {
        return this.f8728g ? this.f8722a : this.f8723b;
    }

    public int b() {
        return this.f8722a;
    }

    public int c() {
        return this.f8723b;
    }

    public int d() {
        return this.f8728g ? this.f8723b : this.f8722a;
    }

    public void e(int i4, int i5) {
        this.f8729h = false;
        if (i4 != Integer.MIN_VALUE) {
            this.f8726e = i4;
            this.f8722a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f8727f = i5;
            this.f8723b = i5;
        }
    }

    public void f(boolean z3) {
        if (z3 == this.f8728g) {
            return;
        }
        this.f8728g = z3;
        if (!this.f8729h) {
            this.f8722a = this.f8726e;
            this.f8723b = this.f8727f;
            return;
        }
        if (z3) {
            int i4 = this.f8725d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f8726e;
            }
            this.f8722a = i4;
            int i5 = this.f8724c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = this.f8727f;
            }
            this.f8723b = i5;
            return;
        }
        int i6 = this.f8724c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = this.f8726e;
        }
        this.f8722a = i6;
        int i7 = this.f8725d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = this.f8727f;
        }
        this.f8723b = i7;
    }

    public void g(int i4, int i5) {
        this.f8724c = i4;
        this.f8725d = i5;
        this.f8729h = true;
        if (this.f8728g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f8722a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f8723b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f8722a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f8723b = i5;
        }
    }
}
