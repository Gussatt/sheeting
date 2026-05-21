package I;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LayoutInflater f2234l;

    public c(Context context, int i4, Cursor cursor, boolean z3) {
        super(context, cursor, z3);
        this.f2233k = i4;
        this.f2232j = i4;
        this.f2234l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // I.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2234l.inflate(this.f2233k, viewGroup, false);
    }

    @Override // I.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2234l.inflate(this.f2232j, viewGroup, false);
    }
}
