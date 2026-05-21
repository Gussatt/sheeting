package k1;

import com.google.android.gms.internal.measurement.InterfaceC0755g7;
import java.util.List;

/* JADX INFO: renamed from: k1.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1252l3 implements InterfaceC0755g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1268n3 f9530a;

    public C1252l3(C1268n3 c1268n3) {
        this.f9530a = c1268n3;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0755g7
    public final void a(int i4, String str, List list, boolean z3, boolean z4) {
        int i5 = i4 - 1;
        I2 i2U = i5 != 0 ? i5 != 1 ? i5 != 3 ? i5 != 4 ? this.f9530a.f9366a.c().u() : z3 ? this.f9530a.f9366a.c().y() : !z4 ? this.f9530a.f9366a.c().x() : this.f9530a.f9366a.c().w() : this.f9530a.f9366a.c().v() : z3 ? this.f9530a.f9366a.c().t() : !z4 ? this.f9530a.f9366a.c().s() : this.f9530a.f9366a.c().r() : this.f9530a.f9366a.c().q();
        int size = list.size();
        if (size == 1) {
            i2U.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            i2U.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            i2U.a(str);
        } else {
            i2U.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
