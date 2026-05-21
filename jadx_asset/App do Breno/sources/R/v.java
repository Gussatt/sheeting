package R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class v implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f3308b;

    public v(B b4) {
        this.f3308b = b4;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (C0500s.class.getName().equals(str)) {
            return new C0500s(context, attributeSet, this.f3308b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q.c.f2912a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(Q.c.f2913b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Q.c.f2914c, -1);
        String string = typedArrayObtainStyledAttributes.getString(Q.c.f2915d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC0501t.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oP = resourceId != -1 ? this.f3308b.P(resourceId) : null;
        if (abstractComponentCallbacksC0497oP == null && string != null) {
            abstractComponentCallbacksC0497oP = this.f3308b.Q(string);
        }
        if (abstractComponentCallbacksC0497oP == null && id != -1) {
            abstractComponentCallbacksC0497oP = this.f3308b.P(id);
        }
        if (abstractComponentCallbacksC0497oP == null) {
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oA = this.f3308b.a0().a(context.getClassLoader(), attributeValue);
            abstractComponentCallbacksC0497oA.f3262q = true;
            if (resourceId == 0) {
                resourceId = id;
            }
            abstractComponentCallbacksC0497oA.f3270y = resourceId;
            abstractComponentCallbacksC0497oA.f3271z = id;
            abstractComponentCallbacksC0497oA.f3219A = string;
            abstractComponentCallbacksC0497oA.f3263r = true;
            B b4 = this.f3308b;
            abstractComponentCallbacksC0497oA.f3267v = b4;
            b4.b0();
            this.f3308b.b0();
            throw null;
        }
        if (!abstractComponentCallbacksC0497oP.f3263r) {
            abstractComponentCallbacksC0497oP.f3263r = true;
            B b5 = this.f3308b;
            abstractComponentCallbacksC0497oP.f3267v = b5;
            b5.b0();
            this.f3308b.b0();
            throw null;
        }
        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
    }
}
