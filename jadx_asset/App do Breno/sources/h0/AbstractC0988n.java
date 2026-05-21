package h0;

import C.AbstractC0241y;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p.C1475a;

/* JADX INFO: renamed from: h0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0988n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AbstractC0986l f7454a = new C0976b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal f7455b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList f7456c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC0986l abstractC0986l) {
        if (f7456c.contains(viewGroup) || !AbstractC0241y.v(viewGroup)) {
            return;
        }
        f7456c.add(viewGroup);
        if (abstractC0986l == null) {
            abstractC0986l = f7454a;
        }
        AbstractC0986l abstractC0986lClone = abstractC0986l.clone();
        d(viewGroup, abstractC0986lClone);
        AbstractC0985k.b(viewGroup, null);
        c(viewGroup, abstractC0986lClone);
    }

    public static C1475a b() {
        C1475a c1475a;
        WeakReference weakReference = (WeakReference) f7455b.get();
        if (weakReference != null && (c1475a = (C1475a) weakReference.get()) != null) {
            return c1475a;
        }
        C1475a c1475a2 = new C1475a();
        f7455b.set(new WeakReference(c1475a2));
        return c1475a2;
    }

    public static void c(ViewGroup viewGroup, AbstractC0986l abstractC0986l) {
        if (abstractC0986l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0986l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void d(ViewGroup viewGroup, AbstractC0986l abstractC0986l) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0986l) it.next()).R(viewGroup);
            }
        }
        if (abstractC0986l != null) {
            abstractC0986l.o(viewGroup, true);
        }
        AbstractC0985k.a(viewGroup);
    }

    /* JADX INFO: renamed from: h0.n$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC0986l f7457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewGroup f7458c;

        /* JADX INFO: renamed from: h0.n$a$a, reason: collision with other inner class name */
        public class C0124a extends AbstractC0987m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1475a f7459a;

            public C0124a(C1475a c1475a) {
                this.f7459a = c1475a;
            }

            @Override // h0.AbstractC0986l.f
            public void e(AbstractC0986l abstractC0986l) {
                ((ArrayList) this.f7459a.get(a.this.f7458c)).remove(abstractC0986l);
                abstractC0986l.T(this);
            }
        }

        public a(AbstractC0986l abstractC0986l, ViewGroup viewGroup) {
            this.f7457b = abstractC0986l;
            this.f7458c = viewGroup;
        }

        public final void a() {
            this.f7458c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f7458c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!AbstractC0988n.f7456c.remove(this.f7458c)) {
                return true;
            }
            C1475a c1475aB = AbstractC0988n.b();
            ArrayList arrayList = (ArrayList) c1475aB.get(this.f7458c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1475aB.put(this.f7458c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f7457b);
            this.f7457b.a(new C0124a(c1475aB));
            this.f7457b.o(this.f7458c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0986l) it.next()).V(this.f7458c);
                }
            }
            this.f7457b.S(this.f7458c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            AbstractC0988n.f7456c.remove(this.f7458c);
            ArrayList arrayList = (ArrayList) AbstractC0988n.b().get(this.f7458c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0986l) it.next()).V(this.f7458c);
                }
            }
            this.f7457b.p(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
