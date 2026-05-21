package U0;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
public final class V extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f3534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f3535b;

    public V(W w4, Dialog dialog) {
        this.f3535b = w4;
        this.f3534a = dialog;
    }

    @Override // U0.E
    public final void a() {
        this.f3535b.f3537n.o();
        if (this.f3534a.isShowing()) {
            this.f3534a.dismiss();
        }
    }
}
