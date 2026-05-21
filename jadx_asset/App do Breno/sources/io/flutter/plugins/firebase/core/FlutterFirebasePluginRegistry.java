package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.C1446m;
import r1.C1509f;

/* JADX INFO: loaded from: classes.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static /* synthetic */ void a(C1446m c1446m) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                AbstractC1448o.a(it.next().getValue().didReinitializeFirebaseCore());
            }
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void b(C1509f c1509f, C1446m c1446m) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                map2.put(entry.getKey(), AbstractC1448o.a(entry.getValue().getPluginConstantsForFirebaseApp(c1509f)));
            }
            c1446m.c(map2);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static AbstractC1445l didReinitializeFirebaseCore() {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.j
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.a(c1446m);
            }
        });
        return c1446m.a();
    }

    public static AbstractC1445l getPluginConstantsForFirebaseApp(final C1509f c1509f) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.b(c1509f, c1446m);
            }
        });
        return c1446m.a();
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
