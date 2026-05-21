package a3;

import X2.l;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a3.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f4052o = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // a3.a
    public Random c() {
        Object obj = this.f4052o.get();
        l.d(obj, "get(...)");
        return (Random) obj;
    }
}
