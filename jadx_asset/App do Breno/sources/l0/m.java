package l0;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import k0.AbstractC1138b;
import l0.AbstractC1380a;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class m extends AbstractC1138b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebResourceError f10167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f10168b;

    public m(InvocationHandler invocationHandler) {
        this.f10168b = (WebResourceErrorBoundaryInterface) v3.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    @Override // k0.AbstractC1138b
    public CharSequence a() {
        AbstractC1380a.b bVar = n.f10225v;
        if (bVar.c()) {
            return AbstractC1381b.a(d());
        }
        if (bVar.d()) {
            return c().getDescription();
        }
        throw n.a();
    }

    @Override // k0.AbstractC1138b
    public int b() {
        AbstractC1380a.b bVar = n.f10226w;
        if (bVar.c()) {
            return AbstractC1381b.b(d());
        }
        if (bVar.d()) {
            return c().getErrorCode();
        }
        throw n.a();
    }

    public final WebResourceErrorBoundaryInterface c() {
        if (this.f10168b == null) {
            this.f10168b = (WebResourceErrorBoundaryInterface) v3.a.a(WebResourceErrorBoundaryInterface.class, o.c().d(this.f10167a));
        }
        return this.f10168b;
    }

    public final WebResourceError d() {
        if (this.f10167a == null) {
            this.f10167a = o.c().c(Proxy.getInvocationHandler(this.f10168b));
        }
        return this.f10167a;
    }

    public m(WebResourceError webResourceError) {
        this.f10167a = webResourceError;
    }
}
