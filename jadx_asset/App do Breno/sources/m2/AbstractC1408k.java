package m2;

import android.os.Bundle;

/* JADX INFO: renamed from: m2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1408k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10486a = a.opaque.name();

    /* JADX INFO: renamed from: m2.k$a */
    public enum a {
        opaque,
        transparent
    }

    public static boolean a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("flutter_deeplinking_enabled")) {
            return true;
        }
        return bundle.getBoolean("flutter_deeplinking_enabled");
    }
}
