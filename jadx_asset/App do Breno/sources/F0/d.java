package F0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f1037c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1039b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1040a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f1041b = new ArrayList();

        public d a() {
            return new d(this.f1040a, Collections.unmodifiableList(this.f1041b));
        }

        public a b(List list) {
            this.f1041b = list;
            return this;
        }

        public a c(String str) {
            this.f1040a = str;
            return this;
        }
    }

    public d(String str, List list) {
        this.f1038a = str;
        this.f1039b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f1039b;
    }

    public String b() {
        return this.f1038a;
    }
}
