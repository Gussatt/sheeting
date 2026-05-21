package b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: b.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0615c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5536b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public W2.a f5537c;

    public AbstractC0615c(boolean z3) {
        this.f5535a = z3;
    }

    public final void a() {
        Iterator it = this.f5536b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0613a) it.next()).cancel();
        }
    }

    public final void b(boolean z3) {
        this.f5535a = z3;
        W2.a aVar = this.f5537c;
        if (aVar != null) {
            aVar.e();
        }
    }
}
