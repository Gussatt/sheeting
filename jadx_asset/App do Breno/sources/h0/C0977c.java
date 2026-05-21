package h0;

import C.AbstractC0241y;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: h0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0977c extends AbstractC0986l {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String[] f7350X = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Property f7351Y = new b(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Property f7352Z = new C0122c(PointF.class, "topLeft");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Property f7353a0 = new d(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Property f7354b0 = new e(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Property f7355c0 = new f(PointF.class, "topLeft");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Property f7356d0 = new g(PointF.class, "position");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static C0984j f7357e0 = new C0984j();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int[] f7358U = new int[2];

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f7359V = false;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f7360W = false;

    /* JADX INFO: renamed from: h0.c$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f7362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f7363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f7364d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f4) {
            this.f7361a = viewGroup;
            this.f7362b = bitmapDrawable;
            this.f7363c = view;
            this.f7364d = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0972A.b(this.f7361a).d(this.f7362b);
            AbstractC0972A.g(this.f7363c, this.f7364d);
        }
    }

    /* JADX INFO: renamed from: h0.c$b */
    public class b extends Property {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f7366a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f7366a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f7366a);
            Rect rect = this.f7366a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f7366a);
            this.f7366a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f7366a);
        }
    }

    /* JADX INFO: renamed from: h0.c$c, reason: collision with other inner class name */
    public class C0122c extends Property {
        public C0122c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: h0.c$d */
    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: h0.c$e */
    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC0972A.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: h0.c$f */
    public class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC0972A.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: h0.c$g */
    public class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            AbstractC0972A.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: h0.c$h */
    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f7367a;
        private k mViewBounds;

        public h(k kVar) {
            this.f7367a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* JADX INFO: renamed from: h0.c$i */
    public class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f7370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rect f7371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f7372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f7373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f7374f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f7375g;

        public i(View view, Rect rect, int i4, int i5, int i6, int i7) {
            this.f7370b = view;
            this.f7371c = rect;
            this.f7372d = i4;
            this.f7373e = i5;
            this.f7374f = i6;
            this.f7375g = i7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7369a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f7369a) {
                return;
            }
            AbstractC0241y.J(this.f7370b, this.f7371c);
            AbstractC0972A.f(this.f7370b, this.f7372d, this.f7373e, this.f7374f, this.f7375g);
        }
    }

    /* JADX INFO: renamed from: h0.c$j */
    public class j extends AbstractC0987m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7377a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f7378b;

        public j(ViewGroup viewGroup) {
            this.f7378b = viewGroup;
        }

        @Override // h0.AbstractC0987m, h0.AbstractC0986l.f
        public void b(AbstractC0986l abstractC0986l) {
            x.c(this.f7378b, true);
        }

        @Override // h0.AbstractC0987m, h0.AbstractC0986l.f
        public void c(AbstractC0986l abstractC0986l) {
            x.c(this.f7378b, false);
        }

        @Override // h0.AbstractC0987m, h0.AbstractC0986l.f
        public void d(AbstractC0986l abstractC0986l) {
            x.c(this.f7378b, false);
            this.f7377a = true;
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            if (!this.f7377a) {
                x.c(this.f7378b, false);
            }
            abstractC0986l.T(this);
        }
    }

    /* JADX INFO: renamed from: h0.c$k */
    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f7384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7386g;

        public k(View view) {
            this.f7384e = view;
        }

        public void a(PointF pointF) {
            this.f7382c = Math.round(pointF.x);
            this.f7383d = Math.round(pointF.y);
            int i4 = this.f7386g + 1;
            this.f7386g = i4;
            if (this.f7385f == i4) {
                b();
            }
        }

        public final void b() {
            AbstractC0972A.f(this.f7384e, this.f7380a, this.f7381b, this.f7382c, this.f7383d);
            this.f7385f = 0;
            this.f7386g = 0;
        }

        public void c(PointF pointF) {
            this.f7380a = Math.round(pointF.x);
            this.f7381b = Math.round(pointF.y);
            int i4 = this.f7385f + 1;
            this.f7385f = i4;
            if (i4 == this.f7386g) {
                b();
            }
        }
    }

    @Override // h0.AbstractC0986l
    public String[] H() {
        return f7350X;
    }

    public final void g0(s sVar) {
        View view = sVar.f7473b;
        if (!AbstractC0241y.v(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f7472a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f7472a.put("android:changeBounds:parent", sVar.f7473b.getParent());
        if (this.f7360W) {
            sVar.f7473b.getLocationInWindow(this.f7358U);
            sVar.f7472a.put("android:changeBounds:windowX", Integer.valueOf(this.f7358U[0]));
            sVar.f7472a.put("android:changeBounds:windowY", Integer.valueOf(this.f7358U[1]));
        }
        if (this.f7359V) {
            sVar.f7472a.put("android:changeBounds:clip", AbstractC0241y.h(view));
        }
    }

    public final boolean h0(View view, View view2) {
        if (!this.f7360W) {
            return true;
        }
        s sVarX = x(view, true);
        return sVarX == null ? view == view2 : view2 == sVarX.f7473b;
    }

    @Override // h0.AbstractC0986l
    public void k(s sVar) {
        g0(sVar);
    }

    @Override // h0.AbstractC0986l
    public void n(s sVar) {
        g0(sVar);
    }

    @Override // h0.AbstractC0986l
    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        Animator animator;
        int i4;
        int i5;
        Rect rect;
        View view;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map map = sVar.f7472a;
        Map map2 = sVar2.f7472a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f7473b;
        if (h0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f7472a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f7472a.get("android:changeBounds:bounds");
            int i6 = rect2.left;
            int i7 = rect3.left;
            int i8 = rect2.top;
            int i9 = rect3.top;
            int i10 = rect2.right;
            int i11 = rect3.right;
            int i12 = rect2.bottom;
            int i13 = rect3.bottom;
            animator = null;
            int i14 = i10 - i6;
            int i15 = i12 - i8;
            int i16 = i11 - i7;
            int i17 = i13 - i9;
            Rect rect4 = (Rect) sVar.f7472a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f7472a.get("android:changeBounds:clip");
            if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
                i4 = 0;
            } else {
                i4 = (i6 == i7 && i8 == i9) ? 0 : 1;
                if (i10 != i11 || i12 != i13) {
                    i4++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i4++;
            }
            if (i4 > 0) {
                if (this.f7359V) {
                    AbstractC0972A.f(view2, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
                    ObjectAnimator objectAnimatorA = (i6 == i7 && i8 == i9) ? null : AbstractC0980f.a(view2, f7356d0, z().a(i6, i8, i7, i9));
                    if (rect4 == null) {
                        i5 = 0;
                        rect = new Rect(0, 0, i14, i15);
                    } else {
                        i5 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i5, i5, i16, i17) : rect5;
                    if (rect.equals(rect6)) {
                        view = view2;
                        objectAnimator = null;
                    } else {
                        AbstractC0241y.J(view2, rect);
                        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view2, "clipBounds", f7357e0, rect, rect6);
                        view = view2;
                        objectAnimatorOfObject.addListener(new i(view2, rect5, i7, i9, i11, i13));
                        objectAnimator = objectAnimatorOfObject;
                    }
                    animatorC = r.c(objectAnimatorA, objectAnimator);
                } else {
                    AbstractC0972A.f(view2, i6, i8, i10, i12);
                    if (i4 != 2) {
                        animatorC = (i6 == i7 && i8 == i9) ? AbstractC0980f.a(view2, f7354b0, z().a(i10, i12, i11, i13)) : AbstractC0980f.a(view2, f7355c0, z().a(i6, i8, i7, i9));
                    } else if (i14 == i16 && i15 == i17) {
                        animatorC = AbstractC0980f.a(view2, f7356d0, z().a(i6, i8, i7, i9));
                    } else {
                        k kVar = new k(view2);
                        ObjectAnimator objectAnimatorA2 = AbstractC0980f.a(kVar, f7352Z, z().a(i6, i8, i7, i9));
                        ObjectAnimator objectAnimatorA3 = AbstractC0980f.a(kVar, f7353a0, z().a(i10, i12, i11, i13));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                        animatorSet.addListener(new h(kVar));
                        animatorC = animatorSet;
                    }
                    view = view2;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    x.c(viewGroup4, true);
                    a(new j(viewGroup4));
                }
                return animatorC;
            }
        } else {
            animator = null;
            int iIntValue = ((Integer) sVar.f7472a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) sVar.f7472a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) sVar2.f7472a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) sVar2.f7472a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue != iIntValue3 || iIntValue2 != iIntValue4) {
                viewGroup.getLocationInWindow(this.f7358U);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(bitmapCreateBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                float fC = AbstractC0972A.c(view2);
                AbstractC0972A.g(view2, 0.0f);
                AbstractC0972A.b(viewGroup).b(bitmapDrawable);
                AbstractC0981g abstractC0981gZ = z();
                int[] iArr = this.f7358U;
                int i18 = iArr[0];
                int i19 = iArr[1];
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC0982h.a(f7351Y, abstractC0981gZ.a(iIntValue - i18, iIntValue2 - i19, iIntValue3 - i18, iIntValue4 - i19)));
                objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
                return objectAnimatorOfPropertyValuesHolder;
            }
        }
        return animator;
    }
}
