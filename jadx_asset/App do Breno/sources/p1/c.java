package p1;

import java.io.Serializable;
import o1.AbstractC1469f;
import o1.AbstractC1471h;
import o1.InterfaceC1466c;

/* JADX INFO: loaded from: classes.dex */
public final class c extends r implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1466c f10922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f10923n;

    public c(InterfaceC1466c interfaceC1466c, r rVar) {
        this.f10922m = (InterfaceC1466c) AbstractC1471h.h(interfaceC1466c);
        this.f10923n = (r) AbstractC1471h.h(rVar);
    }

    @Override // p1.r, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f10923n.compare(this.f10922m.apply(obj), this.f10922m.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f10922m.equals(cVar.f10922m) && this.f10923n.equals(cVar.f10923n)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1469f.b(this.f10922m, this.f10923n);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f10923n);
        String strValueOf2 = String.valueOf(this.f10922m);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
