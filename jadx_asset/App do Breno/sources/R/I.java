package R;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3031a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3032b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3033c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f3034d;

    public void a(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (this.f3031a.contains(abstractComponentCallbacksC0497o)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0497o);
        }
        synchronized (this.f3031a) {
            this.f3031a.add(abstractComponentCallbacksC0497o);
        }
        abstractComponentCallbacksC0497o.f3258m = true;
    }

    public void b() {
        this.f3032b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f3032b.get(str) != null;
    }

    public void d(int i4) {
        for (H h4 : this.f3032b.values()) {
            if (h4 != null) {
                h4.r(i4);
            }
        }
    }

    public AbstractComponentCallbacksC0497o e(String str) {
        H h4 = (H) this.f3032b.get(str);
        if (h4 != null) {
            return h4.k();
        }
        return null;
    }

    public AbstractComponentCallbacksC0497o f(int i4) {
        for (int size = this.f3031a.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = (AbstractComponentCallbacksC0497o) this.f3031a.get(size);
            if (abstractComponentCallbacksC0497o != null && abstractComponentCallbacksC0497o.f3270y == i4) {
                return abstractComponentCallbacksC0497o;
            }
        }
        for (H h4 : this.f3032b.values()) {
            if (h4 != null) {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
                if (abstractComponentCallbacksC0497oK.f3270y == i4) {
                    return abstractComponentCallbacksC0497oK;
                }
            }
        }
        return null;
    }

    public AbstractComponentCallbacksC0497o g(String str) {
        if (str != null) {
            for (int size = this.f3031a.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = (AbstractComponentCallbacksC0497o) this.f3031a.get(size);
                if (abstractComponentCallbacksC0497o != null && str.equals(abstractComponentCallbacksC0497o.f3219A)) {
                    return abstractComponentCallbacksC0497o;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (H h4 : this.f3032b.values()) {
            if (h4 != null) {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
                if (str.equals(abstractComponentCallbacksC0497oK.f3219A)) {
                    return abstractComponentCallbacksC0497oK;
                }
            }
        }
        return null;
    }

    public int h(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        View view;
        View view2;
        ViewGroup viewGroup = abstractComponentCallbacksC0497o.f3227I;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f3031a.indexOf(abstractComponentCallbacksC0497o);
        for (int i4 = iIndexOf - 1; i4 >= 0; i4--) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2 = (AbstractComponentCallbacksC0497o) this.f3031a.get(i4);
            if (abstractComponentCallbacksC0497o2.f3227I == viewGroup && (view2 = abstractComponentCallbacksC0497o2.f3228J) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f3031a.size()) {
                return -1;
            }
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o3 = (AbstractComponentCallbacksC0497o) this.f3031a.get(iIndexOf);
            if (abstractComponentCallbacksC0497o3.f3227I == viewGroup && (view = abstractComponentCallbacksC0497o3.f3228J) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List i() {
        ArrayList arrayList = new ArrayList();
        for (H h4 : this.f3032b.values()) {
            if (h4 != null) {
                arrayList.add(h4);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList = new ArrayList();
        for (H h4 : this.f3032b.values()) {
            if (h4 != null) {
                arrayList.add(h4.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap k() {
        return this.f3033c;
    }

    public H l(String str) {
        return (H) this.f3032b.get(str);
    }

    public List m() {
        ArrayList arrayList;
        if (this.f3031a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f3031a) {
            arrayList = new ArrayList(this.f3031a);
        }
        return arrayList;
    }

    public E n() {
        return this.f3034d;
    }

    public Bundle o(String str) {
        return (Bundle) this.f3033c.get(str);
    }

    public void p(H h4) {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
        if (c(abstractComponentCallbacksC0497oK.f3252g)) {
            return;
        }
        this.f3032b.put(abstractComponentCallbacksC0497oK.f3252g, h4);
        if (abstractComponentCallbacksC0497oK.f3223E) {
            if (abstractComponentCallbacksC0497oK.f3222D) {
                this.f3034d.d(abstractComponentCallbacksC0497oK);
            } else {
                this.f3034d.l(abstractComponentCallbacksC0497oK);
            }
            abstractComponentCallbacksC0497oK.f3223E = false;
        }
        if (B.m0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0497oK);
        }
    }

    public void q(H h4) {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
        if (abstractComponentCallbacksC0497oK.f3222D) {
            this.f3034d.l(abstractComponentCallbacksC0497oK);
        }
        if (this.f3032b.get(abstractComponentCallbacksC0497oK.f3252g) == h4 && ((H) this.f3032b.put(abstractComponentCallbacksC0497oK.f3252g, null)) != null && B.m0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0497oK);
        }
    }

    public void r() {
        Iterator it = this.f3031a.iterator();
        while (it.hasNext()) {
            H h4 = (H) this.f3032b.get(((AbstractComponentCallbacksC0497o) it.next()).f3252g);
            if (h4 != null) {
                h4.m();
            }
        }
        for (H h5 : this.f3032b.values()) {
            if (h5 != null) {
                h5.m();
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h5.k();
                if (abstractComponentCallbacksC0497oK.f3259n && !abstractComponentCallbacksC0497oK.b0()) {
                    if (abstractComponentCallbacksC0497oK.f3261p && !this.f3033c.containsKey(abstractComponentCallbacksC0497oK.f3252g)) {
                        z(abstractComponentCallbacksC0497oK.f3252g, h5.p());
                    }
                    q(h5);
                }
            }
        }
    }

    public void s(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        synchronized (this.f3031a) {
            this.f3031a.remove(abstractComponentCallbacksC0497o);
        }
        abstractComponentCallbacksC0497o.f3258m = false;
    }

    public void t() {
        this.f3032b.clear();
    }

    public void u(List list) {
        this.f3031a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oE = e(str);
                if (abstractComponentCallbacksC0497oE == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (B.m0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + abstractComponentCallbacksC0497oE);
                }
                a(abstractComponentCallbacksC0497oE);
            }
        }
    }

    public void v(HashMap map) {
        this.f3033c.clear();
        this.f3033c.putAll(map);
    }

    public ArrayList w() {
        ArrayList arrayList = new ArrayList(this.f3032b.size());
        for (H h4 : this.f3032b.values()) {
            if (h4 != null) {
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oK = h4.k();
                z(abstractComponentCallbacksC0497oK.f3252g, h4.p());
                arrayList.add(abstractComponentCallbacksC0497oK.f3252g);
                if (B.m0(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0497oK + ": " + abstractComponentCallbacksC0497oK.f3248c);
                }
            }
        }
        return arrayList;
    }

    public ArrayList x() {
        synchronized (this.f3031a) {
            try {
                if (this.f3031a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f3031a.size());
                for (AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o : this.f3031a) {
                    arrayList.add(abstractComponentCallbacksC0497o.f3252g);
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0497o.f3252g + "): " + abstractComponentCallbacksC0497o);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(E e4) {
        this.f3034d = e4;
    }

    public Bundle z(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f3033c.put(str, bundle) : (Bundle) this.f3033c.remove(str);
    }
}
