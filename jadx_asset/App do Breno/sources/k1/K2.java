package k1;

import V0.AbstractC0549h;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class K2 extends AbstractC1177c4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f9102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f9104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I2 f9105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I2 f9106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final I2 f9107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final I2 f9108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final I2 f9109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final I2 f9110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final I2 f9111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final I2 f9112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I2 f9113n;

    public K2(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9102c = (char) 0;
        this.f9103d = -1L;
        this.f9105f = new I2(this, 6, false, false);
        this.f9106g = new I2(this, 6, true, false);
        this.f9107h = new I2(this, 6, false, true);
        this.f9108i = new I2(this, 5, false, false);
        this.f9109j = new I2(this, 5, true, false);
        this.f9110k = new I2(this, 5, false, true);
        this.f9111l = new I2(this, 4, false, false);
        this.f9112m = new I2(this, 3, false, false);
        this.f9113n = new I2(this, 2, false, false);
    }

    public static String A(boolean z3, String str, Object obj, Object obj2, Object obj3) {
        String strB = B(z3, obj);
        String strB2 = B(z3, obj2);
        String strB3 = B(z3, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb.append(str2);
            sb.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb.append(str3);
            sb.append(strB3);
        }
        return sb.toString();
    }

    public static String B(boolean z3, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i4 = 0;
        if (obj instanceof Long) {
            if (!z3) {
                return obj.toString();
            }
            Long l4 = (Long) obj;
            if (Math.abs(l4.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l4.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            String str = cCharAt == '-' ? "-" : "";
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof J2 ? ((J2) obj).f9092a : z3 ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z3 ? th.getClass().getName() : th.toString());
        String strC = C(C1363z3.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(strC)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i4++;
        }
        return sb2.toString();
    }

    public static String C(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    public static Object z(String str) {
        if (str == null) {
            return null;
        }
        return new J2(str);
    }

    public final String D() {
        String str;
        synchronized (this) {
            try {
                if (this.f9104e == null) {
                    C1363z3 c1363z3 = this.f9366a;
                    if (c1363z3.T() != null) {
                        this.f9104e = c1363z3.T();
                    } else {
                        this.f9104e = this.f9366a.B().I();
                    }
                }
                AbstractC0549h.j(this.f9104e);
                str = this.f9104e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void G(int i4, boolean z3, boolean z4, String str, Object obj, Object obj2, Object obj3) {
        if (!z3 && Log.isLoggable(D(), i4)) {
            Log.println(i4, D(), A(false, str, obj, obj2, obj3));
        }
        if (z4 || i4 < 5) {
            return;
        }
        AbstractC0549h.j(str);
        C1307s3 c1307s3I = this.f9366a.I();
        if (c1307s3I == null) {
            Log.println(6, D(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c1307s3I.n()) {
                Log.println(6, D(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i4 >= 9) {
                i4 = 8;
            }
            c1307s3I.A(new H2(this, i4, str, obj, obj2, obj3));
        }
    }

    @Override // k1.AbstractC1177c4
    public final boolean j() {
        return false;
    }

    public final I2 q() {
        return this.f9112m;
    }

    public final I2 r() {
        return this.f9105f;
    }

    public final I2 s() {
        return this.f9107h;
    }

    public final I2 t() {
        return this.f9106g;
    }

    public final I2 u() {
        return this.f9111l;
    }

    public final I2 v() {
        return this.f9113n;
    }

    public final I2 w() {
        return this.f9108i;
    }

    public final I2 x() {
        return this.f9110k;
    }

    public final I2 y() {
        return this.f9109j;
    }
}
