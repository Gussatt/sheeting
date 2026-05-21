package androidx.recyclerview.widget;

import C.C0218a;
import D.t;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class i extends C0218a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f5492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0218a f5493e = new a(this);

    public static class a extends C0218a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i f5494d;

        public a(i iVar) {
            this.f5494d = iVar;
        }

        @Override // C.C0218a
        public void g(View view, t tVar) {
            super.g(view, tVar);
            if (this.f5494d.n() || this.f5494d.f5492d.getLayoutManager() == null) {
                return;
            }
            this.f5494d.f5492d.getLayoutManager().d0(view, tVar);
        }

        @Override // C.C0218a
        public boolean j(View view, int i4, Bundle bundle) {
            if (super.j(view, i4, bundle)) {
                return true;
            }
            if (this.f5494d.n() || this.f5494d.f5492d.getLayoutManager() == null) {
                return false;
            }
            return this.f5494d.f5492d.getLayoutManager().t0(view, i4, bundle);
        }
    }

    public i(RecyclerView recyclerView) {
        this.f5492d = recyclerView;
    }

    @Override // C.C0218a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || n()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Z(accessibilityEvent);
        }
    }

    @Override // C.C0218a
    public void g(View view, t tVar) {
        super.g(view, tVar);
        tVar.W(RecyclerView.class.getName());
        if (n() || this.f5492d.getLayoutManager() == null) {
            return;
        }
        this.f5492d.getLayoutManager().b0(tVar);
    }

    @Override // C.C0218a
    public boolean j(View view, int i4, Bundle bundle) {
        if (super.j(view, i4, bundle)) {
            return true;
        }
        if (n() || this.f5492d.getLayoutManager() == null) {
            return false;
        }
        return this.f5492d.getLayoutManager().r0(i4, bundle);
    }

    public boolean n() {
        return this.f5492d.I();
    }
}
