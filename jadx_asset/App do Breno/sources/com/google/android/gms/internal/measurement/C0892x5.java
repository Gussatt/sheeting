package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0892x5 implements E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0860t5 f7009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K5 f7010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7011c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M4 f7012d;

    public C0892x5(K5 k5, M4 m4, InterfaceC0860t5 interfaceC0860t5) {
        this.f7010b = k5;
        this.f7012d = m4;
        this.f7009a = interfaceC0860t5;
    }

    public static C0892x5 j(K5 k5, M4 m4, InterfaceC0860t5 interfaceC0860t5) {
        return new C0892x5(k5, m4, interfaceC0860t5);
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final void a(Object obj) {
        this.f7010b.a(obj);
        this.f7012d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final int b(Object obj) {
        int iB = ((V4) obj).zzc.b();
        if (!this.f7011c) {
            return iB;
        }
        i.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final void c(Object obj, V5 v5) {
        i.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final void d(Object obj, Object obj2) {
        G5.u(this.f7010b, obj, obj2);
        if (this.f7011c) {
            G5.t(this.f7012d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final Object e() {
        InterfaceC0860t5 interfaceC0860t5 = this.f7009a;
        return interfaceC0860t5 instanceof V4 ? ((V4) interfaceC0860t5).q() : interfaceC0860t5.g().e();
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final void f(Object obj, byte[] bArr, int i4, int i5, C0828p4 c0828p4) {
        V4 v4 = (V4) obj;
        if (v4.zzc == L5.c()) {
            v4.zzc = L5.f();
        }
        i.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final boolean g(Object obj, Object obj2) {
        if (!((V4) obj).zzc.equals(((V4) obj2).zzc)) {
            return false;
        }
        if (!this.f7011c) {
            return true;
        }
        i.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final boolean h(Object obj) {
        i.d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final int i(Object obj) {
        int iHashCode = ((V4) obj).zzc.hashCode();
        if (!this.f7011c) {
            return iHashCode;
        }
        i.d.a(obj);
        throw null;
    }
}
