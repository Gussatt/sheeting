package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0906z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B3 f7034a;

    static {
        Uri uri = A3.f6288a;
        f7034a = C3.a();
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        return f7034a.a(contentResolver, str, null);
    }
}
