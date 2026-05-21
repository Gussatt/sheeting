package k1;

import V0.AbstractC0549h;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class X2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z2 f9291d;

    public X2(Z2 z22, String str, String str2) {
        this.f9291d = z22;
        AbstractC0549h.d(str);
        this.f9288a = str;
    }

    public final String a() {
        if (!this.f9289b) {
            this.f9289b = true;
            Z2 z22 = this.f9291d;
            this.f9290c = z22.p().getString(this.f9288a, null);
        }
        return this.f9290c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f9291d.p().edit();
        editorEdit.putString(this.f9288a, str);
        editorEdit.apply();
        this.f9290c = str;
    }
}
