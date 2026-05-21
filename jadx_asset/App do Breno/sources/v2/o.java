package v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l2.AbstractC1388b;
import o2.C1472a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C1613f;
import w2.C1617j;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f11637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11638c;

    public class a implements C1617j.c {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
        @Override // w2.C1617j.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void g(w2.C1616i r6, w2.C1617j.d r7) {
            /*
                Method dump skipped, instruction units count: 756
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v2.o.a.g(w2.i, w2.j$d):void");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11641b;

        public b(int i4, String str) {
            this.f11640a = i4;
            this.f11641b = str;
        }
    }

    public enum c {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f11645m;

        c(String str) {
            this.f11645m = str;
        }

        public static c f(String str) throws NoSuchFieldException {
            for (c cVar : values()) {
                if (cVar.f11645m.equals(str)) {
                    return cVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum d {
        PLAIN_TEXT("text/plain");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f11648m;

        d(String str) {
            this.f11648m = str;
        }

        public static d f(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f11648m.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum e {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f11654m;

        e(String str) {
            this.f11654m = str;
        }

        public static e f(String str) throws NoSuchFieldException {
            for (e eVar : values()) {
                if (eVar.f11654m.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum f {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f11661m;

        f(String str) {
            this.f11661m = str;
        }

        public static f f(String str) throws NoSuchFieldException {
            for (f fVar : values()) {
                String str2 = fVar.f11661m;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface g {
        void a();

        void b(List list);

        void c(j jVar);

        void d(h hVar);

        void e(b bVar);

        void f();

        void g(boolean z3);

        void h(i iVar);

        void i();

        void j(String str);

        void k(int i4);

        void l(String str);

        void m(f fVar);

        boolean n();

        CharSequence o(d dVar);
    }

    public enum h {
        CLICK("SystemSoundType.click"),
        TICK("SystemSoundType.tick"),
        ALERT("SystemSoundType.alert");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f11666m;

        h(String str) {
            this.f11666m = str;
        }

        public static h f(String str) throws NoSuchFieldException {
            for (h hVar : values()) {
                if (hVar.f11666m.equals(str)) {
                    return hVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f11667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f11668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f11669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f11670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f11671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f11672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f11673g;

        public i(Integer num, c cVar, Boolean bool, Integer num2, c cVar2, Integer num3, Boolean bool2) {
            this.f11667a = num;
            this.f11668b = cVar;
            this.f11669c = bool;
            this.f11670d = num2;
            this.f11671e = cVar2;
            this.f11672f = num3;
            this.f11673g = bool2;
        }
    }

    public enum j {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f11679m;

        j(String str) {
            this.f11679m = str;
        }

        public static j f(String str) throws NoSuchFieldException {
            for (j jVar : values()) {
                if (jVar.f11679m.equals(str)) {
                    return jVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum k {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f11683m;

        k(String str) {
            this.f11683m = str;
        }

        public static k f(String str) throws NoSuchFieldException {
            for (k kVar : values()) {
                if (kVar.f11683m.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public o(C1472a c1472a) {
        a aVar = new a();
        this.f11638c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/platform", C1613f.f11878a);
        this.f11636a = c1617j;
        c1617j.e(aVar);
    }

    public final b g(JSONObject jSONObject) throws JSONException {
        int i4 = jSONObject.getInt("primaryColor");
        if (i4 != 0) {
            i4 |= -16777216;
        }
        return new b(i4, jSONObject.getString("label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(org.json.JSONArray r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r8.length()
            r5 = 2
            r6 = 1
            if (r1 >= r4) goto L33
            java.lang.String r4 = r8.getString(r1)
            v2.o$e r4 = v2.o.e.f(r4)
            int r4 = r4.ordinal()
            if (r4 == 0) goto L2b
            if (r4 == r6) goto L28
            if (r4 == r5) goto L25
            r5 = 3
            if (r4 == r5) goto L22
            goto L2d
        L22:
            r2 = r2 | 8
            goto L2d
        L25:
            r2 = r2 | 2
            goto L2d
        L28:
            r2 = r2 | 4
            goto L2d
        L2b:
            r2 = r2 | 1
        L2d:
            if (r3 != 0) goto L30
            r3 = r2
        L30:
            int r1 = r1 + 1
            goto L4
        L33:
            if (r2 == 0) goto L53
            r8 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L52;
                case 3: goto L48;
                case 4: goto L47;
                case 5: goto L45;
                case 6: goto L48;
                case 7: goto L48;
                case 8: goto L44;
                case 9: goto L48;
                case 10: goto L41;
                case 11: goto L40;
                case 12: goto L48;
                case 13: goto L48;
                case 14: goto L48;
                case 15: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L4f
        L3d:
            r8 = 13
            return r8
        L40:
            return r5
        L41:
            r8 = 11
            return r8
        L44:
            return r1
        L45:
            r8 = 12
        L47:
            return r8
        L48:
            if (r3 == r5) goto L52
            r0 = 4
            if (r3 == r0) goto L51
            if (r3 == r1) goto L50
        L4f:
            return r6
        L50:
            return r1
        L51:
            return r8
        L52:
            return r0
        L53:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.o.h(org.json.JSONArray):int");
    }

    public final i i(JSONObject jSONObject) {
        return new i(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? c.f(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? c.f(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public final j j(String str) {
        int iOrdinal = j.f(str).ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j.EDGE_TO_EDGE : j.EDGE_TO_EDGE : j.IMMERSIVE_STICKY : j.IMMERSIVE : j.LEAN_BACK;
    }

    public final List k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            int iOrdinal = k.f(jSONArray.getString(i4)).ordinal();
            if (iOrdinal == 0) {
                arrayList.add(k.TOP_OVERLAYS);
            } else if (iOrdinal == 1) {
                arrayList.add(k.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void l(g gVar) {
        this.f11637b = gVar;
    }

    public void m(boolean z3) {
        AbstractC1388b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f11636a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z3)));
    }
}
