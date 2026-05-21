package C;

import android.view.MotionEvent;

/* JADX INFO: renamed from: C.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0239w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f394a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f395b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f396c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f397d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f398e = 0;

    public static float f(float f4) {
        return (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
    }

    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f397d != 0 && eventTime - this.f395b[this.f398e] > 40) {
            b();
        }
        int i4 = (this.f398e + 1) % 20;
        this.f398e = i4;
        int i5 = this.f397d;
        if (i5 != 20) {
            this.f397d = i5 + 1;
        }
        this.f394a[i4] = motionEvent.getAxisValue(26);
        this.f395b[this.f398e] = eventTime;
    }

    public final void b() {
        this.f397d = 0;
        this.f396c = 0.0f;
    }

    public void c(int i4, float f4) {
        float fE = e() * i4;
        this.f396c = fE;
        if (fE < (-Math.abs(f4))) {
            this.f396c = -Math.abs(f4);
        } else if (this.f396c > Math.abs(f4)) {
            this.f396c = Math.abs(f4);
        }
    }

    public float d(int i4) {
        if (i4 != 26) {
            return 0.0f;
        }
        return this.f396c;
    }

    public final float e() {
        long[] jArr;
        long j4;
        int i4 = this.f397d;
        if (i4 < 2) {
            return 0.0f;
        }
        int i5 = this.f398e;
        int i6 = ((i5 + 20) - (i4 - 1)) % 20;
        long j5 = this.f395b[i5];
        while (true) {
            jArr = this.f395b;
            j4 = jArr[i6];
            if (j5 - j4 <= 100) {
                break;
            }
            this.f397d--;
            i6 = (i6 + 1) % 20;
        }
        int i7 = this.f397d;
        if (i7 < 2) {
            return 0.0f;
        }
        if (i7 == 2) {
            int i8 = (i6 + 1) % 20;
            if (j4 == jArr[i8]) {
                return 0.0f;
            }
            return this.f394a[i8] / (r2 - j4);
        }
        float fAbs = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f397d - 1; i10++) {
            int i11 = i10 + i6;
            long[] jArr2 = this.f395b;
            long j6 = jArr2[i11 % 20];
            int i12 = (i11 + 1) % 20;
            if (jArr2[i12] != j6) {
                i9++;
                float f4 = f(fAbs);
                float f5 = this.f394a[i12] / (this.f395b[i12] - j6);
                fAbs += (f5 - f4) * Math.abs(f5);
                if (i9 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }
}
