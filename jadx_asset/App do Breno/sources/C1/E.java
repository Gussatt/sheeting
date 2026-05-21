package C1;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.g f532b;

    public E(String str, I1.g gVar) {
        this.f531a = str;
        this.f532b = gVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e4) {
            z1.g.f().e("Error creating marker: " + this.f531a, e4);
            return false;
        }
    }

    public final File b() {
        return this.f532b.g(this.f531a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
