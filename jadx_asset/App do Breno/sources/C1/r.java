package C1;

import C1.H;
import F1.F;
import F1.G;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.C1446m;
import n1.InterfaceC1444k;
import z1.InterfaceC1662a;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final FilenameFilter f645t = new FilenameFilter() { // from class: C1.q
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Charset f646u = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E1.o f650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D1.f f651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O f652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I1.g f653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0244b f654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E1.f f655i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1662a f656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A1.a f657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0256n f658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i0 f659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public H f660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public K1.j f661o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1446m f662p = new C1446m();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1446m f663q = new C1446m();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1446m f664r = new C1446m();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f665s = new AtomicBoolean(false);

    public class a implements H.a {
        public a() {
        }

        @Override // C1.H.a
        public void a(K1.j jVar, Thread thread, Throwable th) throws Throwable {
            r.this.I(jVar, thread, th);
        }
    }

    public class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Thread f669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ K1.j f670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f671e;

        public class a implements InterfaceC1444k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f673a;

            public a(String str) {
                this.f673a = str;
            }

            @Override // n1.InterfaceC1444k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC1445l a(K1.d dVar) {
                if (dVar != null) {
                    return AbstractC1448o.g(r.this.N(), r.this.f659m.z(r.this.f651e.f877a, b.this.f671e ? this.f673a : null));
                }
                z1.g.f().k("Received null app settings, cannot send reports at crash time.");
                return AbstractC1448o.e(null);
            }
        }

        public b(long j4, Throwable th, Thread thread, K1.j jVar, boolean z3) {
            this.f667a = j4;
            this.f668b = th;
            this.f669c = thread;
            this.f670d = jVar;
            this.f671e = z3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1445l call() {
            long jG = r.G(this.f667a);
            String strC = r.this.C();
            if (strC == null) {
                z1.g.f().d("Tried to write a fatal exception while no session was open.");
                return AbstractC1448o.e(null);
            }
            r.this.f649c.a();
            r.this.f659m.u(this.f668b, this.f669c, strC, jG);
            r.this.x(this.f667a);
            r.this.u(this.f670d);
            r.this.w(new C0251i().c(), Boolean.valueOf(this.f671e));
            return !r.this.f648b.d() ? AbstractC1448o.e(null) : this.f670d.a().n(r.this.f651e.f877a, new a(strC));
        }
    }

    public class c implements InterfaceC1444k {
        public c() {
        }

        @Override // n1.InterfaceC1444k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC1445l a(Void r12) {
            return AbstractC1448o.e(Boolean.TRUE);
        }
    }

    public class d implements InterfaceC1444k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1445l f676a;

        public class a implements InterfaceC1444k {
            public a() {
            }

            @Override // n1.InterfaceC1444k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC1445l a(K1.d dVar) {
                if (dVar == null) {
                    z1.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return AbstractC1448o.e(null);
                }
                r.this.N();
                r.this.f659m.y(r.this.f651e.f877a);
                r.this.f664r.e(null);
                return AbstractC1448o.e(null);
            }
        }

        public d(AbstractC1445l abstractC1445l) {
            this.f676a = abstractC1445l;
        }

        @Override // n1.InterfaceC1444k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC1445l a(Boolean bool) {
            if (bool.booleanValue()) {
                z1.g.f().b("Sending cached crash reports...");
                r.this.f648b.c(bool.booleanValue());
                return this.f676a.n(r.this.f651e.f877a, new a());
            }
            z1.g.f().i("Deleting cached crash reports...");
            r.r(r.this.L());
            r.this.f659m.x();
            r.this.f664r.e(null);
            return AbstractC1448o.e(null);
        }
    }

    public class e implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f679a;

        public e(long j4) {
            this.f679a = j4;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f679a);
            r.this.f657k.a("_ae", bundle);
            return null;
        }
    }

    public r(Context context, O o4, J j4, I1.g gVar, E e4, C0244b c0244b, E1.o oVar, E1.f fVar, i0 i0Var, InterfaceC1662a interfaceC1662a, A1.a aVar, C0256n c0256n, D1.f fVar2) {
        this.f647a = context;
        this.f652f = o4;
        this.f648b = j4;
        this.f653g = gVar;
        this.f649c = e4;
        this.f654h = c0244b;
        this.f650d = oVar;
        this.f655i = fVar;
        this.f656j = interfaceC1662a;
        this.f657k = aVar;
        this.f658l = c0256n;
        this.f659m = i0Var;
        this.f651e = fVar2;
    }

    public static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long D() {
        return G(System.currentTimeMillis());
    }

    public static List E(z1.h hVar, String str, I1.g gVar, byte[] bArr) {
        File fileQ = gVar.q(str, "user-data");
        File fileQ2 = gVar.q(str, "keys");
        File fileQ3 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0250h("logs_file", "logs", bArr));
        arrayList.add(new M("crash_meta_file", "metadata", hVar.g()));
        arrayList.add(new M("session_meta_file", "session", hVar.f()));
        arrayList.add(new M("app_meta_file", "app", hVar.a()));
        arrayList.add(new M("device_meta_file", "device", hVar.c()));
        arrayList.add(new M("os_meta_file", "os", hVar.b()));
        arrayList.add(Q(hVar));
        arrayList.add(new M("user_meta_file", "user", fileQ));
        arrayList.add(new M("keys_file", "keys", fileQ2));
        arrayList.add(new M("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    public static long G(long j4) {
        return j4 / 1000;
    }

    public static boolean P(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            z1.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            z1.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    public static S Q(z1.h hVar) {
        File fileE = hVar.e();
        return (fileE == null || !fileE.exists()) ? new C0250h("minidump_file", "minidump", new byte[]{0}) : new M("minidump_file", "minidump", fileE);
    }

    public static byte[] S(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i4);
        }
    }

    public static G.a o(O o4, C0244b c0244b) {
        return G.a.b(o4.f(), c0244b.f589f, c0244b.f590g, o4.a().c(), K.f(c0244b.f587d).g(), c0244b.f591h);
    }

    public static G.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(AbstractC0252j.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC0252j.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), AbstractC0252j.x(), AbstractC0252j.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static G.c q() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC0252j.y());
    }

    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public boolean A(K1.j jVar) {
        D1.f.c();
        if (K()) {
            z1.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        z1.g.f().i("Finalizing previously open sessions.");
        try {
            v(true, jVar, true);
            z1.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e4) {
            z1.g.f().e("Unable to finalize previously open sessions.", e4);
            return false;
        }
    }

    public final String C() {
        SortedSet sortedSetQ = this.f659m.q();
        if (sortedSetQ.isEmpty()) {
            return null;
        }
        return (String) sortedSetQ.first();
    }

    public final InputStream F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        z1.g.f().k("Couldn't get Class Loader");
        return null;
    }

    public String H() throws IOException {
        String strR = AbstractC0252j.r(this.f647a);
        if (strR != null) {
            z1.g.f().b("Read version control info from string resource");
            return Base64.encodeToString(strR.getBytes(f646u), 0);
        }
        InputStream inputStreamF = F("META-INF/version-control-info.textproto");
        if (inputStreamF == null) {
            if (inputStreamF != null) {
                inputStreamF.close();
            }
            z1.g.f().g("No version control information found");
            return null;
        }
        try {
            z1.g.f().b("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(S(inputStreamF), 0);
            inputStreamF.close();
            return strEncodeToString;
        } catch (Throwable th) {
            try {
                inputStreamF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void I(K1.j jVar, Thread thread, Throwable th) throws Throwable {
        J(jVar, thread, th, false);
    }

    public synchronized void J(K1.j jVar, Thread thread, Throwable th, boolean z3) throws Throwable {
        try {
            try {
                z1.g.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
                AbstractC1445l abstractC1445lE = this.f651e.f877a.e(new b(System.currentTimeMillis(), th, thread, jVar, z3));
                if (!z3) {
                    try {
                        try {
                            l0.b(abstractC1445lE);
                        } catch (TimeoutException unused) {
                            z1.g.f().d("Cannot send reports. Timed out while fetching settings.");
                        }
                    } catch (Exception e4) {
                        z1.g.f().e("Error handling uncaught exception", e4);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public boolean K() {
        H h4 = this.f660n;
        return h4 != null && h4.a();
    }

    public List L() {
        return this.f653g.h(f645t);
    }

    public final AbstractC1445l M(long j4) {
        if (B()) {
            z1.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return AbstractC1448o.e(null);
        }
        z1.g.f().b("Logging app exception event to Firebase Analytics");
        return AbstractC1448o.c(new ScheduledThreadPoolExecutor(1), new e(j4));
    }

    public final AbstractC1445l N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                z1.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return AbstractC1448o.f(arrayList);
    }

    public void O(Thread thread, Throwable th) throws Throwable {
        K1.j jVar = this.f661o;
        if (jVar == null) {
            z1.g.f().k("settingsProvider not set");
        } else {
            J(jVar, thread, th, true);
        }
    }

    public void R(final String str) {
        this.f651e.f877a.d(new Runnable() { // from class: C1.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f643m.w(str, Boolean.FALSE);
            }
        });
    }

    public void T() {
        try {
            String strH = H();
            if (strH != null) {
                W("com.crashlytics.version-control-info", strH);
                z1.g.f().g("Saved version control info");
            }
        } catch (IOException e4) {
            z1.g.f().l("Unable to save version control info", e4);
        }
    }

    public AbstractC1445l U() {
        this.f663q.e(Boolean.TRUE);
        return this.f664r.a();
    }

    public void V(String str, String str2) {
        try {
            this.f650d.m(str, str2);
        } catch (IllegalArgumentException e4) {
            Context context = this.f647a;
            if (context != null && AbstractC0252j.v(context)) {
                throw e4;
            }
            z1.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void W(String str, String str2) {
        try {
            this.f650d.n(str, str2);
        } catch (IllegalArgumentException e4) {
            Context context = this.f647a;
            if (context != null && AbstractC0252j.v(context)) {
                throw e4;
            }
            z1.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void X(String str) {
        this.f650d.p(str);
    }

    public void Y(AbstractC1445l abstractC1445l) {
        if (this.f659m.p()) {
            z1.g.f().i("Crash reports are available to be sent.");
            Z().n(this.f651e.f877a, new d(abstractC1445l));
        } else {
            z1.g.f().i("No crash reports are available to be sent.");
            this.f662p.e(Boolean.FALSE);
        }
    }

    public final AbstractC1445l Z() {
        if (this.f648b.d()) {
            z1.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f662p.e(Boolean.FALSE);
            return AbstractC1448o.e(Boolean.TRUE);
        }
        z1.g.f().b("Automatic data collection is disabled.");
        z1.g.f().i("Notifying that unsent reports are available.");
        this.f662p.e(Boolean.TRUE);
        AbstractC1445l abstractC1445lO = this.f648b.j().o(new c());
        z1.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return D1.b.b(abstractC1445lO, this.f663q.a());
    }

    public final void a0(String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            z1.g.f().i("ANR feature enabled, but device is API " + i4);
            return;
        }
        List historicalProcessExitReasons = ((ActivityManager) this.f647a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f659m.w(str, historicalProcessExitReasons, new E1.f(this.f653g, str), E1.o.j(str, this.f653g, this.f651e));
        } else {
            z1.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    public void b0(Thread thread, Throwable th, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (K()) {
            return;
        }
        long jG = G(jCurrentTimeMillis);
        String strC = C();
        if (strC == null) {
            z1.g.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f659m.v(th, thread, new E1.c(strC, jG, map));
        }
    }

    public void c0(long j4, String str) {
        if (K()) {
            return;
        }
        this.f655i.g(j4, str);
    }

    public AbstractC1445l n() {
        if (this.f665s.compareAndSet(false, true)) {
            return this.f662p.a();
        }
        z1.g.f().k("checkForUnsentReports should only be called once per execution.");
        return AbstractC1448o.e(Boolean.FALSE);
    }

    public AbstractC1445l s() {
        this.f663q.e(Boolean.FALSE);
        return this.f664r.a();
    }

    public boolean t() {
        D1.f.c();
        if (!this.f649c.c()) {
            String strC = C();
            return strC != null && this.f656j.d(strC);
        }
        z1.g.f().i("Found previous crash marker.");
        this.f649c.d();
        return true;
    }

    public void u(K1.j jVar) {
        v(false, jVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(boolean z3, K1.j jVar, boolean z4) {
        String str;
        D1.f.c();
        ArrayList arrayList = new ArrayList(this.f659m.q());
        if (arrayList.size() <= z3) {
            z1.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z3 ? 1 : 0);
        if (z4 && jVar.b().f2462b.f2470b) {
            a0(str2);
        } else {
            z1.g.f().i("ANR feature disabled.");
        }
        if (z4 && this.f656j.d(str2)) {
            z(str2);
        }
        if (z3 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f658l.e(null);
            str = null;
        }
        this.f659m.m(D(), str);
    }

    public final void w(String str, Boolean bool) {
        long jD = D();
        z1.g.f().b("Opening a new session with ID " + str);
        this.f656j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", D.s()), jD, F1.G.b(o(this.f652f, this.f654h), q(), p(this.f647a)));
        if (bool.booleanValue() && str != null) {
            this.f650d.o(str);
        }
        this.f655i.e(str);
        this.f658l.e(str);
        this.f659m.r(str, jD);
    }

    public final void x(long j4) {
        try {
            if (this.f653g.g(".ae" + j4).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e4) {
            z1.g.f().l("Could not create app exception marker file.", e4);
        }
    }

    public void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, K1.j jVar) {
        this.f661o = jVar;
        R(str);
        H h4 = new H(new a(), jVar, uncaughtExceptionHandler, this.f656j);
        this.f660n = h4;
        Thread.setDefaultUncaughtExceptionHandler(h4);
    }

    public final void z(String str) {
        z1.g.f().i("Finalizing native report for session " + str);
        z1.h hVarA = this.f656j.a(str);
        File fileE = hVarA.e();
        F.a aVarD = hVarA.d();
        if (P(str, fileE, aVarD)) {
            z1.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileE.lastModified();
        E1.f fVar = new E1.f(this.f653g, str);
        File fileK = this.f653g.k(str);
        if (!fileK.isDirectory()) {
            z1.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        x(jLastModified);
        List listE = E(hVarA, str, this.f653g, fVar.b());
        T.b(fileK, listE);
        z1.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f659m.l(str, listE, aVarD);
        fVar.a();
    }
}
