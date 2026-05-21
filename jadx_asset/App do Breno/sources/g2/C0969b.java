package g2;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import w1.C1604c;
import w1.InterfaceC1605d;
import w1.g;
import w1.i;

/* JADX INFO: renamed from: g2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0969b implements i {
    public static /* synthetic */ Object b(String str, C1604c c1604c, InterfaceC1605d interfaceC1605d) {
        try {
            AbstractC0970c.b(str);
            return c1604c.h().a(interfaceC1605d);
        } finally {
            AbstractC0970c.a();
        }
    }

    @Override // w1.i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C1604c c1604cR : componentRegistrar.getComponents()) {
            final String strI = c1604cR.i();
            if (strI != null) {
                c1604cR = c1604cR.r(new g() { // from class: g2.a
                    @Override // w1.g
                    public final Object a(InterfaceC1605d interfaceC1605d) {
                        return C0969b.b(strI, c1604cR, interfaceC1605d);
                    }
                });
            }
            arrayList.add(c1604cR);
        }
        return arrayList;
    }
}
