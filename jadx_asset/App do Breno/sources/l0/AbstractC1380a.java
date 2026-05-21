package l0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1380a implements l0.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f10157c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10159b;

    /* JADX INFO: renamed from: l0.a$a, reason: collision with other inner class name */
    public static class C0136a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Set f10160a = new HashSet(Arrays.asList(o.d().a()));
    }

    /* JADX INFO: renamed from: l0.a$b */
    public static class b extends AbstractC1380a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l0.a$c */
    public static class c extends AbstractC1380a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l0.a$d */
    public static class d extends AbstractC1380a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public final boolean c() {
            return false;
        }
    }

    /* JADX INFO: renamed from: l0.a$e */
    public static class e extends AbstractC1380a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: renamed from: l0.a$f */
    public static class f extends AbstractC1380a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: renamed from: l0.a$g */
    public static class g extends AbstractC1380a {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: renamed from: l0.a$h */
    public static class h extends AbstractC1380a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: renamed from: l0.a$i */
    public static class i extends AbstractC1380a {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // l0.AbstractC1380a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public AbstractC1380a(String str, String str2) {
        this.f10158a = str;
        this.f10159b = str2;
        f10157c.add(this);
    }

    public static Set e() {
        return Collections.unmodifiableSet(f10157c);
    }

    @Override // l0.i
    public boolean a() {
        return c() || d();
    }

    @Override // l0.i
    public String b() {
        return this.f10158a;
    }

    public abstract boolean c();

    public boolean d() {
        return v3.a.b(C0136a.f10160a, this.f10159b);
    }
}
