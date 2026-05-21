package i1;

import V0.AbstractC0549h;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import k1.InterfaceC1246k5;

/* JADX INFO: renamed from: i1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1042b extends AbstractC1043c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1246k5 f7635a;

    public C1042b(InterfaceC1246k5 interfaceC1246k5) {
        super(null);
        AbstractC0549h.j(interfaceC1246k5);
        this.f7635a = interfaceC1246k5;
    }

    @Override // k1.InterfaceC1246k5
    public final int a(String str) {
        return this.f7635a.a(str);
    }

    @Override // k1.InterfaceC1246k5
    public final long b() {
        return this.f7635a.b();
    }

    @Override // k1.InterfaceC1246k5
    public final void c(String str) {
        this.f7635a.c(str);
    }

    @Override // k1.InterfaceC1246k5
    public final void d(String str, String str2, Bundle bundle) {
        this.f7635a.d(str, str2, bundle);
    }

    @Override // k1.InterfaceC1246k5
    public final List e(String str, String str2) {
        return this.f7635a.e(str, str2);
    }

    @Override // k1.InterfaceC1246k5
    public final String f() {
        return this.f7635a.f();
    }

    @Override // k1.InterfaceC1246k5
    public final String g() {
        return this.f7635a.g();
    }

    @Override // k1.InterfaceC1246k5
    public final Map h(String str, String str2, boolean z3) {
        return this.f7635a.h(str, str2, z3);
    }

    @Override // k1.InterfaceC1246k5
    public final void i(String str) {
        this.f7635a.i(str);
    }

    @Override // k1.InterfaceC1246k5
    public final String j() {
        return this.f7635a.j();
    }

    @Override // k1.InterfaceC1246k5
    public final void k(Bundle bundle) {
        this.f7635a.k(bundle);
    }

    @Override // k1.InterfaceC1246k5
    public final void l(String str, String str2, Bundle bundle) {
        this.f7635a.l(str, str2, bundle);
    }

    @Override // k1.InterfaceC1246k5
    public final String r() {
        return this.f7635a.r();
    }
}
