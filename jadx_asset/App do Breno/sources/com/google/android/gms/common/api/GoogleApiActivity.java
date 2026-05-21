package com.google.android.gms.common.api;

import S0.C0504b;
import S0.C0512j;
import U0.C0521e;
import V0.AbstractC0549h;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6173b = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i4, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i4);
        intent.putExtra("notify_manager", z3);
        return intent;
    }

    public final void b() {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            C0512j.m().n(this, ((Integer) AbstractC0549h.j(num)).intValue(), 2, this);
            this.f6173b = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f6173b = 1;
            } catch (ActivityNotFoundException e4) {
                e = e4;
                if (extras.getBoolean("notify_manager", true)) {
                    C0521e.t(this).B(new C0504b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strConcat = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strConcat, e);
                }
                googleApiActivity.f6173b = 1;
                finish();
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e6) {
            e = e6;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e7) {
            e = e7;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f6173b = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                C0521e c0521eT = C0521e.t(this);
                if (i5 == -1) {
                    c0521eT.C();
                } else if (i5 == 0) {
                    c0521eT.B(new C0504b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i4 == 2) {
            this.f6173b = 0;
            setResult(i5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f6173b = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6173b = bundle.getInt("resolution");
        }
        if (this.f6173b != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f6173b);
        super.onSaveInstanceState(bundle);
    }
}
