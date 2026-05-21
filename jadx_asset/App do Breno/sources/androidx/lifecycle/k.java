package androidx.lifecycle;

import androidx.lifecycle.AbstractC0609f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l.C1377c;
import m.C1389a;
import m.C1390b;

/* JADX INFO: loaded from: classes.dex */
public class k extends AbstractC0609f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f4979k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1389a f4981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC0609f.b f4982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f4983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f4987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k3.o f4988j;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final AbstractC0609f.b a(AbstractC0609f.b bVar, AbstractC0609f.b bVar2) {
            X2.l.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        public a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC0609f.b f4989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC0611h f4990b;

        public b(i iVar, AbstractC0609f.b bVar) {
            X2.l.e(bVar, "initialState");
            X2.l.b(iVar);
            this.f4990b = l.f(iVar);
            this.f4989a = bVar;
        }

        public final void a(j jVar, AbstractC0609f.a aVar) {
            X2.l.e(aVar, "event");
            AbstractC0609f.b bVarF = aVar.f();
            this.f4989a = k.f4979k.a(this.f4989a, bVarF);
            InterfaceC0611h interfaceC0611h = this.f4990b;
            X2.l.b(jVar);
            interfaceC0611h.a(jVar, aVar);
            this.f4989a = bVarF;
        }

        public final AbstractC0609f.b b() {
            return this.f4989a;
        }
    }

    public k(j jVar, boolean z3) {
        this.f4980b = z3;
        this.f4981c = new C1389a();
        AbstractC0609f.b bVar = AbstractC0609f.b.INITIALIZED;
        this.f4982d = bVar;
        this.f4987i = new ArrayList();
        this.f4983e = new WeakReference(jVar);
        this.f4988j = k3.u.a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC0609f
    public void a(i iVar) {
        j jVar;
        X2.l.e(iVar, "observer");
        f("addObserver");
        AbstractC0609f.b bVar = this.f4982d;
        AbstractC0609f.b bVar2 = AbstractC0609f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0609f.b.INITIALIZED;
        }
        b bVar3 = new b(iVar, bVar2);
        if (((b) this.f4981c.l(iVar, bVar3)) == null && (jVar = (j) this.f4983e.get()) != null) {
            boolean z3 = this.f4984f != 0 || this.f4985g;
            AbstractC0609f.b bVarE = e(iVar);
            this.f4984f++;
            while (bVar3.b().compareTo(bVarE) < 0 && this.f4981c.contains(iVar)) {
                l(bVar3.b());
                AbstractC0609f.a aVarB = AbstractC0609f.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(jVar, aVarB);
                k();
                bVarE = e(iVar);
            }
            if (!z3) {
                m();
            }
            this.f4984f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0609f
    public AbstractC0609f.b b() {
        return this.f4982d;
    }

    @Override // androidx.lifecycle.AbstractC0609f
    public void c(i iVar) {
        X2.l.e(iVar, "observer");
        f("removeObserver");
        this.f4981c.o(iVar);
    }

    public final void d(j jVar) {
        Iterator itD = this.f4981c.d();
        X2.l.d(itD, "observerMap.descendingIterator()");
        while (itD.hasNext() && !this.f4986h) {
            Map.Entry entry = (Map.Entry) itD.next();
            X2.l.d(entry, "next()");
            i iVar = (i) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f4982d) > 0 && !this.f4986h && this.f4981c.contains(iVar)) {
                AbstractC0609f.a aVarA = AbstractC0609f.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                l(aVarA.f());
                bVar.a(jVar, aVarA);
                k();
            }
        }
    }

    public final AbstractC0609f.b e(i iVar) {
        b bVar;
        Map.Entry entryP = this.f4981c.p(iVar);
        AbstractC0609f.b bVar2 = null;
        AbstractC0609f.b bVarB = (entryP == null || (bVar = (b) entryP.getValue()) == null) ? null : bVar.b();
        if (!this.f4987i.isEmpty()) {
            bVar2 = (AbstractC0609f.b) this.f4987i.get(r0.size() - 1);
        }
        a aVar = f4979k;
        return aVar.a(aVar.a(this.f4982d, bVarB), bVar2);
    }

    public final void f(String str) {
        if (!this.f4980b || C1377c.f().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void g(j jVar) {
        C1390b.d dVarH = this.f4981c.h();
        X2.l.d(dVarH, "observerMap.iteratorWithAdditions()");
        while (dVarH.hasNext() && !this.f4986h) {
            Map.Entry entry = (Map.Entry) dVarH.next();
            i iVar = (i) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f4982d) < 0 && !this.f4986h && this.f4981c.contains(iVar)) {
                l(bVar.b());
                AbstractC0609f.a aVarB = AbstractC0609f.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(jVar, aVarB);
                k();
            }
        }
    }

    public void h(AbstractC0609f.a aVar) {
        X2.l.e(aVar, "event");
        f("handleLifecycleEvent");
        j(aVar.f());
    }

    public final boolean i() {
        if (this.f4981c.size() == 0) {
            return true;
        }
        Map.Entry entryF = this.f4981c.f();
        X2.l.b(entryF);
        AbstractC0609f.b bVarB = ((b) entryF.getValue()).b();
        Map.Entry entryI = this.f4981c.i();
        X2.l.b(entryI);
        AbstractC0609f.b bVarB2 = ((b) entryI.getValue()).b();
        return bVarB == bVarB2 && this.f4982d == bVarB2;
    }

    public final void j(AbstractC0609f.b bVar) {
        AbstractC0609f.b bVar2 = this.f4982d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC0609f.b.INITIALIZED && bVar == AbstractC0609f.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f4982d + " in component " + this.f4983e.get()).toString());
        }
        this.f4982d = bVar;
        if (this.f4985g || this.f4984f != 0) {
            this.f4986h = true;
            return;
        }
        this.f4985g = true;
        m();
        this.f4985g = false;
        if (this.f4982d == AbstractC0609f.b.DESTROYED) {
            this.f4981c = new C1389a();
        }
    }

    public final void k() {
        this.f4987i.remove(r0.size() - 1);
    }

    public final void l(AbstractC0609f.b bVar) {
        this.f4987i.add(bVar);
    }

    public final void m() {
        j jVar = (j) this.f4983e.get();
        if (jVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f4986h = false;
            AbstractC0609f.b bVar = this.f4982d;
            Map.Entry entryF = this.f4981c.f();
            X2.l.b(entryF);
            if (bVar.compareTo(((b) entryF.getValue()).b()) < 0) {
                d(jVar);
            }
            Map.Entry entryI = this.f4981c.i();
            if (!this.f4986h && entryI != null && this.f4982d.compareTo(((b) entryI.getValue()).b()) > 0) {
                g(jVar);
            }
        }
        this.f4986h = false;
        this.f4988j.setValue(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(j jVar) {
        this(jVar, true);
        X2.l.e(jVar, "provider");
    }
}
