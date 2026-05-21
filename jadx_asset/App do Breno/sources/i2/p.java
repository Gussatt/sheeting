package i2;

/* JADX INFO: loaded from: classes.dex */
public interface p {

    public class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f7704a;

        public a(k kVar) {
            this.f7704a = kVar;
        }

        @Override // i2.l
        public int a() {
            return this.f7704a.f7682c;
        }

        @Override // i2.l
        public boolean b() {
            return this.f7704a.F();
        }
    }

    static p b(String str, int i4, int i5) {
        return i4 == 1 ? new t(str, i5) : new r(str, i4, i5);
    }

    void a();

    void c();

    void d(m mVar);

    default void e(k kVar, Runnable runnable) {
        d(new m(kVar == null ? null : new a(kVar), runnable));
    }
}
