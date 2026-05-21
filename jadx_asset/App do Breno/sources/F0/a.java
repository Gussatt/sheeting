package F0;

import C0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1011e = new C0014a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f1014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1015d;

    /* JADX INFO: renamed from: F0.a$a, reason: collision with other inner class name */
    public static final class C0014a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f1016a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f1017b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f1018c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1019d = "";

        public C0014a a(d dVar) {
            this.f1017b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f1016a, Collections.unmodifiableList(this.f1017b), this.f1018c, this.f1019d);
        }

        public C0014a c(String str) {
            this.f1019d = str;
            return this;
        }

        public C0014a d(b bVar) {
            this.f1018c = bVar;
            return this;
        }

        public C0014a e(f fVar) {
            this.f1016a = fVar;
            return this;
        }
    }

    public a(f fVar, List list, b bVar, String str) {
        this.f1012a = fVar;
        this.f1013b = list;
        this.f1014c = bVar;
        this.f1015d = str;
    }

    public static C0014a e() {
        return new C0014a();
    }

    public String a() {
        return this.f1015d;
    }

    public b b() {
        return this.f1014c;
    }

    public List c() {
        return this.f1013b;
    }

    public f d() {
        return this.f1012a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
