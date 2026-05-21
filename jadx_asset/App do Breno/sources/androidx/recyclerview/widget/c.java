package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f5409h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f5410i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f5411j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f5412k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f5413l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f5414m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f5415n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f5416o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f5417p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f5418q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f5419r = new ArrayList();

    public class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f5420m;

        public a(ArrayList arrayList) {
            this.f5420m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : this.f5420m) {
                c cVar = c.this;
                eVar.getClass();
                cVar.o(null, eVar.f5426a, eVar.f5427b, eVar.f5428c, eVar.f5429d);
            }
            this.f5420m.clear();
            c.this.f5414m.remove(this.f5420m);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f5422m;

        public b(ArrayList arrayList) {
            this.f5422m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5422m.iterator();
            while (it.hasNext()) {
                c.this.n((d) it.next());
            }
            this.f5422m.clear();
            c.this.f5415n.remove(this.f5422m);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    public class RunnableC0103c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ArrayList f5424m;

        public RunnableC0103c(ArrayList arrayList) {
            this.f5424m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5424m.iterator();
            while (it.hasNext()) {
                i.d.a(it.next());
                c.this.m(null);
            }
            this.f5424m.clear();
            c.this.f5413l.remove(this.f5424m);
        }
    }

    public static class d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5429d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void c() {
        int size = this.f5411j.size() - 1;
        if (size >= 0) {
            ((e) this.f5411j.get(size)).getClass();
            throw null;
        }
        for (int size2 = this.f5409h.size() - 1; size2 >= 0; size2--) {
            i.d.a(this.f5409h.get(size2));
            k(null);
            this.f5409h.remove(size2);
        }
        int size3 = this.f5410i.size() - 1;
        if (size3 >= 0) {
            i.d.a(this.f5410i.get(size3));
            throw null;
        }
        for (int size4 = this.f5412k.size() - 1; size4 >= 0; size4--) {
            r((d) this.f5412k.get(size4));
        }
        this.f5412k.clear();
        if (g()) {
            for (int size5 = this.f5414m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f5414m.get(size5);
                int size6 = arrayList.size() - 1;
                if (size6 >= 0) {
                    ((e) arrayList.get(size6)).getClass();
                    throw null;
                }
            }
            for (int size7 = this.f5413l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f5413l.get(size7);
                int size8 = arrayList2.size() - 1;
                if (size8 >= 0) {
                    i.d.a(arrayList2.get(size8));
                    throw null;
                }
            }
            for (int size9 = this.f5415n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f5415n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    r((d) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5415n.remove(arrayList3);
                    }
                }
            }
            q(this.f5418q);
            q(this.f5417p);
            q(this.f5416o);
            q(this.f5419r);
            b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public boolean g() {
        return (this.f5410i.isEmpty() && this.f5412k.isEmpty() && this.f5411j.isEmpty() && this.f5409h.isEmpty() && this.f5417p.isEmpty() && this.f5418q.isEmpty() && this.f5416o.isEmpty() && this.f5419r.isEmpty() && this.f5414m.isEmpty() && this.f5413l.isEmpty() && this.f5415n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void i() {
        boolean zIsEmpty = this.f5409h.isEmpty();
        boolean zIsEmpty2 = this.f5411j.isEmpty();
        boolean zIsEmpty3 = this.f5412k.isEmpty();
        boolean zIsEmpty4 = this.f5410i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f5409h.iterator();
        while (it.hasNext()) {
            i.d.a(it.next());
            p(null);
        }
        this.f5409h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f5411j);
            this.f5414m.add(arrayList);
            this.f5411j.clear();
            a aVar = new a(arrayList);
            if (!zIsEmpty) {
                ((e) arrayList.get(0)).getClass();
                throw null;
            }
            aVar.run();
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f5412k);
            this.f5415n.add(arrayList2);
            this.f5412k.clear();
            b bVar = new b(arrayList2);
            if (!zIsEmpty) {
                ((d) arrayList2.get(0)).getClass();
                throw null;
            }
            bVar.run();
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f5410i);
        this.f5413l.add(arrayList3);
        this.f5410i.clear();
        RunnableC0103c runnableC0103c = new RunnableC0103c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0103c.run();
            return;
        }
        if (!zIsEmpty) {
            f();
        }
        Math.max(!zIsEmpty2 ? e() : 0L, zIsEmpty3 ? 0L : d());
        i.d.a(arrayList3.get(0));
        throw null;
    }

    public void m(RecyclerView.A a4) {
        throw null;
    }

    public void n(d dVar) {
        dVar.getClass();
    }

    public void o(RecyclerView.A a4, int i4, int i5, int i6, int i7) {
        throw null;
    }

    public final void p(RecyclerView.A a4) {
        throw null;
    }

    public void q(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        i.d.a(list.get(size));
        throw null;
    }

    public final void r(d dVar) {
        dVar.getClass();
    }
}
