package w1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class x implements U1.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f11854b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f11853a = Collections.newSetFromMap(new ConcurrentHashMap());

    public x(Collection collection) {
        this.f11853a.addAll(collection);
    }

    public static x b(Collection collection) {
        return new x((Set) collection);
    }

    public synchronized void a(U1.b bVar) {
        try {
            if (this.f11854b == null) {
                this.f11853a.add(bVar);
            } else {
                this.f11854b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // U1.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f11854b == null) {
            synchronized (this) {
                try {
                    if (this.f11854b == null) {
                        this.f11854b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f11854b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.f11853a.iterator();
            while (it.hasNext()) {
                this.f11854b.add(((U1.b) it.next()).get());
            }
            this.f11853a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
