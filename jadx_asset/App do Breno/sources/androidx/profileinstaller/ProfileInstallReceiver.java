package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.c;
import b0.ExecutorC0628k;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class a implements c.InterfaceC0099c {
        public a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0099c
        public void a(int i4, Object obj) {
            c.f5142b.a(i4, obj);
        }

        @Override // androidx.profileinstaller.c.InterfaceC0099c
        public void b(int i4, Object obj) {
            c.f5142b.b(i4, obj);
            ProfileInstallReceiver.this.setResultCode(i4);
        }
    }

    public static void a(c.InterfaceC0099c interfaceC0099c) {
        Process.sendSignal(Process.myPid(), 10);
        interfaceC0099c.b(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            c.j(context, new ExecutorC0628k(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    c.k(context, new ExecutorC0628k(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        c.c(context, new ExecutorC0628k(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.b(16, null);
        }
    }
}
