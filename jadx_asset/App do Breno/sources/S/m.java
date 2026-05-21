package S;

import R.AbstractComponentCallbacksC0497o;

/* JADX INFO: loaded from: classes.dex */
public final class m extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AbstractComponentCallbacksC0497o f3386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3387o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o2, int i4) {
        super(abstractComponentCallbacksC0497o, "Attempting to nest fragment " + abstractComponentCallbacksC0497o + " within the view of parent fragment " + abstractComponentCallbacksC0497o2 + " via container with ID " + i4 + " without using parent's childFragmentManager");
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        X2.l.e(abstractComponentCallbacksC0497o2, "expectedParentFragment");
        this.f3386n = abstractComponentCallbacksC0497o2;
        this.f3387o = i4;
    }
}
