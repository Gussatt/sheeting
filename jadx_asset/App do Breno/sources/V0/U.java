package V0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f3648a;

    public /* synthetic */ U(W w4, V v4) {
        this.f3648a = w4;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            synchronized (this.f3648a.f3649g) {
                try {
                    S s4 = (S) message.obj;
                    T t4 = (T) this.f3648a.f3649g.get(s4);
                    if (t4 != null && t4.i()) {
                        if (t4.j()) {
                            t4.g("GmsClientSupervisor");
                        }
                        this.f3648a.f3649g.remove(s4);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        synchronized (this.f3648a.f3649g) {
            try {
                S s5 = (S) message.obj;
                T t5 = (T) this.f3648a.f3649g.get(s5);
                if (t5 != null && t5.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(s5), new Exception());
                    ComponentName componentNameB = t5.b();
                    if (componentNameB == null) {
                        componentNameB = s5.a();
                    }
                    if (componentNameB == null) {
                        String strC = s5.c();
                        AbstractC0549h.j(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    t5.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
