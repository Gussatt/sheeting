package k1;

import V0.AbstractC0549h;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class V2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z2 f9263e;

    public V2(Z2 z22, String str, long j4) {
        this.f9263e = z22;
        AbstractC0549h.d(str);
        this.f9259a = str;
        this.f9260b = j4;
    }

    public final long a() {
        if (!this.f9261c) {
            this.f9261c = true;
            Z2 z22 = this.f9263e;
            this.f9262d = z22.p().getLong(this.f9259a, this.f9260b);
        }
        return this.f9262d;
    }

    public final void b(long j4) {
        SharedPreferences.Editor editorEdit = this.f9263e.p().edit();
        editorEdit.putLong(this.f9259a, j4);
        editorEdit.apply();
        this.f9262d = j4;
    }
}
