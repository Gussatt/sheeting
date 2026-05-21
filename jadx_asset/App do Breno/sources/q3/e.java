package q3;

import m3.F;
import m3.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f11115a = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f11116b = new F("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F f11117c = new F("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f11118d = new F("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F f11119e = new F("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f11120f = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final f h(long j4, f fVar) {
        return new f(j4, fVar, 0);
    }
}
