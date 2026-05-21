package S0;

import V0.AbstractC0549h;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends zzz {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3454l;

    public z(byte[] bArr) {
        AbstractC0549h.a(bArr.length == 25);
        this.f3454l = Arrays.hashCode(bArr);
    }

    public static byte[] r(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // V0.C
    public final int c() {
        return this.f3454l;
    }

    @Override // V0.C
    public final IObjectWrapper d() {
        return ObjectWrapper.wrap(u());
    }

    public final boolean equals(Object obj) {
        IObjectWrapper iObjectWrapperD;
        if (obj != null && (obj instanceof V0.C)) {
            try {
                V0.C c4 = (V0.C) obj;
                if (c4.c() == this.f3454l && (iObjectWrapperD = c4.d()) != null) {
                    return Arrays.equals(u(), (byte[]) ObjectWrapper.unwrap(iObjectWrapperD));
                }
                return false;
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3454l;
    }

    public abstract byte[] u();
}
