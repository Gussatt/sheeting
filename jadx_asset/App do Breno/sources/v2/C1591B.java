package v2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import l2.AbstractC1388b;
import o2.C1472a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C1613f;
import w2.C1616i;
import w2.C1617j;

/* JADX INFO: renamed from: v2.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1591B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f11545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11546c;

    /* JADX INFO: renamed from: v2.B$a */
    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            Object obj;
            Bundle bundle;
            if (C1591B.this.f11545b == null) {
                return;
            }
            String str = c1616i.f11879a;
            obj = c1616i.f11880b;
            AbstractC1388b.f("TextInputChannel", "Received '" + str + "' message.");
            str.getClass();
            switch (str) {
                case "TextInput.setPlatformViewClient":
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        C1591B.this.f11545b.f(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        break;
                    } catch (JSONException e4) {
                        dVar.b("error", e4.getMessage(), null);
                        return;
                    }
                    break;
                case "TextInput.setEditingState":
                    try {
                        C1591B.this.f11545b.d(e.a((JSONObject) obj));
                        dVar.a(null);
                        break;
                    } catch (JSONException e5) {
                        dVar.b("error", e5.getMessage(), null);
                        return;
                    }
                    break;
                case "TextInput.setClient":
                    try {
                        JSONArray jSONArray = (JSONArray) obj;
                        C1591B.this.f11545b.c(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                        dVar.a(null);
                        break;
                    } catch (NoSuchFieldException | JSONException e6) {
                        dVar.b("error", e6.getMessage(), null);
                        return;
                    }
                    break;
                case "TextInput.hide":
                    C1591B.this.f11545b.j();
                    dVar.a(null);
                    break;
                case "TextInput.show":
                    C1591B.this.f11545b.a();
                    dVar.a(null);
                    break;
                case "TextInput.sendAppPrivateCommand":
                    try {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        C1591B.this.f11545b.e(string, bundle);
                        dVar.a(null);
                        break;
                    } catch (JSONException e7) {
                        dVar.b("error", e7.getMessage(), null);
                        return;
                    }
                    break;
                case "TextInput.setEditableSizeAndTransform":
                    try {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d4 = jSONObject3.getDouble("width");
                        double d5 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i4 = 0; i4 < 16; i4++) {
                            dArr[i4] = jSONArray2.getDouble(i4);
                        }
                        C1591B.this.f11545b.g(d4, d5, dArr);
                        dVar.a(null);
                        break;
                    } catch (JSONException e8) {
                        dVar.b("error", e8.getMessage(), null);
                        return;
                    }
                    break;
                case "TextInput.finishAutofillContext":
                    C1591B.this.f11545b.i(((Boolean) obj).booleanValue());
                    dVar.a(null);
                    break;
                case "TextInput.clearClient":
                    C1591B.this.f11545b.b();
                    dVar.a(null);
                    break;
                case "TextInput.requestAutofill":
                    C1591B.this.f11545b.h();
                    dVar.a(null);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v2.B$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f11548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f11550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f11551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f11552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f11553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f11554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f11555h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f11556i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f11557j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String[] f11558k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b[] f11559l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Locale[] f11560m;

        /* JADX INFO: renamed from: v2.B$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f11561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String[] f11562b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e f11563c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f11564d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f11561a = str;
                this.f11562b = strArr;
                this.f11564d = str2;
                this.f11563c = eVar;
            }

            public static a a(JSONObject jSONObject) throws JSONException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    strArr[i4] = b(jSONArray.getString(i4));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.String b(java.lang.String r17) {
                /*
                    Method dump skipped, instruction units count: 802
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: v2.C1591B.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr, Locale[] localeArr) {
            this.f11548a = z3;
            this.f11549b = z4;
            this.f11550c = z5;
            this.f11551d = z6;
            this.f11552e = z7;
            this.f11553f = dVar;
            this.f11554g = cVar;
            this.f11555h = num;
            this.f11556i = str;
            this.f11557j = aVar;
            this.f11558k = strArr;
            this.f11559l = bVarArr;
            this.f11560m = localeArr;
        }

        public static b a(JSONObject jSONObject) throws JSONException {
            b[] bVarArr;
            Locale[] localeArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i4 = 0; i4 < length; i4++) {
                    bVarArr2[i4] = a(jSONArray.getJSONObject(i4));
                }
                bVarArr = bVarArr2;
            }
            Integer numB = b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                    arrayList.add(jSONArray2.optString(i5));
                }
            }
            if (jSONObject.isNull("hintLocales")) {
                localeArr = null;
            } else {
                JSONArray jSONArray3 = jSONObject.getJSONArray("hintLocales");
                Locale[] localeArr2 = new Locale[jSONArray3.length()];
                for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                    localeArr2[i6] = Locale.forLanguageTag(jSONArray3.optString(i6));
                }
                localeArr = localeArr2;
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.f(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), numB, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr, localeArr);
        }

        public static Integer b(String str) {
            str.getClass();
            switch (str) {
                case "TextInputAction.unspecified":
                    return 0;
                case "TextInputAction.done":
                    return 6;
                case "TextInputAction.next":
                    return 5;
                case "TextInputAction.none":
                    return 1;
                case "TextInputAction.send":
                    return 4;
                case "TextInputAction.search":
                    return 3;
                case "TextInputAction.go":
                    return 2;
                case "TextInputAction.newline":
                    return 1;
                case "TextInputAction.previous":
                    return 7;
                default:
                    return 0;
            }
        }
    }

    /* JADX INFO: renamed from: v2.B$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f11565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f11567c;

        public c(g gVar, boolean z3, boolean z4) {
            this.f11565a = gVar;
            this.f11566b = z3;
            this.f11567c = z4;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.f(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* JADX INFO: renamed from: v2.B$d */
    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f11573m;

        d(String str) {
            this.f11573m = str;
        }

        public static d f(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f11573m.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* JADX INFO: renamed from: v2.B$e */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11578e;

        public e(String str, int i4, int i5, int i6, int i7) {
            if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i5 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
            }
            if (!(i6 == -1 && i7 == -1) && (i6 < 0 || i6 > i7)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i6) + ", " + String.valueOf(i7) + ")");
            }
            if (i7 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i6));
            }
            if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i4));
            }
            if (i5 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i5));
            }
            this.f11574a = str;
            this.f11575b = i4;
            this.f11576c = i5;
            this.f11577d = i6;
            this.f11578e = i7;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i4 = this.f11577d;
            return i4 >= 0 && this.f11578e > i4;
        }

        public boolean c() {
            return this.f11575b >= 0;
        }
    }

    /* JADX INFO: renamed from: v2.B$f */
    public interface f {
        void a();

        void b();

        void c(int i4, b bVar);

        void d(e eVar);

        void e(String str, Bundle bundle);

        void f(int i4, boolean z3);

        void g(double d4, double d5, double[] dArr);

        void h();

        void i(boolean z3);

        void j();
    }

    /* JADX INFO: renamed from: v2.B$g */
    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f11593m;

        g(String str) {
            this.f11593m = str;
        }

        public static g f(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                if (gVar.f11593m.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public C1591B(C1472a c1472a) {
        a aVar = new a();
        this.f11546c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/textinput", C1613f.f11878a);
        this.f11544a = c1617j;
        c1617j.e(aVar);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((io.flutter.plugin.editing.t) it.next()).b());
        }
        map.put("deltas", jSONArray);
        return map;
    }

    public static HashMap d(String str, int i4, int i5, int i6, int i7) {
        HashMap map = new HashMap();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i4));
        map.put("selectionExtent", Integer.valueOf(i5));
        map.put("composingBase", Integer.valueOf(i6));
        map.put("composingExtent", Integer.valueOf(i7));
        return map;
    }

    public void b(int i4, Map map) {
        AbstractC1388b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.commitContent", map));
    }

    public void e(int i4) {
        AbstractC1388b.f("TextInputChannel", "Sending 'done' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.done"));
    }

    public void f(int i4) {
        AbstractC1388b.f("TextInputChannel", "Sending 'go' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.go"));
    }

    public void g(int i4) {
        AbstractC1388b.f("TextInputChannel", "Sending 'newline' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.newline"));
    }

    public void h(int i4) {
        AbstractC1388b.f("TextInputChannel", "Sending 'next' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.next"));
    }

    public void i(int i4, String str, Bundle bundle) {
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        this.f11544a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i4), map));
    }

    public void j(int i4) {
        AbstractC1388b.f("TextInputChannel", "Sending 'previous' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.previous"));
    }

    public void k() {
        this.f11544a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int i4) {
        AbstractC1388b.f("TextInputChannel", "Sending 'search' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.search"));
    }

    public void m(int i4) {
        AbstractC1388b.f("TextInputChannel", "Sending 'send' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.send"));
    }

    public void n(f fVar) {
        this.f11545b = fVar;
    }

    public void o(int i4) {
        AbstractC1388b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f11544a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i4), "TextInputAction.unspecified"));
    }

    public void p(int i4, String str, int i5, int i6, int i7, int i8) {
        AbstractC1388b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i5 + "\nSelection end: " + i6 + "\nComposing start: " + i7 + "\nComposing end: " + i8);
        this.f11544a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i4), d(str, i5, i6, i7, i8)));
    }

    public void q(int i4, ArrayList arrayList) {
        AbstractC1388b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f11544a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i4), c(arrayList)));
    }

    public void r(int i4, HashMap map) {
        AbstractC1388b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            e eVar = (e) entry.getValue();
            map2.put((String) entry.getKey(), d(eVar.f11574a, eVar.f11575b, eVar.f11576c, -1, -1));
        }
        this.f11544a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i4), map2));
    }
}
