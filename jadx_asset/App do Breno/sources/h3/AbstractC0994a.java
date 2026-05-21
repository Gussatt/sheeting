package h3;

/* JADX INFO: renamed from: h3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0994a extends x0 implements InterfaceC1027q0, N2.e, I {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final N2.i f7527o;

    public AbstractC0994a(N2.i iVar, boolean z3, boolean z4) {
        super(z4);
        if (z3) {
            q0((InterfaceC1027q0) iVar.d(InterfaceC1027q0.f7558k));
        }
        this.f7527o = iVar.D(this);
    }

    @Override // h3.x0
    public final void B0(Object obj) {
        if (!(obj instanceof C1035z)) {
            T0(obj);
        } else {
            C1035z c1035z = (C1035z) obj;
            S0(c1035z.f7590a, c1035z.a());
        }
    }

    public void R0(Object obj) {
        R(obj);
    }

    public final void U0(K k4, Object obj, W2.p pVar) {
        k4.f(pVar, obj, this);
    }

    @Override // h3.x0
    public String Z() {
        return M.a(this) + " was cancelled";
    }

    @Override // N2.e
    public final N2.i b() {
        return this.f7527o;
    }

    @Override // h3.x0, h3.InterfaceC1027q0
    public boolean c() {
        return super.c();
    }

    @Override // h3.I
    public N2.i o() {
        return this.f7527o;
    }

    @Override // N2.e
    public final void p(Object obj) {
        Object objU0 = u0(D.d(obj, null, 1, null));
        if (objU0 == y0.f7583b) {
            return;
        }
        R0(objU0);
    }

    @Override // h3.x0
    public final void p0(Throwable th) {
        H.a(this.f7527o, th);
    }

    @Override // h3.x0
    public String w0() {
        String strB = E.b(this.f7527o);
        if (strB == null) {
            return super.w0();
        }
        return '\"' + strB + "\":" + super.w0();
    }

    public void T0(Object obj) {
    }

    public void S0(Throwable th, boolean z3) {
    }
}
