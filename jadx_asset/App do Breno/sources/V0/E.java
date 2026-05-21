package V0;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import g1.AbstractC0961a;
import g1.AbstractC0964d;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0961a implements F {
    public E(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // V0.F
    public final S0.G K(S0.E e4) {
        Parcel parcelR = r();
        AbstractC0964d.c(parcelR, e4);
        Parcel parcelA = a(6, parcelR);
        S0.G g4 = (S0.G) AbstractC0964d.a(parcelA, S0.G.CREATOR);
        parcelA.recycle();
        return g4;
    }

    @Override // V0.F
    public final boolean U(S0.I i4, IObjectWrapper iObjectWrapper) {
        Parcel parcelR = r();
        AbstractC0964d.c(parcelR, i4);
        AbstractC0964d.e(parcelR, iObjectWrapper);
        Parcel parcelA = a(5, parcelR);
        boolean zF = AbstractC0964d.f(parcelA);
        parcelA.recycle();
        return zF;
    }

    @Override // V0.F
    public final boolean g() {
        Parcel parcelA = a(7, r());
        boolean zF = AbstractC0964d.f(parcelA);
        parcelA.recycle();
        return zF;
    }

    @Override // V0.F
    public final S0.G q0(S0.E e4) {
        Parcel parcelR = r();
        AbstractC0964d.c(parcelR, e4);
        Parcel parcelA = a(8, parcelR);
        S0.G g4 = (S0.G) AbstractC0964d.a(parcelA, S0.G.CREATOR);
        parcelA.recycle();
        return g4;
    }
}
