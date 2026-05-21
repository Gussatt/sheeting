package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p.C1481g;

/* JADX INFO: loaded from: classes.dex */
public final class L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1481g f6398a;

    public L3(C1481g c1481g) {
        this.f6398a = c1481g;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        C1481g c1481g = uri != null ? (C1481g) this.f6398a.get(uri.toString()) : null;
        if (c1481g == null) {
            return null;
        }
        return (String) c1481g.get("".concat(str3));
    }
}
