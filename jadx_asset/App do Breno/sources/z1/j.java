package z1;

import F1.F;
import L2.m;
import L2.n;
import L2.u;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f12106a = new j();

    public static /* synthetic */ F.e.d.a.c c(j jVar, String str, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        if ((i6 & 8) != 0) {
            z3 = false;
        }
        return jVar.b(str, i4, i5, z3);
    }

    public final F.e.d.a.c a(String str, int i4, int i5) {
        X2.l.e(str, "processName");
        return c(this, str, i4, i5, false, 8, null);
    }

    public final F.e.d.a.c b(String str, int i4, int i5, boolean z3) {
        X2.l.e(str, "processName");
        F.e.d.a.c cVarA = F.e.d.a.c.a().e(str).d(i4).c(i5).b(z3).a();
        X2.l.d(cVarA, "builder()\n      .setProc…ltProcess)\n      .build()");
        return cVarA;
    }

    public final List d(Context context) {
        X2.l.e(context, "context");
        int i4 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = m.f();
        }
        List listT = u.t(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listT) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.m(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(X2.l.a(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final F.e.d.a.c e(Context context) {
        Object next;
        X2.l.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((F.e.d.a.c) next).c() == iMyPid) {
                break;
            }
        }
        F.e.d.a.c cVar = (F.e.d.a.c) next;
        return cVar == null ? c(this, f(), iMyPid, 0, false, 12, null) : cVar;
    }

    public final String f() {
        String processName;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 <= 33) {
            return (i4 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        X2.l.d(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }
}
