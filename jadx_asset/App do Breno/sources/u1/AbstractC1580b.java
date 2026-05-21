package u1;

import android.os.Bundle;
import k1.AbstractC1261m4;
import p1.i;
import p1.k;

/* JADX INFO: renamed from: u1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1580b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f11463a = k.w("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f11464b = i.w("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f11465c = i.v("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f11466d = i.u("_r", "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f11467e = new i.a().e(AbstractC1261m4.f9577a).e(AbstractC1261m4.f9578b).f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f11468f = i.u("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            boolean r6 = d(r5)
            r1 = 0
            if (r6 != 0) goto L12
            return r1
        L12:
            if (r7 != 0) goto L15
            return r1
        L15:
            p1.i r6 = u1.AbstractC1580b.f11466d
            int r2 = r6.size()
            r3 = r1
        L1c:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1c
            return r1
        L2d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L56
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L4c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L42
            goto L60
        L42:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r3
            goto L61
        L4c:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r0
            goto L61
        L56:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r1
            goto L61
        L60:
            r5 = -1
        L61:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L76
            if (r5 == r0) goto L70
            if (r5 == r3) goto L6a
            return r1
        L6a:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L70:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L76:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.AbstractC1580b.a(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    public static boolean b(String str, Bundle bundle) {
        if (f11464b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        i iVar = f11466d;
        int size = iVar.size();
        int i4 = 0;
        while (i4 < size) {
            boolean zContainsKey = bundle.containsKey((String) iVar.get(i4));
            i4++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f11463a.contains(str);
    }

    public static boolean d(String str) {
        return !f11465c.contains(str);
    }
}
