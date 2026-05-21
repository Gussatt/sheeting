package s0;

import K2.p;
import X2.l;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import r0.InterfaceC1503a;

/* JADX INFO: renamed from: s0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1529e implements InterfaceC1503a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f11323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f11324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f11326d;

    public C1529e(WindowLayoutComponent windowLayoutComponent) {
        l.e(windowLayoutComponent, "component");
        this.f11323a = windowLayoutComponent;
        this.f11324b = new ReentrantLock();
        this.f11325c = new LinkedHashMap();
        this.f11326d = new LinkedHashMap();
    }

    @Override // r0.InterfaceC1503a
    public void a(Context context, Executor executor, B.a aVar) {
        p pVar;
        l.e(context, "context");
        l.e(executor, "executor");
        l.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f11324b;
        reentrantLock.lock();
        try {
            C1531g c1531g = (C1531g) this.f11325c.get(context);
            if (c1531g != null) {
                c1531g.b(aVar);
                this.f11326d.put(aVar, context);
                pVar = p.f2516a;
            } else {
                pVar = null;
            }
            if (pVar == null) {
                C1531g c1531g2 = new C1531g(context);
                this.f11325c.put(context, c1531g2);
                this.f11326d.put(aVar, context);
                c1531g2.b(aVar);
                this.f11323a.addWindowLayoutInfoListener(context, c1531g2);
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
        l.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f11324b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f11326d.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            C1531g c1531g = (C1531g) this.f11325c.get(context);
            if (c1531g == null) {
                reentrantLock.unlock();
                return;
            }
            c1531g.d(aVar);
            this.f11326d.remove(aVar);
            if (c1531g.c()) {
                this.f11325c.remove(context);
                this.f11323a.removeWindowLayoutInfoListener(c1531g);
            }
            p pVar = p.f2516a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
