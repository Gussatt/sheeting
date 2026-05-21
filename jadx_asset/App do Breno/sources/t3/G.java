package t3;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f11358a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        X2.l.e(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? f3.q.x(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final Q b(File file) {
        X2.l.e(file, "<this>");
        return new C1555k(new FileInputStream(file), S.f11386b);
    }
}
