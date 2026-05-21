package z;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import u.AbstractC1565a;
import z.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f12041a = new Comparator() { // from class: z.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f12042a;

        public b(Context context, Uri uri) {
            this.f12042a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // z.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f12042a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e4) {
                Log.w("FontsProvider", "Unable to query the content provider", e4);
                return null;
            }
        }

        @Override // z.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f12042a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            byte b5 = bArr2[i4];
            if (b4 != b5) {
                return b4 - b5;
            }
        }
        return 0;
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals((byte[]) list.get(i4), (byte[]) list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : AbstractC1565a.c(resources, eVar.c());
    }

    public static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
        return providerInfoF == null ? g.a.a(1, null) : g.a.a(0, g(context, eVar, providerInfoF.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = eVar.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
        }
        List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f12041a);
        List listD = d(eVar, resources);
        for (int i4 = 0; i4 < listD.size(); i4++) {
            ArrayList arrayList = new ArrayList((Collection) listD.get(i4));
            Collections.sort(arrayList, f12041a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z.g.b[] g(android.content.Context r16, z.e r17, java.lang.String r18, android.os.CancellationSignal r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.d.g(android.content.Context, z.e, java.lang.String, android.os.CancellationSignal):z.g$b[]");
    }
}
