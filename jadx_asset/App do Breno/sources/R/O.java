package R;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class O extends Writer {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public StringBuilder f3094n = new StringBuilder(128);

    public O(String str) {
        this.f3093m = str;
    }

    public final void a() {
        if (this.f3094n.length() > 0) {
            Log.d(this.f3093m, this.f3094n.toString());
            StringBuilder sb = this.f3094n;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c4 = cArr[i4 + i6];
            if (c4 == '\n') {
                a();
            } else {
                this.f3094n.append(c4);
            }
        }
    }
}
