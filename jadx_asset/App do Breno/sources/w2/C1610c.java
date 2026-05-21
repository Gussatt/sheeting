package w2;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.AbstractC1388b;
import w2.InterfaceC1609b;

/* JADX INFO: renamed from: w2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1610c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1609b f11866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1618k f11868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1609b.c f11869d;

    /* JADX INFO: renamed from: w2.c$b */
    public interface b {
        void a(Object obj);
    }

    /* JADX INFO: renamed from: w2.c$c, reason: collision with other inner class name */
    public final class C0185c implements InterfaceC1609b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f11870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f11871b = new AtomicReference(null);

        /* JADX INFO: renamed from: w2.c$c$a */
        public final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AtomicBoolean f11873a;

            public a() {
                this.f11873a = new AtomicBoolean(false);
            }

            @Override // w2.C1610c.b
            public void a(Object obj) {
                if (this.f11873a.get() || C0185c.this.f11871b.get() != this) {
                    return;
                }
                C1610c.this.f11866a.e(C1610c.this.f11867b, C1610c.this.f11868c.a(obj));
            }
        }

        public C0185c(d dVar) {
            this.f11870a = dVar;
        }

        @Override // w2.InterfaceC1609b.a
        public void a(ByteBuffer byteBuffer, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
            C1616i c1616iE = C1610c.this.f11868c.e(byteBuffer);
            if (c1616iE.f11879a.equals("listen")) {
                d(c1616iE.f11880b, interfaceC0184b);
            } else if (c1616iE.f11879a.equals("cancel")) {
                c(c1616iE.f11880b, interfaceC0184b);
            } else {
                interfaceC0184b.a(null);
            }
        }

        public final void c(Object obj, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
            if (((b) this.f11871b.getAndSet(null)) == null) {
                interfaceC0184b.a(C1610c.this.f11868c.c("error", "No active stream to cancel", null));
                return;
            }
            try {
                this.f11870a.e(obj);
                interfaceC0184b.a(C1610c.this.f11868c.a(null));
            } catch (RuntimeException e4) {
                AbstractC1388b.c("EventChannel#" + C1610c.this.f11867b, "Failed to close event stream", e4);
                interfaceC0184b.a(C1610c.this.f11868c.c("error", e4.getMessage(), null));
            }
        }

        public final void d(Object obj, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
            a aVar = new a();
            if (((b) this.f11871b.getAndSet(aVar)) != null) {
                try {
                    this.f11870a.e(null);
                } catch (RuntimeException e4) {
                    AbstractC1388b.c("EventChannel#" + C1610c.this.f11867b, "Failed to close existing event stream", e4);
                }
            }
            try {
                this.f11870a.a(obj, aVar);
                interfaceC0184b.a(C1610c.this.f11868c.a(null));
            } catch (RuntimeException e5) {
                this.f11871b.set(null);
                AbstractC1388b.c("EventChannel#" + C1610c.this.f11867b, "Failed to open event stream", e5);
                interfaceC0184b.a(C1610c.this.f11868c.c("error", e5.getMessage(), null));
            }
        }
    }

    /* JADX INFO: renamed from: w2.c$d */
    public interface d {
        void a(Object obj, b bVar);

        void e(Object obj);
    }

    public C1610c(InterfaceC1609b interfaceC1609b, String str) {
        this(interfaceC1609b, str, C1622o.f11894b);
    }

    public void d(d dVar) {
        if (this.f11869d != null) {
            this.f11866a.d(this.f11867b, dVar != null ? new C0185c(dVar) : null, this.f11869d);
        } else {
            this.f11866a.h(this.f11867b, dVar != null ? new C0185c(dVar) : null);
        }
    }

    public C1610c(InterfaceC1609b interfaceC1609b, String str, InterfaceC1618k interfaceC1618k) {
        this(interfaceC1609b, str, interfaceC1618k, null);
    }

    public C1610c(InterfaceC1609b interfaceC1609b, String str, InterfaceC1618k interfaceC1618k, InterfaceC1609b.c cVar) {
        this.f11866a = interfaceC1609b;
        this.f11867b = str;
        this.f11868c = interfaceC1618k;
        this.f11869d = cVar;
    }
}
