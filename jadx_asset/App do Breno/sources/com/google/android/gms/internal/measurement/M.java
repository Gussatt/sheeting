package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0894y {
    @Override // com.google.android.gms.internal.measurement.AbstractC0894y
    public final r a(String str, U1 u12, List list) {
        if (str == null || str.isEmpty() || !u12.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        r rVarD = u12.d(str);
        if (rVarD instanceof AbstractC0783k) {
            return ((AbstractC0783k) rVarD).a(u12, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
