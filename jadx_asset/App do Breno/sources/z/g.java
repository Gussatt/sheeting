package z;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f12066b;

        public a(int i4, b[] bVarArr) {
            this.f12065a = i4;
            this.f12066b = bVarArr;
        }

        public static a a(int i4, b[] bVarArr) {
            return new a(i4, bVarArr);
        }

        public b[] b() {
            return this.f12066b;
        }

        public int c() {
            return this.f12065a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f12067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f12070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f12071e;

        public b(Uri uri, int i4, int i5, boolean z3, int i6) {
            this.f12067a = (Uri) B.f.b(uri);
            this.f12068b = i4;
            this.f12069c = i5;
            this.f12070d = z3;
            this.f12071e = i6;
        }

        public static b a(Uri uri, int i4, int i5, boolean z3, int i6) {
            return new b(uri, i4, i5, z3, i6);
        }

        public int b() {
            return this.f12071e;
        }

        public int c() {
            return this.f12068b;
        }

        public Uri d() {
            return this.f12067a;
        }

        public int e() {
            return this.f12069c;
        }

        public boolean f() {
            return this.f12070d;
        }
    }

    public static class c {
        public abstract void a(int i4);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, e eVar, int i4, boolean z3, int i5, Handler handler, c cVar) {
        C1658a c1658a = new C1658a(cVar, handler);
        return z3 ? f.e(context, eVar, c1658a, i4, i5) : f.d(context, eVar, i4, null, c1658a);
    }
}
