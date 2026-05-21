package D0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f858c;

    public j(J2.a aVar, J2.a aVar2, J2.a aVar3) {
        this.f856a = aVar;
        this.f857b = aVar2;
        this.f858c = aVar3;
    }

    public static j a(J2.a aVar, J2.a aVar2, J2.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, M0.a aVar, M0.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f856a.get(), (M0.a) this.f857b.get(), (M0.a) this.f858c.get());
    }
}
