package l3;

import N2.i;
import h3.InterfaceC1027q0;
import m3.B;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static final class a extends X2.m implements W2.p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ n f10297n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar) {
            super(2);
            this.f10297n = nVar;
        }

        public final Integer a(int i4, i.b bVar) {
            i.c key = bVar.getKey();
            i.b bVarD = this.f10297n.f10290q.d(key);
            if (key != InterfaceC1027q0.f7558k) {
                return Integer.valueOf(bVar != bVarD ? Integer.MIN_VALUE : i4 + 1);
            }
            InterfaceC1027q0 interfaceC1027q0 = (InterfaceC1027q0) bVarD;
            X2.l.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC1027q0 interfaceC1027q0B = p.b((InterfaceC1027q0) bVar, interfaceC1027q0);
            if (interfaceC1027q0B == interfaceC1027q0) {
                if (interfaceC1027q0 != null) {
                    i4++;
                }
                return Integer.valueOf(i4);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC1027q0B + ", expected child of " + interfaceC1027q0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // W2.p
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (i.b) obj2);
        }
    }

    public static final void a(n nVar, N2.i iVar) {
        if (((Number) iVar.O(0, new a(nVar))).intValue() == nVar.f10291r) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + nVar.f10290q + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC1027q0 b(InterfaceC1027q0 interfaceC1027q0, InterfaceC1027q0 interfaceC1027q02) {
        while (interfaceC1027q0 != null) {
            if (interfaceC1027q0 == interfaceC1027q02 || !(interfaceC1027q0 instanceof B)) {
                return interfaceC1027q0;
            }
            interfaceC1027q0 = interfaceC1027q0.getParent();
        }
        return null;
    }
}
