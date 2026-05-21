package n1;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1445l f10672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f10673n;

    public v(w wVar, AbstractC1445l abstractC1445l) {
        this.f10673n = wVar;
        this.f10672m = abstractC1445l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10672m.k()) {
            this.f10673n.f10676c.r();
            return;
        }
        try {
            this.f10673n.f10676c.q(this.f10673n.f10675b.a(this.f10672m));
        } catch (C1443j e4) {
            if (e4.getCause() instanceof Exception) {
                this.f10673n.f10676c.p((Exception) e4.getCause());
            } else {
                this.f10673n.f10676c.p(e4);
            }
        } catch (Exception e5) {
            this.f10673n.f10676c.p(e5);
        }
    }
}
