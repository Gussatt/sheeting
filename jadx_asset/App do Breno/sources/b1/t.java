package b1;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (k.h()) {
            StrictMode.setVmPolicy(s.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
