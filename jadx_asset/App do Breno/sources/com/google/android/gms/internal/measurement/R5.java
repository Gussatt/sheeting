package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f6566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f6567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q5 f6569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f6571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f6572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f6573h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.R5.<clinit>():void");
    }

    public static boolean A(Class cls) {
        int i4 = AbstractC0820o4.f6909a;
        try {
            Class cls2 = f6567b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean B(Object obj, long j4) {
        return f6569d.g(obj, j4);
    }

    public static boolean C() {
        return f6571f;
    }

    public static boolean D() {
        return f6570e;
    }

    public static int E(Class cls) {
        if (f6571f) {
            return f6569d.f6558a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int a(Class cls) {
        if (f6571f) {
            return f6569d.f6558a.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Field b() {
        int i4 = AbstractC0820o4.f6909a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    public static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(Object obj, long j4, byte b4) {
        Unsafe unsafe = f6569d.f6558a;
        long j5 = (-4) & j4;
        int i4 = unsafe.getInt(obj, j5);
        int i5 = ((~((int) j4)) & 3) << 3;
        unsafe.putInt(obj, j5, ((255 & b4) << i5) | (i4 & (~(255 << i5))));
    }

    public static void e(Object obj, long j4, byte b4) {
        Unsafe unsafe = f6569d.f6558a;
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        unsafe.putInt(obj, j5, ((255 & b4) << i4) | (unsafe.getInt(obj, j5) & (~(255 << i4))));
    }

    public static double f(Object obj, long j4) {
        return f6569d.a(obj, j4);
    }

    public static float g(Object obj, long j4) {
        return f6569d.b(obj, j4);
    }

    public static int h(Object obj, long j4) {
        return f6569d.f6558a.getInt(obj, j4);
    }

    public static long i(Object obj, long j4) {
        return f6569d.f6558a.getLong(obj, j4);
    }

    public static Object j(Class cls) {
        try {
            return f6566a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object k(Object obj, long j4) {
        return f6569d.f6558a.getObject(obj, j4);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new N5());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(R5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void r(Object obj, long j4, boolean z3) {
        f6569d.c(obj, j4, z3);
    }

    public static void s(byte[] bArr, long j4, byte b4) {
        f6569d.d(bArr, f6572g + j4, b4);
    }

    public static void t(Object obj, long j4, double d4) {
        f6569d.e(obj, j4, d4);
    }

    public static void u(Object obj, long j4, float f4) {
        f6569d.f(obj, j4, f4);
    }

    public static void v(Object obj, long j4, int i4) {
        f6569d.f6558a.putInt(obj, j4, i4);
    }

    public static void w(Object obj, long j4, long j5) {
        f6569d.f6558a.putLong(obj, j4, j5);
    }

    public static void x(Object obj, long j4, Object obj2) {
        f6569d.f6558a.putObject(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j4) {
        return ((byte) ((f6569d.f6558a.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj, long j4) {
        return ((byte) ((f6569d.f6558a.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }
}
