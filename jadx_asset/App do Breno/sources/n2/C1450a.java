package n2;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: n2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1450a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1450a f10683b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10684a = new HashMap();

    public static C1450a b() {
        if (f10683b == null) {
            f10683b = new C1450a();
        }
        return f10683b;
    }

    public io.flutter.embedding.engine.a a(String str) {
        return (io.flutter.embedding.engine.a) this.f10684a.get(str);
    }

    public void c(String str, io.flutter.embedding.engine.a aVar) {
        if (aVar != null) {
            this.f10684a.put(str, aVar);
        } else {
            this.f10684a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
