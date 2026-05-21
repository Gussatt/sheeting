package androidx.lifecycle;

import androidx.lifecycle.AbstractC0609f;
import androidx.lifecycle.C0604a;

/* JADX INFO: loaded from: classes.dex */
public class t implements InterfaceC0611h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0604a.C0095a f5023b;

    public t(Object obj) {
        this.f5022a = obj;
        this.f5023b = C0604a.f4960c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0611h
    public void a(j jVar, AbstractC0609f.a aVar) {
        this.f5023b.a(jVar, aVar, this.f5022a);
    }
}
