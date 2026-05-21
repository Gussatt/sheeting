package l3;

import X2.C;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W2.q f10295a;

    public /* synthetic */ class a extends X2.j implements W2.q {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f10296v = new a();

        public a() {
            super(3, k3.e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // W2.q
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object g(k3.e eVar, Object obj, N2.e eVar2) {
            return eVar.a(obj, eVar2);
        }
    }

    static {
        a aVar = a.f10296v;
        X2.l.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f10295a = (W2.q) C.b(aVar, 3);
    }
}
