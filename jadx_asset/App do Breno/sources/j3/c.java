package j3;

import h3.InterfaceC1016l;
import m3.F;
import m3.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f8596a = new j(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8597b = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f8598c = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f8599d = new F("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F f8600e = new F("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F f8601f = new F("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final F f8602g = new F("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F f8603h = new F("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final F f8604i = new F("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final F f8605j = new F("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final F f8606k = new F("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final F f8607l = new F("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final F f8608m = new F("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final F f8609n = new F("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final F f8610o = new F("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final F f8611p = new F("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final F f8612q = new F("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final F f8613r = new F("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final F f8614s = new F("NO_CLOSE_CAUSE");

    public /* synthetic */ class a extends X2.j implements W2.p {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f8615v = new a();

        public a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // W2.p
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (j) obj2);
        }

        public final j o(long j4, j jVar) {
            return c.x(j4, jVar);
        }
    }

    public static final long A(int i4) {
        if (i4 == 0) {
            return 0L;
        }
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(InterfaceC1016l interfaceC1016l, Object obj, W2.l lVar) {
        Object objH = interfaceC1016l.h(obj, null, lVar);
        if (objH == null) {
            return false;
        }
        interfaceC1016l.K(objH);
        return true;
    }

    public static /* synthetic */ boolean C(InterfaceC1016l interfaceC1016l, Object obj, W2.l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        return B(interfaceC1016l, obj, lVar);
    }

    public static final long v(long j4, boolean z3) {
        return (z3 ? 4611686018427387904L : 0L) + j4;
    }

    public static final long w(long j4, int i4) {
        return (((long) i4) << 60) + j4;
    }

    public static final j x(long j4, j jVar) {
        return new j(j4, jVar, jVar.u(), 0);
    }

    public static final d3.e y() {
        return a.f8615v;
    }

    public static final F z() {
        return f8607l;
    }
}
