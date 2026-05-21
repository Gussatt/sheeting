package k1;

import java.util.Map;

/* JADX INFO: renamed from: k1.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1180c7 implements M2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p7 f9393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l7 f9394c;

    public C1180c7(l7 l7Var, String str, p7 p7Var) {
        this.f9392a = str;
        this.f9393b = p7Var;
        this.f9394c = l7Var;
    }

    @Override // k1.M2
    public final void a(String str, int i4, Throwable th, byte[] bArr, Map map) {
        this.f9394c.E(this.f9392a, i4, th, bArr, this.f9393b);
    }
}
