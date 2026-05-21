package l0;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.AbstractC1139c;
import k0.AbstractC1140d;
import l0.AbstractC1380a;
import l0.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1380a.b f10195a = new AbstractC1380a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1380a.b f10197b = new AbstractC1380a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1380a.e f10199c = new AbstractC1380a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1380a.c f10201d = new AbstractC1380a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1380a.f f10203e = new AbstractC1380a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1380a.f f10205f = new AbstractC1380a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC1380a.f f10207g = new AbstractC1380a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1380a.f f10209h = new AbstractC1380a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC1380a.f f10211i = new AbstractC1380a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AbstractC1380a.f f10213j = new AbstractC1380a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AbstractC1380a.c f10214k = new AbstractC1380a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC1380a.c f10215l = new AbstractC1380a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AbstractC1380a.c f10216m = new AbstractC1380a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC1380a.c f10217n = new AbstractC1380a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AbstractC1380a.c f10218o = new AbstractC1380a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AbstractC1380a.c f10219p = new AbstractC1380a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AbstractC1380a.b f10220q = new AbstractC1380a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC1380a.b f10221r = new AbstractC1380a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AbstractC1380a.c f10222s = new AbstractC1380a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC1380a.f f10223t = new AbstractC1380a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC1380a.c f10224u = new AbstractC1380a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AbstractC1380a.b f10225v = new AbstractC1380a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AbstractC1380a.b f10226w = new AbstractC1380a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AbstractC1380a.f f10227x = new AbstractC1380a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AbstractC1380a.f f10228y = new AbstractC1380a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AbstractC1380a.f f10229z = new AbstractC1380a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AbstractC1380a.b f10169A = new AbstractC1380a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AbstractC1380a.b f10170B = new AbstractC1380a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final AbstractC1380a.d f10171C = new AbstractC1380a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final AbstractC1380a.b f10172D = new AbstractC1380a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final AbstractC1380a.b f10173E = new AbstractC1380a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final AbstractC1380a.b f10174F = new AbstractC1380a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final AbstractC1380a.b f10175G = new AbstractC1380a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final AbstractC1380a.e f10176H = new AbstractC1380a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final AbstractC1380a.e f10177I = new AbstractC1380a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final AbstractC1380a.h f10178J = new AbstractC1380a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final AbstractC1380a.h f10179K = new AbstractC1380a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final AbstractC1380a.g f10180L = new AbstractC1380a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final l.b f10181M = new l.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final l.a f10182N = new l.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final AbstractC1380a.h f10183O = new AbstractC1380a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final AbstractC1380a.i f10184P = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final AbstractC1380a.d f10185Q = new AbstractC1380a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final AbstractC1380a.d f10186R = new AbstractC1380a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final AbstractC1380a.h f10187S = new AbstractC1380a.h("FORCE_DARK", "FORCE_DARK");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final AbstractC1380a.d f10188T = new AbstractC1380a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final AbstractC1380a.d f10189U = new AbstractC1380a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final AbstractC1380a.d f10190V = new AbstractC1380a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final AbstractC1380a.d f10191W = new AbstractC1380a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final AbstractC1380a.d f10192X = new AbstractC1380a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final AbstractC1380a.d f10193Y = new AbstractC1380a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final AbstractC1380a.d f10194Z = new AbstractC1380a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final AbstractC1380a.d f10196a0 = new AbstractC1380a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final AbstractC1380a.d f10198b0 = new AbstractC1380a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final AbstractC1380a.d f10200c0 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final AbstractC1380a.d f10202d0 = new AbstractC1380a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final AbstractC1380a.d f10204e0 = new AbstractC1380a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final AbstractC1380a.d f10206f0 = new AbstractC1380a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final AbstractC1380a.d f10208g0 = new AbstractC1380a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final AbstractC1380a.d f10210h0 = new AbstractC1380a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final AbstractC1380a.d f10212i0 = new AbstractC1380a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    public class a extends AbstractC1380a.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Pattern f10230d;

        public a(String str, String str2) {
            super(str, str2);
            this.f10230d = Pattern.compile("\\A\\d+");
        }

        @Override // l0.AbstractC1380a
        public boolean d() {
            boolean zD = super.d();
            if (!zD || Build.VERSION.SDK_INT >= 29) {
                return zD;
            }
            PackageInfo packageInfoA = AbstractC1139c.a();
            if (packageInfoA == null) {
                return false;
            }
            Matcher matcher = this.f10230d.matcher(packageInfoA.versionName);
            return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends AbstractC1380a.d {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public boolean d() {
            if (super.d() && AbstractC1140d.a("MULTI_PROCESS")) {
                return AbstractC1139c.d();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, AbstractC1380a.e());
    }

    public static boolean c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (iVar.b().equals(str)) {
                hashSet.add(iVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((i) it2.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
