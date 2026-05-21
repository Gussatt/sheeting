package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0597t;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0591m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0591m f4830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0591m f4831c = new C0591m(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4832a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f4833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4834b;

        public a(Object obj, int i4) {
            this.f4833a = obj;
            this.f4834b = i4;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4833a == aVar.f4833a && this.f4834b == aVar.f4834b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f4833a) * 65535) + this.f4834b;
        }
    }

    public C0591m(boolean z3) {
    }

    public static C0591m b() {
        C0591m c0591mA;
        if (U.f4671d) {
            return f4831c;
        }
        C0591m c0591m = f4830b;
        if (c0591m != null) {
            return c0591m;
        }
        synchronized (C0591m.class) {
            try {
                c0591mA = f4830b;
                if (c0591mA == null) {
                    c0591mA = AbstractC0590l.a();
                    f4830b = c0591mA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0591mA;
    }

    public AbstractC0597t.c a(J j4, int i4) {
        i.d.a(this.f4832a.get(new a(j4, i4)));
        return null;
    }
}
