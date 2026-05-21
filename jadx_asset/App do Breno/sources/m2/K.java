package m2;

import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l2.AbstractC1388b;
import m2.G;
import m2.L;
import m2.M;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public class K implements L.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1609b f10407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10408b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10409c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L.b f10410d = new L.b();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10411a;

        static {
            int[] iArr = new int[G.b.values().length];
            f10411a = iArr;
            try {
                iArr[G.b.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10411a[G.b.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10411a[G.b.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public K(InterfaceC1609b interfaceC1609b) {
        this.f10407a = interfaceC1609b;
        for (M.e eVar : M.a()) {
            this.f10409c.put(Long.valueOf(eVar.f10431c), eVar);
        }
    }

    public static /* synthetic */ void b(K k4, M.c cVar, long j4, KeyEvent keyEvent) {
        k4.getClass();
        k4.n(false, Long.valueOf(cVar.f10426b), Long.valueOf(j4), keyEvent.getEventTime());
    }

    public static /* synthetic */ void c(K k4, M.c cVar, long j4, KeyEvent keyEvent) {
        k4.getClass();
        k4.n(false, Long.valueOf(cVar.f10426b), Long.valueOf(j4), keyEvent.getEventTime());
    }

    public static /* synthetic */ void d(L.d.a aVar, ByteBuffer byteBuffer) {
        Boolean boolValueOf = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            AbstractC1388b.g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        aVar.a(boolValueOf.booleanValue());
    }

    public static G.b e(KeyEvent keyEvent) {
        boolean z3 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z3 ? G.b.kRepeat : G.b.kDown;
        }
        if (action == 1) {
            return G.b.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    public static long j(long j4, long j5) {
        return (j4 & 4294967295L) | j5;
    }

    @Override // m2.L.d
    public void a(KeyEvent keyEvent, L.d.a aVar) {
        if (i(keyEvent, aVar)) {
            return;
        }
        n(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    public final Long f(KeyEvent keyEvent) {
        Long l4 = (Long) M.f10423b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l4 != null ? l4 : Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
    }

    public final Long g(KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
        }
        Long l4 = (Long) M.f10422a.get(Long.valueOf(scanCode));
        return l4 != null ? l4 : Long.valueOf(j(keyEvent.getScanCode(), 73014444032L));
    }

    public Map h() {
        return Collections.unmodifiableMap(this.f10408b);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141 A[LOOP:2: B:70:0x013b->B:72:0x0141, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.KeyEvent r16, m2.L.d.a r17) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.K.i(android.view.KeyEvent, m2.L$d$a):boolean");
    }

    public final void k(G g4, final L.d.a aVar) {
        this.f10407a.c("flutter/keydata", g4.a(), aVar == null ? null : new InterfaceC1609b.InterfaceC0184b() { // from class: m2.H
            @Override // w2.InterfaceC1609b.InterfaceC0184b
            public final void a(ByteBuffer byteBuffer) {
                K.d(aVar, byteBuffer);
            }
        });
    }

    public void l(M.d dVar, boolean z3, long j4, final long j5, final KeyEvent keyEvent, ArrayList arrayList) {
        M.c[] cVarArr = dVar.f10428b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        int i4 = 0;
        boolean z4 = false;
        while (true) {
            M.c[] cVarArr2 = dVar.f10428b;
            boolean z5 = true;
            if (i4 >= cVarArr2.length) {
                break;
            }
            final M.c cVar = cVarArr2[i4];
            boolean zContainsKey = this.f10408b.containsKey(Long.valueOf(cVar.f10425a));
            zArr[i4] = zContainsKey;
            if (cVar.f10426b == j4) {
                int i5 = a.f10411a[e(keyEvent).ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        boolArr[i4] = Boolean.valueOf(zArr[i4]);
                    } else if (i5 == 3) {
                        if (!z3) {
                            arrayList.add(new Runnable() { // from class: m2.J
                                @Override // java.lang.Runnable
                                public final void run() {
                                    K.b(this.f10403m, cVar, j5, keyEvent);
                                }
                            });
                        }
                        boolArr[i4] = Boolean.valueOf(zArr[i4]);
                    }
                    i4++;
                } else {
                    boolArr[i4] = Boolean.FALSE;
                    if (!z3) {
                        arrayList.add(new Runnable() { // from class: m2.I
                            @Override // java.lang.Runnable
                            public final void run() {
                                K.c(this.f10399m, cVar, j5, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z4 && !zContainsKey) {
                z5 = false;
            }
            z4 = z5;
            i4++;
        }
        if (z3) {
            for (int i6 = 0; i6 < dVar.f10428b.length; i6++) {
                if (boolArr[i6] == null) {
                    if (z4) {
                        boolArr[i6] = Boolean.valueOf(zArr[i6]);
                    } else {
                        boolArr[i6] = Boolean.TRUE;
                        z4 = true;
                    }
                }
            }
            if (!z4) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i7 = 0; i7 < dVar.f10428b.length; i7++) {
                if (boolArr[i7] == null) {
                    boolArr[i7] = Boolean.FALSE;
                }
            }
        }
        for (int i8 = 0; i8 < dVar.f10428b.length; i8++) {
            if (zArr[i8] != boolArr[i8].booleanValue()) {
                M.c cVar2 = dVar.f10428b[i8];
                n(boolArr[i8].booleanValue(), Long.valueOf(cVar2.f10426b), Long.valueOf(cVar2.f10425a), keyEvent.getEventTime());
            }
        }
    }

    public void m(M.e eVar, boolean z3, long j4, KeyEvent keyEvent) {
        if (eVar.f10431c == j4 || eVar.f10432d == z3) {
            return;
        }
        boolean zContainsKey = this.f10408b.containsKey(Long.valueOf(eVar.f10430b));
        boolean z4 = !zContainsKey;
        if (!zContainsKey) {
            eVar.f10432d = !eVar.f10432d;
        }
        n(z4, Long.valueOf(eVar.f10431c), Long.valueOf(eVar.f10430b), keyEvent.getEventTime());
        if (zContainsKey) {
            eVar.f10432d = !eVar.f10432d;
        }
        n(zContainsKey, Long.valueOf(eVar.f10431c), Long.valueOf(eVar.f10430b), keyEvent.getEventTime());
    }

    public final void n(boolean z3, Long l4, Long l5, long j4) {
        G g4 = new G();
        g4.f10379a = j4;
        g4.f10380b = z3 ? G.b.kDown : G.b.kUp;
        g4.f10382d = l4.longValue();
        g4.f10381c = l5.longValue();
        g4.f10385g = null;
        g4.f10383e = true;
        g4.f10384f = G.a.kKeyboard;
        if (l5.longValue() != 0 && l4.longValue() != 0) {
            if (!z3) {
                l4 = null;
            }
            o(l5, l4);
        }
        k(g4, null);
    }

    public void o(Long l4, Long l5) {
        if (l5 != null) {
            if (((Long) this.f10408b.put(l4, l5)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) this.f10408b.remove(l4)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
