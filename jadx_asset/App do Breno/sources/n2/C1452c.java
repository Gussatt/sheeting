package n2;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: n2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1452c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C1452c f10707b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10708a = new HashMap();

    public static C1452c b() {
        if (f10707b == null) {
            synchronized (C1452c.class) {
                try {
                    if (f10707b == null) {
                        f10707b = new C1452c();
                    }
                } finally {
                }
            }
        }
        return f10707b;
    }

    public io.flutter.embedding.engine.b a(String str) {
        return (io.flutter.embedding.engine.b) this.f10708a.get(str);
    }
}
