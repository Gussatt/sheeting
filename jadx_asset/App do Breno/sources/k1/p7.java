package k1;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.R2 f9662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f9664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC1317t5 f9665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9668h;

    public /* synthetic */ p7(long j4, com.google.android.gms.internal.measurement.R2 r22, String str, Map map, EnumC1317t5 enumC1317t5, long j5, long j6, long j7, int i4, o7 o7Var) {
        this.f9661a = j4;
        this.f9662b = r22;
        this.f9663c = str;
        this.f9664d = map;
        this.f9665e = enumC1317t5;
        this.f9666f = j6;
        this.f9667g = j7;
        this.f9668h = i4;
    }

    public final int a() {
        return this.f9668h;
    }

    public final long b() {
        return this.f9667g;
    }

    public final long c() {
        return this.f9661a;
    }

    public final EnumC1317t5 d() {
        return this.f9665e;
    }

    public final Q6 e() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f9664d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j4 = this.f9661a;
        com.google.android.gms.internal.measurement.R2 r22 = this.f9662b;
        String str = this.f9663c;
        EnumC1317t5 enumC1317t5 = this.f9665e;
        return new Q6(j4, r22.i(), str, bundle, enumC1317t5.d(), this.f9666f, "");
    }

    public final X6 f() {
        return new X6(this.f9663c, this.f9664d, this.f9665e, null);
    }

    public final com.google.android.gms.internal.measurement.R2 g() {
        return this.f9662b;
    }

    public final String h() {
        return this.f9663c;
    }
}
