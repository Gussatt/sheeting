package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class S4 extends AbstractC0796l4 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V4 f6582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public V4 f6583n;

    public S4(V4 v4) {
        this.f6582m = v4;
        if (v4.C()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f6583n = v4.q();
    }

    public static void m(Object obj, Object obj2) {
        B5.a().b(obj.getClass()).d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0796l4
    public final /* bridge */ /* synthetic */ AbstractC0796l4 i(byte[] bArr, int i4, int i5) throws C0735e5 {
        L4 l4 = L4.f6399b;
        B5 b5 = B5.f6298c;
        p(bArr, 0, i5, L4.f6400c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0796l4
    public final /* bridge */ /* synthetic */ AbstractC0796l4 k(byte[] bArr, int i4, int i5, L4 l4) throws C0735e5 {
        p(bArr, 0, i5, l4);
        return this;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final S4 clone() {
        S4 s4 = (S4) this.f6582m.E(5, null, null);
        s4.f6583n = e();
        return s4;
    }

    public final S4 o(V4 v4) {
        if (!this.f6582m.equals(v4)) {
            if (!this.f6583n.C()) {
                t();
            }
            m(this.f6583n, v4);
        }
        return this;
    }

    public final S4 p(byte[] bArr, int i4, int i5, L4 l4) throws C0735e5 {
        if (!this.f6583n.C()) {
            t();
        }
        try {
            B5.a().b(this.f6583n.getClass()).f(this.f6583n, bArr, 0, i5, new C0828p4(l4));
            return this;
        } catch (C0735e5 e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e5);
        } catch (IndexOutOfBoundsException unused) {
            throw new C0735e5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final V4 q() {
        V4 v4E = e();
        if (v4E.l()) {
            return v4E;
        }
        throw new J5(v4E);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0852s5
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public V4 e() {
        if (!this.f6583n.C()) {
            return this.f6583n;
        }
        this.f6583n.y();
        return this.f6583n;
    }

    public final void s() {
        if (this.f6583n.C()) {
            return;
        }
        t();
    }

    public void t() {
        V4 v4Q = this.f6582m.q();
        m(v4Q, this.f6583n);
        this.f6583n = v4Q;
    }
}
