package u3;

import X2.l;
import java.io.IOException;
import java.util.Iterator;
import t3.AbstractC1552h;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(AbstractC1552h abstractC1552h, J j4, boolean z3) throws IOException {
        l.e(abstractC1552h, "<this>");
        l.e(j4, "dir");
        L2.f fVar = new L2.f();
        for (J jM = j4; jM != null && !abstractC1552h.g(jM); jM = jM.m()) {
            fVar.addFirst(jM);
        }
        if (z3 && fVar.isEmpty()) {
            throw new IOException(j4 + " already exist.");
        }
        Iterator<E> it = fVar.iterator();
        while (it.hasNext()) {
            abstractC1552h.c((J) it.next());
        }
    }

    public static final boolean b(AbstractC1552h abstractC1552h, J j4) {
        l.e(abstractC1552h, "<this>");
        l.e(j4, "path");
        return abstractC1552h.h(j4) != null;
    }
}
