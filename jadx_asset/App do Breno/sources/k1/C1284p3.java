package k1;

import V0.AbstractC0549h;
import java.lang.Thread;

/* JADX INFO: renamed from: k1.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1284p3 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1307s3 f9652b;

    public C1284p3(C1307s3 c1307s3, String str) {
        this.f9652b = c1307s3;
        AbstractC0549h.j(str);
        this.f9651a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f9652b.f9366a.c().r().b(this.f9651a, th);
    }
}
