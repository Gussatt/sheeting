package t1;

import V0.AbstractC0549h;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0904z1;
import j1.C1109a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import r1.C1505b;
import r1.C1509f;
import t1.InterfaceC1540a;
import u1.AbstractC1580b;
import u1.f;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1541b implements InterfaceC1540a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile InterfaceC1540a f11353c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1109a f11354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11355b;

    /* JADX INFO: renamed from: t1.b$a */
    public class a implements InterfaceC1540a.InterfaceC0175a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1541b f11357b;

        public a(C1541b c1541b, String str) {
            this.f11356a = str;
            this.f11357b = c1541b;
        }
    }

    public C1541b(C1109a c1109a) {
        AbstractC0549h.j(c1109a);
        this.f11354a = c1109a;
        this.f11355b = new ConcurrentHashMap();
    }

    public static InterfaceC1540a c(C1509f c1509f, Context context, S1.d dVar) {
        AbstractC0549h.j(c1509f);
        AbstractC0549h.j(context);
        AbstractC0549h.j(dVar);
        AbstractC0549h.j(context.getApplicationContext());
        if (f11353c == null) {
            synchronized (C1541b.class) {
                try {
                    if (f11353c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c1509f.y()) {
                            dVar.b(C1505b.class, new Executor() { // from class: t1.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new S1.b() { // from class: t1.d
                                @Override // S1.b
                                public final void a(S1.a aVar) {
                                    C1541b.d(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", c1509f.x());
                        }
                        f11353c = new C1541b(C0904z1.z(context, null, null, null, bundle).w());
                    }
                } finally {
                }
            }
        }
        return f11353c;
    }

    public static /* synthetic */ void d(S1.a aVar) {
        boolean z3 = ((C1505b) aVar.a()).f11191a;
        synchronized (C1541b.class) {
            ((C1541b) AbstractC0549h.j(f11353c)).f11354a.c(z3);
        }
    }

    @Override // t1.InterfaceC1540a
    public InterfaceC1540a.InterfaceC0175a a(String str, InterfaceC1540a.b bVar) {
        AbstractC0549h.j(bVar);
        if (AbstractC1580b.d(str) && !e(str)) {
            C1109a c1109a = this.f11354a;
            Object dVar = "fiam".equals(str) ? new u1.d(c1109a, bVar) : "clx".equals(str) ? new f(c1109a, bVar) : null;
            if (dVar != null) {
                this.f11355b.put(str, dVar);
                return new a(this, str);
            }
        }
        return null;
    }

    @Override // t1.InterfaceC1540a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (AbstractC1580b.d(str) && AbstractC1580b.b(str2, bundle) && AbstractC1580b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f11354a.a(str, str2, bundle);
        }
    }

    public final boolean e(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f11355b;
        return map.containsKey(str) && map.get(str) != null;
    }
}
