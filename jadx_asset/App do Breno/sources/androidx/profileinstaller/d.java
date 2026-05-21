package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q.d f5143a = q.d.w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5144b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f5145c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f5149d;

        public b(int i4, int i5, long j4, long j5) {
            this.f5146a = i4;
            this.f5147b = i5;
            this.f5148c = j4;
            this.f5149d = j5;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f5146a);
                dataOutputStream.writeInt(this.f5147b);
                dataOutputStream.writeLong(this.f5148c);
                dataOutputStream.writeLong(this.f5149d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f5147b == bVar.f5147b && this.f5148c == bVar.f5148c && this.f5146a == bVar.f5146a && this.f5149d == bVar.f5149d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f5147b), Long.valueOf(this.f5148c), Integer.valueOf(this.f5146a), Long.valueOf(this.f5149d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f5151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f5152c;

        public c(int i4, boolean z3, boolean z4) {
            this.f5150a = i4;
            this.f5152c = z4;
            this.f5151b = z3;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i4, boolean z3, boolean z4) {
        c cVar = new c(i4, z3, z4);
        f5145c = cVar;
        f5143a.s(cVar);
        return f5145c;
    }

    public static c c(Context context, boolean z3) {
        b bVarA;
        int i4;
        c cVar;
        if (!z3 && (cVar = f5145c) != null) {
            return cVar;
        }
        synchronized (f5144b) {
            if (!z3) {
                try {
                    c cVar2 = f5145c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i5 = Build.VERSION.SDK_INT;
            int i6 = 0;
            if (i5 >= 28 && i5 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z4 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z5 = file2.exists() && length2 > 0;
                try {
                    long jA = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused) {
                            return b(131072, z4, z5);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA != null && bVarA.f5148c == jA && (i4 = bVarA.f5147b) != 2) {
                        i6 = i4;
                    } else if (z4) {
                        i6 = 1;
                    } else if (z5) {
                        i6 = 2;
                    }
                    if (z3 && z5 && i6 != 1) {
                        i6 = 2;
                    }
                    if (bVarA != null && bVarA.f5147b == 2 && i6 == 1 && length < bVarA.f5149d) {
                        i6 = 3;
                    }
                    int i7 = i6;
                    b bVar = new b(1, i7, jA, length2);
                    if (bVarA == null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i7 = 196608;
                        }
                    }
                    return b(i7, z4, z5);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return b(65536, z4, z5);
                }
            }
            return b(262144, false, false);
        }
    }
}
