package c2;

import android.content.Context;
import e2.InterfaceC0934b;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC0934b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f6137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f6138b;

    public w(J2.a aVar, J2.a aVar2) {
        this.f6137a = aVar;
        this.f6138b = aVar2;
    }

    public static w a(J2.a aVar, J2.a aVar2) {
        return new w(aVar, aVar2);
    }

    public static v c(Context context, N2.i iVar) {
        return new v(context, iVar);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Context) this.f6137a.get(), (N2.i) this.f6138b.get());
    }
}
