package io.flutter.plugin.editing;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import v2.w;

/* JADX INFO: loaded from: classes.dex */
public class r implements w.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2.w f7930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManager f7931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f7932c;

    public r(View view, InputMethodManager inputMethodManager, v2.w wVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f7932c = view;
        this.f7931b = inputMethodManager;
        this.f7930a = wVar;
        wVar.g(this);
    }

    @Override // v2.w.b
    public boolean a() {
        return Build.VERSION.SDK_INT >= 34 && c();
    }

    @Override // v2.w.b
    public void b() {
        this.f7931b.startStylusHandwriting(this.f7932c);
    }

    @Override // v2.w.b
    public boolean c() {
        return this.f7931b.isStylusHandwritingAvailable();
    }
}
