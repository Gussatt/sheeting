package e1;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: e1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0928c extends AbstractC0926a implements InterfaceC0929d {
    public C0928c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // e1.InterfaceC0929d
    public final String c() {
        Parcel parcelR = r(1, a());
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // e1.InterfaceC0929d
    public final boolean h0(boolean z3) {
        Parcel parcelA = a();
        AbstractC0927b.a(parcelA, true);
        Parcel parcelR = r(2, parcelA);
        boolean zB = AbstractC0927b.b(parcelR);
        parcelR.recycle();
        return zB;
    }
}
