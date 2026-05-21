package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f5488a;

    public interface a {
        void a(a.b bVar);

        a.b b(int i4, int i5, int i6, Object obj);
    }

    public g(a aVar) {
        this.f5488a = aVar;
    }

    public final int a(List list) {
        boolean z3 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f5400a != 8) {
                z3 = true;
            } else if (z3) {
                return size;
            }
        }
        return -1;
    }

    public void b(List list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    public final void c(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        int i6 = bVar.f5403d;
        int i7 = bVar2.f5401b;
        int i8 = i6 < i7 ? -1 : 0;
        int i9 = bVar.f5401b;
        if (i9 < i7) {
            i8++;
        }
        if (i7 <= i9) {
            bVar.f5401b = i9 + bVar2.f5403d;
        }
        int i10 = bVar2.f5401b;
        if (i10 <= i6) {
            bVar.f5403d = i6 + bVar2.f5403d;
        }
        bVar2.f5401b = i10 + i8;
        list.set(i4, bVar2);
        list.set(i5, bVar);
    }

    public final void d(List list, int i4, int i5) {
        a.b bVar = (a.b) list.get(i4);
        a.b bVar2 = (a.b) list.get(i5);
        int i6 = bVar2.f5400a;
        if (i6 == 1) {
            c(list, i4, bVar, i5, bVar2);
        } else if (i6 == 2) {
            e(list, i4, bVar, i5, bVar2);
        } else {
            if (i6 != 4) {
                return;
            }
            f(list, i4, bVar, i5, bVar2);
        }
    }

    public void e(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        boolean z3;
        int i6 = bVar.f5401b;
        int i7 = bVar.f5403d;
        boolean z4 = false;
        if (i6 < i7) {
            if (bVar2.f5401b == i6 && bVar2.f5403d == i7 - i6) {
                z3 = false;
                z4 = true;
            } else {
                z3 = false;
            }
        } else if (bVar2.f5401b == i7 + 1 && bVar2.f5403d == i6 - i7) {
            z3 = true;
            z4 = true;
        } else {
            z3 = true;
        }
        int i8 = bVar2.f5401b;
        if (i7 < i8) {
            bVar2.f5401b = i8 - 1;
        } else {
            int i9 = bVar2.f5403d;
            if (i7 < i8 + i9) {
                bVar2.f5403d = i9 - 1;
                bVar.f5400a = 2;
                bVar.f5403d = 1;
                if (bVar2.f5403d == 0) {
                    list.remove(i5);
                    this.f5488a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i10 = bVar.f5401b;
        int i11 = bVar2.f5401b;
        a.b bVarB = null;
        if (i10 <= i11) {
            bVar2.f5401b = i11 + 1;
        } else {
            int i12 = bVar2.f5403d;
            if (i10 < i11 + i12) {
                bVarB = this.f5488a.b(2, i10 + 1, (i11 + i12) - i10, null);
                bVar2.f5403d = bVar.f5401b - bVar2.f5401b;
            }
        }
        if (z4) {
            list.set(i4, bVar2);
            list.remove(i5);
            this.f5488a.a(bVar);
            return;
        }
        if (z3) {
            if (bVarB != null) {
                int i13 = bVar.f5401b;
                if (i13 > bVarB.f5401b) {
                    bVar.f5401b = i13 - bVarB.f5403d;
                }
                int i14 = bVar.f5403d;
                if (i14 > bVarB.f5401b) {
                    bVar.f5403d = i14 - bVarB.f5403d;
                }
            }
            int i15 = bVar.f5401b;
            if (i15 > bVar2.f5401b) {
                bVar.f5401b = i15 - bVar2.f5403d;
            }
            int i16 = bVar.f5403d;
            if (i16 > bVar2.f5401b) {
                bVar.f5403d = i16 - bVar2.f5403d;
            }
        } else {
            if (bVarB != null) {
                int i17 = bVar.f5401b;
                if (i17 >= bVarB.f5401b) {
                    bVar.f5401b = i17 - bVarB.f5403d;
                }
                int i18 = bVar.f5403d;
                if (i18 >= bVarB.f5401b) {
                    bVar.f5403d = i18 - bVarB.f5403d;
                }
            }
            int i19 = bVar.f5401b;
            if (i19 >= bVar2.f5401b) {
                bVar.f5401b = i19 - bVar2.f5403d;
            }
            int i20 = bVar.f5403d;
            if (i20 >= bVar2.f5401b) {
                bVar.f5403d = i20 - bVar2.f5403d;
            }
        }
        list.set(i4, bVar2);
        if (bVar.f5401b != bVar.f5403d) {
            list.set(i5, bVar);
        } else {
            list.remove(i5);
        }
        if (bVarB != null) {
            list.add(i4, bVarB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f5403d
            int r1 = r13.f5401b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f5401b = r1
            goto L20
        Ld:
            int r5 = r13.f5403d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f5403d = r5
            androidx.recyclerview.widget.g$a r0 = r8.f5488a
            int r1 = r11.f5401b
            java.lang.Object r5 = r13.f5402c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f5401b
            int r5 = r13.f5401b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f5401b = r5
            goto L41
        L2b:
            int r6 = r13.f5403d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.g$a r4 = r8.f5488a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f5402c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f5403d
            int r1 = r1 - r5
            r13.f5403d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f5403d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.g$a r11 = r8.f5488a
            r11.a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.g.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
