package K0;

import C0.i;
import F0.a;
import F0.c;
import L0.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public class M implements InterfaceC0456d, L0.b, InterfaceC0455c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1661b f2389r = C1661b.b("proto");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final W f2390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M0.a f2391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M0.a f2392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC0457e f2393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final J2.a f2394q;

    public interface b {
        Object apply(Object obj);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2396b;

        public c(String str, String str2) {
            this.f2395a = str;
            this.f2396b = str2;
        }
    }

    public interface d {
        Object a();
    }

    public M(M0.a aVar, M0.a aVar2, AbstractC0457e abstractC0457e, W w4, J2.a aVar3) {
        this.f2390m = w4;
        this.f2391n = aVar;
        this.f2392o = aVar2;
        this.f2393p = abstractC0457e;
        this.f2394q = aVar3;
    }

    public static /* synthetic */ F0.a C(M m4, Map map, a.C0014a c0014a, Cursor cursor) {
        m4.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarX = m4.X(cursor.getInt(1));
            long j4 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(F0.c.c().c(bVarX).b(j4).a());
        }
        m4.n0(c0014a, map);
        return c0014a.e(m4.f0()).d(m4.c0()).c((String) m4.f2394q.get()).b();
    }

    public static /* synthetic */ Long F(M m4, C0.i iVar, C0.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (m4.i0()) {
            m4.e(1L, c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jZ = m4.Z(sQLiteDatabase, pVar);
        int iE = m4.f2393p.e();
        byte[] bArrA = iVar.e().a();
        boolean z3 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jZ));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z3));
        contentValues.put("payload", z3 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z3) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i4 = 1; i4 <= iCeil; i4++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i4 - 1) * iE, Math.min(i4 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i4));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Object G(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long H(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object I(Throwable th) {
        throw new L0.a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ Object M(String str, c.b bVar, long j4, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) s0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())}), new b() { // from class: K0.y
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.a()));
        contentValues.put("events_dropped_count", Long.valueOf(j4));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object O(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j4 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j4));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j4), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Integer R(final M m4, long j4, SQLiteDatabase sQLiteDatabase) {
        m4.getClass();
        String[] strArr = {String.valueOf(j4)};
        s0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: K0.r
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.q(this.f2447a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object S(M m4, List list, C0.p pVar, Cursor cursor) {
        m4.getClass();
        while (cursor.moveToNext()) {
            long j4 = cursor.getLong(0);
            boolean z3 = cursor.getInt(7) != 0;
            i.a aVarO = C0.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z3) {
                aVarO.h(new C0.h(q0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new C0.h(q0(cursor.getString(4)), m4.o0(j4)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(AbstractC0463k.a(j4, pVar, aVarO.d()));
        }
        return null;
    }

    public static /* synthetic */ Object T(M m4, SQLiteDatabase sQLiteDatabase) {
        m4.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m4.f2391n.a()).execute();
        return null;
    }

    public static /* synthetic */ F0.a U(final M m4, String str, final Map map, final a.C0014a c0014a, SQLiteDatabase sQLiteDatabase) {
        m4.getClass();
        return (F0.a) s0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: K0.A
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.C(this.f2376a, map, c0014a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long V(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ F0.f W(final long j4, SQLiteDatabase sQLiteDatabase) {
        return (F0.f) s0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: K0.D
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.f(j4, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ F0.f f(long j4, Cursor cursor) {
        cursor.moveToNext();
        return F0.f.c().c(cursor.getLong(0)).b(j4).a();
    }

    public static /* synthetic */ List g(M m4, C0.p pVar, SQLiteDatabase sQLiteDatabase) {
        List listK0 = m4.k0(sQLiteDatabase, pVar, m4.f2393p.d());
        for (z0.e eVar : z0.e.values()) {
            if (eVar != pVar.d()) {
                int iD = m4.f2393p.d() - listK0.size();
                if (iD <= 0) {
                    break;
                }
                listK0.addAll(m4.k0(sQLiteDatabase, pVar.f(eVar), iD));
            }
        }
        return m4.j0(listK0, m4.l0(sQLiteDatabase, listK0));
    }

    public static /* synthetic */ List j(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C0.p.a().b(cursor.getString(1)).d(N0.a.b(cursor.getInt(2))).c(m0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object k(M m4, Cursor cursor) {
        m4.getClass();
        while (cursor.moveToNext()) {
            m4.e(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase l(Throwable th) {
        throw new L0.a("Timed out while trying to open db.", th);
    }

    public static byte[] m0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object q(M m4, Cursor cursor) {
        m4.getClass();
        while (cursor.moveToNext()) {
            m4.e(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static C1661b q0(String str) {
        return str == null ? f2389r : C1661b.b(str);
    }

    public static /* synthetic */ Object r(final M m4, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m4.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        s0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: K0.u
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.k(this.f2452a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static String r0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0463k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object s0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Boolean u(M m4, C0.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lG0 = m4.g0(sQLiteDatabase, pVar);
        return lG0 == null ? Boolean.FALSE : (Boolean) s0(m4.b0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG0.toString()}), new b() { // from class: K0.t
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object w(long j4, C0.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j4));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(N0.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(N0.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] x(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List z(SQLiteDatabase sQLiteDatabase) {
        return (List) s0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: K0.J
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.j((Cursor) obj);
            }
        });
    }

    @Override // K0.InterfaceC0456d
    public boolean B(final C0.p pVar) {
        return ((Boolean) h0(new b() { // from class: K0.n
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.u(this.f2439a, pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // K0.InterfaceC0456d
    public void J(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + r0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            h0(new b() { // from class: K0.K
                @Override // K0.M.b
                public final Object apply(Object obj) {
                    return M.r(this.f2384a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // K0.InterfaceC0456d
    public long L(C0.p pVar) {
        return ((Long) s0(b0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(N0.a.a(pVar.d()))}), new b() { // from class: K0.H
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.V((Cursor) obj);
            }
        })).longValue();
    }

    @Override // K0.InterfaceC0456d
    public void Q(final C0.p pVar, final long j4) {
        h0(new b() { // from class: K0.o
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.w(j4, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final c.b X(int i4) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i4 == bVar.a()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i4 == bVar2.a()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i4 == bVar3.a()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i4 == bVar4.a()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i4 == bVar5.a()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i4 == bVar6.a()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i4 == bVar7.a()) {
            return bVar7;
        }
        G0.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i4));
        return bVar;
    }

    public final void Y(final SQLiteDatabase sQLiteDatabase) {
        p0(new d() { // from class: K0.l
            @Override // K0.M.d
            public final Object a() {
                return M.G(sQLiteDatabase);
            }
        }, new b() { // from class: K0.w
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.I((Throwable) obj);
            }
        });
    }

    public final long Z(SQLiteDatabase sQLiteDatabase, C0.p pVar) {
        Long lG0 = g0(sQLiteDatabase, pVar);
        if (lG0 != null) {
            return lG0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(N0.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // K0.InterfaceC0455c
    public F0.a a() {
        final a.C0014a c0014aE = F0.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (F0.a) h0(new b() { // from class: K0.s
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.U(this.f2448a, str, map, c0014aE, (SQLiteDatabase) obj);
            }
        });
    }

    public long a0() {
        return d0() * e0();
    }

    @Override // K0.InterfaceC0456d
    public int b() {
        final long jA = this.f2391n.a() - this.f2393p.c();
        return ((Integer) h0(new b() { // from class: K0.I
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.R(this.f2382a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    public SQLiteDatabase b0() {
        final W w4 = this.f2390m;
        Objects.requireNonNull(w4);
        return (SQLiteDatabase) p0(new d() { // from class: K0.E
            @Override // K0.M.d
            public final Object a() {
                return w4.getWritableDatabase();
            }
        }, new b() { // from class: K0.F
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.l((Throwable) obj);
            }
        });
    }

    @Override // K0.InterfaceC0455c
    public void c() {
        h0(new b() { // from class: K0.p
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.T(this.f2443a, (SQLiteDatabase) obj);
            }
        });
    }

    public final F0.b c0() {
        return F0.b.b().b(F0.e.c().b(a0()).c(AbstractC0457e.f2430a.f()).a()).a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2390m.close();
    }

    @Override // L0.b
    public Object d(b.a aVar) {
        SQLiteDatabase sQLiteDatabaseB0 = b0();
        Y(sQLiteDatabaseB0);
        try {
            Object objA = aVar.a();
            sQLiteDatabaseB0.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseB0.endTransaction();
        }
    }

    public final long d0() {
        return b0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // K0.InterfaceC0455c
    public void e(final long j4, final c.b bVar, final String str) {
        h0(new b() { // from class: K0.q
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.M(str, bVar, j4, (SQLiteDatabase) obj);
            }
        });
    }

    public final long e0() {
        return b0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final F0.f f0() {
        final long jA = this.f2391n.a();
        return (F0.f) h0(new b() { // from class: K0.C
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.W(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long g0(SQLiteDatabase sQLiteDatabase, C0.p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(N0.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) s0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: K0.x
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.H((Cursor) obj);
            }
        });
    }

    public Object h0(b bVar) {
        SQLiteDatabase sQLiteDatabaseB0 = b0();
        sQLiteDatabaseB0.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseB0);
            sQLiteDatabaseB0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB0.endTransaction();
        }
    }

    @Override // K0.InterfaceC0456d
    public void i(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            b0().compileStatement("DELETE FROM events WHERE _id in " + r0(iterable)).execute();
        }
    }

    public final boolean i0() {
        return d0() * e0() >= this.f2393p.f();
    }

    public final List j0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0463k abstractC0463k = (AbstractC0463k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC0463k.c()))) {
                i.a aVarP = abstractC0463k.b().p();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC0463k.c()))) {
                    aVarP.c(cVar.f2395a, cVar.f2396b);
                }
                listIterator.set(AbstractC0463k.a(abstractC0463k.c(), abstractC0463k.d(), aVarP.d()));
            }
        }
        return list;
    }

    public final List k0(SQLiteDatabase sQLiteDatabase, final C0.p pVar, int i4) {
        final ArrayList arrayList = new ArrayList();
        Long lG0 = g0(sQLiteDatabase, pVar);
        if (lG0 == null) {
            return arrayList;
        }
        s0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lG0.toString()}, null, null, null, String.valueOf(i4)), new b() { // from class: K0.v
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.S(this.f2453a, arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map l0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(((AbstractC0463k) list.get(i4)).c());
            if (i4 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        s0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: K0.z
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.O(map, (Cursor) obj);
            }
        });
        return map;
    }

    @Override // K0.InterfaceC0456d
    public AbstractC0463k n(final C0.p pVar, final C0.i iVar) {
        G0.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) h0(new b() { // from class: K0.m
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.F(this.f2436a, iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC0463k.a(jLongValue, pVar, iVar);
    }

    public final void n0(a.C0014a c0014a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0014a.a(F0.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] o0(long j4) {
        return (byte[]) s0(b0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num"), new b() { // from class: K0.B
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.x((Cursor) obj);
            }
        });
    }

    public final Object p0(d dVar, b bVar) {
        long jA = this.f2392o.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e4) {
                if (this.f2392o.a() >= ((long) this.f2393p.b()) + jA) {
                    return bVar.apply(e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // K0.InterfaceC0456d
    public Iterable v() {
        return (Iterable) h0(new b() { // from class: K0.G
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.z((SQLiteDatabase) obj);
            }
        });
    }

    @Override // K0.InterfaceC0456d
    public Iterable y(final C0.p pVar) {
        return (Iterable) h0(new b() { // from class: K0.L
            @Override // K0.M.b
            public final Object apply(Object obj) {
                return M.g(this.f2387a, pVar, (SQLiteDatabase) obj);
            }
        });
    }
}
