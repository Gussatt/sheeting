package com.google.android.gms.common.internal;

import S0.C0504b;
import V0.AbstractC0549h;
import V0.B;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class j extends B {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f6258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f6259h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, int i4, IBinder iBinder, Bundle bundle) {
        super(aVar, i4, bundle);
        this.f6259h = aVar;
        this.f6258g = iBinder;
    }

    @Override // V0.B
    public final void f(C0504b c0504b) {
        if (this.f6259h.f6222v != null) {
            this.f6259h.f6222v.r(c0504b);
        }
        this.f6259h.L(c0504b);
    }

    @Override // V0.B
    public final boolean g() {
        try {
            IBinder iBinder = this.f6258g;
            AbstractC0549h.j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f6259h.E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f6259h.E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceS = this.f6259h.s(this.f6258g);
            if (iInterfaceS == null || !(a.g0(this.f6259h, 2, 4, iInterfaceS) || a.g0(this.f6259h, 3, 4, iInterfaceS))) {
                return false;
            }
            this.f6259h.f6226z = null;
            a aVar = this.f6259h;
            Bundle bundleX = aVar.x();
            if (aVar.f6221u == null) {
                return true;
            }
            this.f6259h.f6221u.u(bundleX);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
