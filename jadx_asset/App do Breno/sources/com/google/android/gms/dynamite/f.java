package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class f implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0115b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iB;
        DynamiteModule.b.C0115b c0115b = new DynamiteModule.b.C0115b();
        int iA = aVar.a(context, str);
        c0115b.f6284a = iA;
        int i4 = 1;
        int i5 = 0;
        if (iA != 0) {
            iB = aVar.b(context, str, false);
            c0115b.f6285b = iB;
        } else {
            iB = aVar.b(context, str, true);
            c0115b.f6285b = iB;
        }
        int i6 = c0115b.f6284a;
        if (i6 == 0) {
            if (iB == 0) {
                i4 = 0;
            }
            c0115b.f6286c = i4;
            return c0115b;
        }
        i5 = i6;
        if (i5 >= iB) {
            i4 = -1;
        }
        c0115b.f6286c = i4;
        return c0115b;
    }
}
