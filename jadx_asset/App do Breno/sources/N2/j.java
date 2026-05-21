package N2;

import N2.i;
import W2.p;
import X2.l;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f2823m = new j();

    @Override // N2.i
    public i D(i iVar) {
        l.e(iVar, "context");
        return iVar;
    }

    @Override // N2.i
    public i F(i.c cVar) {
        l.e(cVar, "key");
        return this;
    }

    @Override // N2.i
    public Object O(Object obj, p pVar) {
        l.e(pVar, "operation");
        return obj;
    }

    @Override // N2.i
    public i.b d(i.c cVar) {
        l.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
