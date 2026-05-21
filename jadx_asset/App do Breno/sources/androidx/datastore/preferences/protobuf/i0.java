package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f4763a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f4764b = AbstractC0582d.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f4765c = m(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f4766d = m(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f4767e = y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f4768f = Q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f4769g = P();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f4770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f4771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f4772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f4773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f4774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f4775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f4776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f4777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f4778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f4779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f4780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f4781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f4782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f4783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f4784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f4785w;

    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j4) {
            return i0.f4785w ? i0.q(obj, j4) : i0.r(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j4) {
            return Double.longBitsToDouble(g(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j4) {
            return Float.intBitsToFloat(f(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j4, boolean z3) {
            if (i0.f4785w) {
                i0.F(obj, j4, z3);
            } else {
                i0.G(obj, j4, z3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j4, byte b4) {
            if (i0.f4785w) {
                i0.I(obj, j4, b4);
            } else {
                i0.J(obj, j4, b4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j4, double d4) {
            o(obj, j4, Double.doubleToLongBits(d4));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j4, float f4) {
            n(obj, j4, Float.floatToIntBits(f4));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j4) {
            return i0.f4785w ? i0.q(obj, j4) : i0.r(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j4) {
            return Double.longBitsToDouble(g(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j4) {
            return Float.intBitsToFloat(f(obj, j4));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j4, boolean z3) {
            if (i0.f4785w) {
                i0.F(obj, j4, z3);
            } else {
                i0.G(obj, j4, z3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j4, byte b4) {
            if (i0.f4785w) {
                i0.I(obj, j4, b4);
            } else {
                i0.J(obj, j4, b4);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j4, double d4) {
            o(obj, j4, Double.doubleToLongBits(d4));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j4, float f4) {
            n(obj, j4, Float.floatToIntBits(f4));
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean c(Object obj, long j4) {
            return this.f4786a.getBoolean(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public double d(Object obj, long j4) {
            return this.f4786a.getDouble(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public float e(Object obj, long j4) {
            return this.f4786a.getFloat(obj, j4);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void j(Object obj, long j4, boolean z3) {
            this.f4786a.putBoolean(obj, j4, z3);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void k(Object obj, long j4, byte b4) {
            this.f4786a.putByte(obj, j4, b4);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void l(Object obj, long j4, double d4) {
            this.f4786a.putDouble(obj, j4, d4);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public void m(Object obj, long j4, float f4) {
            this.f4786a.putFloat(obj, j4, f4);
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f4786a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                i0.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f4786a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                i0.D(th);
                return false;
            }
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f4786a;

        public e(Unsafe unsafe) {
            this.f4786a = unsafe;
        }

        public final int a(Class cls) {
            return this.f4786a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f4786a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j4);

        public abstract double d(Object obj, long j4);

        public abstract float e(Object obj, long j4);

        public final int f(Object obj, long j4) {
            return this.f4786a.getInt(obj, j4);
        }

        public final long g(Object obj, long j4) {
            return this.f4786a.getLong(obj, j4);
        }

        public final Object h(Object obj, long j4) {
            return this.f4786a.getObject(obj, j4);
        }

        public final long i(Field field) {
            return this.f4786a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j4, boolean z3);

        public abstract void k(Object obj, long j4, byte b4);

        public abstract void l(Object obj, long j4, double d4);

        public abstract void m(Object obj, long j4, float f4);

        public final void n(Object obj, long j4, int i4) {
            this.f4786a.putInt(obj, j4, i4);
        }

        public final void o(Object obj, long j4, long j5) {
            this.f4786a.putLong(obj, j4, j5);
        }

        public final void p(Object obj, long j4, Object obj2) {
            this.f4786a.putObject(obj, j4, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f4786a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                i0.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.f4786a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return i0.l() != null;
            } catch (Throwable th) {
                i0.D(th);
                return false;
            }
        }
    }

    static {
        long j4 = j(byte[].class);
        f4770h = j4;
        f4771i = j(boolean[].class);
        f4772j = k(boolean[].class);
        f4773k = j(int[].class);
        f4774l = k(int[].class);
        f4775m = j(long[].class);
        f4776n = k(long[].class);
        f4777o = j(float[].class);
        f4778p = k(float[].class);
        f4779q = j(double[].class);
        f4780r = k(double[].class);
        f4781s = j(Object[].class);
        f4782t = k(Object[].class);
        f4783u = o(l());
        f4784v = (int) (j4 & 7);
        f4785w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean B() {
        return f4769g;
    }

    public static boolean C() {
        return f4768f;
    }

    public static void D(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void E(Object obj, long j4, boolean z3) {
        f4767e.j(obj, j4, z3);
    }

    public static void F(Object obj, long j4, boolean z3) {
        I(obj, j4, z3 ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j4, boolean z3) {
        J(obj, j4, z3 ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j4, byte b4) {
        f4767e.k(bArr, f4770h + j4, b4);
    }

    public static void I(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int iW = w(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        M(obj, j5, ((255 & b4) << i4) | (iW & (~(255 << i4))));
    }

    public static void J(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        M(obj, j5, ((255 & b4) << i4) | (w(obj, j5) & (~(255 << i4))));
    }

    public static void K(Object obj, long j4, double d4) {
        f4767e.l(obj, j4, d4);
    }

    public static void L(Object obj, long j4, float f4) {
        f4767e.m(obj, j4, f4);
    }

    public static void M(Object obj, long j4, int i4) {
        f4767e.n(obj, j4, i4);
    }

    public static void N(Object obj, long j4, long j5) {
        f4767e.o(obj, j4, j5);
    }

    public static void O(Object obj, long j4, Object obj2) {
        f4767e.p(obj, j4, obj2);
    }

    public static boolean P() {
        e eVar = f4767e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    public static boolean Q() {
        e eVar = f4767e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static Object i(Class cls) {
        try {
            return f4763a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static int j(Class cls) {
        if (f4769g) {
            return f4767e.a(cls);
        }
        return -1;
    }

    public static int k(Class cls) {
        if (f4769g) {
            return f4767e.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field fieldN;
        if (AbstractC0582d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    public static boolean m(Class cls) {
        if (!AbstractC0582d.c()) {
            return false;
        }
        try {
            Class cls2 = f4764b;
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

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f4767e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    public static boolean p(Object obj, long j4) {
        return f4767e.c(obj, j4);
    }

    public static boolean q(Object obj, long j4) {
        return s(obj, j4) != 0;
    }

    public static boolean r(Object obj, long j4) {
        return t(obj, j4) != 0;
    }

    public static byte s(Object obj, long j4) {
        return (byte) ((w(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255);
    }

    public static byte t(Object obj, long j4) {
        return (byte) ((w(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255);
    }

    public static double u(Object obj, long j4) {
        return f4767e.d(obj, j4);
    }

    public static float v(Object obj, long j4) {
        return f4767e.e(obj, j4);
    }

    public static int w(Object obj, long j4) {
        return f4767e.f(obj, j4);
    }

    public static long x(Object obj, long j4) {
        return f4767e.g(obj, j4);
    }

    public static e y() {
        Unsafe unsafe = f4763a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC0582d.c()) {
            return new d(unsafe);
        }
        if (f4765c) {
            return new c(unsafe);
        }
        if (f4766d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object z(Object obj, long j4) {
        return f4767e.h(obj, j4);
    }
}
