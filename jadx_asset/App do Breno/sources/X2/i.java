package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends AbstractC0569c implements h, d3.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3983t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f3984u;

    public i(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f3983t = i4;
        this.f3984u = i5 >> 1;
    }

    @Override // X2.AbstractC0569c
    public d3.a b() {
        return z.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return h().equals(iVar.h()) && n().equals(iVar.n()) && this.f3984u == iVar.f3984u && this.f3983t == iVar.f3983t && l.a(c(), iVar.c()) && l.a(i(), iVar.i());
        }
        if (obj instanceof d3.e) {
            return obj.equals(a());
        }
        return false;
    }

    @Override // X2.h
    public int f() {
        return this.f3983t;
    }

    public int hashCode() {
        return (((i() == null ? 0 : i().hashCode() * 31) + h().hashCode()) * 31) + n().hashCode();
    }

    public String toString() {
        d3.a aVarA = a();
        if (aVarA != this) {
            return aVarA.toString();
        }
        if ("<init>".equals(h())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + h() + " (Kotlin reflection is not available)";
    }
}
