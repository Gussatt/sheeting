package H2;

import android.content.res.AssetManager;
import s2.InterfaceC1536a;

/* JADX INFO: renamed from: H2.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0324f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f2039a;

    /* JADX INFO: renamed from: H2.f0$a */
    public static class a extends AbstractC0324f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1536a.InterfaceC0172a f2040b;

        public a(AssetManager assetManager, InterfaceC1536a.InterfaceC0172a interfaceC0172a) {
            super(assetManager);
            this.f2040b = interfaceC0172a;
        }

        @Override // H2.AbstractC0324f0
        public String a(String str) {
            return this.f2040b.a(str);
        }
    }

    public AbstractC0324f0(AssetManager assetManager) {
        this.f2039a = assetManager;
    }

    public abstract String a(String str);

    public String[] b(String str) {
        return this.f2039a.list(str);
    }
}
