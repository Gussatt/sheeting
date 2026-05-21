package K1;

import C1.I;
import K1.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements i {
    public static d b(I i4) {
        return new d(i4.a() + ((long) 3600000), new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // K1.i
    public d a(I i4, JSONObject jSONObject) {
        return b(i4);
    }
}
