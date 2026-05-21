package S0;

import V0.AbstractC0549h;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: S0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC0505c extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Dialog f3426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f3427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Dialog f3428d;

    public static DialogFragmentC0505c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC0505c dialogFragmentC0505c = new DialogFragmentC0505c();
        Dialog dialog2 = (Dialog) AbstractC0549h.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC0505c.f3426b = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC0505c.f3427c = onCancelListener;
        }
        return dialogFragmentC0505c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3427c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f3426b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f3428d == null) {
            this.f3428d = new AlertDialog.Builder((Context) AbstractC0549h.j(getActivity())).create();
        }
        return this.f3428d;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
