package io.flutter.plugin.editing;

import l2.AbstractC1388b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f7937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f7938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7944h;

    public t(CharSequence charSequence, int i4, int i5, CharSequence charSequence2, int i6, int i7, int i8, int i9) {
        this.f7941e = i6;
        this.f7942f = i7;
        this.f7943g = i8;
        this.f7944h = i9;
        a(charSequence, charSequence2.toString(), i4, i5);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i4, int i5) {
        this.f7937a = charSequence;
        this.f7938b = charSequence2;
        this.f7939c = i4;
        this.f7940d = i5;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f7937a.toString());
            jSONObject.put("deltaText", this.f7938b.toString());
            jSONObject.put("deltaStart", this.f7939c);
            jSONObject.put("deltaEnd", this.f7940d);
            jSONObject.put("selectionBase", this.f7941e);
            jSONObject.put("selectionExtent", this.f7942f);
            jSONObject.put("composingBase", this.f7943g);
            jSONObject.put("composingExtent", this.f7944h);
            return jSONObject;
        } catch (JSONException e4) {
            AbstractC1388b.b("TextEditingDelta", "unable to create JSONObject: " + e4);
            return jSONObject;
        }
    }

    public t(CharSequence charSequence, int i4, int i5, int i6, int i7) {
        this.f7941e = i4;
        this.f7942f = i5;
        this.f7943g = i6;
        this.f7944h = i7;
        a(charSequence, "", -1, -1);
    }
}
