package U0;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import n1.C1446m;

/* JADX INFO: renamed from: U0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0532p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3591a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3592b = Collections.synchronizedMap(new WeakHashMap());

    public final void b(C1446m c1446m, boolean z3) {
        this.f3592b.put(c1446m, Boolean.valueOf(z3));
        c1446m.a().c(new C0531o(this, c1446m));
    }

    public final void c(int i4, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        f(true, new Status(20, sb.toString()));
    }

    public final void d() {
        f(false, C0521e.f3561p);
    }

    public final boolean e() {
        return (this.f3591a.isEmpty() && this.f3592b.isEmpty()) ? false : true;
    }

    public final void f(boolean z3, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f3591a) {
            map = new HashMap(this.f3591a);
        }
        synchronized (this.f3592b) {
            map2 = new HashMap(this.f3592b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                i.d.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1446m) entry2.getKey()).d(new T0.b(status));
            }
        }
    }
}
