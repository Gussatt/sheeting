package c2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import d2.InterfaceC0920b;
import f2.C0955f;
import java.util.Map;
import r1.C1509f;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f6146a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1.a f6147b;

    static {
        O1.a aVarI = new Q1.d().j(C0677c.f6019a).k(true).i();
        X2.l.d(aVarI, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f6147b = aVarI;
    }

    public final y a(C1509f c1509f, x xVar, C0955f c0955f, Map map, String str, String str2) {
        X2.l.e(c1509f, "firebaseApp");
        X2.l.e(xVar, "sessionDetails");
        X2.l.e(c0955f, "sessionsSettings");
        X2.l.e(map, "subscribers");
        X2.l.e(str, "firebaseInstallationId");
        X2.l.e(str2, "firebaseAuthenticationToken");
        return new y(EnumC0684j.SESSION_START, new C0666C(xVar.b(), xVar.a(), xVar.c(), xVar.d(), new C0679e(d((InterfaceC0920b) map.get(InterfaceC0920b.a.PERFORMANCE)), d((InterfaceC0920b) map.get(InterfaceC0920b.a.CRASHLYTICS)), c0955f.b()), str, str2), b(c1509f));
    }

    public final C0676b b(C1509f c1509f) throws PackageManager.NameNotFoundException {
        X2.l.e(c1509f, "firebaseApp");
        Context contextM = c1509f.m();
        X2.l.d(contextM, "firebaseApp.applicationContext");
        String packageName = contextM.getPackageName();
        PackageInfo packageInfo = contextM.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strC = c1509f.r().c();
        X2.l.d(strC, "firebaseApp.options.applicationId");
        String str = Build.MODEL;
        X2.l.d(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        X2.l.d(str2, "RELEASE");
        EnumC0692r enumC0692r = EnumC0692r.LOG_ENVIRONMENT_PROD;
        X2.l.d(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? strValueOf : str3;
        String str5 = Build.MANUFACTURER;
        X2.l.d(str5, "MANUFACTURER");
        t tVar = t.f6103a;
        Context contextM2 = c1509f.m();
        X2.l.d(contextM2, "firebaseApp.applicationContext");
        s sVarD = tVar.d(contextM2);
        Context contextM3 = c1509f.m();
        X2.l.d(contextM3, "firebaseApp.applicationContext");
        return new C0676b(strC, str, "2.1.0", str2, enumC0692r, new C0675a(packageName, str4, strValueOf, str5, sVarD, tVar.c(contextM3)));
    }

    public final O1.a c() {
        return f6147b;
    }

    public final EnumC0678d d(InterfaceC0920b interfaceC0920b) {
        return interfaceC0920b == null ? EnumC0678d.COLLECTION_SDK_NOT_INSTALLED : interfaceC0920b.c() ? EnumC0678d.COLLECTION_ENABLED : EnumC0678d.COLLECTION_DISABLED;
    }
}
