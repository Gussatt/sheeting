package m3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC1489b;

/* JADX INFO: renamed from: m3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1417b extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10532a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1417b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC1416a.f10531a;

    @Override // m3.y
    public final Object a(Object obj) {
        Object objC = f10532a.get(this);
        if (objC == AbstractC1416a.f10531a) {
            objC = c(d(obj));
        }
        b(obj, objC);
        return objC;
    }

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10532a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC1416a.f10531a;
        return obj2 != obj3 ? obj2 : AbstractC1489b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract Object d(Object obj);
}
