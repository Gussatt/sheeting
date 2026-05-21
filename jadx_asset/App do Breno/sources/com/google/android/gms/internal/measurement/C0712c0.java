package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0712c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0856t1 f6661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U1 f6662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0711c f6663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J7 f6664d;

    public C0712c0() {
        C0856t1 c0856t1 = new C0856t1();
        this.f6661a = c0856t1;
        this.f6662b = c0856t1.f6966b.a();
        this.f6663c = new C0711c();
        this.f6664d = new J7();
        c0856t1.f6968d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0712c0.b(this.f6645a);
            }
        });
        c0856t1.f6968d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.C
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new X3(this.f6304a.f6663c);
            }
        });
    }

    public static /* synthetic */ AbstractC0783k b(C0712c0 c0712c0) {
        return new F7(c0712c0.f6664d);
    }

    public final C0711c a() {
        return this.f6663c;
    }

    public final void c(C0850s3 c0850s3) throws C0903z0 {
        AbstractC0783k abstractC0783k;
        try {
            C0856t1 c0856t1 = this.f6661a;
            this.f6662b = c0856t1.f6966b.a();
            if (c0856t1.a(this.f6662b, (C0882w3[]) c0850s3.H().toArray(new C0882w3[0])) instanceof C0756h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C0835q3 c0835q3 : c0850s3.F().I()) {
                List listH = c0835q3.H();
                String strG = c0835q3.G();
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    r rVarA = c0856t1.a(this.f6662b, (C0882w3) it.next());
                    if (!(rVarA instanceof C0815o)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    U1 u12 = this.f6662b;
                    if (u12.h(strG)) {
                        r rVarD = u12.d(strG);
                        if (!(rVarD instanceof AbstractC0783k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strG)));
                        }
                        abstractC0783k = (AbstractC0783k) rVarD;
                    } else {
                        abstractC0783k = null;
                    }
                    if (abstractC0783k == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strG)));
                    }
                    abstractC0783k.a(this.f6662b, Collections.singletonList(rVarA));
                }
            }
        } catch (Throwable th) {
            throw new C0903z0(th);
        }
    }

    public final void d(String str, Callable callable) {
        this.f6661a.f6968d.a(str, callable);
    }

    public final boolean e(C0702b c0702b) throws C0903z0 {
        try {
            C0711c c0711c = this.f6663c;
            c0711c.d(c0702b);
            this.f6661a.f6967c.g("runtime.counter", new C0774j(Double.valueOf(0.0d)));
            this.f6664d.b(this.f6662b.a(), c0711c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new C0903z0(th);
        }
    }

    public final boolean f() {
        return !this.f6663c.c().isEmpty();
    }

    public final boolean g() {
        C0711c c0711c = this.f6663c;
        return !c0711c.b().equals(c0711c.a());
    }
}
