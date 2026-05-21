package s0;

import L2.m;
import X2.l;
import android.content.Context;
import java.util.concurrent.Executor;
import q0.j;
import r0.InterfaceC1503a;

/* JADX INFO: renamed from: s0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1527c implements InterfaceC1503a {
    public static final void d(B.a aVar) {
        l.e(aVar, "$callback");
        aVar.accept(new j(m.f()));
    }

    @Override // r0.InterfaceC1503a
    public void a(Context context, Executor executor, final B.a aVar) {
        l.e(context, "context");
        l.e(executor, "executor");
        l.e(aVar, "callback");
        executor.execute(new Runnable() { // from class: s0.b
            @Override // java.lang.Runnable
            public final void run() {
                C1527c.d(aVar);
            }
        });
    }

    @Override // r0.InterfaceC1503a
    public void b(B.a aVar) {
        l.e(aVar, "callback");
    }
}
