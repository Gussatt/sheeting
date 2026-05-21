package X1;

import V0.AbstractC0549h;
import V1.i;
import X1.d;
import X1.f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import b1.AbstractC0633a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import n1.AbstractC1448o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f3947d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f3948e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U1.b f3950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f3951c = new e();

    public c(Context context, U1.b bVar) {
        this.f3949a = context;
        this.f3950b = bVar;
    }

    public static String a(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    public static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static boolean i(int i4) {
        return i4 >= 200 && i4 < 300;
    }

    public static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    public static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String strO = o(httpURLConnection);
        if (TextUtils.isEmpty(strO)) {
            return;
        }
        Log.w("Firebase-Installations", strO);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    public static long m(String str) {
        AbstractC0549h.b(f3947d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static String o(HttpURLConnection httpURLConnection) {
        StringBuilder sb;
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f3948e));
        try {
            try {
                sb = new StringBuilder();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }

    public static void s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public d d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        d dVarN;
        if (!this.f3951c.b()) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        URL urlG = g(String.format("projects/%s/installations", str3));
        for (int i4 = 0; i4 <= 1; i4++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionL = l(urlG, str);
            try {
                try {
                    httpURLConnectionL.setRequestMethod("POST");
                    httpURLConnectionL.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionL.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(httpURLConnectionL, str2, str4);
                    responseCode = httpURLConnectionL.getResponseCode();
                    this.f3951c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (i(responseCode)) {
                    dVarN = n(httpURLConnectionL);
                } else {
                    k(httpURLConnectionL, str4, str, str3);
                    if (responseCode == 429) {
                        throw new i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", i.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        j();
                        dVarN = d.a().e(d.b.BAD_CONFIG).a();
                    }
                    httpURLConnectionL.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionL.disconnect();
                TrafficStats.clearThreadStatsTag();
                return dVarN;
            } catch (Throwable th) {
                httpURLConnectionL.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public f e(String str, String str2, String str3, String str4) {
        int responseCode;
        f fVarP;
        if (!this.f3951c.b()) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        URL urlG = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i4 = 0; i4 <= 1; i4++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionL = l(urlG, str);
            try {
                try {
                    httpURLConnectionL.setRequestMethod("POST");
                    httpURLConnectionL.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionL.setDoOutput(true);
                    r(httpURLConnectionL);
                    responseCode = httpURLConnectionL.getResponseCode();
                    this.f3951c.f(responseCode);
                } finally {
                    httpURLConnectionL.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (i(responseCode)) {
                fVarP = p(httpURLConnectionL);
            } else {
                k(httpURLConnectionL, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    fVarP = f.a().b(f.b.AUTH_ERROR).a();
                } else {
                    if (responseCode == 429) {
                        throw new i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", i.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        j();
                        fVarP = f.a().b(f.b.BAD_CONFIG).a();
                    }
                }
            }
            return fVarP;
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final String f() {
        try {
            Context context = this.f3949a;
            byte[] bArrA = AbstractC0633a.a(context, context.getPackageName());
            if (bArrA != null) {
                return b1.i.b(bArrA, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f3949a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("ContentValues", "No such package: " + this.f3949a.getPackageName(), e4);
            return null;
        }
    }

    public final URL g(String str) throws i {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e4) {
            throw new i(e4.getMessage(), i.a.UNAVAILABLE);
        }
    }

    public final HttpURLConnection l(URL url, String str) throws i {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f3949a.getPackageName());
            T1.i iVar = (T1.i) this.f3950b.get();
            if (iVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) AbstractC1448o.a(iVar.a()));
                } catch (InterruptedException e4) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e4);
                } catch (ExecutionException e5) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e5);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
    }

    public final d n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f3948e));
        f.a aVarA = f.a();
        d.a aVarA2 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarA2.f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarA2.c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarA2.d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarA.c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarA.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarA2.b(aVarA.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA2.e(d.b.OK).a();
    }

    public final f p(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f3948e));
        f.a aVarA = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarA.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarA.b(f.b.OK).a();
    }

    public final void q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        s(httpURLConnection, h(b(str, str2)));
    }

    public final void r(HttpURLConnection httpURLConnection) throws IOException {
        s(httpURLConnection, h(c()));
    }
}
