package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.s;
import f0.C0938a;
import f0.InterfaceC0939b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0939b {
    @Override // f0.InterfaceC0939b
    public List a() {
        return L2.m.f();
    }

    @Override // f0.InterfaceC0939b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j b(Context context) {
        X2.l.e(context, "context");
        C0938a c0938aD = C0938a.d(context);
        X2.l.d(c0938aD, "getInstance(context)");
        if (!c0938aD.e(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C0610g.a(context);
        s.b bVar = s.f5010j;
        bVar.b(context);
        return bVar.a();
    }
}
