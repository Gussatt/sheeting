package v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u.AbstractC1565a;
import z.g;

/* JADX INFO: loaded from: classes.dex */
public class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f11524b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f11525c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f11526d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f11527e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f11528f = false;

    public static boolean h(Object obj, String str, int i4, boolean z3) {
        k();
        try {
            return ((Boolean) f11526d.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f11524b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f11527e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f11528f) {
            return;
        }
        f11528f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f11525c = constructor;
        f11524b = cls;
        f11526d = method2;
        f11527e = method;
    }

    private static Object l() {
        k();
        try {
            return f11525c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // v.i
    public Typeface a(Context context, AbstractC1565a.c cVar, Resources resources, int i4) {
        Object objL = l();
        for (AbstractC1565a.d dVar : cVar.a()) {
            File fileE = j.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!j.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!h(objL, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return i(objL);
    }

    @Override // v.i
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        Typeface typefaceC;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b bVarG = g(bVarArr, i4);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileJ = j(parcelFileDescriptorOpenFileDescriptor);
                if (fileJ == null || !fileJ.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceC = super.c(context, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    typefaceC = Typeface.createFromFile(fileJ);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceC;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
