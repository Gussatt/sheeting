package c2;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0684j f6143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0666C f6144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0676b f6145c;

    public y(EnumC0684j enumC0684j, C0666C c0666c, C0676b c0676b) {
        X2.l.e(enumC0684j, "eventType");
        X2.l.e(c0666c, "sessionData");
        X2.l.e(c0676b, "applicationInfo");
        this.f6143a = enumC0684j;
        this.f6144b = c0666c;
        this.f6145c = c0676b;
    }

    public final C0676b a() {
        return this.f6145c;
    }

    public final EnumC0684j b() {
        return this.f6143a;
    }

    public final C0666C c() {
        return this.f6144b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f6143a == yVar.f6143a && X2.l.a(this.f6144b, yVar.f6144b) && X2.l.a(this.f6145c, yVar.f6145c);
    }

    public int hashCode() {
        return (((this.f6143a.hashCode() * 31) + this.f6144b.hashCode()) * 31) + this.f6145c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f6143a + ", sessionData=" + this.f6144b + ", applicationInfo=" + this.f6145c + ')';
    }
}
