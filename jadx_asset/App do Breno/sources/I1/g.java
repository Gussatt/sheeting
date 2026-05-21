package I1;

import C1.AbstractC0252j;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z1.j;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f2269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f2270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f2271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f2272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f2273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f2274g;

    public g(Context context) {
        String str;
        String strD = j.f12106a.e(context).d();
        this.f2268a = strD;
        File filesDir = context.getFilesDir();
        this.f2269b = filesDir;
        if (x()) {
            str = ".crashlytics.v3" + File.separator + w(strD);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileS = s(new File(filesDir, str));
        this.f2270c = fileS;
        this.f2271d = s(new File(fileS, "open-sessions"));
        this.f2272e = s(new File(fileS, "reports"));
        this.f2273f = s(new File(fileS, "priority-reports"));
        this.f2274g = s(new File(fileS, "native-reports"));
    }

    public static synchronized File s(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                z1.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                z1.g.f().d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static File t(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean u(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                u(file2);
            }
        }
        return file.delete();
    }

    public static List v(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public static String w(String str) {
        return str.length() > 40 ? AbstractC0252j.A(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public final void b(String str) {
        File file = new File(this.f2269b, str);
        if (file.exists() && u(file)) {
            z1.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public final void c(final String str) {
        String[] list;
        if (!this.f2269b.exists() || (list = this.f2269b.list(new FilenameFilter() { // from class: I1.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (x()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return u(new File(this.f2271d, str));
    }

    public List f() {
        return v(this.f2271d.list());
    }

    public File g(String str) {
        return new File(this.f2270c, str);
    }

    public List h(FilenameFilter filenameFilter) {
        return v(this.f2270c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f2274g, str);
    }

    public List j() {
        return v(this.f2274g.listFiles());
    }

    public File k(String str) {
        return t(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f2273f, str);
    }

    public List m() {
        return v(this.f2273f.listFiles());
    }

    public File n(String str) {
        return new File(this.f2272e, str);
    }

    public List o() {
        return v(this.f2272e.listFiles());
    }

    public final File p(String str) {
        return t(new File(this.f2271d, str));
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List r(String str, FilenameFilter filenameFilter) {
        return v(p(str).listFiles(filenameFilter));
    }

    public final boolean x() {
        return !this.f2268a.isEmpty();
    }
}
