package c2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import d2.C0919a;
import d2.InterfaceC0920b;
import h3.AbstractC1010i;
import h3.InterfaceC1027q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: c2.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0667D {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f5987f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N2.i f5988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Messenger f5989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingDeque f5991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f5992e;

    /* JADX INFO: renamed from: c2.D$a */
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final N2.i f5993a;

        /* JADX INFO: renamed from: c2.D$a$a, reason: collision with other inner class name */
        public static final class C0108a extends P2.k implements W2.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f5994q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ String f5995r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0108a(String str, N2.e eVar) {
                super(2, eVar);
                this.f5995r = str;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                return new C0108a(this.f5995r, eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f5994q;
                if (i4 == 0) {
                    K2.k.b(obj);
                    C0919a c0919a = C0919a.f7146a;
                    this.f5994q = 1;
                    obj = c0919a.c(this);
                    if (obj == objC) {
                        return objC;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    K2.k.b(obj);
                }
                Collection<InterfaceC0920b> collectionValues = ((Map) obj).values();
                String str = this.f5995r;
                for (InterfaceC0920b interfaceC0920b : collectionValues) {
                    interfaceC0920b.b(new InterfaceC0920b.C0119b(str));
                    Log.d("SessionLifecycleClient", "Notified " + interfaceC0920b.a() + " of new session " + str);
                }
                return K2.p.f2516a;
            }

            @Override // W2.p
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(h3.I i4, N2.e eVar) {
                return ((C0108a) m(i4, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N2.i iVar) {
            super(Looper.getMainLooper());
            X2.l.e(iVar, "backgroundDispatcher");
            this.f5993a = iVar;
        }

        public final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received.");
            AbstractC1010i.d(h3.J.a(this.f5993a), null, null, new C0108a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String string;
            X2.l.e(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                a(string);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: c2.D$b */
    public static final class b {
        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: c2.D$c */
    public static final class c extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f5996q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f5998s;

        /* JADX INFO: renamed from: c2.D$c$a */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return M2.a.a(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, N2.e eVar) {
            super(2, eVar);
            this.f5998s = list;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return C0667D.this.new c(this.f5998s, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f5996q;
            if (i4 == 0) {
                K2.k.b(obj);
                C0919a c0919a = C0919a.f7146a;
                this.f5996q = 1;
                obj = c0919a.c(this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection collectionValues = map.values();
                if (collectionValues == null || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC0920b) it.next()).c()) {
                            List listD = L2.u.D(L2.u.t(L2.m.j(C0667D.this.l(this.f5998s, 2), C0667D.this.l(this.f5998s, 1))), new a());
                            C0667D c0667d = C0667D.this;
                            Iterator it2 = listD.iterator();
                            while (it2.hasNext()) {
                                c0667d.p((Message) it2.next());
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
            }
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((c) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    /* JADX INFO: renamed from: c2.D$d */
    public static final class d implements ServiceConnection {
        public d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + C0667D.this.f5991d.size());
            C0667D.this.f5989b = new Messenger(iBinder);
            C0667D.this.f5990c = true;
            C0667D c0667d = C0667D.this;
            c0667d.o(c0667d.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            C0667D.this.f5989b = null;
            C0667D.this.f5990c = false;
        }
    }

    public C0667D(N2.i iVar) {
        X2.l.e(iVar, "backgroundDispatcher");
        this.f5988a = iVar;
        this.f5991d = new LinkedBlockingDeque(20);
        this.f5992e = new d();
    }

    public final void h() {
        n(2);
    }

    public final void i(InterfaceC0669F interfaceC0669F) {
        X2.l.e(interfaceC0669F, "sessionLifecycleServiceBinder");
        interfaceC0669F.a(new Messenger(new a(this.f5988a)), this.f5992e);
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.f5991d.drainTo(arrayList);
        return arrayList;
    }

    public final void k() {
        n(1);
    }

    public final Message l(List list, int i4) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i4) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public final void m(Message message) {
        if (!this.f5991d.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f5991d.size());
    }

    public final void n(int i4) {
        List listJ = j();
        Message messageObtain = Message.obtain(null, i4, 0, 0);
        X2.l.d(messageObtain, "obtain(null, messageCode, 0, 0)");
        listJ.add(messageObtain);
        o(listJ);
    }

    public final InterfaceC1027q0 o(List list) {
        return AbstractC1010i.d(h3.J.a(this.f5988a), null, null, new c(list, null), 3, null);
    }

    public final void p(Message message) {
        if (this.f5989b == null) {
            m(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.f5989b;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e4) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e4);
            m(message);
        }
    }
}
