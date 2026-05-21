package w2;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: w2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1616i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11880b;

    public C1616i(String str, Object obj) {
        this.f11879a = str;
        this.f11880b = obj;
    }

    public Object a(String str) {
        Object obj = this.f11880b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public Object b() {
        return this.f11880b;
    }

    public boolean c(String str) {
        Object obj = this.f11880b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
