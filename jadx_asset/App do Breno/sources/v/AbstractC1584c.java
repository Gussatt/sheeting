package v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p.C1479e;
import u.AbstractC1565a;
import u.d;
import z.g;

/* JADX INFO: renamed from: v.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1584c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f11521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1479e f11522b;

    /* JADX INFO: renamed from: v.c$a */
    public static class a extends g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d.a f11523a;

        public a(d.a aVar) {
            this.f11523a = aVar;
        }

        @Override // z.g.c
        public void a(int i4) {
            d.a aVar = this.f11523a;
            if (aVar != null) {
                aVar.f(i4);
            }
        }

        @Override // z.g.c
        public void b(Typeface typeface) {
            d.a aVar = this.f11523a;
            if (aVar != null) {
                aVar.g(typeface);
            }
        }
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            f11521a = new h();
        } else if (i4 >= 28) {
            f11521a = new g();
        } else if (i4 >= 26) {
            f11521a = new f();
        } else if (e.j()) {
            f11521a = new e();
        } else {
            f11521a = new d();
        }
        f11522b = new C1479e(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i4) {
        if (context != null) {
            return Typeface.create(typeface, i4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        return f11521a.b(context, cancellationSignal, bVarArr, i4);
    }

    public static Typeface c(Context context, AbstractC1565a.b bVar, Resources resources, int i4, String str, int i5, int i6, d.a aVar, Handler handler, boolean z3) {
        Typeface typefaceA;
        if (bVar instanceof AbstractC1565a.e) {
            AbstractC1565a.e eVar = (AbstractC1565a.e) bVar;
            Typeface typefaceG = g(eVar.c());
            if (typefaceG != null) {
                if (aVar != null) {
                    aVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = z.g.a(context, eVar.b(), i6, !z3 ? aVar != null : eVar.a() != 0, z3 ? eVar.d() : -1, d.a.e(handler), new a(aVar));
        } else {
            typefaceA = f11521a.a(context, (AbstractC1565a.c) bVar, resources, i6);
            if (aVar != null) {
                if (typefaceA != null) {
                    aVar.d(typefaceA, handler);
                } else {
                    aVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f11522b.d(e(resources, i4, str, i5, i6), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i4, String str, int i5, int i6) {
        Typeface typefaceD = f11521a.d(context, resources, i4, str, i6);
        if (typefaceD != null) {
            f11522b.d(e(resources, i4, str, i5, i6), typefaceD);
        }
        return typefaceD;
    }

    public static String e(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }

    public static Typeface f(Resources resources, int i4, String str, int i5, int i6) {
        return (Typeface) f11522b.c(e(resources, i4, str, i5, i6));
    }

    public static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
