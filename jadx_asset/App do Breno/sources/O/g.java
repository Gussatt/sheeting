package O;

import androidx.datastore.preferences.protobuf.AbstractC0579a;
import androidx.datastore.preferences.protobuf.AbstractC0597t;
import androidx.datastore.preferences.protobuf.AbstractC0598u;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0597t implements K {
    private static final g DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC0598u.b strings_ = AbstractC0597t.t();

    public static final class a extends AbstractC0597t.a implements K {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a t(Iterable iterable) {
            o();
            ((g) this.f4912n).Q(iterable);
            return this;
        }

        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0597t.L(g.class, gVar);
    }

    public static g S() {
        return DEFAULT_INSTANCE;
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final void Q(Iterable iterable) {
        R();
        AbstractC0579a.e(iterable, this.strings_);
    }

    public final void R() {
        AbstractC0598u.b bVar = this.strings_;
        if (bVar.r()) {
            return;
        }
        this.strings_ = AbstractC0597t.F(bVar);
    }

    public List T() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0597t
    public final Object s(AbstractC0597t.d dVar, Object obj, Object obj2) {
        S bVar;
        e eVar = null;
        switch (e.f2834a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0597t.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case h.LONG_FIELD_NUMBER /* 4 */:
                return DEFAULT_INSTANCE;
            case h.STRING_FIELD_NUMBER /* 5 */:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (g.class) {
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
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case h.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
