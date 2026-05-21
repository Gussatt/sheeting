package i2;

import android.database.Cursor;
import android.util.Log;
import j2.AbstractC1110a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: i2.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1050F {
    public static List a(Cursor cursor, int i4) {
        String name;
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            Object objB = b(cursor, i5);
            if (AbstractC1110a.f8573c) {
                if (objB == null) {
                    name = null;
                } else if (objB.getClass().isArray()) {
                    name = "array(" + objB.getClass().getComponentType().getName() + ")";
                } else {
                    name = objB.getClass().getName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i5);
                sb.append(" ");
                sb.append(cursor.getType(i5));
                sb.append(": ");
                sb.append(objB);
                sb.append(name == null ? "" : " (" + name + ")");
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(objB);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int i4) {
        int type = cursor.getType(i4);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i4));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i4));
        }
        if (type == 3) {
            return cursor.getString(i4);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i4);
    }

    public static Locale c(String str) {
        return Locale.forLanguageTag(str);
    }

    public static Locale d(String str) {
        return c(str);
    }
}
