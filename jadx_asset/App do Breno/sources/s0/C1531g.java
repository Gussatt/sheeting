package s0;

import K2.p;
import X2.l;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import q0.j;

/* JADX INFO: renamed from: s0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1531g implements B.a, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f11329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f11330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f11331d;

    public C1531g(Context context) {
        l.e(context, "context");
        this.f11328a = context;
        this.f11329b = new ReentrantLock();
        this.f11331d = new LinkedHashSet();
    }

    @Override // B.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        l.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f11329b;
        reentrantLock.lock();
        try {
            this.f11330c = C1530f.f11327a.b(this.f11328a, windowLayoutInfo);
            Iterator it = this.f11331d.iterator();
            while (it.hasNext()) {
                ((B.a) it.next()).accept(this.f11330c);
            }
            p pVar = p.f2516a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(B.a aVar) {
        l.e(aVar, "listener");
        ReentrantLock reentrantLock = this.f11329b;
        reentrantLock.lock();
        try {
            j jVar = this.f11330c;
            if (jVar != null) {
                aVar.accept(jVar);
            }
            this.f11331d.add(aVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f11331d.isEmpty();
    }

    public final void d(B.a aVar) {
        l.e(aVar, "listener");
        ReentrantLock reentrantLock = this.f11329b;
        reentrantLock.lock();
        try {
            this.f11331d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
