package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4631c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0.b f4632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f4633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k0.b f4634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f4635d;

        public a(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
            this.f4632a = bVar;
            this.f4633b = obj;
            this.f4634c = bVar2;
            this.f4635d = obj2;
        }
    }

    public C(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
        this.f4629a = new a(bVar, obj, bVar2, obj2);
        this.f4630b = obj;
        this.f4631c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C0595q.b(aVar.f4632a, 1, obj) + C0595q.b(aVar.f4634c, 2, obj2);
    }

    public static C d(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
        return new C(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC0587i abstractC0587i, a aVar, Object obj, Object obj2) {
        C0595q.u(abstractC0587i, aVar.f4632a, 1, obj);
        C0595q.u(abstractC0587i, aVar.f4634c, 2, obj2);
    }

    public int a(int i4, Object obj, Object obj2) {
        return AbstractC0587i.O(i4) + AbstractC0587i.y(b(this.f4629a, obj, obj2));
    }

    public a c() {
        return this.f4629a;
    }
}
