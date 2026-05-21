package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0721d0 extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0721d0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        AbstractC0739f0 abstractC0739f0 = AbstractC0739f0.f6707a;
        Z.a();
    }
}
