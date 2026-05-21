package s0;

import X2.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import q0.c;
import q0.d;
import q0.j;
import q0.k;
import q0.o;

/* JADX INFO: renamed from: s0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1530f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1530f f11327a = new C1530f();

    public final q0.c a(k kVar, FoldingFeature foldingFeature) {
        d.b bVarA;
        c.b bVar;
        l.e(kVar, "windowMetrics");
        l.e(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            bVarA = d.b.f11027b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.f11027b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar = c.b.f11020c;
        } else {
            if (state != 2) {
                return null;
            }
            bVar = c.b.f11021d;
        }
        Rect bounds = foldingFeature.getBounds();
        l.d(bounds, "oemFeature.bounds");
        if (!d(kVar, new n0.b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        l.d(bounds2, "oemFeature.bounds");
        return new q0.d(new n0.b(bounds2), bVarA, bVar);
    }

    public final j b(Context context, WindowLayoutInfo windowLayoutInfo) {
        l.e(context, "context");
        l.e(windowLayoutInfo, "info");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            return c(o.f11061b.d(context), windowLayoutInfo);
        }
        if (i4 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return c(o.f11061b.c((Activity) context), windowLayoutInfo);
    }

    public final j c(k kVar, WindowLayoutInfo windowLayoutInfo) {
        q0.c cVarA;
        l.e(kVar, "windowMetrics");
        l.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        l.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C1530f c1530f = f11327a;
                l.d(foldingFeature, "feature");
                cVarA = c1530f.a(kVar, foldingFeature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new j(arrayList);
    }

    public final boolean d(k kVar, n0.b bVar) {
        Rect rectA = kVar.a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != rectA.width() && bVar.a() != rectA.height()) {
            return false;
        }
        if (bVar.d() >= rectA.width() || bVar.a() >= rectA.height()) {
            return (bVar.d() == rectA.width() && bVar.a() == rectA.height()) ? false : true;
        }
        return false;
    }
}
