package V0;

import U0.InterfaceC0524h;
import android.content.Intent;

/* JADX INFO: renamed from: V0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0561u extends AbstractDialogInterfaceOnClickListenerC0562v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f3720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0524h f3721b;

    public C0561u(Intent intent, InterfaceC0524h interfaceC0524h, int i4) {
        this.f3720a = intent;
        this.f3721b = interfaceC0524h;
    }

    @Override // V0.AbstractDialogInterfaceOnClickListenerC0562v
    public final void a() {
        Intent intent = this.f3720a;
        if (intent != null) {
            this.f3721b.startActivityForResult(intent, 2);
        }
    }
}
