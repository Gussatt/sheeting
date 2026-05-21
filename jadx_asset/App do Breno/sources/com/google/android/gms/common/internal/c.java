package com.google.android.gms.common.internal;

import S0.C0512j;
import T0.a;
import T0.f;
import U0.InterfaceC0520d;
import U0.InterfaceC0527k;
import V0.AbstractC0545d;
import V0.AbstractC0549h;
import V0.C0543b;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a implements a.f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0543b f6244F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Set f6245G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Account f6246H;

    public c(Context context, Looper looper, int i4, C0543b c0543b, f.a aVar, f.b bVar) {
        this(context, looper, i4, c0543b, (InterfaceC0520d) aVar, (InterfaceC0527k) bVar);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Set C() {
        return this.f6245G;
    }

    @Override // T0.a.f
    public Set c() {
        return o() ? this.f6245G : Collections.EMPTY_SET;
    }

    public Set j0(Set set) {
        return set;
    }

    public final Set k0(Set set) {
        Set setJ0 = j0(set);
        Iterator it = setJ0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setJ0;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Account u() {
        return this.f6246H;
    }

    @Override // com.google.android.gms.common.internal.a
    public Executor w() {
        return null;
    }

    public c(Context context, Looper looper, int i4, C0543b c0543b, InterfaceC0520d interfaceC0520d, InterfaceC0527k interfaceC0527k) {
        this(context, looper, AbstractC0545d.a(context), C0512j.m(), i4, c0543b, (InterfaceC0520d) AbstractC0549h.j(interfaceC0520d), (InterfaceC0527k) AbstractC0549h.j(interfaceC0527k));
    }

    public c(Context context, Looper looper, AbstractC0545d abstractC0545d, C0512j c0512j, int i4, C0543b c0543b, InterfaceC0520d interfaceC0520d, InterfaceC0527k interfaceC0527k) {
        super(context, looper, abstractC0545d, c0512j, i4, interfaceC0520d == null ? null : new d(interfaceC0520d), interfaceC0527k != null ? new e(interfaceC0527k) : null, c0543b.h());
        this.f6244F = c0543b;
        this.f6246H = c0543b.a();
        this.f6245G = k0(c0543b.c());
    }
}
