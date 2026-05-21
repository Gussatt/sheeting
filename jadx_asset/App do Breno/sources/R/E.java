package R;

import android.util.Log;
import androidx.lifecycle.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class E extends androidx.lifecycle.B {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C.b f3001k = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3005g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3002d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f3003e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f3004f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3006h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3007i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3008j = false;

    public class a implements C.b {
        @Override // androidx.lifecycle.C.b
        public androidx.lifecycle.B a(Class cls) {
            return new E(true);
        }
    }

    public E(boolean z3) {
        this.f3005g = z3;
    }

    @Override // androidx.lifecycle.B
    public void c() {
        if (B.m0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3006h = true;
    }

    public void d(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (this.f3008j) {
            if (B.m0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3002d.containsKey(abstractComponentCallbacksC0497o.f3252g)) {
                return;
            }
            this.f3002d.put(abstractComponentCallbacksC0497o.f3252g, abstractComponentCallbacksC0497o);
            if (B.m0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC0497o);
            }
        }
    }

    public void e(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, boolean z3) {
        if (B.m0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0497o);
        }
        g(abstractComponentCallbacksC0497o.f3252g, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e4 = (E) obj;
            if (this.f3002d.equals(e4.f3002d) && this.f3003e.equals(e4.f3003e) && this.f3004f.equals(e4.f3004f)) {
                return true;
            }
        }
        return false;
    }

    public void f(String str, boolean z3) {
        if (B.m0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z3);
    }

    public final void g(String str, boolean z3) {
        E e4 = (E) this.f3003e.get(str);
        if (e4 != null) {
            if (z3) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(e4.f3003e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e4.f((String) it.next(), true);
                }
            }
            e4.c();
            this.f3003e.remove(str);
        }
        androidx.lifecycle.E e5 = (androidx.lifecycle.E) this.f3004f.get(str);
        if (e5 != null) {
            e5.a();
            this.f3004f.remove(str);
        }
    }

    public AbstractComponentCallbacksC0497o h(String str) {
        return (AbstractComponentCallbacksC0497o) this.f3002d.get(str);
    }

    public int hashCode() {
        return (((this.f3002d.hashCode() * 31) + this.f3003e.hashCode()) * 31) + this.f3004f.hashCode();
    }

    public E i(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        E e4 = (E) this.f3003e.get(abstractComponentCallbacksC0497o.f3252g);
        if (e4 != null) {
            return e4;
        }
        E e5 = new E(this.f3005g);
        this.f3003e.put(abstractComponentCallbacksC0497o.f3252g, e5);
        return e5;
    }

    public Collection j() {
        return new ArrayList(this.f3002d.values());
    }

    public androidx.lifecycle.E k(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        androidx.lifecycle.E e4 = (androidx.lifecycle.E) this.f3004f.get(abstractComponentCallbacksC0497o.f3252g);
        if (e4 != null) {
            return e4;
        }
        androidx.lifecycle.E e5 = new androidx.lifecycle.E();
        this.f3004f.put(abstractComponentCallbacksC0497o.f3252g, e5);
        return e5;
    }

    public void l(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (this.f3008j) {
            if (B.m0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3002d.remove(abstractComponentCallbacksC0497o.f3252g) == null || !B.m0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0497o);
        }
    }

    public void m(boolean z3) {
        this.f3008j = z3;
    }

    public boolean n(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (this.f3002d.containsKey(abstractComponentCallbacksC0497o.f3252g)) {
            return this.f3005g ? this.f3006h : !this.f3007i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3002d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3003e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3004f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
