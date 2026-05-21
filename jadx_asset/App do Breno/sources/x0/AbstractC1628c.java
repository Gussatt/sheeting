package x0;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: x0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1628c {

    /* JADX INFO: renamed from: x0.c$a */
    public interface a {
        void a(Context context, String[] strArr, String str, File file, C1629d c1629d);
    }

    /* JADX INFO: renamed from: x0.c$b */
    public interface b {
        String a(String str);

        String b(String str);

        void c(String str);

        String[] d();

        void e(String str);
    }

    /* JADX INFO: renamed from: x0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0188c {
    }

    /* JADX INFO: renamed from: x0.c$d */
    public interface d {
        void a(String str);
    }

    public static C1629d a(d dVar) {
        return new C1629d().h(dVar);
    }
}
