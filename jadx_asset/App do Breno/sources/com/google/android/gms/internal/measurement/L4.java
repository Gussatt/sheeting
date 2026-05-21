package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class L4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile L4 f6399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L4 f6400c = new L4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6401a = Collections.EMPTY_MAP;

    public L4(boolean z3) {
    }

    public static L4 a() {
        L4 l4 = f6399b;
        if (l4 != null) {
            return l4;
        }
        synchronized (L4.class) {
            try {
                L4 l42 = f6399b;
                if (l42 != null) {
                    return l42;
                }
                B5 b5 = B5.f6298c;
                L4 l4A = Q4.a(L4.class);
                f6399b = l4A;
                return l4A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final U4 b(InterfaceC0860t5 interfaceC0860t5, int i4) {
        i.d.a(this.f6401a.get(new K4(interfaceC0860t5, i4)));
        return null;
    }
}
