package com.google.android.gms.signin.internal;

import O.h;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import f1.AbstractC0943b;
import m1.InterfaceC1395d;
import m1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class zad extends zab implements InterfaceC1395d {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean o1(int i4, Parcel parcel, Parcel parcel2, int i5) {
        switch (i4) {
            case 3:
                AbstractC0943b.b(parcel);
                break;
            case h.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0943b.b(parcel);
                break;
            case h.STRING_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0943b.b(parcel);
                break;
            case h.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0943b.b(parcel);
                break;
            case h.BYTES_FIELD_NUMBER /* 8 */:
                j jVar = (j) AbstractC0943b.a(parcel, j.CREATOR);
                AbstractC0943b.b(parcel);
                J0(jVar);
                break;
            case 9:
                AbstractC0943b.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
