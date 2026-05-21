package H2;

import android.net.http.SslCertificate;
import android.net.http.SslError;

/* JADX INFO: loaded from: classes.dex */
public class V3 extends F1 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1903a;

        static {
            int[] iArr = new int[W3.values().length];
            f1903a = iArr;
            try {
                iArr[W3.f1915o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1903a[W3.f1916p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1903a[W3.f1917q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1903a[W3.f1918r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1903a[W3.f1919s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1903a[W3.f1920t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1903a[W3.f1921u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public V3(O3 o32) {
        super(o32);
    }

    @Override // H2.F1
    public SslCertificate b(SslError sslError) {
        return sslError.getCertificate();
    }

    @Override // H2.F1
    public W3 d(SslError sslError) {
        int primaryError = sslError.getPrimaryError();
        return primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? W3.f1921u : W3.f1918r : W3.f1915o : W3.f1920t : W3.f1917q : W3.f1916p : W3.f1919s;
    }

    @Override // H2.F1
    public boolean e(SslError sslError, W3 w32) {
        int i4;
        switch (a.f1903a[w32.ordinal()]) {
            case 1:
                i4 = 4;
                break;
            case 2:
                i4 = 1;
                break;
            case 3:
                i4 = 2;
                break;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                i4 = 5;
                break;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                i4 = 0;
                break;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = 3;
                break;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                throw c().K(w32);
            default:
                i4 = -1;
                break;
        }
        return sslError.hasError(i4);
    }

    @Override // H2.F1
    public String h(SslError sslError) {
        return sslError.getUrl();
    }

    @Override // H2.F1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public O3 c() {
        return (O3) super.c();
    }
}
