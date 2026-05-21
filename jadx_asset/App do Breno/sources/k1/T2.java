package k1;

import V0.AbstractC0549h;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z2 f9236e;

    public T2(Z2 z22, String str, boolean z3) {
        this.f9236e = z22;
        AbstractC0549h.d(str);
        this.f9232a = str;
        this.f9233b = z3;
    }

    public final void a(boolean z3) {
        SharedPreferences.Editor editorEdit = this.f9236e.p().edit();
        editorEdit.putBoolean(this.f9232a, z3);
        editorEdit.apply();
        this.f9235d = z3;
    }

    public final boolean b() {
        if (!this.f9234c) {
            this.f9234c = true;
            Z2 z22 = this.f9236e;
            this.f9235d = z22.p().getBoolean(this.f9232a, this.f9233b);
        }
        return this.f9235d;
    }
}
