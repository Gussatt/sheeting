package m3;

import K2.j;
import a.C0570a;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement f10515a = new C0570a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f10517c;

    static {
        Object objB;
        Object objB2;
        try {
            j.a aVar = K2.j.f2509n;
            objB = K2.j.b(P2.a.class.getCanonicalName());
        } catch (Throwable th) {
            j.a aVar2 = K2.j.f2509n;
            objB = K2.j.b(K2.k.a(th));
        }
        if (K2.j.d(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f10516b = (String) objB;
        try {
            objB2 = K2.j.b(E.class.getCanonicalName());
        } catch (Throwable th2) {
            j.a aVar3 = K2.j.f2509n;
            objB2 = K2.j.b(K2.k.a(th2));
        }
        if (K2.j.d(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f10517c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
