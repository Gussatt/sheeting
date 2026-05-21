package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0707b4 extends AbstractC0752g4 {
    public C0707b4(C0725d4 c0725d4, String str, Double d4, boolean z3) {
        super(c0725d4, "measurement.test.double_flag", d4, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0752g4
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + this.f6733b + ": " + obj.toString());
        return null;
    }
}
