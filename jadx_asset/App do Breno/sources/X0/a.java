package X0;

import V0.C0553l;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f1.AbstractC0942a;
import f1.AbstractC0943b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0942a implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void o1(C0553l c0553l) {
        Parcel parcelA = a();
        AbstractC0943b.c(parcelA, c0553l);
        u(1, parcelA);
    }
}
