package w2;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1613f implements InterfaceC1618k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1613f f11878a = new C1613f();

    @Override // w2.InterfaceC1618k
    public ByteBuffer a(Object obj) {
        return C1612e.f11877a.a(new JSONArray().put(AbstractC1614g.a(obj)));
    }

    @Override // w2.InterfaceC1618k
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        return C1612e.f11877a.a(new JSONArray().put(str).put(AbstractC1614g.a(str2)).put(AbstractC1614g.a(obj)).put(AbstractC1614g.a(str3)));
    }

    @Override // w2.InterfaceC1618k
    public ByteBuffer c(String str, String str2, Object obj) {
        return C1612e.f11877a.a(new JSONArray().put(str).put(AbstractC1614g.a(str2)).put(AbstractC1614g.a(obj)));
    }

    @Override // w2.InterfaceC1618k
    public ByteBuffer d(C1616i c1616i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", c1616i.f11879a);
            jSONObject.put("args", AbstractC1614g.a(c1616i.f11880b));
            return C1612e.f11877a.a(jSONObject);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // w2.InterfaceC1618k
    public C1616i e(ByteBuffer byteBuffer) {
        try {
            Object objB = C1612e.f11877a.b(byteBuffer);
            if (objB instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objB;
                Object obj = jSONObject.get("method");
                Object objG = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new C1616i((String) obj, objG);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objB);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // w2.InterfaceC1618k
    public Object f(ByteBuffer byteBuffer) {
        try {
            Object objB = C1612e.f11877a.b(byteBuffer);
            if (objB instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objB;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object objG = g(jSONArray.opt(1));
                    Object objG2 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (objG == null || (objG instanceof String))) {
                        throw new C1611d((String) obj, (String) objG, objG2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + objB);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    public Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
