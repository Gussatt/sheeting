package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p.C1475a;

/* JADX INFO: loaded from: classes.dex */
public abstract class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1475a f6596a = new C1475a();

    public static synchronized Uri a(String str) {
        C1475a c1475a = f6596a;
        Uri uri = (Uri) c1475a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c1475a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
