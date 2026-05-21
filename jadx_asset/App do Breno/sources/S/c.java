package S;

import L2.C;
import L2.E;
import L2.u;
import R.AbstractComponentCallbacksC0497o;
import R.B;
import android.util.Log;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3367a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0071c f3368b = C0071c.f3380d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* JADX INFO: renamed from: S.c$c, reason: collision with other inner class name */
    public static final class C0071c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f3379c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0071c f3380d = new C0071c(E.b(), null, C.d());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f3381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f3382b;

        /* JADX INFO: renamed from: S.c$c$a */
        public static final class a {
            public /* synthetic */ a(X2.g gVar) {
                this();
            }

            public a() {
            }
        }

        public C0071c(Set set, b bVar, Map map) {
            X2.l.e(set, "flags");
            X2.l.e(map, "allowedViolations");
            this.f3381a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f3382b = linkedHashMap;
        }

        public final Set a() {
            return this.f3381a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f3382b;
        }
    }

    public static final void d(String str, k kVar) {
        X2.l.e(kVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, kVar);
        throw kVar;
    }

    public static final void f(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, String str) {
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        X2.l.e(str, "previousFragmentId");
        S.a aVar = new S.a(abstractComponentCallbacksC0497o, str);
        c cVar = f3367a;
        cVar.e(aVar);
        C0071c c0071cB = cVar.b(abstractComponentCallbacksC0497o);
        if (c0071cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.o(c0071cB, abstractComponentCallbacksC0497o.getClass(), aVar.getClass())) {
            cVar.c(c0071cB, aVar);
        }
    }

    public static final void g(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        d dVar = new d(abstractComponentCallbacksC0497o);
        c cVar = f3367a;
        cVar.e(dVar);
        C0071c c0071cB = cVar.b(abstractComponentCallbacksC0497o);
        if (c0071cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.o(c0071cB, abstractComponentCallbacksC0497o.getClass(), dVar.getClass())) {
            cVar.c(c0071cB, dVar);
        }
    }

    public static final void h(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        e eVar = new e(abstractComponentCallbacksC0497o);
        c cVar = f3367a;
        cVar.e(eVar);
        C0071c c0071cB = cVar.b(abstractComponentCallbacksC0497o);
        if (c0071cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.o(c0071cB, abstractComponentCallbacksC0497o.getClass(), eVar.getClass())) {
            cVar.c(c0071cB, eVar);
        }
    }

    public static final void i(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        f fVar = new f(abstractComponentCallbacksC0497o);
        c cVar = f3367a;
        cVar.e(fVar);
        C0071c c0071cB = cVar.b(abstractComponentCallbacksC0497o);
        if (c0071cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.o(c0071cB, abstractComponentCallbacksC0497o.getClass(), fVar.getClass())) {
            cVar.c(c0071cB, fVar);
        }
    }

    public static final void j(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        h hVar = new h(abstractComponentCallbacksC0497o);
        c cVar = f3367a;
        cVar.e(hVar);
        C0071c c0071cB = cVar.b(abstractComponentCallbacksC0497o);
        if (c0071cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.o(c0071cB, abstractComponentCallbacksC0497o.getClass(), hVar.getClass())) {
            cVar.c(c0071cB, hVar);
        }
    }

    public static final void k(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, boolean z3) {
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        i iVar = new i(abstractComponentCallbacksC0497o, z3);
        c cVar = f3367a;
        cVar.e(iVar);
        C0071c c0071cB = cVar.b(abstractComponentCallbacksC0497o);
        if (c0071cB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.o(c0071cB, abstractComponentCallbacksC0497o.getClass(), iVar.getClass())) {
            cVar.c(c0071cB, iVar);
        }
    }

    public static final void l(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, ViewGroup viewGroup) {
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        X2.l.e(viewGroup, "container");
        l lVar = new l(abstractComponentCallbacksC0497o, viewGroup);
        c cVar = f3367a;
        cVar.e(lVar);
        C0071c c0071cB = cVar.b(abstractComponentCallbacksC0497o);
        if (c0071cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.o(c0071cB, abstractComponentCallbacksC0497o.getClass(), lVar.getClass())) {
            cVar.c(c0071cB, lVar);
        }
    }

    public static final void m(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2, int i4) {
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        X2.l.e(abstractComponentCallbacksC0497o2, "expectedParentFragment");
        m mVar = new m(abstractComponentCallbacksC0497o, abstractComponentCallbacksC0497o2, i4);
        c cVar = f3367a;
        cVar.e(mVar);
        C0071c c0071cB = cVar.b(abstractComponentCallbacksC0497o);
        if (c0071cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.o(c0071cB, abstractComponentCallbacksC0497o.getClass(), mVar.getClass())) {
            cVar.c(c0071cB, mVar);
        }
    }

    public final C0071c b(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        while (abstractComponentCallbacksC0497o != null) {
            if (abstractComponentCallbacksC0497o.Y()) {
                B bD = abstractComponentCallbacksC0497o.D();
                X2.l.d(bD, "declaringFragment.parentFragmentManager");
                if (bD.g0() != null) {
                    C0071c c0071cG0 = bD.g0();
                    X2.l.b(c0071cG0);
                    return c0071cG0;
                }
            }
            abstractComponentCallbacksC0497o = abstractComponentCallbacksC0497o.C();
        }
        return f3368b;
    }

    public final void c(C0071c c0071c, final k kVar) {
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oA = kVar.a();
        final String name = abstractComponentCallbacksC0497oA.getClass().getName();
        if (c0071c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, kVar);
        }
        c0071c.b();
        if (c0071c.a().contains(a.PENALTY_DEATH)) {
            n(abstractComponentCallbacksC0497oA, new Runnable() { // from class: S.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, kVar);
                }
            });
        }
    }

    public final void e(k kVar) {
        if (B.m0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + kVar.a().getClass().getName(), kVar);
        }
    }

    public final void n(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, Runnable runnable) {
        if (abstractComponentCallbacksC0497o.Y()) {
            abstractComponentCallbacksC0497o.D().b0();
            throw null;
        }
        runnable.run();
    }

    public final boolean o(C0071c c0071c, Class cls, Class cls2) {
        Set set = (Set) c0071c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (X2.l.a(cls2.getSuperclass(), k.class) || !u.s(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
