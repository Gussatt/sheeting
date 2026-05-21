package k1;

import V0.AbstractC0549h;
import android.content.SharedPreferences;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z2 f9280e;

    public /* synthetic */ W2(Z2 z22, String str, long j4, Y2 y22) {
        this.f9280e = z22;
        AbstractC0549h.d("health_monitor");
        AbstractC0549h.a(j4 > 0);
        this.f9276a = "health_monitor:start";
        this.f9277b = "health_monitor:count";
        this.f9278c = "health_monitor:value";
        this.f9279d = j4;
    }

    public final Pair a() {
        long jAbs;
        Z2 z22 = this.f9280e;
        z22.h();
        z22.h();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - z22.f9366a.f().a());
        }
        long j4 = this.f9279d;
        if (jAbs < j4) {
            return null;
        }
        if (jAbs > j4 + j4) {
            d();
            return null;
        }
        String string = z22.p().getString(this.f9278c, null);
        long j5 = z22.p().getLong(this.f9277b, 0L);
        d();
        return (string == null || j5 <= 0) ? Z2.f9309B : new Pair(string, Long.valueOf(j5));
    }

    public final void b(String str, long j4) {
        Z2 z22 = this.f9280e;
        z22.h();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesP = z22.p();
        String str2 = this.f9277b;
        long j5 = sharedPreferencesP.getLong(str2, 0L);
        if (j5 <= 0) {
            SharedPreferences.Editor editorEdit = z22.p().edit();
            editorEdit.putString(this.f9278c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = z22.f9366a.Q().x().nextLong() & Long.MAX_VALUE;
        long j6 = j5 + 1;
        long j7 = Long.MAX_VALUE / j6;
        SharedPreferences.Editor editorEdit2 = z22.p().edit();
        if (jNextLong < j7) {
            editorEdit2.putString(this.f9278c, str);
        }
        editorEdit2.putLong(str2, j6);
        editorEdit2.apply();
    }

    public final long c() {
        return this.f9280e.p().getLong(this.f9276a, 0L);
    }

    public final void d() {
        Z2 z22 = this.f9280e;
        z22.h();
        long jA = z22.f9366a.f().a();
        SharedPreferences.Editor editorEdit = z22.p().edit();
        editorEdit.remove(this.f9277b);
        editorEdit.remove(this.f9278c);
        editorEdit.putLong(this.f9276a, jA);
        editorEdit.apply();
    }
}
