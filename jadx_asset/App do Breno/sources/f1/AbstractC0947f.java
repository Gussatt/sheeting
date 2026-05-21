package f1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import t.AbstractC1537a;

/* JADX INFO: renamed from: f1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0947f extends AbstractC1537a {
    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (AbstractC0945d.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != AbstractC0945d.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
