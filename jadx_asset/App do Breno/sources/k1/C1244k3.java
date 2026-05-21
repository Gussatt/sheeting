package k1;

import V0.AbstractC0549h;
import p.C1479e;

/* JADX INFO: renamed from: k1.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1244k3 extends C1479e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1268n3 f9523i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244k3(C1268n3 c1268n3, int i4) {
        super(20);
        this.f9523i = c1268n3;
    }

    @Override // p.C1479e
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        AbstractC0549h.d(str);
        C1268n3 c1268n3 = this.f9523i;
        return c1268n3.f9366a.B().P(null, AbstractC1291q2.f9766o1) ? C1268n3.A(c1268n3, str) : C1268n3.z(c1268n3, str);
    }
}
