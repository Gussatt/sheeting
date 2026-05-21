package f3;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7275a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f7276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f7277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f7278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f7279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f7280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f7281g;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        X2.l.d(charsetForName, "forName(...)");
        f7276b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        X2.l.d(charsetForName2, "forName(...)");
        f7277c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        X2.l.d(charsetForName3, "forName(...)");
        f7278d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        X2.l.d(charsetForName4, "forName(...)");
        f7279e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        X2.l.d(charsetForName5, "forName(...)");
        f7280f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        X2.l.d(charsetForName6, "forName(...)");
        f7281g = charsetForName6;
    }
}
