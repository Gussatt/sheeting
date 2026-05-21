package b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5550a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f5551b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i4 = 0;
        for (byte b4 : bArr) {
            char[] cArr2 = f5551b;
            cArr[i4] = cArr2[(b4 & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b4 & 15];
            i4 += 2;
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr, boolean z3) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i4 = 0; i4 < length && (!z3 || i4 != length - 1 || (bArr[i4] & 255) != 0); i4++) {
            char[] cArr = f5550a;
            sb.append(cArr[(bArr[i4] & 240) >>> 4]);
            sb.append(cArr[bArr[i4] & 15]);
        }
        return sb.toString();
    }
}
