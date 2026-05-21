package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import l2.AbstractC1388b;
import v2.C1591B;

/* JADX INFO: loaded from: classes.dex */
public class n extends SpannableStringBuilder {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7916m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7917n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f7918o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f7919p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f7920q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f7921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f7922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BaseInputConnection f7927x;

    public class a extends BaseInputConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Editable f7928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, boolean z3, Editable editable) {
            super(view, z3);
            this.f7928a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f7928a;
        }
    }

    public interface b {
        void a(boolean z3, boolean z4, boolean z5);
    }

    public n(C1591B.e eVar, View view) {
        this.f7927x = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    public void a(b bVar) {
        if (this.f7917n > 0) {
            AbstractC1388b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f7916m <= 0) {
            this.f7918o.add(bVar);
        } else {
            AbstractC1388b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f7919p.add(bVar);
        }
    }

    public void b() {
        this.f7916m++;
        if (this.f7917n > 0) {
            AbstractC1388b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f7916m != 1 || this.f7918o.isEmpty()) {
            return;
        }
        this.f7922s = toString();
        this.f7923t = i();
        this.f7924u = h();
        this.f7925v = g();
        this.f7926w = f();
    }

    public void c() {
        this.f7920q.clear();
    }

    public void d() {
        int i4 = this.f7916m;
        if (i4 == 0) {
            AbstractC1388b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i4 == 1) {
            Iterator it = this.f7919p.iterator();
            while (it.hasNext()) {
                j((b) it.next(), true, true, true);
            }
            if (!this.f7918o.isEmpty()) {
                AbstractC1388b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f7918o.size()) + " listener(s)");
                k(!toString().equals(this.f7922s), (this.f7923t == i() && this.f7924u == h()) ? false : true, (this.f7925v == g() && this.f7926w == f()) ? false : true);
            }
        }
        this.f7918o.addAll(this.f7919p);
        this.f7919p.clear();
        this.f7916m--;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList(this.f7920q);
        this.f7920q.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public final void j(b bVar, boolean z3, boolean z4, boolean z5) {
        this.f7917n++;
        bVar.a(z3, z4, z5);
        this.f7917n--;
    }

    public final void k(boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            Iterator it = this.f7918o.iterator();
            while (it.hasNext()) {
                j((b) it.next(), z3, z4, z5);
            }
        }
    }

    public void l(b bVar) {
        if (this.f7917n > 0) {
            AbstractC1388b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f7918o.remove(bVar);
        if (this.f7916m > 0) {
            this.f7919p.remove(bVar);
        }
    }

    public void m(int i4, int i5) {
        if (i4 < 0 || i4 >= i5) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f7927x.setComposingRegion(i4, i5);
        }
    }

    public void n(C1591B.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f11574a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f11575b, eVar.f11576c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f11577d, eVar.f11578e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        super.setSpan(obj, i4, i5, i6);
        this.f7920q.add(new t(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f7921r;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f7921r = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        if (this.f7917n > 0) {
            AbstractC1388b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i8 = i5 - i4;
        boolean z3 = i8 != i7 - i6;
        for (int i9 = 0; i9 < i8 && !z3; i9++) {
            z3 |= charAt(i4 + i9) != charSequence.charAt(i6 + i9);
        }
        if (z3) {
            this.f7921r = null;
        }
        int i10 = i();
        int iH = h();
        int iG = g();
        int iF = f();
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i4, i5, charSequence, i6, i7);
        this.f7920q.add(new t(string, i4, i5, charSequence, i(), h(), g(), f()));
        if (this.f7916m > 0) {
            return spannableStringBuilderReplace;
        }
        k(z3, (i() == i10 && h() == iH) ? false : true, (g() == iG && f() == iF) ? false : true);
        return spannableStringBuilderReplace;
    }
}
