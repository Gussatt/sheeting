package C1;

import F1.F;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: C1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0250h implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f610c;

    public C0250h(String str, String str2, byte[] bArr) {
        this.f609b = str;
        this.f610c = str2;
        this.f608a = bArr;
    }

    @Override // C1.S
    public InputStream a() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f608a);
    }

    @Override // C1.S
    public String b() {
        return this.f610c;
    }

    @Override // C1.S
    public F.d.b c() {
        byte[] bArrD = d();
        if (bArrD == null) {
            return null;
        }
        return F.d.b.a().b(bArrD).c(this.f609b).a();
    }

    public final byte[] d() {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f608a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final boolean e() {
        byte[] bArr = this.f608a;
        return bArr == null || bArr.length == 0;
    }
}
