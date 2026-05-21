package i1;

import V0.AbstractC0549h;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import k1.C1238j5;
import k1.C1363z3;

/* JADX INFO: renamed from: i1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1041a extends AbstractC1043c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1363z3 f7633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1238j5 f7634b;

    public C1041a(C1363z3 c1363z3) {
        super(null);
        AbstractC0549h.j(c1363z3);
        this.f7633a = c1363z3;
        this.f7634b = c1363z3.K();
    }

    @Override // k1.InterfaceC1246k5
    public final int a(String str) {
        this.f7634b.j0(str);
        return 25;
    }

    @Override // k1.InterfaceC1246k5
    public final long b() {
        return this.f7633a.Q().C0();
    }

    @Override // k1.InterfaceC1246k5
    public final void c(String str) {
        C1363z3 c1363z3 = this.f7633a;
        c1363z3.A().l(str, c1363z3.f().b());
    }

    @Override // k1.InterfaceC1246k5
    public final void d(String str, String str2, Bundle bundle) {
        this.f7633a.K().x(str, str2, bundle);
    }

    @Override // k1.InterfaceC1246k5
    public final List e(String str, String str2) {
        return this.f7634b.t0(str, str2);
    }

    @Override // k1.InterfaceC1246k5
    public final String f() {
        return this.f7634b.p0();
    }

    @Override // k1.InterfaceC1246k5
    public final String g() {
        return this.f7634b.q0();
    }

    @Override // k1.InterfaceC1246k5
    public final Map h(String str, String str2, boolean z3) {
        return this.f7634b.u0(str, str2, z3);
    }

    @Override // k1.InterfaceC1246k5
    public final void i(String str) {
        C1363z3 c1363z3 = this.f7633a;
        c1363z3.A().m(str, c1363z3.f().b());
    }

    @Override // k1.InterfaceC1246k5
    public final String j() {
        return this.f7634b.r0();
    }

    @Override // k1.InterfaceC1246k5
    public final void k(Bundle bundle) {
        this.f7634b.R(bundle);
    }

    @Override // k1.InterfaceC1246k5
    public final void l(String str, String str2, Bundle bundle) {
        this.f7634b.C(str, str2, bundle);
    }

    @Override // k1.InterfaceC1246k5
    public final String r() {
        return this.f7634b.p0();
    }
}
