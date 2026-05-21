package n0;

import X2.m;
import f3.q;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f10610r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f10611s = new k(0, 0, 0, "");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f10612t = new k(0, 1, 0, "");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f10613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f10614v;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10616n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K2.f f10619q;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final k a() {
            return k.f10612t;
        }

        public final k b(String str) {
            String strGroup;
            if (str != null && !q.G(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i4 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i5 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            int i6 = Integer.parseInt(strGroup3);
                            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                            X2.l.d(strGroup4, "description");
                            return new k(i4, i5, i6, strGroup4, null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    public static final class b extends m implements W2.a {
        public b() {
            super(0);
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger e() {
            return BigInteger.valueOf(k.this.h()).shiftLeft(32).or(BigInteger.valueOf(k.this.i())).shiftLeft(32).or(BigInteger.valueOf(k.this.j()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        f10613u = kVar;
        f10614v = kVar;
    }

    public /* synthetic */ k(int i4, int i5, int i6, String str, X2.g gVar) {
        this(i4, i5, i6, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10615m == kVar.f10615m && this.f10616n == kVar.f10616n && this.f10617o == kVar.f10617o;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        X2.l.e(kVar, "other");
        return g().compareTo(kVar.g());
    }

    public final BigInteger g() {
        Object value = this.f10619q.getValue();
        X2.l.d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public final int h() {
        return this.f10615m;
    }

    public int hashCode() {
        return ((((527 + this.f10615m) * 31) + this.f10616n) * 31) + this.f10617o;
    }

    public final int i() {
        return this.f10616n;
    }

    public final int j() {
        return this.f10617o;
    }

    public String toString() {
        String str;
        if (q.G(this.f10618p)) {
            str = "";
        } else {
            str = '-' + this.f10618p;
        }
        return this.f10615m + '.' + this.f10616n + '.' + this.f10617o + str;
    }

    public k(int i4, int i5, int i6, String str) {
        this.f10615m = i4;
        this.f10616n = i5;
        this.f10617o = i6;
        this.f10618p = str;
        this.f10619q = K2.g.a(new b());
    }
}
