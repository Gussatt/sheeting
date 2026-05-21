package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f4154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4155c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflater f4158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4159g;

    public c(d dVar, LayoutInflater layoutInflater, boolean z3, int i4) {
        this.f4157e = z3;
        this.f4158f = layoutInflater;
        this.f4154b = dVar;
        this.f4159g = i4;
        a();
    }

    public void a() {
        e eVarT = this.f4154b.t();
        if (eVarT != null) {
            ArrayList arrayListV = this.f4154b.v();
            int size = arrayListV.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((e) arrayListV.get(i4)) == eVarT) {
                    this.f4155c = i4;
                    return;
                }
            }
        }
        this.f4155c = -1;
    }

    public d b() {
        return this.f4154b;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e getItem(int i4) {
        ArrayList arrayListV = this.f4157e ? this.f4154b.v() : this.f4154b.A();
        int i5 = this.f4155c;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (e) arrayListV.get(i4);
    }

    public void d(boolean z3) {
        this.f4156d = z3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4155c < 0 ? (this.f4157e ? this.f4154b.v() : this.f4154b.A()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4158f.inflate(this.f4159g, viewGroup, false);
        }
        int groupId = getItem(i4).getGroupId();
        int i5 = i4 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f4154b.B() && groupId != (i5 >= 0 ? getItem(i5).getGroupId() : groupId));
        h.a aVar = (h.a) view;
        if (this.f4156d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i4), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
