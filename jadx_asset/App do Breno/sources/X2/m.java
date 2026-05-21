package X2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements h, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3985m;

    public m(int i4) {
        this.f3985m = i4;
    }

    @Override // X2.h
    public int f() {
        return this.f3985m;
    }

    public String toString() {
        String strH = z.h(this);
        l.d(strH, "renderLambdaToString(...)");
        return strH;
    }
}
