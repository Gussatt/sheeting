package u1;

import j1.C1109a;
import java.util.HashSet;
import java.util.Set;
import t1.InterfaceC1540a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1540a.b f11471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1109a f11472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f11473d;

    public d(C1109a c1109a, InterfaceC1540a.b bVar) {
        this.f11471b = bVar;
        this.f11472c = c1109a;
        c cVar = new c(this);
        this.f11473d = cVar;
        c1109a.b(cVar);
        this.f11470a = new HashSet();
    }
}
