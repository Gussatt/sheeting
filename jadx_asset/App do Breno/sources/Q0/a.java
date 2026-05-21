package Q0;

import V0.AbstractC0549h;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lock f2919c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f2920d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f2921a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f2922b;

    public a(Context context) {
        this.f2922b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        AbstractC0549h.j(context);
        Lock lock = f2919c;
        lock.lock();
        try {
            if (f2920d == null) {
                f2920d = new a(context.getApplicationContext());
            }
            a aVar = f2920d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f2919c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.t(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String c(String str) {
        this.f2921a.lock();
        try {
            return this.f2922b.getString(str, null);
        } finally {
            this.f2921a.unlock();
        }
    }
}
