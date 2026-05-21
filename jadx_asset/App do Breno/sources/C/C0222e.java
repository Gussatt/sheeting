package C;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: C.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0222e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0223f f362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VelocityTracker f365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f370j;

    /* JADX INFO: renamed from: C.e$a */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4);
    }

    /* JADX INFO: renamed from: C.e$b */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i4);
    }

    public C0222e(Context context, InterfaceC0223f interfaceC0223f) {
        this(context, interfaceC0223f, new b() { // from class: C.c
            @Override // C.C0222e.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i4) {
                C0222e.c(context2, iArr, motionEvent, i4);
            }
        }, new a() { // from class: C.d
            @Override // C.C0222e.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4) {
                return C0222e.f(velocityTracker, motionEvent, i4);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C.i(context, viewConfiguration, motionEvent.getDeviceId(), i4, motionEvent.getSource());
        iArr[1] = C.h(context, viewConfiguration, motionEvent.getDeviceId(), i4, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4) {
        AbstractC0238v.a(velocityTracker, motionEvent);
        AbstractC0238v.b(velocityTracker, 1000);
        return AbstractC0238v.d(velocityTracker, i4);
    }

    public final boolean d(MotionEvent motionEvent, int i4) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f368h == source && this.f369i == deviceId && this.f367g == i4) {
            return false;
        }
        this.f363c.a(this.f361a, this.f370j, motionEvent, i4);
        this.f368h = source;
        this.f369i = deviceId;
        this.f367g = i4;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i4) {
        if (this.f365e == null) {
            this.f365e = VelocityTracker.obtain();
        }
        return this.f364d.a(this.f365e, motionEvent, i4);
    }

    public void g(MotionEvent motionEvent, int i4) {
        boolean zD = d(motionEvent, i4);
        if (this.f370j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f365e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f365e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i4) * this.f362b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f366f) && fSignum != 0.0f)) {
            this.f362b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f370j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f366f = this.f362b.a(fMax) ? fMax : 0.0f;
    }

    public C0222e(Context context, InterfaceC0223f interfaceC0223f, b bVar, a aVar) {
        this.f367g = -1;
        this.f368h = -1;
        this.f369i = -1;
        this.f370j = new int[]{Integer.MAX_VALUE, 0};
        this.f361a = context;
        this.f362b = interfaceC0223f;
        this.f363c = bVar;
        this.f364d = aVar;
    }
}
