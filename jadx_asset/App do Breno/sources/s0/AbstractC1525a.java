package s0;

import X2.l;
import androidx.window.extensions.layout.WindowLayoutComponent;
import r0.InterfaceC1503a;

/* JADX INFO: renamed from: s0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1525a implements InterfaceC1503a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0171a f11315a = new C0171a(null);

    /* JADX INFO: renamed from: s0.a$a, reason: collision with other inner class name */
    public static final class C0171a {
        public /* synthetic */ C0171a(X2.g gVar) {
            this();
        }

        public final InterfaceC1503a a(WindowLayoutComponent windowLayoutComponent, n0.d dVar) {
            l.e(windowLayoutComponent, "component");
            l.e(dVar, "adapter");
            int iA = n0.e.f10592a.a();
            return iA >= 2 ? new C1529e(windowLayoutComponent) : iA == 1 ? new C1528d(windowLayoutComponent, dVar) : new C1527c();
        }

        public C0171a() {
        }
    }
}
