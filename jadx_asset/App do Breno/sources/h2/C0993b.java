package h2;

import android.content.Intent;
import android.util.Log;
import s2.InterfaceC1536a;
import t2.InterfaceC1544a;
import t2.c;
import w2.C1610c;
import w2.C1616i;
import w2.C1617j;
import w2.InterfaceC1620m;

/* JADX INFO: renamed from: h2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0993b implements InterfaceC1536a, C1617j.c, C1610c.d, InterfaceC1544a, InterfaceC1620m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1617j f7483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1610c f7484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1610c.b f7485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f7486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7488h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f7489i;

    @Override // w2.C1610c.d
    public void a(Object obj, C1610c.b bVar) {
        String str;
        this.f7485e = bVar;
        if (this.f7488h || (str = this.f7487g) == null) {
            return;
        }
        this.f7488h = true;
        bVar.a(str);
    }

    @Override // w2.InterfaceC1620m
    public boolean b(Intent intent) {
        return j(intent);
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        C1617j c1617j = new C1617j(bVar.b(), "com.llfbandit.app_links/messages");
        this.f7483c = c1617j;
        c1617j.e(this);
        C1610c c1610c = new C1610c(bVar.b(), "com.llfbandit.app_links/events");
        this.f7484d = c1610c;
        c1610c.d(this);
    }

    @Override // t2.InterfaceC1544a
    public void d() {
        c cVar = this.f7486f;
        if (cVar != null) {
            cVar.c(this);
        }
        this.f7486f = null;
    }

    @Override // w2.C1610c.d
    public void e(Object obj) {
        this.f7485e = null;
    }

    @Override // t2.InterfaceC1544a
    public void f(c cVar) {
        this.f7486f = cVar;
        cVar.a(this);
    }

    @Override // w2.C1617j.c
    public void g(C1616i c1616i, C1617j.d dVar) {
        if (c1616i.f11879a.equals("getLatestLink")) {
            dVar.a(this.f7489i);
        } else if (c1616i.f11879a.equals("getInitialLink")) {
            dVar.a(this.f7487g);
        } else {
            dVar.c();
        }
    }

    @Override // t2.InterfaceC1544a
    public void h(c cVar) {
        this.f7486f = cVar;
        cVar.a(this);
        j(cVar.d().getIntent());
    }

    @Override // t2.InterfaceC1544a
    public void i() {
        d();
    }

    public final boolean j(Intent intent) {
        String strA;
        if (intent == null) {
            return false;
        }
        Log.d("com.llfbandit.app_links", intent.toString());
        if ((intent.getFlags() & 1048576) == 1048576 || (strA = AbstractC0992a.a(intent)) == null) {
            return false;
        }
        if (this.f7487g == null) {
            this.f7487g = strA;
        }
        this.f7489i = strA;
        C1610c.b bVar = this.f7485e;
        if (bVar != null) {
            this.f7488h = true;
            bVar.a(strA);
        }
        return true;
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        this.f7483c.e(null);
        this.f7484d.d(null);
    }
}
