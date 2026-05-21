package h0;

import R.AbstractComponentCallbacksC0497o;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractC0986l;
import java.util.ArrayList;
import java.util.List;
import y.C1644a;

/* JADX INFO: renamed from: h0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0979e extends R.M {

    /* JADX INFO: renamed from: h0.e$a */
    public class a extends AbstractC0986l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f7391a;

        public a(Rect rect) {
            this.f7391a = rect;
        }
    }

    /* JADX INFO: renamed from: h0.e$c */
    public class c extends AbstractC0987m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f7396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f7398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f7400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7401f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f7396a = obj;
            this.f7397b = arrayList;
            this.f7398c = obj2;
            this.f7399d = arrayList2;
            this.f7400e = obj3;
            this.f7401f = arrayList3;
        }

        @Override // h0.AbstractC0987m, h0.AbstractC0986l.f
        public void a(AbstractC0986l abstractC0986l) {
            Object obj = this.f7396a;
            if (obj != null) {
                C0979e.this.C(obj, this.f7397b, null);
            }
            Object obj2 = this.f7398c;
            if (obj2 != null) {
                C0979e.this.C(obj2, this.f7399d, null);
            }
            Object obj3 = this.f7400e;
            if (obj3 != null) {
                C0979e.this.C(obj3, this.f7401f, null);
            }
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            abstractC0986l.T(this);
        }
    }

    /* JADX INFO: renamed from: h0.e$d */
    public class d implements C1644a.InterfaceC0189a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0986l f7403a;

        public d(AbstractC0986l abstractC0986l) {
            this.f7403a = abstractC0986l;
        }

        @Override // y.C1644a.InterfaceC0189a
        public void a() {
            this.f7403a.i();
        }
    }

    /* JADX INFO: renamed from: h0.e$f */
    public class f extends AbstractC0986l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f7407a;

        public f(Rect rect) {
            this.f7407a = rect;
        }
    }

    public static boolean B(AbstractC0986l abstractC0986l) {
        return (R.M.l(abstractC0986l.D()) && R.M.l(abstractC0986l.E()) && R.M.l(abstractC0986l.F())) ? false : true;
    }

    @Override // R.M
    public Object A(Object obj) {
        if (obj == null) {
            return null;
        }
        C0990p c0990p = new C0990p();
        c0990p.i0((AbstractC0986l) obj);
        return c0990p;
    }

    public void C(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0986l abstractC0986l = (AbstractC0986l) obj;
        int i4 = 0;
        if (abstractC0986l instanceof C0990p) {
            C0990p c0990p = (C0990p) abstractC0986l;
            int iL0 = c0990p.l0();
            while (i4 < iL0) {
                C(c0990p.k0(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (B(abstractC0986l)) {
            return;
        }
        List listG = abstractC0986l.G();
        if (listG.size() == arrayList.size() && listG.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i4 < size) {
                abstractC0986l.b((View) arrayList2.get(i4));
                i4++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0986l.U((View) arrayList.get(size2));
            }
        }
    }

    @Override // R.M
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0986l) obj).b(view);
        }
    }

    @Override // R.M
    public void b(Object obj, ArrayList arrayList) {
        AbstractC0986l abstractC0986l = (AbstractC0986l) obj;
        if (abstractC0986l == null) {
            return;
        }
        int i4 = 0;
        if (abstractC0986l instanceof C0990p) {
            C0990p c0990p = (C0990p) abstractC0986l;
            int iL0 = c0990p.l0();
            while (i4 < iL0) {
                b(c0990p.k0(i4), arrayList);
                i4++;
            }
            return;
        }
        if (B(abstractC0986l) || !R.M.l(abstractC0986l.G())) {
            return;
        }
        int size = arrayList.size();
        while (i4 < size) {
            abstractC0986l.b((View) arrayList.get(i4));
            i4++;
        }
    }

    @Override // R.M
    public void e(ViewGroup viewGroup, Object obj) {
        AbstractC0988n.a(viewGroup, (AbstractC0986l) obj);
    }

    @Override // R.M
    public boolean g(Object obj) {
        return obj instanceof AbstractC0986l;
    }

    @Override // R.M
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC0986l) obj).clone();
        }
        return null;
    }

    @Override // R.M
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC0986l abstractC0986lQ0 = (AbstractC0986l) obj;
        AbstractC0986l abstractC0986l = (AbstractC0986l) obj2;
        AbstractC0986l abstractC0986l2 = (AbstractC0986l) obj3;
        if (abstractC0986lQ0 != null && abstractC0986l != null) {
            abstractC0986lQ0 = new C0990p().i0(abstractC0986lQ0).i0(abstractC0986l).q0(1);
        } else if (abstractC0986lQ0 == null) {
            abstractC0986lQ0 = abstractC0986l != null ? abstractC0986l : null;
        }
        if (abstractC0986l2 == null) {
            return abstractC0986lQ0;
        }
        C0990p c0990p = new C0990p();
        if (abstractC0986lQ0 != null) {
            c0990p.i0(abstractC0986lQ0);
        }
        c0990p.i0(abstractC0986l2);
        return c0990p;
    }

    @Override // R.M
    public Object p(Object obj, Object obj2, Object obj3) {
        C0990p c0990p = new C0990p();
        if (obj != null) {
            c0990p.i0((AbstractC0986l) obj);
        }
        if (obj2 != null) {
            c0990p.i0((AbstractC0986l) obj2);
        }
        if (obj3 != null) {
            c0990p.i0((AbstractC0986l) obj3);
        }
        return c0990p;
    }

    @Override // R.M
    public void r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0986l) obj).a(new b(view, arrayList));
    }

    @Override // R.M
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC0986l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // R.M
    public void t(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0986l) obj).Z(new f(rect));
        }
    }

    @Override // R.M
    public void u(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC0986l) obj).Z(new a(rect));
        }
    }

    @Override // R.M
    public void v(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, Object obj, C1644a c1644a, Runnable runnable) {
        AbstractC0986l abstractC0986l = (AbstractC0986l) obj;
        c1644a.b(new d(abstractC0986l));
        abstractC0986l.a(new C0123e(runnable));
    }

    @Override // R.M
    public void y(Object obj, View view, ArrayList arrayList) {
        C0990p c0990p = (C0990p) obj;
        List listG = c0990p.G();
        listG.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            R.M.f(listG, (View) arrayList.get(i4));
        }
        listG.add(view);
        arrayList.add(view);
        b(c0990p, arrayList);
    }

    @Override // R.M
    public void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0990p c0990p = (C0990p) obj;
        if (c0990p != null) {
            c0990p.G().clear();
            c0990p.G().addAll(arrayList2);
            C(c0990p, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: h0.e$b */
    public class b implements AbstractC0986l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7394b;

        public b(View view, ArrayList arrayList) {
            this.f7393a = view;
            this.f7394b = arrayList;
        }

        @Override // h0.AbstractC0986l.f
        public void a(AbstractC0986l abstractC0986l) {
            abstractC0986l.T(this);
            abstractC0986l.a(this);
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            abstractC0986l.T(this);
            this.f7393a.setVisibility(8);
            int size = this.f7394b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f7394b.get(i4)).setVisibility(0);
            }
        }

        @Override // h0.AbstractC0986l.f
        public void b(AbstractC0986l abstractC0986l) {
        }

        @Override // h0.AbstractC0986l.f
        public void c(AbstractC0986l abstractC0986l) {
        }

        @Override // h0.AbstractC0986l.f
        public void d(AbstractC0986l abstractC0986l) {
        }
    }

    /* JADX INFO: renamed from: h0.e$e, reason: collision with other inner class name */
    public class C0123e implements AbstractC0986l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f7405a;

        public C0123e(Runnable runnable) {
            this.f7405a = runnable;
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            this.f7405a.run();
        }

        @Override // h0.AbstractC0986l.f
        public void a(AbstractC0986l abstractC0986l) {
        }

        @Override // h0.AbstractC0986l.f
        public void b(AbstractC0986l abstractC0986l) {
        }

        @Override // h0.AbstractC0986l.f
        public void c(AbstractC0986l abstractC0986l) {
        }

        @Override // h0.AbstractC0986l.f
        public void d(AbstractC0986l abstractC0986l) {
        }
    }
}
