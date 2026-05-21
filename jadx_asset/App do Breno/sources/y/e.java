package y;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f11989b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11990a;

    public static class a {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public e(f fVar) {
        this.f11990a = fVar;
    }

    public static e a(Locale... localeArr) {
        return d(a.a(localeArr));
    }

    public static e d(LocaleList localeList) {
        return new e(new g(localeList));
    }

    public Locale b(int i4) {
        return this.f11990a.get(i4);
    }

    public Object c() {
        return this.f11990a.a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.f11990a.equals(((e) obj).f11990a);
    }

    public int hashCode() {
        return this.f11990a.hashCode();
    }

    public String toString() {
        return this.f11990a.toString();
    }
}
