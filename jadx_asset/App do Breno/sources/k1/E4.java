package k1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class E4 extends AbstractC1141A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f8955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4(C1238j5 c1238j5, InterfaceC1186d4 interfaceC1186d4) {
        super(interfaceC1186d4);
        this.f8955e = c1238j5;
    }

    @Override // k1.AbstractC1141A
    public final void c() {
        final C1238j5 c1238j5K = this.f8955e.f9366a.K();
        Objects.requireNonNull(c1238j5K);
        new Thread(new Runnable() { // from class: k1.D4
            @Override // java.lang.Runnable
            public final void run() {
                c1238j5K.z();
            }
        }).start();
    }
}
