package o3;

import java.util.concurrent.TimeUnit;
import m3.G;
import m3.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10840a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f10841b = I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10842c = I.e("kotlinx.coroutines.scheduler.core.pool.size", c3.e.a(G.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f10843d = I.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f10844e = TimeUnit.SECONDS.toNanos(I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static g f10845f = e.f10830a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f10846g = new j(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f10847h = new j(1);
}
