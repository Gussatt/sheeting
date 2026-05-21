package com.google.firebase.datatransport;

import A0.a;
import C0.u;
import M1.b;
import a2.h;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import w1.C1604c;
import w1.E;
import w1.InterfaceC1605d;
import w1.g;
import w1.q;
import z0.i;

/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(InterfaceC1605d interfaceC1605d) {
        u.f((Context) interfaceC1605d.a(Context.class));
        return u.c().g(a.f13g);
    }

    public static /* synthetic */ i b(InterfaceC1605d interfaceC1605d) {
        u.f((Context) interfaceC1605d.a(Context.class));
        return u.c().g(a.f14h);
    }

    public static /* synthetic */ i c(InterfaceC1605d interfaceC1605d) {
        u.f((Context) interfaceC1605d.a(Context.class));
        return u.c().g(a.f14h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1604c> getComponents() {
        return Arrays.asList(C1604c.c(i.class).g(LIBRARY_NAME).b(q.i(Context.class)).e(new g() { // from class: M1.c
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return TransportRegistrar.c(interfaceC1605d);
            }
        }).c(), C1604c.e(E.a(M1.a.class, i.class)).b(q.i(Context.class)).e(new g() { // from class: M1.d
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return TransportRegistrar.b(interfaceC1605d);
            }
        }).c(), C1604c.e(E.a(b.class, i.class)).b(q.i(Context.class)).e(new g() { // from class: M1.e
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return TransportRegistrar.a(interfaceC1605d);
            }
        }).c(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
