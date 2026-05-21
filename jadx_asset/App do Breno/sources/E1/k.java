package E1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f970a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f971b;

    public k(int i4) {
        this.f971b = i4;
    }

    public List a() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < listB.size(); i4++) {
            arrayList.add(((j) listB.get(i4)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return Collections.unmodifiableList(new ArrayList(this.f970a));
    }

    public synchronized boolean c(List list) {
        this.f970a.clear();
        if (list.size() <= this.f971b) {
            return this.f970a.addAll(list);
        }
        z1.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f971b);
        return this.f970a.addAll(list.subList(0, this.f971b));
    }
}
