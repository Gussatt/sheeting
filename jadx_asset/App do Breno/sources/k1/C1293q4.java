package k1;

import V0.AbstractC0549h;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: k1.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1293q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f9801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.F0 f9803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f9805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f9806j;

    public C1293q4(Context context, com.google.android.gms.internal.measurement.F0 f02, Long l4) {
        this.f9804h = true;
        AbstractC0549h.j(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC0549h.j(applicationContext);
        this.f9797a = applicationContext;
        this.f9805i = l4;
        if (f02 != null) {
            this.f9803g = f02;
            this.f9798b = f02.f6334r;
            this.f9799c = f02.f6333q;
            this.f9800d = f02.f6332p;
            this.f9804h = f02.f6331o;
            this.f9802f = f02.f6330n;
            this.f9806j = f02.f6336t;
            Bundle bundle = f02.f6335s;
            if (bundle != null) {
                this.f9801e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
