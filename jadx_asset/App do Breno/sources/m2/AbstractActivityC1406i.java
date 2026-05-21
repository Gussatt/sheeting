package m2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.AbstractC0609f;
import io.flutter.plugin.platform.C1077i;
import java.util.List;
import l2.AbstractC1388b;
import m2.AbstractC1408k;
import m2.C1407j;
import u2.AbstractC1581a;

/* JADX INFO: renamed from: m2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1406i extends Activity implements C1407j.c, androidx.lifecycle.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10464f = View.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10465b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1407j f10466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.k f10467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f10468e;

    /* JADX INFO: renamed from: m2.i$a */
    public class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            AbstractActivityC1406i.this.I();
        }

        public void onBackInvoked() {
            AbstractActivityC1406i.this.J();
        }

        public void onBackProgressed(BackEvent backEvent) {
            AbstractActivityC1406i.this.Y(backEvent);
        }

        public void onBackStarted(BackEvent backEvent) {
            AbstractActivityC1406i.this.U(backEvent);
        }
    }

    public AbstractActivityC1406i() {
        this.f10468e = Build.VERSION.SDK_INT < 33 ? null : N();
        this.f10467d = new androidx.lifecycle.k(this);
    }

    @Override // m2.C1407j.c
    public n2.k A() {
        return n2.k.a(getIntent());
    }

    @Override // m2.C1407j.c
    public O B() {
        return O() == AbstractC1408k.a.opaque ? O.surface : O.texture;
    }

    @Override // m2.C1407j.c
    public boolean C() {
        return true;
    }

    @Override // m2.C1407j.c
    public io.flutter.embedding.engine.a E(Context context) {
        return null;
    }

    @Override // m2.C1407j.c
    public boolean F() {
        return this.f10465b;
    }

    @Override // m2.C1407j.c
    public Q G() {
        return O() == AbstractC1408k.a.opaque ? Q.opaque : Q.transparent;
    }

    @Override // m2.C1407j.c
    public void H(io.flutter.embedding.engine.a aVar) {
        if (this.f10466c.p()) {
            return;
        }
        AbstractC1581a.a(aVar);
    }

    public void I() {
        if (V("cancelBackGesture")) {
            this.f10466c.h();
        }
    }

    public void J() {
        if (V("commitBackGesture")) {
            this.f10466c.i();
        }
    }

    public final void K() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT < 35) {
            window.setStatusBarColor(1073741824);
        }
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public final void L() {
        if (O() == AbstractC1408k.a.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final View M() {
        return this.f10466c.u(null, null, null, f10464f, B() == O.surface);
    }

    public final OnBackInvokedCallback N() {
        return Build.VERSION.SDK_INT >= 34 ? new a() : new OnBackInvokedCallback() { // from class: m2.h
            public final void onBackInvoked() {
                this.f10463a.onBackPressed();
            }
        };
    }

    public AbstractC1408k.a O() {
        return getIntent().hasExtra("background_mode") ? AbstractC1408k.a.valueOf(getIntent().getStringExtra("background_mode")) : AbstractC1408k.a.opaque;
    }

    public io.flutter.embedding.engine.a P() {
        return this.f10466c.n();
    }

    public Bundle Q() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final boolean R() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    public void S() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f10468e);
            this.f10465b = true;
        }
    }

    public void T() {
        X();
        C1407j c1407j = this.f10466c;
        if (c1407j != null) {
            c1407j.J();
            this.f10466c = null;
        }
    }

    public void U(BackEvent backEvent) {
        if (V("startBackGesture")) {
            this.f10466c.L(backEvent);
        }
    }

    public final boolean V(String str) {
        C1407j c1407j = this.f10466c;
        if (c1407j == null) {
            AbstractC1388b.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c1407j.o()) {
            return true;
        }
        AbstractC1388b.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    public final void W() {
        try {
            Bundle bundleQ = Q();
            if (bundleQ == null) {
                AbstractC1388b.f("FlutterActivity", "Using the launch theme as normal theme.");
                return;
            }
            int i4 = bundleQ.getInt("io.flutter.embedding.android.NormalTheme", -1);
            if (i4 != -1) {
                setTheme(i4);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC1388b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public void X() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f10468e);
            this.f10465b = false;
        }
    }

    public void Y(BackEvent backEvent) {
        if (V("updateBackGestureProgress")) {
            this.f10466c.M(backEvent);
        }
    }

    @Override // io.flutter.plugin.platform.C1077i.d
    public boolean a() {
        return false;
    }

    @Override // m2.C1407j.c
    public void e() {
        AbstractC1388b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + P() + " evicted by another attaching activity");
        C1407j c1407j = this.f10466c;
        if (c1407j != null) {
            c1407j.v();
            this.f10466c.w();
        }
    }

    @Override // m2.C1407j.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.plugin.platform.C1077i.d
    public void g(boolean z3) {
        if (z3 && !this.f10465b) {
            S();
        } else {
            if (z3 || !this.f10465b) {
                return;
            }
            X();
        }
    }

    @Override // m2.C1407j.c, androidx.lifecycle.j
    public AbstractC0609f h() {
        return this.f10467d;
    }

    @Override // m2.C1407j.c
    public String i() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // m2.C1407j.c
    public String j() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleQ = Q();
            if (bundleQ != null) {
                return bundleQ.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // m2.C1407j.c
    public List m() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // m2.C1407j.c
    public boolean n() {
        return true;
    }

    @Override // m2.C1407j.c
    public boolean o() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (q() != null || this.f10466c.p()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (V("onActivityResult")) {
            this.f10466c.r(i4, i5, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (V("onBackPressed")) {
            this.f10466c.t();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        W();
        super.onCreate(bundle);
        if (bundle != null) {
            g(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C1407j c1407j = new C1407j(this);
        this.f10466c = c1407j;
        c1407j.s(this);
        this.f10466c.B(bundle);
        this.f10467d.h(AbstractC0609f.a.ON_CREATE);
        L();
        setContentView(M());
        K();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (V("onDestroy")) {
            this.f10466c.v();
            this.f10466c.w();
        }
        T();
        this.f10467d.h(AbstractC0609f.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (V("onNewIntent")) {
            this.f10466c.x(intent);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (V("onPause")) {
            this.f10466c.y();
        }
        this.f10467d.h(AbstractC0609f.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (V("onPostResume")) {
            this.f10466c.z();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (V("onRequestPermissionsResult")) {
            this.f10466c.A(i4, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f10467d.h(AbstractC0609f.a.ON_RESUME);
        if (V("onResume")) {
            this.f10466c.C();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (V("onSaveInstanceState")) {
            this.f10466c.D(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f10467d.h(AbstractC0609f.a.ON_START);
        if (V("onStart")) {
            this.f10466c.E();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (V("onStop")) {
            this.f10466c.F();
        }
        this.f10467d.h(AbstractC0609f.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        if (V("onTrimMemory")) {
            this.f10466c.G(i4);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (V("onUserLeaveHint")) {
            this.f10466c.H();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (V("onWindowFocusChanged")) {
            this.f10466c.I(z3);
        }
    }

    @Override // m2.C1407j.c
    public boolean p() {
        return true;
    }

    @Override // m2.C1407j.c
    public String q() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // m2.C1407j.c
    public boolean r() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : q() == null;
    }

    @Override // m2.C1407j.c
    public String s() {
        String string;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundleQ = Q();
            string = bundleQ != null ? bundleQ.getString("io.flutter.Entrypoint") : null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return string != null ? string : "main";
    }

    @Override // m2.C1407j.c
    public String u() {
        try {
            Bundle bundleQ = Q();
            if (bundleQ != null) {
                return bundleQ.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // m2.C1407j.c
    public C1077i v(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new C1077i(d(), aVar.q(), this);
    }

    @Override // m2.C1407j.c
    public String w() {
        String dataString;
        if (R() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // m2.C1407j.c
    public boolean x() {
        try {
            return AbstractC1408k.a(Q());
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // m2.C1407j.c
    public A2.c z(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new A2.c(f10464f, activity, aVar.z());
    }

    @Override // m2.C1407j.c
    public Context b() {
        return this;
    }

    @Override // m2.C1407j.c
    public void c() {
    }

    @Override // m2.C1407j.c
    public Activity d() {
        return this;
    }

    @Override // m2.C1407j.c
    public void D(C1415s c1415s) {
    }

    @Override // m2.C1407j.c
    public void t(io.flutter.embedding.engine.a aVar) {
    }

    @Override // m2.C1407j.c
    public void y(t tVar) {
    }
}
