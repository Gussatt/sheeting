package b1;

import V0.AbstractC0548g;

/* JADX INFO: renamed from: b1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0634b {
    public static boolean a(int[] iArr, int i4) {
        if (iArr != null) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            if (!AbstractC0548g.a(objArr[i4], obj)) {
                i4++;
            } else if (i4 >= 0) {
                return true;
            }
        }
        return false;
    }
}
