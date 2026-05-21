package m1;

import S0.C0504b;
import T0.f;
import V0.AbstractC0549h;
import V0.C0543b;
import V0.C0565y;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;
import l1.InterfaceC1386e;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1392a extends com.google.android.gms.common.internal.c implements InterfaceC1386e {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f10324M = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f10325I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0543b f10326J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Bundle f10327K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Integer f10328L;

    public C1392a(Context context, Looper looper, boolean z3, C0543b c0543b, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, c0543b, aVar, bVar);
        this.f10325I = true;
        this.f10326J = c0543b;
        this.f10327K = bundle;
        this.f10328L = c0543b.g();
    }

    public static Bundle l0(C0543b c0543b) {
        c0543b.f();
        Integer numG = c0543b.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c0543b.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle A() {
        if (!y().getPackageName().equals(this.f10326J.d())) {
            this.f10327K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f10326J.d());
        }
        return this.f10327K;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.a, T0.a.f
    public final int g() {
        return 12451000;
    }

    @Override // l1.InterfaceC1386e
    public final void k(InterfaceC1395d interfaceC1395d) {
        AbstractC0549h.k(interfaceC1395d, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f10326J.b();
            ((C1396e) D()).o1(new h(1, new C0565y(accountB, ((Integer) AbstractC0549h.j(this.f10328L)).intValue(), "<<default account>>".equals(accountB.name) ? Q0.a.a(y()).b() : null)), interfaceC1395d);
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC1395d.J0(new j(1, new C0504b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.a, T0.a.f
    public final boolean o() {
        return this.f10325I;
    }

    @Override // l1.InterfaceC1386e
    public final void p() {
        m(new a.d());
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C1396e ? (C1396e) iInterfaceQueryLocalInterface : new C1396e(iBinder);
    }
}
