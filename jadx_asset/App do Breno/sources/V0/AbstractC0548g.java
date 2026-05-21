package V0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: V0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0548g {

    /* JADX INFO: renamed from: V0.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f3699b;

        public /* synthetic */ a(Object obj, H h4) {
            AbstractC0549h.j(obj);
            this.f3699b = obj;
            this.f3698a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC0549h.j(str);
            this.f3698a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3699b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f3698a.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append((String) this.f3698a.get(i4));
                if (i4 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
