package z1;

import C1.AbstractC0252j;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f12099b = null;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12101b;

        public b() {
            int iP = AbstractC0252j.p(f.this.f12098a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f12100a = null;
                    this.f12101b = null;
                    return;
                } else {
                    this.f12100a = "Flutter";
                    this.f12101b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f12100a = "Unity";
            String string = f.this.f12098a.getResources().getString(iP);
            this.f12101b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f12098a = context;
    }

    public final boolean c(String str) {
        if (this.f12098a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f12098a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String d() {
        return f().f12100a;
    }

    public String e() {
        return f().f12101b;
    }

    public final b f() {
        if (this.f12099b == null) {
            this.f12099b = new b();
        }
        return this.f12099b;
    }
}
