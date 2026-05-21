package V0;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l1.C1382a;
import p.C1476b;

/* JADX INFO: renamed from: V0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0543b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f3662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f3663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f3664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f3665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f3667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1382a f3670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f3671j;

    /* JADX INFO: renamed from: V0.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f3672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1476b f3673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f3675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C1382a f3676e = C1382a.f10235j;

        public C0543b a() {
            return new C0543b(this.f3672a, this.f3673b, null, 0, null, this.f3674c, this.f3675d, this.f3676e, false);
        }

        public a b(String str) {
            this.f3674c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f3673b == null) {
                this.f3673b = new C1476b();
            }
            this.f3673b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f3672a = account;
            return this;
        }

        public final a e(String str) {
            this.f3675d = str;
            return this;
        }
    }

    public C0543b(Account account, Set set, Map map, int i4, View view, String str, String str2, C1382a c1382a, boolean z3) {
        this.f3662a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f3663b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f3665d = map;
        this.f3667f = view;
        this.f3666e = i4;
        this.f3668g = str;
        this.f3669h = str2;
        this.f3670i = c1382a == null ? C1382a.f10235j : c1382a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            i.d.a(it.next());
            throw null;
        }
        this.f3664c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f3662a;
    }

    public Account b() {
        Account account = this.f3662a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f3664c;
    }

    public String d() {
        return this.f3668g;
    }

    public Set e() {
        return this.f3663b;
    }

    public final C1382a f() {
        return this.f3670i;
    }

    public final Integer g() {
        return this.f3671j;
    }

    public final String h() {
        return this.f3669h;
    }

    public final void i(Integer num) {
        this.f3671j = num;
    }
}
