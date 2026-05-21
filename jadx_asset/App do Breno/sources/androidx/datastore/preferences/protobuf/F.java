package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class F implements E {
    public static int i(int i4, Object obj, Object obj2) {
        D d4 = (D) obj;
        C c4 = (C) obj2;
        int iA = 0;
        if (d4.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : d4.entrySet()) {
            iA += c4.a(i4, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static D j(Object obj, Object obj2) {
        D dO = (D) obj;
        D d4 = (D) obj2;
        if (!d4.isEmpty()) {
            if (!dO.l()) {
                dO = dO.o();
            }
            dO.n(d4);
        }
        return dO;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object b(Object obj) {
        return D.g().o();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public int c(int i4, Object obj, Object obj2) {
        return i(i4, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public boolean d(Object obj) {
        return !((D) obj).l();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object e(Object obj) {
        ((D) obj).m();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public C.a f(Object obj) {
        return ((C) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map g(Object obj) {
        return (D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map h(Object obj) {
        return (D) obj;
    }
}
