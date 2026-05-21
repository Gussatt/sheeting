package c2;

import android.util.Log;
import z0.C1661b;

/* JADX INFO: renamed from: c2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0681g implements InterfaceC0682h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6067b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1.b f6068a;

    /* JADX INFO: renamed from: c2.g$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public C0681g(U1.b bVar) {
        X2.l.e(bVar, "transportFactoryProvider");
        this.f6068a = bVar;
    }

    @Override // c2.InterfaceC0682h
    public void a(y yVar) {
        X2.l.e(yVar, "sessionEvent");
        ((z0.i) this.f6068a.get()).a("FIREBASE_APPQUALITY_SESSION", y.class, C1661b.b("json"), new z0.g() { // from class: c2.f
            @Override // z0.g
            public final Object apply(Object obj) {
                return this.f6066a.c((y) obj);
            }
        }).b(z0.c.f(yVar));
    }

    public final byte[] c(y yVar) {
        String strA = z.f6146a.c().a(yVar);
        X2.l.d(strA, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event Type: " + yVar.b().name());
        byte[] bytes = strA.getBytes(f3.c.f7276b);
        X2.l.d(bytes, "getBytes(...)");
        return bytes;
    }
}
