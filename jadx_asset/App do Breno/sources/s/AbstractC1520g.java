package s;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import s.AbstractC1518e;

/* JADX INFO: renamed from: s.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1520g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11313a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11314b = new Object();

    public static Bundle a(AbstractC1518e.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.c() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(AbstractC1523j abstractC1523j) {
        new Bundle();
        throw null;
    }

    public static Bundle[] c(AbstractC1523j[] abstractC1523jArr) {
        if (abstractC1523jArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[abstractC1523jArr.length];
        for (int i4 = 0; i4 < abstractC1523jArr.length; i4++) {
            AbstractC1523j abstractC1523j = abstractC1523jArr[i4];
            bundleArr[i4] = b(null);
        }
        return bundleArr;
    }
}
