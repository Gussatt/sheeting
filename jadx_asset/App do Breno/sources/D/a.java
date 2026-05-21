package D;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f783c;

    public a(int i4, t tVar, int i5) {
        this.f781a = i4;
        this.f782b = tVar;
        this.f783c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f781a);
        this.f782b.T(this.f783c, bundle);
    }
}
