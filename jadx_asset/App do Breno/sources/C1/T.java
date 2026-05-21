package C1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {
    public static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i4 = inputStream.read(bArr);
                    if (i4 <= 0) {
                        gZIPOutputStream2.finish();
                        AbstractC0252j.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i4);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC0252j.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S s4 = (S) it.next();
            InputStream inputStreamA = null;
            try {
                inputStreamA = s4.a();
                if (inputStreamA != null) {
                    a(inputStreamA, new File(file, s4.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                AbstractC0252j.g(null);
                throw th;
            }
            AbstractC0252j.g(inputStreamA);
        }
    }
}
