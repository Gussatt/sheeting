package l0;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f10234a;

    public s(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f10234a = webkitToCompatConverterBoundaryInterface;
    }

    public SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return r.a(this.f10234a.convertSafeBrowsingResponse(invocationHandler));
    }

    public InvocationHandler b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f10234a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public WebResourceError c(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f10234a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler d(WebResourceError webResourceError) {
        return this.f10234a.convertWebResourceError(webResourceError);
    }
}
