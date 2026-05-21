package k1;

import V0.AbstractC0549h;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class C2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f8910b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f8911c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f8912d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B2 f8913a;

    public C2(B2 b22) {
        this.f8913a = b22;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC0549h.j(strArr);
        AbstractC0549h.j(strArr2);
        AbstractC0549h.j(atomicReference);
        AbstractC0549h.a(strArr.length == strArr2.length);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (Objects.equals(str, strArr[i4])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i4];
                        if (str2 == null) {
                            str2 = strArr2[i4] + "(" + strArr[i4] + ")";
                            strArr3[i4] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strB);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f8913a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String c(C1150J c1150j) {
        B2 b22 = this.f8913a;
        if (!b22.a()) {
            return c1150j.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(c1150j.f9090o);
        sb.append(",name=");
        sb.append(d(c1150j.f9088m));
        sb.append(",params=");
        C1148H c1148h = c1150j.f9089n;
        sb.append(c1148h == null ? null : !b22.a() ? c1148h.toString() : b(c1148h.g()));
        return sb.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f8913a.a() ? str : g(str, AbstractC1237j4.f9496c, AbstractC1237j4.f9494a, f8910b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f8913a.a() ? str : g(str, AbstractC1245k4.f9525b, AbstractC1245k4.f9524a, f8911c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f8913a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, AbstractC1261m4.f9578b, AbstractC1261m4.f9577a, f8912d);
        }
        return "experiment_id(" + str + ")";
    }
}
