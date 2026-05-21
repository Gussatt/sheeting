package H;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class e extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ListView f1695t;

    public e(ListView listView) {
        super(listView);
        this.f1695t = listView;
    }

    @Override // H.a
    public boolean a(int i4) {
        return false;
    }

    @Override // H.a
    public boolean b(int i4) {
        ListView listView = this.f1695t;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i5 = firstVisiblePosition + childCount;
        if (i4 > 0) {
            if (i5 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i4 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // H.a
    public void j(int i4, int i5) {
        this.f1695t.scrollListBy(i5);
    }
}
