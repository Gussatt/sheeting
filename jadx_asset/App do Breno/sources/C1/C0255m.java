package C1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: C1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0255m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FilenameFilter f636d = new FilenameFilter() { // from class: C1.k
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator f637e = new Comparator() { // from class: C1.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1.g f638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f639b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f640c = null;

    public C0255m(I1.g gVar) {
        this.f638a = gVar;
    }

    public static void d(I1.g gVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e4) {
            z1.g.f().l("Failed to persist App Quality Sessions session id.", e4);
        }
    }

    public static String e(I1.g gVar, String str) {
        List listR = gVar.r(str, f636d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f637e)).getName().substring(4);
        }
        z1.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f639b, str)) {
            return this.f640c;
        }
        return e(this.f638a, str);
    }

    public synchronized void f(String str) {
        if (!Objects.equals(this.f640c, str)) {
            d(this.f638a, this.f639b, str);
            this.f640c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.f639b, str)) {
            d(this.f638a, str, this.f640c);
            this.f639b = str;
        }
    }
}
