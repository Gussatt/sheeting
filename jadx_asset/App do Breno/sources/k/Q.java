package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import g.AbstractC0959a;
import i0.AbstractC1040b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.C1475a;
import p.C1478d;
import p.C1479e;
import p.C1482h;
import t.AbstractC1537a;
import w.AbstractC1594a;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Q f8712i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f8714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1475a f8715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1482h f8716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f8717d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f8718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f8720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f8711h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f8713j = new a(6);

    public static class a extends C1479e {
        public a(int i4) {
            super(i4);
        }

        public static int j(int i4, PorterDuff.Mode mode) {
            return ((i4 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter k(int i4, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i4, mode)));
        }

        public PorterDuffColorFilter l(int i4, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i4, mode)), porterDuffColorFilter);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i4, Drawable drawable);

        PorterDuff.Mode b(int i4);

        Drawable c(Q q4, Context context, int i4);

        ColorStateList d(Context context, int i4);

        boolean e(Context context, int i4, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized Q g() {
        try {
            if (f8712i == null) {
                Q q4 = new Q();
                f8712i = q4;
                o(q4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8712i;
    }

    public static synchronized PorterDuffColorFilter k(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        a aVar = f8713j;
        porterDuffColorFilterK = aVar.k(i4, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i4, mode);
            aVar.l(i4, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof AbstractC1040b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void u(Drawable drawable, Y y3, int[] iArr) {
        if (G.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z3 = y3.f8767d;
        if (z3 || y3.f8766c) {
            drawable.setColorFilter(f(z3 ? y3.f8764a : null, y3.f8766c ? y3.f8765b : f8711h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final synchronized boolean a(Context context, long j4, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C1478d c1478d = (C1478d) this.f8717d.get(context);
            if (c1478d == null) {
                c1478d = new C1478d();
                this.f8717d.put(context, c1478d);
            }
            c1478d.m(j4, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, int i4, ColorStateList colorStateList) {
        if (this.f8714a == null) {
            this.f8714a = new WeakHashMap();
        }
        C1482h c1482h = (C1482h) this.f8714a.get(context);
        if (c1482h == null) {
            c1482h = new C1482h();
            this.f8714a.put(context, c1482h);
        }
        c1482h.a(i4, colorStateList);
    }

    public final void c(Context context) {
        if (this.f8719f) {
            return;
        }
        this.f8719f = true;
        Drawable drawableI = i(context, AbstractC0959a.f7292a);
        if (drawableI == null || !p(drawableI)) {
            this.f8719f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i4) {
        if (this.f8718e == null) {
            this.f8718e = new TypedValue();
        }
        TypedValue typedValue = this.f8718e;
        context.getResources().getValue(i4, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f8720g;
        Drawable drawableC = cVar == null ? null : cVar.c(this, context, i4);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableC);
        }
        return drawableC;
    }

    public final synchronized Drawable h(Context context, long j4) {
        C1478d c1478d = (C1478d) this.f8717d.get(context);
        if (c1478d == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1478d.h(j4);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1478d.c(j4);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i4) {
        return j(context, i4, false);
    }

    public synchronized Drawable j(Context context, int i4, boolean z3) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i4);
            if (drawableQ == null) {
                drawableQ = e(context, i4);
            }
            if (drawableQ == null) {
                drawableQ = AbstractC1537a.b(context, i4);
            }
            if (drawableQ != null) {
                drawableQ = t(context, i4, z3, drawableQ);
            }
            if (drawableQ != null) {
                G.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    public synchronized ColorStateList l(Context context, int i4) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i4);
        if (colorStateListM == null) {
            c cVar = this.f8720g;
            colorStateListM = cVar == null ? null : cVar.d(context, i4);
            if (colorStateListM != null) {
                b(context, i4, colorStateListM);
            }
        }
        return colorStateListM;
    }

    public final ColorStateList m(Context context, int i4) {
        C1482h c1482h;
        WeakHashMap weakHashMap = this.f8714a;
        if (weakHashMap == null || (c1482h = (C1482h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c1482h.h(i4);
    }

    public PorterDuff.Mode n(int i4) {
        c cVar = this.f8720g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i4);
    }

    public final Drawable q(Context context, int i4) {
        int next;
        C1475a c1475a = this.f8715b;
        if (c1475a == null || c1475a.isEmpty()) {
            return null;
        }
        C1482h c1482h = this.f8716c;
        if (c1482h != null) {
            String str = (String) c1482h.h(i4);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f8715b.get(str) == null)) {
                return null;
            }
        } else {
            this.f8716c = new C1482h();
        }
        if (this.f8718e == null) {
            this.f8718e = new TypedValue();
        }
        TypedValue typedValue = this.f8718e;
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i4);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f8716c.a(i4, name);
                b bVar = (b) this.f8715b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e4) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e4);
            }
        }
        if (drawableH == null) {
            this.f8716c.a(i4, "appcompat_skip_skip");
        }
        return drawableH;
    }

    public synchronized Drawable r(Context context, f0 f0Var, int i4) {
        try {
            Drawable drawableQ = q(context, i4);
            if (drawableQ == null) {
                drawableQ = f0Var.c(i4);
            }
            if (drawableQ == null) {
                return null;
            }
            return t(context, i4, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(c cVar) {
        this.f8720g = cVar;
    }

    public final Drawable t(Context context, int i4, boolean z3, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i4);
        if (colorStateListL == null) {
            c cVar = this.f8720g;
            if ((cVar == null || !cVar.e(context, i4, drawable)) && !v(context, i4, drawable) && z3) {
                return null;
            }
            return drawable;
        }
        if (G.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableJ = AbstractC1594a.j(drawable);
        AbstractC1594a.g(drawableJ, colorStateListL);
        PorterDuff.Mode modeN = n(i4);
        if (modeN != null) {
            AbstractC1594a.h(drawableJ, modeN);
        }
        return drawableJ;
    }

    public boolean v(Context context, int i4, Drawable drawable) {
        c cVar = this.f8720g;
        return cVar != null && cVar.a(context, i4, drawable);
    }

    public static void o(Q q4) {
    }
}
