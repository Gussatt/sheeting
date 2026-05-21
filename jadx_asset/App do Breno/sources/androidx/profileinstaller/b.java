package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import c0.AbstractC0648c;
import c0.AbstractC0656k;
import c0.C0647b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f5130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f5131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0099c f5132c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f5134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5137h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0647b[] f5139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f5140k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5138i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5133d = d();

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0099c interfaceC0099c, String str, String str2, String str3, File file) {
        this.f5130a = assetManager;
        this.f5131b = executor;
        this.f5132c = interfaceC0099c;
        this.f5135f = str;
        this.f5136g = str2;
        this.f5137h = str3;
        this.f5134e = file;
    }

    public static byte[] d() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 34) {
            return null;
        }
        switch (i4) {
        }
        return null;
    }

    public static boolean j() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 34) {
            return false;
        }
        if (i4 != 24 && i4 != 25) {
            switch (i4) {
            }
            return false;
        }
        return true;
    }

    public final b b(C0647b[] c0647bArr, byte[] bArr) {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f5130a, this.f5137h);
        } catch (FileNotFoundException e4) {
            this.f5132c.b(9, e4);
        } catch (IOException e5) {
            this.f5132c.b(7, e5);
        } catch (IllegalStateException e6) {
            this.f5139j = null;
            this.f5132c.b(8, e6);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f5139j = AbstractC0656k.q(inputStreamG, AbstractC0656k.o(inputStreamG, AbstractC0656k.f5938b), bArr, c0647bArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.f5138i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f5133d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f5134e.exists()) {
            try {
                this.f5134e.createNewFile();
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f5134e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f5138i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f5136g);
        } catch (FileNotFoundException e4) {
            this.f5132c.b(6, e4);
            return null;
        } catch (IOException e5) {
            this.f5132c.b(7, e5);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f5132c.a(5, null);
            }
            return null;
        }
    }

    public b h() {
        b bVarB;
        c();
        if (this.f5133d != null) {
            InputStream inputStreamF = f(this.f5130a);
            if (inputStreamF != null) {
                this.f5139j = i(inputStreamF);
            }
            C0647b[] c0647bArr = this.f5139j;
            if (c0647bArr != null && j() && (bVarB = b(c0647bArr, this.f5133d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public final C0647b[] i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C0647b[] c0647bArrW = AbstractC0656k.w(inputStream, AbstractC0656k.o(inputStream, AbstractC0656k.f5937a), this.f5135f);
                        try {
                            inputStream.close();
                            return c0647bArrW;
                        } catch (IOException e4) {
                            this.f5132c.b(7, e4);
                            return c0647bArrW;
                        }
                    } catch (IOException e5) {
                        this.f5132c.b(7, e5);
                        return null;
                    }
                } catch (IllegalStateException e6) {
                    this.f5132c.b(8, e6);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e7) {
                this.f5132c.b(7, e7);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                this.f5132c.b(7, e8);
            }
            throw th;
        }
    }

    public final void k(final int i4, final Object obj) {
        this.f5131b.execute(new Runnable() { // from class: c0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f5910m.f5132c.b(i4, obj);
            }
        });
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        C0647b[] c0647bArr = this.f5139j;
        byte[] bArr = this.f5133d;
        if (c0647bArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    AbstractC0656k.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e4) {
                this.f5132c.b(7, e4);
            } catch (IllegalStateException e5) {
                this.f5132c.b(8, e5);
            }
            if (!AbstractC0656k.B(byteArrayOutputStream, bArr, c0647bArr)) {
                this.f5132c.b(5, null);
                this.f5139j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f5140k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f5139j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean m() {
        byte[] bArr = this.f5140k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f5134e);
                    try {
                        AbstractC0648c.l(byteArrayInputStream, fileOutputStream);
                        k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f5140k = null;
                this.f5139j = null;
            }
        } catch (FileNotFoundException e4) {
            k(6, e4);
            return false;
        } catch (IOException e5) {
            k(7, e5);
            return false;
        }
    }
}
