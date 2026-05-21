package E1;

import C1.AbstractC0252j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f941b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1.g f942a;

    public class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f943a;

        public a(String str) throws JSONException {
            this.f943a = str;
            put("userId", str);
        }
    }

    public g(I1.g gVar) {
        this.f942a = gVar;
    }

    public static Map e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, p(jSONObject, next));
        }
        return map;
    }

    public static List f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e4) {
                z1.g.f().l("Failed de-serializing rollouts state. " + string, e4);
            }
        }
        return arrayList;
    }

    public static String h(Map map) {
        return new JSONObject(map).toString();
    }

    public static String l(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < list.size(); i4++) {
            try {
                jSONArray.put(new JSONObject(j.f969a.a(list.get(i4))));
            } catch (JSONException e4) {
                z1.g.f().l("Exception parsing rollout assignment!", e4);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void m(File file) {
        if (file.exists() && file.delete()) {
            z1.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            z1.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    public static String o(String str) {
        return new a(str).toString();
    }

    public static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f942a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f942a.q(str, "keys");
    }

    public File c(String str) {
        return this.f942a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f942a.q(str, "user-data");
    }

    public final String g(String str) {
        return p(new JSONObject(str), "userId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    public Map i(String str, boolean z3) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e4;
        File fileA = z3 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            n(fileA, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileA);
                try {
                    Map mapE = e(AbstractC0252j.B(fileInputStream));
                    AbstractC0252j.f(fileInputStream, "Failed to close user metadata file.");
                    return mapE;
                } catch (Exception e5) {
                    e4 = e5;
                    z1.g.f().l("Error deserializing user metadata.", e4);
                    m(fileA);
                    AbstractC0252j.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC0252j.f(, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e6) {
            fileInputStream = null;
            e4 = e6;
        } catch (Throwable th3) {
            ?? r12 = 0;
            th = th3;
            AbstractC0252j.f(r12, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List j(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            n(fileC, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileC);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List listF = f(AbstractC0252j.B(fileInputStream));
            z1.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
            AbstractC0252j.f(fileInputStream, "Failed to close rollouts state file.");
            return listF;
        } catch (Exception e5) {
            e = e5;
            fileInputStream2 = fileInputStream;
            z1.g.f().l("Error deserializing rollouts state.", e);
            m(fileC);
            AbstractC0252j.f(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.EMPTY_LIST;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            AbstractC0252j.f(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public String k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            z1.g.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
            try {
                try {
                    String strG = g(AbstractC0252j.B(fileInputStream));
                    z1.g.f().b("Loaded userId " + strG + " for session " + str);
                    AbstractC0252j.f(fileInputStream, "Failed to close user metadata file.");
                    return strG;
                } catch (Exception e4) {
                    e = e4;
                    z1.g.f().l("Error deserializing user metadata.", e);
                    m(fileD);
                    AbstractC0252j.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                AbstractC0252j.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC0252j.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void q(String str, Map map) throws Throwable {
        r(str, map, false);
    }

    public void r(String str, Map map, boolean z3) throws Throwable {
        String strH;
        BufferedWriter bufferedWriter;
        File fileA = z3 ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strH = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f941b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            bufferedWriter.write(strH);
            bufferedWriter.flush();
            AbstractC0252j.f(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            z1.g.f().l("Error serializing key/value metadata.", e);
            m(fileA);
            AbstractC0252j.f(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC0252j.f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    public void s(String str, List list) throws Throwable {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e4;
        File fileC = c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            n(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strL = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f941b));
                try {
                    bufferedWriter.write(strL);
                    bufferedWriter.flush();
                    AbstractC0252j.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e5) {
                    e4 = e5;
                    z1.g.f().l("Error serializing rollouts state.", e4);
                    m(fileC);
                    AbstractC0252j.f(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC0252j.f(IsEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e6) {
            bufferedWriter = null;
            e4 = e6;
        } catch (Throwable th3) {
            IsEmpty = 0;
            th = th3;
            AbstractC0252j.f(IsEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void t(String str, String str2) throws Throwable {
        String strO;
        BufferedWriter bufferedWriter;
        File fileD = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strO = o(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f941b));
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(strO);
            bufferedWriter.flush();
            AbstractC0252j.f(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            z1.g.f().l("Error serializing user metadata.", e);
            AbstractC0252j.f(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC0252j.f(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
