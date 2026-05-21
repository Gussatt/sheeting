package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class E3 extends Exception {
    public E3(String str) {
        super(str);
    }

    public E3(String str, Throwable th) {
        super("ContentProvider query failed", th);
    }
}
