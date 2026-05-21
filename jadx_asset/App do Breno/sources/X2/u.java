package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends AbstractC0569c implements d3.i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3988t;

    public u(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f3988t = (i4 & 2) == 2;
    }

    @Override // X2.AbstractC0569c
    public d3.a a() {
        return this.f3988t ? this : super.a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return i().equals(uVar.i()) && h().equals(uVar.h()) && n().equals(uVar.n()) && l.a(c(), uVar.c());
        }
        if (obj instanceof d3.i) {
            return obj.equals(a());
        }
        return false;
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + h().hashCode()) * 31) + n().hashCode();
    }

    public d3.i o() {
        if (this.f3988t) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (d3.i) super.m();
    }

    public String toString() {
        d3.a aVarA = a();
        if (aVarA != this) {
            return aVarA.toString();
        }
        return "property " + h() + " (Kotlin reflection is not available)";
    }
}
