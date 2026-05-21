package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import g1.AbstractC0961a;
import g1.AbstractC0964d;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0961a implements IAccountAccessor {
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account b() {
        Parcel parcelA = a(2, r());
        Account account = (Account) AbstractC0964d.a(parcelA, Account.CREATOR);
        parcelA.recycle();
        return account;
    }
}
