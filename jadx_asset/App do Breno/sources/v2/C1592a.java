package v2;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.h;
import java.util.HashMap;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1608a;
import w2.C1621n;

/* JADX INFO: renamed from: v2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1592a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1608a f11594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f11595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f11596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1608a.d f11597d;

    /* JADX INFO: renamed from: v2.a$a, reason: collision with other inner class name */
    public class C0179a implements C1608a.d {
        public C0179a() {
        }

        @Override // w2.C1608a.d
        public void a(Object obj, C1608a.e eVar) {
            HashMap map;
            HashMap map2;
            if (C1592a.this.f11596c == null) {
                eVar.a(null);
                return;
            }
            map = (HashMap) obj;
            String str = (String) map.get("type");
            map2 = (HashMap) map.get("data");
            AbstractC1388b.f("AccessibilityChannel", "Received " + str + " message.");
            str.getClass();
            switch (str) {
                case "tooltip":
                    String str2 = (String) map2.get("message");
                    if (str2 != null) {
                        C1592a.this.f11596c.e(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) map2.get("message");
                    if (str3 != null) {
                        C1592a.this.f11596c.a(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) map.get("nodeId");
                    if (num != null) {
                        C1592a.this.f11596c.h(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) map.get("nodeId");
                    if (num2 != null) {
                        C1592a.this.f11596c.f(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) map.get("nodeId");
                    if (num3 != null) {
                        C1592a.this.f11596c.g(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    /* JADX INFO: renamed from: v2.a$b */
    public interface b extends FlutterJNI.a {
        void a(String str);

        void e(String str);

        void f(int i4);

        void g(int i4);

        void h(int i4);
    }

    public C1592a(C1472a c1472a, FlutterJNI flutterJNI) {
        C0179a c0179a = new C0179a();
        this.f11597d = c0179a;
        C1608a c1608a = new C1608a(c1472a, "flutter/accessibility", C1621n.f11891a);
        this.f11594a = c1608a;
        c1608a.e(c0179a);
        this.f11595b = flutterJNI;
    }

    public void b(int i4, h.g gVar) {
        this.f11595b.dispatchSemanticsAction(i4, gVar);
    }

    public void c(int i4, h.g gVar, Object obj) {
        this.f11595b.dispatchSemanticsAction(i4, gVar, obj);
    }

    public void d() {
        this.f11595b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f11595b.setSemanticsEnabled(true);
    }

    public void f(int i4) {
        this.f11595b.setAccessibilityFeatures(i4);
    }

    public void g(b bVar) {
        this.f11596c = bVar;
        this.f11595b.setAccessibilityDelegate(bVar);
    }
}
