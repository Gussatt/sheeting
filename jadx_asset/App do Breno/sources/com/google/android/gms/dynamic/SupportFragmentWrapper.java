package com.google.android.gms.dynamic;

import R.AbstractComponentCallbacksC0497o;
import V0.AbstractC0549h;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IFragmentWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractComponentCallbacksC0497o f6265l;

    public SupportFragmentWrapper(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        this.f6265l = abstractComponentCallbacksC0497o;
    }

    public static SupportFragmentWrapper wrap(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        if (abstractComponentCallbacksC0497o != null) {
            return new SupportFragmentWrapper(abstractComponentCallbacksC0497o);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void D0(Intent intent, int i4) {
        this.f6265l.startActivityForResult(intent, i4);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void M(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        AbstractC0549h.j(view);
        this.f6265l.P0(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void O0(boolean z3) {
        this.f6265l.g1(z3);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void P(boolean z3) {
        this.f6265l.a1(z3);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void Y(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        AbstractC0549h.j(view);
        this.f6265l.l1(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int b() {
        return this.f6265l.y();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int c() {
        return this.f6265l.T();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle d() {
        return this.f6265l.o();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper e() {
        return wrap(this.f6265l.C());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper f() {
        return ObjectWrapper.wrap(this.f6265l.J());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper g() {
        return ObjectWrapper.wrap(this.f6265l.V());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper h() {
        return wrap(this.f6265l.R());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper i() {
        this.f6265l.j();
        return ObjectWrapper.wrap(null);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String j() {
        return this.f6265l.Q();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean l() {
        return this.f6265l.e0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean m() {
        return this.f6265l.Y();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean n() {
        return this.f6265l.f0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean o() {
        return this.f6265l.Z();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void o0(boolean z3) {
        this.f6265l.e1(z3);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean p() {
        return this.f6265l.a0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q() {
        return this.f6265l.K();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean s() {
        return this.f6265l.c0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean t() {
        return this.f6265l.g0();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean w() {
        return this.f6265l.U();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void x(boolean z3) {
        this.f6265l.Z0(z3);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void z0(Intent intent) {
        this.f6265l.h1(intent);
    }
}
