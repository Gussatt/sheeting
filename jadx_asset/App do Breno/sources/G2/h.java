package G2;

import G2.a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import o.AbstractC1461b;
import o.C1462c;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f1661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f1662c;

    public interface a {
        String a(Intent intent);
    }

    public h(Context context, a aVar) {
        this.f1660a = context;
        this.f1661b = aVar;
    }

    public static /* synthetic */ String n(Context context, Intent intent) {
        ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
        if (componentNameResolveActivity == null) {
            return null;
        }
        return componentNameResolveActivity.toShortString();
    }

    public static boolean o(Map map) {
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "accept":
                case "content-language":
                case "content-type":
                case "accept-language":
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    public static Bundle q(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static boolean r(Context context, Uri uri, Bundle bundle, a.C0047a c0047a) {
        C1462c c1462cA = new C1462c.d().e(c0047a.b().booleanValue()).a();
        c1462cA.f10719a.putExtra("com.android.browser.headers", bundle);
        try {
            c1462cA.a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // G2.a.d
    public Boolean e(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return this.f1661b.a(intent) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    @Override // G2.a.d
    public void h() {
        this.f1660a.sendBroadcast(new Intent("close action"));
    }

    @Override // G2.a.d
    public Boolean j(String str, Map map) {
        p();
        try {
            this.f1662c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", q(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // G2.a.d
    public Boolean l() {
        return Boolean.valueOf(AbstractC1461b.a(this.f1660a, Collections.EMPTY_LIST) != null);
    }

    @Override // G2.a.d
    public Boolean m(String str, Boolean bool, a.e eVar, a.C0047a c0047a) {
        p();
        Bundle bundleQ = q(eVar.d());
        if (bool.booleanValue() && !o(eVar.d())) {
            if (r(this.f1662c, Uri.parse(str), bundleQ, c0047a)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f1662c.startActivity(WebViewActivity.a(this.f1662c, str, eVar.c().booleanValue(), eVar.b().booleanValue(), bundleQ));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public final void p() {
        if (this.f1662c == null) {
            throw new a.b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    public void s(Activity activity) {
        this.f1662c = activity;
    }

    public h(final Context context) {
        this(context, new a() { // from class: G2.g
            @Override // G2.h.a
            public final String a(Intent intent) {
                return h.n(context, intent);
            }
        });
    }
}
