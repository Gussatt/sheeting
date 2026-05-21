package m2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import androidx.lifecycle.AbstractC0609f;
import io.flutter.embedding.engine.b;
import io.flutter.plugin.platform.C1077i;
import java.util.Arrays;
import java.util.List;
import l2.AbstractC1388b;
import l2.C1387a;
import n2.C1450a;
import n2.C1452c;
import o2.C1472a;

/* JADX INFO: renamed from: m2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1407j implements InterfaceC1401d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f10470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.a f10471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B f10472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1077i f10473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A2.c f10474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f10475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f10480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public io.flutter.embedding.engine.b f10481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.m f10482m;

    /* JADX INFO: renamed from: m2.j$a */
    public class a implements io.flutter.embedding.engine.renderer.m {
        public a() {
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void c() {
            C1407j.this.f10470a.c();
            C1407j.this.f10477h = false;
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void f() {
            C1407j.this.f10470a.f();
            C1407j.this.f10477h = true;
            C1407j.this.f10478i = true;
        }
    }

    /* JADX INFO: renamed from: m2.j$b */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ B f10484b;

        public b(B b4) {
            this.f10484b = b4;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (C1407j.this.f10477h && C1407j.this.f10475f != null) {
                this.f10484b.getViewTreeObserver().removeOnPreDrawListener(this);
                C1407j.this.f10475f = null;
            }
            return C1407j.this.f10477h;
        }
    }

    /* JADX INFO: renamed from: m2.j$c */
    public interface c extends C1077i.d {
        n2.k A();

        O B();

        boolean C();

        void D(C1415s c1415s);

        io.flutter.embedding.engine.a E(Context context);

        boolean F();

        Q G();

        void H(io.flutter.embedding.engine.a aVar);

        Context b();

        void c();

        Activity d();

        void e();

        void f();

        AbstractC0609f h();

        String i();

        String j();

        List m();

        boolean n();

        boolean o();

        boolean p();

        String q();

        boolean r();

        String s();

        void t(io.flutter.embedding.engine.a aVar);

        String u();

        C1077i v(Activity activity, io.flutter.embedding.engine.a aVar);

        String w();

        boolean x();

        void y(t tVar);

        A2.c z(Activity activity, io.flutter.embedding.engine.a aVar);
    }

    public C1407j(c cVar) {
        this(cVar, null);
    }

    public void A(int i4, String[] strArr, int[] iArr) {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i4 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f10471b.j().c(i4, strArr, iArr);
    }

    public void B(Bundle bundle) {
        Bundle bundle2;
        byte[] byteArray;
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        l();
        if (bundle != null) {
            bundle2 = bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            byteArray = null;
        }
        if (this.f10470a.r()) {
            this.f10471b.x().j(byteArray);
        }
        if (this.f10470a.n()) {
            this.f10471b.j().f(bundle2);
        }
    }

    public void C() {
        io.flutter.embedding.engine.a aVar;
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        l();
        this.f10471b.w().v();
        if (!this.f10470a.p() || (aVar = this.f10471b) == null) {
            return;
        }
        aVar.m().e();
    }

    public void D(Bundle bundle) {
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        l();
        if (this.f10470a.r()) {
            bundle.putByteArray("framework", this.f10471b.x().h());
        }
        if (this.f10470a.n()) {
            Bundle bundle2 = new Bundle();
            this.f10471b.j().i(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
        if (this.f10470a.q() == null || this.f10470a.o()) {
            return;
        }
        bundle.putBoolean("enableOnBackInvokedCallbackState", this.f10470a.F());
    }

    public void E() {
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        l();
        k();
        Integer num = this.f10480k;
        if (num != null) {
            this.f10472c.setVisibility(num.intValue());
        }
    }

    public void F() {
        io.flutter.embedding.engine.a aVar;
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        l();
        if (this.f10470a.p() && (aVar = this.f10471b) != null) {
            aVar.m().d();
        }
        this.f10480k = Integer.valueOf(this.f10472c.getVisibility());
        this.f10472c.setVisibility(8);
        io.flutter.embedding.engine.a aVar2 = this.f10471b;
        if (aVar2 != null) {
            aVar2.w().o(40);
        }
    }

    public void G(int i4) {
        l();
        io.flutter.embedding.engine.a aVar = this.f10471b;
        if (aVar != null) {
            if (this.f10478i && i4 >= 10) {
                aVar.l().k();
                this.f10471b.C().a();
            }
            this.f10471b.w().o(i4);
            this.f10471b.r().k0(i4);
        }
    }

    public void H() {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f10471b.j().j();
        }
    }

    public void I(boolean z3) {
        io.flutter.embedding.engine.a aVar;
        l();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z3 ? "true" : "false");
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (!this.f10470a.p() || (aVar = this.f10471b) == null) {
            return;
        }
        if (z3) {
            aVar.m().a();
        } else {
            aVar.m().f();
        }
    }

    public void J() {
        this.f10470a = null;
        this.f10471b = null;
        this.f10472c = null;
        this.f10473d = null;
        this.f10474e = null;
    }

    public void K() {
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String strQ = this.f10470a.q();
        if (strQ != null) {
            io.flutter.embedding.engine.a aVarA = C1450a.b().a(strQ);
            this.f10471b = aVarA;
            this.f10476g = true;
            if (aVarA != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + strQ + "'");
        }
        c cVar = this.f10470a;
        io.flutter.embedding.engine.a aVarE = cVar.E(cVar.b());
        this.f10471b = aVarE;
        if (aVarE != null) {
            this.f10476g = true;
            return;
        }
        String strI = this.f10470a.i();
        if (strI == null) {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            io.flutter.embedding.engine.b bVar = this.f10481l;
            if (bVar == null) {
                bVar = new io.flutter.embedding.engine.b(this.f10470a.b(), this.f10470a.A().b());
            }
            this.f10471b = bVar.a(g(new b.C0128b(this.f10470a.b()).h(false).l(this.f10470a.r())));
            this.f10476g = false;
            return;
        }
        io.flutter.embedding.engine.b bVarA = C1452c.b().a(strI);
        if (bVarA != null) {
            this.f10471b = bVarA.a(g(new b.C0128b(this.f10470a.b())));
            this.f10476g = false;
        } else {
            throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + strI + "'");
        }
    }

    public void L(BackEvent backEvent) {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.f10471b.k().d(backEvent);
        }
    }

    public void M(BackEvent backEvent) {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.f10471b.k().e(backEvent);
        }
    }

    public void N() {
        C1077i c1077i = this.f10473d;
        if (c1077i != null) {
            c1077i.E();
        }
    }

    @Override // m2.InterfaceC1401d
    public void e() {
        if (!this.f10470a.o()) {
            this.f10470a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f10470a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final b.C0128b g(b.C0128b c0128b) {
        String strW = this.f10470a.w();
        if (strW == null || strW.isEmpty()) {
            strW = C1387a.e().c().g();
        }
        C1472a.b bVar = new C1472a.b(strW, this.f10470a.s());
        String strJ = this.f10470a.j();
        if (strJ == null && (strJ = q(this.f10470a.d().getIntent())) == null) {
            strJ = "/";
        }
        return c0128b.i(bVar).k(strJ).j(this.f10470a.m());
    }

    public void h() {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
            this.f10471b.k().b();
        }
    }

    public void i() {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
            this.f10471b.k().c();
        }
    }

    public final void j(B b4) {
        if (this.f10470a.B() != O.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f10475f != null) {
            b4.getViewTreeObserver().removeOnPreDrawListener(this.f10475f);
        }
        this.f10475f = new b(b4);
        b4.getViewTreeObserver().addOnPreDrawListener(this.f10475f);
    }

    public final void k() {
        String str;
        if (this.f10470a.q() == null && !this.f10471b.l().j()) {
            String strJ = this.f10470a.j();
            if (strJ == null && (strJ = q(this.f10470a.d().getIntent())) == null) {
                strJ = "/";
            }
            String strU = this.f10470a.u();
            if (("Executing Dart entrypoint: " + this.f10470a.s() + ", library uri: " + strU) == null) {
                str = "\"\"";
            } else {
                str = strU + ", and sending initial route: " + strJ;
            }
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", str);
            this.f10471b.p().c(strJ);
            String strW = this.f10470a.w();
            if (strW == null || strW.isEmpty()) {
                strW = C1387a.e().c().g();
            }
            this.f10471b.l().i(strU == null ? new C1472a.b(strW, this.f10470a.s()) : new C1472a.b(strW, strU, this.f10470a.s()), this.f10470a.m());
        }
    }

    public final void l() {
        if (this.f10470a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    @Override // m2.InterfaceC1401d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Activity f() {
        Activity activityD = this.f10470a.d();
        if (activityD != null) {
            return activityD;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    public io.flutter.embedding.engine.a n() {
        return this.f10471b;
    }

    public boolean o() {
        return this.f10479j;
    }

    public boolean p() {
        return this.f10476g;
    }

    public final String q(Intent intent) {
        Uri data;
        if (!this.f10470a.x() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public void r(int i4, int i5, Intent intent) {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i4 + "\nresultCode: " + i5 + "\ndata: " + intent);
        this.f10471b.j().a(i4, i5, intent);
    }

    public void s(Context context) {
        l();
        if (this.f10471b == null) {
            K();
        }
        if (this.f10470a.n()) {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f10471b.j().h(this, this.f10470a.h());
        }
        Activity activityD = this.f10470a.d();
        this.f10473d = this.f10470a.v(activityD, this.f10471b);
        this.f10474e = this.f10470a.z(activityD, this.f10471b);
        this.f10470a.H(this.f10471b);
        this.f10479j = true;
    }

    public void t() {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f10471b.p().a();
        }
    }

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i4, boolean z3) {
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        l();
        if (this.f10470a.B() == O.surface) {
            C1415s c1415s = new C1415s(this.f10470a.b(), this.f10470a.G() == Q.transparent);
            this.f10470a.D(c1415s);
            this.f10472c = new B(this.f10470a.b(), c1415s);
        } else {
            t tVar = new t(this.f10470a.b());
            tVar.setOpaque(this.f10470a.G() == Q.opaque);
            this.f10470a.y(tVar);
            this.f10472c = new B(this.f10470a.b(), tVar);
        }
        this.f10472c.k(this.f10482m);
        if (this.f10470a.C()) {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f10472c.m(this.f10471b);
        }
        this.f10472c.setId(i4);
        if (z3) {
            j(this.f10472c);
        }
        return this.f10472c;
    }

    public void v() {
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        l();
        if (this.f10475f != null) {
            this.f10472c.getViewTreeObserver().removeOnPreDrawListener(this.f10475f);
            this.f10475f = null;
        }
        B b4 = this.f10472c;
        if (b4 != null) {
            b4.r();
            this.f10472c.w(this.f10482m);
        }
    }

    public void w() {
        io.flutter.embedding.engine.a aVar;
        if (this.f10479j) {
            AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
            l();
            this.f10470a.t(this.f10471b);
            if (this.f10470a.n()) {
                AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f10470a.d().isChangingConfigurations()) {
                    this.f10471b.j().e();
                } else {
                    this.f10471b.j().g();
                }
            }
            C1077i c1077i = this.f10473d;
            if (c1077i != null) {
                c1077i.q();
                this.f10473d = null;
            }
            A2.c cVar = this.f10474e;
            if (cVar != null) {
                cVar.d();
                this.f10474e = null;
            }
            if (this.f10470a.p() && (aVar = this.f10471b) != null) {
                aVar.m().b();
            }
            if (this.f10470a.o()) {
                this.f10471b.h();
                if (this.f10470a.q() != null) {
                    C1450a.b().d(this.f10470a.q());
                }
                this.f10471b = null;
            }
            this.f10479j = false;
        }
    }

    public void x(Intent intent) {
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f10471b.j().b(intent);
        String strQ = q(intent);
        if (strQ == null || strQ.isEmpty()) {
            return;
        }
        this.f10471b.p().b(strQ);
    }

    public void y() {
        io.flutter.embedding.engine.a aVar;
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        l();
        if (!this.f10470a.p() || (aVar = this.f10471b) == null) {
            return;
        }
        aVar.m().c();
    }

    public void z() {
        AbstractC1388b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        l();
        if (this.f10471b == null) {
            AbstractC1388b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            N();
            this.f10471b.r().j0();
        }
    }

    public C1407j(c cVar, io.flutter.embedding.engine.b bVar) {
        this.f10482m = new a();
        this.f10470a = cVar;
        this.f10478i = false;
        this.f10481l = bVar;
    }
}
