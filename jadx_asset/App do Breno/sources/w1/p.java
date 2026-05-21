package w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1604c f11836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f11837b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f11838c = new HashSet();

        public b(C1604c c1604c) {
            this.f11836a = c1604c;
        }

        public void a(b bVar) {
            this.f11837b.add(bVar);
        }

        public void b(b bVar) {
            this.f11838c.add(bVar);
        }

        public C1604c c() {
            return this.f11836a;
        }

        public Set d() {
            return this.f11837b;
        }

        public boolean e() {
            return this.f11837b.isEmpty();
        }

        public boolean f() {
            return this.f11838c.isEmpty();
        }

        public void g(b bVar) {
            this.f11838c.remove(bVar);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f11839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11840b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f11839a.equals(this.f11839a) && cVar.f11840b == this.f11840b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f11839a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f11840b).hashCode();
        }

        public c(E e4, boolean z3) {
            this.f11839a = e4;
            this.f11840b = z3;
        }
    }

    public static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i4 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i4++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i4 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new r(arrayList);
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.e() && (set = (Set) map.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C1604c c1604c = (C1604c) it.next();
            b bVar3 = new b(c1604c);
            for (E e4 : c1604c.j()) {
                c cVar = new c(e4, !c1604c.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f11840b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", e4));
                }
                set2.add(bVar3);
            }
        }
    }
}
