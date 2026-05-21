package H2;

import android.webkit.WebChromeClient;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: H2.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0317e0 extends S0 {
    public C0317e0(O3 o32) {
        super(o32);
    }

    @Override // H2.S0
    public List b(WebChromeClient.FileChooserParams fileChooserParams) {
        return Arrays.asList(fileChooserParams.getAcceptTypes());
    }

    @Override // H2.S0
    public String c(WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.getFilenameHint();
    }

    @Override // H2.S0
    public boolean e(WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.isCaptureEnabled();
    }

    @Override // H2.S0
    public EnumC0310d0 f(WebChromeClient.FileChooserParams fileChooserParams) {
        int mode = fileChooserParams.getMode();
        return mode != 0 ? mode != 1 ? mode != 3 ? EnumC0310d0.f2023r : EnumC0310d0.f2022q : EnumC0310d0.f2021p : EnumC0310d0.f2020o;
    }
}
