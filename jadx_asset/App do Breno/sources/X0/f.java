package X0;

import S0.C0506d;
import U0.InterfaceC0520d;
import U0.InterfaceC0527k;
import V0.C0543b;
import V0.C0556o;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import f1.AbstractC0944c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.c {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0556o f3930I;

    public f(Context context, Looper looper, C0543b c0543b, C0556o c0556o, InterfaceC0520d interfaceC0520d, InterfaceC0527k interfaceC0527k) {
        super(context, looper, 270, c0543b, interfaceC0520d, interfaceC0527k);
        this.f3930I = c0556o;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle A() {
        return this.f3930I.b();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean I() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a, T0.a.f
    public final int g() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final C0506d[] v() {
        return AbstractC0944c.f7203b;
    }
}
