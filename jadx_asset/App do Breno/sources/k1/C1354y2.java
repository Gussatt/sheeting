package k1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC0721d0;

/* JADX INFO: renamed from: k1.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1354y2 extends AbstractC0721d0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A2 f9981m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354y2(A2 a22, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        this.f9981m = a22;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e4) {
            throw e4;
        } catch (SQLiteException unused) {
            C1363z3 c1363z3 = this.f9981m.f9366a;
            c1363z3.c().r().a("Opening the local database failed, dropping and recreating it");
            c1363z3.B();
            if (!c1363z3.d().getDatabasePath("google_app_measurement_local.db").delete()) {
                c1363z3.c().r().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e5) {
                this.f9981m.f9366a.c().r().b("Failed to open local database. Events will bypass local storage", e5);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC1351y.b(this.f9981m.f9366a.c(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        AbstractC1351y.a(this.f9981m.f9366a.c(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", A2.f8877e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}
