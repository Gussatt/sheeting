package m1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f1.AbstractC0942a;
import f1.AbstractC0943b;

/* JADX INFO: renamed from: m1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1396e extends AbstractC0942a implements IInterface {
    public C1396e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void o1(h hVar, InterfaceC1395d interfaceC1395d) {
        Parcel parcelA = a();
        AbstractC0943b.c(parcelA, hVar);
        AbstractC0943b.d(parcelA, interfaceC1395d);
        r(12, parcelA);
    }
}
