package com.google.firebase.installations;

import T1.i;
import V1.g;
import V1.h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import r1.C1509f;
import v1.InterfaceC1586a;
import v1.InterfaceC1587b;
import w1.C1604c;
import w1.E;
import w1.InterfaceC1605d;
import w1.q;
import x1.z;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ h a(InterfaceC1605d interfaceC1605d) {
        return new g((C1509f) interfaceC1605d.a(C1509f.class), interfaceC1605d.e(i.class), (ExecutorService) interfaceC1605d.f(E.a(InterfaceC1586a.class, ExecutorService.class)), z.a((Executor) interfaceC1605d.f(E.a(InterfaceC1587b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1604c> getComponents() {
        return Arrays.asList(C1604c.c(h.class).g(LIBRARY_NAME).b(q.i(C1509f.class)).b(q.h(i.class)).b(q.j(E.a(InterfaceC1586a.class, ExecutorService.class))).b(q.j(E.a(InterfaceC1587b.class, Executor.class))).e(new w1.g() { // from class: V1.j
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return FirebaseInstallationsRegistrar.a(interfaceC1605d);
            }
        }).c(), T1.h.a(), a2.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
