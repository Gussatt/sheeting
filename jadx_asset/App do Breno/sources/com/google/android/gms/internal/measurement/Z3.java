package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class Z3 extends AbstractC0752g4 {
    public Z3(C0725d4 c0725d4, String str, Long l4, boolean z3) {
        super(c0725d4, str, l4, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0752g4
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + this.f6733b + ": " + obj.toString());
        return null;
    }
}
