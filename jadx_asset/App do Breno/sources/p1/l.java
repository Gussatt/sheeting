package p1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o1.AbstractC1469f;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    public class a extends z {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f10947m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Object f10948n;

        public a(Object obj) {
            this.f10948n = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f10947m;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f10947m) {
                throw new NoSuchElementException();
            }
            this.f10947m = true;
            return this.f10948n;
        }
    }

    public static boolean a(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC1469f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static z b(Object obj) {
        return new a(obj);
    }
}
