package io.flutter.plugins.firebase.analytics;

import L2.l;
import a2.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import w1.C1604c;

/* JADX INFO: loaded from: classes.dex */
public final class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1604c> getComponents() {
        return l.b(h.b("flutter-fire-analytics", "11.5.0"));
    }
}
