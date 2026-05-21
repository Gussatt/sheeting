package l0;

import android.content.pm.PackageInfo;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }
}
