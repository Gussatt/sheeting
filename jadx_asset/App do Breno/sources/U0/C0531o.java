package U0;

import n1.AbstractC1445l;
import n1.C1446m;
import n1.InterfaceC1439f;

/* JADX INFO: renamed from: U0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0531o implements InterfaceC1439f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1446m f3589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0532p f3590b;

    public C0531o(C0532p c0532p, C1446m c1446m) {
        this.f3590b = c0532p;
        this.f3589a = c1446m;
    }

    @Override // n1.InterfaceC1439f
    public final void a(AbstractC1445l abstractC1445l) {
        this.f3590b.f3592b.remove(this.f3589a);
    }
}
