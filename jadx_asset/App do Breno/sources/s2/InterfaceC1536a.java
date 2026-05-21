package s2;

import android.content.Context;
import io.flutter.plugin.platform.InterfaceC1081m;
import io.flutter.view.TextureRegistry;
import w2.InterfaceC1609b;

/* JADX INFO: renamed from: s2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1536a {

    /* JADX INFO: renamed from: s2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0172a {
        String a(String str);
    }

    /* JADX INFO: renamed from: s2.a$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f11335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.flutter.embedding.engine.a f11336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC1609b f11337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextureRegistry f11338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC1081m f11339e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InterfaceC0172a f11340f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final io.flutter.embedding.engine.b f11341g;

        public b(Context context, io.flutter.embedding.engine.a aVar, InterfaceC1609b interfaceC1609b, TextureRegistry textureRegistry, InterfaceC1081m interfaceC1081m, InterfaceC0172a interfaceC0172a, io.flutter.embedding.engine.b bVar) {
            this.f11335a = context;
            this.f11336b = aVar;
            this.f11337c = interfaceC1609b;
            this.f11338d = textureRegistry;
            this.f11339e = interfaceC1081m;
            this.f11340f = interfaceC0172a;
            this.f11341g = bVar;
        }

        public Context a() {
            return this.f11335a;
        }

        public InterfaceC1609b b() {
            return this.f11337c;
        }

        public InterfaceC0172a c() {
            return this.f11340f;
        }

        public InterfaceC1081m d() {
            return this.f11339e;
        }
    }

    void c(b bVar);

    void r(b bVar);
}
