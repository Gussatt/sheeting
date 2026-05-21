package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0702b f6658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0702b f6659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6660c;

    public C0711c() {
        this.f6658a = new C0702b("", 0L, null);
        this.f6659b = new C0702b("", 0L, null);
        this.f6660c = new ArrayList();
    }

    public final C0702b a() {
        return this.f6658a;
    }

    public final C0702b b() {
        return this.f6659b;
    }

    public final List c() {
        return this.f6660c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C0711c c0711c = new C0711c(this.f6658a.clone());
        Iterator it = this.f6660c.iterator();
        while (it.hasNext()) {
            c0711c.f6660c.add(((C0702b) it.next()).clone());
        }
        return c0711c;
    }

    public final void d(C0702b c0702b) {
        this.f6658a = c0702b;
        this.f6659b = c0702b.clone();
        this.f6660c.clear();
    }

    public final void e(String str, long j4, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C0702b.d(str2, this.f6658a.c(str2), map.get(str2)));
        }
        this.f6660c.add(new C0702b(str, j4, map2));
    }

    public final void f(C0702b c0702b) {
        this.f6659b = c0702b;
    }

    public C0711c(C0702b c0702b) {
        this.f6658a = c0702b;
        this.f6659b = c0702b.clone();
        this.f6660c = new ArrayList();
    }
}
