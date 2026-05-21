package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import c.AbstractC0645i;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4074c;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645i.f5908z1);
        this.f4074c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC0645i.f5694A1, -1);
        this.f4073b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC0645i.f5698B1, -1);
    }
}
