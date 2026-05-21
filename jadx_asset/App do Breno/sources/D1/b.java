package D1;

import b0.ExecutorC0628k;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.C1435b;
import n1.C1446m;
import n1.InterfaceC1436c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f869a = new ExecutorC0628k();

    public static /* synthetic */ AbstractC1445l a(C1446m c1446m, AtomicBoolean atomicBoolean, C1435b c1435b, AbstractC1445l abstractC1445l) {
        if (abstractC1445l.m()) {
            c1446m.e(abstractC1445l.j());
        } else if (abstractC1445l.i() != null) {
            c1446m.d(abstractC1445l.i());
        } else if (atomicBoolean.getAndSet(true)) {
            c1435b.a();
        }
        return AbstractC1448o.e(null);
    }

    public static AbstractC1445l b(AbstractC1445l abstractC1445l, AbstractC1445l abstractC1445l2) {
        final C1435b c1435b = new C1435b();
        final C1446m c1446m = new C1446m(c1435b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC1436c interfaceC1436c = new InterfaceC1436c() { // from class: D1.a
            @Override // n1.InterfaceC1436c
            public final Object a(AbstractC1445l abstractC1445l3) {
                return b.a(c1446m, atomicBoolean, c1435b, abstractC1445l3);
            }
        };
        Executor executor = f869a;
        abstractC1445l.h(executor, interfaceC1436c);
        abstractC1445l2.h(executor, interfaceC1436c);
        return c1446m.a();
    }
}
