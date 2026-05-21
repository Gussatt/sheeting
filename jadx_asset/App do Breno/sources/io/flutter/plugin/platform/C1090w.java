package io.flutter.plugin.platform;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.C1090w;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l2.AbstractC1388b;
import m2.C1400c;
import m2.N;
import o2.C1472a;
import r2.C1513a;
import v2.p;
import v2.s;

/* JADX INFO: renamed from: io.flutter.plugin.platform.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1090w implements InterfaceC1085q {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static Class[] f8049x = {SurfaceView.class};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f8050y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static boolean f8051z = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1400c f8053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f8054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m2.B f8055d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextureRegistry f8057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.H f8058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v2.s f8059h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f8056e = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8067p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8068q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8069r = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8073v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s.e f8074w = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1082n f8052a = new C1082n();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f8061j = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1069a f8060i = new C1069a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f8062k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SparseArray f8065n = new SparseArray();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f8070s = new HashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f8071t = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f8066o = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseArray f8063l = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseArray f8064m = new SparseArray();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m2.N f8072u = m2.N.a();

    /* JADX INFO: renamed from: io.flutter.plugin.platform.w$a */
    public class a implements s.e {
        public a() {
        }

        public static /* synthetic */ void h(a aVar, b0 b0Var, float f4, s.b bVar) {
            C1090w.this.y0(b0Var);
            if (C1090w.this.f8054c != null) {
                f4 = C1090w.this.V();
            }
            bVar.a(new s.c(C1090w.this.u0(b0Var.f(), f4), C1090w.this.u0(b0Var.e(), f4)));
        }

        @Override // v2.s.e
        public void a(int i4, int i5) {
            View view;
            if (!C1090w.z0(i5)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i5 + "(view id: " + i4 + ")");
            }
            if (C1090w.this.j(i4)) {
                view = ((b0) C1090w.this.f8061j.get(Integer.valueOf(i4))).g();
            } else {
                InterfaceC1079k interfaceC1079k = (InterfaceC1079k) C1090w.this.f8063l.get(i4);
                if (interfaceC1079k == null) {
                    AbstractC1388b.b("PlatformViewsController", "Setting direction to an unknown view with id: " + i4);
                    return;
                }
                view = interfaceC1079k.getView();
            }
            if (view != null) {
                view.setLayoutDirection(i5);
                return;
            }
            AbstractC1388b.b("PlatformViewsController", "Setting direction to a null view with id: " + i4);
        }

        @Override // v2.s.e
        public void b(v2.q qVar) {
            int i4 = qVar.f11697a;
            float f4 = C1090w.this.f8054c.getResources().getDisplayMetrics().density;
            if (C1090w.this.j(i4)) {
                ((b0) C1090w.this.f8061j.get(Integer.valueOf(i4))).c(C1090w.this.v0(f4, qVar, true));
                return;
            }
            InterfaceC1079k interfaceC1079k = (InterfaceC1079k) C1090w.this.f8063l.get(i4);
            if (interfaceC1079k == null) {
                AbstractC1388b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i4);
                return;
            }
            View view = interfaceC1079k.getView();
            if (view != null) {
                view.dispatchTouchEvent(C1090w.this.v0(f4, qVar, false));
                return;
            }
            AbstractC1388b.b("PlatformViewsController", "Sending touch to a null view with id: " + i4);
        }

        @Override // v2.s.e
        public void c(int i4) {
            View view;
            if (C1090w.this.j(i4)) {
                view = ((b0) C1090w.this.f8061j.get(Integer.valueOf(i4))).g();
            } else {
                InterfaceC1079k interfaceC1079k = (InterfaceC1079k) C1090w.this.f8063l.get(i4);
                if (interfaceC1079k == null) {
                    AbstractC1388b.b("PlatformViewsController", "Clearing focus on an unknown view with id: " + i4);
                    return;
                }
                view = interfaceC1079k.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            AbstractC1388b.b("PlatformViewsController", "Clearing focus on a null view with id: " + i4);
        }

        @Override // v2.s.e
        public void d(int i4) {
            InterfaceC1079k interfaceC1079k = (InterfaceC1079k) C1090w.this.f8063l.get(i4);
            if (interfaceC1079k == null) {
                AbstractC1388b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i4);
                return;
            }
            if (interfaceC1079k.getView() != null) {
                View view = interfaceC1079k.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            C1090w.this.f8063l.remove(i4);
            try {
                interfaceC1079k.a();
            } catch (RuntimeException e4) {
                AbstractC1388b.c("PlatformViewsController", "Disposing platform view threw an exception", e4);
            }
            if (C1090w.this.j(i4)) {
                b0 b0Var = (b0) C1090w.this.f8061j.get(Integer.valueOf(i4));
                View viewG = b0Var.g();
                if (viewG != null) {
                    C1090w.this.f8062k.remove(viewG.getContext());
                }
                b0Var.d();
                C1090w.this.f8061j.remove(Integer.valueOf(i4));
                return;
            }
            C1084p c1084p = (C1084p) C1090w.this.f8066o.get(i4);
            if (c1084p != null) {
                c1084p.removeAllViews();
                c1084p.a();
                c1084p.c();
                ViewGroup viewGroup2 = (ViewGroup) c1084p.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c1084p);
                }
                C1090w.this.f8066o.remove(i4);
                return;
            }
            C1513a c1513a = (C1513a) C1090w.this.f8064m.get(i4);
            if (c1513a != null) {
                c1513a.removeAllViews();
                c1513a.b();
                ViewGroup viewGroup3 = (ViewGroup) c1513a.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(c1513a);
                }
                C1090w.this.f8064m.remove(i4);
            }
        }

        @Override // v2.s.e
        public void e(s.d dVar, final s.b bVar) {
            int iW0 = C1090w.this.w0(dVar.f11721b);
            int iW02 = C1090w.this.w0(dVar.f11722c);
            int i4 = dVar.f11720a;
            if (C1090w.this.j(i4)) {
                final float fV = C1090w.this.V();
                final b0 b0Var = (b0) C1090w.this.f8061j.get(Integer.valueOf(i4));
                C1090w.this.a0(b0Var);
                b0Var.k(iW0, iW02, new Runnable() { // from class: io.flutter.plugin.platform.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1090w.a.h(this.f8045m, b0Var, fV, bVar);
                    }
                });
                return;
            }
            InterfaceC1079k interfaceC1079k = (InterfaceC1079k) C1090w.this.f8063l.get(i4);
            C1084p c1084p = (C1084p) C1090w.this.f8066o.get(i4);
            if (interfaceC1079k == null || c1084p == null) {
                AbstractC1388b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
                return;
            }
            if (iW0 > c1084p.getRenderTargetWidth() || iW02 > c1084p.getRenderTargetHeight()) {
                c1084p.b(iW0, iW02);
            }
            ViewGroup.LayoutParams layoutParams = c1084p.getLayoutParams();
            layoutParams.width = iW0;
            layoutParams.height = iW02;
            c1084p.setLayoutParams(layoutParams);
            View view = interfaceC1079k.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iW0;
                layoutParams2.height = iW02;
                view.setLayoutParams(layoutParams2);
            }
            bVar.a(new s.c(C1090w.this.t0(c1084p.getRenderTargetWidth()), C1090w.this.t0(c1084p.getRenderTargetHeight())));
        }

        @Override // v2.s.e
        public long f(v2.p pVar) {
            C1090w.this.T(pVar);
            int i4 = pVar.f11684a;
            if (C1090w.this.f8066o.get(i4) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i4);
            }
            C1090w c1090w = C1090w.this;
            if (c1090w.f8057f == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i4);
            }
            if (c1090w.f8055d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i4);
            }
            InterfaceC1079k interfaceC1079kM = C1090w.this.M(pVar, true);
            View view = interfaceC1079kM.getView();
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (I2.h.f(view, C1090w.f8049x)) {
                if (pVar.f11691h == p.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                    C1090w.this.H(interfaceC1079kM, pVar);
                    return -2L;
                }
                if (!C1090w.this.f8073v) {
                    return C1090w.this.J(interfaceC1079kM, pVar);
                }
            }
            return C1090w.this.I(interfaceC1079kM, pVar);
        }

        @Override // v2.s.e
        public void g(boolean z3) {
            C1090w.this.f8069r = z3;
        }

        @Override // v2.s.e
        public void i(int i4, double d4, double d5) {
            if (C1090w.this.j(i4)) {
                return;
            }
            C1084p c1084p = (C1084p) C1090w.this.f8066o.get(i4);
            if (c1084p == null) {
                AbstractC1388b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i4);
                return;
            }
            int iW0 = C1090w.this.w0(d4);
            int iW02 = C1090w.this.w0(d5);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1084p.getLayoutParams();
            layoutParams.topMargin = iW0;
            layoutParams.leftMargin = iW02;
            c1084p.setLayoutParams(layoutParams);
        }

        @Override // v2.s.e
        public void m(v2.p pVar) {
            C1090w.this.S(19);
            C1090w.this.T(pVar);
            C1090w.this.s0();
            C1090w.this.H(C1090w.this.M(pVar, false), pVar);
        }
    }

    private void R() {
        while (this.f8063l.size() > 0) {
            this.f8074w.d(this.f8063l.keyAt(0));
        }
    }

    public static /* synthetic */ void a(C1090w c1090w, v2.p pVar, View view, boolean z3) {
        if (z3) {
            c1090w.f8059h.d(pVar.f11684a);
            return;
        }
        io.flutter.plugin.editing.H h4 = c1090w.f8058g;
        if (h4 != null) {
            h4.l(pVar.f11684a);
        }
    }

    public static InterfaceC1083o b0(TextureRegistry textureRegistry) {
        int i4;
        if (f8051z && (i4 = Build.VERSION.SDK_INT) >= 29) {
            TextureRegistry.SurfaceProducer surfaceProducerC = textureRegistry.c(i4 <= 34 ? TextureRegistry.c.resetInBackground : TextureRegistry.c.manual);
            AbstractC1388b.e("PlatformViewsController", "PlatformView is using SurfaceProducer backend");
            return new Y(surfaceProducerC);
        }
        if (!f8050y || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntryB = textureRegistry.b();
            AbstractC1388b.e("PlatformViewsController", "PlatformView is using SurfaceTexture backend");
            return new a0(surfaceTextureEntryB);
        }
        TextureRegistry.ImageTextureEntry imageTextureEntryA = textureRegistry.a();
        AbstractC1388b.e("PlatformViewsController", "PlatformView is using ImageReader backend");
        return new C1070b(imageTextureEntryA);
    }

    public static /* synthetic */ void c(C1090w c1090w, v2.p pVar, View view, boolean z3) {
        if (z3) {
            c1090w.f8059h.d(pVar.f11684a);
        } else {
            c1090w.getClass();
        }
    }

    private void c0(InterfaceC1079k interfaceC1079k) {
        m2.B b4 = this.f8055d;
        if (b4 == null) {
            AbstractC1388b.e("PlatformViewsController", "null flutterView");
        } else {
            interfaceC1079k.c(b4);
        }
    }

    public static /* synthetic */ void d(C1090w c1090w, int i4, View view, boolean z3) {
        if (z3) {
            c1090w.f8059h.d(i4);
            return;
        }
        io.flutter.plugin.editing.H h4 = c1090w.f8058g;
        if (h4 != null) {
            h4.l(i4);
        }
    }

    private static MotionEvent.PointerCoords l0(Object obj, float f4) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d4 = f4;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d4);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d4);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d4);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d4);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d4);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d4);
        return pointerCoords;
    }

    private static List m0(Object obj, float f4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(l0(it.next(), f4));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties n0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List o0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(n0(it.next()));
        }
        return arrayList;
    }

    private static void x0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    public static boolean z0(int i4) {
        return i4 == 0 || i4 == 1;
    }

    public void C(Context context, TextureRegistry textureRegistry, C1472a c1472a) {
        if (this.f8054c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f8054c = context;
        this.f8057f = textureRegistry;
        this.f8059h = new v2.s(c1472a);
    }

    public void D(io.flutter.plugin.editing.H h4) {
        this.f8058g = h4;
    }

    public void E(FlutterRenderer flutterRenderer) {
        this.f8053b = new C1400c(flutterRenderer, true);
    }

    public void F(m2.B b4) {
        this.f8055d = b4;
        for (int i4 = 0; i4 < this.f8066o.size(); i4++) {
            this.f8055d.addView((C1084p) this.f8066o.valueAt(i4));
        }
        for (int i5 = 0; i5 < this.f8064m.size(); i5++) {
            this.f8055d.addView((C1513a) this.f8064m.valueAt(i5));
        }
        for (int i6 = 0; i6 < this.f8063l.size(); i6++) {
            ((InterfaceC1079k) this.f8063l.valueAt(i6)).c(this.f8055d);
        }
    }

    public boolean G(View view) {
        if (view == null || !this.f8062k.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) this.f8062k.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public final void H(InterfaceC1079k interfaceC1079k, v2.p pVar) {
        S(19);
        AbstractC1388b.e("PlatformViewsController", "Using hybrid composition for platform view: " + pVar.f11684a);
        s0();
    }

    public long I(InterfaceC1079k interfaceC1079k, final v2.p pVar) {
        C1084p c1084p;
        long j4;
        S(23);
        AbstractC1388b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + pVar.f11684a);
        int iW0 = w0(pVar.f11686c);
        int iW02 = w0(pVar.f11687d);
        if (this.f8073v) {
            c1084p = new C1084p(this.f8054c);
            j4 = -1;
        } else {
            InterfaceC1083o interfaceC1083oB0 = b0(this.f8057f);
            C1084p c1084p2 = new C1084p(this.f8054c, interfaceC1083oB0);
            long jA = interfaceC1083oB0.a();
            c1084p = c1084p2;
            j4 = jA;
        }
        c1084p.setTouchProcessor(this.f8053b);
        c1084p.b(iW0, iW02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iW0, iW02);
        int iW03 = w0(pVar.f11688e);
        int iW04 = w0(pVar.f11689f);
        layoutParams.topMargin = iW03;
        layoutParams.leftMargin = iW04;
        c1084p.setLayoutParams(layoutParams);
        View view = interfaceC1079k.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(iW0, iW02));
        view.setImportantForAccessibility(4);
        c1084p.addView(view);
        c1084p.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.t
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z3) {
                C1090w.a(this.f8041a, pVar, view2, z3);
            }
        });
        this.f8055d.addView(c1084p);
        this.f8066o.append(pVar.f11684a, c1084p);
        c0(interfaceC1079k);
        return j4;
    }

    public final long J(InterfaceC1079k interfaceC1079k, final v2.p pVar) {
        S(20);
        AbstractC1388b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + pVar.f11684a);
        InterfaceC1083o interfaceC1083oB0 = b0(this.f8057f);
        b0 b0VarB = b0.b(this.f8054c, this.f8060i, interfaceC1079k, interfaceC1083oB0, w0(pVar.f11686c), w0(pVar.f11687d), pVar.f11684a, null, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                C1090w.c(this.f8043a, pVar, view, z3);
            }
        });
        if (b0VarB != null) {
            this.f8061j.put(Integer.valueOf(pVar.f11684a), b0VarB);
            View view = interfaceC1079k.getView();
            this.f8062k.put(view.getContext(), view);
            return interfaceC1083oB0.a();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + pVar.f11685b + " with id: " + pVar.f11684a);
    }

    public FlutterOverlaySurface K() {
        return L(new C1071c(this.f8055d.getContext(), this.f8055d.getWidth(), this.f8055d.getHeight(), this.f8060i));
    }

    public FlutterOverlaySurface L(C1071c c1071c) {
        int i4 = this.f8067p;
        this.f8067p = i4 + 1;
        this.f8065n.put(i4, c1071c);
        return new FlutterOverlaySurface(i4, c1071c.getSurface());
    }

    public InterfaceC1079k M(v2.p pVar, boolean z3) {
        AbstractC1080l abstractC1080lB = this.f8052a.b(pVar.f11685b);
        if (abstractC1080lB == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + pVar.f11685b);
        }
        InterfaceC1079k interfaceC1079kA = abstractC1080lB.a(z3 ? new MutableContextWrapper(this.f8054c) : this.f8054c, pVar.f11684a, pVar.f11692i != null ? abstractC1080lB.b().b(pVar.f11692i) : null);
        View view = interfaceC1079kA.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(pVar.f11690g);
        this.f8063l.put(pVar.f11684a, interfaceC1079kA);
        c0(interfaceC1079kA);
        return interfaceC1079kA;
    }

    public void N() {
        for (int i4 = 0; i4 < this.f8065n.size(); i4++) {
            C1071c c1071c = (C1071c) this.f8065n.valueAt(i4);
            c1071c.a();
            c1071c.g();
        }
    }

    public void O() {
        v2.s sVar = this.f8059h;
        if (sVar != null) {
            sVar.e(null);
        }
        N();
        this.f8059h = null;
        this.f8054c = null;
        this.f8057f = null;
    }

    public void P() {
        for (int i4 = 0; i4 < this.f8066o.size(); i4++) {
            this.f8055d.removeView((C1084p) this.f8066o.valueAt(i4));
        }
        for (int i5 = 0; i5 < this.f8064m.size(); i5++) {
            this.f8055d.removeView((C1513a) this.f8064m.valueAt(i5));
        }
        N();
        p0();
        this.f8055d = null;
        this.f8068q = false;
        for (int i6 = 0; i6 < this.f8063l.size(); i6++) {
            ((InterfaceC1079k) this.f8063l.valueAt(i6)).d();
        }
    }

    public void Q() {
        this.f8058g = null;
    }

    public final void S(int i4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= i4) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i5 + ", required API level is: " + i4);
    }

    public final void T(v2.p pVar) {
        if (z0(pVar.f11690g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + pVar.f11690g + "(view id: " + pVar.f11684a + ")");
    }

    public final void U(boolean z3) {
        for (int i4 = 0; i4 < this.f8065n.size(); i4++) {
            int iKeyAt = this.f8065n.keyAt(i4);
            C1071c c1071c = (C1071c) this.f8065n.valueAt(i4);
            if (this.f8070s.contains(Integer.valueOf(iKeyAt))) {
                this.f8055d.l(c1071c);
                z3 &= c1071c.e();
            } else {
                if (!this.f8068q) {
                    c1071c.a();
                }
                c1071c.setVisibility(8);
                this.f8055d.removeView(c1071c);
            }
        }
        for (int i5 = 0; i5 < this.f8064m.size(); i5++) {
            int iKeyAt2 = this.f8064m.keyAt(i5);
            View view = (View) this.f8064m.get(iKeyAt2);
            if (!this.f8071t.contains(Integer.valueOf(iKeyAt2)) || (!z3 && this.f8069r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final float V() {
        return this.f8054c.getResources().getDisplayMetrics().density;
    }

    public v2.s W() {
        return this.f8059h;
    }

    public InterfaceC1081m X() {
        return this.f8052a;
    }

    public boolean Y(final int i4) {
        InterfaceC1079k interfaceC1079k = (InterfaceC1079k) this.f8063l.get(i4);
        if (interfaceC1079k == null) {
            return false;
        }
        if (this.f8064m.get(i4) != null) {
            return true;
        }
        View view = interfaceC1079k.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f8054c;
        C1513a c1513a = new C1513a(context, context.getResources().getDisplayMetrics().density, this.f8053b);
        c1513a.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.r
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z3) {
                C1090w.d(this.f8038a, i4, view2, z3);
            }
        });
        this.f8064m.put(i4, c1513a);
        view.setImportantForAccessibility(4);
        c1513a.addView(view);
        this.f8055d.addView(c1513a);
        return true;
    }

    public final void Z() {
        if (!this.f8069r || this.f8068q) {
            return;
        }
        this.f8055d.o();
        this.f8068q = true;
    }

    public final void a0(b0 b0Var) {
        io.flutter.plugin.editing.H h4 = this.f8058g;
        if (h4 == null) {
            return;
        }
        h4.u();
        b0Var.h();
    }

    public void d0() {
        this.f8070s.clear();
        this.f8071t.clear();
    }

    public void e0() {
        R();
    }

    public void f0(int i4, int i5, int i6, int i7, int i8) {
        if (this.f8065n.get(i4) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i4 + ") doesn't exist");
        }
        Z();
        View view = (C1071c) this.f8065n.get(i4);
        if (view.getParent() == null) {
            this.f8055d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        this.f8070s.add(Integer.valueOf(i4));
    }

    public void g0(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        Z();
        if (Y(i4)) {
            C1513a c1513a = (C1513a) this.f8064m.get(i4);
            c1513a.a(flutterMutatorsStack, i5, i6, i7, i8);
            c1513a.setVisibility(0);
            c1513a.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
            View view = ((InterfaceC1079k) this.f8063l.get(i4)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams);
                view.bringToFront();
            }
            this.f8071t.add(Integer.valueOf(i4));
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public void h(io.flutter.view.h hVar) {
        this.f8060i.c(hVar);
    }

    public void h0() {
        boolean z3 = false;
        if (this.f8068q && this.f8071t.isEmpty()) {
            this.f8068q = false;
            this.f8055d.y(new Runnable() { // from class: io.flutter.plugin.platform.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8040m.U(false);
                }
            });
        } else {
            if (this.f8068q && this.f8055d.j()) {
                z3 = true;
            }
            U(z3);
        }
    }

    public void i0() {
        R();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public boolean j(int i4) {
        return this.f8061j.containsKey(Integer.valueOf(i4));
    }

    public void j0() {
        Iterator it = this.f8061j.values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).j();
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public View k(int i4) {
        if (j(i4)) {
            return ((b0) this.f8061j.get(Integer.valueOf(i4))).g();
        }
        InterfaceC1079k interfaceC1079k = (InterfaceC1079k) this.f8063l.get(i4);
        if (interfaceC1079k == null) {
            return null;
        }
        return interfaceC1079k.getView();
    }

    public void k0(int i4) {
        if (i4 < 40) {
            return;
        }
        Iterator it = this.f8061j.values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).a();
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public void l() {
        this.f8060i.c(null);
    }

    public final void p0() {
        if (this.f8055d == null) {
            AbstractC1388b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i4 = 0; i4 < this.f8065n.size(); i4++) {
            this.f8055d.removeView((View) this.f8065n.valueAt(i4));
        }
        this.f8065n.clear();
    }

    public void q0(FlutterJNI flutterJNI) {
        this.f8056e = flutterJNI;
    }

    public void r0(boolean z3) {
        this.f8073v = z3;
    }

    public final void s0() {
        if (this.f8056e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    public final int t0(double d4) {
        return u0(d4, V());
    }

    public final int u0(double d4, float f4) {
        return (int) Math.round(d4 / ((double) f4));
    }

    public MotionEvent v0(float f4, v2.q qVar, boolean z3) {
        MotionEvent motionEventB = this.f8072u.b(N.a.c(qVar.f11712p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) m0(qVar.f11703g, f4).toArray(new MotionEvent.PointerCoords[qVar.f11701e]);
        if (z3 || motionEventB == null) {
            return MotionEvent.obtain(qVar.f11698b.longValue(), qVar.f11699c.longValue(), qVar.f11700d, qVar.f11701e, (MotionEvent.PointerProperties[]) o0(qVar.f11702f).toArray(new MotionEvent.PointerProperties[qVar.f11701e]), pointerCoordsArr, qVar.f11704h, qVar.f11705i, qVar.f11706j, qVar.f11707k, qVar.f11708l, qVar.f11709m, qVar.f11710n, qVar.f11711o);
        }
        x0(motionEventB, pointerCoordsArr);
        return motionEventB;
    }

    public final int w0(double d4) {
        return (int) Math.round(d4 * ((double) V()));
    }

    public final void y0(b0 b0Var) {
        io.flutter.plugin.editing.H h4 = this.f8058g;
        if (h4 == null) {
            return;
        }
        h4.G();
        b0Var.i();
    }
}
