package b0;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;

/* JADX INFO: renamed from: b0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0619b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5538a = new a(null);

    /* JADX INFO: renamed from: b0.b$a */
    public static final class a {

        /* JADX INFO: renamed from: b0.b$a$a, reason: collision with other inner class name */
        public static final class C0107a extends X2.m implements W2.l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Context f5539n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0107a(Context context) {
                super(1);
                this.f5539n = context;
            }

            @Override // W2.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0621d k(Context context) {
                X2.l.e(context, "it");
                return new C0621d(this.f5539n);
            }
        }

        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final AbstractC0619b a(Context context) {
            X2.l.e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            Y.b bVar = Y.b.f3995a;
            sb.append(bVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (bVar.a() >= 5) {
                return new C0624g(context);
            }
            if (bVar.b() >= 9) {
                return (AbstractC0619b) Y.c.f3998a.a(context, "MeasurementManager", new C0107a(context));
            }
            return null;
        }

        public a() {
        }
    }

    public abstract Object a(AbstractC0618a abstractC0618a, N2.e eVar);

    public abstract Object b(N2.e eVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, N2.e eVar);

    public abstract Object d(AbstractC0630m abstractC0630m, N2.e eVar);

    public abstract Object e(Uri uri, N2.e eVar);

    public abstract Object f(AbstractC0631n abstractC0631n, N2.e eVar);

    public abstract Object g(AbstractC0632o abstractC0632o, N2.e eVar);
}
