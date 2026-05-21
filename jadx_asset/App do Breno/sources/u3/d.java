package u3;

import X2.l;
import t3.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final int a(int[] iArr, int i4, int i5, int i6) {
        l.e(iArr, "<this>");
        int i7 = i6 - 1;
        while (i5 <= i7) {
            int i8 = (i5 + i7) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i4) {
                i5 = i8 + 1;
            } else {
                if (i9 <= i4) {
                    return i8;
                }
                i7 = i8 - 1;
            }
        }
        return (-i5) - 1;
    }

    public static final int b(O o4, int i4) {
        l.e(o4, "<this>");
        int iA = a(o4.E(), i4 + 1, 0, o4.F().length);
        return iA >= 0 ? iA : ~iA;
    }
}
