package m2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l2.AbstractC1388b;
import m2.L;
import m2.r;
import p0.C1483a;
import q0.InterfaceC1491a;
import q0.c;
import t.AbstractC1537a;
import w2.InterfaceC1609b;
import x2.C1643d;
import y2.C1657a;

/* JADX INFO: loaded from: classes.dex */
public class B extends FrameLayout implements C1657a.c, L.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1415s f10340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f10341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f10342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.n f10343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.n f10344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f10345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.a f10347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f10348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1657a f10349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public io.flutter.plugin.editing.H f10350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.s f10351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public io.flutter.plugin.editing.r f10352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1643d f10353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public L f10354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1400c f10355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public io.flutter.view.h f10356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextServicesManager f10357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public S f10358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final FlutterRenderer.g f10359u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h.j f10360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ContentObserver f10361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.m f10362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public B.a f10363y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public D f10364z;

    public class a implements h.j {
        public a() {
        }

        @Override // io.flutter.view.h.j
        public void a(boolean z3, boolean z4) {
            B.this.x(z3, z4);
        }
    }

    public class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            super.onChange(z3);
            if (B.this.f10347i == null) {
                return;
            }
            AbstractC1388b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            B.this.z();
        }
    }

    public class c implements io.flutter.embedding.engine.renderer.m {
        public c() {
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void c() {
            B.this.f10346h = false;
            Iterator it = B.this.f10345g.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.m) it.next()).c();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void f() {
            B.this.f10346h = true;
            Iterator it = B.this.f10345g.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.m) it.next()).f();
            }
        }
    }

    public enum e {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public B(Context context, C1415s c1415s) {
        this(context, (AttributeSet) null, c1415s);
    }

    public final void A() {
        if (!u()) {
            AbstractC1388b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f10359u.f7839a = getResources().getDisplayMetrics().density;
        this.f10359u.f7854p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f10347i.w().y(this.f10359u);
    }

    @Override // m2.L.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        this.f10350l.k(sparseArray);
    }

    @Override // y2.C1657a.c
    public PointerIcon b(int i4) {
        return PointerIcon.getSystemIcon(getContext(), i4);
    }

    @Override // m2.L.e
    public boolean c(KeyEvent keyEvent) {
        return this.f10350l.r(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f10347i;
        return aVar != null ? aVar.r().G(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (u() && this.f10354p.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.h hVar = this.f10356r;
        if (hVar == null || !hVar.E()) {
            return null;
        }
        return this.f10356r;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f10347i;
    }

    @Override // m2.L.e
    public InterfaceC1609b getBinaryMessenger() {
        return this.f10347i.l();
    }

    public r getCurrentImageSurface() {
        return this.f10342d;
    }

    public FlutterRenderer.g getViewportMetrics() {
        return this.f10359u;
    }

    public boolean j() {
        r rVar = this.f10342d;
        if (rVar != null) {
            return rVar.e();
        }
        return false;
    }

    public void k(io.flutter.embedding.engine.renderer.m mVar) {
        this.f10345g.add(mVar);
    }

    public void l(r rVar) {
        io.flutter.embedding.engine.a aVar = this.f10347i;
        if (aVar != null) {
            rVar.c(aVar.w());
        }
    }

    public void m(io.flutter.embedding.engine.a aVar) {
        AbstractC1388b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (u()) {
            if (aVar == this.f10347i) {
                AbstractC1388b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                AbstractC1388b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                r();
            }
        }
        this.f10347i = aVar;
        FlutterRenderer flutterRendererW = aVar.w();
        this.f10346h = flutterRendererW.m();
        this.f10343e.c(flutterRendererW);
        flutterRendererW.i(this.f10362x);
        this.f10349k = new C1657a(this, this.f10347i.o());
        this.f10350l = new io.flutter.plugin.editing.H(this, this.f10347i.D(), this.f10347i.y(), this.f10347i.r(), this.f10347i.s());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f10357s = textServicesManager;
            this.f10351m = new io.flutter.plugin.editing.s(textServicesManager, this.f10347i.B());
        } catch (Exception unused) {
            AbstractC1388b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f10352n = new io.flutter.plugin.editing.r(this, this.f10350l.q(), this.f10347i.y());
        this.f10353o = this.f10347i.n();
        this.f10354p = new L(this);
        this.f10355q = new C1400c(this.f10347i.w(), false);
        io.flutter.view.h hVar = new io.flutter.view.h(this, aVar.i(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), aVar.t());
        this.f10356r = hVar;
        hVar.b0(this.f10360v);
        x(this.f10356r.E(), this.f10356r.G());
        this.f10347i.r().h(this.f10356r);
        this.f10347i.r().E(this.f10347i.w());
        this.f10347i.s().h(this.f10356r);
        this.f10347i.s().i(this.f10347i.w());
        this.f10350l.q().restartInput(this);
        z();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f10361w);
        A();
        aVar.r().F(this);
        aVar.s().m(this);
        Iterator it = this.f10348j.iterator();
        if (it.hasNext()) {
            i.d.a(it.next());
            throw null;
        }
        if (this.f10346h) {
            this.f10362x.f();
        }
    }

    public e n() {
        Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return e.RIGHT;
            }
            if (rotation == 3) {
                return e.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return e.BOTH;
            }
        }
        return e.NONE;
    }

    public void o() {
        this.f10343e.d();
        r rVar = this.f10342d;
        if (rVar == null) {
            r rVarP = p();
            this.f10342d = rVarP;
            addView(rVarP);
        } else {
            rVar.k(getWidth(), getHeight());
        }
        this.f10344f = this.f10343e;
        r rVar2 = this.f10342d;
        this.f10343e = rVar2;
        io.flutter.embedding.engine.a aVar = this.f10347i;
        if (aVar != null) {
            rVar2.c(aVar.w());
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            this.f10359u.f7850l = systemGestureInsets.top;
            this.f10359u.f7851m = systemGestureInsets.right;
            this.f10359u.f7852n = systemGestureInsets.bottom;
            this.f10359u.f7853o = systemGestureInsets.left;
        }
        boolean z3 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z4 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i4 >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
            this.f10359u.f7842d = insets.top;
            this.f10359u.f7843e = insets.right;
            this.f10359u.f7844f = insets.bottom;
            this.f10359u.f7845g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            this.f10359u.f7846h = insets2.top;
            this.f10359u.f7847i = insets2.right;
            this.f10359u.f7848j = insets2.bottom;
            this.f10359u.f7849k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            this.f10359u.f7850l = insets3.top;
            this.f10359u.f7851m = insets3.right;
            this.f10359u.f7852n = insets3.bottom;
            this.f10359u.f7853o = insets3.left;
            DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                FlutterRenderer.g gVar = this.f10359u;
                gVar.f7842d = Math.max(Math.max(gVar.f7842d, waterfallInsets.top), displayCutout2.getSafeInsetTop());
                FlutterRenderer.g gVar2 = this.f10359u;
                gVar2.f7843e = Math.max(Math.max(gVar2.f7843e, waterfallInsets.right), displayCutout2.getSafeInsetRight());
                FlutterRenderer.g gVar3 = this.f10359u;
                gVar3.f7844f = Math.max(Math.max(gVar3.f7844f, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
                FlutterRenderer.g gVar4 = this.f10359u;
                gVar4.f7845g = Math.max(Math.max(gVar4.f7845g, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
            }
        } else {
            e eVarN = e.NONE;
            if (!z4) {
                eVarN = n();
            }
            this.f10359u.f7842d = z3 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f10359u.f7843e = (eVarN == e.RIGHT || eVarN == e.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f10359u.f7844f = (z4 && s(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f10359u.f7845g = (eVarN == e.LEFT || eVarN == e.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.g gVar5 = this.f10359u;
            gVar5.f7846h = 0;
            gVar5.f7847i = 0;
            gVar5.f7848j = s(windowInsets);
            this.f10359u.f7849k = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i4 >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                AbstractC1388b.f("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.b(rect, FlutterRenderer.d.CUTOUT, FlutterRenderer.c.UNKNOWN));
            }
        }
        this.f10359u.c(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            this.f10364z.c(getContext(), this.f10359u);
        }
        AbstractC1388b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f10359u.f7842d + ", Left: " + this.f10359u.f7845g + ", Right: " + this.f10359u.f7843e + "\nKeyboard insets: Bottom: " + this.f10359u.f7848j + ", Left: " + this.f10359u.f7849k + ", Right: " + this.f10359u.f7847i + "System Gesture Insets - Left: " + this.f10359u.f7853o + ", Top: " + this.f10359u.f7850l + ", Right: " + this.f10359u.f7851m + ", Bottom: " + this.f10359u.f7848j);
        A();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10358t = q();
        Activity activityE = I2.h.e(getContext());
        if (this.f10358t == null || activityE == null) {
            return;
        }
        this.f10363y = new B.a() { // from class: m2.A
            @Override // B.a
            public final void accept(Object obj) {
                this.f10339a.setWindowInfoListenerDisplayFeatures((q0.j) obj);
            }
        };
        this.f10358t.a(activityE, AbstractC1537a.c(getContext()), this.f10363y);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f10347i != null) {
            AbstractC1388b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f10353o.d(configuration);
            z();
            I2.h.c(getContext(), this.f10347i);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !u() ? super.onCreateInputConnection(editorInfo) : this.f10350l.o(this, this.f10354p, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        B.a aVar;
        S s4 = this.f10358t;
        if (s4 != null && (aVar = this.f10363y) != null) {
            s4.b(aVar);
        }
        this.f10363y = null;
        this.f10358t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (u() && this.f10355q.j(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !u() ? super.onHoverEvent(motionEvent) : this.f10356r.L(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i4) {
        super.onProvideAutofillVirtualStructure(viewStructure, i4);
        this.f10350l.z(viewStructure, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        AbstractC1388b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i6 + " x " + i7 + ", it is now " + i4 + " x " + i5);
        FlutterRenderer.g gVar = this.f10359u;
        gVar.f7840b = i4;
        gVar.f7841c = i5;
        A();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!u()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f10355q.k(motionEvent);
    }

    public r p() {
        return new r(getContext(), getWidth(), getHeight(), r.a.background);
    }

    public S q() {
        try {
            return new S(new C1483a(q0.f.f11038a.d(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void r() {
        AbstractC1388b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f10347i);
        if (!u()) {
            AbstractC1388b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator it = this.f10348j.iterator();
        if (it.hasNext()) {
            i.d.a(it.next());
            throw null;
        }
        getContext().getContentResolver().unregisterContentObserver(this.f10361w);
        this.f10347i.r().P();
        this.f10347i.s().s();
        this.f10347i.r().l();
        this.f10347i.s().l();
        this.f10356r.S();
        this.f10356r = null;
        this.f10350l.q().restartInput(this);
        this.f10350l.p();
        this.f10354p.d();
        io.flutter.plugin.editing.s sVar = this.f10351m;
        if (sVar != null) {
            sVar.b();
        }
        C1657a c1657a = this.f10349k;
        if (c1657a != null) {
            c1657a.c();
        }
        FlutterRenderer flutterRendererW = this.f10347i.w();
        this.f10346h = false;
        flutterRendererW.t(this.f10362x);
        flutterRendererW.A();
        flutterRendererW.x(false);
        io.flutter.embedding.engine.renderer.n nVar = this.f10344f;
        if (nVar != null && this.f10343e == this.f10342d) {
            this.f10343e = nVar;
        }
        this.f10343e.a();
        v();
        this.f10344f = null;
        this.f10347i = null;
    }

    public final int s(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    public void setDelegate(D d4) {
        this.f10364z = d4;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        io.flutter.embedding.engine.renderer.n nVar = this.f10343e;
        if (nVar instanceof C1415s) {
            ((C1415s) nVar).setVisibility(i4);
        }
    }

    public void setWindowInfoListenerDisplayFeatures(q0.j jVar) {
        List<InterfaceC1491a> listA = jVar.a();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1491a interfaceC1491a : listA) {
            AbstractC1388b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + interfaceC1491a.a().toString() + " and type = " + interfaceC1491a.getClass().getSimpleName());
            if (interfaceC1491a instanceof q0.c) {
                q0.c cVar = (q0.c) interfaceC1491a;
                arrayList.add(new FlutterRenderer.b(interfaceC1491a.a(), cVar.c() == c.a.f11017d ? FlutterRenderer.d.HINGE : FlutterRenderer.d.FOLD, cVar.b() == c.b.f11020c ? FlutterRenderer.c.POSTURE_FLAT : cVar.b() == c.b.f11021d ? FlutterRenderer.c.POSTURE_HALF_OPENED : FlutterRenderer.c.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.b(interfaceC1491a.a(), FlutterRenderer.d.UNKNOWN, FlutterRenderer.c.UNKNOWN));
            }
        }
        this.f10359u.d(arrayList);
        A();
    }

    public final void t() {
        AbstractC1388b.f("FlutterView", "Initializing FlutterView");
        if (this.f10340b != null) {
            AbstractC1388b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            addView(this.f10340b);
        } else if (this.f10341c != null) {
            AbstractC1388b.f("FlutterView", "Internally using a FlutterTextureView.");
            addView(this.f10341c);
        } else {
            AbstractC1388b.f("FlutterView", "Internally using a FlutterImageView.");
            addView(this.f10342d);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    public boolean u() {
        io.flutter.embedding.engine.a aVar = this.f10347i;
        return aVar != null && aVar.w() == this.f10343e.getAttachedRenderer();
    }

    public final void v() {
        r rVar = this.f10342d;
        if (rVar != null) {
            rVar.g();
            removeView(this.f10342d);
            this.f10342d = null;
        }
    }

    public void w(io.flutter.embedding.engine.renderer.m mVar) {
        this.f10345g.remove(mVar);
    }

    public final void x(boolean z3, boolean z4) {
        boolean z5 = false;
        if (this.f10347i.w().n()) {
            setWillNotDraw(false);
            return;
        }
        if (!z3 && !z4) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    public void y(Runnable runnable) {
        if (this.f10342d == null) {
            AbstractC1388b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.n nVar = this.f10344f;
        if (nVar == null) {
            AbstractC1388b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f10343e = nVar;
        this.f10344f = null;
        FlutterRenderer flutterRendererW = this.f10347i.w();
        if (this.f10347i != null && flutterRendererW != null) {
            this.f10343e.b();
            flutterRendererW.i(new d(flutterRendererW, runnable));
        } else {
            this.f10342d.a();
            v();
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L13
            v2.y$c r0 = v2.y.c.dark
            goto L15
        L13:
            v2.y$c r0 = v2.y.c.light
        L15:
            android.view.textservice.TextServicesManager r1 = r6.f10357s
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L50
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L4e
            java.util.List r1 = m2.x.a(r1)
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r1.next()
            android.view.textservice.SpellCheckerInfo r4 = (android.view.textservice.SpellCheckerInfo) r4
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "com.google.android.inputmethod.latin"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L29
            r1 = r3
            goto L44
        L43:
            r1 = r2
        L44:
            android.view.textservice.TextServicesManager r4 = r6.f10357s
            boolean r4 = m2.y.a(r4)
            if (r4 == 0) goto L50
            if (r1 == 0) goto L50
        L4e:
            r1 = r3
            goto L51
        L50:
            r1 = r2
        L51:
            io.flutter.embedding.engine.a r4 = r6.f10347i
            v2.y r4 = r4.A()
            v2.y$b r4 = r4.d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            v2.y$b r4 = r4.f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            v2.y$b r4 = r4.c(r5)
            v2.y$b r1 = r4.d(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L8a
            r2 = r3
        L8a:
            v2.y$b r1 = r1.b(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            v2.y$b r1 = r1.g(r2)
            v2.y$b r0 = r1.e(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.B.z():void");
    }

    public B(Context context, t tVar) {
        this(context, (AttributeSet) null, tVar);
    }

    public B(Context context, AttributeSet attributeSet, C1415s c1415s) {
        super(context, attributeSet);
        this.f10345g = new HashSet();
        this.f10348j = new HashSet();
        this.f10359u = new FlutterRenderer.g();
        this.f10360v = new a();
        this.f10361w = new b(new Handler(Looper.getMainLooper()));
        this.f10362x = new c();
        this.f10364z = new D();
        this.f10340b = c1415s;
        this.f10343e = c1415s;
        t();
    }

    public B(Context context, AttributeSet attributeSet, t tVar) {
        super(context, attributeSet);
        this.f10345g = new HashSet();
        this.f10348j = new HashSet();
        this.f10359u = new FlutterRenderer.g();
        this.f10360v = new a();
        this.f10361w = new b(new Handler(Looper.getMainLooper()));
        this.f10362x = new c();
        this.f10364z = new D();
        this.f10341c = tVar;
        this.f10343e = tVar;
        t();
    }

    public class d implements io.flutter.embedding.engine.renderer.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlutterRenderer f10368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f10369b;

        public d(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f10368a = flutterRenderer;
            this.f10369b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void f() {
            this.f10368a.t(this);
            this.f10369b.run();
            B b4 = B.this;
            if ((b4.f10343e instanceof r) || b4.f10342d == null) {
                return;
            }
            B.this.f10342d.a();
            B.this.v();
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void c() {
        }
    }
}
