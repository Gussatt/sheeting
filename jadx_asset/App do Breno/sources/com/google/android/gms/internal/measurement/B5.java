package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class B5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B5 f6298c = new B5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f6300b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F5 f6299a = new C0797l5();

    public static B5 a() {
        return f6298c;
    }

    public final E5 b(Class cls) {
        AbstractC0717c5.c(cls, "messageType");
        ConcurrentMap concurrentMap = this.f6300b;
        E5 e5A = (E5) concurrentMap.get(cls);
        if (e5A == null) {
            e5A = this.f6299a.a(cls);
            AbstractC0717c5.c(cls, "messageType");
            E5 e5 = (E5) concurrentMap.putIfAbsent(cls, e5A);
            if (e5 != null) {
                return e5;
            }
        }
        return e5A;
    }
}
