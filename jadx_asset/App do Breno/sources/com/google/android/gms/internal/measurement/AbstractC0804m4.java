package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0804m4 implements InterfaceC0860t5 {
    protected int zza = 0;

    public static void h(Iterable iterable, List list) {
        AbstractC0796l4.l(iterable, list);
    }

    public abstract int d(E5 e5);

    public final byte[] i() {
        try {
            int iC = c();
            byte[] bArr = new byte[iC];
            Logger logger = H4.f6362b;
            E4 e4 = new E4(bArr, 0, iC);
            b(e4);
            e4.b();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e5);
        }
    }
}
