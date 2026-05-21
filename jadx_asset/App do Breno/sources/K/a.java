package K;

import X2.l;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String str) {
        l.e(context, "<this>");
        l.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + str);
    }
}
