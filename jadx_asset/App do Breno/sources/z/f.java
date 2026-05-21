package z;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p.C1479e;
import p.C1481g;
import v.AbstractC1584c;
import z.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1479e f12049a = new C1479e(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f12050b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12051c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1481g f12052d = new C1481g();

    public class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f12053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f12054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z.e f12055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f12056d;

        public a(String str, Context context, z.e eVar, int i4) {
            this.f12053a = str;
            this.f12054b = context;
            this.f12055c = eVar;
            this.f12056d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f12053a, this.f12054b, this.f12055c, this.f12056d);
        }
    }

    public class b implements B.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1658a f12057a;

        public b(C1658a c1658a) {
            this.f12057a = c1658a;
        }

        @Override // B.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f12057a.b(eVar);
        }
    }

    public class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f12058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f12059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z.e f12060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f12061d;

        public c(String str, Context context, z.e eVar, int i4) {
            this.f12058a = str;
            this.f12059b = context;
            this.f12060c = eVar;
            this.f12061d = i4;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f12058a, this.f12059b, this.f12060c, this.f12061d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements B.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f12062a;

        public d(String str) {
            this.f12062a = str;
        }

        @Override // B.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f12051c) {
                try {
                    C1481g c1481g = f.f12052d;
                    ArrayList arrayList = (ArrayList) c1481g.get(this.f12062a);
                    if (arrayList == null) {
                        return;
                    }
                    c1481g.remove(this.f12062a);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        ((B.a) arrayList.get(i4)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(z.e eVar, int i4) {
        return eVar.d() + "-" + i4;
    }

    public static int b(g.a aVar) {
        int i4 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i4 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i4;
    }

    public static e c(String str, Context context, z.e eVar, int i4) {
        C1479e c1479e = f12049a;
        Typeface typeface = (Typeface) c1479e.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = z.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = AbstractC1584c.b(context, null, aVarE.b(), i4);
            if (typefaceB == null) {
                return new e(-3);
            }
            c1479e.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, z.e eVar, int i4, Executor executor, C1658a c1658a) {
        String strA = a(eVar, i4);
        Typeface typeface = (Typeface) f12049a.c(strA);
        if (typeface != null) {
            c1658a.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(c1658a);
        synchronized (f12051c) {
            try {
                C1481g c1481g = f12052d;
                ArrayList arrayList = (ArrayList) c1481g.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                c1481g.put(strA, arrayList2);
                c cVar = new c(strA, context, eVar, i4);
                if (executor == null) {
                    executor = f12050b;
                }
                h.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, z.e eVar, C1658a c1658a, int i4, int i5) {
        String strA = a(eVar, i4);
        Typeface typeface = (Typeface) f12049a.c(strA);
        if (typeface != null) {
            c1658a.b(new e(typeface));
            return typeface;
        }
        if (i5 == -1) {
            e eVarC = c(strA, context, eVar, i4);
            c1658a.b(eVarC);
            return eVarC.f12063a;
        }
        try {
            e eVar2 = (e) h.c(f12050b, new a(strA, context, eVar, i4), i5);
            c1658a.b(eVar2);
            return eVar2.f12063a;
        } catch (InterruptedException unused) {
            c1658a.b(new e(-3));
            return null;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f12063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12064b;

        public e(int i4) {
            this.f12063a = null;
            this.f12064b = i4;
        }

        public boolean a() {
            return this.f12064b == 0;
        }

        public e(Typeface typeface) {
            this.f12063a = typeface;
            this.f12064b = 0;
        }
    }
}
