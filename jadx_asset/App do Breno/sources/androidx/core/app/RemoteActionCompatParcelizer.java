package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import j0.AbstractC1106a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1106a abstractC1106a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f4569a = (IconCompat) abstractC1106a.v(remoteActionCompat.f4569a, 1);
        remoteActionCompat.f4570b = abstractC1106a.l(remoteActionCompat.f4570b, 2);
        remoteActionCompat.f4571c = abstractC1106a.l(remoteActionCompat.f4571c, 3);
        remoteActionCompat.f4572d = (PendingIntent) abstractC1106a.r(remoteActionCompat.f4572d, 4);
        remoteActionCompat.f4573e = abstractC1106a.h(remoteActionCompat.f4573e, 5);
        remoteActionCompat.f4574f = abstractC1106a.h(remoteActionCompat.f4574f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1106a abstractC1106a) {
        abstractC1106a.x(false, false);
        abstractC1106a.M(remoteActionCompat.f4569a, 1);
        abstractC1106a.D(remoteActionCompat.f4570b, 2);
        abstractC1106a.D(remoteActionCompat.f4571c, 3);
        abstractC1106a.H(remoteActionCompat.f4572d, 4);
        abstractC1106a.z(remoteActionCompat.f4573e, 5);
        abstractC1106a.z(remoteActionCompat.f4574f, 6);
    }
}
