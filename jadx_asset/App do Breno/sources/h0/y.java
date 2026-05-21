package h0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes.dex */
public class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f7481a;

    public y(View view) {
        this.f7481a = view.getOverlay();
    }

    @Override // h0.z
    public void b(Drawable drawable) {
        this.f7481a.add(drawable);
    }

    @Override // h0.z
    public void d(Drawable drawable) {
        this.f7481a.remove(drawable);
    }
}
