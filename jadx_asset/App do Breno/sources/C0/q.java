package C0;

import java.util.Set;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public final class q implements z0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f492c;

    public q(Set set, p pVar, t tVar) {
        this.f490a = set;
        this.f491b = pVar;
        this.f492c = tVar;
    }

    @Override // z0.i
    public z0.h a(String str, Class cls, C1661b c1661b, z0.g gVar) {
        if (this.f490a.contains(c1661b)) {
            return new s(this.f491b, str, c1661b, gVar, this.f492c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c1661b, this.f490a));
    }
}
