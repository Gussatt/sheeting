package com.google.android.gms.dynamic;

import V0.AbstractC0549h;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IFragmentWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Fragment f6263l;

    public FragmentWrapper(Fragment fragment) {
        this.f6263l = fragment;
    }

    public static FragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void D0(Intent intent, int i4) {
        this.f6263l.startActivityForResult(intent, i4);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void M(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        AbstractC0549h.j(view);
        this.f6263l.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void O0(boolean z3) {
        this.f6263l.setUserVisibleHint(z3);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void P(boolean z3) {
        this.f6263l.setMenuVisibility(z3);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void Y(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        AbstractC0549h.j(view);
        this.f6263l.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int b() {
        return this.f6263l.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int c() {
        return this.f6263l.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle d() {
        return this.f6263l.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper e() {
        return wrap(this.f6263l.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper f() {
        return ObjectWrapper.wrap(this.f6263l.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper g() {
        return ObjectWrapper.wrap(this.f6263l.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper h() {
        return wrap(this.f6263l.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper i() {
        return ObjectWrapper.wrap(this.f6263l.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String j() {
        return this.f6263l.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean l() {
        return this.f6263l.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean m() {
        return this.f6263l.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean n() {
        return this.f6263l.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean o() {
        return this.f6263l.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void o0(boolean z3) {
        this.f6263l.setRetainInstance(z3);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean p() {
        return this.f6263l.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q() {
        return this.f6263l.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean s() {
        return this.f6263l.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean t() {
        return this.f6263l.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean w() {
        return this.f6263l.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void x(boolean z3) {
        this.f6263l.setHasOptionsMenu(z3);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void z0(Intent intent) {
        this.f6263l.startActivity(intent);
    }
}
