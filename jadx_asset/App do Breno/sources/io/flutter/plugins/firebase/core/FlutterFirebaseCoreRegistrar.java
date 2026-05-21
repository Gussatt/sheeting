package io.flutter.plugins.firebase.core;

import a2.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import w1.C1604c;

/* JADX INFO: loaded from: classes.dex */
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1604c> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-core", "3.14.0"));
    }
}
