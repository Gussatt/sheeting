package U0;

import S0.C0506d;
import V0.AbstractC0548g;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0518b f3498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0506d f3499b;

    public /* synthetic */ A(C0518b c0518b, C0506d c0506d, AbstractC0541z abstractC0541z) {
        this.f3498a = c0518b;
        this.f3499b = c0506d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof A)) {
            A a4 = (A) obj;
            if (AbstractC0548g.a(this.f3498a, a4.f3498a) && AbstractC0548g.a(this.f3499b, a4.f3499b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0548g.b(this.f3498a, this.f3499b);
    }

    public final String toString() {
        return AbstractC0548g.c(this).a("key", this.f3498a).a("feature", this.f3499b).toString();
    }
}
