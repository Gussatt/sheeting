package V0;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: V0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0560t extends AbstractDialogInterfaceOnClickListenerC0562v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f3717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f3718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3719c;

    public C0560t(Intent intent, Activity activity, int i4) {
        this.f3717a = intent;
        this.f3718b = activity;
        this.f3719c = i4;
    }

    @Override // V0.AbstractDialogInterfaceOnClickListenerC0562v
    public final void a() {
        Intent intent = this.f3717a;
        if (intent != null) {
            this.f3718b.startActivityForResult(intent, this.f3719c);
        }
    }
}
