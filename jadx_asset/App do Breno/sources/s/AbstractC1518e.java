package s;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: renamed from: s.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1518e {

    /* JADX INFO: renamed from: s.e$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f11240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f11241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC1523j[] f11242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractC1523j[] f11243d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f11244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f11245f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f11246g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f11247h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f11248i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f11249j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f11250k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f11251l;

        public a(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i4 != 0 ? IconCompat.b(null, "", i4) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f11250k;
        }

        public boolean b() {
            return this.f11244e;
        }

        public Bundle c() {
            return this.f11240a;
        }

        public IconCompat d() {
            int i4;
            if (this.f11241b == null && (i4 = this.f11248i) != 0) {
                this.f11241b = IconCompat.b(null, "", i4);
            }
            return this.f11241b;
        }

        public AbstractC1523j[] e() {
            return this.f11242c;
        }

        public int f() {
            return this.f11246g;
        }

        public boolean g() {
            return this.f11245f;
        }

        public CharSequence h() {
            return this.f11249j;
        }

        public boolean i() {
            return this.f11251l;
        }

        public boolean j() {
            return this.f11247h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, AbstractC1523j[] abstractC1523jArr, AbstractC1523j[] abstractC1523jArr2, boolean z3, int i4, boolean z4, boolean z5, boolean z6) {
            this.f11245f = true;
            this.f11241b = iconCompat;
            if (iconCompat != null && iconCompat.e() == 2) {
                this.f11248i = iconCompat.c();
            }
            this.f11249j = d.d(charSequence);
            this.f11250k = pendingIntent;
            this.f11240a = bundle == null ? new Bundle() : bundle;
            this.f11242c = abstractC1523jArr;
            this.f11243d = abstractC1523jArr2;
            this.f11244e = z3;
            this.f11246g = i4;
            this.f11245f = z4;
            this.f11247h = z5;
            this.f11251l = z6;
        }
    }

    /* JADX INFO: renamed from: s.e$b */
    public static class b extends AbstractC0169e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f11252e;

        @Override // s.AbstractC1518e.AbstractC0169e
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // s.AbstractC1518e.AbstractC0169e
        public void b(InterfaceC1517d interfaceC1517d) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC1517d.a()).setBigContentTitle(this.f11301b).bigText(this.f11252e);
            if (this.f11303d) {
                bigTextStyleBigText.setSummaryText(this.f11302c);
            }
        }

        @Override // s.AbstractC1518e.AbstractC0169e
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f11252e = d.d(charSequence);
            return this;
        }
    }

    /* JADX INFO: renamed from: s.e$c */
    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0169e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f11300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f11301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f11302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11303d = false;

        public void a(Bundle bundle) {
            if (this.f11303d) {
                bundle.putCharSequence("android.summaryText", this.f11302c);
            }
            CharSequence charSequence = this.f11301b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(InterfaceC1517d interfaceC1517d);

        public abstract String c();

        public RemoteViews d(InterfaceC1517d interfaceC1517d) {
            return null;
        }

        public RemoteViews e(InterfaceC1517d interfaceC1517d) {
            return null;
        }

        public RemoteViews f(InterfaceC1517d interfaceC1517d) {
            return null;
        }

        public void g(d dVar) {
            if (this.f11300a != dVar) {
                this.f11300a = dVar;
                if (dVar != null) {
                    dVar.n(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    /* JADX INFO: renamed from: s.e$d */
    public static class d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public boolean f11253A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f11254B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public String f11255C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public Bundle f11256D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f11257E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f11258F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public Notification f11259G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public RemoteViews f11260H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public RemoteViews f11261I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public RemoteViews f11262J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public String f11263K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f11264L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f11265M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public long f11266N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f11267O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f11268P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public boolean f11269Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public Notification f11270R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public boolean f11271S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public Object f11272T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public ArrayList f11273U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f11274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f11275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f11276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f11277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f11278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f11279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PendingIntent f11280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f11281h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public RemoteViews f11282i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public IconCompat f11283j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f11284k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f11285l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f11286m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f11287n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f11288o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public AbstractC0169e f11289p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public CharSequence f11290q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public CharSequence f11291r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence[] f11292s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11293t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11294u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f11295v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f11296w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f11297x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f11298y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f11299z;

        public d(Context context, String str) {
            this.f11275b = new ArrayList();
            this.f11276c = new ArrayList();
            this.f11277d = new ArrayList();
            this.f11287n = true;
            this.f11299z = false;
            this.f11257E = 0;
            this.f11258F = 0;
            this.f11264L = 0;
            this.f11267O = 0;
            this.f11268P = 0;
            Notification notification = new Notification();
            this.f11270R = notification;
            this.f11274a = context;
            this.f11263K = str;
            notification.when = System.currentTimeMillis();
            this.f11270R.audioStreamType = -1;
            this.f11286m = 0;
            this.f11273U = new ArrayList();
            this.f11269Q = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public d a(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f11275b.add(new a(i4, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new C1519f(this).c();
        }

        public Bundle c() {
            if (this.f11256D == null) {
                this.f11256D = new Bundle();
            }
            return this.f11256D;
        }

        public d e(boolean z3) {
            j(16, z3);
            return this;
        }

        public d f(String str) {
            this.f11263K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f11280g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f11279f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f11278e = d(charSequence);
            return this;
        }

        public final void j(int i4, boolean z3) {
            if (z3) {
                Notification notification = this.f11270R;
                notification.flags = i4 | notification.flags;
            } else {
                Notification notification2 = this.f11270R;
                notification2.flags = (~i4) & notification2.flags;
            }
        }

        public d k(boolean z3) {
            this.f11299z = z3;
            return this;
        }

        public d l(int i4) {
            this.f11286m = i4;
            return this;
        }

        public d m(int i4) {
            this.f11270R.icon = i4;
            return this;
        }

        public d n(AbstractC0169e abstractC0169e) {
            if (this.f11289p != abstractC0169e) {
                this.f11289p = abstractC0169e;
                if (abstractC0169e != null) {
                    abstractC0169e.g(this);
                }
            }
            return this;
        }

        public d o(CharSequence charSequence) {
            this.f11270R.tickerText = d(charSequence);
            return this;
        }

        public d p(long j4) {
            this.f11270R.when = j4;
            return this;
        }

        public d(Context context) {
            this(context, null);
        }
    }
}
