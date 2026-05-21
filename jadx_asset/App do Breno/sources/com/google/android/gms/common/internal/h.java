package com.google.android.gms.common.internal;

import S0.C0504b;
import V0.M;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import g1.HandlerC0965e;

/* JADX INFO: loaded from: classes.dex */
public final class h extends HandlerC0965e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f6255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, Looper looper) {
        super(looper);
        this.f6255b = aVar;
    }

    public static final void a(Message message) {
        M m4 = (M) message.obj;
        m4.b();
        m4.e();
    }

    public static final boolean b(Message message) {
        int i4 = message.what;
        return i4 == 2 || i4 == 1 || i4 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f6255b.f6200C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i4 = message.what;
        if ((i4 == 1 || i4 == 7 || ((i4 == 4 && !this.f6255b.t()) || message.what == 5)) && !this.f6255b.h()) {
            a(message);
            return;
        }
        int i5 = message.what;
        if (i5 == 4) {
            this.f6255b.f6226z = new C0504b(message.arg2);
            if (a.h0(this.f6255b)) {
                a aVar = this.f6255b;
                if (!aVar.f6198A) {
                    aVar.i0(3, null);
                    return;
                }
            }
            a aVar2 = this.f6255b;
            C0504b c0504b = aVar2.f6226z != null ? aVar2.f6226z : new C0504b(8);
            this.f6255b.f6216p.a(c0504b);
            this.f6255b.L(c0504b);
            return;
        }
        if (i5 == 5) {
            a aVar3 = this.f6255b;
            C0504b c0504b2 = aVar3.f6226z != null ? aVar3.f6226z : new C0504b(8);
            this.f6255b.f6216p.a(c0504b2);
            this.f6255b.L(c0504b2);
            return;
        }
        if (i5 == 3) {
            Object obj = message.obj;
            C0504b c0504b3 = new C0504b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f6255b.f6216p.a(c0504b3);
            this.f6255b.L(c0504b3);
            return;
        }
        if (i5 == 6) {
            this.f6255b.i0(5, null);
            a aVar4 = this.f6255b;
            if (aVar4.f6221u != null) {
                aVar4.f6221u.a(message.arg2);
            }
            this.f6255b.M(message.arg2);
            a.g0(this.f6255b, 5, 1, null);
            return;
        }
        if (i5 == 2 && !this.f6255b.b()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((M) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
