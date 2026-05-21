package com.google.firebase.concurrent;

import U1.b;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import v1.InterfaceC1586a;
import v1.InterfaceC1587b;
import v1.InterfaceC1588c;
import v1.InterfaceC1589d;
import w1.C1604c;
import w1.E;
import w1.InterfaceC1605d;
import w1.g;
import w1.w;
import x1.ThreadFactoryC1635b;
import x1.o;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f7065a = new w(new b() { // from class: x1.r
        @Override // U1.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f7066b = new w(new b() { // from class: x1.s
        @Override // U1.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f7067c = new w(new b() { // from class: x1.t
        @Override // U1.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f7068d = new w(new b() { // from class: x1.u
        @Override // U1.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(InterfaceC1605d interfaceC1605d) {
        return (ScheduledExecutorService) f7066b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(InterfaceC1605d interfaceC1605d) {
        return (ScheduledExecutorService) f7067c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(InterfaceC1605d interfaceC1605d) {
        return (ScheduledExecutorService) f7065a.get();
    }

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i4 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i4 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i4) {
        return new ThreadFactoryC1635b(str, i4, null);
    }

    public static ThreadFactory k(String str, int i4, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC1635b(str, i4, threadPolicy);
    }

    public static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f7068d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1604c.f(E.a(InterfaceC1586a.class, ScheduledExecutorService.class), E.a(InterfaceC1586a.class, ExecutorService.class), E.a(InterfaceC1586a.class, Executor.class)).e(new g() { // from class: x1.v
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return ExecutorsRegistrar.g(interfaceC1605d);
            }
        }).c(), C1604c.f(E.a(InterfaceC1587b.class, ScheduledExecutorService.class), E.a(InterfaceC1587b.class, ExecutorService.class), E.a(InterfaceC1587b.class, Executor.class)).e(new g() { // from class: x1.w
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return ExecutorsRegistrar.e(interfaceC1605d);
            }
        }).c(), C1604c.f(E.a(InterfaceC1588c.class, ScheduledExecutorService.class), E.a(InterfaceC1588c.class, ExecutorService.class), E.a(InterfaceC1588c.class, Executor.class)).e(new g() { // from class: x1.x
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return ExecutorsRegistrar.a(interfaceC1605d);
            }
        }).c(), C1604c.e(E.a(InterfaceC1589d.class, Executor.class)).e(new g() { // from class: x1.y
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return EnumC1633B.INSTANCE;
            }
        }).c());
    }
}
