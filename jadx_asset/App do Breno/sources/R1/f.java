package R1;

import R1.d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f implements O1.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f3339f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O1.d f3340g = O1.d.a("key").b(R1.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O1.d f3341h = O1.d.a("value").b(R1.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O1.e f3342i = new O1.e() { // from class: R1.e
        @Override // O1.b
        public final void a(Object obj, Object obj2) {
            f.c((Map.Entry) obj, (O1.f) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f3343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f3345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O1.e f3346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f3347e = new i(this);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3348a;

        static {
            int[] iArr = new int[d.a.values().length];
            f3348a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3348a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3348a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map map, Map map2, O1.e eVar) {
        this.f3343a = outputStream;
        this.f3344b = map;
        this.f3345c = map2;
        this.f3346d = eVar;
    }

    public static /* synthetic */ void c(Map.Entry entry, O1.f fVar) {
        fVar.a(f3340g, entry.getKey());
        fVar.a(f3341h, entry.getValue());
    }

    public static ByteBuffer p(int i4) {
        return ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d u(O1.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2;
        }
        throw new O1.c("Field has no @Protobuf config");
    }

    public static int v(O1.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2.tag();
        }
        throw new O1.c("Field has no @Protobuf config");
    }

    @Override // O1.f
    public O1.f a(O1.d dVar, Object obj) {
        return i(dVar, obj, true);
    }

    public O1.f d(O1.d dVar, double d4, boolean z3) throws IOException {
        if (z3 && d4 == 0.0d) {
            return this;
        }
        w((v(dVar) << 3) | 1);
        this.f3343a.write(p(8).putDouble(d4).array());
        return this;
    }

    @Override // O1.f
    public O1.f g(O1.d dVar, double d4) {
        return d(dVar, d4, true);
    }

    public O1.f h(O1.d dVar, float f4, boolean z3) throws IOException {
        if (z3 && f4 == 0.0f) {
            return this;
        }
        w((v(dVar) << 3) | 5);
        this.f3343a.write(p(4).putFloat(f4).array());
        return this;
    }

    public O1.f i(O1.d dVar, Object obj, boolean z3) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    w((v(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f3339f);
                    w(bytes.length);
                    this.f3343a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    r(f3342i, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return d(dVar, ((Double) obj).doubleValue(), z3);
                }
                if (obj instanceof Float) {
                    return h(dVar, ((Float) obj).floatValue(), z3);
                }
                if (obj instanceof Number) {
                    return m(dVar, ((Number) obj).longValue(), z3);
                }
                if (obj instanceof Boolean) {
                    return o(dVar, ((Boolean) obj).booleanValue(), z3);
                }
                if (!(obj instanceof byte[])) {
                    O1.e eVar = (O1.e) this.f3344b.get(obj.getClass());
                    if (eVar != null) {
                        return r(eVar, dVar, obj, z3);
                    }
                    O1.g gVar = (O1.g) this.f3345c.get(obj.getClass());
                    return gVar != null ? s(gVar, dVar, obj, z3) : obj instanceof c ? e(dVar, ((c) obj).a()) : obj instanceof Enum ? e(dVar, ((Enum) obj).ordinal()) : r(this.f3346d, dVar, obj, z3);
                }
                byte[] bArr = (byte[]) obj;
                if (!z3 || bArr.length != 0) {
                    w((v(dVar) << 3) | 2);
                    w(bArr.length);
                    this.f3343a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // O1.f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f e(O1.d dVar, int i4) {
        return k(dVar, i4, true);
    }

    public f k(O1.d dVar, int i4, boolean z3) throws IOException {
        if (!z3 || i4 != 0) {
            d dVarU = u(dVar);
            int i5 = a.f3348a[dVarU.intEncoding().ordinal()];
            if (i5 == 1) {
                w(dVarU.tag() << 3);
                w(i4);
                return this;
            }
            if (i5 == 2) {
                w(dVarU.tag() << 3);
                w((i4 << 1) ^ (i4 >> 31));
                return this;
            }
            if (i5 == 3) {
                w((dVarU.tag() << 3) | 5);
                this.f3343a.write(p(4).putInt(i4).array());
                return this;
            }
        }
        return this;
    }

    @Override // O1.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f f(O1.d dVar, long j4) {
        return m(dVar, j4, true);
    }

    public f m(O1.d dVar, long j4, boolean z3) throws IOException {
        if (!z3 || j4 != 0) {
            d dVarU = u(dVar);
            int i4 = a.f3348a[dVarU.intEncoding().ordinal()];
            if (i4 == 1) {
                w(dVarU.tag() << 3);
                x(j4);
                return this;
            }
            if (i4 == 2) {
                w(dVarU.tag() << 3);
                x((j4 >> 63) ^ (j4 << 1));
                return this;
            }
            if (i4 == 3) {
                w((dVarU.tag() << 3) | 1);
                this.f3343a.write(p(8).putLong(j4).array());
                return this;
            }
        }
        return this;
    }

    @Override // O1.f
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public f b(O1.d dVar, boolean z3) {
        return o(dVar, z3, true);
    }

    public f o(O1.d dVar, boolean z3, boolean z4) {
        return k(dVar, z3 ? 1 : 0, z4);
    }

    public final long q(O1.e eVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f3343a;
            this.f3343a = bVar;
            try {
                eVar.a(obj, this);
                this.f3343a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th) {
                this.f3343a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final f r(O1.e eVar, O1.d dVar, Object obj, boolean z3) throws IOException {
        long jQ = q(eVar, obj);
        if (z3 && jQ == 0) {
            return this;
        }
        w((v(dVar) << 3) | 2);
        x(jQ);
        eVar.a(obj, this);
        return this;
    }

    public final f s(O1.g gVar, O1.d dVar, Object obj, boolean z3) {
        this.f3347e.b(dVar, z3);
        gVar.a(obj, this.f3347e);
        return this;
    }

    public f t(Object obj) {
        if (obj == null) {
            return this;
        }
        O1.e eVar = (O1.e) this.f3344b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        throw new O1.c("No encoder for " + obj.getClass());
    }

    public final void w(int i4) throws IOException {
        while ((i4 & (-128)) != 0) {
            this.f3343a.write((i4 & 127) | 128);
            i4 >>>= 7;
        }
        this.f3343a.write(i4 & 127);
    }

    public final void x(long j4) throws IOException {
        while (((-128) & j4) != 0) {
            this.f3343a.write((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        this.f3343a.write(((int) j4) & 127);
    }
}
