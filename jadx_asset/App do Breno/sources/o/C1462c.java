package o;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import o.C1460a;
import t.AbstractC1537a;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1462c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f10719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f10720b;

    /* JADX INFO: renamed from: o.c$a */
    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: renamed from: o.c$b */
    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o.c$c, reason: collision with other inner class name */
    public static class C0143c {
        public static void a(ActivityOptions activityOptions, boolean z3) {
            activityOptions.setShareIdentityEnabled(z3);
        }
    }

    /* JADX INFO: renamed from: o.c$d */
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f10723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ActivityOptions f10724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList f10725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray f10726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f10727g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f10730j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f10721a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1460a.C0142a f10722b = new C1460a.C0142a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f10728h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f10729i = true;

        public C1462c a() {
            if (!this.f10721a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f10723c;
            if (arrayList != null) {
                this.f10721a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f10725e;
            if (arrayList2 != null) {
                this.f10721a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f10721a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f10729i);
            this.f10721a.putExtras(this.f10722b.a().a());
            Bundle bundle = this.f10727g;
            if (bundle != null) {
                this.f10721a.putExtras(bundle);
            }
            if (this.f10726f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f10726f);
                this.f10721a.putExtras(bundle2);
            }
            this.f10721a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f10728h);
            int i4 = Build.VERSION.SDK_INT;
            b();
            if (i4 >= 34) {
                d();
            }
            ActivityOptions activityOptions = this.f10724d;
            return new C1462c(this.f10721a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f10721a.hasExtra("com.android.browser.headers") ? this.f10721a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f10721a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f10721a.putExtras(bundle);
        }

        public final void d() {
            if (this.f10724d == null) {
                this.f10724d = a.a();
            }
            C0143c.a(this.f10724d, this.f10730j);
        }

        public d e(boolean z3) {
            this.f10721a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z3 ? 1 : 0);
            return this;
        }
    }

    public C1462c(Intent intent, Bundle bundle) {
        this.f10719a = intent;
        this.f10720b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f10719a.setData(uri);
        AbstractC1537a.g(context, this.f10719a, this.f10720b);
    }
}
