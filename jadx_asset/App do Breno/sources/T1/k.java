package T1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3494a;

    public k(Context context, String str) {
        this.f3494a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j4 = this.f3494a.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.f3494a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f3494a.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.f3494a.edit().putStringSet(key, hashSet).putLong("fire-count", j4 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            SharedPreferences.Editor editorEdit = this.f3494a.edit();
            int i4 = 0;
            for (Map.Entry<String, ?> entry : this.f3494a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strD = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strD)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strD);
                        i4++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i4 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i4);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f3494a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(l.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            h(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j4)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j4));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f3494a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        try {
            String strE = e(str);
            if (strE == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f3494a.getStringSet(strE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f3494a.edit().remove(strE).commit();
            } else {
                this.f3494a.edit().putStringSet(strE, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g(long j4, String str) {
        String strD = d(j4);
        if (this.f3494a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            i(str, strD);
            return;
        }
        long j5 = this.f3494a.getLong("fire-count", 0L);
        if (j5 + 1 == 30) {
            a();
            j5 = this.f3494a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f3494a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f3494a.edit().putStringSet(str, hashSet).putLong("fire-count", j5 + 1).putString("last-used-date", strD).commit();
    }

    public synchronized void h(long j4) {
        this.f3494a.edit().putLong("fire-global", j4).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f3494a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f3494a.edit().putStringSet(str, hashSet).commit();
    }
}
