package H1;

import D1.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f1704c = new HashMap();

    public a(String str, Map map) {
        this.f1702a = str;
        this.f1703b = map;
    }

    public final String a(Map map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        return sb.toString();
    }

    public final String b(String str, Map map) {
        String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strA;
        }
        if (!str.endsWith("&")) {
            strA = "&" + strA;
        }
        return str + strA;
    }

    public c c() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        f.d();
        InputStream inputStream = null;
        String strE = null;
        inputStream = null;
        try {
            String strB = b(this.f1702a, this.f1703b);
            g.f().i("GET Request URL: " + strB);
            httpsURLConnection = (HttpsURLConnection) new URL(strB).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f1704c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strE = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, strE);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f1704c.put(str, str2);
        return this;
    }

    public final String e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = bufferedReader.read(cArr);
            if (i4 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i4);
        }
    }
}
