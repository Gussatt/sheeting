package S;

import R.AbstractComponentCallbacksC0497o;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class l extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ViewGroup f3385n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, ViewGroup viewGroup) {
        super(abstractComponentCallbacksC0497o, "Attempting to add fragment " + abstractComponentCallbacksC0497o + " to container " + viewGroup + " which is not a FragmentContainerView");
        X2.l.e(abstractComponentCallbacksC0497o, "fragment");
        X2.l.e(viewGroup, "container");
        this.f3385n = viewGroup;
    }
}
