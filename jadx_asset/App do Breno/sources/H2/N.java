package H2;

import H2.Y3;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import k0.AbstractC1138b;

/* JADX INFO: loaded from: classes.dex */
public final class N extends C0295b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f1812d;

    public N(P p4) {
        X2.l.e(p4, "registrar");
        this.f1812d = p4;
    }

    public static final K2.p U(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p V(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p W(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p X(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p Y(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p Z(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p a0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p b0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p c0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p d0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p e0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p f0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p g0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p h0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p i0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p j0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p k0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p l0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p m0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p n0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p o0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p p0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p q0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p r0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p s0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p t0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p u0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p v0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p w0(K2.j jVar) {
        return K2.p.f2516a;
    }

    public static final K2.p x0(K2.j jVar) {
        return K2.p.f2516a;
    }

    @Override // H2.C0295b, w2.C1621n
    public Object g(byte b4, ByteBuffer byteBuffer) {
        X2.l.e(byteBuffer, "buffer");
        if (b4 != -128) {
            return super.g(b4, byteBuffer);
        }
        Object objF = f(byteBuffer);
        X2.l.c(objF, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objF).longValue();
        Object objH = this.f1812d.d().h(jLongValue);
        if (objH == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return objH;
    }

    @Override // H2.C0295b, w2.C1621n
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        X2.l.e(byteArrayOutputStream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof EnumC0310d0) || (obj instanceof U) || (obj instanceof EnumC0389p0) || (obj instanceof W3) || obj == null) {
            super.p(byteArrayOutputStream, obj);
            return;
        }
        if (obj instanceof WebResourceRequest) {
            this.f1812d.A().g((WebResourceRequest) obj, new W2.l() { // from class: H2.j
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.U((K2.j) obj2);
                }
            });
        } else if (obj instanceof WebResourceResponse) {
            this.f1812d.B().c((WebResourceResponse) obj, new W2.l() { // from class: H2.l
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.V((K2.j) obj2);
                }
            });
        } else if (obj instanceof WebResourceError) {
            this.f1812d.y().e((WebResourceError) obj, new W2.l() { // from class: H2.x
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.g0((K2.j) obj2);
                }
            });
        } else if (obj instanceof AbstractC1138b) {
            this.f1812d.z().e((AbstractC1138b) obj, new W2.l() { // from class: H2.y
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.r0((K2.j) obj2);
                }
            });
        } else if (obj instanceof E5) {
            this.f1812d.G().c((E5) obj, new W2.l() { // from class: H2.z
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.s0((K2.j) obj2);
                }
            });
        } else if (obj instanceof ConsoleMessage) {
            this.f1812d.h().f((ConsoleMessage) obj, new W2.l() { // from class: H2.A
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.t0((K2.j) obj2);
                }
            });
        } else if (obj instanceof CookieManager) {
            this.f1812d.i().d((CookieManager) obj, new W2.l() { // from class: H2.B
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.u0((K2.j) obj2);
                }
            });
        } else if (obj instanceof WebView) {
            this.f1812d.E().t((WebView) obj, new W2.l() { // from class: H2.C
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.v0((K2.j) obj2);
                }
            });
        } else if (obj instanceof WebSettings) {
            this.f1812d.C().d((WebSettings) obj, new W2.l() { // from class: H2.D
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.w0((K2.j) obj2);
                }
            });
        } else if (obj instanceof C0371m0) {
            this.f1812d.p().d((C0371m0) obj, new W2.l() { // from class: H2.E
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.x0((K2.j) obj2);
                }
            });
        } else if (obj instanceof WebViewClient) {
            this.f1812d.F().Y((WebViewClient) obj, new W2.l() { // from class: H2.u
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.W((K2.j) obj2);
                }
            });
        } else if (obj instanceof DownloadListener) {
            this.f1812d.k().f((DownloadListener) obj, new W2.l() { // from class: H2.F
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.X((K2.j) obj2);
                }
            });
        } else if (obj instanceof Y3.b) {
            this.f1812d.x().J((Y3.b) obj, new W2.l() { // from class: H2.G
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.Y((K2.j) obj2);
                }
            });
        } else if (obj instanceof AbstractC0324f0) {
            this.f1812d.m().f((AbstractC0324f0) obj, new W2.l() { // from class: H2.H
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.Z((K2.j) obj2);
                }
            });
        } else if (obj instanceof WebStorage) {
            this.f1812d.D().e((WebStorage) obj, new W2.l() { // from class: H2.I
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.a0((K2.j) obj2);
                }
            });
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            this.f1812d.l().g((WebChromeClient.FileChooserParams) obj, new W2.l() { // from class: H2.J
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.b0((K2.j) obj2);
                }
            });
        } else if (obj instanceof PermissionRequest) {
            this.f1812d.q().e((PermissionRequest) obj, new W2.l() { // from class: H2.K
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.c0((K2.j) obj2);
                }
            });
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            this.f1812d.j().d((WebChromeClient.CustomViewCallback) obj, new W2.l() { // from class: H2.L
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.d0((K2.j) obj2);
                }
            });
        } else if (obj instanceof View) {
            this.f1812d.w().d((View) obj, new W2.l() { // from class: H2.M
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.e0((K2.j) obj2);
                }
            });
        } else if (obj instanceof GeolocationPermissions.Callback) {
            this.f1812d.n().d((GeolocationPermissions.Callback) obj, new W2.l() { // from class: H2.k
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.f0((K2.j) obj2);
                }
            });
        } else if (obj instanceof HttpAuthHandler) {
            this.f1812d.o().d((HttpAuthHandler) obj, new W2.l() { // from class: H2.m
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.h0((K2.j) obj2);
                }
            });
        } else if (obj instanceof Message) {
            this.f1812d.e().c((Message) obj, new W2.l() { // from class: H2.n
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.i0((K2.j) obj2);
                }
            });
        } else if (obj instanceof ClientCertRequest) {
            this.f1812d.g().e((ClientCertRequest) obj, new W2.l() { // from class: H2.o
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.j0((K2.j) obj2);
                }
            });
        } else if (obj instanceof PrivateKey) {
            this.f1812d.r().c((PrivateKey) obj, new W2.l() { // from class: H2.p
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.k0((K2.j) obj2);
                }
            });
        } else if (obj instanceof X509Certificate) {
            this.f1812d.H().c((X509Certificate) obj, new W2.l() { // from class: H2.q
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.l0((K2.j) obj2);
                }
            });
        } else if (obj instanceof SslErrorHandler) {
            this.f1812d.v().d((SslErrorHandler) obj, new W2.l() { // from class: H2.r
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.m0((K2.j) obj2);
                }
            });
        } else if (obj instanceof SslError) {
            this.f1812d.u().f((SslError) obj, new W2.l() { // from class: H2.s
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.n0((K2.j) obj2);
                }
            });
        } else if (obj instanceof SslCertificate.DName) {
            this.f1812d.t().g((SslCertificate.DName) obj, new W2.l() { // from class: H2.t
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.o0((K2.j) obj2);
                }
            });
        } else if (obj instanceof SslCertificate) {
            this.f1812d.s().h((SslCertificate) obj, new W2.l() { // from class: H2.v
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.p0((K2.j) obj2);
                }
            });
        } else if (obj instanceof Certificate) {
            this.f1812d.f().d((Certificate) obj, new W2.l() { // from class: H2.w
                @Override // W2.l
                public final Object k(Object obj2) {
                    return N.q0((K2.j) obj2);
                }
            });
        }
        if (this.f1812d.d().f(obj)) {
            byteArrayOutputStream.write(128);
            p(byteArrayOutputStream, this.f1812d.d().g(obj));
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + '\'');
    }
}
