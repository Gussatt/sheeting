package a2;

import android.content.Context;
import w1.C1604c;
import w1.InterfaceC1605d;
import w1.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C1604c b(String str, String str2) {
        return C1604c.l(f.a(str, str2), f.class);
    }

    public static C1604c c(final String str, final a aVar) {
        return C1604c.m(f.class).b(q.i(Context.class)).e(new w1.g() { // from class: a2.g
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return f.a(str, aVar.a((Context) interfaceC1605d.a(Context.class)));
            }
        }).c();
    }
}
