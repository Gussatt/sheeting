package K0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class X implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f2414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f2415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f2416c;

    public X(J2.a aVar, J2.a aVar2, J2.a aVar3) {
        this.f2414a = aVar;
        this.f2415b = aVar2;
        this.f2416c = aVar3;
    }

    public static X a(J2.a aVar, J2.a aVar2, J2.a aVar3) {
        return new X(aVar, aVar2, aVar3);
    }

    public static W c(Context context, String str, int i4) {
        return new W(context, str, i4);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c((Context) this.f2414a.get(), (String) this.f2415b.get(), ((Integer) this.f2416c.get()).intValue());
    }
}
