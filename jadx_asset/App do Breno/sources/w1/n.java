package w1;

import U0.X;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import w1.n;

/* JADX INFO: loaded from: classes.dex */
public class n implements InterfaceC1605d, N1.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final U1.b f11822i = new U1.b() { // from class: w1.j
        @Override // U1.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f11826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f11827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f11828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f11829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f11830h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f11831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f11832b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f11833c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i f11834d = i.f11815a;

        public b(Executor executor) {
            this.f11831a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C1604c c1604c) {
            this.f11833c.add(c1604c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f11832b.add(new U1.b() { // from class: w1.o
                @Override // U1.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f11832b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f11831a, this.f11832b, this.f11833c, this.f11834d);
        }

        public b f(i iVar) {
            this.f11834d = iVar;
            return this;
        }
    }

    public static /* synthetic */ Object j(n nVar, C1604c c1604c) {
        nVar.getClass();
        return c1604c.h().a(new F(c1604c, nVar));
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    public static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // w1.InterfaceC1605d
    public U1.a c(E e4) {
        U1.b bVarG = g(e4);
        return bVarG == null ? C1600C.e() : bVarG instanceof C1600C ? (C1600C) bVarG : C1600C.f(bVarG);
    }

    @Override // w1.InterfaceC1605d
    public synchronized U1.b d(E e4) {
        x xVar = (x) this.f11825c.get(e4);
        if (xVar != null) {
            return xVar;
        }
        return f11822i;
    }

    @Override // w1.InterfaceC1605d
    public synchronized U1.b g(E e4) {
        AbstractC1601D.c(e4, "Null interface requested.");
        return (U1.b) this.f11824b.get(e4);
    }

    public final void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f11826d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((U1.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f11830h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e4) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C1604c) it2.next()).j().toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj = array[i4];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f11827e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f11827e.add(obj.toString());
                        }
                        i4++;
                    }
                }
            }
            if (this.f11823a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f11823a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C1604c c1604c = (C1604c) it3.next();
                this.f11823a.put(c1604c, new w(new U1.b() { // from class: w1.k
                    @Override // U1.b
                    public final Object get() {
                        return n.j(this.f11816a, c1604c);
                    }
                }));
            }
            arrayList.addAll(t(list));
            arrayList.addAll(u());
            s();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        r();
    }

    public final void o(Map map, boolean z3) {
        for (Map.Entry entry : map.entrySet()) {
            C1604c c1604c = (C1604c) entry.getKey();
            U1.b bVar = (U1.b) entry.getValue();
            if (c1604c.n() || (c1604c.o() && z3)) {
                bVar.get();
            }
        }
        this.f11828f.d();
    }

    public void p(boolean z3) {
        HashMap map;
        if (X.a(this.f11829g, null, Boolean.valueOf(z3))) {
            synchronized (this) {
                map = new HashMap(this.f11823a);
            }
            o(map, z3);
        }
    }

    public final void r() {
        Boolean bool = (Boolean) this.f11829g.get();
        if (bool != null) {
            o(this.f11823a, bool.booleanValue());
        }
    }

    public final void s() {
        for (C1604c c1604c : this.f11823a.keySet()) {
            for (q qVar : c1604c.g()) {
                if (qVar.g() && !this.f11825c.containsKey(qVar.c())) {
                    this.f11825c.put(qVar.c(), x.b(Collections.EMPTY_SET));
                } else if (this.f11824b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c1604c, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f11824b.put(qVar.c(), C1600C.e());
                    }
                }
            }
        }
    }

    public final List t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1604c c1604c = (C1604c) it.next();
            if (c1604c.p()) {
                final U1.b bVar = (U1.b) this.f11823a.get(c1604c);
                for (E e4 : c1604c.j()) {
                    if (this.f11824b.containsKey(e4)) {
                        final C1600C c1600c = (C1600C) ((U1.b) this.f11824b.get(e4));
                        arrayList.add(new Runnable() { // from class: w1.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1600c.g(bVar);
                            }
                        });
                    } else {
                        this.f11824b.put(e4, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List u() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f11823a.entrySet()) {
            C1604c c1604c = (C1604c) entry.getKey();
            if (!c1604c.p()) {
                U1.b bVar = (U1.b) entry.getValue();
                for (E e4 : c1604c.j()) {
                    if (!map.containsKey(e4)) {
                        map.put(e4, new HashSet());
                    }
                    ((Set) map.get(e4)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f11825c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f11825c.get(entry2.getKey());
                for (final U1.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: w1.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f11825c.put((E) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f11823a = new HashMap();
        this.f11824b = new HashMap();
        this.f11825c = new HashMap();
        this.f11827e = new HashSet();
        this.f11829g = new AtomicReference();
        u uVar = new u(executor);
        this.f11828f = uVar;
        this.f11830h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1604c.q(uVar, u.class, S1.d.class, S1.c.class));
        arrayList.add(C1604c.q(this, N1.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1604c c1604c = (C1604c) it.next();
            if (c1604c != null) {
                arrayList.add(c1604c);
            }
        }
        this.f11826d = q(iterable);
        n(arrayList);
    }
}
