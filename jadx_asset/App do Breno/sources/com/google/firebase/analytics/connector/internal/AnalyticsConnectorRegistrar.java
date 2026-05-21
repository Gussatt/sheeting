package com.google.firebase.analytics.connector.internal;

import S1.d;
import a2.h;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import r1.C1509f;
import t1.C1541b;
import t1.InterfaceC1540a;
import w1.C1604c;
import w1.InterfaceC1605d;
import w1.g;
import w1.q;

/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1604c> getComponents() {
        return Arrays.asList(C1604c.c(InterfaceC1540a.class).b(q.i(C1509f.class)).b(q.i(Context.class)).b(q.i(d.class)).e(new g() { // from class: u1.a
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return C1541b.c((C1509f) interfaceC1605d.a(C1509f.class), (Context) interfaceC1605d.a(Context.class), (S1.d) interfaceC1605d.a(S1.d.class));
            }
        }).d().c(), h.b("fire-analytics", "22.4.0"));
    }
}
