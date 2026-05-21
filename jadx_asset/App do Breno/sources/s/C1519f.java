package s;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.C1476b;
import s.AbstractC1518e;

/* JADX INFO: renamed from: s.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1519f implements InterfaceC1517d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f11305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1518e.d f11306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RemoteViews f11307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RemoteViews f11308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f11309f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f11310g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RemoteViews f11312i;

    /* JADX INFO: renamed from: s.f$a */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i4, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z3) {
            return builder.setGroupSummary(z3);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z3) {
            return builder.setLocalOnly(z3);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: renamed from: s.f$b */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i4) {
            return builder.setColor(i4);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i4) {
            return builder.setVisibility(i4);
        }
    }

    /* JADX INFO: renamed from: s.f$c */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: renamed from: s.f$d */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
            return builder.setAllowGeneratedReplies(z3);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: renamed from: s.f$e */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setBadgeIconType(i4);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z3) {
            return builder.setColorized(z3);
        }

        public static Notification.Builder d(Notification.Builder builder, int i4) {
            return builder.setGroupAlertBehavior(i4);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j4) {
            return builder.setTimeoutAfter(j4);
        }
    }

    /* JADX INFO: renamed from: s.f$f, reason: collision with other inner class name */
    public static class C0170f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i4) {
            return builder.setSemanticAction(i4);
        }
    }

    /* JADX INFO: renamed from: s.f$g */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z3) {
            return builder.setAllowSystemGeneratedContextualActions(z3);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z3) {
            return builder.setContextual(z3);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: renamed from: s.f$h */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
            return builder.setAuthenticationRequired(z3);
        }

        public static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setForegroundServiceBehavior(i4);
        }
    }

    public C1519f(AbstractC1518e.d dVar) {
        int i4;
        this.f11306c = dVar;
        Context context = dVar.f11274a;
        this.f11304a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11305b = e.a(context, dVar.f11263K);
        } else {
            this.f11305b = new Notification.Builder(dVar.f11274a);
        }
        Notification notification = dVar.f11270R;
        this.f11305b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f11282i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f11278e).setContentText(dVar.f11279f).setContentInfo(dVar.f11284k).setContentIntent(dVar.f11280g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f11281h, (notification.flags & 128) != 0).setNumber(dVar.f11285l).setProgress(dVar.f11293t, dVar.f11294u, dVar.f11295v);
        Notification.Builder builder = this.f11305b;
        IconCompat iconCompat = dVar.f11283j;
        c.b(builder, iconCompat == null ? null : iconCompat.k(context));
        this.f11305b.setSubText(dVar.f11290q).setUsesChronometer(dVar.f11288o).setPriority(dVar.f11286m);
        Iterator it = dVar.f11275b.iterator();
        while (it.hasNext()) {
            b((AbstractC1518e.a) it.next());
        }
        Bundle bundle = dVar.f11256D;
        if (bundle != null) {
            this.f11310g.putAll(bundle);
        }
        int i5 = Build.VERSION.SDK_INT;
        this.f11307d = dVar.f11260H;
        this.f11308e = dVar.f11261I;
        this.f11305b.setShowWhen(dVar.f11287n);
        a.i(this.f11305b, dVar.f11299z);
        a.g(this.f11305b, dVar.f11296w);
        a.j(this.f11305b, dVar.f11298y);
        a.h(this.f11305b, dVar.f11297x);
        this.f11311h = dVar.f11267O;
        b.b(this.f11305b, dVar.f11255C);
        b.c(this.f11305b, dVar.f11257E);
        b.f(this.f11305b, dVar.f11258F);
        b.d(this.f11305b, dVar.f11259G);
        b.e(this.f11305b, notification.sound, notification.audioAttributes);
        List listE = i5 < 28 ? e(f(dVar.f11276c), dVar.f11273U) : dVar.f11273U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                b.a(this.f11305b, (String) it2.next());
            }
        }
        this.f11312i = dVar.f11262J;
        if (dVar.f11277d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i6 = 0; i6 < dVar.f11277d.size(); i6++) {
                bundle4.putBundle(Integer.toString(i6), AbstractC1520g.a((AbstractC1518e.a) dVar.f11277d.get(i6)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f11310g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = dVar.f11272T;
        if (obj != null) {
            c.c(this.f11305b, obj);
        }
        this.f11305b.setExtras(dVar.f11256D);
        d.e(this.f11305b, dVar.f11292s);
        RemoteViews remoteViews = dVar.f11260H;
        if (remoteViews != null) {
            d.c(this.f11305b, remoteViews);
        }
        RemoteViews remoteViews2 = dVar.f11261I;
        if (remoteViews2 != null) {
            d.b(this.f11305b, remoteViews2);
        }
        RemoteViews remoteViews3 = dVar.f11262J;
        if (remoteViews3 != null) {
            d.d(this.f11305b, remoteViews3);
        }
        if (i7 >= 26) {
            e.b(this.f11305b, dVar.f11264L);
            e.e(this.f11305b, dVar.f11291r);
            e.f(this.f11305b, dVar.f11265M);
            e.g(this.f11305b, dVar.f11266N);
            e.d(this.f11305b, dVar.f11267O);
            if (dVar.f11254B) {
                e.c(this.f11305b, dVar.f11253A);
            }
            if (!TextUtils.isEmpty(dVar.f11263K)) {
                this.f11305b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it3 = dVar.f11276c.iterator();
            if (it3.hasNext()) {
                i.d.a(it3.next());
                throw null;
            }
        }
        if (i7 >= 29) {
            g.a(this.f11305b, dVar.f11269Q);
            g.b(this.f11305b, AbstractC1518e.c.a(null));
        }
        if (i7 >= 31 && (i4 = dVar.f11268P) != 0) {
            h.b(this.f11305b, i4);
        }
        if (dVar.f11271S) {
            if (this.f11306c.f11297x) {
                this.f11311h = 2;
            } else {
                this.f11311h = 1;
            }
            this.f11305b.setVibrate(null);
            this.f11305b.setSound(null);
            int i8 = notification.defaults & (-4);
            notification.defaults = i8;
            this.f11305b.setDefaults(i8);
            if (i7 >= 26) {
                if (TextUtils.isEmpty(this.f11306c.f11296w)) {
                    a.g(this.f11305b, "silent");
                }
                e.d(this.f11305b, this.f11311h);
            }
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C1476b c1476b = new C1476b(list.size() + list2.size());
        c1476b.addAll(list);
        c1476b.addAll(list2);
        return new ArrayList(c1476b);
    }

    public static List f(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        i.d.a(it.next());
        throw null;
    }

    @Override // s.InterfaceC1517d
    public Notification.Builder a() {
        return this.f11305b;
    }

    public final void b(AbstractC1518e.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.j() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : AbstractC1523j.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i4 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i4 >= 28) {
            C0170f.b(builderA, aVar.f());
        }
        if (i4 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i4 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f11305b, a.d(builderA));
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        AbstractC1518e.AbstractC0169e abstractC0169e = this.f11306c.f11289p;
        if (abstractC0169e != null) {
            abstractC0169e.b(this);
        }
        RemoteViews remoteViewsE = abstractC0169e != null ? abstractC0169e.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f11306c.f11260H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (abstractC0169e != null && (remoteViewsD = abstractC0169e.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (abstractC0169e != null && (remoteViewsF = this.f11306c.f11289p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (abstractC0169e != null && (bundleA = AbstractC1518e.a(notificationD)) != null) {
            abstractC0169e.a(bundleA);
        }
        return notificationD;
    }

    public Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f11305b.build();
        }
        Notification notificationBuild = this.f11305b.build();
        if (this.f11311h != 0) {
            if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f11311h == 2) {
                g(notificationBuild);
            }
            if (a.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f11311h == 1) {
                g(notificationBuild);
            }
        }
        return notificationBuild;
    }

    public final void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
