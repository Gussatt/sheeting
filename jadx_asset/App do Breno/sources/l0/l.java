package l0;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f10164c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10166b;

    public static class a extends l {
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends l {
        public b(String str, String str2) {
            super(str, str2);
        }
    }

    public l(String str, String str2) {
        this.f10165a = str;
        this.f10166b = str2;
        f10164c.add(this);
    }
}
