package S1;

import w1.AbstractC1601D;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3456b;

    public a(Class cls, Object obj) {
        this.f3455a = (Class) AbstractC1601D.b(cls);
        this.f3456b = AbstractC1601D.b(obj);
    }

    public Object a() {
        return this.f3456b;
    }

    public Class b() {
        return this.f3455a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f3455a, this.f3456b);
    }
}
