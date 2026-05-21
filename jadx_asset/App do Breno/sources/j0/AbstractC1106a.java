package j0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.C1475a;

/* JADX INFO: renamed from: j0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1106a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1475a f8559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1475a f8560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1475a f8561c;

    public AbstractC1106a(C1475a c1475a, C1475a c1475a2, C1475a c1475a3) {
        this.f8559a = c1475a;
        this.f8560b = c1475a2;
        this.f8561c = c1475a3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i4) {
        w(i4);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i4) {
        w(i4);
        C(charSequence);
    }

    public abstract void E(int i4);

    public void F(int i4, int i5) {
        w(i5);
        E(i4);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i4) {
        w(i4);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i4) {
        w(i4);
        I(str);
    }

    public void K(InterfaceC1108c interfaceC1108c, AbstractC1106a abstractC1106a) {
        try {
            e(interfaceC1108c.getClass()).invoke(null, interfaceC1108c, abstractC1106a);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (!(e7.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
            }
            throw ((RuntimeException) e7.getCause());
        }
    }

    public void L(InterfaceC1108c interfaceC1108c) {
        if (interfaceC1108c == null) {
            I(null);
            return;
        }
        N(interfaceC1108c);
        AbstractC1106a abstractC1106aB = b();
        K(interfaceC1108c, abstractC1106aB);
        abstractC1106aB.a();
    }

    public void M(InterfaceC1108c interfaceC1108c, int i4) {
        w(i4);
        L(interfaceC1108c);
    }

    public final void N(InterfaceC1108c interfaceC1108c) {
        try {
            I(c(interfaceC1108c.getClass()).getName());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(interfaceC1108c.getClass().getSimpleName() + " does not have a Parcelizer", e4);
        }
    }

    public abstract void a();

    public abstract AbstractC1106a b();

    public final Class c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f8561c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f8561c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) throws NoSuchMethodException {
        Method method = (Method) this.f8559a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1106a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1106a.class);
        this.f8559a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f8560b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, AbstractC1106a.class);
        this.f8560b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z3, int i4) {
        return !m(i4) ? z3 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i4) {
        return !m(i4) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i4) {
        return !m(i4) ? charSequence : k();
    }

    public abstract boolean m(int i4);

    public InterfaceC1108c n(String str, AbstractC1106a abstractC1106a) {
        try {
            return (InterfaceC1108c) d(str).invoke(null, abstractC1106a);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    public abstract int o();

    public int p(int i4, int i5) {
        return !m(i5) ? i4 : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i4) {
        return !m(i4) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i4) {
        return !m(i4) ? str : s();
    }

    public InterfaceC1108c u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return n(strS, b());
    }

    public InterfaceC1108c v(InterfaceC1108c interfaceC1108c, int i4) {
        return !m(i4) ? interfaceC1108c : u();
    }

    public abstract void w(int i4);

    public abstract void y(boolean z3);

    public void z(boolean z3, int i4) {
        w(i4);
        y(z3);
    }

    public void x(boolean z3, boolean z4) {
    }
}
