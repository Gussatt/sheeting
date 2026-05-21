package q2;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.o;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import l2.AbstractC1388b;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11078a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f11079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1498b f11081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f11082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExecutorService f11083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future f11084g;

    public class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f11085a;

        public a(Context context) {
            this.f11085a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public q2.d.b call() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.d.a.call():q2.d$b");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f11089c;

        public /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }

        public b(String str, String str2, String str3) {
            this.f11087a = str;
            this.f11088b = str2;
            this.f11089c = str3;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11090a;

        public String a() {
            return this.f11090a;
        }
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f11082e = flutterJNI;
        this.f11083f = executorService;
    }

    public static /* synthetic */ e a(d dVar, Context context) {
        dVar.l(context);
        return null;
    }

    public static boolean n(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean e() {
        return this.f11081d.f11076g;
    }

    public void f(Context context, String[] strArr) {
        if (this.f11078a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f11079b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            I2.e eVarG = I2.e.g("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.f11084g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + this.f11081d.f11075f + File.separator + "libflutter.so");
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str.startsWith("--aot-shared-library-name=")) {
                            String strK = k(context, str);
                            if (strK != null) {
                                str = strK;
                                arrayList.add(str);
                            } else {
                                AbstractC1388b.g("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
                            }
                        } else {
                            arrayList.add(str);
                        }
                    }
                }
                arrayList.add("--aot-shared-library-name=" + this.f11081d.f11070a);
                arrayList.add("--aot-shared-library-name=" + this.f11081d.f11075f + File.separator + this.f11081d.f11070a);
                StringBuilder sb = new StringBuilder();
                sb.append("--cache-dir-path=");
                sb.append(bVar.f11088b);
                arrayList.add(sb.toString());
                if (this.f11081d.f11074e != null) {
                    arrayList.add("--domain-network-policy=" + this.f11081d.f11074e);
                }
                if (this.f11079b.a() != null) {
                    arrayList.add("--log-tag=" + this.f11079b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i4 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i4 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i4 = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i4);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                        throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=" + (n(bundle) ? "true" : "false"));
                this.f11082e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f11087a, bVar.f11088b, SystemClock.uptimeMillis() - this.f11080c, Build.VERSION.SDK_INT);
                this.f11078a = true;
                if (eVarG != null) {
                    eVarG.close();
                }
            } finally {
            }
        } catch (Exception e4) {
            AbstractC1388b.c("FlutterLoader", "Flutter initialization failed.", e4);
            throw new RuntimeException(e4);
        }
    }

    public String g() {
        return this.f11081d.f11073d;
    }

    public final String h(String str) {
        return this.f11081d.f11073d + File.separator + str;
    }

    public File i(String str) {
        return new File(str);
    }

    public String j(String str) {
        return h(str);
    }

    public final String k(Context context, String str) throws IOException {
        if (!str.startsWith("--aot-shared-library-name=")) {
            throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
        }
        File fileI = i(str.substring(26));
        try {
            String canonicalPath = fileI.getCanonicalPath();
            boolean zStartsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean zEndsWith = canonicalPath.endsWith(".so");
            if (zStartsWith && zEndsWith) {
                return "--aot-shared-library-name=" + canonicalPath;
            }
            AbstractC1388b.b("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            AbstractC1388b.b("FlutterLoader", "External path " + fileI.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public final e l(Context context) {
        return null;
    }

    public boolean m() {
        return this.f11078a;
    }

    public void o(Context context) {
        p(context, new c());
    }

    public void p(Context context, c cVar) {
        if (this.f11079b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        I2.e eVarG = I2.e.g("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f11079b = cVar;
            this.f11080c = SystemClock.uptimeMillis();
            this.f11081d = AbstractC1497a.e(applicationContext);
            o.f((DisplayManager) applicationContext.getSystemService("display"), this.f11082e).g();
            this.f11084g = this.f11083f.submit(new a(applicationContext));
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
