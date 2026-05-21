package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0894y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7016a = new ArrayList();

    public abstract r a(String str, U1 u12, List list);

    public final r b(String str) {
        if (this.f7016a.contains(AbstractC0873v2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
