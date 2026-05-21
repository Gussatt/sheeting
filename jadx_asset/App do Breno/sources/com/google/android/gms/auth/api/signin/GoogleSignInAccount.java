package com.google.android.gms.auth.api.signin;

import V0.AbstractC0549h;
import W0.a;
import W0.c;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b1.d;
import b1.g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new P0.a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f6158z = g.d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f6161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f6163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Uri f6164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f6165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f6166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f6167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f6168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Set f6171y = new HashSet();

    public GoogleSignInAccount(int i4, String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, List list, String str7, String str8) {
        this.f6159m = i4;
        this.f6160n = str;
        this.f6161o = str2;
        this.f6162p = str3;
        this.f6163q = str4;
        this.f6164r = uri;
        this.f6165s = str5;
        this.f6166t = j4;
        this.f6167u = str6;
        this.f6168v = list;
        this.f6169w = str7;
        this.f6170x = str8;
    }

    public static GoogleSignInAccount s(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l4, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l4.longValue(), AbstractC0549h.d(str7), new ArrayList((Collection) AbstractC0549h.j(set)), str5, str6);
    }

    public static GoogleSignInAccount t(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j4 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(jSONArray.getString(i4)));
        }
        GoogleSignInAccount googleSignInAccountS = s(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j4), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountS.f6165s = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountS;
    }

    public String d() {
        return this.f6163q;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f6167u.equals(this.f6167u) && googleSignInAccount.o().equals(o());
    }

    public String f() {
        return this.f6162p;
    }

    public String g() {
        return this.f6170x;
    }

    public String h() {
        return this.f6169w;
    }

    public int hashCode() {
        return ((this.f6167u.hashCode() + 527) * 31) + o().hashCode();
    }

    public String i() {
        return this.f6160n;
    }

    public String k() {
        return this.f6161o;
    }

    public Uri l() {
        return this.f6164r;
    }

    public Set o() {
        HashSet hashSet = new HashSet(this.f6168v);
        hashSet.addAll(this.f6171y);
        return hashSet;
    }

    public String p() {
        return this.f6165s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int iA = c.a(parcel);
        c.j(parcel, 1, this.f6159m);
        c.p(parcel, 2, i(), false);
        c.p(parcel, 3, k(), false);
        c.p(parcel, 4, f(), false);
        c.p(parcel, 5, d(), false);
        c.o(parcel, 6, l(), i4, false);
        c.p(parcel, 7, p(), false);
        c.m(parcel, 8, this.f6166t);
        c.p(parcel, 9, this.f6167u, false);
        c.s(parcel, 10, this.f6168v, false);
        c.p(parcel, 11, h(), false);
        c.p(parcel, 12, g(), false);
        c.b(parcel, iA);
    }
}
