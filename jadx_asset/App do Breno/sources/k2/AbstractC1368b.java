package k2;

import i2.C1049E;
import java.util.List;

/* JADX INFO: renamed from: k2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1368b implements InterfaceC1371e {
    @Override // k2.InterfaceC1371e
    public C1049E d() {
        return new C1049E(m(), n());
    }

    @Override // k2.InterfaceC1371e
    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    @Override // k2.InterfaceC1371e
    public Boolean f() {
        return k("inTransaction");
    }

    @Override // k2.InterfaceC1371e
    public Integer g() {
        return (Integer) c("transactionId");
    }

    @Override // k2.InterfaceC1371e
    public boolean h() {
        return j("transactionId") && g() == null;
    }

    public final Boolean k(String str) {
        Object objC = c(str);
        if (objC instanceof Boolean) {
            return (Boolean) objC;
        }
        return null;
    }

    public boolean l() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }

    public final String m() {
        return (String) c("sql");
    }

    public final List n() {
        return (List) c("arguments");
    }

    public String toString() {
        return i() + " " + m() + " " + n();
    }
}
