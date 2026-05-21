package H2;

import android.content.Context;
import android.view.View;
import io.flutter.plugin.platform.AbstractC1080l;
import io.flutter.plugin.platform.InterfaceC1079k;
import w2.C1621n;

/* JADX INFO: renamed from: H2.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0338h0 extends AbstractC1080l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0309d f2053b;

    public C0338h0(C0309d c0309d) {
        super(C1621n.f11891a);
        this.f2053b = c0309d;
    }

    @Override // io.flutter.plugin.platform.AbstractC1080l
    public InterfaceC1079k a(Context context, int i4, Object obj) {
        if (((Integer) obj) == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        Object objH = this.f2053b.h(r3.intValue());
        if (objH instanceof InterfaceC1079k) {
            return (InterfaceC1079k) objH;
        }
        if (objH instanceof View) {
            return new a(objH);
        }
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + objH);
    }

    /* JADX INFO: renamed from: H2.h0$a */
    public class a implements InterfaceC1079k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f2054b;

        public a(Object obj) {
            this.f2054b = obj;
        }

        @Override // io.flutter.plugin.platform.InterfaceC1079k
        public View getView() {
            return (View) this.f2054b;
        }

        @Override // io.flutter.plugin.platform.InterfaceC1079k
        public void a() {
        }
    }
}
