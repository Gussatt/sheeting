package v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import u.AbstractC1565a;
import z.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f11540a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        @Override // v.i.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // v.i.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object e(Object[] objArr, int i4, b bVar) {
        return f(objArr, (i4 & 1) == 0 ? 400 : 700, (i4 & 2) != 0, bVar);
    }

    public static Object f(Object[] objArr, int i4, boolean z3, b bVar) {
        Object obj = null;
        int i5 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i4) * 2) + (bVar.b(obj2) == z3 ? 0 : 1);
            if (obj == null || i5 > iAbs) {
                obj = obj2;
                i5 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, AbstractC1565a.c cVar, Resources resources, int i4);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4);

    public Typeface c(Context context, InputStream inputStream) {
        File fileE = j.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (j.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i4, String str, int i5) {
        File fileE = j.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (j.c(fileE, resources, i4)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public g.b g(g.b[] bVarArr, int i4) {
        return (g.b) e(bVarArr, i4, new a());
    }
}
