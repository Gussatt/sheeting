package U0;

import com.google.android.gms.common.internal.a;

/* JADX INFO: renamed from: U0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0539x implements a.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0540y f3602a;

    public C0539x(C0540y c0540y) {
        this.f3602a = c0540y;
    }

    @Override // com.google.android.gms.common.internal.a.e
    public final void a() {
        this.f3602a.f3615x.f3578n.post(new RunnableC0538w(this));
    }
}
