package U2;

import X2.l;
import f3.q;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends d {
    public static String a(File file) {
        l.e(file, "<this>");
        String name = file.getName();
        l.d(name, "getName(...)");
        return q.V(name, '.', "");
    }
}
