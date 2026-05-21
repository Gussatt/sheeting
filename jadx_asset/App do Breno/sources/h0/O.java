package h0;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public class O implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f7349a;

    public O(View view) {
        this.f7349a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof O) && ((O) obj).f7349a.equals(this.f7349a);
    }

    public int hashCode() {
        return this.f7349a.hashCode();
    }
}
