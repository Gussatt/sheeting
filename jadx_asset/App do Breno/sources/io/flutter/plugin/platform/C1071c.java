package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import m2.r;

/* JADX INFO: renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1071c extends m2.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1069a f8012h;

    public C1071c(Context context, int i4, int i5, C1069a c1069a) {
        super(context, i4, i5, r.a.overlay);
        this.f8012h = c1069a;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        C1069a c1069a = this.f8012h;
        if (c1069a == null || !c1069a.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
