package S;

import R.AbstractComponentCallbacksC0497o;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbstractComponentCallbacksC0497o f3384m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, String str) {
        super(str);
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        this.f3384m = abstractComponentCallbacksC0497o;
    }

    public final AbstractComponentCallbacksC0497o a() {
        return this.f3384m;
    }
}
