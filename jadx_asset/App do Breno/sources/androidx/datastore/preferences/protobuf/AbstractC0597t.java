package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0579a;
import androidx.datastore.preferences.protobuf.AbstractC0598u;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0597t extends AbstractC0579a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0597t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected g0 unknownFields = g0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static abstract class a extends AbstractC0579a.AbstractC0089a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AbstractC0597t f4911m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public AbstractC0597t f4912n;

        public a(AbstractC0597t abstractC0597t) {
            this.f4911m = abstractC0597t;
            if (abstractC0597t.C()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f4912n = s();
        }

        public static void r(Object obj, Object obj2) {
            U.a().d(obj).a(obj, obj2);
        }

        private AbstractC0597t s() {
            return this.f4911m.I();
        }

        public final AbstractC0597t l() {
            AbstractC0597t abstractC0597tD = d();
            if (abstractC0597tD.A()) {
                return abstractC0597tD;
            }
            throw AbstractC0579a.AbstractC0089a.k(abstractC0597tD);
        }

        @Override // androidx.datastore.preferences.protobuf.J.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public AbstractC0597t d() {
            if (!this.f4912n.C()) {
                return this.f4912n;
            }
            this.f4912n.D();
            return this.f4912n;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarG = b().g();
            aVarG.f4912n = d();
            return aVarG;
        }

        public final void o() {
            if (this.f4912n.C()) {
                return;
            }
            p();
        }

        public void p() {
            AbstractC0597t abstractC0597tS = s();
            r(abstractC0597tS, this.f4912n);
            this.f4912n = abstractC0597tS;
        }

        @Override // androidx.datastore.preferences.protobuf.K
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public AbstractC0597t b() {
            return this.f4911m;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    public static class b extends AbstractC0580b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC0597t f4913b;

        public b(AbstractC0597t abstractC0597t) {
            this.f4913b = abstractC0597t;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static class c extends AbstractC0589k {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final boolean B(AbstractC0597t abstractC0597t, boolean z3) {
        byte bByteValue = ((Byte) abstractC0597t.q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = U.a().d(abstractC0597t).e(abstractC0597t);
        if (z3) {
            abstractC0597t.r(d.SET_MEMOIZED_IS_INITIALIZED, zE ? abstractC0597t : null);
        }
        return zE;
    }

    public static AbstractC0598u.b F(AbstractC0598u.b bVar) {
        int size = bVar.size();
        return bVar.n(size == 0 ? 10 : size * 2);
    }

    public static Object H(J j4, String str, Object[] objArr) {
        return new W(j4, str, objArr);
    }

    public static AbstractC0597t J(AbstractC0597t abstractC0597t, InputStream inputStream) {
        return k(K(abstractC0597t, AbstractC0585g.g(inputStream), C0591m.b()));
    }

    public static AbstractC0597t K(AbstractC0597t abstractC0597t, AbstractC0585g abstractC0585g, C0591m c0591m) throws C0599v {
        AbstractC0597t abstractC0597tI = abstractC0597t.I();
        try {
            Y yD = U.a().d(abstractC0597tI);
            yD.b(abstractC0597tI, C0586h.O(abstractC0585g), c0591m);
            yD.d(abstractC0597tI);
            return abstractC0597tI;
        } catch (e0 e4) {
            throw e4.a().k(abstractC0597tI);
        } catch (C0599v e5) {
            e = e5;
            if (e.a()) {
                e = new C0599v(e);
            }
            throw e.k(abstractC0597tI);
        } catch (IOException e6) {
            if (e6.getCause() instanceof C0599v) {
                throw ((C0599v) e6.getCause());
            }
            throw new C0599v(e6).k(abstractC0597tI);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof C0599v) {
                throw ((C0599v) e7.getCause());
            }
            throw e7;
        }
    }

    public static void L(Class cls, AbstractC0597t abstractC0597t) {
        abstractC0597t.E();
        defaultInstanceMap.put(cls, abstractC0597t);
    }

    public static AbstractC0597t k(AbstractC0597t abstractC0597t) throws C0599v {
        if (abstractC0597t == null || abstractC0597t.A()) {
            return abstractC0597t;
        }
        throw abstractC0597t.h().a().k(abstractC0597t);
    }

    public static AbstractC0598u.b t() {
        return V.g();
    }

    public static AbstractC0597t u(Class cls) {
        AbstractC0597t abstractC0597t = defaultInstanceMap.get(cls);
        if (abstractC0597t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0597t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC0597t != null) {
            return abstractC0597t;
        }
        AbstractC0597t abstractC0597tB = ((AbstractC0597t) i0.i(cls)).b();
        if (abstractC0597tB == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0597tB);
        return abstractC0597tB;
    }

    public static Object z(Method method, Object obj, Object... objArr) {
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

    public final boolean A() {
        return B(this, true);
    }

    public boolean C() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void D() {
        U.a().d(this).d(this);
        E();
    }

    public void E() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a g() {
        return (a) q(d.NEW_BUILDER);
    }

    public AbstractC0597t I() {
        return (AbstractC0597t) q(d.NEW_MUTABLE_INSTANCE);
    }

    public void M(int i4) {
        this.memoizedHashCode = i4;
    }

    public void N(int i4) {
        if (i4 >= 0) {
            this.memoizedSerializedSize = (i4 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int a() {
        return f(null);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public void c(AbstractC0587i abstractC0587i) {
        U.a().d(this).c(this, C0588j.P(abstractC0587i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return U.a().d(this).f(this, (AbstractC0597t) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0579a
    public int f(Y y3) {
        if (!C()) {
            if (x() != Integer.MAX_VALUE) {
                return x();
            }
            int iO = o(y3);
            N(iO);
            return iO;
        }
        int iO2 = o(y3);
        if (iO2 >= 0) {
            return iO2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iO2);
    }

    public int hashCode() {
        if (C()) {
            return n();
        }
        if (y()) {
            M(n());
        }
        return w();
    }

    public Object j() {
        return q(d.BUILD_MESSAGE_INFO);
    }

    public void l() {
        this.memoizedHashCode = 0;
    }

    public void m() {
        N(Integer.MAX_VALUE);
    }

    public int n() {
        return U.a().d(this).i(this);
    }

    public final int o(Y y3) {
        return y3 == null ? U.a().d(this).g(this) : y3.g(this);
    }

    public final a p() {
        return (a) q(d.NEW_BUILDER);
    }

    public Object q(d dVar) {
        return s(dVar, null, null);
    }

    public Object r(d dVar, Object obj) {
        return s(dVar, obj, null);
    }

    public abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return L.f(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.K
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC0597t b() {
        return (AbstractC0597t) q(d.GET_DEFAULT_INSTANCE);
    }

    public int w() {
        return this.memoizedHashCode;
    }

    public int x() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean y() {
        return w() == 0;
    }
}
