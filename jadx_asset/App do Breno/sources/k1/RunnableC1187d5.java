package k1;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: k1.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1187d5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1143C f9399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9400n;

    public RunnableC1187d5(C1238j5 c1238j5, C1143C c1143c) {
        this.f9399m = c1143c;
        this.f9400n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1238j5 c1238j5 = this.f9400n;
        C1363z3 c1363z3 = c1238j5.f9366a;
        Z2 z2H = c1363z3.H();
        C1363z3 c1363z32 = z2H.f9366a;
        z2H.h();
        C1143C c1143cS = z2H.s();
        C1143C c1143c = this.f9399m;
        if (!C1229i4.s(c1143c.a(), c1143cS.a())) {
            c1363z3.c().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c1143c.a()));
            return;
        }
        SharedPreferences.Editor editorEdit = z2H.p().edit();
        editorEdit.putString("dma_consent_settings", c1143c.j());
        editorEdit.apply();
        c1363z3.c().v().b("Setting DMA consent(FE)", c1143c);
        C1363z3 c1363z33 = c1238j5.f9366a;
        if (c1363z33.O().P()) {
            c1363z33.O().H();
        } else {
            c1363z33.O().E(false);
        }
    }
}
