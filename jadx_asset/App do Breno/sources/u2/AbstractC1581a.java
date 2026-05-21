package u2;

import io.flutter.plugins.GeneratedPluginRegistrant;
import l2.AbstractC1388b;

/* JADX INFO: renamed from: u2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1581a {
    public static void a(io.flutter.embedding.engine.a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.a.class).invoke(null, aVar);
        } catch (Exception e4) {
            AbstractC1388b.b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            AbstractC1388b.c("GeneratedPluginsRegister", "Received exception while registering", e4);
        }
    }
}
