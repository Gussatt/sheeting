package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o1.AbstractC1471h;
import p.C1475a;

/* JADX INFO: loaded from: classes.dex */
public final class K3 implements O3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f6382h = new C1475a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f6383i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f6384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f6385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f6386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContentObserver f6387d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Map f6389f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6388e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f6390g = new ArrayList();

    public K3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        AbstractC1471h.h(contentResolver);
        AbstractC1471h.h(uri);
        this.f6384a = contentResolver;
        this.f6385b = uri;
        this.f6386c = runnable;
        this.f6387d = new J3(this, null);
    }

    public static K3 b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        K3 k32;
        synchronized (K3.class) {
            Map map = f6382h;
            k32 = (K3) map.get(uri);
            if (k32 == null) {
                try {
                    K3 k33 = new K3(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, k33.f6387d);
                        map.put(uri, k33);
                    } catch (SecurityException unused) {
                    }
                    k32 = k33;
                } catch (SecurityException unused2) {
                }
            }
        }
        return k32;
    }

    public static /* synthetic */ Map c(K3 k32) {
        ContentResolver contentResolver = k32.f6384a;
        Uri uri = k32.f6385b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f6383i, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map c1475a = count <= 256 ? new C1475a(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        c1475a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return c1475a;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } finally {
                }
            } catch (RemoteException e4) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e4);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    public static synchronized void e() {
        try {
            Map map = f6382h;
            for (K3 k32 : map.values()) {
                k32.f6384a.unregisterContentObserver(k32.f6387d);
            }
            map.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.O3
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f6389f;
        if (map2 == null) {
            synchronized (this.f6388e) {
                map2 = this.f6389f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) M3.a(new N3() { // from class: com.google.android.gms.internal.measurement.I3
                                @Override // com.google.android.gms.internal.measurement.N3
                                public final Object a() {
                                    return K3.c(this.f6366a);
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e4) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e4);
                        map = Collections.EMPTY_MAP;
                    }
                    this.f6389f = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void f() {
        synchronized (this.f6388e) {
            this.f6389f = null;
            this.f6386c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f6390g.iterator();
                if (it.hasNext()) {
                    i.d.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
