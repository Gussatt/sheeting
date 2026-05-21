package com.google.firebase.crashlytics;

import D1.f;
import b2.InterfaceC0636a;
import com.google.firebase.components.ComponentRegistrar;
import d2.C0919a;
import d2.InterfaceC0920b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import r1.C1509f;
import t1.InterfaceC1540a;
import v1.InterfaceC1586a;
import v1.InterfaceC1587b;
import v1.InterfaceC1588c;
import w1.C1604c;
import w1.E;
import w1.InterfaceC1605d;
import w1.q;
import y1.h;
import z1.InterfaceC1662a;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f7069a = E.a(InterfaceC1586a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f7070b = E.a(InterfaceC1587b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f7071c = E.a(InterfaceC1588c.class, ExecutorService.class);

    static {
        C0919a.a(InterfaceC0920b.a.CRASHLYTICS);
    }

    public final h b(InterfaceC1605d interfaceC1605d) {
        f.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVarF = h.f((C1509f) interfaceC1605d.a(C1509f.class), (V1.h) interfaceC1605d.a(V1.h.class), interfaceC1605d.h(InterfaceC1662a.class), interfaceC1605d.h(InterfaceC1540a.class), interfaceC1605d.h(InterfaceC0636a.class), (ExecutorService) interfaceC1605d.f(this.f7069a), (ExecutorService) interfaceC1605d.f(this.f7070b), (ExecutorService) interfaceC1605d.f(this.f7071c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return hVarF;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1604c.c(h.class).g("fire-cls").b(q.i(C1509f.class)).b(q.i(V1.h.class)).b(q.j(this.f7069a)).b(q.j(this.f7070b)).b(q.j(this.f7071c)).b(q.a(InterfaceC1662a.class)).b(q.a(InterfaceC1540a.class)).b(q.a(InterfaceC0636a.class)).e(new w1.g() { // from class: y1.f
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return this.f12026a.b(interfaceC1605d);
            }
        }).d().c(), a2.h.b("fire-cls", "19.4.2"));
    }
}
