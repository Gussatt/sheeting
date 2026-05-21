package e3;

import X2.l;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends d {

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f7191a;

        public a(Iterator it) {
            this.f7191a = it;
        }

        @Override // e3.b
        public Iterator iterator() {
            return this.f7191a;
        }
    }

    public static b a(Iterator it) {
        l.e(it, "<this>");
        return b(new a(it));
    }

    public static final b b(b bVar) {
        l.e(bVar, "<this>");
        return bVar instanceof e3.a ? bVar : new e3.a(bVar);
    }
}
