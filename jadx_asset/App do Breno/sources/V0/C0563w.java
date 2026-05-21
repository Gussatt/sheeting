package V0;

import S0.C0513k;
import T0.a;
import android.content.Context;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: V0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0563w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f3722a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0513k f3723b;

    public C0563w(C0513k c0513k) {
        AbstractC0549h.j(c0513k);
        this.f3723b = c0513k;
    }

    public final int a(Context context, int i4) {
        return this.f3722a.get(i4, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC0549h.j(context);
        AbstractC0549h.j(fVar);
        int iH = 0;
        if (!fVar.f()) {
            return 0;
        }
        int iG = fVar.g();
        int iA = a(context, iG);
        if (iA != -1) {
            return iA;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= this.f3722a.size()) {
                iH = -1;
                break;
            }
            int iKeyAt = this.f3722a.keyAt(i4);
            if (iKeyAt > iG && this.f3722a.get(iKeyAt) == 0) {
                break;
            }
            i4++;
        }
        if (iH == -1) {
            iH = this.f3723b.h(context, iG);
        }
        this.f3722a.put(iG, iH);
        return iH;
    }

    public final void c() {
        this.f3722a.clear();
    }
}
