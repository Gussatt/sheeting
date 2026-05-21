package b0;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* JADX INFO: renamed from: b0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0621d extends AbstractC0629l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C0621d(Context context) {
        X2.l.e(context, "context");
        MeasurementManager measurementManager = MeasurementManager.get(context);
        X2.l.d(measurementManager, "get(context)");
        super(measurementManager);
    }
}
