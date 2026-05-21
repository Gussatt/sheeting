package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f8407f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f8408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f8409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f8410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8412e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.q qVar = j$.time.temporal.j.f8470a;
        map.put('Q', qVar);
        map.put('q', qVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f8477a);
    }

    public n() {
        this.f8408a = this;
        this.f8410c = new ArrayList();
        this.f8412e = -1;
        this.f8409b = null;
        this.f8411d = false;
    }

    private n(n nVar) {
        this.f8408a = this;
        this.f8410c = new ArrayList();
        this.f8412e = -1;
        this.f8409b = nVar;
        this.f8411d = true;
    }

    public final void q() {
        d(k.SENSITIVE);
    }

    public final void p() {
        d(k.INSENSITIVE);
    }

    public final void s() {
        d(k.STRICT);
    }

    public final void r() {
        d(k.LENIENT);
    }

    public final void k(j$.time.temporal.q qVar, int i4) {
        Objects.requireNonNull(qVar, "field");
        if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i4);
        }
        j(new i(qVar, i4, i4, u.NOT_NEGATIVE));
    }

    public final void l(j$.time.temporal.q qVar, int i4, int i5, u uVar) {
        if (i4 == i5 && uVar == u.NOT_NEGATIVE) {
            k(qVar, i5);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i4);
        }
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i5);
        }
        if (i5 < i4) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i5 + " < " + i4);
        }
        j(new i(qVar, i4, i5, uVar));
    }

    private void j(i iVar) {
        i iVarB;
        n nVar = this.f8408a;
        int i4 = nVar.f8412e;
        if (i4 >= 0) {
            i iVar2 = (i) nVar.f8410c.get(i4);
            int i5 = iVar.f8391b;
            int i6 = iVar.f8392c;
            if (i5 == i6 && iVar.f8393d == u.NOT_NEGATIVE) {
                iVarB = iVar2.c(i6);
                d(iVar.b());
                this.f8408a.f8412e = i4;
            } else {
                iVarB = iVar2.b();
                this.f8408a.f8412e = d(iVar);
            }
            this.f8408a.f8410c.set(i4, iVarB);
            return;
        }
        nVar.f8412e = d(iVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        g gVar = new g(aVar, 0, 9, true, 0);
        Objects.requireNonNull(aVar, "field");
        if (aVar.x().g()) {
            d(gVar);
        } else {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
    }

    public final void i(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        v vVar = v.FULL;
        d(new m(aVar, vVar, new b(new r(Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void c() {
        d(new h());
    }

    public final void h() {
        d(j.f8396e);
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void m() {
        d(new l(f8407f, 1));
    }

    public final void e(char c4) {
        d(new d(c4));
    }

    public final void f(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new l(str, 0));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        d(dateTimeFormatter.e());
    }

    public final void o() {
        n nVar = this.f8408a;
        nVar.f8412e = -1;
        this.f8408a = new n(nVar);
    }

    public final void n() {
        n nVar = this.f8408a;
        if (nVar.f8409b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (nVar.f8410c.size() > 0) {
            n nVar2 = this.f8408a;
            e eVar = new e(nVar2.f8410c, nVar2.f8411d);
            this.f8408a = this.f8408a.f8409b;
            d(eVar);
            return;
        }
        this.f8408a = this.f8408a.f8409b;
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        n nVar = this.f8408a;
        nVar.getClass();
        nVar.f8410c.add(fVar);
        this.f8408a.f8412e = -1;
        return r2.f8410c.size() - 1;
    }

    public final void v() {
        u(Locale.getDefault(), t.SMART, null);
    }

    final DateTimeFormatter t(t tVar, j$.time.chrono.t tVar2) {
        return u(Locale.getDefault(), tVar, tVar2);
    }

    private DateTimeFormatter u(Locale locale, t tVar, j$.time.chrono.t tVar2) {
        Objects.requireNonNull(locale, "locale");
        while (this.f8408a.f8409b != null) {
            n();
        }
        e eVar = new e(this.f8410c, false);
        s sVar = s.f8421a;
        return new DateTimeFormatter(eVar, locale, tVar, tVar2);
    }
}
