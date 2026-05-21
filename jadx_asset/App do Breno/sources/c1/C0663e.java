package c1;

import android.content.Context;

/* JADX INFO: renamed from: c1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0663e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0663e f5953b = new C0663e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0662d f5954a = null;

    public static C0662d a(Context context) {
        return f5953b.b(context);
    }

    public final synchronized C0662d b(Context context) {
        try {
            if (this.f5954a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f5954a = new C0662d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5954a;
    }
}
