package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4945a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f4946b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f4947c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final void a() {
        this.f4947c = true;
        Map map = this.f4945a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f4945a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f4946b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f4946b.iterator();
                    while (it2.hasNext()) {
                        b((Closeable) it2.next());
                    }
                } finally {
                }
            }
            this.f4946b.clear();
        }
        c();
    }

    public void c() {
    }
}
