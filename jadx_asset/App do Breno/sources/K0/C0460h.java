package K0;

import android.content.Context;

/* JADX INFO: renamed from: K0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0460h implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f2432a;

    public C0460h(J2.a aVar) {
        this.f2432a = aVar;
    }

    public static C0460h a(J2.a aVar) {
        return new C0460h(aVar);
    }

    public static String c(Context context) {
        return (String) E0.d.d(AbstractC0458f.b(context));
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f2432a.get());
    }
}
