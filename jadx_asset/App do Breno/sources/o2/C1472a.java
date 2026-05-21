package o2;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import l2.AbstractC1388b;
import l2.C1387a;
import w2.C1623p;
import w2.InterfaceC1609b;

/* JADX INFO: renamed from: o2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1472a implements InterfaceC1609b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f10754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f10755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1474c f10757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1609b f10758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1609b.a f10761h;

    /* JADX INFO: renamed from: o2.a$a, reason: collision with other inner class name */
    public class C0146a implements InterfaceC1609b.a {
        public C0146a() {
        }

        @Override // w2.InterfaceC1609b.a
        public void a(ByteBuffer byteBuffer, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
            C1472a.this.f10760g = C1623p.f11897b.b(byteBuffer);
            C1472a.g(C1472a.this);
        }
    }

    /* JADX INFO: renamed from: o2.a$c */
    public static class c implements InterfaceC1609b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1474c f10766a;

        public /* synthetic */ c(C1474c c1474c, C0146a c0146a) {
            this(c1474c);
        }

        @Override // w2.InterfaceC1609b
        public InterfaceC1609b.c a(InterfaceC1609b.d dVar) {
            return this.f10766a.a(dVar);
        }

        @Override // w2.InterfaceC1609b
        public void c(String str, ByteBuffer byteBuffer, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
            this.f10766a.c(str, byteBuffer, interfaceC0184b);
        }

        @Override // w2.InterfaceC1609b
        public void d(String str, InterfaceC1609b.a aVar, InterfaceC1609b.c cVar) {
            this.f10766a.d(str, aVar, cVar);
        }

        @Override // w2.InterfaceC1609b
        public void e(String str, ByteBuffer byteBuffer) {
            this.f10766a.c(str, byteBuffer, null);
        }

        @Override // w2.InterfaceC1609b
        public void h(String str, InterfaceC1609b.a aVar) {
            this.f10766a.h(str, aVar);
        }

        public c(C1474c c1474c) {
            this.f10766a = c1474c;
        }
    }

    /* JADX INFO: renamed from: o2.a$d */
    public interface d {
    }

    public C1472a(FlutterJNI flutterJNI, AssetManager assetManager, long j4) {
        this.f10759f = false;
        C0146a c0146a = new C0146a();
        this.f10761h = c0146a;
        this.f10754a = flutterJNI;
        this.f10755b = assetManager;
        this.f10756c = j4;
        C1474c c1474c = new C1474c(flutterJNI);
        this.f10757d = c1474c;
        c1474c.h("flutter/isolate", c0146a);
        this.f10758e = new c(c1474c, null);
        if (flutterJNI.isAttached()) {
            this.f10759f = true;
        }
    }

    public static /* synthetic */ d g(C1472a c1472a) {
        c1472a.getClass();
        return null;
    }

    @Override // w2.InterfaceC1609b
    public InterfaceC1609b.c a(InterfaceC1609b.d dVar) {
        return this.f10758e.a(dVar);
    }

    @Override // w2.InterfaceC1609b
    public void c(String str, ByteBuffer byteBuffer, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
        this.f10758e.c(str, byteBuffer, interfaceC0184b);
    }

    @Override // w2.InterfaceC1609b
    public void d(String str, InterfaceC1609b.a aVar, InterfaceC1609b.c cVar) {
        this.f10758e.d(str, aVar, cVar);
    }

    @Override // w2.InterfaceC1609b
    public void e(String str, ByteBuffer byteBuffer) {
        this.f10758e.e(str, byteBuffer);
    }

    @Override // w2.InterfaceC1609b
    public void h(String str, InterfaceC1609b.a aVar) {
        this.f10758e.h(str, aVar);
    }

    public void i(b bVar, List list) {
        if (this.f10759f) {
            AbstractC1388b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        I2.e eVarG = I2.e.g("DartExecutor#executeDartEntrypoint");
        try {
            AbstractC1388b.f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f10754a.runBundleAndSnapshotFromLibrary(bVar.f10763a, bVar.f10765c, bVar.f10764b, this.f10755b, list, this.f10756c);
            this.f10759f = true;
            if (eVarG != null) {
                eVarG.close();
            }
        } finally {
        }
    }

    public boolean j() {
        return this.f10759f;
    }

    public void k() {
        if (this.f10754a.isAttached()) {
            this.f10754a.notifyLowMemoryWarning();
        }
    }

    public void l() {
        AbstractC1388b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f10754a.setPlatformMessageHandler(this.f10757d);
    }

    public void m() {
        AbstractC1388b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f10754a.setPlatformMessageHandler(null);
    }

    /* JADX INFO: renamed from: o2.a$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10765c;

        public b(String str, String str2) {
            this.f10763a = str;
            this.f10764b = null;
            this.f10765c = str2;
        }

        public static b a() {
            q2.d dVarC = C1387a.e().c();
            if (dVarC.m()) {
                return new b(dVarC.g(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f10763a.equals(bVar.f10763a)) {
                return this.f10765c.equals(bVar.f10765c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f10763a.hashCode() * 31) + this.f10765c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f10763a + ", function: " + this.f10765c + " )";
        }

        public b(String str, String str2, String str3) {
            this.f10763a = str;
            this.f10764b = str2;
            this.f10765c = str3;
        }
    }
}
