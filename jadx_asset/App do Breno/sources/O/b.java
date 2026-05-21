package O;

import X2.l;
import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String str) {
        l.e(context, "<this>");
        l.e(str, "name");
        return K.a.a(context, str + ".preferences_pb");
    }
}
