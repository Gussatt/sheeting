package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0115b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0115b c0115b = new DynamiteModule.b.C0115b();
        int iB = aVar.b(context, str, false);
        c0115b.f6285b = iB;
        c0115b.f6286c = iB != 0 ? 1 : 0;
        return c0115b;
    }
}
