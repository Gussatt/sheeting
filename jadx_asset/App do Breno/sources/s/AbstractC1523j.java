package s;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: s.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1523j {

    /* JADX INFO: renamed from: s.j$a */
    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(AbstractC1523j abstractC1523j) {
            throw null;
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static RemoteInput a(AbstractC1523j abstractC1523j) {
        return a.b(abstractC1523j);
    }

    public static RemoteInput[] b(AbstractC1523j[] abstractC1523jArr) {
        if (abstractC1523jArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[abstractC1523jArr.length];
        for (int i4 = 0; i4 < abstractC1523jArr.length; i4++) {
            AbstractC1523j abstractC1523j = abstractC1523jArr[i4];
            remoteInputArr[i4] = a(null);
        }
        return remoteInputArr;
    }
}
