package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.d;
import k.a0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements d.b, h, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4087d = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f4088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4089c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean a(e eVar) {
        return this.f4088b.H(eVar, 0);
    }

    public int getWindowAnimations() {
        return this.f4089c;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        a((e) getAdapter().getItem(i4));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a0 a0VarR = a0.r(context, attributeSet, f4087d, i4, 0);
        if (a0VarR.o(0)) {
            setBackgroundDrawable(a0VarR.f(0));
        }
        if (a0VarR.o(1)) {
            setDivider(a0VarR.f(1));
        }
        a0VarR.s();
    }
}
