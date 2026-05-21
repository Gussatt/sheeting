package k1;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: k1.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1171b7 implements M2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f9375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l7 f9376c;

    public C1171b7(l7 l7Var, String str, List list) {
        this.f9374a = str;
        this.f9375b = list;
        this.f9376c = l7Var;
    }

    @Override // k1.M2
    public final void a(String str, int i4, Throwable th, byte[] bArr, Map map) {
        this.f9376c.D(true, i4, th, bArr, this.f9374a, this.f9375b);
    }
}
