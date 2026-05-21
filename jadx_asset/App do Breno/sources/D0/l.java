package D0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f865b;

    public l(J2.a aVar, J2.a aVar2) {
        this.f864a = aVar;
        this.f865b = aVar2;
    }

    public static l a(J2.a aVar, J2.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f864a.get(), this.f865b.get());
    }
}
