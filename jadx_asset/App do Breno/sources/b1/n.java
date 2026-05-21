package b1;

import V0.AbstractC0549h;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import g1.AbstractC0962b;
import g1.AbstractC0966f;
import g1.AbstractC0967g;
import g1.C0963c;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f5552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f5553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f5554c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f5552a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f5552a = Application.getProcessName();
            } else {
                int iMyPid = f5553b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f5553b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                AbstractC0549h.j(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                j.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    j.a(bufferedReader);
                }
                f5552a = strTrim;
            }
        }
        return f5552a;
    }

    public static boolean b() {
        Boolean boolValueOf = f5554c;
        if (boolValueOf == null) {
            if (k.e()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = AbstractC0967g.a(Process.class, "isIsolated", new AbstractC0966f[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new C0963c(AbstractC0962b.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f5554c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
