package io.flutter.plugins.firebase.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n1.AbstractC1445l;
import r1.C1509f;

/* JADX INFO: loaded from: classes.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    AbstractC1445l didReinitializeFirebaseCore();

    AbstractC1445l getPluginConstantsForFirebaseApp(C1509f c1509f);
}
