package k1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends AbstractC1219h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f8877e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1354y2 f8878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8879d;

    public A2(C1363z3 c1363z3) {
        super(c1363z3);
        Context contextD = this.f9366a.d();
        this.f9366a.B();
        this.f8878c = new C1354y2(this, contextD, "google_app_measurement_local.db");
    }

    @Override // k1.AbstractC1219h2
    public final boolean n() {
        return false;
    }

    public final SQLiteDatabase o() {
        if (this.f8879d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f8878c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f8879d = true;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032b A[Catch: all -> 0x0182, TRY_ENTER, TryCatch #42 {all -> 0x0182, blocks: (B:90:0x018a, B:91:0x018d, B:81:0x017b, B:204:0x0355, B:194:0x032b, B:196:0x0331, B:197:0x0334, B:212:0x036e, B:94:0x0193, B:98:0x01a9, B:112:0x01d0, B:113:0x01d9, B:114:0x01dc, B:110:0x01ca, B:117:0x01e2, B:119:0x01f6, B:126:0x0211, B:127:0x021b, B:128:0x021e, B:124:0x020b, B:131:0x0222, B:135:0x0236, B:149:0x025b, B:151:0x0265, B:152:0x0268, B:147:0x0255, B:155:0x026d, B:156:0x027d, B:168:0x02c6, B:170:0x02e2, B:171:0x02f1), top: B:243:0x0355 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0361 A[PHI: r4 r6 r11 r13 r19 r21
      0x0361: PHI (r4v11 int) = (r4v5 int), (r4v7 int), (r4v12 int) binds: [B:200:0x0349, B:215:0x0383, B:208:0x035f] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r6v14 k1.A2) = (r6v8 k1.A2), (r6v10 k1.A2), (r6v15 k1.A2) binds: [B:200:0x0349, B:215:0x0383, B:208:0x035f] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:200:0x0349, B:215:0x0383, B:208:0x035f] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r13v10 ??) = (r13v5 ??), (r13v7 ??), (r13v11 ??) binds: [B:200:0x0349, B:215:0x0383, B:208:0x035f] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:200:0x0349, B:215:0x0383, B:208:0x035f] A[DONT_GENERATE, DONT_INLINE]
      0x0361: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:200:0x0349, B:215:0x0383, B:208:0x035f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [k1.n] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List p(int r28) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.A2.p(int):java.util.List");
    }

    public final void q() {
        int iDelete;
        h();
        try {
            SQLiteDatabase sQLiteDatabaseO = o();
            if (sQLiteDatabaseO == null || (iDelete = sQLiteDatabaseO.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f9366a.c().v().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e4) {
            this.f9366a.c().r().b("Error resetting local analytics data. error", e4);
        }
    }

    public final boolean r() {
        return z(3, new byte[0]);
    }

    public final boolean s() {
        C1363z3 c1363z3 = this.f9366a;
        Context contextD = c1363z3.d();
        c1363z3.B();
        return contextD.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006b A[PHI: r4
      0x006b: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:34:0x007e, B:31:0x0069, B:28:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.h()
            boolean r1 = r10.f8879d
            r2 = 0
            if (r1 == 0) goto Lc
            goto L99
        Lc:
            boolean r1 = r10.s()
            if (r1 == 0) goto L99
            r1 = 5
            r4 = r1
            r3 = r2
        L15:
            if (r3 >= r1) goto L8a
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.o()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            if (r5 != 0) goto L29
            r10.f8879d = r6     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            goto L99
        L23:
            r0 = move-exception
            goto L84
        L25:
            r7 = move-exception
            goto L46
        L27:
            r7 = move-exception
            goto L6f
        L29:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.endTransaction()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.close()
            return r6
        L46:
            if (r5 == 0) goto L51
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L23
            if (r8 == 0) goto L51
            r5.endTransaction()     // Catch: java.lang.Throwable -> L23
        L51:
            k1.z3 r8 = r10.f9366a     // Catch: java.lang.Throwable -> L23
            k1.K2 r8 = r8.c()     // Catch: java.lang.Throwable -> L23
            k1.I2 r8 = r8.r()     // Catch: java.lang.Throwable -> L23
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L23
            r10.f8879d = r6     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L81
            goto L6b
        L63:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L23
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L23
            int r4 = r4 + 20
            if (r5 == 0) goto L81
        L6b:
            r5.close()
            goto L81
        L6f:
            k1.z3 r8 = r10.f9366a     // Catch: java.lang.Throwable -> L23
            k1.K2 r8 = r8.c()     // Catch: java.lang.Throwable -> L23
            k1.I2 r8 = r8.r()     // Catch: java.lang.Throwable -> L23
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L23
            r10.f8879d = r6     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L81
            goto L6b
        L81:
            int r3 = r3 + 1
            goto L15
        L84:
            if (r5 == 0) goto L89
            r5.close()
        L89:
            throw r0
        L8a:
            k1.z3 r0 = r10.f9366a
            k1.K2 r0 = r0.c()
            k1.I2 r0 = r0.w()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.A2.t():boolean");
    }

    public final boolean u(C1232j c1232j) {
        C1363z3 c1363z3 = this.f9366a;
        byte[] bArrQ0 = c1363z3.Q().q0(c1232j);
        if (bArrQ0.length <= 131072) {
            return z(2, bArrQ0);
        }
        c1363z3.c().t().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean v(C1148H c1148h) {
        C1363z3 c1363z3 = this.f9366a;
        byte[] bArrQ0 = c1363z3.Q().q0(c1148h);
        if (bArrQ0 == null) {
            c1363z3.c().t().a("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrQ0.length <= 131072) {
            return z(4, bArrQ0);
        }
        c1363z3.c().t().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    public final boolean w(C1150J c1150j) {
        Parcel parcelObtain = Parcel.obtain();
        C1151K.a(c1150j, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return z(0, bArrMarshall);
        }
        this.f9366a.c().t().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean x(s7 s7Var) {
        Parcel parcelObtain = Parcel.obtain();
        t7.a(s7Var, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return z(1, bArrMarshall);
        }
        this.f9366a.c().t().a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6 A[Catch: all -> 0x0098, SQLiteException -> 0x009b, SQLiteDatabaseLockedException -> 0x00a2, SQLiteFullException -> 0x00a6, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:30:0x008d, B:32:0x0093, B:45:0x00b6, B:47:0x00da, B:49:0x00e4, B:51:0x00ec, B:61:0x0106, B:75:0x012e, B:77:0x0134, B:78:0x0137, B:93:0x016c, B:85:0x0157), top: B:109:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:30:0x008d, B:32:0x0093, B:45:0x00b6, B:47:0x00da, B:49:0x00e4, B:51:0x00ec, B:61:0x0106, B:75:0x012e, B:77:0x0134, B:78:0x0137, B:93:0x016c, B:85:0x0157), top: B:109:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163 A[PHI: r8 r10 r17
      0x0163: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(int r19, byte[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.A2.z(int, byte[]):boolean");
    }
}
