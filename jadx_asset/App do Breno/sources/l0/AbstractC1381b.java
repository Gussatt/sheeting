package l0;

import android.webkit.WebResourceError;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1381b {
    public static CharSequence a(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int b(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
