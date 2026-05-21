package k1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class D2 extends com.google.android.gms.common.internal.a {
    public D2(Context context, Looper looper, a.InterfaceC0114a interfaceC0114a, a.b bVar) {
        super(context, looper, 93, interfaceC0114a, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.a, T0.a.f
    public final int g() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1306s2 ? (InterfaceC1306s2) iInterfaceQueryLocalInterface : new C1298r2(iBinder);
    }
}
