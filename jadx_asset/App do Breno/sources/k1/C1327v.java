package k1;

import V0.AbstractC0549h;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: k1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1327v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1343x f9884c;

    public C1327v(C1343x c1343x, String str) {
        this.f9884c = c1343x;
        AbstractC0549h.d(str);
        this.f9882a = str;
        this.f9883b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f9884c.y0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f9882a, String.valueOf(this.f9883b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j4 = cursorQuery.getLong(0);
                        long j5 = cursorQuery.getLong(3);
                        boolean z3 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j4 > this.f9883b) {
                            this.f9883b = j4;
                        }
                        try {
                            com.google.android.gms.internal.measurement.H2 h22 = (com.google.android.gms.internal.measurement.H2) r7.M(com.google.android.gms.internal.measurement.I2.J(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            h22.C(string);
                            h22.G(cursorQuery.getLong(2));
                            arrayList.add(new C1319u(j4, j5, z3, (com.google.android.gms.internal.measurement.I2) h22.q()));
                        } catch (IOException e4) {
                            this.f9884c.f9366a.c().r().c("Data loss. Failed to merge raw event. appId", K2.z(this.f9882a), e4);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e5) {
                this.f9884c.f9366a.c().r().c("Data loss. Error querying raw events batch. appId", K2.z(this.f9882a), e5);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public C1327v(C1343x c1343x, String str, long j4) {
        this.f9884c = c1343x;
        AbstractC0549h.d(str);
        this.f9882a = str;
        this.f9883b = c1343x.r0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j4)}, -1L);
    }
}
