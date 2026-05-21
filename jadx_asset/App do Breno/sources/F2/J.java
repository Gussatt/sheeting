package F2;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d3.i[] f1610a = {X2.z.e(new X2.r(J.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z2.a f1611b = O.a.b("FlutterSharedPreferences", null, null, null, 14, null);

    public static final L.h b(Context context) {
        return (L.h) f1611b.a(context, f1610a[0]);
    }

    public static final boolean c(String str, Object obj, Set set) {
        X2.l.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object d(Object obj, G g4) {
        X2.l.e(g4, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!f3.p.t(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null)) {
            if (!f3.p.t(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false, 2, null)) {
                return obj;
            }
            String strSubstring = str.substring(40);
            X2.l.d(strSubstring, "substring(...)");
            return Double.valueOf(Double.parseDouble(strSubstring));
        }
        if (f3.p.t(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null)) {
            return obj;
        }
        String strSubstring2 = str.substring(40);
        X2.l.d(strSubstring2, "substring(...)");
        List listB = g4.b(strSubstring2);
        X2.l.b(listB);
        return listB;
    }
}
