package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f4108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f4109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f4110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f4111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutInflater f4112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g.a f4113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f4116j;

    public a(Context context, int i4, int i5) {
        this.f4108b = context;
        this.f4111e = LayoutInflater.from(context);
        this.f4114h = i4;
        this.f4115i = i5;
    }

    public void a(View view, int i4) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f4116j).addView(view, i4);
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(d dVar, boolean z3) {
        g.a aVar = this.f4113g;
        if (aVar != null) {
            aVar.b(dVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void c(Context context, d dVar) {
        this.f4109c = context;
        this.f4112f = LayoutInflater.from(context);
        this.f4110d = dVar;
    }

    public abstract void d(e eVar, h.a aVar);

    @Override // androidx.appcompat.view.menu.g
    public boolean e(j jVar) {
        g.a aVar = this.f4113g;
        if (aVar != null) {
            return aVar.c(jVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.g
    public void f(boolean z3) {
        ViewGroup viewGroup = (ViewGroup) this.f4116j;
        if (viewGroup == null) {
            return;
        }
        d dVar = this.f4110d;
        int i4 = 0;
        if (dVar != null) {
            dVar.q();
            ArrayList arrayListA = this.f4110d.A();
            int size = arrayListA.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                e eVar = (e) arrayListA.get(i6);
                if (o(i5, eVar)) {
                    View childAt = viewGroup.getChildAt(i5);
                    e itemData = childAt instanceof h.a ? ((h.a) childAt).getItemData() : null;
                    View viewN = n(eVar, childAt, viewGroup);
                    if (eVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i5);
                    }
                    i5++;
                }
            }
            i4 = i5;
        }
        while (i4 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i4)) {
                i4++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean h(d dVar, e eVar) {
        return false;
    }

    public h.a i(ViewGroup viewGroup) {
        return (h.a) this.f4111e.inflate(this.f4115i, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean j(d dVar, e eVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public void k(g.a aVar) {
        this.f4113g = aVar;
    }

    public boolean l(ViewGroup viewGroup, int i4) {
        viewGroup.removeViewAt(i4);
        return true;
    }

    public g.a m() {
        return this.f4113g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(e eVar, View view, ViewGroup viewGroup) {
        h.a aVarI = view instanceof h.a ? (h.a) view : i(viewGroup);
        d(eVar, aVarI);
        return (View) aVarI;
    }

    public abstract boolean o(int i4, e eVar);
}
