package m3;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10555a = new F("CONDITION_FALSE");

    public static final Object a() {
        return f10555a;
    }

    public static final q b(Object obj) {
        q qVar;
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null && (qVar = zVar.f10576a) != null) {
            return qVar;
        }
        X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (q) obj;
    }
}
