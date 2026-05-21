package androidx.profileinstaller;

import O.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import b0.ExecutorC0628k;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0099c f5141a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0099c f5142b = new b();

    public class a implements InterfaceC0099c {
        @Override // androidx.profileinstaller.c.InterfaceC0099c
        public void a(int i4, Object obj) {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0099c
        public void b(int i4, Object obj) {
        }
    }

    public class b implements InterfaceC0099c {
        @Override // androidx.profileinstaller.c.InterfaceC0099c
        public void a(int i4, Object obj) {
            Log.d("ProfileInstaller", i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.c.InterfaceC0099c
        public void b(int i4, Object obj) {
            String str;
            switch (i4) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case h.LONG_FIELD_NUMBER /* 4 */:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case h.STRING_FIELD_NUMBER /* 5 */:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case h.BYTES_FIELD_NUMBER /* 8 */:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i4 == 6 || i4 == 7 || i4 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0099c {
        void a(int i4, Object obj);

        void b(int i4, Object obj);
    }

    public static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(Context context, Executor executor, InterfaceC0099c interfaceC0099c) {
        b(context.getFilesDir());
        f(executor, interfaceC0099c, 11, null);
    }

    public static boolean d(PackageInfo packageInfo, File file, InterfaceC0099c interfaceC0099c) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j4 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z3 = j4 == packageInfo.lastUpdateTime;
                if (z3) {
                    interfaceC0099c.b(2, null);
                }
                return z3;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void f(Executor executor, final InterfaceC0099c interfaceC0099c, final int i4, final Object obj) {
        executor.execute(new Runnable() { // from class: c0.e
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC0099c.b(i4, obj);
            }
        });
    }

    public static boolean g(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC0099c interfaceC0099c) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, interfaceC0099c, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean zM = bVar.h().l().m();
        if (zM) {
            e(packageInfo, file);
        }
        return zM;
    }

    public static void h(Context context) {
        i(context, new ExecutorC0628k(), f5141a);
    }

    public static void i(Context context, Executor executor, InterfaceC0099c interfaceC0099c) {
        j(context, executor, interfaceC0099c, false);
    }

    public static void j(Context context, Executor executor, InterfaceC0099c interfaceC0099c, boolean z3) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z4 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3 && d(packageInfo, filesDir, interfaceC0099c)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                d.c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (g(assets, packageName, packageInfo, filesDir, name, executor, interfaceC0099c) && z3) {
                z4 = true;
            }
            d.c(context, z4);
        } catch (PackageManager.NameNotFoundException e4) {
            interfaceC0099c.b(7, e4);
            d.c(context, false);
        }
    }

    public static void k(Context context, Executor executor, InterfaceC0099c interfaceC0099c) {
        try {
            e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            f(executor, interfaceC0099c, 10, null);
        } catch (PackageManager.NameNotFoundException e4) {
            f(executor, interfaceC0099c, 7, e4);
        }
    }
}
