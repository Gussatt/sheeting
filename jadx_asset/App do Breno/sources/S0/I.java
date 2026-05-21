package S0;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class I extends W0.a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z f3410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3412p;

    public I(String str, z zVar, boolean z3, boolean z4) {
        this.f3409m = str;
        this.f3410n = zVar;
        this.f3411o = z3;
        this.f3412p = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String str = this.f3409m;
        int iA = W0.c.a(parcel);
        W0.c.p(parcel, 1, str, false);
        z zVar = this.f3410n;
        if (zVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zVar = null;
        }
        W0.c.i(parcel, 2, zVar, false);
        W0.c.c(parcel, 3, this.f3411o);
        W0.c.c(parcel, 4, this.f3412p);
        W0.c.b(parcel, iA);
    }

    public I(String str, IBinder iBinder, boolean z3, boolean z4) {
        this.f3409m = str;
        A a4 = null;
        if (iBinder != null) {
            try {
                IObjectWrapper iObjectWrapperD = zzz.zzg(iBinder).d();
                byte[] bArr = iObjectWrapperD == null ? null : (byte[]) ObjectWrapper.unwrap(iObjectWrapperD);
                if (bArr != null) {
                    a4 = new A(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e4) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e4);
            }
        }
        this.f3410n = a4;
        this.f3411o = z3;
        this.f3412p = z4;
    }
}
