package m2;

import android.view.KeyEvent;
import java.util.Objects;
import m2.L;
import v2.i;

/* JADX INFO: loaded from: classes.dex */
public class F implements L.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2.i f10377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L.b f10378b = new L.b();

    public F(v2.i iVar) {
        this.f10377a = iVar;
    }

    @Override // m2.L.d
    public void a(KeyEvent keyEvent, final L.d.a aVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            aVar.a(false);
            return;
        }
        i.b bVar = new i.b(keyEvent, this.f10378b.a(keyEvent.getUnicodeChar()));
        boolean z3 = action != 0;
        v2.i iVar = this.f10377a;
        Objects.requireNonNull(aVar);
        iVar.d(bVar, z3, new i.a() { // from class: m2.E
            @Override // v2.i.a
            public final void a(boolean z4) {
                aVar.a(z4);
            }
        });
    }
}
