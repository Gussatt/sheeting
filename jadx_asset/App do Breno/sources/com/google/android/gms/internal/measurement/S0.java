package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import k1.AbstractC1276o3;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f6576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f6578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f6579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6580u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(C0904z1 c0904z1, String str, String str2, Context context, Bundle bundle) {
        super(c0904z1, true);
        this.f6576q = str;
        this.f6577r = str2;
        this.f6578s = context;
        this.f6579t = bundle;
        this.f6580u = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            C0904z1 c0904z1 = this.f6580u;
            String str4 = this.f6576q;
            String str5 = this.f6577r;
            if (c0904z1.t(str4, str5)) {
                str2 = str4;
                str3 = str5;
                str = c0904z1.f7025a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Context context = this.f6578s;
            AbstractC0549h.j(context);
            c0904z1.f7033i = c0904z1.y(context, true);
            if (c0904z1.f7033i == null) {
                Log.w(c0904z1.f7025a, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((InterfaceC0871v0) AbstractC0549h.j(c0904z1.f7033i)).initialize(ObjectWrapper.wrap(context), new F0(119002L, Math.max(iA, r0), DynamiteModule.b(context, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.f6579t, AbstractC1276o3.a(context)), this.f6905m);
        } catch (Exception e4) {
            this.f6580u.q(e4, true, false);
        }
    }
}
