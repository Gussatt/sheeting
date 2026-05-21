package K1;

import C1.I;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f2490a;

    public h(I i4) {
        this.f2490a = i4;
    }

    public static i a(int i4) {
        if (i4 == 3) {
            return new m();
        }
        z1.g.f().d("Could not determine SettingsJsonTransform for settings version " + i4 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f2490a, jSONObject);
    }
}
