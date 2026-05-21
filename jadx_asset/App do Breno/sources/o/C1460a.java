package o;

import android.os.Bundle;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1460a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f10711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f10712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f10713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10714d;

    /* JADX INFO: renamed from: o.a$a, reason: collision with other inner class name */
    public static final class C0142a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f10715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f10716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f10718d;

        public C1460a a() {
            return new C1460a(this.f10715a, this.f10716b, this.f10717c, this.f10718d);
        }
    }

    public C1460a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f10711a = num;
        this.f10712b = num2;
        this.f10713c = num3;
        this.f10714d = num4;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f10711a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f10712b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f10713c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f10714d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
