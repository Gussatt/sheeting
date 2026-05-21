package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;
import t0.C1538a;

/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f5509b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1538a f5511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f5512e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5508a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5510c = new WeakHashMap();

    public DistinctElementSidecarCallback(C1538a c1538a, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f5511d = c1538a;
        this.f5512e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f5508a) {
            try {
                if (this.f5511d.a(this.f5509b, sidecarDeviceState)) {
                    return;
                }
                this.f5509b = sidecarDeviceState;
                this.f5512e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f5508a) {
            try {
                if (this.f5511d.d((SidecarWindowLayoutInfo) this.f5510c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f5510c.put(iBinder, sidecarWindowLayoutInfo);
                this.f5512e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
