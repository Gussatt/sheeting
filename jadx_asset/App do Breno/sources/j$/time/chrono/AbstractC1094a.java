package j$.time.chrono;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1094a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f8324a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f8325b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8326c = 0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return q().compareTo(((m) obj).q());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    static m p(AbstractC1094a abstractC1094a, String str) {
        String strI;
        m mVar = (m) f8324a.putIfAbsent(str, abstractC1094a);
        if (mVar == null && (strI = abstractC1094a.I()) != null) {
            f8325b.putIfAbsent(strI, abstractC1094a);
        }
        return mVar;
    }

    static m o(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = f8324a;
            m mVar = (m) concurrentHashMap.get(str);
            if (mVar == null) {
                mVar = (m) f8325b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (m mVar2 : ServiceLoader.load(m.class)) {
                    if (str.equals(mVar2.q()) || str.equals(mVar2.I())) {
                        return mVar2;
                    }
                }
                throw new j$.time.a("Unknown chronology: ".concat(str));
            }
            p pVar = p.f8342m;
            p(pVar, pVar.q());
            w wVar = w.f8361d;
            p(wVar, wVar.q());
            B b4 = B.f8313d;
            p(b4, b4.q());
            H h4 = H.f8320d;
            p(h4, h4.q());
            try {
                for (AbstractC1094a abstractC1094a : Arrays.asList(new AbstractC1094a[0])) {
                    if (!abstractC1094a.q().equals("ISO")) {
                        p(abstractC1094a, abstractC1094a.q());
                    }
                }
                t tVar = t.f8358d;
                p(tVar, tVar.q());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    protected AbstractC1094a() {
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1094a) && q().compareTo(((AbstractC1094a) obj).q()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ q().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return q();
    }
}
