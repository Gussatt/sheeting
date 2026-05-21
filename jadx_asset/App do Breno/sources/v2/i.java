package v2;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import l2.AbstractC1388b;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C1608a;
import w2.C1612e;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1608a f11607a;

    public interface a {
        void a(boolean z3);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyEvent f11608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Character f11609b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f11608a = keyEvent;
            this.f11609b = ch;
        }
    }

    public i(InterfaceC1609b interfaceC1609b) {
        this.f11607a = new C1608a(interfaceC1609b, "flutter/keyevent", C1612e.f11877a);
    }

    public static /* synthetic */ void a(a aVar, Object obj) {
        boolean z3 = false;
        if (obj != null) {
            try {
                z3 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e4) {
                AbstractC1388b.b("KeyEventChannel", "Unable to unpack JSON message: " + e4);
            }
        }
        aVar.a(z3);
    }

    public static C1608a.e b(final a aVar) {
        return new C1608a.e() { // from class: v2.h
            @Override // w2.C1608a.e
            public final void a(Object obj) {
                i.a(aVar, obj);
            }
        };
    }

    public final Map c(b bVar, boolean z3) {
        HashMap map = new HashMap();
        map.put("type", z3 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(bVar.f11608a.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(bVar.f11608a.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(bVar.f11608a.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(bVar.f11608a.getKeyCode()));
        map.put("scanCode", Integer.valueOf(bVar.f11608a.getScanCode()));
        map.put("metaState", Integer.valueOf(bVar.f11608a.getMetaState()));
        Character ch = bVar.f11609b;
        if (ch != null) {
            map.put("character", ch.toString());
        }
        map.put("source", Integer.valueOf(bVar.f11608a.getSource()));
        map.put("deviceId", Integer.valueOf(bVar.f11608a.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(bVar.f11608a.getRepeatCount()));
        return map;
    }

    public void d(b bVar, boolean z3, a aVar) {
        this.f11607a.d(c(bVar, z3), b(aVar));
    }
}
