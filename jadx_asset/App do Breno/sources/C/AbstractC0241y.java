package C;

import C.C0218a;
import C.F;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p.C1481g;
import r.AbstractC1501b;

/* JADX INFO: renamed from: C.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0241y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f399a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f400b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f401c = {AbstractC1501b.f11140b, AbstractC1501b.f11141c, AbstractC1501b.f11152n, AbstractC1501b.f11163y, AbstractC1501b.f11124B, AbstractC1501b.f11125C, AbstractC1501b.f11126D, AbstractC1501b.f11127E, AbstractC1501b.f11128F, AbstractC1501b.f11129G, AbstractC1501b.f11142d, AbstractC1501b.f11143e, AbstractC1501b.f11144f, AbstractC1501b.f11145g, AbstractC1501b.f11146h, AbstractC1501b.f11147i, AbstractC1501b.f11148j, AbstractC1501b.f11149k, AbstractC1501b.f11150l, AbstractC1501b.f11151m, AbstractC1501b.f11153o, AbstractC1501b.f11154p, AbstractC1501b.f11155q, AbstractC1501b.f11156r, AbstractC1501b.f11157s, AbstractC1501b.f11158t, AbstractC1501b.f11159u, AbstractC1501b.f11160v, AbstractC1501b.f11161w, AbstractC1501b.f11162x, AbstractC1501b.f11164z, AbstractC1501b.f11123A};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC0235s f402d = new InterfaceC0235s() { // from class: C.x
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f403e = new e();

    /* JADX INFO: renamed from: C.y$a */
    public class a extends f {
        public a(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        @Override // C.AbstractC0241y.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean b(View view) {
            return Boolean.valueOf(k.d(view));
        }
    }

    /* JADX INFO: renamed from: C.y$b */
    public class b extends f {
        public b(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        @Override // C.AbstractC0241y.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence b(View view) {
            return k.b(view);
        }
    }

    /* JADX INFO: renamed from: C.y$c */
    public class c extends f {
        public c(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        @Override // C.AbstractC0241y.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public CharSequence b(View view) {
            return m.b(view);
        }
    }

    /* JADX INFO: renamed from: C.y$d */
    public class d extends f {
        public d(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        @Override // C.AbstractC0241y.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean b(View view) {
            return Boolean.valueOf(k.c(view));
        }
    }

    /* JADX INFO: renamed from: C.y$f */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f408d;

        public f(int i4, Class cls, int i5) {
            this(i4, cls, 0, i5);
        }

        public final boolean a() {
            return Build.VERSION.SDK_INT >= this.f407c;
        }

        public abstract Object b(View view);

        public Object c(View view) {
            if (a()) {
                return b(view);
            }
            Object tag = view.getTag(this.f405a);
            if (this.f406b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public f(int i4, Class cls, int i5, int i6) {
            this.f405a = i4;
            this.f406b = cls;
            this.f408d = i5;
            this.f407c = i6;
        }
    }

    /* JADX INFO: renamed from: C.y$g */
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: C.y$h */
    public static class h {

        /* JADX INFO: renamed from: C.y$h$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public F f409a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f410b;

            public a(View view, r rVar) {
                this.f410b = view;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                F fP = F.p(windowInsets, view);
                if (Build.VERSION.SDK_INT < 30) {
                    h.a(windowInsets, this.f410b);
                    if (fP.equals(this.f409a)) {
                        throw null;
                    }
                }
                this.f409a = fP;
                throw null;
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC1501b.f11138P);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static F b(View view, F f4, Rect rect) {
            WindowInsets windowInsetsN = f4.n();
            if (windowInsetsN != null) {
                return F.p(view.computeSystemWindowInsets(windowInsetsN, rect), view);
            }
            rect.setEmpty();
            return f4;
        }

        public static boolean c(View view, float f4, float f5, boolean z3) {
            return view.dispatchNestedFling(f4, f5, z3);
        }

        public static boolean d(View view, float f4, float f5) {
            return view.dispatchNestedPreFling(f4, f5);
        }

        public static boolean e(View view, int i4, int i5, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
        }

        public static boolean f(View view, int i4, int i5, int i6, int i7, int[] iArr) {
            return view.dispatchNestedScroll(i4, i5, i6, i7, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static F j(View view) {
            return F.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f4) {
            view.setElevation(f4);
        }

        public static void t(View view, boolean z3) {
            view.setNestedScrollingEnabled(z3);
        }

        public static void u(View view, r rVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC1501b.f11134L, rVar);
            }
            if (rVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC1501b.f11138P));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, rVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f4) {
            view.setTranslationZ(f4);
        }

        public static void x(View view, float f4) {
            view.setZ(f4);
        }

        public static boolean y(View view, int i4) {
            return view.startNestedScroll(i4);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: C.y$i */
    public static class i {
        public static F a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            F fO = F.o(rootWindowInsets);
            fO.l(fO);
            fO.d(view.getRootView());
            return fO;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i4) {
            view.setScrollIndicators(i4);
        }

        public static void d(View view, int i4, int i5) {
            view.setScrollIndicators(i4, i5);
        }
    }

    /* JADX INFO: renamed from: C.y$j */
    public static class j {
        public static void a(View view, Collection<View> collection, int i4) {
            view.addKeyboardNavigationClusters(collection, i4);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i4) {
            return view.keyboardNavigationClusterSearch(view2, i4);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z3) {
            view.setFocusedByDefault(z3);
        }

        public static void m(View view, int i4) {
            view.setImportantForAutofill(i4);
        }

        public static void n(View view, boolean z3) {
            view.setKeyboardNavigationCluster(z3);
        }

        public static void o(View view, int i4) {
            view.setNextClusterForwardId(i4);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: C.y$k */
    public static class k {
        public static void a(View view, final n nVar) {
            C1481g c1481g = (C1481g) view.getTag(AbstractC1501b.f11137O);
            if (c1481g == null) {
                c1481g = new C1481g();
                view.setTag(AbstractC1501b.f11137O, c1481g);
            }
            Objects.requireNonNull(nVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(nVar) { // from class: C.z
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            c1481g.put(nVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, n nVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C1481g c1481g = (C1481g) view.getTag(AbstractC1501b.f11137O);
            if (c1481g == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1481g.get(nVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i4) {
            return (T) view.requireViewById(i4);
        }

        public static void g(View view, boolean z3) {
            view.setAccessibilityHeading(z3);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, E.a aVar) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z3) {
            view.setScreenReaderFocusable(z3);
        }
    }

    /* JADX INFO: renamed from: C.y$l */
    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
        }

        public static void e(View view, F.a aVar) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: renamed from: C.y$m */
    public static class m {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        public static void d(View view, int i4) {
            view.setImportantForContentCapture(i4);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: C.y$n */
    public interface n {
    }

    public static void A(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void B(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void C(View view, Runnable runnable, long j4) {
        view.postOnAnimationDelayed(runnable, j4);
    }

    public static void D(View view) {
        g.c(view);
    }

    public static f E() {
        return new a(AbstractC1501b.f11135M, Boolean.class, 28);
    }

    public static void F(View view, C0218a c0218a) {
        if (c0218a == null && (c(view) instanceof C0218a.C0004a)) {
            c0218a = new C0218a();
        }
        M(view);
        view.setAccessibilityDelegate(c0218a == null ? null : c0218a.d());
    }

    public static void G(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void H(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static void I(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static void J(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void K(View view, boolean z3) {
        view.setHasTransientState(z3);
    }

    public static void L(View view, int i4) {
        view.setImportantForAccessibility(i4);
    }

    public static void M(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void N(View view, int i4) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.m(view, i4);
        }
    }

    public static void O(View view, String str) {
        h.v(view, str);
    }

    public static f P() {
        return new c(AbstractC1501b.f11136N, CharSequence.class, 64, 30);
    }

    public static void Q(View view) {
        h.z(view);
    }

    public static f a() {
        return new d(AbstractC1501b.f11132J, Boolean.class, 28);
    }

    public static F b(View view, F f4) {
        WindowInsets windowInsetsN = f4.n();
        if (windowInsetsN != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsN);
            if (!windowInsetsA.equals(windowInsetsN)) {
                return F.p(windowInsetsA, view);
            }
        }
        return f4;
    }

    public static View.AccessibilityDelegate c(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : d(view);
    }

    public static View.AccessibilityDelegate d(View view) {
        if (f400b) {
            return null;
        }
        if (f399a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f399a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f400b = true;
                return null;
            }
        }
        try {
            Object obj = f399a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f400b = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        return (CharSequence) z().c(view);
    }

    public static ColorStateList f(View view) {
        return h.g(view);
    }

    public static PorterDuff.Mode g(View view) {
        return h.h(view);
    }

    public static Rect h(View view) {
        return view.getClipBounds();
    }

    public static Display i(View view) {
        return view.getDisplay();
    }

    public static int j(View view) {
        return view.getImportantForAccessibility();
    }

    public static int k(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.c(view);
        }
        return 0;
    }

    public static int l(View view) {
        return view.getLayoutDirection();
    }

    public static int m(View view) {
        return view.getMinimumHeight();
    }

    public static int n(View view) {
        return view.getMinimumWidth();
    }

    public static F o(View view) {
        return i.a(view);
    }

    public static CharSequence p(View view) {
        return (CharSequence) P().c(view);
    }

    public static String q(View view) {
        return h.k(view);
    }

    public static int r(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean s(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean t(View view) {
        Boolean bool = (Boolean) a().c(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean u(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean v(View view) {
        return view.isLaidOut();
    }

    public static boolean w(View view) {
        Boolean bool = (Boolean) E().c(view);
        return bool != null && bool.booleanValue();
    }

    public static void x(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z3 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i4);
                if (z3) {
                    accessibilityEventObtain.getText().add(e(view));
                    M(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i4 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i4);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                }
            }
        }
    }

    public static F y(View view, F f4) {
        WindowInsets windowInsetsN = f4.n();
        if (windowInsetsN != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsN);
            if (!windowInsetsB.equals(windowInsetsN)) {
                return F.p(windowInsetsB, view);
            }
        }
        return f4;
    }

    public static f z() {
        return new b(AbstractC1501b.f11133K, CharSequence.class, 8, 28);
    }

    /* JADX INFO: renamed from: C.y$e */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakHashMap f404b = new WeakHashMap();

        public final void a(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z3 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z3) {
                AbstractC0241y.x(view, z3 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z3));
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f404b.entrySet().iterator();
                while (it.hasNext()) {
                    a((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
