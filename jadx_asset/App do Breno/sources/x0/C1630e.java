package x0;

import android.os.Build;
import x0.AbstractC1628c;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1630e implements AbstractC1628c.b {
    @Override // x0.AbstractC1628c.b
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // x0.AbstractC1628c.b
    public String b(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // x0.AbstractC1628c.b
    public void c(String str) {
        System.loadLibrary(str);
    }

    @Override // x0.AbstractC1628c.b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !AbstractC1631f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // x0.AbstractC1628c.b
    public void e(String str) {
        System.load(str);
    }
}
