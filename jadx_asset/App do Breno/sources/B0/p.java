package B0;

import B0.f;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(s sVar);

        public abstract a c(b bVar);
    }

    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final SparseArray f178p;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f180m;

        static {
            b bVar = NOT_SET;
            b bVar2 = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            f178p = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i4) {
            this.f180m = i4;
        }
    }

    public static a a() {
        return new f.b();
    }

    public abstract s b();

    public abstract b c();
}
