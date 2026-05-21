package R;

import R.B;
import R.J;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: R.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0483a extends J implements B.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B f3133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3136w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0483a(B b4) {
        AbstractC0501t abstractC0501tA0 = b4.a0();
        b4.b0();
        super(abstractC0501tA0, null);
        this.f3135v = -1;
        this.f3136w = false;
        this.f3133t = b4;
    }

    @Override // R.B.h
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (B.m0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3043i) {
            return true;
        }
        this.f3133t.e(this);
        return true;
    }

    @Override // R.J
    public void e() {
        f();
        this.f3133t.L(this, true);
    }

    @Override // R.J
    public void g(int i4, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, String str, int i5) {
        super.g(i4, abstractComponentCallbacksC0497o, str, i5);
        abstractComponentCallbacksC0497o.f3267v = this.f3133t;
    }

    public void i(int i4) {
        if (this.f3043i) {
            if (B.m0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            int size = this.f3037c.size();
            for (int i5 = 0; i5 < size; i5++) {
                J.a aVar = (J.a) this.f3037c.get(i5);
                AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = aVar.f3055b;
                if (abstractComponentCallbacksC0497o != null) {
                    abstractComponentCallbacksC0497o.f3266u += i4;
                    if (B.m0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3055b + " to " + aVar.f3055b.f3266u);
                    }
                }
            }
        }
    }

    public void j(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3045k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3135v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3134u);
            if (this.f3042h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3042h));
            }
            if (this.f3038d != 0 || this.f3039e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3038d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3039e));
            }
            if (this.f3040f != 0 || this.f3041g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3040f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3041g));
            }
            if (this.f3046l != 0 || this.f3047m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3046l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3047m);
            }
            if (this.f3048n != 0 || this.f3049o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3048n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3049o);
            }
        }
        if (this.f3037c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3037c.size();
        for (int i4 = 0; i4 < size; i4++) {
            J.a aVar = (J.a) this.f3037c.get(i4);
            switch (aVar.f3054a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "HIDE";
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f3054a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3055b);
            if (z3) {
                if (aVar.f3057d != 0 || aVar.f3058e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3057d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3058e));
                }
                if (aVar.f3059f != 0 || aVar.f3060g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3059f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3060g));
                }
            }
        }
    }

    public void k() {
        int size = this.f3037c.size();
        for (int i4 = 0; i4 < size; i4++) {
            J.a aVar = (J.a) this.f3037c.get(i4);
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = aVar.f3055b;
            if (abstractComponentCallbacksC0497o != null) {
                abstractComponentCallbacksC0497o.f3261p = this.f3136w;
                abstractComponentCallbacksC0497o.c1(false);
                abstractComponentCallbacksC0497o.b1(this.f3042h);
                abstractComponentCallbacksC0497o.f1(this.f3050p, this.f3051q);
            }
            switch (aVar.f3054a) {
                case 1:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.E0(abstractComponentCallbacksC0497o, false);
                    this.f3133t.f(abstractComponentCallbacksC0497o);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3054a);
                case 3:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.x0(abstractComponentCallbacksC0497o);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.j0(abstractComponentCallbacksC0497o);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.E0(abstractComponentCallbacksC0497o, false);
                    this.f3133t.I0(abstractComponentCallbacksC0497o);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.r(abstractComponentCallbacksC0497o);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.E0(abstractComponentCallbacksC0497o, false);
                    this.f3133t.j(abstractComponentCallbacksC0497o);
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    this.f3133t.G0(abstractComponentCallbacksC0497o);
                    break;
                case 9:
                    this.f3133t.G0(null);
                    break;
                case 10:
                    this.f3133t.F0(abstractComponentCallbacksC0497o, aVar.f3062i);
                    break;
            }
        }
    }

    public void l() {
        for (int size = this.f3037c.size() - 1; size >= 0; size--) {
            J.a aVar = (J.a) this.f3037c.get(size);
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = aVar.f3055b;
            if (abstractComponentCallbacksC0497o != null) {
                abstractComponentCallbacksC0497o.f3261p = this.f3136w;
                abstractComponentCallbacksC0497o.c1(true);
                abstractComponentCallbacksC0497o.b1(B.C0(this.f3042h));
                abstractComponentCallbacksC0497o.f1(this.f3051q, this.f3050p);
            }
            switch (aVar.f3054a) {
                case 1:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.E0(abstractComponentCallbacksC0497o, true);
                    this.f3133t.x0(abstractComponentCallbacksC0497o);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3054a);
                case 3:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.f(abstractComponentCallbacksC0497o);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.I0(abstractComponentCallbacksC0497o);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.E0(abstractComponentCallbacksC0497o, true);
                    this.f3133t.j0(abstractComponentCallbacksC0497o);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.j(abstractComponentCallbacksC0497o);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    abstractComponentCallbacksC0497o.X0(aVar.f3057d, aVar.f3058e, aVar.f3059f, aVar.f3060g);
                    this.f3133t.E0(abstractComponentCallbacksC0497o, true);
                    this.f3133t.r(abstractComponentCallbacksC0497o);
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    this.f3133t.G0(null);
                    break;
                case 9:
                    this.f3133t.G0(abstractComponentCallbacksC0497o);
                    break;
                case 10:
                    this.f3133t.F0(abstractComponentCallbacksC0497o, aVar.f3061h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public R.AbstractComponentCallbacksC0497o m(java.util.ArrayList r17, R.AbstractComponentCallbacksC0497o r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f3037c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.f3037c
            java.lang.Object r5 = r5.get(r4)
            R.J$a r5 = (R.J.a) r5
            int r6 = r5.f3054a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.f3037c
            R.J$a r8 = new R.J$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f3056c = r7
            int r4 = r4 + 1
            R.o r3 = r5.f3055b
            goto Lbb
        L43:
            R.o r6 = r5.f3055b
            r1.remove(r6)
            R.o r5 = r5.f3055b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.f3037c
            R.J$a r6 = new R.J$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            R.o r6 = r5.f3055b
            int r8 = r6.f3271z
            int r12 = r1.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            R.o r14 = (R.AbstractComponentCallbacksC0497o) r14
            int r15 = r14.f3271z
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.f3037c
            R.J$a r15 = new R.J$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            R.J$a r15 = new R.J$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f3057d
            r15.f3057d = r2
            int r2 = r5.f3059f
            r15.f3059f = r2
            int r2 = r5.f3058e
            r15.f3058e = r2
            int r2 = r5.f3060g
            r15.f3060g = r2
            java.util.ArrayList r2 = r0.f3037c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.f3037c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f3054a = r7
            r5.f3056c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            R.o r2 = r5.f3055b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R.C0483a.m(java.util.ArrayList, R.o):R.o");
    }

    public void n() {
        if (this.f3053s != null) {
            for (int i4 = 0; i4 < this.f3053s.size(); i4++) {
                ((Runnable) this.f3053s.get(i4)).run();
            }
            this.f3053s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public R.AbstractComponentCallbacksC0497o o(java.util.ArrayList r6, R.AbstractComponentCallbacksC0497o r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f3037c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f3037c
            java.lang.Object r2 = r2.get(r0)
            R.J$a r2 = (R.J.a) r2
            int r3 = r2.f3054a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.f$b r3 = r2.f3061h
            r2.f3062i = r3
            goto L32
        L22:
            R.o r7 = r2.f3055b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            R.o r2 = r2.f3055b
            r6.add(r2)
            goto L32
        L2d:
            R.o r2 = r2.f3055b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: R.C0483a.o(java.util.ArrayList, R.o):R.o");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3135v >= 0) {
            sb.append(" #");
            sb.append(this.f3135v);
        }
        if (this.f3045k != null) {
            sb.append(" ");
            sb.append(this.f3045k);
        }
        sb.append("}");
        return sb.toString();
    }
}
