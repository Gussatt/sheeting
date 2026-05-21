package E1;

import C1.AbstractC0252j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f935a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f937c;

    public e(int i4, int i5) {
        this.f936b = i4;
        this.f937c = i5;
    }

    public static String c(String str, int i4) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i4 ? strTrim.substring(0, i4) : strTrim;
    }

    public synchronized Map a() {
        return Collections.unmodifiableMap(new HashMap(this.f935a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.f937c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f935a.size() >= this.f936b && !this.f935a.containsKey(strB)) {
            z1.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f936b);
            return false;
        }
        String strC = c(str2, this.f937c);
        if (AbstractC0252j.z((String) this.f935a.get(strB), strC)) {
            return false;
        }
        Map map = this.f935a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map map) {
        try {
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = b((String) entry.getKey());
                if (this.f935a.size() < this.f936b || this.f935a.containsKey(strB)) {
                    String str = (String) entry.getValue();
                    this.f935a.put(strB, str == null ? "" : c(str, this.f937c));
                } else {
                    i4++;
                }
            }
            if (i4 > 0) {
                z1.g.f().k("Ignored " + i4 + " entries when adding custom keys. Maximum allowable: " + this.f936b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
