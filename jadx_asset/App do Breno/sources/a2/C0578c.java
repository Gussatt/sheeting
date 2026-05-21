package a2;

import java.util.Iterator;
import java.util.Set;
import w1.C1604c;
import w1.InterfaceC1605d;
import w1.q;

/* JADX INFO: renamed from: a2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0578c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f4047b;

    public C0578c(Set set, d dVar) {
        this.f4046a = d(set);
        this.f4047b = dVar;
    }

    public static /* synthetic */ i b(InterfaceC1605d interfaceC1605d) {
        return new C0578c(interfaceC1605d.b(f.class), d.a());
    }

    public static C1604c c() {
        return C1604c.c(i.class).b(q.m(f.class)).e(new w1.g() { // from class: a2.b
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return C0578c.b(interfaceC1605d);
            }
        }).c();
    }

    public static String d(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // a2.i
    public String a() {
        if (this.f4047b.b().isEmpty()) {
            return this.f4046a;
        }
        return this.f4046a + ' ' + d(this.f4047b.b());
    }
}
