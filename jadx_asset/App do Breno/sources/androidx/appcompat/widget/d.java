package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c.AbstractC0637a;
import c.AbstractC0640d;
import c.AbstractC0643g;
import c.AbstractC0645i;
import e.AbstractC0921a;
import j.C1105a;
import k.InterfaceC1111A;
import k.a0;

/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC1111A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f4550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f4552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f4553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f4554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f4555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f4557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f4558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f4559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f4560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f4564o;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1105a f4565b;

        public a() {
            this.f4565b = new C1105a(d.this.f4550a.getContext(), 0, R.id.home, 0, 0, d.this.f4557h);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f4560k;
            if (callback == null || !dVar.f4561l) {
                return;
            }
            callback.onMenuItemSelected(0, this.f4565b);
        }
    }

    public d(Toolbar toolbar, boolean z3) {
        this(toolbar, z3, AbstractC0643g.f5679a, AbstractC0640d.f5625n);
    }

    @Override // k.InterfaceC1111A
    public void a(CharSequence charSequence) {
        if (this.f4556g) {
            return;
        }
        o(charSequence);
    }

    @Override // k.InterfaceC1111A
    public void b(Window.Callback callback) {
        this.f4560k = callback;
    }

    @Override // k.InterfaceC1111A
    public void c(int i4) {
        i(i4 != 0 ? AbstractC0921a.b(e(), i4) : null);
    }

    public final int d() {
        if (this.f4550a.getNavigationIcon() == null) {
            return 11;
        }
        this.f4564o = this.f4550a.getNavigationIcon();
        return 15;
    }

    public Context e() {
        return this.f4550a.getContext();
    }

    public void f(View view) {
        View view2 = this.f4552c;
        if (view2 != null && (this.f4551b & 16) != 0) {
            this.f4550a.removeView(view2);
        }
        this.f4552c = view;
        if (view == null || (this.f4551b & 16) == 0) {
            return;
        }
        this.f4550a.addView(view);
    }

    public void g(int i4) {
        if (i4 == this.f4563n) {
            return;
        }
        this.f4563n = i4;
        if (TextUtils.isEmpty(this.f4550a.getNavigationContentDescription())) {
            j(this.f4563n);
        }
    }

    @Override // k.InterfaceC1111A
    public CharSequence getTitle() {
        return this.f4550a.getTitle();
    }

    public void h(int i4) {
        View view;
        int i5 = this.f4551b ^ i4;
        this.f4551b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i5 & 3) != 0) {
                r();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    this.f4550a.setTitle(this.f4557h);
                    this.f4550a.setSubtitle(this.f4558i);
                } else {
                    this.f4550a.setTitle((CharSequence) null);
                    this.f4550a.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f4552c) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                this.f4550a.addView(view);
            } else {
                this.f4550a.removeView(view);
            }
        }
    }

    public void i(Drawable drawable) {
        this.f4554e = drawable;
        r();
    }

    public void j(int i4) {
        k(i4 == 0 ? null : e().getString(i4));
    }

    public void k(CharSequence charSequence) {
        this.f4559j = charSequence;
        p();
    }

    public void l(Drawable drawable) {
        this.f4555f = drawable;
        q();
    }

    public void m(CharSequence charSequence) {
        this.f4558i = charSequence;
        if ((this.f4551b & 8) != 0) {
            this.f4550a.setSubtitle(charSequence);
        }
    }

    public void n(CharSequence charSequence) {
        this.f4556g = true;
        o(charSequence);
    }

    public final void o(CharSequence charSequence) {
        this.f4557h = charSequence;
        if ((this.f4551b & 8) != 0) {
            this.f4550a.setTitle(charSequence);
        }
    }

    public final void p() {
        if ((this.f4551b & 4) != 0) {
            if (TextUtils.isEmpty(this.f4559j)) {
                this.f4550a.setNavigationContentDescription(this.f4563n);
            } else {
                this.f4550a.setNavigationContentDescription(this.f4559j);
            }
        }
    }

    public final void q() {
        if ((this.f4551b & 4) == 0) {
            this.f4550a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f4550a;
        Drawable drawable = this.f4555f;
        if (drawable == null) {
            drawable = this.f4564o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void r() {
        Drawable drawable;
        int i4 = this.f4551b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) == 0 || (drawable = this.f4554e) == null) {
            drawable = this.f4553d;
        }
        this.f4550a.setLogo(drawable);
    }

    @Override // k.InterfaceC1111A
    public void setIcon(int i4) {
        setIcon(i4 != 0 ? AbstractC0921a.b(e(), i4) : null);
    }

    public d(Toolbar toolbar, boolean z3, int i4, int i5) {
        Drawable drawable;
        this.f4562m = 0;
        this.f4563n = 0;
        this.f4550a = toolbar;
        this.f4557h = toolbar.getTitle();
        this.f4558i = toolbar.getSubtitle();
        this.f4556g = this.f4557h != null;
        this.f4555f = toolbar.getNavigationIcon();
        a0 a0VarR = a0.r(toolbar.getContext(), null, AbstractC0645i.f5796a, AbstractC0637a.f5558c, 0);
        this.f4564o = a0VarR.f(AbstractC0645i.f5841j);
        if (z3) {
            CharSequence charSequenceN = a0VarR.n(AbstractC0645i.f5866p);
            if (!TextUtils.isEmpty(charSequenceN)) {
                n(charSequenceN);
            }
            CharSequence charSequenceN2 = a0VarR.n(AbstractC0645i.f5858n);
            if (!TextUtils.isEmpty(charSequenceN2)) {
                m(charSequenceN2);
            }
            Drawable drawableF = a0VarR.f(AbstractC0645i.f5850l);
            if (drawableF != null) {
                i(drawableF);
            }
            Drawable drawableF2 = a0VarR.f(AbstractC0645i.f5846k);
            if (drawableF2 != null) {
                setIcon(drawableF2);
            }
            if (this.f4555f == null && (drawable = this.f4564o) != null) {
                l(drawable);
            }
            h(a0VarR.i(AbstractC0645i.f5831h, 0));
            int iL = a0VarR.l(AbstractC0645i.f5826g, 0);
            if (iL != 0) {
                f(LayoutInflater.from(this.f4550a.getContext()).inflate(iL, (ViewGroup) this.f4550a, false));
                h(this.f4551b | 16);
            }
            int iK = a0VarR.k(AbstractC0645i.f5836i, 0);
            if (iK > 0) {
                ViewGroup.LayoutParams layoutParams = this.f4550a.getLayoutParams();
                layoutParams.height = iK;
                this.f4550a.setLayoutParams(layoutParams);
            }
            int iD = a0VarR.d(AbstractC0645i.f5821f, -1);
            int iD2 = a0VarR.d(AbstractC0645i.f5816e, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.f4550a.C(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iL2 = a0VarR.l(AbstractC0645i.f5870q, 0);
            if (iL2 != 0) {
                Toolbar toolbar2 = this.f4550a;
                toolbar2.E(toolbar2.getContext(), iL2);
            }
            int iL3 = a0VarR.l(AbstractC0645i.f5862o, 0);
            if (iL3 != 0) {
                Toolbar toolbar3 = this.f4550a;
                toolbar3.D(toolbar3.getContext(), iL3);
            }
            int iL4 = a0VarR.l(AbstractC0645i.f5854m, 0);
            if (iL4 != 0) {
                this.f4550a.setPopupTheme(iL4);
            }
        } else {
            this.f4551b = d();
        }
        a0VarR.s();
        g(i4);
        this.f4559j = this.f4550a.getNavigationContentDescription();
        this.f4550a.setNavigationOnClickListener(new a());
    }

    @Override // k.InterfaceC1111A
    public void setIcon(Drawable drawable) {
        this.f4553d = drawable;
        r();
    }
}
