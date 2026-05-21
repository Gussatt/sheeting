package p0;

import X2.l;
import android.app.Activity;
import java.util.concurrent.Executor;
import k3.d;
import o0.C1463a;
import q0.f;

/* JADX INFO: renamed from: p0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1483a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f10910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1463a f10911c;

    public C1483a(f fVar, C1463a c1463a) {
        this.f10910b = fVar;
        this.f10911c = c1463a;
    }

    @Override // q0.f
    public d a(Activity activity) {
        l.e(activity, "activity");
        return this.f10910b.a(activity);
    }

    public final void b(Activity activity, Executor executor, B.a aVar) {
        l.e(activity, "activity");
        l.e(executor, "executor");
        l.e(aVar, "consumer");
        this.f10911c.a(executor, aVar, this.f10910b.a(activity));
    }

    public final void c(B.a aVar) {
        l.e(aVar, "consumer");
        this.f10911c.b(aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1483a(f fVar) {
        this(fVar, new C1463a());
        l.e(fVar, "tracker");
    }
}
