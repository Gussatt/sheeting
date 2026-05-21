package C1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: C1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0244b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1.f f591h;

    public C0244b(String str, String str2, List list, String str3, String str4, String str5, String str6, z1.f fVar) {
        this.f584a = str;
        this.f585b = str2;
        this.f586c = list;
        this.f587d = str3;
        this.f588e = str4;
        this.f589f = str5;
        this.f590g = str6;
        this.f591h = fVar;
    }

    public static C0244b a(Context context, O o4, String str, String str2, List list, z1.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = o4.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C0244b(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    public static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
