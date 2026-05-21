package V0;

import U0.InterfaceC0524h;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: V0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC0562v implements DialogInterface.OnClickListener {
    public static AbstractDialogInterfaceOnClickListenerC0562v b(Activity activity, Intent intent, int i4) {
        return new C0560t(intent, activity, i4);
    }

    public static AbstractDialogInterfaceOnClickListenerC0562v c(InterfaceC0524h interfaceC0524h, Intent intent, int i4) {
        return new C0561u(intent, interfaceC0524h, 2);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e4) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e4);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
