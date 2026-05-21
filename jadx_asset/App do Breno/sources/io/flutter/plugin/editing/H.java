package io.flutter.plugin.editing;

import C.AbstractC0241y;
import C.F;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.n;
import io.flutter.plugin.platform.C1090w;
import io.flutter.plugin.platform.P;
import java.util.HashMap;
import l2.AbstractC1388b;
import m2.L;
import v2.C1591B;

/* JADX INFO: loaded from: classes.dex */
public class H implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f7869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManager f7870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f7871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v2.w f7872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1591B f7873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f7874f = new d(d.a.NO_TARGET, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1591B.b f7875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArray f7876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f7877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InputConnection f7879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1090w f7880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public P f7881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f7882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImeSyncDeferringInsetsCallback f7883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1591B.e f7884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7885q;

    public class a implements ImeSyncDeferringInsetsCallback.b {
        public a() {
        }

        @Override // io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.b
        public void a(boolean z3) {
            if (z3) {
                return;
            }
            H.this.f7870b.restartInput(H.this.f7869a);
        }
    }

    public class b implements C1591B.f {
        public b() {
        }

        @Override // v2.C1591B.f
        public void a() {
            H h4 = H.this;
            h4.F(h4.f7869a);
        }

        @Override // v2.C1591B.f
        public void b() {
            H.this.m();
        }

        @Override // v2.C1591B.f
        public void c(int i4, C1591B.b bVar) {
            H.this.D(i4, bVar);
        }

        @Override // v2.C1591B.f
        public void d(C1591B.e eVar) {
            H h4 = H.this;
            h4.E(h4.f7869a, eVar);
        }

        @Override // v2.C1591B.f
        public void e(String str, Bundle bundle) {
            H.this.B(str, bundle);
        }

        @Override // v2.C1591B.f
        public void f(int i4, boolean z3) {
            H.this.C(i4, z3);
        }

        @Override // v2.C1591B.f
        public void g(double d4, double d5, double[] dArr) {
            H.this.A(d4, d5, dArr);
        }

        @Override // v2.C1591B.f
        public void h() {
            H.this.x();
        }

        @Override // v2.C1591B.f
        public void i(boolean z3) {
            if (Build.VERSION.SDK_INT < 26 || H.this.f7871c == null) {
                return;
            }
            if (z3) {
                H.this.f7871c.commit();
            } else {
                H.this.f7871c.cancel();
            }
        }

        @Override // v2.C1591B.f
        public void j() {
            if (H.this.f7874f.f7892a == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                H.this.y();
            } else {
                H h4 = H.this;
                h4.s(h4.f7869a);
            }
        }
    }

    public class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double[] f7889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double[] f7890c;

        public c(boolean z3, double[] dArr, double[] dArr2) {
            this.f7888a = z3;
            this.f7889b = dArr;
            this.f7890c = dArr2;
        }

        @Override // io.flutter.plugin.editing.H.e
        public void a(double d4, double d5) {
            double d6 = 1.0d;
            if (!this.f7888a) {
                double[] dArr = this.f7889b;
                d6 = 1.0d / (((dArr[3] * d4) + (dArr[7] * d5)) + dArr[15]);
            }
            double[] dArr2 = this.f7889b;
            double d7 = ((dArr2[0] * d4) + (dArr2[4] * d5) + dArr2[12]) * d6;
            double d8 = ((dArr2[1] * d4) + (dArr2[5] * d5) + dArr2[13]) * d6;
            double[] dArr3 = this.f7890c;
            if (d7 < dArr3[0]) {
                dArr3[0] = d7;
            } else if (d7 > dArr3[1]) {
                dArr3[1] = d7;
            }
            if (d8 < dArr3[2]) {
                dArr3[2] = d8;
            } else if (d8 > dArr3[3]) {
                dArr3[3] = d8;
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f7892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7893b;

        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public d(a aVar, int i4) {
            this.f7892a = aVar;
            this.f7893b = i4;
        }
    }

    public interface e {
        void a(double d4, double d5);
    }

    public H(View view, C1591B c1591b, v2.w wVar, C1090w c1090w, P p4) {
        this.f7869a = view;
        this.f7877i = new n(null, view);
        this.f7870b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            this.f7871c = F.a(view.getContext().getSystemService(E.a()));
        } else {
            this.f7871c = null;
        }
        if (i4 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f7883o = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            this.f7883o.setImeVisibilityListener(new a());
        }
        this.f7873e = c1591b;
        c1591b.n(new b());
        c1591b.k();
        this.f7872d = wVar;
        this.f7880l = c1090w;
        c1090w.D(this);
        this.f7881m = p4;
        p4.g(this);
    }

    public static boolean n(C1591B.e eVar, C1591B.e eVar2) {
        int i4 = eVar.f11578e - eVar.f11577d;
        if (i4 != eVar2.f11578e - eVar2.f11577d) {
            return true;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (eVar.f11574a.charAt(eVar.f11577d + i5) != eVar2.f11574a.charAt(eVar2.f11577d + i5)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int t(v2.C1591B.c r1, boolean r2, boolean r3, boolean r4, boolean r5, v2.C1591B.d r6) {
        /*
            v2.B$g r5 = r1.f11565a
            v2.B$g r0 = v2.C1591B.g.DATETIME
            if (r5 != r0) goto L8
            r1 = 4
            return r1
        L8:
            v2.B$g r0 = v2.C1591B.g.NUMBER
            if (r5 != r0) goto L1c
            boolean r2 = r1.f11566b
            if (r2 == 0) goto L13
            r2 = 4098(0x1002, float:5.743E-42)
            goto L14
        L13:
            r2 = 2
        L14:
            boolean r1 = r1.f11567c
            if (r1 == 0) goto L1b
            r1 = r2 | 8192(0x2000, float:1.148E-41)
            return r1
        L1b:
            return r2
        L1c:
            v2.B$g r1 = v2.C1591B.g.PHONE
            if (r5 != r1) goto L22
            r1 = 3
            return r1
        L22:
            v2.B$g r1 = v2.C1591B.g.NONE
            if (r5 != r1) goto L28
            r1 = 0
            return r1
        L28:
            v2.B$g r1 = v2.C1591B.g.MULTILINE
            if (r5 != r1) goto L30
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L5e
        L30:
            v2.B$g r1 = v2.C1591B.g.EMAIL_ADDRESS
            if (r5 == r1) goto L5c
            v2.B$g r1 = v2.C1591B.g.TWITTER
            if (r5 != r1) goto L39
            goto L5c
        L39:
            v2.B$g r1 = v2.C1591B.g.URL
            if (r5 == r1) goto L59
            v2.B$g r1 = v2.C1591B.g.WEB_SEARCH
            if (r5 != r1) goto L42
            goto L59
        L42:
            v2.B$g r1 = v2.C1591B.g.VISIBLE_PASSWORD
            if (r5 != r1) goto L49
            r1 = 145(0x91, float:2.03E-43)
            goto L5e
        L49:
            v2.B$g r1 = v2.C1591B.g.NAME
            if (r5 != r1) goto L50
            r1 = 97
            goto L5e
        L50:
            v2.B$g r1 = v2.C1591B.g.POSTAL_ADDRESS
            if (r5 != r1) goto L57
            r1 = 113(0x71, float:1.58E-43)
            goto L5e
        L57:
            r1 = 1
            goto L5e
        L59:
            r1 = 17
            goto L5e
        L5c:
            r1 = 33
        L5e:
            if (r2 == 0) goto L65
            r2 = 524416(0x80080, float:7.34863E-40)
        L63:
            r1 = r1 | r2
            goto L71
        L65:
            if (r3 == 0) goto L6b
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L6b:
            if (r4 != 0) goto L71
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L63
        L71:
            v2.B$d r2 = v2.C1591B.d.CHARACTERS
            if (r6 != r2) goto L78
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            return r1
        L78:
            v2.B$d r2 = v2.C1591B.d.WORDS
            if (r6 != r2) goto L7f
            r1 = r1 | 8192(0x2000, float:1.148E-41)
            return r1
        L7f:
            v2.B$d r2 = v2.C1591B.d.SENTENCES
            if (r6 != r2) goto L85
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.H.t(v2.B$c, boolean, boolean, boolean, boolean, v2.B$d):int");
    }

    public final void A(double d4, double d5, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z3 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d6 = dArr[12];
        double d7 = dArr[15];
        double d8 = d6 / d7;
        dArr2[1] = d8;
        dArr2[0] = d8;
        double d9 = dArr[13] / d7;
        dArr2[3] = d9;
        dArr2[2] = d9;
        c cVar = new c(z3, dArr, dArr2);
        cVar.a(d4, 0.0d);
        cVar.a(d4, d5);
        cVar.a(0.0d, d5);
        double d10 = this.f7869a.getContext().getResources().getDisplayMetrics().density;
        this.f7882n = new Rect((int) (dArr2[0] * d10), (int) (dArr2[2] * d10), (int) Math.ceil(dArr2[1] * d10), (int) Math.ceil(dArr2[3] * d10));
    }

    public void B(String str, Bundle bundle) {
        this.f7870b.sendAppPrivateCommand(this.f7869a, str, bundle);
    }

    public final void C(int i4, boolean z3) {
        if (!z3) {
            this.f7874f = new d(d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i4);
            this.f7879k = null;
        } else {
            this.f7869a.requestFocus();
            this.f7874f = new d(d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i4);
            this.f7870b.restartInput(this.f7869a);
            this.f7878j = false;
        }
    }

    public void D(int i4, C1591B.b bVar) {
        y();
        this.f7875g = bVar;
        this.f7874f = new d(d.a.FRAMEWORK_CLIENT, i4);
        this.f7877i.l(this);
        C1591B.b.a aVar = bVar.f11557j;
        this.f7877i = new n(aVar != null ? aVar.f11563c : null, this.f7869a);
        H(bVar);
        this.f7878j = true;
        G();
        this.f7882n = null;
        this.f7877i.a(this);
    }

    public void E(View view, C1591B.e eVar) {
        C1591B.e eVar2;
        if (!this.f7878j && (eVar2 = this.f7884p) != null && eVar2.b()) {
            boolean zN = n(this.f7884p, eVar);
            this.f7878j = zN;
            if (zN) {
                AbstractC1388b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f7884p = eVar;
        this.f7877i.n(eVar);
        if (this.f7878j) {
            this.f7870b.restartInput(view);
            this.f7878j = false;
        }
    }

    public void F(View view) {
        C1591B.c cVar;
        C1591B.b bVar = this.f7875g;
        if (bVar != null && (cVar = bVar.f11554g) != null && cVar.f11565a == C1591B.g.NONE) {
            s(view);
        } else {
            view.requestFocus();
            this.f7870b.showSoftInput(view, 0);
        }
    }

    public void G() {
        if (this.f7874f.f7892a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f7885q = false;
        }
    }

    public final void H(C1591B.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f11557j == null) {
            this.f7876h = null;
            return;
        }
        C1591B.b[] bVarArr = bVar.f11559l;
        SparseArray sparseArray = new SparseArray();
        this.f7876h = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f11557j.f11561a.hashCode(), bVar);
            return;
        }
        for (C1591B.b bVar2 : bVarArr) {
            C1591B.b.a aVar = bVar2.f11557j;
            if (aVar != null) {
                this.f7876h.put(aVar.f11561a.hashCode(), bVar2);
                this.f7871c.notifyValueChanged(this.f7869a, aVar.f11561a.hashCode(), AutofillValue.forText(aVar.f11563c.f11574a));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r5 == r9.f11578e) goto L23;
     */
    @Override // io.flutter.plugin.editing.n.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            if (r8 == 0) goto Lb
            io.flutter.plugin.editing.n r8 = r7.f7877i
            java.lang.String r8 = r8.toString()
            r7.w(r8)
        Lb:
            io.flutter.plugin.editing.n r8 = r7.f7877i
            int r2 = r8.i()
            io.flutter.plugin.editing.n r8 = r7.f7877i
            int r3 = r8.h()
            io.flutter.plugin.editing.n r8 = r7.f7877i
            int r4 = r8.g()
            io.flutter.plugin.editing.n r8 = r7.f7877i
            int r5 = r8.f()
            io.flutter.plugin.editing.n r8 = r7.f7877i
            java.util.ArrayList r8 = r8.e()
            v2.B$e r9 = r7.f7884p
            if (r9 == 0) goto La7
            io.flutter.plugin.editing.n r9 = r7.f7877i
            java.lang.String r9 = r9.toString()
            v2.B$e r10 = r7.f7884p
            java.lang.String r10 = r10.f11574a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L50
            v2.B$e r9 = r7.f7884p
            int r10 = r9.f11575b
            if (r2 != r10) goto L50
            int r10 = r9.f11576c
            if (r3 != r10) goto L50
            int r10 = r9.f11577d
            if (r4 != r10) goto L50
            int r9 = r9.f11578e
            if (r5 != r9) goto L50
            goto La7
        L50:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "send EditingState to flutter: "
            r9.append(r10)
            io.flutter.plugin.editing.n r10 = r7.f7877i
            java.lang.String r10 = r10.toString()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "TextInputPlugin"
            l2.AbstractC1388b.f(r10, r9)
            v2.B$b r9 = r7.f7875g
            boolean r9 = r9.f11552e
            if (r9 == 0) goto L81
            v2.B r9 = r7.f7873e
            io.flutter.plugin.editing.H$d r10 = r7.f7874f
            int r10 = r10.f7893b
            r9.q(r10, r8)
            io.flutter.plugin.editing.n r8 = r7.f7877i
            r8.c()
            goto L99
        L81:
            v2.B r0 = r7.f7873e
            io.flutter.plugin.editing.H$d r8 = r7.f7874f
            int r1 = r8.f7893b
            io.flutter.plugin.editing.n r8 = r7.f7877i
            java.lang.String r8 = r8.toString()
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
            r0.p(r1, r2, r3, r4, r5, r6)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
        L99:
            v2.B$e r0 = new v2.B$e
            io.flutter.plugin.editing.n r8 = r7.f7877i
            java.lang.String r1 = r8.toString()
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f7884p = r0
            return
        La7:
            io.flutter.plugin.editing.n r8 = r7.f7877i
            r8.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.H.a(boolean, boolean, boolean):void");
    }

    public void k(SparseArray sparseArray) {
        C1591B.b bVar;
        C1591B.b.a aVar;
        C1591B.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f7875g) == null || this.f7876h == null || (aVar = bVar.f11557j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            C1591B.b bVar2 = (C1591B.b) this.f7876h.get(sparseArray.keyAt(i4));
            if (bVar2 != null && (aVar2 = bVar2.f11557j) != null) {
                String string = G.a(sparseArray.valueAt(i4)).getTextValue().toString();
                C1591B.e eVar = new C1591B.e(string, string.length(), string.length(), -1, -1);
                if (aVar2.f11561a.equals(aVar.f11561a)) {
                    this.f7877i.n(eVar);
                } else {
                    map.put(aVar2.f11561a, eVar);
                }
            }
        }
        this.f7873e.r(this.f7874f.f7893b, map);
    }

    public void l(int i4) {
        d dVar = this.f7874f;
        d.a aVar = dVar.f7892a;
        if ((aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && dVar.f7893b == i4) {
            this.f7874f = new d(d.a.NO_TARGET, 0);
            y();
            this.f7870b.hideSoftInputFromWindow(this.f7869a.getApplicationWindowToken(), 0);
            this.f7870b.restartInput(this.f7869a);
            this.f7878j = false;
        }
    }

    public void m() {
        if (this.f7874f.f7892a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f7877i.l(this);
        y();
        this.f7875g = null;
        H(null);
        this.f7874f = new d(d.a.NO_TARGET, 0);
        G();
        this.f7882n = null;
        C.F fO = AbstractC0241y.o(this.f7869a);
        if (fO == null || fO.i(F.m.c())) {
            return;
        }
        this.f7870b.restartInput(this.f7869a);
    }

    public InputConnection o(View view, L l4, EditorInfo editorInfo) {
        d dVar = this.f7874f;
        d.a aVar = dVar.f7892a;
        if (aVar == d.a.NO_TARGET) {
            this.f7879k = null;
            return null;
        }
        if (aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f7885q) {
                return this.f7879k;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.f7880l.k(dVar.f7893b).onCreateInputConnection(editorInfo);
            this.f7879k = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        C1591B.b bVar = this.f7875g;
        int iT = t(bVar.f11554g, bVar.f11548a, bVar.f11549b, bVar.f11550c, bVar.f11551d, bVar.f11553f);
        editorInfo.inputType = iT;
        editorInfo.imeOptions = 33554432;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && !this.f7875g.f11551d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f7875g.f11555h;
        int iIntValue = num == null ? (iT & 131072) != 0 ? 1 : 6 : num.intValue();
        C1591B.b bVar2 = this.f7875g;
        String str = bVar2.f11556i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        if (bVar2.f11560m != null) {
            editorInfo.hintLocales = new LocaleList(this.f7875g.f11560m);
        }
        String[] strArr = this.f7875g.f11558k;
        if (strArr != null) {
            G.b.a(editorInfo, strArr);
        }
        if (i4 >= 34) {
            G.b.b(editorInfo, true);
        }
        m mVar = new m(view, this.f7874f.f7893b, this.f7873e, this.f7872d, l4, this.f7877i, editorInfo);
        editorInfo.initialSelStart = this.f7877i.i();
        editorInfo.initialSelEnd = this.f7877i.h();
        this.f7879k = mVar;
        return mVar;
    }

    public void p() {
        this.f7880l.Q();
        this.f7881m.t();
        this.f7873e.n(null);
        y();
        this.f7877i.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f7883o;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.f7870b;
    }

    public boolean r(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!q().isAcceptingText() || (inputConnection = this.f7879k) == null) {
            return false;
        }
        return inputConnection instanceof m ? ((m) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public final void s(View view) {
        y();
        this.f7870b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    public void u() {
        if (this.f7874f.f7892a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f7885q = true;
        }
    }

    public final boolean v() {
        return this.f7876h != null;
    }

    public final void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f7871c == null || !v()) {
            return;
        }
        this.f7871c.notifyValueChanged(this.f7869a, this.f7875g.f11557j.f11561a.hashCode(), AutofillValue.forText(str));
    }

    public final void x() {
        if (Build.VERSION.SDK_INT < 26 || this.f7871c == null || !v()) {
            return;
        }
        String str = this.f7875g.f11557j.f11561a;
        int[] iArr = new int[2];
        this.f7869a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f7882n);
        rect.offset(iArr[0], iArr[1]);
        this.f7871c.notifyViewEntered(this.f7869a, str.hashCode(), rect);
    }

    public final void y() {
        C1591B.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f7871c == null || (bVar = this.f7875g) == null || bVar.f11557j == null || !v()) {
            return;
        }
        this.f7871c.notifyViewExited(this.f7869a, this.f7875g.f11557j.f11561a.hashCode());
    }

    public void z(ViewStructure viewStructure, int i4) {
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.f7875g.f11557j.f11561a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i5 = 0; i5 < this.f7876h.size(); i5++) {
            int iKeyAt = this.f7876h.keyAt(i5);
            C1591B.b.a aVar = ((C1591B.b) this.f7876h.valueAt(i5)).f11557j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i5);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                String[] strArr = aVar.f11562b;
                if (strArr.length > 0) {
                    viewStructureNewChild.setAutofillHints(strArr);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                String str2 = aVar.f11564d;
                if (str2 != null) {
                    viewStructureNewChild.setHint(str2);
                }
                if (str.hashCode() != iKeyAt || (rect = this.f7882n) == null) {
                    viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(aVar.f11563c.f11574a));
                } else {
                    viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f7882n.height());
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.f7877i));
                }
            }
        }
    }
}
