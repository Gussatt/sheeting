package m2;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.m;
import java.util.HashSet;
import java.util.Map;
import l2.AbstractC1388b;
import v2.j;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public class L implements m.a, j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d[] f10412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f10413b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f10414c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10415a = 0;

        public Character a(int i4) {
            char c4 = (char) i4;
            if ((Integer.MIN_VALUE & i4) != 0) {
                int i5 = i4 & Integer.MAX_VALUE;
                int i6 = this.f10415a;
                if (i6 != 0) {
                    this.f10415a = KeyCharacterMap.getDeadChar(i6, i5);
                } else {
                    this.f10415a = i5;
                }
            } else {
                int i7 = this.f10415a;
                if (i7 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i7, i4);
                    if (deadChar > 0) {
                        c4 = (char) deadChar;
                    }
                    this.f10415a = 0;
                }
            }
            return Character.valueOf(c4);
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyEvent f10416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10418c = false;

        public class a implements d.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f10420a;

            public a() {
                this.f10420a = false;
            }

            @Override // m2.L.d.a
            public void a(boolean z3) {
                if (this.f10420a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f10420a = true;
                c cVar = c.this;
                int i4 = cVar.f10417b - 1;
                cVar.f10417b = i4;
                boolean z4 = z3 | cVar.f10418c;
                cVar.f10418c = z4;
                if (i4 != 0 || z4) {
                    return;
                }
                L.this.e(cVar.f10416a);
            }
        }

        public c(KeyEvent keyEvent) {
            this.f10417b = L.this.f10412a.length;
            this.f10416a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z3);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        InterfaceC1609b getBinaryMessenger();
    }

    public L(e eVar) {
        this.f10414c = eVar;
        this.f10412a = new d[]{new K(eVar.getBinaryMessenger()), new F(new v2.i(eVar.getBinaryMessenger()))};
        new v2.j(eVar.getBinaryMessenger()).b(this);
    }

    @Override // v2.j.b
    public Map a() {
        return ((K) this.f10412a[0]).h();
    }

    @Override // io.flutter.plugin.editing.m.a
    public boolean b(KeyEvent keyEvent) {
        if (this.f10413b.remove(keyEvent)) {
            return false;
        }
        if (this.f10412a.length <= 0) {
            e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f10412a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void d() {
        int size = this.f10413b.size();
        if (size > 0) {
            AbstractC1388b.g("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
        }
    }

    public final void e(KeyEvent keyEvent) {
        e eVar = this.f10414c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.f10413b.add(keyEvent);
        this.f10414c.a(keyEvent);
        if (this.f10413b.remove(keyEvent)) {
            AbstractC1388b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }
}
