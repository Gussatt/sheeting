package V0;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f3657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f3658b;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f3657a = uri;
        f3658b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
