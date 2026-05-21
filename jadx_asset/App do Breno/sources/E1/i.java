package E1;

import C1.AbstractC0252j;
import E1.h;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class i implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f960d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f963c;

    public class a implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f965b;

        public a(byte[] bArr, int[] iArr) {
            this.f964a = bArr;
            this.f965b = iArr;
        }

        @Override // E1.h.d
        public void a(InputStream inputStream, int i4) throws IOException {
            try {
                inputStream.read(this.f964a, this.f965b[0], i4);
                int[] iArr = this.f965b;
                iArr[0] = iArr[0] + i4;
            } finally {
                inputStream.close();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f968b;

        public b(byte[] bArr, int i4) {
            this.f967a = bArr;
            this.f968b = i4;
        }
    }

    public i(File file, int i4) {
        this.f961a = file;
        this.f962b = i4;
    }

    @Override // E1.d
    public void a() {
        AbstractC0252j.f(this.f963c, "There was a problem closing the Crashlytics log file.");
        this.f963c = null;
    }

    @Override // E1.d
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f960d);
        }
        return null;
    }

    @Override // E1.d
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i4 = bVarG.f968b;
        byte[] bArr = new byte[i4];
        System.arraycopy(bVarG.f967a, 0, bArr, 0, i4);
        return bArr;
    }

    @Override // E1.d
    public void d() {
        a();
        this.f961a.delete();
    }

    @Override // E1.d
    public void e(long j4, String str) {
        h();
        f(j4, str);
    }

    public final void f(long j4, String str) {
        if (this.f963c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i4 = this.f962b / 4;
            if (str.length() > i4) {
                str = "..." + str.substring(str.length() - i4);
            }
            this.f963c.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j4), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f960d));
            while (!this.f963c.r() && this.f963c.M() > this.f962b) {
                this.f963c.F();
            }
        } catch (IOException e4) {
            z1.g.f().e("There was a problem writing to the Crashlytics log.", e4);
        }
    }

    public final b g() {
        if (!this.f961a.exists()) {
            return null;
        }
        h();
        h hVar = this.f963c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.M()];
        try {
            this.f963c.l(new a(bArr, iArr));
        } catch (IOException e4) {
            z1.g.f().e("A problem occurred while reading the Crashlytics log file.", e4);
        }
        return new b(bArr, iArr[0]);
    }

    public final void h() {
        if (this.f963c == null) {
            try {
                this.f963c = new h(this.f961a);
            } catch (IOException e4) {
                z1.g.f().e("Could not open log file: " + this.f961a, e4);
            }
        }
    }
}
