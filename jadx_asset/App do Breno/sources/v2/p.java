package v2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f11686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f11687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f11688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f11689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f11691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ByteBuffer f11692i;

    public enum a {
        TEXTURE_WITH_VIRTUAL_FALLBACK,
        TEXTURE_WITH_HYBRID_FALLBACK,
        HYBRID_ONLY
    }

    public p(int i4, String str, double d4, double d5, double d6, double d7, int i5, a aVar, ByteBuffer byteBuffer) {
        this.f11684a = i4;
        this.f11685b = str;
        this.f11688e = d4;
        this.f11689f = d5;
        this.f11686c = d6;
        this.f11687d = d7;
        this.f11690g = i5;
        this.f11691h = aVar;
        this.f11692i = byteBuffer;
    }

    public static p a(int i4, String str, int i5, ByteBuffer byteBuffer) {
        return new p(i4, str, 0.0d, 0.0d, 0.0d, 0.0d, i5, null, byteBuffer);
    }

    public static p b(int i4, String str, int i5, ByteBuffer byteBuffer) {
        return new p(i4, str, 0.0d, 0.0d, 0.0d, 0.0d, i5, a.HYBRID_ONLY, byteBuffer);
    }

    public static p c(int i4, String str, double d4, double d5, double d6, double d7, int i5, boolean z3, ByteBuffer byteBuffer) {
        return new p(i4, str, d4, d5, d6, d7, i5, z3 ? a.TEXTURE_WITH_HYBRID_FALLBACK : a.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
    }
}
