package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f6257b;

    public i(a aVar, int i4) {
        this.f6257b = aVar;
        this.f6256a = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a aVar = this.f6257b;
        if (iBinder == null) {
            a.d0(aVar, 16);
            return;
        }
        synchronized (aVar.f6214n) {
            try {
                a aVar2 = this.f6257b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f6215o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new g(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6257b.e0(0, null, this.f6256a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6257b.f6214n) {
            this.f6257b.f6215o = null;
        }
        a aVar = this.f6257b;
        int i4 = this.f6256a;
        Handler handler = aVar.f6212l;
        handler.sendMessage(handler.obtainMessage(6, i4, 1));
    }
}
