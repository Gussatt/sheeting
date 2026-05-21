package O;

import O.g;
import androidx.datastore.preferences.protobuf.AbstractC0584f;
import androidx.datastore.preferences.protobuf.AbstractC0597t;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0597t implements K {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC0597t.a implements K {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a A(g.a aVar) {
            o();
            ((h) this.f4912n).p0((g) aVar.l());
            return this;
        }

        public a t(boolean z3) {
            o();
            ((h) this.f4912n).i0(z3);
            return this;
        }

        public a u(AbstractC0584f abstractC0584f) {
            o();
            ((h) this.f4912n).j0(abstractC0584f);
            return this;
        }

        public a v(double d4) {
            o();
            ((h) this.f4912n).k0(d4);
            return this;
        }

        public a w(float f4) {
            o();
            ((h) this.f4912n).l0(f4);
            return this;
        }

        public a x(int i4) {
            o();
            ((h) this.f4912n).m0(i4);
            return this;
        }

        public a y(long j4) {
            o();
            ((h) this.f4912n).n0(j4);
            return this;
        }

        public a z(String str) {
            o();
            ((h) this.f4912n).o0(str);
            return this;
        }

        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f2846m;

        b(int i4) {
            this.f2846m = i4;
        }

        public static b f(int i4) {
            switch (i4) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case h.LONG_FIELD_NUMBER /* 4 */:
                    return LONG;
                case h.STRING_FIELD_NUMBER /* 5 */:
                    return STRING;
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                    return STRING_SET;
                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                    return DOUBLE;
                case h.BYTES_FIELD_NUMBER /* 8 */:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0597t.L(h.class, hVar);
    }

    public static h Z() {
        return DEFAULT_INSTANCE;
    }

    public static a h0() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public boolean X() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC0584f Y() {
        return this.valueCase_ == 8 ? (AbstractC0584f) this.value_ : AbstractC0584f.f4709n;
    }

    public double a0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float b0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int c0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long d0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String e0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g f0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.S();
    }

    public b g0() {
        return b.f(this.valueCase_);
    }

    public final void i0(boolean z3) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z3);
    }

    public final void j0(AbstractC0584f abstractC0584f) {
        abstractC0584f.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC0584f;
    }

    public final void k0(double d4) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d4);
    }

    public final void l0(float f4) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f4);
    }

    public final void m0(int i4) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i4);
    }

    public final void n0(long j4) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j4);
    }

    public final void o0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void p0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0597t
    public final Object s(AbstractC0597t.d dVar, Object obj, Object obj2) {
        S bVar;
        e eVar = null;
        switch (e.f2834a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0597t.H(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case LONG_FIELD_NUMBER /* 4 */:
                return DEFAULT_INSTANCE;
            case STRING_FIELD_NUMBER /* 5 */:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (h.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC0597t.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
