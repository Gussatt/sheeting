package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class J implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f8655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f8656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f8657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f8660j = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = J.this.f8655e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            J.this.e();
        }
    }

    public J(View view) {
        this.f8655e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8652b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8653c = tapTimeout;
        this.f8654d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f4, float f5, float f6) {
        float f7 = -f6;
        return f4 >= f7 && f5 >= f7 && f4 < ((float) (view.getRight() - view.getLeft())) + f6 && f5 < ((float) (view.getBottom() - view.getTop())) + f6;
    }

    public final void a() {
        Runnable runnable = this.f8657g;
        if (runnable != null) {
            this.f8655e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f8656f;
        if (runnable2 != null) {
            this.f8655e.removeCallbacks(runnable2);
        }
    }

    public abstract j.c b();

    public abstract boolean c();

    public boolean d() {
        j.c cVarB = b();
        if (cVarB == null || !cVarB.i()) {
            return true;
        }
        cVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f8655e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f8658h = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        H h4;
        View view = this.f8655e;
        j.c cVarB = b();
        if (cVarB != null && cVarB.i() && (h4 = (H) cVarB.d()) != null && h4.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(h4, motionEventObtainNoHistory);
            boolean zE = h4.e(motionEventObtainNoHistory, this.f8659i);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f8655e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f8659i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f8652b
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f8659i = r6
            java.lang.Runnable r6 = r5.f8656f
            if (r6 != 0) goto L52
            k.J$a r6 = new k.J$a
            r6.<init>()
            r5.f8656f = r6
        L52:
            java.lang.Runnable r6 = r5.f8656f
            int r1 = r5.f8653c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f8657g
            if (r6 != 0) goto L65
            k.J$b r6 = new k.J$b
            r6.<init>()
            r5.f8657g = r6
        L65:
            java.lang.Runnable r6 = r5.f8657g
            int r1 = r5.f8654d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.J.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f8660j);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f8660j);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        boolean z4 = this.f8658h;
        if (z4) {
            z3 = f(motionEvent) || !d();
        } else {
            z3 = g(motionEvent) && c();
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f8655e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f8658h = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f8658h = false;
        this.f8659i = -1;
        Runnable runnable = this.f8656f;
        if (runnable != null) {
            this.f8655e.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
