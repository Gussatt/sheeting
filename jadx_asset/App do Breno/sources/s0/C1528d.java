package s0;

import K2.p;
import L2.m;
import W2.l;
import X2.j;
import X2.z;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import n0.d;
import r0.InterfaceC1503a;

/* JADX INFO: renamed from: s0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1528d implements InterfaceC1503a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f11317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0.d f11318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f11319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f11320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f11321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f11322f;

    /* JADX INFO: renamed from: s0.d$a */
    public /* synthetic */ class a extends j implements l {
        public a(Object obj) {
            super(1, obj, C1531g.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        @Override // W2.l
        public /* bridge */ /* synthetic */ Object k(Object obj) {
            o((WindowLayoutInfo) obj);
            return p.f2516a;
        }

        public final void o(WindowLayoutInfo windowLayoutInfo) {
            X2.l.e(windowLayoutInfo, "p0");
            ((C1531g) this.f3969n).accept(windowLayoutInfo);
        }
    }

    public C1528d(WindowLayoutComponent windowLayoutComponent, n0.d dVar) {
        X2.l.e(windowLayoutComponent, "component");
        X2.l.e(dVar, "consumerAdapter");
        this.f11317a = windowLayoutComponent;
        this.f11318b = dVar;
        this.f11319c = new ReentrantLock();
        this.f11320d = new LinkedHashMap();
        this.f11321e = new LinkedHashMap();
        this.f11322f = new LinkedHashMap();
    }

    @Override // r0.InterfaceC1503a
    public void a(Context context, Executor executor, B.a aVar) {
        p pVar;
        X2.l.e(context, "context");
        X2.l.e(executor, "executor");
        X2.l.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f11319c;
        reentrantLock.lock();
        try {
            C1531g c1531g = (C1531g) this.f11320d.get(context);
            if (c1531g != null) {
                c1531g.b(aVar);
                this.f11321e.put(aVar, context);
                pVar = p.f2516a;
            } else {
                pVar = null;
            }
            if (pVar == null) {
                C1531g c1531g2 = new C1531g(context);
                this.f11320d.put(context, c1531g2);
                this.f11321e.put(aVar, context);
                c1531g2.b(aVar);
                if (!(context instanceof Activity)) {
                    c1531g2.accept(new WindowLayoutInfo(m.f()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f11322f.put(c1531g2, this.f11318b.c(this.f11317a, z.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(c1531g2)));
                }
            }
            p pVar2 = p.f2516a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // r0.InterfaceC1503a
    public void b(B.a aVar) {
        X2.l.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f11319c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f11321e.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            C1531g c1531g = (C1531g) this.f11320d.get(context);
            if (c1531g == null) {
                reentrantLock.unlock();
                return;
            }
            c1531g.d(aVar);
            this.f11321e.remove(aVar);
            if (c1531g.c()) {
                this.f11320d.remove(context);
                d.b bVar = (d.b) this.f11322f.remove(c1531g);
                if (bVar != null) {
                    bVar.a();
                }
            }
            p pVar = p.f2516a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
