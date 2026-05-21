package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0808n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f6889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f6890b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        f6889a = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f6890b = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r3, android.app.job.JobInfo r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r5 = r3.getSystemService(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.Object r5 = o1.AbstractC1471h.h(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.reflect.Method r6 = com.google.android.gms.internal.measurement.AbstractC0808n0.f6889a
            if (r6 == 0) goto L70
            java.lang.String r6 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = r3.checkSelfPermission(r6)
            if (r3 == 0) goto L1b
            goto L70
        L1b:
            java.lang.reflect.Method r3 = com.google.android.gms.internal.measurement.AbstractC0808n0.f6890b
            r6 = 0
            if (r3 == 0) goto L35
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            if (r3 == 0) goto L35
            int r3 = r3.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            goto L46
        L31:
            r3 = move-exception
            goto L37
        L33:
            r3 = move-exception
            goto L37
        L35:
            r3 = r6
            goto L46
        L37:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r3)
            goto L35
        L46:
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "com.google.android.gms"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.measurement.AbstractC0808n0.f6889a
            if (r2 == 0) goto L6b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L63 java.lang.IllegalAccessException -> L65
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r1, r3, r0}     // Catch: java.lang.reflect.InvocationTargetException -> L63 java.lang.IllegalAccessException -> L65
            java.lang.Object r3 = r2.invoke(r5, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L63 java.lang.IllegalAccessException -> L65
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.reflect.InvocationTargetException -> L63 java.lang.IllegalAccessException -> L65
            if (r3 == 0) goto L6f
            int r6 = r3.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L63 java.lang.IllegalAccessException -> L65
            goto L6f
        L63:
            r3 = move-exception
            goto L66
        L65:
            r3 = move-exception
        L66:
            java.lang.String r6 = "error calling scheduleAsPackage"
            android.util.Log.e(r0, r6, r3)
        L6b:
            int r6 = r5.schedule(r4)
        L6f:
            return r6
        L70:
            int r3 = r5.schedule(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0808n0.a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
