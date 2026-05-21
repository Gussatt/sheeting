package i;

import C.AbstractC0228k;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import c.AbstractC0645i;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.G;
import k.a0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import x.InterfaceMenuC1624a;

/* JADX INFO: renamed from: i.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1038c extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f7593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f7594f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f7595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f7596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f7597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7598d;

    /* JADX INFO: renamed from: i.c$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class[] f7599c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f7600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f7601b;

        public a(Object obj, String str) {
            this.f7600a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f7601b = cls.getMethod(str, f7599c);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f7601b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f7601b.invoke(this.f7600a, menuItem)).booleanValue();
                }
                this.f7601b.invoke(this.f7600a, menuItem);
                return true;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* JADX INFO: renamed from: i.c$b */
    public class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public CharSequence f7602A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CharSequence f7603B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public ColorStateList f7604C = null;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public PorterDuff.Mode f7605D = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f7607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7612f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f7613g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f7614h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7615i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f7616j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f7617k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f7618l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7619m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f7620n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7621o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f7622p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7623q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f7624r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f7625s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f7626t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f7627u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f7628v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f7629w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f7630x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f7631y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f7632z;

        public b(Menu menu) {
            this.f7607a = menu;
            h();
        }

        public void a() {
            this.f7614h = true;
            i(this.f7607a.add(this.f7608b, this.f7615i, this.f7616j, this.f7617k));
        }

        public SubMenu b() {
            this.f7614h = true;
            SubMenu subMenuAddSubMenu = this.f7607a.addSubMenu(this.f7608b, this.f7615i, this.f7616j, this.f7617k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f7614h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C1038c.this.f7597c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e4) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = C1038c.this.f7597c.obtainStyledAttributes(attributeSet, AbstractC0645i.f5737L0);
            this.f7608b = typedArrayObtainStyledAttributes.getResourceId(AbstractC0645i.f5745N0, 0);
            this.f7609c = typedArrayObtainStyledAttributes.getInt(AbstractC0645i.f5753P0, 0);
            this.f7610d = typedArrayObtainStyledAttributes.getInt(AbstractC0645i.f5757Q0, 0);
            this.f7611e = typedArrayObtainStyledAttributes.getInt(AbstractC0645i.f5761R0, 0);
            this.f7612f = typedArrayObtainStyledAttributes.getBoolean(AbstractC0645i.f5749O0, true);
            this.f7613g = typedArrayObtainStyledAttributes.getBoolean(AbstractC0645i.f5741M0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            a0 a0VarQ = a0.q(C1038c.this.f7597c, attributeSet, AbstractC0645i.f5765S0);
            this.f7615i = a0VarQ.l(AbstractC0645i.f5777V0, 0);
            this.f7616j = (a0VarQ.i(AbstractC0645i.f5789Y0, this.f7609c) & (-65536)) | (a0VarQ.i(AbstractC0645i.f5793Z0, this.f7610d) & 65535);
            this.f7617k = a0VarQ.n(AbstractC0645i.f5798a1);
            this.f7618l = a0VarQ.n(AbstractC0645i.f5803b1);
            this.f7619m = a0VarQ.l(AbstractC0645i.f5769T0, 0);
            this.f7620n = c(a0VarQ.m(AbstractC0645i.f5808c1));
            this.f7621o = a0VarQ.i(AbstractC0645i.f5843j1, 4096);
            this.f7622p = c(a0VarQ.m(AbstractC0645i.f5813d1));
            this.f7623q = a0VarQ.i(AbstractC0645i.f5860n1, 4096);
            if (a0VarQ.o(AbstractC0645i.f5818e1)) {
                this.f7624r = a0VarQ.a(AbstractC0645i.f5818e1, false) ? 1 : 0;
            } else {
                this.f7624r = this.f7611e;
            }
            this.f7625s = a0VarQ.a(AbstractC0645i.f5781W0, false);
            this.f7626t = a0VarQ.a(AbstractC0645i.f5785X0, this.f7612f);
            this.f7627u = a0VarQ.a(AbstractC0645i.f5773U0, this.f7613g);
            this.f7628v = a0VarQ.i(AbstractC0645i.f5864o1, -1);
            this.f7632z = a0VarQ.m(AbstractC0645i.f5823f1);
            this.f7629w = a0VarQ.l(AbstractC0645i.f5828g1, 0);
            this.f7630x = a0VarQ.m(AbstractC0645i.f5838i1);
            String strM = a0VarQ.m(AbstractC0645i.f5833h1);
            this.f7631y = strM;
            boolean z3 = strM != null;
            if (z3 && this.f7629w == 0 && this.f7630x == null) {
                d.a(e(strM, C1038c.f7594f, C1038c.this.f7596b));
            } else if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.f7602A = a0VarQ.n(AbstractC0645i.f5848k1);
            this.f7603B = a0VarQ.n(AbstractC0645i.f5868p1);
            if (a0VarQ.o(AbstractC0645i.f5856m1)) {
                this.f7605D = G.d(a0VarQ.i(AbstractC0645i.f5856m1, -1), this.f7605D);
            } else {
                this.f7605D = null;
            }
            if (a0VarQ.o(AbstractC0645i.f5852l1)) {
                this.f7604C = a0VarQ.c(AbstractC0645i.f5852l1);
            } else {
                this.f7604C = null;
            }
            a0VarQ.s();
            this.f7614h = false;
        }

        public void h() {
            this.f7608b = 0;
            this.f7609c = 0;
            this.f7610d = 0;
            this.f7611e = 0;
            this.f7612f = true;
            this.f7613g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z3 = false;
            menuItem.setChecked(this.f7625s).setVisible(this.f7626t).setEnabled(this.f7627u).setCheckable(this.f7624r >= 1).setTitleCondensed(this.f7618l).setIcon(this.f7619m);
            int i4 = this.f7628v;
            if (i4 >= 0) {
                menuItem.setShowAsAction(i4);
            }
            if (this.f7632z != null) {
                if (C1038c.this.f7597c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C1038c.this.b(), this.f7632z));
            }
            boolean z4 = menuItem instanceof e;
            if (z4) {
            }
            if (this.f7624r >= 2 && z4) {
                ((e) menuItem).s(true);
            }
            String str = this.f7630x;
            if (str != null) {
                menuItem.setActionView((View) e(str, C1038c.f7593e, C1038c.this.f7595a));
                z3 = true;
            }
            int i5 = this.f7629w;
            if (i5 > 0) {
                if (z3) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i5);
                }
            }
            AbstractC0228k.b(menuItem, this.f7602A);
            AbstractC0228k.f(menuItem, this.f7603B);
            AbstractC0228k.a(menuItem, this.f7620n, this.f7621o);
            AbstractC0228k.e(menuItem, this.f7622p, this.f7623q);
            PorterDuff.Mode mode = this.f7605D;
            if (mode != null) {
                AbstractC0228k.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.f7604C;
            if (colorStateList != null) {
                AbstractC0228k.c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f7593e = clsArr;
        f7594f = clsArr;
    }

    public C1038c(Context context) {
        super(context);
        this.f7597c = context;
        Object[] objArr = {context};
        this.f7595a = objArr;
        this.f7596b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f7598d == null) {
            this.f7598d = a(this.f7597c);
        }
        return this.f7598d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z4 && name2.equals(str)) {
                        z4 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            bVar.a();
                        }
                    } else if (name2.equals("menu")) {
                        z3 = true;
                    }
                }
            } else if (!z4) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z4 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i4, Menu menu) {
        if (!(menu instanceof InterfaceMenuC1624a)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f7597c.getResources().getLayout(i4);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
