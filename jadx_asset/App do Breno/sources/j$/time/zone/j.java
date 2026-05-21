package j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f8534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f8535b;

    protected abstract f b(String str);

    protected abstract Set c();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f8534a = copyOnWriteArrayList;
        f8535b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static f a(String str, boolean z3) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f8535b;
        j jVar = (j) concurrentHashMap.get(str);
        if (jVar != null) {
            return jVar.b(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new g("No time-zone data files registered");
        }
        throw new g("Unknown time-zone ID: ".concat(str));
    }

    public static void d(j jVar) {
        Objects.requireNonNull(jVar, "provider");
        synchronized (j.class) {
            try {
                for (String str : jVar.c()) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((j) f8535b.putIfAbsent(str, jVar)) != null) {
                        throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + jVar);
                    }
                }
                Collections.unmodifiableSet(new HashSet(f8535b.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        f8534a.add(jVar);
    }
}
