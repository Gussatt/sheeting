package Q1;

import O1.g;
import O1.h;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d implements P1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O1.e f2923e = new O1.e() { // from class: Q1.a
        @Override // O1.b
        public final void a(Object obj, Object obj2) {
            d.c(obj, (O1.f) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f2924f = new g() { // from class: Q1.b
        @Override // O1.b
        public final void a(Object obj, Object obj2) {
            ((h) obj2).c((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f2925g = new g() { // from class: Q1.c
        @Override // O1.b
        public final void a(Object obj, Object obj2) {
            ((h) obj2).d(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f2926h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2927a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2928b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O1.e f2929c = f2923e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2930d = false;

    public class a implements O1.a {
        public a() {
        }

        @Override // O1.a
        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // O1.a
        public void b(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f2927a, d.this.f2928b, d.this.f2929c, d.this.f2930d);
            eVar.k(obj, false);
            eVar.u();
        }
    }

    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFormat f2932a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f2932a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        @Override // O1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, h hVar) {
            hVar.c(f2932a.format(date));
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f2924f);
        m(Boolean.class, f2925g);
        m(Date.class, f2926h);
    }

    public static /* synthetic */ void c(Object obj, O1.f fVar) {
        throw new O1.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public O1.a i() {
        return new a();
    }

    public d j(P1.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z3) {
        this.f2930d = z3;
        return this;
    }

    @Override // P1.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, O1.e eVar) {
        this.f2927a.put(cls, eVar);
        this.f2928b.remove(cls);
        return this;
    }

    public d m(Class cls, g gVar) {
        this.f2928b.put(cls, gVar);
        this.f2927a.remove(cls);
        return this;
    }
}
