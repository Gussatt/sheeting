package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0890x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7008a = new HashMap();

    public final void a(String str, Callable callable) {
        this.f7008a.put(str, callable);
    }
}
