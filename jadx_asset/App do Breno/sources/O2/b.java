package O2;

import K2.k;
import N2.e;
import N2.i;
import P2.d;
import P2.h;
import P2.j;
import W2.p;
import X2.C;
import X2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f2870n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ p f2871o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Object f2872p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, p pVar, Object obj) {
            super(eVar);
            this.f2871o = pVar;
            this.f2872p = obj;
            l.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // P2.a
        public Object q(Object obj) throws Throwable {
            int i4 = this.f2870n;
            if (i4 == 0) {
                this.f2870n = 1;
                k.b(obj);
                l.c(this.f2871o, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) C.b(this.f2871o, 2)).j(this.f2872p, this);
            }
            if (i4 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2870n = 2;
            k.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: O2.b$b, reason: collision with other inner class name */
    public static final class C0065b extends d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2873p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ p f2874q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Object f2875r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0065b(e eVar, i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f2874q = pVar;
            this.f2875r = obj;
            l.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // P2.a
        public Object q(Object obj) throws Throwable {
            int i4 = this.f2873p;
            if (i4 == 0) {
                this.f2873p = 1;
                k.b(obj);
                l.c(this.f2874q, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) C.b(this.f2874q, 2)).j(this.f2875r, this);
            }
            if (i4 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2873p = 2;
            k.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(p pVar, Object obj, e eVar) {
        l.e(pVar, "<this>");
        l.e(eVar, "completion");
        e eVarA = h.a(eVar);
        if (pVar instanceof P2.a) {
            return ((P2.a) pVar).m(obj, eVarA);
        }
        i iVarB = eVarA.b();
        return iVarB == N2.j.f2823m ? new a(eVarA, pVar, obj) : new C0065b(eVarA, iVarB, pVar, obj);
    }

    public static e b(e eVar) {
        e eVarS;
        l.e(eVar, "<this>");
        d dVar = eVar instanceof d ? (d) eVar : null;
        return (dVar == null || (eVarS = dVar.s()) == null) ? eVar : eVarS;
    }
}
