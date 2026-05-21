package z2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import s2.InterfaceC1536a;
import t2.InterfaceC1544a;
import v2.u;
import w2.C1617j;
import w2.InterfaceC1619l;

/* JADX INFO: loaded from: classes.dex */
public class c implements InterfaceC1536a, InterfaceC1544a, InterfaceC1619l, u.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f12109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PackageManager f12110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t2.c f12111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f12112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f12113g = new HashMap();

    public c(u uVar) {
        this.f12109c = uVar;
        this.f12110d = uVar.f11728b;
        uVar.b(this);
    }

    @Override // w2.InterfaceC1619l
    public boolean a(int i4, int i5, Intent intent) {
        if (!this.f12113g.containsKey(Integer.valueOf(i4))) {
            return false;
        }
        ((C1617j.d) this.f12113g.remove(Integer.valueOf(i4))).a(i5 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // v2.u.b
    public void b(String str, String str2, boolean z3, C1617j.d dVar) {
        if (this.f12111e == null) {
            dVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map map = this.f12112f;
        if (map == null) {
            dVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            dVar.b("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = dVar.hashCode();
        this.f12113g.put(Integer.valueOf(iHashCode), dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z3);
        this.f12111e.d().startActivityForResult(intent, iHashCode);
    }

    @Override // t2.InterfaceC1544a
    public void d() {
        this.f12111e.b(this);
        this.f12111e = null;
    }

    @Override // v2.u.b
    public Map e() {
        if (this.f12112f == null) {
            g();
        }
        HashMap map = new HashMap();
        for (String str : this.f12112f.keySet()) {
            map.put(str, ((ResolveInfo) this.f12112f.get(str)).loadLabel(this.f12110d).toString());
        }
        return map;
    }

    @Override // t2.InterfaceC1544a
    public void f(t2.c cVar) {
        this.f12111e = cVar;
        cVar.e(this);
    }

    public final void g() {
        this.f12112f = new HashMap();
        int i4 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (ResolveInfo resolveInfo : i4 >= 33 ? this.f12110d.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : this.f12110d.queryIntentActivities(type, 0)) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.f12110d).toString();
            this.f12112f.put(str, resolveInfo);
        }
    }

    @Override // t2.InterfaceC1544a
    public void h(t2.c cVar) {
        this.f12111e = cVar;
        cVar.e(this);
    }

    @Override // t2.InterfaceC1544a
    public void i() {
        this.f12111e.b(this);
        this.f12111e = null;
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
    }
}
