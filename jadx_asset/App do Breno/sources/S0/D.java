package S0;

import V0.AbstractC0549h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import b1.AbstractC0633a;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile V0.F f3396e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f3398g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f3392a = new v(z.r("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f3393b = new w(z.r("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f3394c = new x(z.r("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f3395d = new y(z.r("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f3397f = new Object();

    public static M a(String str, z zVar, boolean z3, boolean z4) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, zVar, z3, z4);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static M b(String str, boolean z3, boolean z4, boolean z5) {
        return g(str, z3, false, false, true);
    }

    public static /* synthetic */ String c(boolean z3, String str, z zVar) {
        String str2 = (z3 || !f(str, zVar, true, false).f3415a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = AbstractC0633a.b("SHA-256");
        AbstractC0549h.j(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, b1.i.a(messageDigestB.digest(zVar.u())), Boolean.valueOf(z3), "12451000.false");
    }

    public static synchronized void d(Context context) {
        if (f3398g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f3398g = context.getApplicationContext();
        }
    }

    public static boolean e() {
        boolean zG;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                zG = f3396e.g();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e4) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            zG = false;
        }
        return zG;
    }

    public static M f(final String str, final z zVar, final boolean z3, boolean z4) {
        try {
            h();
            AbstractC0549h.j(f3398g);
            try {
                return f3396e.U(new I(str, zVar, z3, z4), ObjectWrapper.wrap(f3398g.getPackageManager())) ? M.b() : new K(new Callable() { // from class: S0.u
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return D.c(z3, str, zVar);
                    }
                }, null);
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return M.d("module call", e4);
            }
        } catch (DynamiteModule.a e5) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            return M.d("module init: ".concat(String.valueOf(e5.getMessage())), e5);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    public static M g(String str, boolean z3, boolean z4, boolean z5, boolean z6) {
        M mD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC0549h.j(f3398g);
            try {
                h();
                E e4 = new E(str, z3, false, ObjectWrapper.wrap(f3398g), false, true);
                try {
                    G gK = z6 ? f3396e.K(e4) : f3396e.q0(e4);
                    if (gK.f()) {
                        mD = M.f(gK.g());
                    } else {
                        String strD = gK.d();
                        PackageManager.NameNotFoundException nameNotFoundException = gK.h() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strD == null) {
                            strD = "error checking package certificate";
                        }
                        mD = M.g(gK.g(), gK.h(), strD, nameNotFoundException);
                    }
                } catch (RemoteException e5) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
                    mD = M.d("module call", e5);
                }
            } catch (DynamiteModule.a e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                mD = M.d("module init: ".concat(String.valueOf(e6.getMessage())), e6);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return mD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public static void h() {
        if (f3396e != null) {
            return;
        }
        AbstractC0549h.j(f3398g);
        synchronized (f3397f) {
            try {
                if (f3396e == null) {
                    f3396e = zzaf.zzb(DynamiteModule.d(f3398g, DynamiteModule.f6270f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
