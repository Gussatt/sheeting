package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0698a4 extends AbstractC0752g4 {
    public C0698a4(C0725d4 c0725d4, String str, Boolean bool, boolean z3) {
        super(c0725d4, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0752g4
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (A3.f6290c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (A3.f6291d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f6733b + ": " + obj.toString());
        return null;
    }
}
