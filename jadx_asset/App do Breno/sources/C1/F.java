package C1;

import F1.F;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f534h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0244b f537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L1.d f538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K1.j f539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z1.j f540f = z1.j.f12106a;

    static {
        HashMap map = new HashMap();
        f533g = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        f534h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.4.2");
    }

    public F(Context context, O o4, C0244b c0244b, L1.d dVar, K1.j jVar) {
        this.f535a = context;
        this.f536b = o4;
        this.f537c = c0244b;
        this.f538d = dVar;
        this.f539e = jVar;
    }

    public static long f(long j4) {
        if (j4 > 0) {
            return j4;
        }
        return 0L;
    }

    public static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f533g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    public final F.e.d.a.c A(F.a aVar) {
        return this.f540f.a(aVar.e(), aVar.d(), aVar.c());
    }

    public final F.a a(F.a aVar) {
        List listUnmodifiableList;
        if (!this.f539e.b().f2462b.f2471c || this.f537c.f586c.size() <= 0) {
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C0249g c0249g : this.f537c.f586c) {
                arrayList.add(F.a.AbstractC0015a.a().d(c0249g.c()).b(c0249g.a()).c(c0249g.b()).a());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(listUnmodifiableList).a();
    }

    public final F.b b() {
        return F1.F.b().l("19.4.2").h(this.f537c.f584a).i(this.f536b.a().c()).g(this.f536b.a().e()).f(this.f536b.a().d()).d(this.f537c.f589f).e(this.f537c.f590g).k(4);
    }

    public F.e.d c(F.a aVar) {
        int i4 = this.f535a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(j(i4, a(aVar))).c(l(i4)).a();
    }

    public F.e.d d(Throwable th, Thread thread, String str, long j4, int i4, int i5, boolean z3) {
        int i6 = this.f535a.getResources().getConfiguration().orientation;
        return F.e.d.a().g(str).f(j4).b(k(i6, L1.e.a(th, this.f538d), thread, i4, i5, z3)).c(l(i6)).a();
    }

    public F1.F e(String str, long j4) {
        return b().m(t(str, j4)).a();
    }

    public final F.e.d.a.b.AbstractC0019a h() {
        return F.e.d.a.b.AbstractC0019a.a().b(0L).d(0L).c(this.f537c.f588e).e(this.f537c.f585b).a();
    }

    public final List i() {
        return Collections.singletonList(h());
    }

    public final F.e.d.a j(int i4, F.a aVar) {
        return F.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i4).f(o(aVar)).a();
    }

    public final F.e.d.a k(int i4, L1.e eVar, Thread thread, int i5, int i6, boolean z3) {
        Boolean boolValueOf;
        F.e.d.a.c cVarE = this.f540f.e(this.f535a);
        if (cVarE.b() > 0) {
            boolValueOf = Boolean.valueOf(cVarE.b() != 100);
        } else {
            boolValueOf = null;
        }
        return F.e.d.a.a().c(boolValueOf).d(cVarE).b(this.f540f.d(this.f535a)).h(i4).f(p(eVar, thread, i5, i6, z3)).a();
    }

    public final F.e.d.c l(int i4) {
        C0248f c0248fA = C0248f.a(this.f535a);
        Float fB = c0248fA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = c0248fA.c();
        boolean zN = AbstractC0252j.n(this.f535a);
        return F.e.d.c.a().b(dValueOf).c(iC).f(zN).e(i4).g(f(AbstractC0252j.b(this.f535a) - AbstractC0252j.a(this.f535a))).d(AbstractC0252j.c(Environment.getDataDirectory().getPath())).a();
    }

    public final F.e.d.a.b.c m(L1.e eVar, int i4, int i5) {
        return n(eVar, i4, i5, 0);
    }

    public final F.e.d.a.b.c n(L1.e eVar, int i4, int i5, int i6) {
        String str = eVar.f2742b;
        String str2 = eVar.f2741a;
        StackTraceElement[] stackTraceElementArr = eVar.f2743c;
        int i7 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        L1.e eVar2 = eVar.f2744d;
        if (i6 >= i5) {
            L1.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f2744d;
                i7++;
            }
        }
        F.e.d.a.b.c.AbstractC0022a abstractC0022aD = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i4)).d(i7);
        if (eVar2 != null && i7 == 0) {
            abstractC0022aD.b(n(eVar2, i4, i5, i6 + 1));
        }
        return abstractC0022aD.a();
    }

    public final F.e.d.a.b o(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    public final F.e.d.a.b p(L1.e eVar, Thread thread, int i4, int i5, boolean z3) {
        return F.e.d.a.b.a().f(z(eVar, thread, i4, z3)).d(m(eVar, i4, i5)).e(w()).c(i()).a();
    }

    public final F.e.d.a.b.AbstractC0025e.AbstractC0027b q(StackTraceElement stackTraceElement, F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a abstractC0028a) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0028a.e(jMax).f(str).b(fileName).d(lineNumber).a();
    }

    public final List r(StackTraceElement[] stackTraceElementArr, int i4) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, F.e.d.a.b.AbstractC0025e.AbstractC0027b.a().c(i4)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final F.e.a s() {
        return F.e.a.a().e(this.f536b.f()).g(this.f537c.f589f).d(this.f537c.f590g).f(this.f536b.a().c()).b(this.f537c.f591h.d()).c(this.f537c.f591h.e()).a();
    }

    public final F.e t(String str, long j4) {
        return F.e.a().m(j4).j(str).h(f534h).b(s()).l(v()).e(u()).i(3).a();
    }

    public final F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iG = g();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jB = AbstractC0252j.b(this.f535a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zX = AbstractC0252j.x();
        int iL = AbstractC0252j.l();
        String str = Build.MANUFACTURER;
        return F.e.c.a().b(iG).f(Build.MODEL).c(iAvailableProcessors).h(jB).d(blockCount).i(zX).j(iL).e(str).g(Build.PRODUCT).a();
    }

    public final F.e.AbstractC0032e v() {
        return F.e.AbstractC0032e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC0252j.y()).a();
    }

    public final F.e.d.a.b.AbstractC0023d w() {
        return F.e.d.a.b.AbstractC0023d.a().d("0").c("0").b(0L).a();
    }

    public final F.e.d.a.b.AbstractC0025e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    public final F.e.d.a.b.AbstractC0025e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i4) {
        return F.e.d.a.b.AbstractC0025e.a().d(thread.getName()).c(i4).b(r(stackTraceElementArr, i4)).a();
    }

    public final List z(L1.e eVar, Thread thread, int i4, boolean z3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f2743c, i4));
        if (z3) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f538d.a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
