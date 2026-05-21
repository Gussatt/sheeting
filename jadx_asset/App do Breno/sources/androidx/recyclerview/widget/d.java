package androidx.recyclerview.widget;

import C.AbstractC0241y;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class d extends RecyclerView.m implements RecyclerView.q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f5430D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f5431E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5432A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Runnable f5433B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RecyclerView.r f5434C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f5437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f5438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f5441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f5442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f5447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f5450p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f5453s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f5460z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5451q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5452r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5454t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5455u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5456v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5457w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f5458x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f5459y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.n(500);
        }
    }

    public class b extends RecyclerView.r {
        public b() {
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5463a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5463a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5463a) {
                this.f5463a = false;
                return;
            }
            if (((Float) d.this.f5460z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f5432A = 0;
                dVar.v(0);
            } else {
                d dVar2 = d.this;
                dVar2.f5432A = 2;
                dVar2.s();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    public class C0104d implements ValueAnimator.AnimatorUpdateListener {
        public C0104d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f5437c.setAlpha(iFloatValue);
            d.this.f5438d.setAlpha(iFloatValue);
            d.this.s();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5460z = valueAnimatorOfFloat;
        this.f5432A = 0;
        this.f5433B = new a();
        this.f5434C = new b();
        this.f5437c = stateListDrawable;
        this.f5438d = drawable;
        this.f5441g = stateListDrawable2;
        this.f5442h = drawable2;
        this.f5439e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f5440f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f5443i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f5444j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f5435a = i5;
        this.f5436b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0104d());
        g(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i4 = this.f5456v;
        if (i4 != 1) {
            return i4 == 2;
        }
        boolean zR = r(motionEvent.getX(), motionEvent.getY());
        boolean zQ = q(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zR && !zQ)) {
            return false;
        }
        if (zQ) {
            this.f5457w = 1;
            this.f5450p = (int) motionEvent.getX();
        } else if (zR) {
            this.f5457w = 2;
            this.f5447m = (int) motionEvent.getY();
        }
        v(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5456v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zR = r(motionEvent.getX(), motionEvent.getY());
            boolean zQ = q(motionEvent.getX(), motionEvent.getY());
            if (zR || zQ) {
                if (zQ) {
                    this.f5457w = 1;
                    this.f5450p = (int) motionEvent.getX();
                } else if (zR) {
                    this.f5457w = 2;
                    this.f5447m = (int) motionEvent.getY();
                }
                v(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f5456v == 2) {
            this.f5447m = 0.0f;
            this.f5450p = 0.0f;
            v(1);
            this.f5457w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f5456v == 2) {
            x();
            if (this.f5457w == 1) {
                o(motionEvent.getX());
            }
            if (this.f5457w == 2) {
                y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(boolean z3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void f(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (this.f5451q != this.f5453s.getWidth() || this.f5452r != this.f5453s.getHeight()) {
            this.f5451q = this.f5453s.getWidth();
            this.f5452r = this.f5453s.getHeight();
            v(0);
        } else if (this.f5432A != 0) {
            if (this.f5454t) {
                k(canvas);
            }
            if (this.f5455u) {
                j(canvas);
            }
        }
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5453s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            i();
        }
        this.f5453s = recyclerView;
        if (recyclerView != null) {
            w();
        }
    }

    public final void h() {
        this.f5453s.removeCallbacks(this.f5433B);
    }

    public final void i() {
        this.f5453s.j0(this);
        this.f5453s.k0(this);
        this.f5453s.l0(this.f5434C);
        h();
    }

    public final void j(Canvas canvas) {
        int i4 = this.f5452r;
        int i5 = this.f5443i;
        int i6 = this.f5449o;
        int i7 = this.f5448n;
        this.f5441g.setBounds(0, 0, i7, i5);
        this.f5442h.setBounds(0, 0, this.f5451q, this.f5444j);
        canvas.translate(0.0f, i4 - i5);
        this.f5442h.draw(canvas);
        canvas.translate(i6 - (i7 / 2), 0.0f);
        this.f5441g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void k(Canvas canvas) {
        int i4 = this.f5451q;
        int i5 = this.f5439e;
        int i6 = i4 - i5;
        int i7 = this.f5446l;
        int i8 = this.f5445k;
        int i9 = i7 - (i8 / 2);
        this.f5437c.setBounds(0, 0, i5, i8);
        this.f5438d.setBounds(0, 0, this.f5440f, this.f5452r);
        if (!p()) {
            canvas.translate(i6, 0.0f);
            this.f5438d.draw(canvas);
            canvas.translate(0.0f, i9);
            this.f5437c.draw(canvas);
            canvas.translate(-i6, -i9);
            return;
        }
        this.f5438d.draw(canvas);
        canvas.translate(this.f5439e, i9);
        canvas.scale(-1.0f, 1.0f);
        this.f5437c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f5439e, -i9);
    }

    public final int[] l() {
        int[] iArr = this.f5459y;
        int i4 = this.f5436b;
        iArr[0] = i4;
        iArr[1] = this.f5451q - i4;
        return iArr;
    }

    public final int[] m() {
        int[] iArr = this.f5458x;
        int i4 = this.f5436b;
        iArr[0] = i4;
        iArr[1] = this.f5452r - i4;
        return iArr;
    }

    public void n(int i4) {
        int i5 = this.f5432A;
        if (i5 == 1) {
            this.f5460z.cancel();
        } else if (i5 != 2) {
            return;
        }
        this.f5432A = 3;
        ValueAnimator valueAnimator = this.f5460z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f5460z.setDuration(i4);
        this.f5460z.start();
    }

    public final void o(float f4) {
        int[] iArrL = l();
        float fMax = Math.max(iArrL[0], Math.min(iArrL[1], f4));
        if (Math.abs(this.f5449o - fMax) < 2.0f) {
            return;
        }
        int iU = u(this.f5450p, fMax, iArrL, this.f5453s.computeHorizontalScrollRange(), this.f5453s.computeHorizontalScrollOffset(), this.f5451q);
        if (iU != 0) {
            this.f5453s.scrollBy(iU, 0);
        }
        this.f5450p = fMax;
    }

    public final boolean p() {
        return AbstractC0241y.l(this.f5453s) == 1;
    }

    public boolean q(float f4, float f5) {
        if (f5 < this.f5452r - this.f5443i) {
            return false;
        }
        int i4 = this.f5449o;
        int i5 = this.f5448n;
        return f4 >= ((float) (i4 - (i5 / 2))) && f4 <= ((float) (i4 + (i5 / 2)));
    }

    public boolean r(float f4, float f5) {
        if (p()) {
            if (f4 > this.f5439e / 2) {
                return false;
            }
        } else if (f4 < this.f5451q - this.f5439e) {
            return false;
        }
        int i4 = this.f5446l;
        int i5 = this.f5445k;
        return f5 >= ((float) (i4 - (i5 / 2))) && f5 <= ((float) (i4 + (i5 / 2)));
    }

    public void s() {
        this.f5453s.invalidate();
    }

    public final void t(int i4) {
        h();
        this.f5453s.postDelayed(this.f5433B, i4);
    }

    public final int u(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i4 - i6;
        int i9 = (int) (((f5 - f4) / i7) * i8);
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    public void v(int i4) {
        if (i4 == 2 && this.f5456v != 2) {
            this.f5437c.setState(f5430D);
            h();
        }
        if (i4 == 0) {
            s();
        } else {
            x();
        }
        if (this.f5456v == 2 && i4 != 2) {
            this.f5437c.setState(f5431E);
            t(1200);
        } else if (i4 == 1) {
            t(1500);
        }
        this.f5456v = i4;
    }

    public final void w() {
        this.f5453s.c(this);
        this.f5453s.e(this);
        this.f5453s.f(this.f5434C);
    }

    public void x() {
        int i4 = this.f5432A;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                this.f5460z.cancel();
            }
        }
        this.f5432A = 1;
        ValueAnimator valueAnimator = this.f5460z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f5460z.setDuration(500L);
        this.f5460z.setStartDelay(0L);
        this.f5460z.start();
    }

    public final void y(float f4) {
        int[] iArrM = m();
        float fMax = Math.max(iArrM[0], Math.min(iArrM[1], f4));
        if (Math.abs(this.f5446l - fMax) < 2.0f) {
            return;
        }
        int iU = u(this.f5447m, fMax, iArrM, this.f5453s.computeVerticalScrollRange(), this.f5453s.computeVerticalScrollOffset(), this.f5452r);
        if (iU != 0) {
            this.f5453s.scrollBy(0, iU);
        }
        this.f5447m = fMax;
    }
}
