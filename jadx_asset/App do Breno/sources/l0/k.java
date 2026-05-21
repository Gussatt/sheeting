package l0;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import k0.AbstractC1137a;
import l0.AbstractC1380a;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class k extends AbstractC1137a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f10162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f10163b;

    public k(InvocationHandler invocationHandler) {
        this.f10163b = (SafeBrowsingResponseBoundaryInterface) v3.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    @Override // k0.AbstractC1137a
    public void a(boolean z3) {
        AbstractC1380a.f fVar = n.f10229z;
        if (fVar.c()) {
            f.a(c(), z3);
        } else {
            if (!fVar.d()) {
                throw n.a();
            }
            b().showInterstitial(z3);
        }
    }

    public final SafeBrowsingResponseBoundaryInterface b() {
        if (this.f10163b == null) {
            this.f10163b = (SafeBrowsingResponseBoundaryInterface) v3.a.a(SafeBrowsingResponseBoundaryInterface.class, o.c().b(this.f10162a));
        }
        return this.f10163b;
    }

    public final SafeBrowsingResponse c() {
        if (this.f10162a == null) {
            this.f10162a = o.c().a(Proxy.getInvocationHandler(this.f10163b));
        }
        return this.f10162a;
    }

    public k(SafeBrowsingResponse safeBrowsingResponse) {
        this.f10162a = safeBrowsingResponse;
    }
}
