package c2;

import android.content.Context;
import e2.InterfaceC0934b;

/* JADX INFO: renamed from: c2.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0671H implements InterfaceC0934b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f6002a;

    public C0671H(J2.a aVar) {
        this.f6002a = aVar;
    }

    public static C0671H a(J2.a aVar) {
        return new C0671H(aVar);
    }

    public static C0670G c(Context context) {
        return new C0670G(context);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0670G get() {
        return c((Context) this.f6002a.get());
    }
}
