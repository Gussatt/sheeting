package v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p.C1481g;
import u.AbstractC1565a;
import z.g;

/* JADX INFO: loaded from: classes.dex */
public class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f11529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f11530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f11531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f11532e;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f11530c = constructor;
        f11529b = cls;
        f11531d = method;
        f11532e = method2;
    }

    public static boolean h(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z3) {
        try {
            return ((Boolean) f11531d.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f11529b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f11532e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f11531d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f11530c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // v.i
    public Typeface a(Context context, AbstractC1565a.c cVar, Resources resources, int i4) {
        Object objK = k();
        if (objK == null) {
            return null;
        }
        for (AbstractC1565a.d dVar : cVar.a()) {
            ByteBuffer byteBufferB = j.b(context, resources, dVar.b());
            if (byteBufferB == null || !h(objK, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return i(objK);
    }

    @Override // v.i
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        Object objK = k();
        if (objK == null) {
            return null;
        }
        C1481g c1481g = new C1481g();
        for (g.b bVar : bVarArr) {
            Uri uriD = bVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) c1481g.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = j.f(context, cancellationSignal, uriD);
                c1481g.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !h(objK, byteBufferF, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface typefaceI = i(objK);
        if (typefaceI == null) {
            return null;
        }
        return Typeface.create(typefaceI, i4);
    }
}
