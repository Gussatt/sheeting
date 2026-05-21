package A0;

import A0.d;
import B0.n;
import B0.o;
import B0.p;
import B0.q;
import B0.r;
import B0.s;
import B0.t;
import B0.u;
import B0.v;
import B0.w;
import B0.x;
import C0.h;
import C0.i;
import D0.f;
import D0.g;
import D0.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O1.a f18a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f19b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f21d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M0.a f22e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M0.a f23f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f25a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f26b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f27c;

        public a(URL url, n nVar, String str) {
            this.f25a = url;
            this.f26b = nVar;
            this.f27c = str;
        }

        public a a(URL url) {
            return new a(url, this.f26b, this.f27c);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f29b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f30c;

        public b(int i4, URL url, long j4) {
            this.f28a = i4;
            this.f29b = url;
            this.f30c = j4;
        }
    }

    public d(Context context, M0.a aVar, M0.a aVar2, int i4) {
        this.f18a = n.b();
        this.f20c = context;
        this.f19b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f21d = n(A0.a.f9c);
        this.f22e = aVar2;
        this.f23f = aVar;
        this.f24g = i4;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f29b;
        if (url == null) {
            return null;
        }
        G0.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f29b);
    }

    public static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.f();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.f();
        }
        if (w.b.d(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.f() : networkInfo.getType();
    }

    public static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            G0.a.d("CctTransportBackend", "Unable to find version code for package", e4);
            return -1;
        }
    }

    public static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException("Invalid url: " + str, e4);
        }
    }

    @Override // D0.m
    public g a(f fVar) {
        n nVarJ = j(fVar);
        URL urlN = this.f21d;
        if (fVar.c() != null) {
            try {
                A0.a aVarD = A0.a.d(fVar.c());
                strE = aVarD.e() != null ? aVarD.e() : null;
                if (aVarD.f() != null) {
                    urlN = n(aVarD.f());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) H0.b.a(5, new a(urlN, nVarJ, strE), new H0.a() { // from class: A0.b
                @Override // H0.a
                public final Object apply(Object obj) {
                    return this.f17a.e((d.a) obj);
                }
            }, new H0.c() { // from class: A0.c
                @Override // H0.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i4 = bVar.f28a;
            if (i4 == 200) {
                return g.e(bVar.f30c);
            }
            if (i4 < 500 && i4 != 404) {
                return i4 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e4) {
            G0.a.d("CctTransportBackend", "Could not make request to the backend", e4);
            return g.f();
        }
    }

    @Override // D0.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f19b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f20c)).c("application_build", Integer.toString(i(this.f20c))).d();
    }

    public final b e(a aVar) throws IOException {
        G0.a.f("CctTransportBackend", "Making request to: %s", aVar.f25a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f25a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f24g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f27c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f18a.b(aVar.f26b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    G0.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    G0.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    G0.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (O1.c e4) {
            e = e4;
            G0.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e5) {
            e = e5;
            G0.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e6) {
            e = e6;
            G0.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e7) {
            e = e7;
            G0.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final n j(f fVar) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strN = iVar.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f23f.a()).h(this.f22e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(B0.a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                C1661b c1661bB = hVarE.b();
                if (c1661bB.equals(C1661b.b("proto"))) {
                    aVarL = t.l(hVarE.a());
                } else if (c1661bB.equals(C1661b.b("json"))) {
                    aVarL = t.k(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    G0.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c1661bB);
                }
                aVarL.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.d(iVar3.i("net-type"))).b(w.b.d(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarL.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a aVarA = q.a();
                    if (iVar3.g() != null) {
                        aVarA.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        aVarA.c(iVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return n.a(arrayList2);
    }

    public d(Context context, M0.a aVar, M0.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
