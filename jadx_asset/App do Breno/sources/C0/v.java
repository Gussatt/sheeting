package C0;

import K0.InterfaceC0456d;
import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements Closeable {

    public interface a {
        v a();

        a b(Context context);
    }

    public abstract InterfaceC0456d a();

    public abstract u c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
