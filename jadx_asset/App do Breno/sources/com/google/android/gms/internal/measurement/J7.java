package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class J7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f6378a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f6379b = new TreeMap();

    public static final int c(U1 u12, C0831q c0831q, r rVar) {
        r rVarA = c0831q.a(u12, Collections.singletonList(rVar));
        if (rVarA instanceof C0774j) {
            return AbstractC0873v2.b(rVarA.f().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i4, C0831q c0831q, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f6379b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f6378a;
        }
        if (treeMap.containsKey(Integer.valueOf(i4))) {
            i4 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i4), c0831q);
    }

    public final void b(U1 u12, C0711c c0711c) {
        C0883w4 c0883w4 = new C0883w4(c0711c);
        TreeMap treeMap = this.f6378a;
        for (Integer num : treeMap.keySet()) {
            C0702b c0702bClone = c0711c.b().clone();
            int iC = c(u12, (C0831q) treeMap.get(num), c0883w4);
            if (iC == 2 || iC == -1) {
                c0711c.f(c0702bClone);
            }
        }
        TreeMap treeMap2 = this.f6379b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(u12, (C0831q) treeMap2.get((Integer) it.next()), c0883w4);
        }
    }
}
