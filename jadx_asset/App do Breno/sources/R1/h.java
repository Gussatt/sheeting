package R1;

import R1.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O1.e f3351c;

    public static final class a implements P1.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final O1.e f3352d = new O1.e() { // from class: R1.g
            @Override // O1.b
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (O1.f) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f3353a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f3354b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public O1.e f3355c = f3352d;

        public static /* synthetic */ void b(Object obj, O1.f fVar) {
            throw new O1.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f3353a), new HashMap(this.f3354b), this.f3355c);
        }

        public a d(P1.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // P1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, O1.e eVar) {
            this.f3353a.put(cls, eVar);
            this.f3354b.remove(cls);
            return this;
        }
    }

    public h(Map map, Map map2, O1.e eVar) {
        this.f3349a = map;
        this.f3350b = map2;
        this.f3351c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f3349a, this.f3350b, this.f3351c).t(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
