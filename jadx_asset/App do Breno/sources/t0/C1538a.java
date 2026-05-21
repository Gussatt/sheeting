package t0;

import L2.m;
import X2.g;
import X2.l;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.h;
import n0.j;
import q0.InterfaceC1491a;
import q0.c;
import q0.d;

/* JADX INFO: renamed from: t0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1538a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0174a f11344b = new C0174a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11345c = C1538a.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11346a;

    /* JADX INFO: renamed from: t0.a$a, reason: collision with other inner class name */
    public static final class C0174a {
        public /* synthetic */ C0174a(g gVar) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    l.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) objInvoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        public final List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            l.e(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? m.f() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    l.c(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) objInvoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return m.f();
            }
            return m.f();
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i4) {
            l.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i4;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i4));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public C0174a() {
        }
    }

    /* JADX INFO: renamed from: t0.a$b */
    public static final class b extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f11347n = new b();

        public b() {
            super(1);
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean k(SidecarDisplayFeature sidecarDisplayFeature) {
            l.e(sidecarDisplayFeature, "$this$require");
            boolean z3 = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: renamed from: t0.a$c */
    public static final class c extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final c f11348n = new c();

        public c() {
            super(1);
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean k(SidecarDisplayFeature sidecarDisplayFeature) {
            l.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    /* JADX INFO: renamed from: t0.a$d */
    public static final class d extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final d f11349n = new d();

        public d() {
            super(1);
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean k(SidecarDisplayFeature sidecarDisplayFeature) {
            l.e(sidecarDisplayFeature, "$this$require");
            boolean z3 = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    /* JADX INFO: renamed from: t0.a$e */
    public static final class e extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final e f11350n = new e();

        public e() {
            super(1);
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean k(SidecarDisplayFeature sidecarDisplayFeature) {
            l.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public C1538a(j jVar) {
        l.e(jVar, "verificationMode");
        this.f11346a = jVar;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (l.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C0174a c0174a = f11344b;
        return c0174a.b(sidecarDeviceState) == c0174a.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (l.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return l.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!b((SidecarDisplayFeature) list.get(i4), (SidecarDisplayFeature) list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (l.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C0174a c0174a = f11344b;
        return c(c0174a.c(sidecarWindowLayoutInfo), c0174a.c(sidecarWindowLayoutInfo2));
    }

    public final List e(List list, SidecarDeviceState sidecarDeviceState) {
        l.e(list, "sidecarDisplayFeatures");
        l.e(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1491a interfaceC1491aG = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (interfaceC1491aG != null) {
                arrayList.add(interfaceC1491aG);
            }
        }
        return arrayList;
    }

    public final q0.j f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        l.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new q0.j(m.f());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C0174a c0174a = f11344b;
        c0174a.d(sidecarDeviceState2, c0174a.b(sidecarDeviceState));
        return new q0.j(e(c0174a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final InterfaceC1491a g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        d.b bVarA;
        c.b bVar;
        l.e(sidecarDisplayFeature, "feature");
        l.e(sidecarDeviceState, "deviceState");
        h.a aVar = h.f10601a;
        String str = f11345c;
        l.d(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) h.a.b(aVar, sidecarDisplayFeature, str, this.f11346a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f11347n).c("Feature bounds must not be 0", c.f11348n).c("TYPE_FOLD must have 0 area", d.f11349n).c("Feature be pinned to either left or top", e.f11350n).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVarA = d.b.f11027b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.f11027b.b();
        }
        int iB = f11344b.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            bVar = c.b.f11021d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            bVar = c.b.f11020c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        l.d(rect, "feature.rect");
        return new q0.d(new n0.b(rect), bVarA, bVar);
    }

    public /* synthetic */ C1538a(j jVar, int i4, g gVar) {
        this((i4 & 1) != 0 ? j.QUIET : jVar);
    }
}
