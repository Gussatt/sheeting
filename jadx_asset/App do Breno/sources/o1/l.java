package o1;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    public static class a implements k, Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final k f10747m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public volatile transient boolean f10748n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public transient Object f10749o;

        public a(k kVar) {
            this.f10747m = (k) AbstractC1471h.h(kVar);
        }

        @Override // o1.k
        public Object get() {
            if (!this.f10748n) {
                synchronized (this) {
                    try {
                        if (!this.f10748n) {
                            Object obj = this.f10747m.get();
                            this.f10749o = obj;
                            this.f10748n = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC1468e.a(this.f10749o);
        }

        public String toString() {
            Object string;
            if (this.f10748n) {
                String strValueOf = String.valueOf(this.f10749o);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            } else {
                string = this.f10747m;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class b implements k {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public volatile k f10750m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public volatile boolean f10751n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Object f10752o;

        public b(k kVar) {
            this.f10750m = (k) AbstractC1471h.h(kVar);
        }

        @Override // o1.k
        public Object get() {
            if (!this.f10751n) {
                synchronized (this) {
                    try {
                        if (!this.f10751n) {
                            k kVar = this.f10750m;
                            Objects.requireNonNull(kVar);
                            Object obj = kVar.get();
                            this.f10752o = obj;
                            this.f10751n = true;
                            this.f10750m = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return AbstractC1468e.a(this.f10752o);
        }

        public String toString() {
            Object string = this.f10750m;
            if (string == null) {
                String strValueOf = String.valueOf(this.f10752o);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static class c implements k, Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f10753m;

        public c(Object obj) {
            this.f10753m = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return AbstractC1469f.a(this.f10753m, ((c) obj).f10753m);
            }
            return false;
        }

        @Override // o1.k
        public Object get() {
            return this.f10753m;
        }

        public int hashCode() {
            return AbstractC1469f.b(this.f10753m);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f10753m);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static k a(k kVar) {
        return ((kVar instanceof b) || (kVar instanceof a)) ? kVar : kVar instanceof Serializable ? new a(kVar) : new b(kVar);
    }

    public static k b(Object obj) {
        return new c(obj);
    }
}
