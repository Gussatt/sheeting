package a2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d f4048b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f4049a = new HashSet();

    public static d a() {
        d dVar;
        d dVar2 = f4048b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f4048b;
                if (dVar == null) {
                    dVar = new d();
                    f4048b = dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f4049a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f4049a);
        }
        return setUnmodifiableSet;
    }
}
