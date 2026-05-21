package k1;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class g7 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l7 f9449a;

    public g7(l7 l7Var) {
        this.f9449a = l7Var;
    }

    @Override // k1.v7
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f9449a.e().A(new RunnableC1207f7(this, str, str2, bundle));
            return;
        }
        l7 l7Var = this.f9449a;
        if (l7Var.f9560l != null) {
            l7Var.f9560l.c().r().b("AppId not known when logging event", str2);
        }
    }
}
