package com.google.firebase.sessions;

import L2.m;
import V1.h;
import W2.r;
import X2.g;
import X2.j;
import X2.l;
import android.content.Context;
import android.util.Log;
import c2.C0686l;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.b;
import h3.F;
import java.util.List;
import r1.C1509f;
import v1.InterfaceC1586a;
import v1.InterfaceC1587b;
import w1.C1604c;
import w1.E;
import w1.InterfaceC1605d;
import w1.q;
import z0.i;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final b Companion = new b(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    public static final String TAG = "FirebaseSessions";
    private static final E appContext;
    private static final E backgroundDispatcher;
    private static final E blockingDispatcher;
    private static final E firebaseApp;
    private static final E firebaseInstallationsApi;
    private static final E firebaseSessionsComponent;
    private static final E transportFactory;

    public /* synthetic */ class a extends j implements r {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f7078v = new a();

        public a() {
            super(4, O.a.class, "preferencesDataStore", "preferencesDataStore(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/properties/ReadOnlyProperty;", 1);
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public b() {
        }
    }

    static {
        E eB = E.b(Context.class);
        l.d(eB, "unqualified(Context::class.java)");
        appContext = eB;
        E eB2 = E.b(C1509f.class);
        l.d(eB2, "unqualified(FirebaseApp::class.java)");
        firebaseApp = eB2;
        E eB3 = E.b(h.class);
        l.d(eB3, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = eB3;
        E eA = E.a(InterfaceC1586a.class, F.class);
        l.d(eA, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = eA;
        E eA2 = E.a(InterfaceC1587b.class, F.class);
        l.d(eA2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = eA2;
        E eB4 = E.b(i.class);
        l.d(eB4, "unqualified(TransportFactory::class.java)");
        transportFactory = eB4;
        E eB5 = E.b(com.google.firebase.sessions.b.class);
        l.d(eB5, "unqualified(FirebaseSessionsComponent::class.java)");
        firebaseSessionsComponent = eB5;
        try {
            a.f7078v.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w(TAG, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0686l getComponents$lambda$0(InterfaceC1605d interfaceC1605d) {
        return ((com.google.firebase.sessions.b) interfaceC1605d.f(firebaseSessionsComponent)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.b getComponents$lambda$1(InterfaceC1605d interfaceC1605d) {
        b.a aVarA = com.google.firebase.sessions.a.a();
        Object objF = interfaceC1605d.f(appContext);
        l.d(objF, "container[appContext]");
        b.a aVarG = aVarA.g((Context) objF);
        Object objF2 = interfaceC1605d.f(backgroundDispatcher);
        l.d(objF2, "container[backgroundDispatcher]");
        b.a aVarB = aVarG.b((N2.i) objF2);
        Object objF3 = interfaceC1605d.f(blockingDispatcher);
        l.d(objF3, "container[blockingDispatcher]");
        b.a aVarC = aVarB.c((N2.i) objF3);
        Object objF4 = interfaceC1605d.f(firebaseApp);
        l.d(objF4, "container[firebaseApp]");
        b.a aVarE = aVarC.e((C1509f) objF4);
        Object objF5 = interfaceC1605d.f(firebaseInstallationsApi);
        l.d(objF5, "container[firebaseInstallationsApi]");
        b.a aVarD = aVarE.d((h) objF5);
        U1.b bVarG = interfaceC1605d.g(transportFactory);
        l.d(bVarG, "container.getProvider(transportFactory)");
        return aVarD.f(bVarG).a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1604c> getComponents() {
        return m.i(C1604c.c(C0686l.class).g(LIBRARY_NAME).b(q.j(firebaseSessionsComponent)).e(new w1.g() { // from class: c2.n
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(interfaceC1605d);
            }
        }).d().c(), C1604c.c(com.google.firebase.sessions.b.class).g("fire-sessions-component").b(q.j(appContext)).b(q.j(backgroundDispatcher)).b(q.j(blockingDispatcher)).b(q.j(firebaseApp)).b(q.j(firebaseInstallationsApi)).b(q.l(transportFactory)).e(new w1.g() { // from class: c2.o
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(interfaceC1605d);
            }
        }).c(), a2.h.b(LIBRARY_NAME, "2.1.0"));
    }
}
