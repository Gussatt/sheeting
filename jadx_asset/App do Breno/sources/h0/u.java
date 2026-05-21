package h0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes.dex */
public class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroupOverlay f7479a;

    public u(ViewGroup viewGroup) {
        this.f7479a = viewGroup.getOverlay();
    }

    @Override // h0.v
    public void a(View view) {
        this.f7479a.add(view);
    }

    @Override // h0.z
    public void b(Drawable drawable) {
        this.f7479a.add(drawable);
    }

    @Override // h0.v
    public void c(View view) {
        this.f7479a.remove(view);
    }

    @Override // h0.z
    public void d(Drawable drawable) {
        this.f7479a.remove(drawable);
    }
}
