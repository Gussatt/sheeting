package c2;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;

/* JADX INFO: renamed from: c2.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0670G implements InterfaceC0669F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6000b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6001a;

    /* JADX INFO: renamed from: c2.G$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public C0670G(Context context) {
        X2.l.e(context, "appContext");
        this.f6001a = context;
    }

    @Override // c2.InterfaceC0669F
    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        boolean zBindService;
        X2.l.e(messenger, "callback");
        X2.l.e(serviceConnection, "serviceConnection");
        Intent intent = new Intent(this.f6001a, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        intent.setPackage(this.f6001a.getPackageName());
        try {
            zBindService = this.f6001a.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e4) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e4);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        b(this.f6001a, serviceConnection);
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }

    public final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return K2.p.f2516a;
        } catch (IllegalArgumentException e4) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e4));
        }
    }
}
