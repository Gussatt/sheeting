package B0;

import B0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(B0.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f175m;

        b(int i4) {
            this.f175m = i4;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract B0.a b();

    public abstract b c();
}
