package T1;

import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import org.json.JSONArray;
import org.json.JSONObject;
import r1.C1509f;
import v1.InterfaceC1586a;
import w1.C1604c;
import w1.E;
import w1.InterfaceC1605d;
import w1.q;

/* JADX INFO: loaded from: classes.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1.b f3489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U1.b f3491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f3492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f3493e;

    public f(final Context context, final String str, Set set, U1.b bVar, Executor executor) {
        this(new U1.b() { // from class: T1.c
            @Override // U1.b
            public final Object get() {
                return f.c(context, str);
            }
        }, set, executor, bVar, context);
    }

    public static /* synthetic */ String b(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                k kVar = (k) fVar.f3489a.get();
                List listC = kVar.c();
                kVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i4 = 0; i4 < listC.size(); i4++) {
                    l lVar = (l) listC.get(i4);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) lVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static /* synthetic */ k c(Context context, String str) {
        return new k(context, str);
    }

    public static /* synthetic */ f d(E e4, InterfaceC1605d interfaceC1605d) {
        return new f((Context) interfaceC1605d.a(Context.class), ((C1509f) interfaceC1605d.a(C1509f.class)).s(), interfaceC1605d.b(g.class), interfaceC1605d.e(a2.i.class), (Executor) interfaceC1605d.f(e4));
    }

    public static /* synthetic */ Void e(f fVar) {
        synchronized (fVar) {
            ((k) fVar.f3489a.get()).g(System.currentTimeMillis(), ((a2.i) fVar.f3491c.get()).a());
        }
        return null;
    }

    public static C1604c f() {
        final E eA = E.a(InterfaceC1586a.class, Executor.class);
        return C1604c.d(f.class, i.class, j.class).b(q.i(Context.class)).b(q.i(C1509f.class)).b(q.m(g.class)).b(q.k(a2.i.class)).b(q.j(eA)).e(new w1.g() { // from class: T1.b
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return f.d(eA, interfaceC1605d);
            }
        }).c();
    }

    @Override // T1.i
    public AbstractC1445l a() {
        return !y.k.a(this.f3490b) ? AbstractC1448o.e("") : AbstractC1448o.c(this.f3493e, new Callable() { // from class: T1.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.b(this.f3487a);
            }
        });
    }

    public AbstractC1445l g() {
        return this.f3492d.size() <= 0 ? AbstractC1448o.e(null) : !y.k.a(this.f3490b) ? AbstractC1448o.e(null) : AbstractC1448o.c(this.f3493e, new Callable() { // from class: T1.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.e(this.f3488a);
            }
        });
    }

    public f(U1.b bVar, Set set, Executor executor, U1.b bVar2, Context context) {
        this.f3489a = bVar;
        this.f3492d = set;
        this.f3493e = executor;
        this.f3491c = bVar2;
        this.f3490b = context;
    }
}
