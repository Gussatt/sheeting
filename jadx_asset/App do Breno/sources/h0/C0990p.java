package h0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractC0986l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: h0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0990p extends AbstractC0986l {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f7463W;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ArrayList f7461U = new ArrayList();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f7462V = true;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f7464X = false;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f7465Y = 0;

    /* JADX INFO: renamed from: h0.p$a */
    public class a extends AbstractC0987m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0986l f7466a;

        public a(AbstractC0986l abstractC0986l) {
            this.f7466a = abstractC0986l;
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            this.f7466a.X();
            abstractC0986l.T(this);
        }
    }

    /* JADX INFO: renamed from: h0.p$b */
    public static class b extends AbstractC0987m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C0990p f7468a;

        public b(C0990p c0990p) {
            this.f7468a = c0990p;
        }

        @Override // h0.AbstractC0987m, h0.AbstractC0986l.f
        public void a(AbstractC0986l abstractC0986l) {
            C0990p c0990p = this.f7468a;
            if (c0990p.f7464X) {
                return;
            }
            c0990p.e0();
            this.f7468a.f7464X = true;
        }

        @Override // h0.AbstractC0986l.f
        public void e(AbstractC0986l abstractC0986l) {
            C0990p c0990p = this.f7468a;
            int i4 = c0990p.f7463W - 1;
            c0990p.f7463W = i4;
            if (i4 == 0) {
                c0990p.f7464X = false;
                c0990p.t();
            }
            abstractC0986l.T(this);
        }
    }

    @Override // h0.AbstractC0986l
    public void R(View view) {
        super.R(view);
        int size = this.f7461U.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC0986l) this.f7461U.get(i4)).R(view);
        }
    }

    @Override // h0.AbstractC0986l
    public void V(View view) {
        super.V(view);
        int size = this.f7461U.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC0986l) this.f7461U.get(i4)).V(view);
        }
    }

    @Override // h0.AbstractC0986l
    public void X() {
        if (this.f7461U.isEmpty()) {
            e0();
            t();
            return;
        }
        s0();
        if (this.f7462V) {
            Iterator it = this.f7461U.iterator();
            while (it.hasNext()) {
                ((AbstractC0986l) it.next()).X();
            }
            return;
        }
        for (int i4 = 1; i4 < this.f7461U.size(); i4++) {
            ((AbstractC0986l) this.f7461U.get(i4 - 1)).a(new a((AbstractC0986l) this.f7461U.get(i4)));
        }
        AbstractC0986l abstractC0986l = (AbstractC0986l) this.f7461U.get(0);
        if (abstractC0986l != null) {
            abstractC0986l.X();
        }
    }

    @Override // h0.AbstractC0986l
    public void Z(AbstractC0986l.e eVar) {
        super.Z(eVar);
        this.f7465Y |= 8;
        int size = this.f7461U.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC0986l) this.f7461U.get(i4)).Z(eVar);
        }
    }

    @Override // h0.AbstractC0986l
    public void b0(AbstractC0981g abstractC0981g) {
        super.b0(abstractC0981g);
        this.f7465Y |= 4;
        if (this.f7461U != null) {
            for (int i4 = 0; i4 < this.f7461U.size(); i4++) {
                ((AbstractC0986l) this.f7461U.get(i4)).b0(abstractC0981g);
            }
        }
    }

    @Override // h0.AbstractC0986l
    public void c0(AbstractC0989o abstractC0989o) {
        super.c0(abstractC0989o);
        this.f7465Y |= 2;
        int size = this.f7461U.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC0986l) this.f7461U.get(i4)).c0(abstractC0989o);
        }
    }

    @Override // h0.AbstractC0986l
    public String f0(String str) {
        String strF0 = super.f0(str);
        for (int i4 = 0; i4 < this.f7461U.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strF0);
            sb.append("\n");
            sb.append(((AbstractC0986l) this.f7461U.get(i4)).f0(str + "  "));
            strF0 = sb.toString();
        }
        return strF0;
    }

    @Override // h0.AbstractC0986l
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C0990p a(AbstractC0986l.f fVar) {
        return (C0990p) super.a(fVar);
    }

    @Override // h0.AbstractC0986l
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C0990p b(View view) {
        for (int i4 = 0; i4 < this.f7461U.size(); i4++) {
            ((AbstractC0986l) this.f7461U.get(i4)).b(view);
        }
        return (C0990p) super.b(view);
    }

    @Override // h0.AbstractC0986l
    public void i() {
        super.i();
        int size = this.f7461U.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC0986l) this.f7461U.get(i4)).i();
        }
    }

    public C0990p i0(AbstractC0986l abstractC0986l) {
        j0(abstractC0986l);
        long j4 = this.f7434o;
        if (j4 >= 0) {
            abstractC0986l.Y(j4);
        }
        if ((this.f7465Y & 1) != 0) {
            abstractC0986l.a0(w());
        }
        if ((this.f7465Y & 2) != 0) {
            A();
            abstractC0986l.c0(null);
        }
        if ((this.f7465Y & 4) != 0) {
            abstractC0986l.b0(z());
        }
        if ((this.f7465Y & 8) != 0) {
            abstractC0986l.Z(v());
        }
        return this;
    }

    public final void j0(AbstractC0986l abstractC0986l) {
        this.f7461U.add(abstractC0986l);
        abstractC0986l.f7418D = this;
    }

    @Override // h0.AbstractC0986l
    public void k(s sVar) {
        if (K(sVar.f7473b)) {
            for (AbstractC0986l abstractC0986l : this.f7461U) {
                if (abstractC0986l.K(sVar.f7473b)) {
                    abstractC0986l.k(sVar);
                    sVar.f7474c.add(abstractC0986l);
                }
            }
        }
    }

    public AbstractC0986l k0(int i4) {
        if (i4 < 0 || i4 >= this.f7461U.size()) {
            return null;
        }
        return (AbstractC0986l) this.f7461U.get(i4);
    }

    public int l0() {
        return this.f7461U.size();
    }

    @Override // h0.AbstractC0986l
    public void m(s sVar) {
        super.m(sVar);
        int size = this.f7461U.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC0986l) this.f7461U.get(i4)).m(sVar);
        }
    }

    @Override // h0.AbstractC0986l
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C0990p T(AbstractC0986l.f fVar) {
        return (C0990p) super.T(fVar);
    }

    @Override // h0.AbstractC0986l
    public void n(s sVar) {
        if (K(sVar.f7473b)) {
            for (AbstractC0986l abstractC0986l : this.f7461U) {
                if (abstractC0986l.K(sVar.f7473b)) {
                    abstractC0986l.n(sVar);
                    sVar.f7474c.add(abstractC0986l);
                }
            }
        }
    }

    @Override // h0.AbstractC0986l
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C0990p U(View view) {
        for (int i4 = 0; i4 < this.f7461U.size(); i4++) {
            ((AbstractC0986l) this.f7461U.get(i4)).U(view);
        }
        return (C0990p) super.U(view);
    }

    @Override // h0.AbstractC0986l
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C0990p Y(long j4) {
        ArrayList arrayList;
        super.Y(j4);
        if (this.f7434o >= 0 && (arrayList = this.f7461U) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC0986l) this.f7461U.get(i4)).Y(j4);
            }
        }
        return this;
    }

    @Override // h0.AbstractC0986l
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C0990p a0(TimeInterpolator timeInterpolator) {
        this.f7465Y |= 1;
        ArrayList arrayList = this.f7461U;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC0986l) this.f7461U.get(i4)).a0(timeInterpolator);
            }
        }
        return (C0990p) super.a0(timeInterpolator);
    }

    @Override // h0.AbstractC0986l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC0986l clone() {
        C0990p c0990p = (C0990p) super.clone();
        c0990p.f7461U = new ArrayList();
        int size = this.f7461U.size();
        for (int i4 = 0; i4 < size; i4++) {
            c0990p.j0(((AbstractC0986l) this.f7461U.get(i4)).clone());
        }
        return c0990p;
    }

    public C0990p q0(int i4) {
        if (i4 == 0) {
            this.f7462V = true;
            return this;
        }
        if (i4 == 1) {
            this.f7462V = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i4);
    }

    @Override // h0.AbstractC0986l
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C0990p d0(long j4) {
        return (C0990p) super.d0(j4);
    }

    @Override // h0.AbstractC0986l
    public void s(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jC = C();
        int size = this.f7461U.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0986l abstractC0986l = (AbstractC0986l) this.f7461U.get(i4);
            if (jC > 0 && (this.f7462V || i4 == 0)) {
                long jC2 = abstractC0986l.C();
                if (jC2 > 0) {
                    abstractC0986l.d0(jC2 + jC);
                } else {
                    abstractC0986l.d0(jC);
                }
            }
            abstractC0986l.s(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public final void s0() {
        b bVar = new b(this);
        Iterator it = this.f7461U.iterator();
        while (it.hasNext()) {
            ((AbstractC0986l) it.next()).a(bVar);
        }
        this.f7463W = this.f7461U.size();
    }
}
