package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import j0.AbstractC1106a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1106a abstractC1106a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4580a = abstractC1106a.p(iconCompat.f4580a, 1);
        iconCompat.f4582c = abstractC1106a.j(iconCompat.f4582c, 2);
        iconCompat.f4583d = abstractC1106a.r(iconCompat.f4583d, 3);
        iconCompat.f4584e = abstractC1106a.p(iconCompat.f4584e, 4);
        iconCompat.f4585f = abstractC1106a.p(iconCompat.f4585f, 5);
        iconCompat.f4586g = (ColorStateList) abstractC1106a.r(iconCompat.f4586g, 6);
        iconCompat.f4588i = abstractC1106a.t(iconCompat.f4588i, 7);
        iconCompat.f4589j = abstractC1106a.t(iconCompat.f4589j, 8);
        iconCompat.h();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1106a abstractC1106a) {
        abstractC1106a.x(true, true);
        iconCompat.i(abstractC1106a.f());
        int i4 = iconCompat.f4580a;
        if (-1 != i4) {
            abstractC1106a.F(i4, 1);
        }
        byte[] bArr = iconCompat.f4582c;
        if (bArr != null) {
            abstractC1106a.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4583d;
        if (parcelable != null) {
            abstractC1106a.H(parcelable, 3);
        }
        int i5 = iconCompat.f4584e;
        if (i5 != 0) {
            abstractC1106a.F(i5, 4);
        }
        int i6 = iconCompat.f4585f;
        if (i6 != 0) {
            abstractC1106a.F(i6, 5);
        }
        ColorStateList colorStateList = iconCompat.f4586g;
        if (colorStateList != null) {
            abstractC1106a.H(colorStateList, 6);
        }
        String str = iconCompat.f4588i;
        if (str != null) {
            abstractC1106a.J(str, 7);
        }
        String str2 = iconCompat.f4589j;
        if (str2 != null) {
            abstractC1106a.J(str2, 8);
        }
    }
}
