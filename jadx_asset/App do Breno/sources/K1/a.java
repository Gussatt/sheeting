package K1;

import C1.AbstractC0252j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f2457a;

    public a(I1.g gVar) {
        this.f2457a = gVar.g("com.crashlytics.settings.json");
    }

    public final File a() {
        return this.f2457a;
    }

    public JSONObject b() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        z1.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(AbstractC0252j.B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e4) {
                        e = e4;
                        z1.g.f().e("Failed to fetch cached settings", e);
                        AbstractC0252j.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    z1.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC0252j.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                AbstractC0252j.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            AbstractC0252j.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j4, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        z1.g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j4);
                    fileWriter = new FileWriter(a());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e4) {
                e = e4;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                AbstractC0252j.f(fileWriter, "Failed to close settings writer.");
            } catch (Exception e5) {
                e = e5;
                fileWriter2 = fileWriter;
                z1.g.f().e("Failed to cache settings", e);
                AbstractC0252j.f(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                AbstractC0252j.f(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
