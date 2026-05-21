package o2;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.AbstractC1388b;
import l2.C1387a;
import w2.InterfaceC1609b;

/* JADX INFO: renamed from: o2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1474c implements InterfaceC1609b, o2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f10773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f10775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f10778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f10780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakHashMap f10781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f10782j;

    /* JADX INFO: renamed from: o2.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f10783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f10785c;

        public b(ByteBuffer byteBuffer, int i4, long j4) {
            this.f10783a = byteBuffer;
            this.f10784b = i4;
            this.f10785c = j4;
        }
    }

    /* JADX INFO: renamed from: o2.c$c, reason: collision with other inner class name */
    public static class C0147c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExecutorService f10786a;

        public C0147c(ExecutorService executorService) {
            this.f10786a = executorService;
        }

        @Override // o2.C1474c.d
        public void a(Runnable runnable) {
            this.f10786a.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: o2.c$d */
    public interface d {
        void a(Runnable runnable);
    }

    /* JADX INFO: renamed from: o2.c$e */
    public static class e implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ExecutorService f10787a = C1387a.e().b();

        @Override // o2.C1474c.i
        public d a(InterfaceC1609b.d dVar) {
            return dVar.a() ? new h(this.f10787a) : new C0147c(this.f10787a);
        }
    }

    /* JADX INFO: renamed from: o2.c$f */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1609b.a f10788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f10789b;

        public f(InterfaceC1609b.a aVar, d dVar) {
            this.f10788a = aVar;
            this.f10789b = dVar;
        }
    }

    /* JADX INFO: renamed from: o2.c$g */
    public static class g implements InterfaceC1609b.InterfaceC0184b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlutterJNI f10790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f10792c = new AtomicBoolean(false);

        public g(FlutterJNI flutterJNI, int i4) {
            this.f10790a = flutterJNI;
            this.f10791b = i4;
        }

        @Override // w2.InterfaceC1609b.InterfaceC0184b
        public void a(ByteBuffer byteBuffer) throws Throwable {
            if (this.f10792c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f10790a.invokePlatformMessageEmptyResponseCallback(this.f10791b);
            } else {
                this.f10790a.invokePlatformMessageResponseCallback(this.f10791b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* JADX INFO: renamed from: o2.c$h */
    public static class h implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExecutorService f10793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentLinkedQueue f10794b = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f10795c = new AtomicBoolean(false);

        public h(ExecutorService executorService) {
            this.f10793a = executorService;
        }

        @Override // o2.C1474c.d
        public void a(Runnable runnable) {
            this.f10794b.add(runnable);
            this.f10793a.execute(new Runnable() { // from class: o2.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10796m.d();
                }
            });
        }

        public final void d() {
            if (this.f10795c.compareAndSet(false, true)) {
                try {
                    Runnable runnable = (Runnable) this.f10794b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                } finally {
                    this.f10795c.set(false);
                    if (!this.f10794b.isEmpty()) {
                        this.f10793a.execute(new Runnable() { // from class: o2.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f10797m.d();
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o2.c$i */
    public interface i {
        d a(InterfaceC1609b.d dVar);
    }

    /* JADX INFO: renamed from: o2.c$j */
    public static class j implements InterfaceC1609b.c {
        public j() {
        }
    }

    public C1474c(FlutterJNI flutterJNI, i iVar) {
        this.f10774b = new HashMap();
        this.f10775c = new HashMap();
        this.f10776d = new Object();
        this.f10777e = new AtomicBoolean(false);
        this.f10778f = new HashMap();
        this.f10779g = 1;
        this.f10780h = new o2.g();
        this.f10781i = new WeakHashMap();
        this.f10773a = flutterJNI;
        this.f10782j = iVar;
    }

    public static /* synthetic */ void i(C1474c c1474c, String str, int i4, f fVar, ByteBuffer byteBuffer, long j4) {
        c1474c.getClass();
        I2.e.f("PlatformChannel ScheduleHandler on " + str, i4);
        try {
            I2.e eVarG = I2.e.g("DartMessenger#handleMessageFromDart on " + str);
            try {
                c1474c.l(fVar, byteBuffer, i4);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (eVarG != null) {
                    eVarG.close();
                }
            } finally {
            }
        } finally {
            c1474c.f10773a.cleanupMessageData(j4);
        }
    }

    public static void k(Error error) {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
    }

    @Override // w2.InterfaceC1609b
    public InterfaceC1609b.c a(InterfaceC1609b.d dVar) {
        d dVarA = this.f10782j.a(dVar);
        j jVar = new j();
        this.f10781i.put(jVar, dVarA);
        return jVar;
    }

    @Override // w2.InterfaceC1609b
    public void c(String str, ByteBuffer byteBuffer, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
        I2.e eVarG = I2.e.g("DartMessenger#send on " + str);
        try {
            AbstractC1388b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i4 = this.f10779g;
            this.f10779g = i4 + 1;
            if (interfaceC0184b != null) {
                this.f10778f.put(Integer.valueOf(i4), interfaceC0184b);
            }
            if (byteBuffer == null) {
                this.f10773a.dispatchEmptyPlatformMessage(str, i4);
            } else {
                this.f10773a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i4);
            }
            if (eVarG != null) {
                eVarG.close();
            }
        } catch (Throwable th) {
            if (eVarG != null) {
                try {
                    eVarG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // w2.InterfaceC1609b
    public void d(String str, InterfaceC1609b.a aVar, InterfaceC1609b.c cVar) {
        d dVar;
        if (aVar == null) {
            AbstractC1388b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f10776d) {
                this.f10774b.remove(str);
            }
            return;
        }
        if (cVar != null) {
            dVar = (d) this.f10781i.get(cVar);
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar = null;
        }
        AbstractC1388b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f10776d) {
            try {
                this.f10774b.put(str, new f(aVar, dVar));
                List<b> list = (List) this.f10775c.remove(str);
                if (list == null) {
                    return;
                }
                for (b bVar : list) {
                    j(str, (f) this.f10774b.get(str), bVar.f10783a, bVar.f10784b, bVar.f10785c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w2.InterfaceC1609b
    public void e(String str, ByteBuffer byteBuffer) {
        AbstractC1388b.f("DartMessenger", "Sending message over channel '" + str + "'");
        c(str, byteBuffer, null);
    }

    @Override // o2.f
    public void f(int i4, ByteBuffer byteBuffer) {
        AbstractC1388b.f("DartMessenger", "Received message reply from Dart.");
        InterfaceC1609b.InterfaceC0184b interfaceC0184b = (InterfaceC1609b.InterfaceC0184b) this.f10778f.remove(Integer.valueOf(i4));
        if (interfaceC0184b != null) {
            try {
                AbstractC1388b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                interfaceC0184b.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e4) {
                k(e4);
            } catch (Exception e5) {
                AbstractC1388b.c("DartMessenger", "Uncaught exception in binary message reply handler", e5);
            }
        }
    }

    @Override // o2.f
    public void g(String str, ByteBuffer byteBuffer, int i4, long j4) {
        f fVar;
        boolean z3;
        AbstractC1388b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f10776d) {
            try {
                fVar = (f) this.f10774b.get(str);
                z3 = this.f10777e.get() && fVar == null;
                if (z3) {
                    if (!this.f10775c.containsKey(str)) {
                        this.f10775c.put(str, new LinkedList());
                    }
                    ((List) this.f10775c.get(str)).add(new b(byteBuffer, i4, j4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return;
        }
        j(str, fVar, byteBuffer, i4, j4);
    }

    @Override // w2.InterfaceC1609b
    public void h(String str, InterfaceC1609b.a aVar) {
        d(str, aVar, null);
    }

    public final void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i4, final long j4) {
        d dVar = fVar != null ? fVar.f10789b : null;
        I2.e.c("PlatformChannel ScheduleHandler on " + str, i4);
        Runnable runnable = new Runnable() { // from class: o2.b
            @Override // java.lang.Runnable
            public final void run() {
                C1474c.i(this.f10767m, str, i4, fVar, byteBuffer, j4);
            }
        };
        if (dVar == null) {
            dVar = this.f10780h;
        }
        dVar.a(runnable);
    }

    public final void l(f fVar, ByteBuffer byteBuffer, int i4) {
        if (fVar == null) {
            AbstractC1388b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f10773a.invokePlatformMessageEmptyResponseCallback(i4);
            return;
        }
        try {
            AbstractC1388b.f("DartMessenger", "Deferring to registered handler to process message.");
            fVar.f10788a.a(byteBuffer, new g(this.f10773a, i4));
        } catch (Error e4) {
            k(e4);
        } catch (Exception e5) {
            AbstractC1388b.c("DartMessenger", "Uncaught exception in binary message listener", e5);
            this.f10773a.invokePlatformMessageEmptyResponseCallback(i4);
        }
    }

    public C1474c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }
}
