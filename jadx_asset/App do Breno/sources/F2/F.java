package F2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public final class F implements E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1609b f1479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f1480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G f1481e;

    public F(InterfaceC1609b interfaceC1609b, Context context, G g4) {
        X2.l.e(interfaceC1609b, "messenger");
        X2.l.e(context, "context");
        X2.l.e(g4, "listEncoder");
        this.f1479c = interfaceC1609b;
        this.f1480d = context;
        this.f1481e = g4;
        try {
            E.f1476b.s(interfaceC1609b, this, "shared_preferences");
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e4);
        }
    }

    @Override // F2.E
    public void a(String str, long j4, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        c(h4).edit().putLong(str, j4).apply();
    }

    @Override // F2.E
    public void b(List list, H h4) {
        X2.l.e(h4, "options");
        SharedPreferences sharedPreferencesC = c(h4);
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        X2.l.d(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesC.getAll();
        X2.l.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (J.c(str, all.get(str), list != null ? L2.u.I(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        X2.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            X2.l.d(next, "next(...)");
            editorEdit.remove((String) next);
        }
        editorEdit.apply();
    }

    public final SharedPreferences c(H h4) {
        if (h4.a() == null) {
            SharedPreferences sharedPreferencesA = X.b.a(this.f1480d);
            X2.l.b(sharedPreferencesA);
            return sharedPreferencesA;
        }
        SharedPreferences sharedPreferences = this.f1480d.getSharedPreferences(h4.a(), 0);
        X2.l.b(sharedPreferences);
        return sharedPreferences;
    }

    @Override // F2.E
    public M d(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        SharedPreferences sharedPreferencesC = c(h4);
        if (!sharedPreferencesC.contains(str)) {
            return null;
        }
        String string = sharedPreferencesC.getString(str, "");
        X2.l.b(string);
        return f3.p.t(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null) ? new M(string, K.f1614p) : f3.p.t(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null) ? new M(null, K.f1613o) : new M(null, K.f1615q);
    }

    @Override // F2.E
    public Map e(List list, H h4) {
        Object value;
        X2.l.e(h4, "options");
        Map<String, ?> all = c(h4).getAll();
        X2.l.d(all, "getAll(...)");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (J.c(entry.getKey(), entry.getValue(), list != null ? L2.u.I(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objD = J.d(value, this.f1481e);
                X2.l.c(objD, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objD);
            }
        }
        return map;
    }

    @Override // F2.E
    public void f(String str, List list, H h4) {
        X2.l.e(str, "key");
        X2.l.e(list, "value");
        X2.l.e(h4, "options");
        c(h4).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f1481e.a(list)).apply();
    }

    @Override // F2.E
    public List g(String str, H h4) {
        List list;
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        SharedPreferences sharedPreferencesC = c(h4);
        if (sharedPreferencesC.contains(str)) {
            String string = sharedPreferencesC.getString(str, "");
            X2.l.b(string);
            if (f3.p.t(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null) && !f3.p.t(string, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null) && (list = (List) J.d(sharedPreferencesC.getString(str, ""), this.f1481e)) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    @Override // F2.E
    public String h(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        SharedPreferences sharedPreferencesC = c(h4);
        if (sharedPreferencesC.contains(str)) {
            return sharedPreferencesC.getString(str, "");
        }
        return null;
    }

    @Override // F2.E
    public Boolean i(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        SharedPreferences sharedPreferencesC = c(h4);
        if (sharedPreferencesC.contains(str)) {
            return Boolean.valueOf(sharedPreferencesC.getBoolean(str, true));
        }
        return null;
    }

    @Override // F2.E
    public void j(String str, String str2, H h4) {
        X2.l.e(str, "key");
        X2.l.e(str2, "value");
        X2.l.e(h4, "options");
        c(h4).edit().putString(str, str2).apply();
    }

    @Override // F2.E
    public void k(String str, double d4, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        c(h4).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).apply();
    }

    @Override // F2.E
    public void l(String str, boolean z3, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        c(h4).edit().putBoolean(str, z3).apply();
    }

    @Override // F2.E
    public Double m(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        SharedPreferences sharedPreferencesC = c(h4);
        if (!sharedPreferencesC.contains(str)) {
            return null;
        }
        Object objD = J.d(sharedPreferencesC.getString(str, ""), this.f1481e);
        X2.l.c(objD, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objD;
    }

    @Override // F2.E
    public void n(String str, String str2, H h4) {
        X2.l.e(str, "key");
        X2.l.e(str2, "value");
        X2.l.e(h4, "options");
        c(h4).edit().putString(str, str2).apply();
    }

    @Override // F2.E
    public Long o(String str, H h4) {
        long j4;
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        SharedPreferences sharedPreferencesC = c(h4);
        if (!sharedPreferencesC.contains(str)) {
            return null;
        }
        try {
            j4 = sharedPreferencesC.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j4 = sharedPreferencesC.getInt(str, 0);
        }
        return Long.valueOf(j4);
    }

    @Override // F2.E
    public List p(List list, H h4) {
        X2.l.e(h4, "options");
        Map<String, ?> all = c(h4).getAll();
        X2.l.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            X2.l.d(key, "<get-key>(...)");
            if (J.c(key, entry.getValue(), list != null ? L2.u.I(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return L2.u.F(linkedHashMap.keySet());
    }

    public final void q() {
        E.f1476b.s(this.f1479c, null, "shared_preferences");
    }
}
