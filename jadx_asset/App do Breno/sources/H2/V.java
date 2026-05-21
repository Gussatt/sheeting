package H2;

import android.webkit.ConsoleMessage;

/* JADX INFO: loaded from: classes.dex */
public class V extends D0 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1898a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            f1898a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1898a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1898a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1898a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1898a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public V(O3 o32) {
        super(o32);
    }

    @Override // H2.D0
    public U c(ConsoleMessage consoleMessage) {
        int i4 = a.f1898a[consoleMessage.messageLevel().ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? U.f1886t : U.f1881o : U.f1882p : U.f1885s : U.f1883q : U.f1884r;
    }

    @Override // H2.D0
    public long d(ConsoleMessage consoleMessage) {
        return consoleMessage.lineNumber();
    }

    @Override // H2.D0
    public String e(ConsoleMessage consoleMessage) {
        return consoleMessage.message();
    }

    @Override // H2.D0
    public String h(ConsoleMessage consoleMessage) {
        return consoleMessage.sourceId();
    }
}
