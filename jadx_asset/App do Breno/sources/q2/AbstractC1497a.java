package q2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: q2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1497a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11066a = d.class.getName() + ".aot-shared-library-name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f11067b = d.class.getName() + ".vm-snapshot-data";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11068c = d.class.getName() + ".isolate-snapshot-data";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11069d = d.class.getName() + ".flutter-assets-dir";

    public static ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static boolean b(Bundle bundle, String str, boolean z3) {
        return bundle == null ? z3 : bundle.getBoolean(str, z3);
    }

    public static String c(ApplicationInfo applicationInfo, Context context) {
        int i4;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i4 = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i4);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (xml.getName().equals("domain-config")) {
                        g(xml, jSONArray, false);
                    }
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    public static C1498b e(Context context) {
        ApplicationInfo applicationInfoA = a(context);
        return new C1498b(d(applicationInfoA.metaData, f11066a), d(applicationInfoA.metaData, f11067b), d(applicationInfoA.metaData, f11068c), d(applicationInfoA.metaData, f11069d), c(applicationInfoA, context), applicationInfoA.nativeLibraryDir, b(applicationInfoA.metaData, "io.flutter.automatically-register-plugins", true));
    }

    public static void f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z3) throws XmlPullParserException, IOException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new IllegalStateException("Expected text");
        }
        String strTrim = xmlResourceParser.getText().trim();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(strTrim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z3);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new IllegalStateException("Expected end of domain tag");
        }
    }

    public static void g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z3) throws XmlPullParserException, IOException {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z3);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static void h(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            } else {
                eventType = xmlResourceParser.next();
            }
        }
    }
}
