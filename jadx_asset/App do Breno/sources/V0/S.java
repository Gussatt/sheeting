package V0;

import android.content.ComponentName;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Uri f3635f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f3638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3640e;

    public S(String str, String str2, int i4, boolean z3) {
        AbstractC0549h.d(str);
        this.f3636a = str;
        AbstractC0549h.d(str2);
        this.f3637b = str2;
        this.f3638c = null;
        this.f3639d = 4225;
        this.f3640e = z3;
    }

    public final ComponentName a() {
        return this.f3638c;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent b(android.content.Context r6) throws V0.I {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.f3636a
            if (r1 == 0) goto Lb2
            boolean r1 = r5.f3640e
            r2 = 0
            if (r1 == 0) goto La1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.f3636a
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            android.net.Uri r3 = V0.S.f3635f     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r3)     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            if (r6 == 0) goto L3a
            java.lang.String r3 = "serviceIntentCall"
            android.os.Bundle r1 = r6.call(r3, r2, r1)     // Catch: java.lang.Throwable -> L31
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L2d android.os.RemoteException -> L2f
            goto L50
        L2d:
            r6 = move-exception
            goto L43
        L2f:
            r6 = move-exception
            goto L43
        L31:
            r1 = move-exception
            r6.release()     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            throw r1     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
        L36:
            r6 = move-exception
            goto L42
        L38:
            r6 = move-exception
            goto L42
        L3a:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            java.lang.String r1 = "Failed to acquire ContentProviderClient"
            r6.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
            throw r6     // Catch: java.lang.IllegalArgumentException -> L36 android.os.RemoteException -> L38
        L42:
            r1 = r2
        L43:
            java.lang.String r3 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r3.concat(r6)
            android.util.Log.w(r0, r6)
        L50:
            if (r1 == 0) goto L90
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r1.getParcelable(r6)
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 != 0) goto L90
            java.lang.String r6 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r6 = r1.getParcelable(r6)
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            if (r6 != 0) goto L68
            goto L90
        L68:
            java.lang.String r1 = r5.f3636a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Dynamic lookup for intent failed for action "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " but has possible resolution"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r0, r1)
            V0.I r0 = new V0.I
            S0.b r1 = new S0.b
            r2 = 25
            r1.<init>(r2, r6)
            r0.<init>(r1)
            throw r0
        L90:
            if (r2 != 0) goto La1
            java.lang.String r6 = r5.f3636a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        La1:
            if (r2 != 0) goto Lb1
            java.lang.String r6 = r5.f3636a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r6 = r5.f3637b
            android.content.Intent r6 = r0.setPackage(r6)
            return r6
        Lb1:
            return r2
        Lb2:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.f3638c
            android.content.Intent r6 = r6.setComponent(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.S.b(android.content.Context):android.content.Intent");
    }

    public final String c() {
        return this.f3637b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s4 = (S) obj;
        return AbstractC0548g.a(this.f3636a, s4.f3636a) && AbstractC0548g.a(this.f3637b, s4.f3637b) && AbstractC0548g.a(this.f3638c, s4.f3638c) && this.f3640e == s4.f3640e;
    }

    public final int hashCode() {
        return AbstractC0548g.b(this.f3636a, this.f3637b, this.f3638c, 4225, Boolean.valueOf(this.f3640e));
    }

    public final String toString() {
        String str = this.f3636a;
        if (str != null) {
            return str;
        }
        AbstractC0549h.j(this.f3638c);
        return this.f3638c.flattenToString();
    }
}
