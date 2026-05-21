package b3;

import X2.l;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class a extends a3.a {
    @Override // a3.a
    public Random c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        l.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
