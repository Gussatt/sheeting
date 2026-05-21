package P2;

import X2.l;
import X2.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends d implements X2.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2902p;

    public k(int i4, N2.e eVar) {
        super(eVar);
        this.f2902p = i4;
    }

    @Override // X2.h
    public int f() {
        return this.f2902p;
    }

    @Override // P2.a
    public String toString() {
        if (n() != null) {
            return super.toString();
        }
        String strG = z.g(this);
        l.d(strG, "renderLambdaToString(...)");
        return strG;
    }
}
