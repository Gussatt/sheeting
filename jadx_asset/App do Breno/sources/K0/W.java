package K0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f2402o = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f2403p = 7;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f2404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f2405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f2406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f2407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f2408u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f2409v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f2410w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f2411x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2413n;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: K0.O
            @Override // K0.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.a(sQLiteDatabase);
            }
        };
        f2404q = aVar;
        a aVar2 = new a() { // from class: K0.P
            @Override // K0.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.g(sQLiteDatabase);
            }
        };
        f2405r = aVar2;
        a aVar3 = new a() { // from class: K0.Q
            @Override // K0.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f2406s = aVar3;
        a aVar4 = new a() { // from class: K0.S
            @Override // K0.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.j(sQLiteDatabase);
            }
        };
        f2407t = aVar4;
        a aVar5 = new a() { // from class: K0.T
            @Override // K0.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.e(sQLiteDatabase);
            }
        };
        f2408u = aVar5;
        a aVar6 = new a() { // from class: K0.U
            @Override // K0.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f2409v = aVar6;
        a aVar7 = new a() { // from class: K0.V
            @Override // K0.W.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                W.c(sQLiteDatabase);
            }
        };
        f2410w = aVar7;
        f2411x = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public W(Context context, String str, int i4) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i4);
        this.f2413n = false;
        this.f2412m = i4;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void e(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f2402o);
    }

    public static /* synthetic */ void g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public final void k(SQLiteDatabase sQLiteDatabase) {
        if (this.f2413n) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public final void l(SQLiteDatabase sQLiteDatabase, int i4) {
        k(sQLiteDatabase);
        q(sQLiteDatabase, 0, i4);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f2413n = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        l(sQLiteDatabase, this.f2412m);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        l(sQLiteDatabase, i5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        k(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        k(sQLiteDatabase);
        q(sQLiteDatabase, i4, i5);
    }

    public final void q(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        List list = f2411x;
        if (i5 <= list.size()) {
            while (i4 < i5) {
                ((a) f2411x.get(i4)).a(sQLiteDatabase);
                i4++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i4 + " to " + i5 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
