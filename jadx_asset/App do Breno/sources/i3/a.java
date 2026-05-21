package i3;

import android.os.Looper;
import h3.B0;
import java.util.List;
import m3.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t {
    @Override // m3.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // m3.t
    public B0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // m3.t
    public int c() {
        return 1073741823;
    }
}
