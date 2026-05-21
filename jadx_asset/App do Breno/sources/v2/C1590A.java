package v2;

import java.util.HashMap;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1608a;
import w2.C1612e;

/* JADX INFO: renamed from: v2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1590A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1608a f11543a;

    public C1590A(C1472a c1472a) {
        this.f11543a = new C1608a(c1472a, "flutter/system", C1612e.f11877a);
    }

    public void a() {
        AbstractC1388b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap map = new HashMap(1);
        map.put("type", "memoryPressure");
        this.f11543a.c(map);
    }
}
