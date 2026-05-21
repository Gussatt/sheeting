package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class H4 extends AbstractC0843r4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f6362b = Logger.getLogger(H4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6363c = R5.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I4 f6364a;

    public /* synthetic */ H4(G4 g4) {
    }

    public static int a(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public static int w(int i4, InterfaceC0860t5 interfaceC0860t5, E5 e5) {
        int iZ = z(i4 << 3);
        return iZ + iZ + ((AbstractC0804m4) interfaceC0860t5).d(e5);
    }

    public static int x(InterfaceC0860t5 interfaceC0860t5, E5 e5) {
        int iD = ((AbstractC0804m4) interfaceC0860t5).d(e5);
        return z(iD) + iD;
    }

    public static int y(String str) {
        int length;
        try {
            length = U5.c(str);
        } catch (T5 unused) {
            length = str.getBytes(AbstractC0717c5.f6667a).length;
        }
        return z(length) + length;
    }

    public static int z(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public final void b() {
        if (e() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c(String str, T5 t5) throws F4 {
        f6362b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) t5);
        byte[] bytes = str.getBytes(AbstractC0717c5.f6667a);
        try {
            int length = bytes.length;
            t(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new F4(e4);
        }
    }

    public abstract int e();

    public abstract void f(byte b4);

    public abstract void g(int i4, boolean z3);

    public abstract void h(int i4, A4 a4);

    public abstract void i(int i4, int i5);

    public abstract void j(int i4);

    public abstract void k(int i4, long j4);

    public abstract void l(long j4);

    public abstract void m(int i4, int i5);

    public abstract void n(int i4);

    public abstract void o(byte[] bArr, int i4, int i5);

    public abstract void p(int i4, InterfaceC0860t5 interfaceC0860t5, E5 e5);

    public abstract void q(int i4, String str);

    public abstract void r(int i4, int i5);

    public abstract void s(int i4, int i5);

    public abstract void t(int i4);

    public abstract void u(int i4, long j4);

    public abstract void v(long j4);
}
