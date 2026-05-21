package U0;

import T0.a;
import V0.AbstractC0548g;

/* JADX INFO: renamed from: U0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0518b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T0.a f3548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.d f3549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3550d;

    public C0518b(T0.a aVar, a.d dVar, String str) {
        this.f3548b = aVar;
        this.f3549c = dVar;
        this.f3550d = str;
        this.f3547a = AbstractC0548g.b(aVar, dVar, str);
    }

    public static C0518b a(T0.a aVar, a.d dVar, String str) {
        return new C0518b(aVar, dVar, str);
    }

    public final String b() {
        return this.f3548b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0518b)) {
            return false;
        }
        C0518b c0518b = (C0518b) obj;
        return AbstractC0548g.a(this.f3548b, c0518b.f3548b) && AbstractC0548g.a(this.f3549c, c0518b.f3549c) && AbstractC0548g.a(this.f3550d, c0518b.f3550d);
    }

    public final int hashCode() {
        return this.f3547a;
    }
}
