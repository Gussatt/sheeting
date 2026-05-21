package S;

import R.AbstractComponentCallbacksC0497o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3364n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, String str) {
        super(abstractComponentCallbacksC0497o, "Attempting to reuse fragment " + abstractComponentCallbacksC0497o + " with previous ID " + str);
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        X2.l.e(str, "previousFragmentId");
        this.f3364n = str;
    }
}
