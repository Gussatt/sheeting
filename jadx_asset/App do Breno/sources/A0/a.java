package A0;

import C0.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f11e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f12f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f13g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f14h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f9c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f10d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f11e = strA3;
        f12f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C1661b.b("proto"), C1661b.b("json"))));
        f13g = new a(strA, null);
        f14h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f15a = str;
        this.f16b = str2;
    }

    public static a d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // C0.g
    public Set a() {
        return f12f;
    }

    @Override // C0.f
    public byte[] b() {
        return c();
    }

    public byte[] c() {
        String str = this.f16b;
        if (str == null && this.f15a == null) {
            return null;
        }
        String str2 = this.f15a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String e() {
        return this.f16b;
    }

    public String f() {
        return this.f15a;
    }

    @Override // C0.f
    public String getName() {
        return "cct";
    }
}
