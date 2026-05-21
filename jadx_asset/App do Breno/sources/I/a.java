package I;

import I.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cursor f2223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f2224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0050a f2226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DataSetObserver f2227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I.b f2228i;

    /* JADX INFO: renamed from: I.a$a, reason: collision with other inner class name */
    public class C0050a extends ContentObserver {
        public C0050a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            a.this.i();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f2221b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2221b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z3) {
        f(context, cursor, z3 ? 1 : 2);
    }

    @Override // I.b.a
    public void a(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // I.b.a
    public Cursor b() {
        return this.f2223d;
    }

    @Override // I.b.a
    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i4) {
        if ((i4 & 1) == 1) {
            i4 |= 2;
            this.f2222c = true;
        } else {
            this.f2222c = false;
        }
        boolean z3 = cursor != null;
        this.f2223d = cursor;
        this.f2221b = z3;
        this.f2224e = context;
        this.f2225f = z3 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i4 & 2) == 2) {
            this.f2226g = new C0050a();
            this.f2227h = new b();
        } else {
            this.f2226g = null;
            this.f2227h = null;
        }
        if (z3) {
            C0050a c0050a = this.f2226g;
            if (c0050a != null) {
                cursor.registerContentObserver(c0050a);
            }
            DataSetObserver dataSetObserver = this.f2227h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2221b || (cursor = this.f2223d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f2221b) {
            return null;
        }
        this.f2223d.moveToPosition(i4);
        if (view == null) {
            view = g(this.f2224e, this.f2223d, viewGroup);
        }
        e(view, this.f2224e, this.f2223d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2228i == null) {
            this.f2228i = new I.b(this);
        }
        return this.f2228i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        Cursor cursor;
        if (!this.f2221b || (cursor = this.f2223d) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f2223d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        Cursor cursor;
        if (this.f2221b && (cursor = this.f2223d) != null && cursor.moveToPosition(i4)) {
            return this.f2223d.getLong(this.f2225f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f2221b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f2223d.moveToPosition(i4)) {
            if (view == null) {
                view = h(this.f2224e, this.f2223d, viewGroup);
            }
            e(view, this.f2224e, this.f2223d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i4);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.f2222c || (cursor = this.f2223d) == null || cursor.isClosed()) {
            return;
        }
        this.f2221b = this.f2223d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f2223d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0050a c0050a = this.f2226g;
            if (c0050a != null) {
                cursor2.unregisterContentObserver(c0050a);
            }
            DataSetObserver dataSetObserver = this.f2227h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2223d = cursor;
        if (cursor == null) {
            this.f2225f = -1;
            this.f2221b = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0050a c0050a2 = this.f2226g;
        if (c0050a2 != null) {
            cursor.registerContentObserver(c0050a2);
        }
        DataSetObserver dataSetObserver2 = this.f2227h;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f2225f = cursor.getColumnIndexOrThrow("_id");
        this.f2221b = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
