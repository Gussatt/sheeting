package k1;

import java.util.Map;

/* JADX INFO: renamed from: k1.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1260m3 implements com.google.android.gms.internal.measurement.H5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1268n3 f9576b;

    public C1260m3(C1268n3 c1268n3, String str) {
        this.f9575a = str;
        this.f9576b = c1268n3;
    }

    @Override // com.google.android.gms.internal.measurement.H5
    public final String a(String str) {
        Map map = (Map) this.f9576b.f9598d.get(this.f9575a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
