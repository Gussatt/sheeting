package f2;

import X2.l;
import android.content.Context;
import android.os.Bundle;
import f2.InterfaceC0958i;

/* JADX INFO: renamed from: f2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0951b implements InterfaceC0958i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7206b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f7207a;

    /* JADX INFO: renamed from: f2.b$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public C0951b(Context context) {
        l.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f7207a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // f2.InterfaceC0958i
    public Boolean a() {
        if (this.f7207a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f7207a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // f2.InterfaceC0958i
    public Double b() {
        if (this.f7207a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f7207a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // f2.InterfaceC0958i
    public Object c(N2.e eVar) {
        return InterfaceC0958i.a.a(this, eVar);
    }

    @Override // f2.InterfaceC0958i
    public g3.a d() {
        if (this.f7207a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return g3.a.f(g3.c.h(this.f7207a.getInt("firebase_sessions_sessions_restart_timeout"), g3.d.f7313q));
        }
        return null;
    }
}
