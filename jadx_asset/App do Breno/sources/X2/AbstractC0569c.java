package X2;

import java.io.Serializable;

/* JADX INFO: renamed from: X2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0569c implements d3.a, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f3967s = a.f3974m;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient d3.a f3968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f3969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Class f3970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f3971p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f3972q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3973r;

    /* JADX INFO: renamed from: X2.c$a */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f3974m = new a();
    }

    public AbstractC0569c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f3969n = obj;
        this.f3970o = cls;
        this.f3971p = str;
        this.f3972q = str2;
        this.f3973r = z3;
    }

    public d3.a a() {
        d3.a aVar = this.f3968m;
        if (aVar != null) {
            return aVar;
        }
        d3.a aVarB = b();
        this.f3968m = aVarB;
        return aVarB;
    }

    public abstract d3.a b();

    public Object c() {
        return this.f3969n;
    }

    public String h() {
        return this.f3971p;
    }

    public d3.d i() {
        Class cls = this.f3970o;
        if (cls == null) {
            return null;
        }
        return this.f3973r ? z.c(cls) : z.b(cls);
    }

    public d3.a m() {
        d3.a aVarA = a();
        if (aVarA != this) {
            return aVarA;
        }
        throw new V2.b();
    }

    public String n() {
        return this.f3972q;
    }
}
