package c2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f6103a = new t();

    public static /* synthetic */ s b(t tVar, String str, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        if ((i6 & 8) != 0) {
            z3 = false;
        }
        return tVar.a(str, i4, i5, z3);
    }

    public final s a(String str, int i4, int i5, boolean z3) {
        return new s(str, i4, i5, z3);
    }

    public final List c(Context context) {
        X2.l.e(context, "context");
        int i4 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = L2.m.f();
        }
        List listT = L2.u.t(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listT) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(L2.n.m(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            X2.l.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new s(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, X2.l.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final s d(Context context) {
        Object next;
        X2.l.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((s) next).b() == iMyPid) {
                break;
            }
        }
        s sVar = (s) next;
        return sVar == null ? b(this, e(), iMyPid, 0, false, 12, null) : sVar;
    }

    public final String e() throws Throwable {
        String processName;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 33) {
            String strMyProcessName = Process.myProcessName();
            X2.l.d(strMyProcessName, "myProcessName()");
            return strMyProcessName;
        }
        if (i4 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strA = b1.n.a();
        return strA != null ? strA : "";
    }
}
