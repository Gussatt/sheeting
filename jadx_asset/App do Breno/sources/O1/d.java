package O1;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2862b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f2864b = null;

        public b(String str) {
            this.f2863a = str;
        }

        public d a() {
            return new d(this.f2863a, this.f2864b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f2864b)));
        }

        public b b(Annotation annotation) {
            if (this.f2864b == null) {
                this.f2864b = new HashMap();
            }
            this.f2864b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static d d(String str) {
        return new d(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f2861a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f2862b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2861a.equals(dVar.f2861a) && this.f2862b.equals(dVar.f2862b);
    }

    public int hashCode() {
        return (this.f2861a.hashCode() * 31) + this.f2862b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f2861a + ", properties=" + this.f2862b.values() + "}";
    }

    public d(String str, Map map) {
        this.f2861a = str;
        this.f2862b = map;
    }
}
