package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class F3 implements B3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f6337a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f6338b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6339c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6340d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f6341e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f6342f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f6343g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6344h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f6345i = new String[0];

    @Override // com.google.android.gms.internal.measurement.B3
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f6338b == null) {
                    this.f6337a.set(false);
                    this.f6338b = new HashMap(16, 1.0f);
                    this.f6343g = new Object();
                    contentResolver.registerContentObserver(A3.f6288a, true, new D3(this, null));
                } else if (this.f6337a.getAndSet(false)) {
                    this.f6338b.clear();
                    this.f6339c.clear();
                    this.f6340d.clear();
                    this.f6341e.clear();
                    this.f6342f.clear();
                    this.f6343g = new Object();
                    this.f6344h = false;
                }
                Object obj = this.f6343g;
                if (this.f6338b.containsKey(str)) {
                    String str4 = (String) this.f6338b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = A3.f6288a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new E3("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new E3("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f6343g) {
                                            this.f6338b.put(str, string);
                                        }
                                    } finally {
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } finally {
                            }
                        } catch (RemoteException e4) {
                            throw new E3("ContentProvider query failed", e4);
                        }
                    } catch (Throwable th) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th;
                    }
                } catch (E3 unused) {
                    return null;
                }
            } finally {
            }
        }
    }
}
