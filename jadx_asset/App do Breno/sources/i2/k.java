package i2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k2.AbstractC1374h;
import k2.C1369c;
import k2.C1370d;
import k2.C1373g;
import k2.InterfaceC1371e;
import w2.C1616i;
import w2.C1617j;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f7679n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f7684e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f7687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f7688i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f7691l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7685f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f7686g = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7689j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7690k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7692m = 0;

    public k(Context context, String str, int i4, boolean z3, int i5) {
        this.f7684e = context;
        this.f7681b = str;
        this.f7680a = z3;
        this.f7682c = i4;
        this.f7683d = i5;
    }

    public static /* synthetic */ void e(k kVar, InterfaceC1371e interfaceC1371e) {
        kVar.getClass();
        Boolean boolF = interfaceC1371e.f();
        boolean z3 = Boolean.TRUE.equals(boolF) && interfaceC1371e.h();
        if (z3) {
            int i4 = kVar.f7690k + 1;
            kVar.f7690k = i4;
            kVar.f7691l = Integer.valueOf(i4);
        }
        if (!kVar.w(interfaceC1371e)) {
            if (z3) {
                kVar.f7691l = null;
            }
        } else if (z3) {
            HashMap map = new HashMap();
            map.put("transactionId", kVar.f7691l);
            interfaceC1371e.a(map);
        } else {
            if (Boolean.FALSE.equals(boolF)) {
                kVar.f7691l = null;
            }
            interfaceC1371e.a(null);
        }
    }

    public static /* synthetic */ Cursor f(C1049E c1049e, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        c1049e.a(sQLiteQuery);
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static boolean i(Context context, String str, boolean z3) {
        try {
            String packageName = context.getPackageName();
            return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128L)) : y(context, packageName, 128)).metaData.getBoolean(str, z3);
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    public static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static ApplicationInfo y(Context context, String str, int i4) {
        return context.getPackageManager().getApplicationInfo(str, i4);
    }

    public String A() {
        return "[" + B() + "] ";
    }

    public String B() {
        Thread threadCurrentThread = Thread.currentThread();
        return this.f7682c + "," + threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.f7688i;
    }

    public void D(Exception exc, InterfaceC1371e interfaceC1371e) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            interfaceC1371e.b("sqlite_error", "open_failed " + this.f7681b, null);
            return;
        }
        if (exc instanceof SQLException) {
            interfaceC1371e.b("sqlite_error", exc.getMessage(), AbstractC1374h.a(interfaceC1371e));
        } else {
            interfaceC1371e.b("sqlite_error", exc.getMessage(), AbstractC1374h.a(interfaceC1371e));
        }
    }

    public void E(final InterfaceC1371e interfaceC1371e) {
        M(interfaceC1371e, new Runnable() { // from class: i2.g
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f7673m.q(interfaceC1371e);
            }
        });
    }

    public synchronized boolean F() {
        return this.f7689j > 0;
    }

    public void G() {
        if (f7679n == null) {
            Boolean boolValueOf = Boolean.valueOf(j(this.f7684e));
            f7679n = boolValueOf;
            if (boolValueOf.booleanValue() && s.c(this.f7683d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.f7688i = SQLiteDatabase.openDatabase(this.f7681b, null, f7679n.booleanValue() ? 805306368 : 268435456);
    }

    public void H() {
        this.f7688i = SQLiteDatabase.openDatabase(this.f7681b, null, 1, new a());
    }

    public void I(final InterfaceC1371e interfaceC1371e) {
        M(interfaceC1371e, new Runnable() { // from class: i2.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f7669m.r(interfaceC1371e);
            }
        });
    }

    public void J(final InterfaceC1371e interfaceC1371e) {
        M(interfaceC1371e, new Runnable() { // from class: i2.d
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f7667m.s(interfaceC1371e);
            }
        });
    }

    public final void K() {
        while (!this.f7685f.isEmpty() && this.f7691l == null) {
            ((C1373g) this.f7685f.get(0)).a();
            this.f7685f.remove(0);
        }
    }

    public void L(final InterfaceC1371e interfaceC1371e) {
        M(interfaceC1371e, new Runnable() { // from class: i2.f
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f7671m.t(interfaceC1371e);
            }
        });
    }

    public final void M(InterfaceC1371e interfaceC1371e, Runnable runnable) {
        Integer numG = interfaceC1371e.g();
        Integer num = this.f7691l;
        if (num == null) {
            runnable.run();
            return;
        }
        if (numG == null || !(numG.equals(num) || numG.intValue() == -1)) {
            this.f7685f.add(new C1373g(interfaceC1371e, runnable));
            return;
        }
        runnable.run();
        if (this.f7691l != null || this.f7685f.isEmpty()) {
            return;
        }
        this.f7687h.e(this, new Runnable() { // from class: i2.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f7678m.K();
            }
        });
    }

    public void h(C1616i c1616i, C1617j.d dVar) {
        C1369c c1369c;
        String strI;
        C1370d c1370d = new C1370d(c1616i, dVar);
        boolean zE = c1370d.e();
        boolean zL = c1370d.l();
        List list = (List) c1370d.c("operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c1369c = new C1369c((Map) it.next(), zE);
            strI = c1369c.i();
            strI.getClass();
            switch (strI) {
                case "execute":
                    if (!p(c1369c)) {
                        if (!zL) {
                            c1369c.r(dVar);
                            return;
                        }
                        c1369c.s(arrayList);
                        break;
                    } else {
                        c1369c.t(arrayList);
                        break;
                    }
                    break;
                case "insert":
                    if (!q(c1369c)) {
                        if (!zL) {
                            c1369c.r(dVar);
                            return;
                        }
                        c1369c.s(arrayList);
                        break;
                    } else {
                        c1369c.t(arrayList);
                        break;
                    }
                    break;
                case "update":
                    if (!t(c1369c)) {
                        if (!zL) {
                            c1369c.r(dVar);
                            return;
                        }
                        c1369c.s(arrayList);
                        break;
                    } else {
                        c1369c.t(arrayList);
                        break;
                    }
                    break;
                case "query":
                    if (!r(c1369c)) {
                        if (!zL) {
                            c1369c.r(dVar);
                            return;
                        }
                        c1369c.s(arrayList);
                        break;
                    } else {
                        c1369c.t(arrayList);
                        break;
                    }
                    break;
                default:
                    dVar.b("bad_param", "Batch method '" + strI + "' not supported", null);
                    return;
            }
        }
        if (zE) {
            dVar.a(null);
        } else {
            dVar.a(arrayList);
        }
    }

    public void k() {
        if (!this.f7686g.isEmpty() && s.b(this.f7683d)) {
            Log.d("Sqflite", A() + this.f7686g.size() + " cursor(s) are left opened");
        }
        this.f7688i.close();
    }

    public final void l(int i4) {
        u uVar = (u) this.f7686g.get(Integer.valueOf(i4));
        if (uVar != null) {
            m(uVar);
        }
    }

    public final void m(u uVar) {
        try {
            int i4 = uVar.f7719a;
            if (s.c(this.f7683d)) {
                Log.d("Sqflite", A() + "closing cursor " + i4);
            }
            this.f7686g.remove(Integer.valueOf(i4));
            uVar.f7721c.close();
        } catch (Exception unused) {
        }
    }

    public final Map n(Cursor cursor, Integer num) {
        HashMap map = null;
        int columnCount = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (map == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap map2 = new HashMap();
                columnCount = cursor.getColumnCount();
                map2.put("columns", Arrays.asList(cursor.getColumnNames()));
                map2.put("rows", arrayList2);
                arrayList = arrayList2;
                map = map2;
            }
            arrayList.add(AbstractC1050F.a(cursor, columnCount));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return map == null ? new HashMap() : map;
    }

    public final boolean p(InterfaceC1371e interfaceC1371e) {
        if (!w(interfaceC1371e)) {
            return false;
        }
        interfaceC1371e.a(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(k2.InterfaceC1371e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.k.q(k2.e):boolean");
    }

    public final boolean r(InterfaceC1371e interfaceC1371e) throws Throwable {
        Cursor cursorRawQueryWithFactory;
        Integer num = (Integer) interfaceC1371e.c("cursorPageSize");
        final C1049E c1049eD = interfaceC1371e.d();
        if (s.b(this.f7683d)) {
            Log.d("Sqflite", A() + c1049eD);
        }
        u uVar = null;
        try {
            cursorRawQueryWithFactory = z().rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: i2.i
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return k.f(c1049eD, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, c1049eD.c(), AbstractC1051a.f7666a, null);
            try {
                try {
                    Map mapN = n(cursorRawQueryWithFactory, num);
                    if (num != null && !cursorRawQueryWithFactory.isLast() && !cursorRawQueryWithFactory.isAfterLast()) {
                        int i4 = this.f7692m + 1;
                        this.f7692m = i4;
                        mapN.put("cursorId", Integer.valueOf(i4));
                        u uVar2 = new u(i4, num.intValue(), cursorRawQueryWithFactory);
                        try {
                            this.f7686g.put(Integer.valueOf(i4), uVar2);
                            uVar = uVar2;
                        } catch (Exception e4) {
                            e = e4;
                            uVar = uVar2;
                            D(e, interfaceC1371e);
                            if (uVar != null) {
                                m(uVar);
                            }
                            if (uVar != null || cursorRawQueryWithFactory == null) {
                                return false;
                            }
                            cursorRawQueryWithFactory.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            uVar = uVar2;
                            if (uVar == null && cursorRawQueryWithFactory != null) {
                                cursorRawQueryWithFactory.close();
                            }
                            throw th;
                        }
                    }
                    interfaceC1371e.a(mapN);
                    if (uVar == null && cursorRawQueryWithFactory != null) {
                        cursorRawQueryWithFactory.close();
                    }
                    return true;
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
            cursorRawQueryWithFactory = null;
        } catch (Throwable th3) {
            th = th3;
            cursorRawQueryWithFactory = null;
        }
    }

    public final boolean s(InterfaceC1371e interfaceC1371e) throws Throwable {
        boolean z3;
        Integer num = (Integer) interfaceC1371e.c("cursorId");
        int iIntValue = num.intValue();
        boolean zEquals = Boolean.TRUE.equals(interfaceC1371e.c("cancel"));
        if (s.c(this.f7683d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(A());
            sb.append("cursor ");
            sb.append(iIntValue);
            sb.append(zEquals ? " cancel" : " next");
            Log.d("Sqflite", sb.toString());
        }
        u uVar = null;
        if (zEquals) {
            l(iIntValue);
            interfaceC1371e.a(null);
            return true;
        }
        u uVar2 = (u) this.f7686g.get(num);
        int i4 = 0;
        try {
            try {
                if (uVar2 == null) {
                    throw new IllegalStateException("Cursor " + iIntValue + " not found");
                }
                Cursor cursor = uVar2.f7721c;
                Map mapN = n(cursor, Integer.valueOf(uVar2.f7720b));
                z3 = (cursor.isLast() || cursor.isAfterLast()) ? false : true;
                if (z3) {
                    try {
                        mapN.put("cursorId", num);
                    } catch (Exception e4) {
                        e = e4;
                        D(e, interfaceC1371e);
                        if (uVar2 != null) {
                            m(uVar2);
                        } else {
                            uVar = uVar2;
                        }
                        if (!z3 && uVar != null) {
                            m(uVar);
                        }
                        return false;
                    }
                }
                interfaceC1371e.a(mapN);
                if (!z3) {
                    m(uVar2);
                }
                return true;
            } catch (Throwable th) {
                th = th;
                i4 = iIntValue;
                if (i4 == 0 && uVar2 != null) {
                    m(uVar2);
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            z3 = false;
        } catch (Throwable th2) {
            th = th2;
            if (i4 == 0) {
                m(uVar2);
            }
            throw th;
        }
    }

    public final boolean t(InterfaceC1371e interfaceC1371e) throws Throwable {
        if (!w(interfaceC1371e)) {
            return false;
        }
        Cursor cursor = null;
        if (interfaceC1371e.e()) {
            interfaceC1371e.a(null);
            return true;
        }
        try {
            try {
                Cursor cursorRawQuery = C().rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i4 = cursorRawQuery.getInt(0);
                            if (s.b(this.f7683d)) {
                                Log.d("Sqflite", A() + "changed " + i4);
                            }
                            interfaceC1371e.a(Integer.valueOf(i4));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        cursor = cursorRawQuery;
                        D(e, interfaceC1371e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e("Sqflite", A() + "fail to read changes for Update/Delete");
                interfaceC1371e.a(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized void u(Boolean bool) {
        try {
            if (Boolean.TRUE.equals(bool)) {
                this.f7689j++;
            } else if (Boolean.FALSE.equals(bool)) {
                this.f7689j--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void v(final InterfaceC1371e interfaceC1371e) {
        M(interfaceC1371e, new Runnable() { // from class: i2.h
            @Override // java.lang.Runnable
            public final void run() {
                k.e(this.f7675m, interfaceC1371e);
            }
        });
    }

    public final boolean w(InterfaceC1371e interfaceC1371e) {
        C1049E c1049eD = interfaceC1371e.d();
        if (s.b(this.f7683d)) {
            Log.d("Sqflite", A() + c1049eD);
        }
        Boolean boolF = interfaceC1371e.f();
        try {
            C().execSQL(c1049eD.c(), c1049eD.d());
            u(boolF);
            return true;
        } catch (Exception e4) {
            D(e4, interfaceC1371e);
            return false;
        }
    }

    public SQLiteDatabase z() {
        return this.f7688i;
    }

    public class a implements DatabaseErrorHandler {
        public a() {
        }

        @Override // android.database.DatabaseErrorHandler
        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }
}
