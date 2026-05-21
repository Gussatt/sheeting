package l0;

import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f10233a;

    public q(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f10233a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // l0.p
    public String[] a() {
        return this.f10233a.getSupportedFeatures();
    }

    @Override // l0.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) v3.a.a(StaticsBoundaryInterface.class, this.f10233a.getStatics());
    }

    @Override // l0.p
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) v3.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f10233a.getWebkitToCompatConverter());
    }
}
