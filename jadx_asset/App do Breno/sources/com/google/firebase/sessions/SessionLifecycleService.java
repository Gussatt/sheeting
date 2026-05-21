package com.google.firebase.sessions;

import X2.g;
import X2.l;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.f;
import f2.C0955f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7079e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f7080b = new HandlerThread("FirebaseSessions_HandlerThread");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f7081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Messenger f7082d;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f7085c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            l.e(looper, "looper");
            this.f7085c = new ArrayList();
        }

        public final void a() {
            Log.d("SessionLifecycleService", "Broadcasting new session");
            e.f7111a.a().a(f.f7113f.a().c());
            for (Messenger messenger : new ArrayList(this.f7085c)) {
                l.d(messenger, "it");
                f(messenger);
            }
        }

        public final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f7084b = message.getWhen();
        }

        public final void c(Message message) {
            this.f7085c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            l.d(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f7085c.size());
        }

        public final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f7083a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f7083a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.f7084b = message.getWhen();
        }

        public final boolean e(long j4) {
            return j4 - this.f7084b > g3.a.o(C0955f.f7242c.c().c());
        }

        public final void f(Messenger messenger) {
            try {
                if (this.f7083a) {
                    h(messenger, f.f7113f.a().c().b());
                    return;
                }
                String strA = d.f7109a.a().a();
                Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
                if (strA != null) {
                    h(messenger, strA);
                }
            } catch (IllegalStateException e4) {
                Log.w("SessionLifecycleService", "Failed to send session to client.", e4);
            }
        }

        public final void g() {
            try {
                f.b bVar = f.f7113f;
                bVar.a().a();
                Log.d("SessionLifecycleService", "Generated new session.");
                a();
                d.f7109a.a().b(bVar.a().c().b());
            } catch (IllegalStateException e4) {
                Log.w("SessionLifecycleService", "Failed to generate new session.", e4);
            }
        }

        public final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f7085c.remove(messenger);
            } catch (Exception e4) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e4);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            l.e(message, "msg");
            if (this.f7084b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f7084b + '.');
                return;
            }
            int i4 = message.what;
            if (i4 == 1) {
                d(message);
                return;
            }
            if (i4 == 2) {
                b(message);
                return;
            }
            if (i4 == 4) {
                c(message);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
            super.handleMessage(message);
        }
    }

    public final Messenger a(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messengerA = a(intent);
        if (messengerA != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messengerA;
            b bVar = this.f7081c;
            if (bVar != null) {
                bVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.f7082d;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f7080b.start();
        Looper looper = this.f7080b.getLooper();
        l.d(looper, "handlerThread.looper");
        this.f7081c = new b(looper);
        this.f7082d = new Messenger(this.f7081c);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f7080b.quit();
    }
}
