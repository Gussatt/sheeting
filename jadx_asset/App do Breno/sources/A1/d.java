package A1;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
public class d implements b, B1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B1.a f37a;

    public static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // B1.b
    public void a(B1.a aVar) {
        this.f37a = aVar;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // A1.b
    public void b(String str, Bundle bundle) {
        B1.a aVar = this.f37a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
