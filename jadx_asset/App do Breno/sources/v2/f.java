package v2;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1616i;
import w2.C1617j;
import w2.C1622o;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1617j.c f11600b;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            dVar.a(null);
        }
    }

    public f(C1472a c1472a) {
        a aVar = new a();
        this.f11600b = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/backgesture", C1622o.f11894b);
        this.f11599a = c1617j;
        c1617j.e(aVar);
    }

    public final Map a(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }

    public void b() {
        AbstractC1388b.f("BackGestureChannel", "Sending message to cancel back gesture");
        this.f11599a.c("cancelBackGesture", null);
    }

    public void c() {
        AbstractC1388b.f("BackGestureChannel", "Sending message to commit back gesture");
        this.f11599a.c("commitBackGesture", null);
    }

    public void d(BackEvent backEvent) {
        AbstractC1388b.f("BackGestureChannel", "Sending message to start back gesture");
        this.f11599a.c("startBackGesture", a(backEvent));
    }

    public void e(BackEvent backEvent) {
        AbstractC1388b.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.f11599a.c("updateBackGestureProgress", a(backEvent));
    }
}
