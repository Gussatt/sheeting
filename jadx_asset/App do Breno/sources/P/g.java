package P;

import P.f;
import X2.l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final f a() {
        return new c(null, true, 1, null);
    }

    public static final c b(f.b... bVarArr) {
        l.e(bVarArr, "pairs");
        c cVar = new c(null, false, 1, null);
        cVar.h((f.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return cVar;
    }
}
