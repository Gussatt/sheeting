package c0;

import java.util.Arrays;

/* JADX INFO: renamed from: c0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0657l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5939a = {48, 49, 53, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f5940b = {48, 49, 48, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f5941c = {48, 48, 57, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f5942d = {48, 48, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f5943e = {48, 48, 49, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f5944f = {48, 48, 49, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f5945g = {48, 48, 50, 0};

    public static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f5943e) || Arrays.equals(bArr, f5942d)) ? ":" : "!";
    }
}
