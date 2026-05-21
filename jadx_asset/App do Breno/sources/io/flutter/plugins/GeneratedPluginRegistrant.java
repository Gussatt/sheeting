package io.flutter.plugins;

import B2.X;
import C2.i;
import D2.n;
import F2.I;
import H2.D5;
import h2.C0993b;
import i2.C1048D;
import io.flutter.embedding.engine.a;
import l2.AbstractC1388b;
import w0.C1597b;

/* JADX INFO: loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.u().d(new C0993b());
        } catch (Exception e4) {
            AbstractC1388b.c(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e4);
        }
        try {
            aVar.u().d(new X());
        } catch (Exception e5) {
            AbstractC1388b.c(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e5);
        }
        try {
            aVar.u().d(new i());
        } catch (Exception e6) {
            AbstractC1388b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e6);
        }
        try {
            aVar.u().d(new n());
        } catch (Exception e7) {
            AbstractC1388b.c(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e7);
        }
        try {
            aVar.u().d(new s3.a());
        } catch (Exception e8) {
            AbstractC1388b.c(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e8);
        }
        try {
            aVar.u().d(new E2.i());
        } catch (Exception e9) {
            AbstractC1388b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e9);
        }
        try {
            aVar.u().d(new I());
        } catch (Exception e10) {
            AbstractC1388b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e10);
        }
        try {
            aVar.u().d(new C1597b());
        } catch (Exception e11) {
            AbstractC1388b.c(TAG, "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", e11);
        }
        try {
            aVar.u().d(new C1048D());
        } catch (Exception e12) {
            AbstractC1388b.c(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e12);
        }
        try {
            aVar.u().d(new G2.i());
        } catch (Exception e13) {
            AbstractC1388b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e13);
        }
        try {
            aVar.u().d(new D5());
        } catch (Exception e14) {
            AbstractC1388b.c(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e14);
        }
    }
}
