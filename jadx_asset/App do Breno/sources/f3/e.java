package f3;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f7288n = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Pattern f7289m;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public e(Pattern pattern) {
        X2.l.e(pattern, "nativePattern");
        this.f7289m = pattern;
    }

    public final String a(CharSequence charSequence, String str) {
        X2.l.e(charSequence, "input");
        X2.l.e(str, "replacement");
        String strReplaceAll = this.f7289m.matcher(charSequence).replaceAll(str);
        X2.l.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f7289m.toString();
        X2.l.d(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(String str) {
        X2.l.e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        X2.l.d(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
