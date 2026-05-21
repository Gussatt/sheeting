package H2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: H2.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0331g0 extends X0 {
    public C0331g0(O3 o32) {
        super(o32);
    }

    @Override // H2.X0
    public String b(AbstractC0324f0 abstractC0324f0, String str) {
        return abstractC0324f0.a(str);
    }

    @Override // H2.X0
    public AbstractC0324f0 d() {
        return c().N();
    }

    @Override // H2.X0
    public List e(AbstractC0324f0 abstractC0324f0, String str) {
        try {
            String[] strArrB = abstractC0324f0.b(str);
            return strArrB == null ? new ArrayList() : Arrays.asList(strArrB);
        } catch (IOException e4) {
            throw new RuntimeException(e4.getMessage());
        }
    }

    @Override // H2.X0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public O3 c() {
        return (O3) super.c();
    }
}
