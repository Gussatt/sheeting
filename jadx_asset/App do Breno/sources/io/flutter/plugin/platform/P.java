package io.flutter.plugin.platform;

import android.content.Context;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l2.AbstractC1388b;
import m2.C1400c;
import m2.N;
import o2.C1472a;
import r2.C1513a;
import v2.t;

/* JADX INFO: loaded from: classes.dex */
public class P implements InterfaceC1085q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1082n f7947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1400c f7948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f7949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m2.B f7950d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.H f7952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v2.t f7953g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f7951e = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Surface f7960n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceControl f7961o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t.b f7962p = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1069a f7954h = new C1069a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f7955i = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f7956j = new SparseArray();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f7958l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f7959m = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m2.N f7957k = m2.N.a();

    public class a implements t.b {
        public a() {
        }

        @Override // v2.t.b
        public void a(int i4, int i5) {
            InterfaceC1079k interfaceC1079k = (InterfaceC1079k) P.this.f7955i.get(i4);
            if (interfaceC1079k == null) {
                AbstractC1388b.b("PlatformViewsController2", "Setting direction to an unknown view with id: " + i4);
                return;
            }
            View view = interfaceC1079k.getView();
            if (view != null) {
                view.setLayoutDirection(i5);
                return;
            }
            AbstractC1388b.b("PlatformViewsController2", "Setting direction to a null view with id: " + i4);
        }

        @Override // v2.t.b
        public void b(v2.q qVar) {
            int i4 = qVar.f11697a;
            float f4 = P.this.f7949c.getResources().getDisplayMetrics().density;
            InterfaceC1079k interfaceC1079k = (InterfaceC1079k) P.this.f7955i.get(i4);
            if (interfaceC1079k == null) {
                AbstractC1388b.b("PlatformViewsController2", "Sending touch to an unknown view with id: " + i4);
                return;
            }
            View view = interfaceC1079k.getView();
            if (view != null) {
                view.dispatchTouchEvent(P.this.L(f4, qVar));
                return;
            }
            AbstractC1388b.b("PlatformViewsController2", "Sending touch to a null view with id: " + i4);
        }

        @Override // v2.t.b
        public void c(int i4) {
            InterfaceC1079k interfaceC1079k = (InterfaceC1079k) P.this.f7955i.get(i4);
            if (interfaceC1079k == null) {
                AbstractC1388b.b("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i4);
                return;
            }
            View view = interfaceC1079k.getView();
            if (view != null) {
                view.clearFocus();
                return;
            }
            AbstractC1388b.b("PlatformViewsController2", "Clearing focus on a null view with id: " + i4);
        }

        @Override // v2.t.b
        public void d(int i4) {
            InterfaceC1079k interfaceC1079k = (InterfaceC1079k) P.this.f7955i.get(i4);
            if (interfaceC1079k == null) {
                AbstractC1388b.b("PlatformViewsController2", "Disposing unknown platform view with id: " + i4);
                return;
            }
            if (interfaceC1079k.getView() != null) {
                View view = interfaceC1079k.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            P.this.f7955i.remove(i4);
            try {
                interfaceC1079k.a();
            } catch (RuntimeException e4) {
                AbstractC1388b.c("PlatformViewsController2", "Disposing platform view threw an exception", e4);
            }
            C1513a c1513a = (C1513a) P.this.f7956j.get(i4);
            if (c1513a != null) {
                c1513a.removeAllViews();
                c1513a.b();
                ViewGroup viewGroup2 = (ViewGroup) c1513a.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c1513a);
                }
                P.this.f7956j.remove(i4);
            }
        }

        @Override // v2.t.b
        public void e(v2.p pVar) {
            P.this.n(pVar);
        }

        @Override // v2.t.b
        public boolean f() {
            return P.this.x();
        }
    }

    public static MotionEvent.PointerCoords D(Object obj, float f4) {
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

    public static List E(Object obj, float f4) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(D(it.next(), f4));
        }
        return arrayList;
    }

    public static MotionEvent.PointerProperties F(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    public static List G(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(F(it.next()));
        }
        return arrayList;
    }

    public static void M(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    public static /* synthetic */ void a(P p4, int i4, View view, boolean z3) {
        if (z3) {
            p4.f7953g.d(i4);
            return;
        }
        io.flutter.plugin.editing.H h4 = p4.f7952f;
        if (h4 != null) {
            h4.l(i4);
        }
    }

    public void A(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        if (w(i4)) {
            C1513a c1513a = (C1513a) this.f7956j.get(i4);
            c1513a.a(flutterMutatorsStack, i5, i6, i7, i8);
            c1513a.setVisibility(0);
            c1513a.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
            View view = ((InterfaceC1079k) this.f7955i.get(i4)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams);
                view.bringToFront();
            }
        }
    }

    public void B() {
        SurfaceControl.Transaction transactionA = C.a();
        for (int i4 = 0; i4 < this.f7959m.size(); i4++) {
            transactionA = transactionA.merge(G.a(this.f7959m.get(i4)));
        }
        this.f7959m.clear();
        this.f7950d.invalidate();
        this.f7950d.getRootSurfaceControl().applyTransactionOnDraw(transactionA);
    }

    public void C() {
        u();
    }

    public void H(FlutterJNI flutterJNI) {
        this.f7951e = flutterJNI;
    }

    public void I(InterfaceC1081m interfaceC1081m) {
        this.f7947a = (C1082n) interfaceC1081m;
    }

    public void J() {
        if (this.f7961o == null) {
            return;
        }
        SurfaceControl.Transaction transactionA = C.a();
        transactionA.setVisibility(this.f7961o, true);
        transactionA.apply();
    }

    public synchronized void K() {
        try {
            this.f7959m.clear();
            for (int i4 = 0; i4 < this.f7958l.size(); i4++) {
                this.f7959m.add(G.a(this.f7958l.get(i4)));
            }
            this.f7958l.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public MotionEvent L(float f4, v2.q qVar) {
        MotionEvent motionEventB = this.f7957k.b(N.a.c(qVar.f11712p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) E(qVar.f11703g, f4).toArray(new MotionEvent.PointerCoords[qVar.f11701e]);
        if (motionEventB != null) {
            M(motionEventB, pointerCoordsArr);
            return motionEventB;
        }
        return MotionEvent.obtain(qVar.f11698b.longValue(), qVar.f11699c.longValue(), qVar.f11700d, qVar.f11701e, (MotionEvent.PointerProperties[]) G(qVar.f11702f).toArray(new MotionEvent.PointerProperties[qVar.f11701e]), pointerCoordsArr, qVar.f11704h, qVar.f11705i, qVar.f11706j, qVar.f11707k, qVar.f11708l, qVar.f11709m, qVar.f11710n, qVar.f11711o);
    }

    public void e() {
        SurfaceControl.Transaction transactionA = C.a();
        for (int i4 = 0; i4 < this.f7958l.size(); i4++) {
            transactionA = transactionA.merge(G.a(this.f7958l.get(i4)));
        }
        transactionA.apply();
        this.f7958l.clear();
    }

    public void f(Context context, C1472a c1472a) {
        if (this.f7949c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f7949c = context;
        v2.t tVar = new v2.t(c1472a);
        this.f7953g = tVar;
        tVar.e(this.f7962p);
    }

    public void g(io.flutter.plugin.editing.H h4) {
        this.f7952f = h4;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public void h(io.flutter.view.h hVar) {
        this.f7954h.c(hVar);
    }

    public void i(FlutterRenderer flutterRenderer) {
        this.f7948b = new C1400c(flutterRenderer, true);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public boolean j(int i4) {
        return false;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public View k(int i4) {
        InterfaceC1079k interfaceC1079k = (InterfaceC1079k) this.f7955i.get(i4);
        if (interfaceC1079k == null) {
            return null;
        }
        return interfaceC1079k.getView();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public void l() {
        this.f7954h.c(null);
    }

    public void m(m2.B b4) {
        this.f7950d = b4;
        for (int i4 = 0; i4 < this.f7956j.size(); i4++) {
            this.f7950d.addView((C1513a) this.f7956j.valueAt(i4));
        }
        for (int i5 = 0; i5 < this.f7955i.size(); i5++) {
            ((InterfaceC1079k) this.f7955i.valueAt(i5)).c(this.f7950d);
        }
    }

    public InterfaceC1079k n(v2.p pVar) {
        AbstractC1080l abstractC1080lB = this.f7947a.b(pVar.f11685b);
        if (abstractC1080lB == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + pVar.f11685b);
        }
        InterfaceC1079k interfaceC1079kA = abstractC1080lB.a(this.f7949c, pVar.f11684a, pVar.f11692i != null ? abstractC1080lB.b().b(pVar.f11692i) : null);
        View view = interfaceC1079kA.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(pVar.f11690g);
        this.f7955i.put(pVar.f11684a, interfaceC1079kA);
        y(interfaceC1079kA);
        return interfaceC1079kA;
    }

    public FlutterOverlaySurface o() {
        if (this.f7960n == null) {
            SurfaceControl.Builder builderA = D.a();
            builderA.setBufferSize(this.f7950d.getWidth(), this.f7950d.getHeight());
            builderA.setFormat(1);
            builderA.setName("Flutter Overlay Surface");
            builderA.setOpaque(false);
            builderA.setHidden(false);
            SurfaceControl surfaceControlBuild = builderA.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = this.f7950d.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            this.f7960n = E.a(surfaceControlBuild);
            this.f7961o = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, this.f7960n);
    }

    public SurfaceControl.Transaction p() {
        SurfaceControl.Transaction transactionA = C.a();
        this.f7958l.add(transactionA);
        return transactionA;
    }

    public void q() {
        Surface surface = this.f7960n;
        if (surface != null) {
            surface.release();
            this.f7960n = null;
            this.f7961o = null;
        }
    }

    public void r() {
        v2.t tVar = this.f7953g;
        if (tVar != null) {
            tVar.e(null);
        }
        q();
        this.f7953g = null;
        this.f7949c = null;
    }

    public void s() {
        for (int i4 = 0; i4 < this.f7956j.size(); i4++) {
            this.f7950d.removeView((C1513a) this.f7956j.valueAt(i4));
        }
        q();
        this.f7950d = null;
        for (int i5 = 0; i5 < this.f7955i.size(); i5++) {
            ((InterfaceC1079k) this.f7955i.valueAt(i5)).d();
        }
    }

    public void t() {
        this.f7952f = null;
    }

    public final void u() {
        while (this.f7955i.size() > 0) {
            this.f7962p.d(this.f7955i.keyAt(0));
        }
    }

    public void v() {
        if (this.f7961o == null) {
            return;
        }
        SurfaceControl.Transaction transactionA = C.a();
        transactionA.setVisibility(this.f7961o, false);
        transactionA.apply();
    }

    public boolean w(final int i4) {
        InterfaceC1079k interfaceC1079k = (InterfaceC1079k) this.f7955i.get(i4);
        if (interfaceC1079k == null) {
            return false;
        }
        if (this.f7956j.get(i4) != null) {
            return true;
        }
        View view = interfaceC1079k.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f7949c;
        C1513a c1513a = new C1513a(context, context.getResources().getDisplayMetrics().density, this.f7948b);
        c1513a.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.O
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z3) {
                P.a(this.f7945a, i4, view2, z3);
            }
        });
        this.f7956j.put(i4, c1513a);
        view.setImportantForAccessibility(4);
        c1513a.addView(view);
        this.f7950d.addView(c1513a);
        return true;
    }

    public boolean x() {
        FlutterJNI flutterJNI = this.f7951e;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    public final void y(InterfaceC1079k interfaceC1079k) {
        m2.B b4 = this.f7950d;
        if (b4 == null) {
            AbstractC1388b.e("PlatformViewsController2", "null flutterView");
        } else {
            interfaceC1079k.c(b4);
        }
    }

    public void z() {
        u();
    }
}
