package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static o f8281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static b f8282f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterJNI f8284b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8283a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f8285c = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlutterJNI.b f8286d = new a();

    public class a implements FlutterJNI.b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j4) {
            Choreographer.getInstance().postFrameCallback(b(j4));
        }

        public final Choreographer.FrameCallback b(long j4) {
            if (o.this.f8285c == null) {
                return o.this.new c(j4);
            }
            o.this.f8285c.f8290a = j4;
            c cVar = o.this.f8285c;
            o.this.f8285c = null;
            return cVar;
        }
    }

    public class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DisplayManager f8288a;

        public b(DisplayManager displayManager) {
            this.f8288a = displayManager;
        }

        public void a() {
            this.f8288a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i4) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i4) {
            if (i4 == 0) {
                float refreshRate = this.f8288a.getDisplay(0).getRefreshRate();
                o.this.f8283a = (long) (1.0E9d / ((double) refreshRate));
                o.this.f8284b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i4) {
        }
    }

    public class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f8290a;

        public c(long j4) {
            this.f8290a = j4;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j4) {
            long jNanoTime = System.nanoTime() - j4;
            o.this.f8284b.onVsync(jNanoTime < 0 ? 0L : jNanoTime, o.this.f8283a, this.f8290a);
            o.this.f8285c = this;
        }
    }

    public o(FlutterJNI flutterJNI) {
        this.f8284b = flutterJNI;
    }

    public static o f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f8281e == null) {
            f8281e = new o(flutterJNI);
        }
        if (f8282f == null) {
            o oVar = f8281e;
            Objects.requireNonNull(oVar);
            b bVar = oVar.new b(displayManager);
            f8282f = bVar;
            bVar.a();
        }
        if (f8281e.f8283a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f8281e.f8283a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f8281e;
    }

    public void g() {
        this.f8284b.setAsyncWaitForVsyncDelegate(this.f8286d);
    }
}
