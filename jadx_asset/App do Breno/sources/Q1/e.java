package Q1;

import O1.g;
import O1.h;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements O1.f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f2933a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2934b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f2935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f2936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f2937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O1.e f2938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2939g;

    public e(Writer writer, Map map, Map map2, O1.e eVar, boolean z3) {
        this.f2935c = new JsonWriter(writer);
        this.f2936d = map;
        this.f2937e = map2;
        this.f2938f = eVar;
        this.f2939g = z3;
    }

    @Override // O1.f
    public O1.f a(O1.d dVar, Object obj) {
        return p(dVar.b(), obj);
    }

    @Override // O1.f
    public O1.f b(O1.d dVar, boolean z3) {
        return q(dVar.b(), z3);
    }

    @Override // O1.f
    public O1.f e(O1.d dVar, int i4) {
        return n(dVar.b(), i4);
    }

    @Override // O1.f
    public O1.f f(O1.d dVar, long j4) {
        return o(dVar.b(), j4);
    }

    @Override // O1.f
    public O1.f g(O1.d dVar, double d4) {
        return m(dVar.b(), d4);
    }

    public e h(double d4) throws IOException {
        y();
        this.f2935c.value(d4);
        return this;
    }

    public e i(int i4) throws IOException {
        y();
        this.f2935c.value(i4);
        return this;
    }

    public e j(long j4) throws IOException {
        y();
        this.f2935c.value(j4);
        return this;
    }

    public e k(Object obj, boolean z3) {
        if (z3 && t(obj)) {
            throw new O1.c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f2935c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f2935c.value((Number) obj);
            return this;
        }
        int i4 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f2935c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    k(it.next(), false);
                }
                this.f2935c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f2935c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        p((String) key, entry.getValue());
                    } catch (ClassCastException e4) {
                        throw new O1.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                    }
                }
                this.f2935c.endObject();
                return this;
            }
            O1.e eVar = (O1.e) this.f2936d.get(obj.getClass());
            if (eVar != null) {
                return v(eVar, obj, z3);
            }
            g gVar = (g) this.f2937e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return v(this.f2938f, obj, z3);
            }
            if (obj instanceof f) {
                i(((f) obj).a());
                return this;
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return s((byte[]) obj);
        }
        this.f2935c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i4 < length) {
                this.f2935c.value(r6[i4]);
                i4++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i4 < length2) {
                j(jArr[i4]);
                i4++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i4 < length3) {
                this.f2935c.value(dArr[i4]);
                i4++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i4 < length4) {
                this.f2935c.value(zArr[i4]);
                i4++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                k(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                k(obj2, false);
            }
        }
        this.f2935c.endArray();
        return this;
    }

    @Override // O1.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e c(String str) throws IOException {
        y();
        this.f2935c.value(str);
        return this;
    }

    public e m(String str, double d4) throws IOException {
        y();
        this.f2935c.name(str);
        return h(d4);
    }

    public e n(String str, int i4) throws IOException {
        y();
        this.f2935c.name(str);
        return i(i4);
    }

    public e o(String str, long j4) throws IOException {
        y();
        this.f2935c.name(str);
        return j(j4);
    }

    public e p(String str, Object obj) {
        return this.f2939g ? x(str, obj) : w(str, obj);
    }

    public e q(String str, boolean z3) throws IOException {
        y();
        this.f2935c.name(str);
        return d(z3);
    }

    @Override // O1.h
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e d(boolean z3) throws IOException {
        y();
        this.f2935c.value(z3);
        return this;
    }

    public e s(byte[] bArr) throws IOException {
        y();
        if (bArr == null) {
            this.f2935c.nullValue();
            return this;
        }
        this.f2935c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean t(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void u() {
        y();
        this.f2935c.flush();
    }

    public e v(O1.e eVar, Object obj, boolean z3) throws IOException {
        if (!z3) {
            this.f2935c.beginObject();
        }
        eVar.a(obj, this);
        if (!z3) {
            this.f2935c.endObject();
        }
        return this;
    }

    public final e w(String str, Object obj) throws IOException {
        y();
        this.f2935c.name(str);
        if (obj != null) {
            return k(obj, false);
        }
        this.f2935c.nullValue();
        return this;
    }

    public final e x(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        y();
        this.f2935c.name(str);
        return k(obj, false);
    }

    public final void y() throws IOException {
        if (!this.f2934b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f2933a;
        if (eVar != null) {
            eVar.y();
            this.f2933a.f2934b = false;
            this.f2933a = null;
            this.f2935c.endObject();
        }
    }
}
