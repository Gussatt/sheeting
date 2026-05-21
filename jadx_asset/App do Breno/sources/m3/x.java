package m3;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    public static final class a extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ W2.l f10573n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f10574o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ N2.i f10575p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W2.l lVar, Object obj, N2.i iVar) {
            super(1);
            this.f10573n = lVar;
            this.f10574o = obj;
            this.f10575p = iVar;
        }

        public final void a(Throwable th) throws IllegalAccessException, InvocationTargetException {
            x.b(this.f10573n, this.f10574o, this.f10575p);
        }

        @Override // W2.l
        public /* bridge */ /* synthetic */ Object k(Object obj) throws IllegalAccessException, InvocationTargetException {
            a((Throwable) obj);
            return K2.p.f2516a;
        }
    }

    public static final W2.l a(W2.l lVar, Object obj, N2.i iVar) {
        return new a(lVar, obj, iVar);
    }

    public static final void b(W2.l lVar, Object obj, N2.i iVar) throws IllegalAccessException, InvocationTargetException {
        O oC = c(lVar, obj, null);
        if (oC != null) {
            h3.H.a(iVar, oC);
        }
    }

    public static final O c(W2.l lVar, Object obj, O o4) throws IllegalAccessException, InvocationTargetException {
        try {
            lVar.k(obj);
            return o4;
        } catch (Throwable th) {
            if (o4 != null && o4.getCause() != th) {
                K2.a.a(o4, th);
                return o4;
            }
            return new O("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ O d(W2.l lVar, Object obj, O o4, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            o4 = null;
        }
        return c(lVar, obj, o4);
    }
}
