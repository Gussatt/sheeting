package S0;

import U0.InterfaceC0524h;
import V0.AbstractC0549h;
import V0.AbstractC0559s;
import V0.AbstractDialogInterfaceOnClickListenerC0562v;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import c1.AbstractC0660b;
import com.google.android.gms.common.api.GoogleApiActivity;
import f1.AbstractC0947f;
import f1.AbstractC0948g;
import s.AbstractC1518e;

/* JADX INFO: renamed from: S0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0512j extends C0513k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3435c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f3433e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0512j f3434f = new C0512j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f3432d = C0513k.f3436a;

    public static C0512j m() {
        return f3434f;
    }

    @Override // S0.C0513k
    public Intent b(Context context, int i4, String str) {
        return super.b(context, i4, str);
    }

    @Override // S0.C0513k
    public PendingIntent c(Context context, int i4, int i5) {
        return super.c(context, i4, i5);
    }

    @Override // S0.C0513k
    public final String e(int i4) {
        return super.e(i4);
    }

    @Override // S0.C0513k
    public int g(Context context) {
        return super.g(context);
    }

    @Override // S0.C0513k
    public int h(Context context, int i4) {
        return super.h(context, i4);
    }

    @Override // S0.C0513k
    public final boolean j(int i4) {
        return super.j(i4);
    }

    public Dialog k(Activity activity, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i4, AbstractDialogInterfaceOnClickListenerC0562v.b(activity, b(activity, i4, "d"), i5), onCancelListener, null);
    }

    public PendingIntent l(Context context, C0504b c0504b) {
        return c0504b.h() ? c0504b.g() : c(context, c0504b.d(), 0);
    }

    public boolean n(Activity activity, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i4, i5, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        s(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i4) {
        t(context, i4, null, d(context, i4, 0, "n"));
    }

    public final Dialog p(Context context, int i4, AbstractDialogInterfaceOnClickListenerC0562v abstractDialogInterfaceOnClickListenerC0562v, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i4 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC0559s.c(context, i4));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = AbstractC0559s.b(context, i4);
        DialogInterface.OnClickListener onClickListener2 = abstractDialogInterfaceOnClickListenerC0562v;
        if (strB != null) {
            if (abstractDialogInterfaceOnClickListenerC0562v == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strB, onClickListener2);
        }
        String strF = AbstractC0559s.f(context, i4);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i4)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC0559s.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        s(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final U0.F r(Context context, U0.E e4) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        U0.F f4 = new U0.F(e4);
        AbstractC0947f.h(context, f4, intentFilter);
        f4.a(context);
        if (i(context, "com.google.android.gms")) {
            return f4;
        }
        e4.a();
        f4.b();
        return null;
    }

    public final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC0505c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void t(Context context, int i4, String str, PendingIntent pendingIntent) {
        int i5;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i4), null), new IllegalArgumentException());
        if (i4 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i4 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = AbstractC0559s.e(context, i4);
        String strD = AbstractC0559s.d(context, i4);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC0549h.j(context.getSystemService("notification"));
        AbstractC1518e.d dVarN = new AbstractC1518e.d(context).k(true).e(true).i(strE).n(new AbstractC1518e.b().h(strD));
        if (b1.h.c(context)) {
            AbstractC0549h.n(b1.k.b());
            dVarN.m(context.getApplicationInfo().icon).l(2);
            if (b1.h.d(context)) {
                dVarN.a(R0.a.f3314a, resources.getString(R0.b.f3329o), pendingIntent);
            } else {
                dVarN.g(pendingIntent);
            }
        } else {
            dVarN.m(R.drawable.stat_sys_warning).o(resources.getString(R0.b.f3322h)).p(System.currentTimeMillis()).g(pendingIntent).h(strD);
        }
        if (b1.k.d()) {
            AbstractC0549h.n(b1.k.d());
            synchronized (f3433e) {
                str2 = this.f3435c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(R0.b.f3321g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC0511i.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarN.f(str2);
        }
        Notification notificationB = dVarN.b();
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            AbstractC0516n.f3441b.set(false);
            i5 = 10436;
        } else {
            i5 = 39789;
        }
        notificationManager.notify(i5, notificationB);
    }

    public final void u(Context context) {
        new q(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, InterfaceC0524h interfaceC0524h, int i4, int i5, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogP = p(activity, i4, AbstractDialogInterfaceOnClickListenerC0562v.c(interfaceC0524h, b(activity, i4, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        s(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, C0504b c0504b, int i4) {
        PendingIntent pendingIntentL;
        if (AbstractC0660b.a(context) || (pendingIntentL = l(context, c0504b)) == null) {
            return false;
        }
        t(context, c0504b.d(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentL, i4, true), AbstractC0948g.f7204a | 134217728));
        return true;
    }
}
