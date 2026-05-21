package C1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: renamed from: C1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0248f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f599b;

    public C0248f(Float f4, boolean z3) {
        this.f599b = z3;
        this.f598a = f4;
    }

    public static C0248f a(Context context) {
        boolean zE = false;
        Float fD = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e4) {
            z1.g.f().e("An error occurred getting battery state.", e4);
        }
        return new C0248f(fD, zE);
    }

    public static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f598a;
    }

    public int c() {
        Float f4;
        if (!this.f599b || (f4 = this.f598a) == null) {
            return 1;
        }
        return ((double) f4.floatValue()) < 0.99d ? 2 : 3;
    }
}
