package k1;

import com.google.android.gms.internal.measurement.C0778j3;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class X6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC1317t5 f9300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0778j3 f9301d;

    public X6(String str, Map map, EnumC1317t5 enumC1317t5, C0778j3 c0778j3) {
        this.f9298a = str;
        this.f9299b = map;
        this.f9300c = enumC1317t5;
        this.f9301d = c0778j3;
    }

    public final EnumC1317t5 a() {
        return this.f9300c;
    }

    public final C0778j3 b() {
        return this.f9301d;
    }

    public final String c() {
        return this.f9298a;
    }

    public final Map d() {
        Map map = this.f9299b;
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
