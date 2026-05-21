package S0;

import V0.AbstractC0549h;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: S0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC0503a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3419a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f3420b = new LinkedBlockingQueue();

    public IBinder a(long j4, TimeUnit timeUnit) throws TimeoutException {
        AbstractC0549h.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f3419a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f3419a = true;
        IBinder iBinder = (IBinder) this.f3420b.poll(j4, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3420b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
