package k1;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class X4 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9295a;

    public X4(C1238j5 c1238j5) {
        this.f9295a = c1238j5;
    }

    @Override // k1.v7
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f9295a.C("auto", "_err", bundle);
        } else {
            this.f9295a.E("auto", "_err", bundle, str);
        }
    }
}
