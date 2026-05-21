package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class V4 extends AbstractC0804m4 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected L5 zzc = L5.c();

    public static void A(Class cls, V4 v4) {
        v4.z();
        zzb.put(cls, v4);
    }

    public static final boolean D(V4 v4, boolean z3) {
        byte bByteValue = ((Byte) v4.E(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = B5.a().b(v4.getClass()).h(v4);
        if (z3) {
            v4.E(2, true != zH ? null : v4, null);
        }
        return zH;
    }

    public static V4 p(Class cls) {
        Map map = zzb;
        V4 v4 = (V4) map.get(cls);
        if (v4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                v4 = (V4) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (v4 != null) {
            return v4;
        }
        V4 v42 = (V4) ((V4) R5.j(cls)).E(6, null, null);
        if (v42 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, v42);
        return v42;
    }

    public static Z4 r() {
        return W4.g();
    }

    public static InterfaceC0699a5 s() {
        return C0771i5.f();
    }

    public static InterfaceC0699a5 t(InterfaceC0699a5 interfaceC0699a5) {
        int size = interfaceC0699a5.size();
        return interfaceC0699a5.e(size + size);
    }

    public static InterfaceC0708b5 u() {
        return C5.f();
    }

    public static InterfaceC0708b5 v(InterfaceC0708b5 interfaceC0708b5) {
        int size = interfaceC0708b5.size();
        return interfaceC0708b5.e(size + size);
    }

    public static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object x(InterfaceC0860t5 interfaceC0860t5, String str, Object[] objArr) {
        return new D5(interfaceC0860t5, str, objArr);
    }

    public final void B(int i4) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean C() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object E(int i4, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.InterfaceC0868u5
    public final /* synthetic */ InterfaceC0860t5 a() {
        return (V4) E(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0860t5
    public final void b(H4 h4) {
        B5.a().b(getClass()).c(this, I4.K(h4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0860t5
    public final int c() {
        if (C()) {
            int iK = k(null);
            if (iK >= 0) {
                return iK;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iK);
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int iK2 = k(null);
        if (iK2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iK2;
            return iK2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iK2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0804m4
    public final int d(E5 e5) {
        if (C()) {
            int iB = e5.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iB);
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int iB2 = e5.b(this);
        if (iB2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iB2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return B5.a().b(getClass()).g(this, (V4) obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0860t5
    public final /* synthetic */ InterfaceC0852s5 g() {
        return (S4) E(5, null, null);
    }

    public final int hashCode() {
        if (C()) {
            return m();
        }
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int iM = m();
        this.zza = iM;
        return iM;
    }

    public final int k(E5 e5) {
        return B5.a().b(getClass()).b(this);
    }

    public final boolean l() {
        return D(this, true);
    }

    public final int m() {
        return B5.a().b(getClass()).i(this);
    }

    public final S4 n() {
        return (S4) E(5, null, null);
    }

    public final S4 o() {
        S4 s4 = (S4) E(5, null, null);
        s4.o(this);
        return s4;
    }

    public final V4 q() {
        return (V4) E(4, null, null);
    }

    public final String toString() {
        return AbstractC0876v5.a(this, super.toString());
    }

    public final void y() {
        B5.a().b(getClass()).a(this);
        z();
    }

    public final void z() {
        this.zzd &= Integer.MAX_VALUE;
    }
}
