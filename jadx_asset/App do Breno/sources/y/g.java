package y;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f11991a;

    public g(Object obj) {
        this.f11991a = (LocaleList) obj;
    }

    @Override // y.f
    public Object a() {
        return this.f11991a;
    }

    public boolean equals(Object obj) {
        return this.f11991a.equals(((f) obj).a());
    }

    @Override // y.f
    public Locale get(int i4) {
        return this.f11991a.get(i4);
    }

    public int hashCode() {
        return this.f11991a.hashCode();
    }

    public String toString() {
        return this.f11991a.toString();
    }
}
