package io.flutter.plugins.firebase.crashlytics;

import a2.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import w1.C1604c;

/* JADX INFO: loaded from: classes.dex */
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1604c> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-cls", "4.3.7"));
    }
}
