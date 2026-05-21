package O;

import androidx.datastore.preferences.protobuf.AbstractC0597t;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.k0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0597t implements K {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private D preferences_ = D.g();

    public static final class a extends AbstractC0597t.a implements K {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a t(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            o();
            ((f) this.f4912n).Q().put(str, hVar);
            return this;
        }

        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C f2835a = C.d(k0.b.f4809w, "", k0.b.f4811y, h.Z());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0597t.L(f.class, fVar);
    }

    public static a U() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static f V(InputStream inputStream) {
        return (f) AbstractC0597t.J(DEFAULT_INSTANCE, inputStream);
    }

    public final Map Q() {
        return S();
    }

    public Map R() {
        return Collections.unmodifiableMap(T());
    }

    public final D S() {
        if (!this.preferences_.l()) {
            this.preferences_ = this.preferences_.o();
        }
        return this.preferences_;
    }

    public final D T() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0597t
    public final Object s(AbstractC0597t.d dVar, Object obj, Object obj2) {
        S bVar;
        e eVar = null;
        switch (e.f2834a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0597t.H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f2835a});
            case h.LONG_FIELD_NUMBER /* 4 */:
                return DEFAULT_INSTANCE;
            case h.STRING_FIELD_NUMBER /* 5 */:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (f.class) {
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
