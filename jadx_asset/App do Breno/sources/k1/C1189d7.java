package k1;

import android.content.Intent;

/* JADX INFO: renamed from: k1.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1189d7 extends AbstractC1141A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l7 f9407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1189d7(l7 l7Var, InterfaceC1186d4 interfaceC1186d4) {
        super(interfaceC1186d4);
        this.f9407e = l7Var;
    }

    @Override // k1.AbstractC1141A
    public final void c() {
        l7 l7Var = this.f9407e;
        l7Var.e().h();
        String str = (String) l7Var.f9565q.pollFirst();
        if (str != null) {
            l7Var.f9547I = l7Var.f().b();
            l7Var.c().v().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            l7.Q(l7Var.d(), intent);
        }
        l7Var.P();
    }
}
