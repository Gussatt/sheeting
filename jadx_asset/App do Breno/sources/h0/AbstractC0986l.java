package h0;

import C.AbstractC0241y;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.C1475a;
import p.C1478d;

/* JADX INFO: renamed from: h0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0986l implements Cloneable {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f7412R = {2, 1, 3, 4};

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final AbstractC0981g f7413S = new a();

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static ThreadLocal f7414T = new ThreadLocal();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f7420F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f7421G;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public e f7429O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C1475a f7430P;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f7432m = getClass().getName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7433n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7434o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TimeInterpolator f7435p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f7436q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f7437r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f7438s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f7439t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f7440u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f7441v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f7442w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f7443x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f7444y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f7445z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f7415A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public t f7416B = new t();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public t f7417C = new t();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0990p f7418D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int[] f7419E = f7412R;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f7422H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f7423I = new ArrayList();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f7424J = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f7425K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f7426L = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f7427M = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f7428N = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public AbstractC0981g f7431Q = f7413S;

    /* JADX INFO: renamed from: h0.l$a */
    public class a extends AbstractC0981g {
        @Override // h0.AbstractC0981g
        public Path a(float f4, float f5, float f6, float f7) {
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f6, f7);
            return path;
        }
    }

    /* JADX INFO: renamed from: h0.l$b */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1475a f7446a;

        public b(C1475a c1475a) {
            this.f7446a = c1475a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7446a.remove(animator);
            AbstractC0986l.this.f7423I.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0986l.this.f7423I.add(animator);
        }
    }

    /* JADX INFO: renamed from: h0.l$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0986l.this.t();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: h0.l$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f7449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s f7451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public P f7452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AbstractC0986l f7453e;

        public d(View view, String str, AbstractC0986l abstractC0986l, P p4, s sVar) {
            this.f7449a = view;
            this.f7450b = str;
            this.f7451c = sVar;
            this.f7452d = p4;
            this.f7453e = abstractC0986l;
        }
    }

    /* JADX INFO: renamed from: h0.l$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: h0.l$f */
    public interface f {
        void a(AbstractC0986l abstractC0986l);

        void b(AbstractC0986l abstractC0986l);

        void c(AbstractC0986l abstractC0986l);

        void d(AbstractC0986l abstractC0986l);

        void e(AbstractC0986l abstractC0986l);
    }

    public static C1475a B() {
        C1475a c1475a = (C1475a) f7414T.get();
        if (c1475a != null) {
            return c1475a;
        }
        C1475a c1475a2 = new C1475a();
        f7414T.set(c1475a2);
        return c1475a2;
    }

    public static boolean L(s sVar, s sVar2, String str) {
        Object obj = sVar.f7472a.get(str);
        Object obj2 = sVar2.f7472a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void g(t tVar, View view, s sVar) {
        tVar.f7475a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f7476b.indexOfKey(id) >= 0) {
                tVar.f7476b.put(id, null);
            } else {
                tVar.f7476b.put(id, view);
            }
        }
        String strQ = AbstractC0241y.q(view);
        if (strQ != null) {
            if (tVar.f7478d.containsKey(strQ)) {
                tVar.f7478d.put(strQ, null);
            } else {
                tVar.f7478d.put(strQ, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f7477c.k(itemIdAtPosition) < 0) {
                    AbstractC0241y.K(view, true);
                    tVar.f7477c.m(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) tVar.f7477c.h(itemIdAtPosition);
                if (view2 != null) {
                    AbstractC0241y.K(view2, false);
                    tVar.f7477c.m(itemIdAtPosition, null);
                }
            }
        }
    }

    public AbstractC0989o A() {
        return null;
    }

    public long C() {
        return this.f7433n;
    }

    public List D() {
        return this.f7436q;
    }

    public List E() {
        return this.f7438s;
    }

    public List F() {
        return this.f7439t;
    }

    public List G() {
        return this.f7437r;
    }

    public String[] H() {
        return null;
    }

    public s I(View view, boolean z3) {
        C0990p c0990p = this.f7418D;
        if (c0990p != null) {
            return c0990p.I(view, z3);
        }
        return (s) (z3 ? this.f7416B : this.f7417C).f7475a.get(view);
    }

    public boolean J(s sVar, s sVar2) {
        if (sVar != null && sVar2 != null) {
            String[] strArrH = H();
            if (strArrH != null) {
                for (String str : strArrH) {
                    if (L(sVar, sVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = sVar.f7472a.keySet().iterator();
                while (it.hasNext()) {
                    if (L(sVar, sVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean K(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f7440u;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f7441v;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f7442w;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((Class) this.f7442w.get(i4)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f7443x != null && AbstractC0241y.q(view) != null && this.f7443x.contains(AbstractC0241y.q(view))) {
            return false;
        }
        if ((this.f7436q.size() == 0 && this.f7437r.size() == 0 && (((arrayList = this.f7439t) == null || arrayList.isEmpty()) && ((arrayList2 = this.f7438s) == null || arrayList2.isEmpty()))) || this.f7436q.contains(Integer.valueOf(id)) || this.f7437r.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f7438s;
        if (arrayList6 != null && arrayList6.contains(AbstractC0241y.q(view))) {
            return true;
        }
        if (this.f7439t != null) {
            for (int i5 = 0; i5 < this.f7439t.size(); i5++) {
                if (((Class) this.f7439t.get(i5)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void M(C1475a c1475a, C1475a c1475a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) sparseArray.valueAt(i4);
            if (view2 != null && K(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i4))) != null && K(view)) {
                s sVar = (s) c1475a.get(view2);
                s sVar2 = (s) c1475a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f7420F.add(sVar);
                    this.f7421G.add(sVar2);
                    c1475a.remove(view2);
                    c1475a2.remove(view);
                }
            }
        }
    }

    public final void N(C1475a c1475a, C1475a c1475a2) {
        s sVar;
        for (int size = c1475a.size() - 1; size >= 0; size--) {
            View view = (View) c1475a.i(size);
            if (view != null && K(view) && (sVar = (s) c1475a2.remove(view)) != null && K(sVar.f7473b)) {
                this.f7420F.add((s) c1475a.k(size));
                this.f7421G.add(sVar);
            }
        }
    }

    public final void O(C1475a c1475a, C1475a c1475a2, C1478d c1478d, C1478d c1478d2) {
        View view;
        int iO = c1478d.o();
        for (int i4 = 0; i4 < iO; i4++) {
            View view2 = (View) c1478d.p(i4);
            if (view2 != null && K(view2) && (view = (View) c1478d2.h(c1478d.l(i4))) != null && K(view)) {
                s sVar = (s) c1475a.get(view2);
                s sVar2 = (s) c1475a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f7420F.add(sVar);
                    this.f7421G.add(sVar2);
                    c1475a.remove(view2);
                    c1475a2.remove(view);
                }
            }
        }
    }

    public final void P(C1475a c1475a, C1475a c1475a2, C1475a c1475a3, C1475a c1475a4) {
        View view;
        int size = c1475a3.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) c1475a3.m(i4);
            if (view2 != null && K(view2) && (view = (View) c1475a4.get(c1475a3.i(i4))) != null && K(view)) {
                s sVar = (s) c1475a.get(view2);
                s sVar2 = (s) c1475a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f7420F.add(sVar);
                    this.f7421G.add(sVar2);
                    c1475a.remove(view2);
                    c1475a2.remove(view);
                }
            }
        }
    }

    public final void Q(t tVar, t tVar2) {
        C1475a c1475a = new C1475a(tVar.f7475a);
        C1475a c1475a2 = new C1475a(tVar2.f7475a);
        int i4 = 0;
        while (true) {
            int[] iArr = this.f7419E;
            if (i4 >= iArr.length) {
                c(c1475a, c1475a2);
                return;
            }
            int i5 = iArr[i4];
            if (i5 == 1) {
                N(c1475a, c1475a2);
            } else if (i5 == 2) {
                P(c1475a, c1475a2, tVar.f7478d, tVar2.f7478d);
            } else if (i5 == 3) {
                M(c1475a, c1475a2, tVar.f7476b, tVar2.f7476b);
            } else if (i5 == 4) {
                O(c1475a, c1475a2, tVar.f7477c, tVar2.f7477c);
            }
            i4++;
        }
    }

    public void R(View view) {
        if (this.f7426L) {
            return;
        }
        for (int size = this.f7423I.size() - 1; size >= 0; size--) {
            AbstractC0975a.b((Animator) this.f7423I.get(size));
        }
        ArrayList arrayList = this.f7427M;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f7427M.clone();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((f) arrayList2.get(i4)).c(this);
            }
        }
        this.f7425K = true;
    }

    public void S(ViewGroup viewGroup) {
        d dVar;
        this.f7420F = new ArrayList();
        this.f7421G = new ArrayList();
        Q(this.f7416B, this.f7417C);
        C1475a c1475aB = B();
        int size = c1475aB.size();
        P pD = AbstractC0972A.d(viewGroup);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = (Animator) c1475aB.i(i4);
            if (animator != null && (dVar = (d) c1475aB.get(animator)) != null && dVar.f7449a != null && pD.equals(dVar.f7452d)) {
                s sVar = dVar.f7451c;
                View view = dVar.f7449a;
                s sVarI = I(view, true);
                s sVarX = x(view, true);
                if (sVarI == null && sVarX == null) {
                    sVarX = (s) this.f7417C.f7475a.get(view);
                }
                if ((sVarI != null || sVarX != null) && dVar.f7453e.J(sVar, sVarX)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c1475aB.remove(animator);
                    }
                }
            }
        }
        s(viewGroup, this.f7416B, this.f7417C, this.f7420F, this.f7421G);
        X();
    }

    public AbstractC0986l T(f fVar) {
        ArrayList arrayList = this.f7427M;
        if (arrayList != null) {
            arrayList.remove(fVar);
            if (this.f7427M.size() == 0) {
                this.f7427M = null;
            }
        }
        return this;
    }

    public AbstractC0986l U(View view) {
        this.f7437r.remove(view);
        return this;
    }

    public void V(View view) {
        if (this.f7425K) {
            if (!this.f7426L) {
                for (int size = this.f7423I.size() - 1; size >= 0; size--) {
                    AbstractC0975a.c((Animator) this.f7423I.get(size));
                }
                ArrayList arrayList = this.f7427M;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f7427M.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((f) arrayList2.get(i4)).b(this);
                    }
                }
            }
            this.f7425K = false;
        }
    }

    public final void W(Animator animator, C1475a c1475a) {
        if (animator != null) {
            animator.addListener(new b(c1475a));
            h(animator);
        }
    }

    public void X() {
        e0();
        C1475a c1475aB = B();
        for (Animator animator : this.f7428N) {
            if (c1475aB.containsKey(animator)) {
                e0();
                W(animator, c1475aB);
            }
        }
        this.f7428N.clear();
        t();
    }

    public AbstractC0986l Y(long j4) {
        this.f7434o = j4;
        return this;
    }

    public void Z(e eVar) {
        this.f7429O = eVar;
    }

    public AbstractC0986l a(f fVar) {
        if (this.f7427M == null) {
            this.f7427M = new ArrayList();
        }
        this.f7427M.add(fVar);
        return this;
    }

    public AbstractC0986l a0(TimeInterpolator timeInterpolator) {
        this.f7435p = timeInterpolator;
        return this;
    }

    public AbstractC0986l b(View view) {
        this.f7437r.add(view);
        return this;
    }

    public void b0(AbstractC0981g abstractC0981g) {
        if (abstractC0981g == null) {
            this.f7431Q = f7413S;
        } else {
            this.f7431Q = abstractC0981g;
        }
    }

    public final void c(C1475a c1475a, C1475a c1475a2) {
        for (int i4 = 0; i4 < c1475a.size(); i4++) {
            s sVar = (s) c1475a.m(i4);
            if (K(sVar.f7473b)) {
                this.f7420F.add(sVar);
                this.f7421G.add(null);
            }
        }
        for (int i5 = 0; i5 < c1475a2.size(); i5++) {
            s sVar2 = (s) c1475a2.m(i5);
            if (K(sVar2.f7473b)) {
                this.f7421G.add(sVar2);
                this.f7420F.add(null);
            }
        }
    }

    public AbstractC0986l d0(long j4) {
        this.f7433n = j4;
        return this;
    }

    public void e0() {
        if (this.f7424J == 0) {
            ArrayList arrayList = this.f7427M;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7427M.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((f) arrayList2.get(i4)).a(this);
                }
            }
            this.f7426L = false;
        }
        this.f7424J++;
    }

    public String f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f7434o != -1) {
            str2 = str2 + "dur(" + this.f7434o + ") ";
        }
        if (this.f7433n != -1) {
            str2 = str2 + "dly(" + this.f7433n + ") ";
        }
        if (this.f7435p != null) {
            str2 = str2 + "interp(" + this.f7435p + ") ";
        }
        if (this.f7436q.size() <= 0 && this.f7437r.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f7436q.size() > 0) {
            for (int i4 = 0; i4 < this.f7436q.size(); i4++) {
                if (i4 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f7436q.get(i4);
            }
        }
        if (this.f7437r.size() > 0) {
            for (int i5 = 0; i5 < this.f7437r.size(); i5++) {
                if (i5 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f7437r.get(i5);
            }
        }
        return str3 + ")";
    }

    public void h(Animator animator) {
        if (animator == null) {
            t();
            return;
        }
        if (u() >= 0) {
            animator.setDuration(u());
        }
        if (C() >= 0) {
            animator.setStartDelay(C() + animator.getStartDelay());
        }
        if (w() != null) {
            animator.setInterpolator(w());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void i() {
        for (int size = this.f7423I.size() - 1; size >= 0; size--) {
            ((Animator) this.f7423I.get(size)).cancel();
        }
        ArrayList arrayList = this.f7427M;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f7427M.clone();
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((f) arrayList2.get(i4)).d(this);
        }
    }

    public abstract void k(s sVar);

    public final void l(View view, boolean z3) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f7440u;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f7441v;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f7442w;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (((Class) this.f7442w.get(i4)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z3) {
                        n(sVar);
                    } else {
                        k(sVar);
                    }
                    sVar.f7474c.add(this);
                    m(sVar);
                    if (z3) {
                        g(this.f7416B, view, sVar);
                    } else {
                        g(this.f7417C, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f7444y;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f7445z;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f7415A;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    if (((Class) this.f7415A.get(i5)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                                l(viewGroup.getChildAt(i6), z3);
                            }
                        }
                    }
                }
            }
        }
    }

    public abstract void n(s sVar);

    public void o(ViewGroup viewGroup, boolean z3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1475a c1475a;
        p(z3);
        if ((this.f7436q.size() > 0 || this.f7437r.size() > 0) && (((arrayList = this.f7438s) == null || arrayList.isEmpty()) && ((arrayList2 = this.f7439t) == null || arrayList2.isEmpty()))) {
            for (int i4 = 0; i4 < this.f7436q.size(); i4++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f7436q.get(i4)).intValue());
                if (viewFindViewById != null) {
                    s sVar = new s(viewFindViewById);
                    if (z3) {
                        n(sVar);
                    } else {
                        k(sVar);
                    }
                    sVar.f7474c.add(this);
                    m(sVar);
                    if (z3) {
                        g(this.f7416B, viewFindViewById, sVar);
                    } else {
                        g(this.f7417C, viewFindViewById, sVar);
                    }
                }
            }
            for (int i5 = 0; i5 < this.f7437r.size(); i5++) {
                View view = (View) this.f7437r.get(i5);
                s sVar2 = new s(view);
                if (z3) {
                    n(sVar2);
                } else {
                    k(sVar2);
                }
                sVar2.f7474c.add(this);
                m(sVar2);
                if (z3) {
                    g(this.f7416B, view, sVar2);
                } else {
                    g(this.f7417C, view, sVar2);
                }
            }
        } else {
            l(viewGroup, z3);
        }
        if (z3 || (c1475a = this.f7430P) == null) {
            return;
        }
        int size = c1475a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList3.add(this.f7416B.f7478d.remove((String) this.f7430P.i(i6)));
        }
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList3.get(i7);
            if (view2 != null) {
                this.f7416B.f7478d.put((String) this.f7430P.m(i7), view2);
            }
        }
    }

    public void p(boolean z3) {
        if (z3) {
            this.f7416B.f7475a.clear();
            this.f7416B.f7476b.clear();
            this.f7416B.f7477c.a();
        } else {
            this.f7417C.f7475a.clear();
            this.f7417C.f7476b.clear();
            this.f7417C.f7477c.a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: q */
    public AbstractC0986l clone() {
        try {
            AbstractC0986l abstractC0986l = (AbstractC0986l) super.clone();
            abstractC0986l.f7428N = new ArrayList();
            abstractC0986l.f7416B = new t();
            abstractC0986l.f7417C = new t();
            abstractC0986l.f7420F = null;
            abstractC0986l.f7421G = null;
            return abstractC0986l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator r(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void s(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        s sVar;
        View view2;
        Animator animator2;
        C1475a c1475aB = B();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            s sVar2 = (s) arrayList.get(i4);
            s sVar3 = (s) arrayList2.get(i4);
            if (sVar2 != null && !sVar2.f7474c.contains(this)) {
                sVar2 = null;
            }
            if (sVar3 != null && !sVar3.f7474c.contains(this)) {
                sVar3 = null;
            }
            if ((sVar2 != null || sVar3 != null) && (sVar2 == null || sVar3 == null || J(sVar2, sVar3))) {
                Animator animatorR = r(viewGroup, sVar2, sVar3);
                if (animatorR != null) {
                    if (sVar3 != null) {
                        View view3 = sVar3.f7473b;
                        String[] strArrH = H();
                        if (strArrH != null && strArrH.length > 0) {
                            sVar = new s(view3);
                            s sVar4 = (s) tVar2.f7475a.get(view3);
                            if (sVar4 != null) {
                                int i5 = 0;
                                while (i5 < strArrH.length) {
                                    Map map = sVar.f7472a;
                                    String[] strArr = strArrH;
                                    String str = strArr[i5];
                                    map.put(str, sVar4.f7472a.get(str));
                                    i5++;
                                    strArrH = strArr;
                                }
                            }
                            int size2 = c1475aB.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    view2 = view3;
                                    animator2 = animatorR;
                                    break;
                                }
                                d dVar = (d) c1475aB.get((Animator) c1475aB.i(i6));
                                if (dVar.f7451c != null && dVar.f7449a == view3) {
                                    view2 = view3;
                                    if (dVar.f7450b.equals(y()) && dVar.f7451c.equals(sVar)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i6++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = animatorR;
                            sVar = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = sVar2.f7473b;
                        animator = animatorR;
                        sVar = null;
                    }
                    if (animator != null) {
                        c1475aB.put(animator, new d(view, y(), this, AbstractC0972A.d(viewGroup), sVar));
                        this.f7428N.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = (Animator) this.f7428N.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay((((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE) + animator3.getStartDelay());
            }
        }
    }

    public void t() {
        int i4 = this.f7424J - 1;
        this.f7424J = i4;
        if (i4 == 0) {
            ArrayList arrayList = this.f7427M;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7427M.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((f) arrayList2.get(i5)).e(this);
                }
            }
            for (int i6 = 0; i6 < this.f7416B.f7477c.o(); i6++) {
                View view = (View) this.f7416B.f7477c.p(i6);
                if (view != null) {
                    AbstractC0241y.K(view, false);
                }
            }
            for (int i7 = 0; i7 < this.f7417C.f7477c.o(); i7++) {
                View view2 = (View) this.f7417C.f7477c.p(i7);
                if (view2 != null) {
                    AbstractC0241y.K(view2, false);
                }
            }
            this.f7426L = true;
        }
    }

    public String toString() {
        return f0("");
    }

    public long u() {
        return this.f7434o;
    }

    public e v() {
        return this.f7429O;
    }

    public TimeInterpolator w() {
        return this.f7435p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f7421G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f7420F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (h0.s) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h0.s x(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            h0.p r0 = r5.f7418D
            if (r0 == 0) goto L9
            h0.s r6 = r0.x(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f7420F
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f7421G
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            h0.s r4 = (h0.s) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f7473b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f7421G
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f7420F
        L36:
            java.lang.Object r6 = r6.get(r3)
            h0.s r6 = (h0.s) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC0986l.x(android.view.View, boolean):h0.s");
    }

    public String y() {
        return this.f7432m;
    }

    public AbstractC0981g z() {
        return this.f7431Q;
    }

    public void c0(AbstractC0989o abstractC0989o) {
    }

    public void m(s sVar) {
    }
}
