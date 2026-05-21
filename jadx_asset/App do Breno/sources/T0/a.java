package T0;

import S0.C0506d;
import T0.f;
import U0.InterfaceC0520d;
import U0.InterfaceC0527k;
import V0.AbstractC0549h;
import V0.C0543b;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0073a f3461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f3462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3463c;

    /* JADX INFO: renamed from: T0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0073a extends e {
        public f a(Context context, Looper looper, C0543b c0543b, Object obj, f.a aVar, f.b bVar) {
            return b(context, looper, c0543b, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C0543b c0543b, Object obj, InterfaceC0520d interfaceC0520d, InterfaceC0527k interfaceC0527k) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {
    }

    public static abstract class e {
    }

    public interface f extends b {
        void a(a.e eVar);

        boolean b();

        Set c();

        void d(IAccountAccessor iAccountAccessor, Set set);

        void e(String str);

        boolean f();

        int g();

        boolean h();

        C0506d[] i();

        String j();

        String l();

        void m(a.c cVar);

        void n();

        boolean o();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0073a abstractC0073a, g gVar) {
        AbstractC0549h.k(abstractC0073a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC0549h.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f3463c = str;
        this.f3461a = abstractC0073a;
        this.f3462b = gVar;
    }

    public final AbstractC0073a a() {
        return this.f3461a;
    }

    public final String b() {
        return this.f3463c;
    }
}
