package m3;

import N2.i;
import h3.K0;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f10520a = new F("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W2.p f10521b = a.f10524n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W2.p f10522c = b.f10525n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W2.p f10523d = c.f10526n;

    public static final class a extends X2.m implements W2.p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f10524n = new a();

        public a() {
            super(2);
        }

        @Override // W2.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object j(Object obj, i.b bVar) {
            if (!(bVar instanceof K0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    public static final class b extends X2.m implements W2.p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f10525n = new b();

        public b() {
            super(2);
        }

        @Override // W2.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K0 j(K0 k02, i.b bVar) {
            if (k02 != null) {
                return k02;
            }
            if (bVar instanceof K0) {
                return (K0) bVar;
            }
            return null;
        }
    }

    public static final class c extends X2.m implements W2.p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final c f10526n = new c();

        public c() {
            super(2);
        }

        @Override // W2.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N j(N n4, i.b bVar) {
            if (bVar instanceof K0) {
                K0 k02 = (K0) bVar;
                n4.a(k02, k02.I(n4.f10527a));
            }
            return n4;
        }
    }

    public static final void a(N2.i iVar, Object obj) {
        if (obj == f10520a) {
            return;
        }
        if (obj instanceof N) {
            ((N) obj).b(iVar);
            return;
        }
        Object objO = iVar.O(null, f10522c);
        X2.l.c(objO, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((K0) objO).j(iVar, obj);
    }

    public static final Object b(N2.i iVar) {
        Object objO = iVar.O(0, f10521b);
        X2.l.b(objO);
        return objO;
    }

    public static final Object c(N2.i iVar, Object obj) {
        if (obj == null) {
            obj = b(iVar);
        }
        if (obj == 0) {
            return f10520a;
        }
        if (obj instanceof Integer) {
            return iVar.O(new N(iVar, ((Number) obj).intValue()), f10523d);
        }
        X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((K0) obj).I(iVar);
    }
}
