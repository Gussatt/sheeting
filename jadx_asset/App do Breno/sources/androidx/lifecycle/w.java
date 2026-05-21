package androidx.lifecycle;

import androidx.lifecycle.AbstractC0609f;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC0611h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f5026a;

    public w(y yVar) {
        X2.l.e(yVar, "provider");
        this.f5026a = yVar;
    }

    @Override // androidx.lifecycle.InterfaceC0611h
    public void a(j jVar, AbstractC0609f.a aVar) {
        X2.l.e(jVar, "source");
        X2.l.e(aVar, "event");
        if (aVar == AbstractC0609f.a.ON_CREATE) {
            jVar.h().c(this);
            this.f5026a.c();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
