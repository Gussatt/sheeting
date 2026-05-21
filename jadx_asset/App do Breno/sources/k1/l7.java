package k1;

import V0.AbstractC0549h;
import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c1.C0663e;
import com.google.android.gms.internal.measurement.AbstractC0739f0;
import com.google.android.gms.internal.measurement.C0735e5;
import com.google.android.gms.internal.measurement.C0764h7;
import com.google.android.gms.internal.measurement.C0777j2;
import com.google.android.gms.internal.measurement.C0787k3;
import com.google.android.gms.internal.measurement.C0795l3;
import com.google.android.gms.internal.measurement.C0889x2;
import com.google.android.gms.internal.measurement.C0897y2;
import com.google.android.gms.internal.measurement.EnumC0733e3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p.C1475a;

/* JADX INFO: loaded from: classes.dex */
public final class l7 implements InterfaceC1186d4 {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static volatile l7 f9538K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f9539A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Map f9540B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Map f9541C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Map f9542D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C1333v5 f9544F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f9545G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public AbstractC1141A f9546H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f9547I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1268n3 f9549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q2 f9550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1343x f9551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S2 f9552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public N6 f9553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1199f f9554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r7 f9555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1294q5 f9556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1287p6 f9557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y6 f9558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1176c3 f9559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1363z3 f9560l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f9564p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FileLock f9571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FileChannel f9572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f9573y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f9574z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f9561m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Deque f9565q = new LinkedList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Map f9543E = new HashMap();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final v7 f9548J = new g7(this);

    public l7(m7 m7Var, C1363z3 c1363z3) {
        AbstractC0549h.j(m7Var);
        this.f9560l = C1363z3.J(m7Var.f9592a, null, null);
        this.f9539A = -1L;
        this.f9558j = new Y6(this);
        r7 r7Var = new r7(this);
        r7Var.j();
        this.f9555g = r7Var;
        Q2 q22 = new Q2(this);
        q22.j();
        this.f9550b = q22;
        C1268n3 c1268n3 = new C1268n3(this);
        c1268n3.j();
        this.f9549a = c1268n3;
        this.f9540B = new HashMap();
        this.f9541C = new HashMap();
        this.f9542D = new HashMap();
        e().A(new RunnableC1162a7(this, m7Var));
    }

    public static final void G(com.google.android.gms.internal.measurement.H2 h22, int i4, String str) {
        List listJ = h22.J();
        for (int i5 = 0; i5 < listJ.size(); i5++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.M2) listJ.get(i5)).L())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.L2 l2J = com.google.android.gms.internal.measurement.M2.J();
        l2J.D("_err");
        l2J.C(i4);
        com.google.android.gms.internal.measurement.M2 m22 = (com.google.android.gms.internal.measurement.M2) l2J.q();
        com.google.android.gms.internal.measurement.L2 l2J2 = com.google.android.gms.internal.measurement.M2.J();
        l2J2.D("_ev");
        l2J2.E(str);
        com.google.android.gms.internal.measurement.M2 m23 = (com.google.android.gms.internal.measurement.M2) l2J2.q();
        h22.z(m22);
        h22.z(m23);
    }

    public static final void H(com.google.android.gms.internal.measurement.H2 h22, String str) {
        List listJ = h22.J();
        for (int i4 = 0; i4 < listJ.size(); i4++) {
            if (str.equals(((com.google.android.gms.internal.measurement.M2) listJ.get(i4)).L())) {
                h22.B(i4);
                return;
            }
        }
    }

    public static String M(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void Q(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static l7 S0(Context context) {
        AbstractC0549h.j(context);
        AbstractC0549h.j(context.getApplicationContext());
        if (f9538K == null) {
            synchronized (l7.class) {
                try {
                    if (f9538K == null) {
                        f9538K = new l7((m7) AbstractC0549h.j(new m7(context)), null);
                    }
                } finally {
                }
            }
        }
        return f9538K;
    }

    public static final boolean W(x7 x7Var) {
        return (TextUtils.isEmpty(x7Var.f9968n) && TextUtils.isEmpty(x7Var.f9949B)) ? false : true;
    }

    public static final W6 X(W6 w6) {
        if (w6 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (w6.k()) {
            return w6;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(w6.getClass())));
    }

    public static final Boolean Y(x7 x7Var) {
        Boolean bool = x7Var.f9950C;
        String str = x7Var.f9964Q;
        if (!TextUtils.isEmpty(str)) {
            EnumC1204f4 enumC1204f4B = C1201f1.a(str).b();
            EnumC1204f4 enumC1204f4 = EnumC1204f4.UNINITIALIZED;
            int iOrdinal = enumC1204f4B.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static /* bridge */ /* synthetic */ void m(l7 l7Var, m7 m7Var) {
        l7Var.e().h();
        l7Var.f9559k = new C1176c3(l7Var);
        C1343x c1343x = new C1343x(l7Var);
        c1343x.j();
        l7Var.f9551c = c1343x;
        l7Var.D0().M((InterfaceC1256m) AbstractC0549h.j(l7Var.f9549a));
        C1287p6 c1287p6 = new C1287p6(l7Var);
        c1287p6.j();
        l7Var.f9557i = c1287p6;
        C1199f c1199f = new C1199f(l7Var);
        c1199f.j();
        l7Var.f9554f = c1199f;
        C1294q5 c1294q5 = new C1294q5(l7Var);
        c1294q5.j();
        l7Var.f9556h = c1294q5;
        N6 n6 = new N6(l7Var);
        n6.j();
        l7Var.f9553e = n6;
        l7Var.f9552d = new S2(l7Var);
        if (l7Var.f9566r != l7Var.f9567s) {
            l7Var.c().r().c("Not all upload components initialized", Integer.valueOf(l7Var.f9566r), Integer.valueOf(l7Var.f9567s));
        }
        l7Var.f9561m.set(true);
        l7Var.c().v().a("UploadController is now fully initialized");
    }

    public final void A() {
        this.f9567s++;
    }

    public final Bundle A0(String str, C1150J c1150j) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", c1150j.f9089n.i("_sid").longValue());
        u7 u7VarN0 = E0().N0(str, "_sno");
        if (u7VarN0 != null) {
            Object obj = u7VarN0.f9881e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.B(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k1.F2 B0(k1.x7 r13) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.B0(k1.x7):k1.F2");
    }

    public final void C(boolean z3) {
        R();
    }

    public final C1199f C0() {
        C1199f c1199f = this.f9554f;
        X(c1199f);
        return c1199f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x0016, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7, B:98:0x0295), top: B:105:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[Catch: all -> 0x0016, PHI: r0
      0x008c: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:9:0x0027, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7, B:98:0x0295), top: B:105:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #0 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7), top: B:103:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #0 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7), top: B:103:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[Catch: all -> 0x0166, TryCatch #1 {all -> 0x0166, blocks: (B:32:0x00eb, B:34:0x00f9, B:36:0x0105, B:37:0x010e, B:39:0x0114, B:41:0x012d, B:45:0x0150, B:47:0x015a, B:50:0x0169, B:51:0x016d, B:53:0x0173, B:55:0x018a, B:57:0x01af, B:58:0x01b3, B:60:0x01b9, B:61:0x01e0, B:62:0x01e4, B:64:0x01ea, B:65:0x01f1, B:66:0x020b, B:69:0x0217, B:70:0x021e, B:72:0x0220, B:73:0x022f, B:75:0x0231, B:77:0x0235, B:80:0x023c, B:81:0x023d), top: B:104:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ea A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:32:0x00eb, B:34:0x00f9, B:36:0x0105, B:37:0x010e, B:39:0x0114, B:41:0x012d, B:45:0x0150, B:47:0x015a, B:50:0x0169, B:51:0x016d, B:53:0x0173, B:55:0x018a, B:57:0x01af, B:58:0x01b3, B:60:0x01b9, B:61:0x01e0, B:62:0x01e4, B:64:0x01ea, B:65:0x01f1, B:66:0x020b, B:69:0x0217, B:70:0x021e, B:72:0x0220, B:73:0x022f, B:75:0x0231, B:77:0x0235, B:80:0x023c, B:81:0x023d), top: B:104:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0271 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #0 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7), top: B:103:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0285 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #0 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7), top: B:103:0x00a3, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.D(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final C1264n D0() {
        return ((C1363z3) AbstractC0549h.j(this.f9560l)).B();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:21:0x0067, B:24:0x008d, B:13:0x001e, B:15:0x004b, B:17:0x0055, B:19:0x005f, B:20:0x0063), top: B:29:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, k1.p7 r8) {
        /*
            r3 = this;
            k1.s3 r0 = r3.e()
            r0.h()
            r3.r()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto La8
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L67
            r5 = r1
        L1c:
            if (r6 != 0) goto L67
            k1.x r6 = r3.E0()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.w(r7)     // Catch: java.lang.Throwable -> L10
            k1.K2 r6 = r3.c()     // Catch: java.lang.Throwable -> L10
            k1.I2 r6 = r6.v()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.c(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            k1.n r5 = r3.D0()     // Catch: java.lang.Throwable -> L10
            k1.o2 r6 = k1.AbstractC1291q2.f9697N0     // Catch: java.lang.Throwable -> L10
            r7 = 0
            boolean r5 = r5.P(r7, r6)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L63
            k1.Q2 r5 = r3.I0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.o()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L63
            k1.x r5 = r3.E0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.K(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L63
            r3.u0(r4)     // Catch: java.lang.Throwable -> L10
            goto La2
        L63:
            r3.R()     // Catch: java.lang.Throwable -> L10
            goto La2
        L67:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            k1.K2 r1 = r3.c()     // Catch: java.lang.Throwable -> L10
            k1.I2 r1 = r1.x()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L8d
            r6 = r7
        L8d:
            r1.d(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            k1.x r4 = r3.E0()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.z(r5)     // Catch: java.lang.Throwable -> L10
            r3.R()     // Catch: java.lang.Throwable -> L10
        La2:
            r3.f9569u = r0
            r3.N()
            return
        La8:
            r3.f9569u = r0
            r3.N()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.E(java.lang.String, int, java.lang.Throwable, byte[], k1.p7):void");
    }

    public final C1343x E0() {
        C1343x c1343x = this.f9551c;
        X(c1343x);
        return c1343x;
    }

    public final long F() {
        long jA = f().a();
        C1287p6 c1287p6 = this.f9557i;
        c1287p6.i();
        c1287p6.h();
        V2 v22 = c1287p6.f9660j;
        long jA2 = v22.a();
        if (jA2 == 0) {
            jA2 = ((long) c1287p6.f9366a.Q().x().nextInt(86400000)) + 1;
            v22.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k1.C1143C F0(java.lang.String r10, k1.C1143C r11, k1.C1229i4 r12, k1.C1280p r13) {
        /*
            r9 = this;
            k1.n3 r0 = r9.K0()
            com.google.android.gms.internal.measurement.d2 r0 = r0.D(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            k1.f4 r10 = r11.f()
            k1.f4 r12 = k1.EnumC1204f4.DENIED
            if (r10 != r12) goto L20
            int r2 = r11.a()
            k1.h4 r10 = k1.EnumC1221h4.AD_USER_DATA
            r13.c(r10, r2)
            goto L27
        L20:
            k1.h4 r10 = k1.EnumC1221h4.AD_USER_DATA
            k1.o r11 = k1.EnumC1272o.FAILSAFE
            r13.d(r10, r11)
        L27:
            k1.C r10 = new k1.C
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.<init>(r11, r2, r12, r1)
            return r10
        L31:
            k1.f4 r0 = r11.f()
            k1.f4 r3 = k1.EnumC1204f4.GRANTED
            if (r0 == r3) goto L85
            k1.f4 r4 = k1.EnumC1204f4.DENIED
            if (r0 != r4) goto L3e
            goto L85
        L3e:
            k1.f4 r11 = k1.EnumC1204f4.POLICY
            if (r0 != r11) goto L55
            k1.n3 r11 = r9.f9549a
            k1.h4 r0 = k1.EnumC1221h4.AD_USER_DATA
            k1.f4 r11 = r11.B(r10, r0)
            k1.f4 r5 = k1.EnumC1204f4.UNINITIALIZED
            if (r11 == r5) goto L55
            k1.o r12 = k1.EnumC1272o.REMOTE_ENFORCED_DEFAULT
            r13.d(r0, r12)
            r0 = r11
            goto L8e
        L55:
            k1.n3 r11 = r9.f9549a
            k1.h4 r0 = k1.EnumC1221h4.AD_USER_DATA
            k1.h4 r5 = r11.C(r10, r0)
            k1.f4 r12 = r12.e()
            r6 = 1
            if (r12 == r3) goto L66
            if (r12 != r4) goto L68
        L66:
            r7 = r6
            goto L69
        L68:
            r7 = 0
        L69:
            k1.h4 r8 = k1.EnumC1221h4.AD_STORAGE
            if (r5 != r8) goto L76
            if (r7 == 0) goto L76
            k1.o r11 = k1.EnumC1272o.REMOTE_DELEGATION
            r13.d(r0, r11)
            r0 = r12
            goto L8e
        L76:
            k1.o r12 = k1.EnumC1272o.REMOTE_DEFAULT
            r13.d(r0, r12)
            boolean r11 = r11.P(r10, r0)
            if (r6 == r11) goto L83
            r0 = r4
            goto L8e
        L83:
            r0 = r3
            goto L8e
        L85:
            int r2 = r11.a()
            k1.h4 r11 = k1.EnumC1221h4.AD_USER_DATA
            r13.c(r11, r2)
        L8e:
            k1.n3 r11 = r9.f9549a
            boolean r11 = r11.Q(r10)
            k1.n3 r12 = r9.K0()
            java.util.SortedSet r10 = r12.K(r10)
            k1.f4 r12 = k1.EnumC1204f4.DENIED
            if (r0 == r12) goto Lbb
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto La7
            goto Lbb
        La7:
            k1.C r12 = new k1.C
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = ""
            if (r11 == 0) goto Lb7
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
        Lb7:
            r12.<init>(r13, r2, r0, r1)
            return r12
        Lbb:
            k1.C r10 = new k1.C
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.<init>(r12, r2, r11, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.F0(java.lang.String, k1.C, k1.i4, k1.p):k1.C");
    }

    public final C1143C G0(String str) {
        e().h();
        r();
        Map map = this.f9541C;
        C1143C c1143c = (C1143C) map.get(str);
        if (c1143c != null) {
            return c1143c;
        }
        C1143C c1143cF0 = E0().F0(str);
        map.put(str, c1143cF0);
        return c1143cF0;
    }

    public final C2 H0() {
        return this.f9560l.F();
    }

    public final int I(String str, C1280p c1280p) {
        EnumC1221h4 enumC1221h4;
        EnumC1204f4 enumC1204f4B;
        C1268n3 c1268n3 = this.f9549a;
        if (c1268n3.D(str) == null) {
            c1280p.d(EnumC1221h4.AD_PERSONALIZATION, EnumC1272o.FAILSAFE);
            return 1;
        }
        F2 f2A0 = E0().A0(str);
        if (f2A0 != null && C1201f1.a(f2A0.k()).b() == EnumC1204f4.POLICY && (enumC1204f4B = c1268n3.B(str, (enumC1221h4 = EnumC1221h4.AD_PERSONALIZATION))) != EnumC1204f4.UNINITIALIZED) {
            c1280p.d(enumC1221h4, EnumC1272o.REMOTE_ENFORCED_DEFAULT);
            return enumC1204f4B == EnumC1204f4.GRANTED ? 0 : 1;
        }
        EnumC1221h4 enumC1221h42 = EnumC1221h4.AD_PERSONALIZATION;
        c1280p.d(enumC1221h42, EnumC1272o.REMOTE_DEFAULT);
        return c1268n3.P(str, enumC1221h42) ? 0 : 1;
    }

    public final Q2 I0() {
        Q2 q22 = this.f9550b;
        X(q22);
        return q22;
    }

    public final x7 J(String str) {
        F2 f2A0 = E0().A0(str);
        if (f2A0 == null || TextUtils.isEmpty(f2A0.f())) {
            c().q().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolL = L(f2A0);
        if (boolL == null || boolL.booleanValue()) {
            return new x7(str, f2A0.h(), f2A0.f(), f2A0.s0(), f2A0.e(), f2A0.E0(), f2A0.B0(), (String) null, f2A0.K(), false, f2A0.g(), 0L, 0, f2A0.J(), false, f2A0.a(), f2A0.L0(), f2A0.C0(), f2A0.n(), (String) null, N0(str).q(), "", (String) null, f2A0.M(), f2A0.K0(), N0(str).b(), G0(str).j(), f2A0.A(), f2A0.t0(), f2A0.m(), f2A0.k(), 0L, f2A0.p0());
        }
        c().r().b("App version does not match; dropping. appId", K2.z(str));
        return null;
    }

    public final S2 J0() {
        S2 s22 = this.f9552d;
        if (s22 != null) {
            return s22;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final AbstractC1141A K() {
        if (this.f9546H == null) {
            this.f9546H = new C1189d7(this, this.f9560l);
        }
        return this.f9546H;
    }

    public final C1268n3 K0() {
        C1268n3 c1268n3 = this.f9549a;
        X(c1268n3);
        return c1268n3;
    }

    public final Boolean L(F2 f22) {
        try {
            if (f22.s0() != -2147483648L) {
                if (f22.s0() == C0663e.a(this.f9560l.d()).d(f22.c(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C0663e.a(this.f9560l.d()).d(f22.c(), 0).versionName;
                String strF = f22.f();
                if (strF != null && strF.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final C1363z3 M0() {
        return this.f9560l;
    }

    public final void N() {
        e().h();
        if (this.f9568t || this.f9569u || this.f9570v) {
            c().v().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f9568t), Boolean.valueOf(this.f9569u), Boolean.valueOf(this.f9570v));
            return;
        }
        c().v().a("Stopping uploading service(s)");
        List list = this.f9564p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) AbstractC0549h.j(this.f9564p)).clear();
    }

    public final C1229i4 N0(String str) {
        C1229i4 c1229i4 = C1229i4.f9474c;
        e().h();
        r();
        C1229i4 c1229i4J0 = (C1229i4) this.f9540B.get(str);
        if (c1229i4J0 == null) {
            c1229i4J0 = E0().J0(str);
            if (c1229i4J0 == null) {
                c1229i4J0 = C1229i4.f9474c;
            }
            p0(str, c1229i4J0);
        }
        return c1229i4J0;
    }

    public final void O(com.google.android.gms.internal.measurement.S2 s22, long j4, boolean z3) {
        Object obj;
        String str = true != z3 ? "_lte" : "_se";
        u7 u7VarN0 = E0().N0(s22.a0(), str);
        u7 u7Var = (u7VarN0 == null || (obj = u7VarN0.f9881e) == null) ? new u7(s22.a0(), "auto", str, f().a(), Long.valueOf(j4)) : new u7(s22.a0(), "auto", str, f().a(), Long.valueOf(((Long) obj).longValue() + j4));
        C0787k3 c0787k3J = C0795l3.J();
        c0787k3J.z(str);
        c0787k3J.A(f().a());
        Object obj2 = u7Var.f9881e;
        c0787k3J.y(((Long) obj2).longValue());
        C0795l3 c0795l3 = (C0795l3) c0787k3J.q();
        int iE = r7.E(s22, str);
        if (iE >= 0) {
            s22.X(iE, c0795l3);
        } else {
            s22.a1(c0795l3);
        }
        if (j4 > 0) {
            E0().d0(u7Var);
            c().v().c("Updated engagement user property. scope, value", true != z3 ? "lifetime" : "session-scoped", obj2);
        }
    }

    public final C1294q5 O0() {
        C1294q5 c1294q5 = this.f9556h;
        X(c1294q5);
        return c1294q5;
    }

    public final void P() {
        e().h();
        if (this.f9565q.isEmpty() || K().e()) {
            return;
        }
        long jMax = Math.max(0L, ((long) ((Integer) AbstractC1291q2.f9673B0.a(null)).intValue()) - (f().b() - this.f9547I));
        c().v().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        K().d(jMax);
    }

    public final C1287p6 P0() {
        return this.f9557i;
    }

    public final N6 Q0() {
        N6 n6 = this.f9553e;
        X(n6);
        return n6;
    }

    public final void R() {
        long jMax;
        long jMax2;
        e().h();
        r();
        if (this.f9563o > 0) {
            long jAbs = 3600000 - Math.abs(f().b() - this.f9563o);
            if (jAbs > 0) {
                c().v().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                J0().c();
                Q0().m();
                return;
            }
            this.f9563o = 0L;
        }
        if (!this.f9560l.r() || !T()) {
            c().v().a("Nothing to upload or uploading impossible");
            J0().c();
            Q0().m();
            return;
        }
        long jA = f().a();
        D0();
        long jMax3 = Math.max(0L, ((Long) AbstractC1291q2.f9698O.a(null)).longValue());
        boolean z3 = true;
        if (!E0().X() && !E0().W()) {
            z3 = false;
        }
        if (z3) {
            String strG = D0().G();
            if (TextUtils.isEmpty(strG) || ".none.".equals(strG)) {
                D0();
                jMax = Math.max(0L, ((Long) AbstractC1291q2.f9686I.a(null)).longValue());
            } else {
                D0();
                jMax = Math.max(0L, ((Long) AbstractC1291q2.f9688J.a(null)).longValue());
            }
        } else {
            D0();
            jMax = Math.max(0L, ((Long) AbstractC1291q2.f9684H.a(null)).longValue());
        }
        long jA2 = this.f9557i.f9658h.a();
        long jA3 = this.f9557i.f9659i.a();
        long j4 = 0;
        boolean z4 = z3;
        long jMax4 = Math.max(E0().v0(), E0().w0());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z4 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!a().W(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i4 = 0;
                while (true) {
                    D0();
                    if (i4 >= Math.min(20, Math.max(0, ((Integer) AbstractC1291q2.f9702Q.a(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    D0();
                    jMax2 += Math.max(j4, ((Long) AbstractC1291q2.f9700P.a(null)).longValue()) * (1 << i4);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i4++;
                    j4 = 0;
                }
            }
            j4 = 0;
        }
        if (jMax2 == j4) {
            c().v().a("Next upload time is 0");
            J0().c();
            Q0().m();
            return;
        }
        if (!I0().o()) {
            c().v().a("No network");
            J0().b();
            Q0().m();
            return;
        }
        long jA4 = this.f9557i.f9657g.a();
        D0();
        long jMax6 = Math.max(0L, ((Long) AbstractC1291q2.f9680F.a(null)).longValue());
        if (!a().W(jA4, jMax6)) {
            jMax2 = Math.max(jMax2, jA4 + jMax6);
        }
        J0().c();
        long jA5 = jMax2 - f().a();
        if (jA5 <= 0) {
            D0();
            jA5 = Math.max(0L, ((Long) AbstractC1291q2.f9690K.a(null)).longValue());
            this.f9557i.f9658h.b(f().a());
        }
        c().v().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        Q0().n(jA5);
    }

    public final Y6 R0() {
        return this.f9558j;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x03cf A[Catch: all -> 0x00f7, TryCatch #3 {all -> 0x00f7, blocks: (B:3:0x0012, B:5:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:210:0x06a0, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:37:0x013d, B:39:0x014a, B:41:0x0156, B:43:0x015c, B:47:0x0167, B:48:0x0175, B:50:0x0183, B:53:0x01a3, B:55:0x01a9, B:57:0x01b9, B:59:0x01c7, B:61:0x01d7, B:62:0x01e4, B:63:0x01e7, B:66:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:86:0x0295, B:82:0x0263, B:84:0x0273, B:90:0x02a2, B:92:0x02ce, B:93:0x02f8, B:95:0x0331, B:97:0x0337, B:100:0x0343, B:102:0x037a, B:103:0x0395, B:105:0x039b, B:107:0x03ab, B:111:0x03c1, B:108:0x03b5, B:114:0x03c8, B:117:0x03cf, B:118:0x03e7, B:120:0x0400, B:121:0x040c, B:124:0x0418, B:130:0x043b, B:127:0x042a, B:150:0x04bb, B:152:0x04c7, B:155:0x04d8, B:157:0x04e9, B:159:0x04f5, B:176:0x055f, B:178:0x0565, B:179:0x0571, B:181:0x0577, B:183:0x0585, B:185:0x058f, B:186:0x05a2, B:188:0x05a8, B:189:0x05c3, B:191:0x05c9, B:192:0x05e7, B:193:0x05f6, B:197:0x0625, B:194:0x0600, B:196:0x0612, B:198:0x062f, B:199:0x0649, B:201:0x064f, B:203:0x0662, B:204:0x066f, B:205:0x0673, B:207:0x0679, B:209:0x0689, B:164:0x050e, B:166:0x051c, B:169:0x052d, B:171:0x053e, B:173:0x054a, B:133:0x0444, B:135:0x0450, B:137:0x045c, B:148:0x04a0, B:140:0x0478, B:143:0x048a, B:145:0x0490, B:147:0x049a, B:213:0x06b9, B:215:0x06c7, B:217:0x06d0, B:228:0x06fe, B:218:0x06d6, B:220:0x06df, B:222:0x06e5, B:225:0x06f1, B:227:0x06f9, B:229:0x0701, B:230:0x070d, B:233:0x0715, B:235:0x0727, B:236:0x0732, B:238:0x073a, B:242:0x0760, B:244:0x077a, B:246:0x078f, B:248:0x07a9, B:250:0x07be, B:251:0x07cc, B:253:0x07d2, B:255:0x07e2, B:256:0x07e9, B:258:0x07f5, B:259:0x07fc, B:260:0x0801, B:262:0x0843, B:264:0x0849, B:270:0x0870, B:272:0x0878, B:273:0x0881, B:275:0x0887, B:276:0x088d, B:278:0x08a2, B:280:0x08b2, B:282:0x08c2, B:284:0x08ca, B:285:0x08cd, B:293:0x0947, B:295:0x0960, B:297:0x0976, B:299:0x097b, B:301:0x097f, B:303:0x0983, B:305:0x098d, B:306:0x0993, B:308:0x0997, B:310:0x099d, B:312:0x09ae, B:314:0x09ba, B:320:0x09e3, B:323:0x09e9, B:265:0x0857, B:267:0x085d, B:269:0x0863, B:249:0x07bb, B:245:0x078c, B:239:0x0740, B:241:0x0746), top: B:471:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e7 A[Catch: all -> 0x00f7, TryCatch #3 {all -> 0x00f7, blocks: (B:3:0x0012, B:5:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:210:0x06a0, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:37:0x013d, B:39:0x014a, B:41:0x0156, B:43:0x015c, B:47:0x0167, B:48:0x0175, B:50:0x0183, B:53:0x01a3, B:55:0x01a9, B:57:0x01b9, B:59:0x01c7, B:61:0x01d7, B:62:0x01e4, B:63:0x01e7, B:66:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:86:0x0295, B:82:0x0263, B:84:0x0273, B:90:0x02a2, B:92:0x02ce, B:93:0x02f8, B:95:0x0331, B:97:0x0337, B:100:0x0343, B:102:0x037a, B:103:0x0395, B:105:0x039b, B:107:0x03ab, B:111:0x03c1, B:108:0x03b5, B:114:0x03c8, B:117:0x03cf, B:118:0x03e7, B:120:0x0400, B:121:0x040c, B:124:0x0418, B:130:0x043b, B:127:0x042a, B:150:0x04bb, B:152:0x04c7, B:155:0x04d8, B:157:0x04e9, B:159:0x04f5, B:176:0x055f, B:178:0x0565, B:179:0x0571, B:181:0x0577, B:183:0x0585, B:185:0x058f, B:186:0x05a2, B:188:0x05a8, B:189:0x05c3, B:191:0x05c9, B:192:0x05e7, B:193:0x05f6, B:197:0x0625, B:194:0x0600, B:196:0x0612, B:198:0x062f, B:199:0x0649, B:201:0x064f, B:203:0x0662, B:204:0x066f, B:205:0x0673, B:207:0x0679, B:209:0x0689, B:164:0x050e, B:166:0x051c, B:169:0x052d, B:171:0x053e, B:173:0x054a, B:133:0x0444, B:135:0x0450, B:137:0x045c, B:148:0x04a0, B:140:0x0478, B:143:0x048a, B:145:0x0490, B:147:0x049a, B:213:0x06b9, B:215:0x06c7, B:217:0x06d0, B:228:0x06fe, B:218:0x06d6, B:220:0x06df, B:222:0x06e5, B:225:0x06f1, B:227:0x06f9, B:229:0x0701, B:230:0x070d, B:233:0x0715, B:235:0x0727, B:236:0x0732, B:238:0x073a, B:242:0x0760, B:244:0x077a, B:246:0x078f, B:248:0x07a9, B:250:0x07be, B:251:0x07cc, B:253:0x07d2, B:255:0x07e2, B:256:0x07e9, B:258:0x07f5, B:259:0x07fc, B:260:0x0801, B:262:0x0843, B:264:0x0849, B:270:0x0870, B:272:0x0878, B:273:0x0881, B:275:0x0887, B:276:0x088d, B:278:0x08a2, B:280:0x08b2, B:282:0x08c2, B:284:0x08ca, B:285:0x08cd, B:293:0x0947, B:295:0x0960, B:297:0x0976, B:299:0x097b, B:301:0x097f, B:303:0x0983, B:305:0x098d, B:306:0x0993, B:308:0x0997, B:310:0x099d, B:312:0x09ae, B:314:0x09ba, B:320:0x09e3, B:323:0x09e9, B:265:0x0857, B:267:0x085d, B:269:0x0863, B:249:0x07bb, B:245:0x078c, B:239:0x0740, B:241:0x0746), top: B:471:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0400 A[Catch: all -> 0x00f7, TryCatch #3 {all -> 0x00f7, blocks: (B:3:0x0012, B:5:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:210:0x06a0, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:37:0x013d, B:39:0x014a, B:41:0x0156, B:43:0x015c, B:47:0x0167, B:48:0x0175, B:50:0x0183, B:53:0x01a3, B:55:0x01a9, B:57:0x01b9, B:59:0x01c7, B:61:0x01d7, B:62:0x01e4, B:63:0x01e7, B:66:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:86:0x0295, B:82:0x0263, B:84:0x0273, B:90:0x02a2, B:92:0x02ce, B:93:0x02f8, B:95:0x0331, B:97:0x0337, B:100:0x0343, B:102:0x037a, B:103:0x0395, B:105:0x039b, B:107:0x03ab, B:111:0x03c1, B:108:0x03b5, B:114:0x03c8, B:117:0x03cf, B:118:0x03e7, B:120:0x0400, B:121:0x040c, B:124:0x0418, B:130:0x043b, B:127:0x042a, B:150:0x04bb, B:152:0x04c7, B:155:0x04d8, B:157:0x04e9, B:159:0x04f5, B:176:0x055f, B:178:0x0565, B:179:0x0571, B:181:0x0577, B:183:0x0585, B:185:0x058f, B:186:0x05a2, B:188:0x05a8, B:189:0x05c3, B:191:0x05c9, B:192:0x05e7, B:193:0x05f6, B:197:0x0625, B:194:0x0600, B:196:0x0612, B:198:0x062f, B:199:0x0649, B:201:0x064f, B:203:0x0662, B:204:0x066f, B:205:0x0673, B:207:0x0679, B:209:0x0689, B:164:0x050e, B:166:0x051c, B:169:0x052d, B:171:0x053e, B:173:0x054a, B:133:0x0444, B:135:0x0450, B:137:0x045c, B:148:0x04a0, B:140:0x0478, B:143:0x048a, B:145:0x0490, B:147:0x049a, B:213:0x06b9, B:215:0x06c7, B:217:0x06d0, B:228:0x06fe, B:218:0x06d6, B:220:0x06df, B:222:0x06e5, B:225:0x06f1, B:227:0x06f9, B:229:0x0701, B:230:0x070d, B:233:0x0715, B:235:0x0727, B:236:0x0732, B:238:0x073a, B:242:0x0760, B:244:0x077a, B:246:0x078f, B:248:0x07a9, B:250:0x07be, B:251:0x07cc, B:253:0x07d2, B:255:0x07e2, B:256:0x07e9, B:258:0x07f5, B:259:0x07fc, B:260:0x0801, B:262:0x0843, B:264:0x0849, B:270:0x0870, B:272:0x0878, B:273:0x0881, B:275:0x0887, B:276:0x088d, B:278:0x08a2, B:280:0x08b2, B:282:0x08c2, B:284:0x08ca, B:285:0x08cd, B:293:0x0947, B:295:0x0960, B:297:0x0976, B:299:0x097b, B:301:0x097f, B:303:0x0983, B:305:0x098d, B:306:0x0993, B:308:0x0997, B:310:0x099d, B:312:0x09ae, B:314:0x09ba, B:320:0x09e3, B:323:0x09e9, B:265:0x0857, B:267:0x085d, B:269:0x0863, B:249:0x07bb, B:245:0x078c, B:239:0x0740, B:241:0x0746), top: B:471:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c7 A[Catch: all -> 0x00f7, TryCatch #3 {all -> 0x00f7, blocks: (B:3:0x0012, B:5:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:210:0x06a0, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:37:0x013d, B:39:0x014a, B:41:0x0156, B:43:0x015c, B:47:0x0167, B:48:0x0175, B:50:0x0183, B:53:0x01a3, B:55:0x01a9, B:57:0x01b9, B:59:0x01c7, B:61:0x01d7, B:62:0x01e4, B:63:0x01e7, B:66:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:86:0x0295, B:82:0x0263, B:84:0x0273, B:90:0x02a2, B:92:0x02ce, B:93:0x02f8, B:95:0x0331, B:97:0x0337, B:100:0x0343, B:102:0x037a, B:103:0x0395, B:105:0x039b, B:107:0x03ab, B:111:0x03c1, B:108:0x03b5, B:114:0x03c8, B:117:0x03cf, B:118:0x03e7, B:120:0x0400, B:121:0x040c, B:124:0x0418, B:130:0x043b, B:127:0x042a, B:150:0x04bb, B:152:0x04c7, B:155:0x04d8, B:157:0x04e9, B:159:0x04f5, B:176:0x055f, B:178:0x0565, B:179:0x0571, B:181:0x0577, B:183:0x0585, B:185:0x058f, B:186:0x05a2, B:188:0x05a8, B:189:0x05c3, B:191:0x05c9, B:192:0x05e7, B:193:0x05f6, B:197:0x0625, B:194:0x0600, B:196:0x0612, B:198:0x062f, B:199:0x0649, B:201:0x064f, B:203:0x0662, B:204:0x066f, B:205:0x0673, B:207:0x0679, B:209:0x0689, B:164:0x050e, B:166:0x051c, B:169:0x052d, B:171:0x053e, B:173:0x054a, B:133:0x0444, B:135:0x0450, B:137:0x045c, B:148:0x04a0, B:140:0x0478, B:143:0x048a, B:145:0x0490, B:147:0x049a, B:213:0x06b9, B:215:0x06c7, B:217:0x06d0, B:228:0x06fe, B:218:0x06d6, B:220:0x06df, B:222:0x06e5, B:225:0x06f1, B:227:0x06f9, B:229:0x0701, B:230:0x070d, B:233:0x0715, B:235:0x0727, B:236:0x0732, B:238:0x073a, B:242:0x0760, B:244:0x077a, B:246:0x078f, B:248:0x07a9, B:250:0x07be, B:251:0x07cc, B:253:0x07d2, B:255:0x07e2, B:256:0x07e9, B:258:0x07f5, B:259:0x07fc, B:260:0x0801, B:262:0x0843, B:264:0x0849, B:270:0x0870, B:272:0x0878, B:273:0x0881, B:275:0x0887, B:276:0x088d, B:278:0x08a2, B:280:0x08b2, B:282:0x08c2, B:284:0x08ca, B:285:0x08cd, B:293:0x0947, B:295:0x0960, B:297:0x0976, B:299:0x097b, B:301:0x097f, B:303:0x0983, B:305:0x098d, B:306:0x0993, B:308:0x0997, B:310:0x099d, B:312:0x09ae, B:314:0x09ba, B:320:0x09e3, B:323:0x09e9, B:265:0x0857, B:267:0x085d, B:269:0x0863, B:249:0x07bb, B:245:0x078c, B:239:0x0740, B:241:0x0746), top: B:471:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x050b A[PHI: r6
      0x050b: PHI (r6v44 int) = (r6v43 int), (r6v43 int), (r6v59 int) binds: [B:165:0x051a, B:167:0x0529, B:162:0x0509] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x050e A[Catch: all -> 0x00f7, TryCatch #3 {all -> 0x00f7, blocks: (B:3:0x0012, B:5:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:210:0x06a0, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:37:0x013d, B:39:0x014a, B:41:0x0156, B:43:0x015c, B:47:0x0167, B:48:0x0175, B:50:0x0183, B:53:0x01a3, B:55:0x01a9, B:57:0x01b9, B:59:0x01c7, B:61:0x01d7, B:62:0x01e4, B:63:0x01e7, B:66:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:86:0x0295, B:82:0x0263, B:84:0x0273, B:90:0x02a2, B:92:0x02ce, B:93:0x02f8, B:95:0x0331, B:97:0x0337, B:100:0x0343, B:102:0x037a, B:103:0x0395, B:105:0x039b, B:107:0x03ab, B:111:0x03c1, B:108:0x03b5, B:114:0x03c8, B:117:0x03cf, B:118:0x03e7, B:120:0x0400, B:121:0x040c, B:124:0x0418, B:130:0x043b, B:127:0x042a, B:150:0x04bb, B:152:0x04c7, B:155:0x04d8, B:157:0x04e9, B:159:0x04f5, B:176:0x055f, B:178:0x0565, B:179:0x0571, B:181:0x0577, B:183:0x0585, B:185:0x058f, B:186:0x05a2, B:188:0x05a8, B:189:0x05c3, B:191:0x05c9, B:192:0x05e7, B:193:0x05f6, B:197:0x0625, B:194:0x0600, B:196:0x0612, B:198:0x062f, B:199:0x0649, B:201:0x064f, B:203:0x0662, B:204:0x066f, B:205:0x0673, B:207:0x0679, B:209:0x0689, B:164:0x050e, B:166:0x051c, B:169:0x052d, B:171:0x053e, B:173:0x054a, B:133:0x0444, B:135:0x0450, B:137:0x045c, B:148:0x04a0, B:140:0x0478, B:143:0x048a, B:145:0x0490, B:147:0x049a, B:213:0x06b9, B:215:0x06c7, B:217:0x06d0, B:228:0x06fe, B:218:0x06d6, B:220:0x06df, B:222:0x06e5, B:225:0x06f1, B:227:0x06f9, B:229:0x0701, B:230:0x070d, B:233:0x0715, B:235:0x0727, B:236:0x0732, B:238:0x073a, B:242:0x0760, B:244:0x077a, B:246:0x078f, B:248:0x07a9, B:250:0x07be, B:251:0x07cc, B:253:0x07d2, B:255:0x07e2, B:256:0x07e9, B:258:0x07f5, B:259:0x07fc, B:260:0x0801, B:262:0x0843, B:264:0x0849, B:270:0x0870, B:272:0x0878, B:273:0x0881, B:275:0x0887, B:276:0x088d, B:278:0x08a2, B:280:0x08b2, B:282:0x08c2, B:284:0x08ca, B:285:0x08cd, B:293:0x0947, B:295:0x0960, B:297:0x0976, B:299:0x097b, B:301:0x097f, B:303:0x0983, B:305:0x098d, B:306:0x0993, B:308:0x0997, B:310:0x099d, B:312:0x09ae, B:314:0x09ba, B:320:0x09e3, B:323:0x09e9, B:265:0x0857, B:267:0x085d, B:269:0x0863, B:249:0x07bb, B:245:0x078c, B:239:0x0740, B:241:0x0746), top: B:471:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0565 A[Catch: all -> 0x00f7, TryCatch #3 {all -> 0x00f7, blocks: (B:3:0x0012, B:5:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:210:0x06a0, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:37:0x013d, B:39:0x014a, B:41:0x0156, B:43:0x015c, B:47:0x0167, B:48:0x0175, B:50:0x0183, B:53:0x01a3, B:55:0x01a9, B:57:0x01b9, B:59:0x01c7, B:61:0x01d7, B:62:0x01e4, B:63:0x01e7, B:66:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:86:0x0295, B:82:0x0263, B:84:0x0273, B:90:0x02a2, B:92:0x02ce, B:93:0x02f8, B:95:0x0331, B:97:0x0337, B:100:0x0343, B:102:0x037a, B:103:0x0395, B:105:0x039b, B:107:0x03ab, B:111:0x03c1, B:108:0x03b5, B:114:0x03c8, B:117:0x03cf, B:118:0x03e7, B:120:0x0400, B:121:0x040c, B:124:0x0418, B:130:0x043b, B:127:0x042a, B:150:0x04bb, B:152:0x04c7, B:155:0x04d8, B:157:0x04e9, B:159:0x04f5, B:176:0x055f, B:178:0x0565, B:179:0x0571, B:181:0x0577, B:183:0x0585, B:185:0x058f, B:186:0x05a2, B:188:0x05a8, B:189:0x05c3, B:191:0x05c9, B:192:0x05e7, B:193:0x05f6, B:197:0x0625, B:194:0x0600, B:196:0x0612, B:198:0x062f, B:199:0x0649, B:201:0x064f, B:203:0x0662, B:204:0x066f, B:205:0x0673, B:207:0x0679, B:209:0x0689, B:164:0x050e, B:166:0x051c, B:169:0x052d, B:171:0x053e, B:173:0x054a, B:133:0x0444, B:135:0x0450, B:137:0x045c, B:148:0x04a0, B:140:0x0478, B:143:0x048a, B:145:0x0490, B:147:0x049a, B:213:0x06b9, B:215:0x06c7, B:217:0x06d0, B:228:0x06fe, B:218:0x06d6, B:220:0x06df, B:222:0x06e5, B:225:0x06f1, B:227:0x06f9, B:229:0x0701, B:230:0x070d, B:233:0x0715, B:235:0x0727, B:236:0x0732, B:238:0x073a, B:242:0x0760, B:244:0x077a, B:246:0x078f, B:248:0x07a9, B:250:0x07be, B:251:0x07cc, B:253:0x07d2, B:255:0x07e2, B:256:0x07e9, B:258:0x07f5, B:259:0x07fc, B:260:0x0801, B:262:0x0843, B:264:0x0849, B:270:0x0870, B:272:0x0878, B:273:0x0881, B:275:0x0887, B:276:0x088d, B:278:0x08a2, B:280:0x08b2, B:282:0x08c2, B:284:0x08ca, B:285:0x08cd, B:293:0x0947, B:295:0x0960, B:297:0x0976, B:299:0x097b, B:301:0x097f, B:303:0x0983, B:305:0x098d, B:306:0x0993, B:308:0x0997, B:310:0x099d, B:312:0x09ae, B:314:0x09ba, B:320:0x09e3, B:323:0x09e9, B:265:0x0857, B:267:0x085d, B:269:0x0863, B:249:0x07bb, B:245:0x078c, B:239:0x0740, B:241:0x0746), top: B:471:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06d6 A[Catch: all -> 0x00f7, TryCatch #3 {all -> 0x00f7, blocks: (B:3:0x0012, B:5:0x002f, B:8:0x0039, B:9:0x0051, B:12:0x0065, B:15:0x008b, B:17:0x00c0, B:20:0x00d1, B:22:0x00db, B:210:0x06a0, B:26:0x010b, B:28:0x011d, B:31:0x012d, B:33:0x0133, B:37:0x013d, B:39:0x014a, B:41:0x0156, B:43:0x015c, B:47:0x0167, B:48:0x0175, B:50:0x0183, B:53:0x01a3, B:55:0x01a9, B:57:0x01b9, B:59:0x01c7, B:61:0x01d7, B:62:0x01e4, B:63:0x01e7, B:66:0x01fd, B:75:0x022c, B:78:0x0236, B:80:0x0244, B:86:0x0295, B:82:0x0263, B:84:0x0273, B:90:0x02a2, B:92:0x02ce, B:93:0x02f8, B:95:0x0331, B:97:0x0337, B:100:0x0343, B:102:0x037a, B:103:0x0395, B:105:0x039b, B:107:0x03ab, B:111:0x03c1, B:108:0x03b5, B:114:0x03c8, B:117:0x03cf, B:118:0x03e7, B:120:0x0400, B:121:0x040c, B:124:0x0418, B:130:0x043b, B:127:0x042a, B:150:0x04bb, B:152:0x04c7, B:155:0x04d8, B:157:0x04e9, B:159:0x04f5, B:176:0x055f, B:178:0x0565, B:179:0x0571, B:181:0x0577, B:183:0x0585, B:185:0x058f, B:186:0x05a2, B:188:0x05a8, B:189:0x05c3, B:191:0x05c9, B:192:0x05e7, B:193:0x05f6, B:197:0x0625, B:194:0x0600, B:196:0x0612, B:198:0x062f, B:199:0x0649, B:201:0x064f, B:203:0x0662, B:204:0x066f, B:205:0x0673, B:207:0x0679, B:209:0x0689, B:164:0x050e, B:166:0x051c, B:169:0x052d, B:171:0x053e, B:173:0x054a, B:133:0x0444, B:135:0x0450, B:137:0x045c, B:148:0x04a0, B:140:0x0478, B:143:0x048a, B:145:0x0490, B:147:0x049a, B:213:0x06b9, B:215:0x06c7, B:217:0x06d0, B:228:0x06fe, B:218:0x06d6, B:220:0x06df, B:222:0x06e5, B:225:0x06f1, B:227:0x06f9, B:229:0x0701, B:230:0x070d, B:233:0x0715, B:235:0x0727, B:236:0x0732, B:238:0x073a, B:242:0x0760, B:244:0x077a, B:246:0x078f, B:248:0x07a9, B:250:0x07be, B:251:0x07cc, B:253:0x07d2, B:255:0x07e2, B:256:0x07e9, B:258:0x07f5, B:259:0x07fc, B:260:0x0801, B:262:0x0843, B:264:0x0849, B:270:0x0870, B:272:0x0878, B:273:0x0881, B:275:0x0887, B:276:0x088d, B:278:0x08a2, B:280:0x08b2, B:282:0x08c2, B:284:0x08ca, B:285:0x08cd, B:293:0x0947, B:295:0x0960, B:297:0x0976, B:299:0x097b, B:301:0x097f, B:303:0x0983, B:305:0x098d, B:306:0x0993, B:308:0x0997, B:310:0x099d, B:312:0x09ae, B:314:0x09ba, B:320:0x09e3, B:323:0x09e9, B:265:0x0857, B:267:0x085d, B:269:0x0863, B:249:0x07bb, B:245:0x078c, B:239:0x0740, B:241:0x0746), top: B:471:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a1f A[Catch: all -> 0x0a50, TryCatch #0 {all -> 0x0a50, blocks: (B:287:0x0915, B:288:0x0928, B:290:0x092e, B:387:0x0bf4, B:318:0x09cd, B:325:0x09fd, B:327:0x0a1f, B:328:0x0a27, B:330:0x0a2d, B:332:0x0a3f, B:340:0x0a5a, B:342:0x0a6e, B:344:0x0a98, B:346:0x0aa4, B:348:0x0ab8, B:350:0x0af9, B:356:0x0b13, B:358:0x0b1e, B:360:0x0b22, B:362:0x0b26, B:364:0x0b2a, B:365:0x0b36, B:366:0x0b3b, B:368:0x0b41, B:370:0x0b58, B:371:0x0b5d, B:386:0x0bef, B:372:0x0b77, B:374:0x0b7c, B:378:0x0b9f, B:380:0x0bc3, B:381:0x0bca, B:385:0x0be2, B:375:0x0b87, B:388:0x0c03, B:390:0x0c13, B:391:0x0c19, B:392:0x0c21, B:394:0x0c27, B:397:0x0c42, B:399:0x0c52, B:419:0x0ccf, B:400:0x0c6a, B:402:0x0c70, B:404:0x0c78, B:406:0x0c7f, B:412:0x0c8d, B:414:0x0c94, B:416:0x0cc0, B:418:0x0cc7, B:417:0x0cc4, B:413:0x0c91, B:405:0x0c7c), top: B:465:0x0915 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0a58 A[PHI: r10
      0x0a58: PHI (r10v7 java.lang.String) = (r10v6 java.lang.String), (r10v16 java.lang.String) binds: [B:326:0x0a1d, B:526:0x0a58] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0a6e A[Catch: all -> 0x0a50, TryCatch #0 {all -> 0x0a50, blocks: (B:287:0x0915, B:288:0x0928, B:290:0x092e, B:387:0x0bf4, B:318:0x09cd, B:325:0x09fd, B:327:0x0a1f, B:328:0x0a27, B:330:0x0a2d, B:332:0x0a3f, B:340:0x0a5a, B:342:0x0a6e, B:344:0x0a98, B:346:0x0aa4, B:348:0x0ab8, B:350:0x0af9, B:356:0x0b13, B:358:0x0b1e, B:360:0x0b22, B:362:0x0b26, B:364:0x0b2a, B:365:0x0b36, B:366:0x0b3b, B:368:0x0b41, B:370:0x0b58, B:371:0x0b5d, B:386:0x0bef, B:372:0x0b77, B:374:0x0b7c, B:378:0x0b9f, B:380:0x0bc3, B:381:0x0bca, B:385:0x0be2, B:375:0x0b87, B:388:0x0c03, B:390:0x0c13, B:391:0x0c19, B:392:0x0c21, B:394:0x0c27, B:397:0x0c42, B:399:0x0c52, B:419:0x0ccf, B:400:0x0c6a, B:402:0x0c70, B:404:0x0c78, B:406:0x0c7f, B:412:0x0c8d, B:414:0x0c94, B:416:0x0cc0, B:418:0x0cc7, B:417:0x0cc4, B:413:0x0c91, B:405:0x0c7c), top: B:465:0x0915 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a98 A[Catch: all -> 0x0a50, TryCatch #0 {all -> 0x0a50, blocks: (B:287:0x0915, B:288:0x0928, B:290:0x092e, B:387:0x0bf4, B:318:0x09cd, B:325:0x09fd, B:327:0x0a1f, B:328:0x0a27, B:330:0x0a2d, B:332:0x0a3f, B:340:0x0a5a, B:342:0x0a6e, B:344:0x0a98, B:346:0x0aa4, B:348:0x0ab8, B:350:0x0af9, B:356:0x0b13, B:358:0x0b1e, B:360:0x0b22, B:362:0x0b26, B:364:0x0b2a, B:365:0x0b36, B:366:0x0b3b, B:368:0x0b41, B:370:0x0b58, B:371:0x0b5d, B:386:0x0bef, B:372:0x0b77, B:374:0x0b7c, B:378:0x0b9f, B:380:0x0bc3, B:381:0x0bca, B:385:0x0be2, B:375:0x0b87, B:388:0x0c03, B:390:0x0c13, B:391:0x0c19, B:392:0x0c21, B:394:0x0c27, B:397:0x0c42, B:399:0x0c52, B:419:0x0ccf, B:400:0x0c6a, B:402:0x0c70, B:404:0x0c78, B:406:0x0c7f, B:412:0x0c8d, B:414:0x0c94, B:416:0x0cc0, B:418:0x0cc7, B:417:0x0cc4, B:413:0x0c91, B:405:0x0c7c), top: B:465:0x0915 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0d77 A[Catch: all -> 0x0cfb, TryCatch #4 {all -> 0x0cfb, blocks: (B:422:0x0cd7, B:424:0x0cec, B:427:0x0cf3, B:434:0x0d27, B:436:0x0d67, B:439:0x0d98, B:440:0x0d9c, B:441:0x0da6, B:443:0x0de9, B:444:0x0df6, B:446:0x0e07, B:453:0x0e51, B:454:0x0e62, B:458:0x0e80, B:457:0x0e6d, B:449:0x0e1e, B:451:0x0e37, B:438:0x0d77, B:430:0x0cfe, B:432:0x0d0a, B:433:0x0d10, B:459:0x0e8a), top: B:473:0x002d, inners: #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S(java.lang.String r45, long r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.S(java.lang.String, long):boolean");
    }

    public final boolean T() {
        e().h();
        r();
        return E0().V() || !TextUtils.isEmpty(E0().m());
    }

    public final boolean U(String str, String str2) {
        C1146F c1146fH0 = E0().H0(str, str2);
        return c1146fH0 == null || c1146fH0.f8972c < 1;
    }

    public final boolean V(com.google.android.gms.internal.measurement.H2 h22, com.google.android.gms.internal.measurement.H2 h23) {
        AbstractC0549h.a("_e".equals(h22.I()));
        a();
        com.google.android.gms.internal.measurement.M2 m2S = r7.s((com.google.android.gms.internal.measurement.I2) h22.q(), "_sc");
        String strM = m2S == null ? null : m2S.M();
        a();
        com.google.android.gms.internal.measurement.M2 m2S2 = r7.s((com.google.android.gms.internal.measurement.I2) h23.q(), "_pc");
        String strM2 = m2S2 != null ? m2S2.M() : null;
        if (strM2 == null || !strM2.equals(strM)) {
            return false;
        }
        AbstractC0549h.a("_e".equals(h22.I()));
        a();
        com.google.android.gms.internal.measurement.M2 m2S3 = r7.s((com.google.android.gms.internal.measurement.I2) h22.q(), "_et");
        if (m2S3 == null || !m2S3.a0() || m2S3.I() <= 0) {
            return true;
        }
        long jI = m2S3.I();
        a();
        com.google.android.gms.internal.measurement.M2 m2S4 = r7.s((com.google.android.gms.internal.measurement.I2) h23.q(), "_et");
        if (m2S4 != null && m2S4.I() > 0) {
            jI += m2S4.I();
        }
        a();
        r7.p(h23, "_et", Long.valueOf(jI));
        a();
        r7.p(h22, "_fr", 1L);
        return true;
    }

    public final void Z(F2 f22, com.google.android.gms.internal.measurement.S2 s22) {
        e().h();
        r();
        C0889x2 c0889x2P = C0897y2.P();
        byte[] bArrO = f22.O();
        if (bArrO != null) {
            try {
                c0889x2P = (C0889x2) r7.M(c0889x2P, bArrO);
            } catch (C0735e5 unused) {
                c().w().b("Failed to parse locally stored ad campaign info. appId", K2.z(f22.c()));
            }
        }
        for (com.google.android.gms.internal.measurement.I2 i22 : s22.h0()) {
            if (i22.M().equals("_cmp")) {
                String str = (String) r7.u(i22, "gclid", "");
                String str2 = (String) r7.u(i22, "gbraid", "");
                String str3 = (String) r7.u(i22, "gad_source", "");
                if (!str.isEmpty() || !str2.isEmpty()) {
                    long jLongValue = ((Long) r7.u(i22, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = i22.I();
                    }
                    if ("referrer API v2".equals(r7.t(i22, "_cis"))) {
                        if (jLongValue > c0889x2P.v()) {
                            if (str.isEmpty()) {
                                c0889x2P.B();
                            } else {
                                c0889x2P.J(str);
                            }
                            if (str2.isEmpty()) {
                                c0889x2P.A();
                            } else {
                                c0889x2P.I(str2);
                            }
                            if (str3.isEmpty()) {
                                c0889x2P.z();
                            } else {
                                c0889x2P.H(str3);
                            }
                            c0889x2P.G(jLongValue);
                        }
                    } else if (jLongValue > c0889x2P.u()) {
                        if (str.isEmpty()) {
                            c0889x2P.y();
                        } else {
                            c0889x2P.E(str);
                        }
                        if (str2.isEmpty()) {
                            c0889x2P.x();
                        } else {
                            c0889x2P.D(str2);
                        }
                        if (str3.isEmpty()) {
                            c0889x2P.w();
                        } else {
                            c0889x2P.C(str3);
                        }
                        c0889x2P.F(jLongValue);
                    }
                }
            }
        }
        if (!((C0897y2) c0889x2P.q()).equals(C0897y2.R())) {
            s22.z((C0897y2) c0889x2P.q());
        }
        f22.r(((C0897y2) c0889x2P.q()).i());
        if (f22.L()) {
            E0().F(f22, false, false);
        }
    }

    public final r7 a() {
        r7 r7Var = this.f9555g;
        X(r7Var);
        return r7Var;
    }

    public final void a0(x7 x7Var) throws Throwable {
        e().h();
        r();
        AbstractC0549h.j(x7Var);
        String str = x7Var.f9967m;
        AbstractC0549h.d(str);
        int i4 = 0;
        if (D0().P(null, AbstractC1291q2.f9792z0)) {
            long jA = f().a();
            int iZ = D0().z(null, AbstractC1291q2.f9747i0);
            D0();
            long jN = jA - C1264n.n();
            while (i4 < iZ && S(null, jN)) {
                i4++;
            }
        } else {
            D0();
            long jP = C1264n.p();
            while (i4 < jP && S(str, 0L)) {
                i4++;
            }
        }
        if (D0().P(null, AbstractC1291q2.f9671A0)) {
            e().h();
            P();
        }
        if (D0().P(null, AbstractC1291q2.f9705R0) && this.f9558j.j(str, EnumC0733e3.f(x7Var.f9966S))) {
            c().v().b("[sgtm] Going background, trigger client side upload. appId", str);
            t0(str, f().a());
        }
    }

    @Override // k1.InterfaceC1186d4
    public final C1208g b() {
        return this.f9560l.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(k1.x7 r27) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.b0(k1.x7):void");
    }

    @Override // k1.InterfaceC1186d4
    public final K2 c() {
        return ((C1363z3) AbstractC0549h.j(this.f9560l)).c();
    }

    public final void c0() {
        this.f9566r++;
    }

    @Override // k1.InterfaceC1186d4
    public final Context d() {
        return this.f9560l.d();
    }

    public final void d0(C1232j c1232j) {
        x7 x7VarJ = J((String) AbstractC0549h.j(c1232j.f9481m));
        if (x7VarJ != null) {
            e0(c1232j, x7VarJ);
        }
    }

    @Override // k1.InterfaceC1186d4
    public final C1307s3 e() {
        return ((C1363z3) AbstractC0549h.j(this.f9560l)).e();
    }

    public final void e0(C1232j c1232j, x7 x7Var) {
        AbstractC0549h.j(c1232j);
        AbstractC0549h.d(c1232j.f9481m);
        AbstractC0549h.j(c1232j.f9483o);
        AbstractC0549h.d(c1232j.f9483o.f9845n);
        e().h();
        r();
        if (W(x7Var)) {
            if (!x7Var.f9974t) {
                B0(x7Var);
                return;
            }
            E0().t();
            try {
                B0(x7Var);
                String str = (String) AbstractC0549h.j(c1232j.f9481m);
                C1232j c1232jB0 = E0().B0(str, c1232j.f9483o.f9845n);
                if (c1232jB0 != null) {
                    c().q().c("Removing conditional user property", c1232j.f9481m, this.f9560l.F().f(c1232j.f9483o.f9845n));
                    E0().M(str, c1232j.f9483o.f9845n);
                    if (c1232jB0.f9485q) {
                        E0().B(str, c1232j.f9483o.f9845n);
                    }
                    C1150J c1150j = c1232j.f9491w;
                    if (c1150j != null) {
                        C1148H c1148h = c1150j.f9089n;
                        w0((C1150J) AbstractC0549h.j(g().q(str, ((C1150J) AbstractC0549h.j(c1150j)).f9088m, c1148h != null ? c1148h.g() : null, c1232jB0.f9482n, c1150j.f9091p, true, true)), x7Var);
                    }
                } else {
                    c().w().c("Conditional user property doesn't exist", K2.z(c1232j.f9481m), this.f9560l.F().f(c1232j.f9483o.f9845n));
                }
                E0().E();
                E0().x();
            } catch (Throwable th) {
                E0().x();
                throw th;
            }
        }
    }

    @Override // k1.InterfaceC1186d4
    public final b1.d f() {
        return ((C1363z3) AbstractC0549h.j(this.f9560l)).f();
    }

    public final void f0(String str, x7 x7Var) {
        e().h();
        r();
        if (W(x7Var)) {
            if (!x7Var.f9974t) {
                B0(x7Var);
                return;
            }
            Boolean boolY = Y(x7Var);
            if ("_npa".equals(str) && boolY != null) {
                c().q().a("Falling back to manifest metadata value for ad personalization");
                r0(new s7("_npa", f().a(), Long.valueOf(true != boolY.booleanValue() ? 0L : 1L), "auto"), x7Var);
                return;
            }
            I2 i2Q = c().q();
            C1363z3 c1363z3 = this.f9560l;
            i2Q.b("Removing user property", c1363z3.F().f(str));
            E0().t();
            try {
                B0(x7Var);
                if ("_id".equals(str)) {
                    E0().B((String) AbstractC0549h.j(x7Var.f9967m), "_lair");
                }
                E0().B((String) AbstractC0549h.j(x7Var.f9967m), str);
                E0().E();
                c().q().b("User property removed", c1363z3.F().f(str));
                E0().x();
            } catch (Throwable th) {
                E0().x();
                throw th;
            }
        }
    }

    public final w7 g() {
        return ((C1363z3) AbstractC0549h.j(this.f9560l)).Q();
    }

    public final void g0(x7 x7Var) {
        if (this.f9573y != null) {
            ArrayList arrayList = new ArrayList();
            this.f9574z = arrayList;
            arrayList.addAll(this.f9573y);
        }
        C1343x c1343xE0 = E0();
        String str = (String) AbstractC0549h.j(x7Var.f9967m);
        AbstractC0549h.d(str);
        c1343xE0.h();
        c1343xE0.i();
        try {
            SQLiteDatabase sQLiteDatabaseY0 = c1343xE0.y0();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseY0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseY0.delete("events", "app_id=?", strArr) + sQLiteDatabaseY0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseY0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseY0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseY0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseY0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseY0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseY0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseY0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseY0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseY0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseY0.delete("upload_queue", "app_id=?", strArr);
            if (iDelete > 0) {
                c1343xE0.f9366a.c().v().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e4) {
            c1343xE0.f9366a.c().r().c("Error resetting analytics data. appId, error", K2.z(str), e4);
        }
        if (x7Var.f9974t) {
            b0(x7Var);
        }
    }

    public final String h(C1229i4 c1229i4) {
        if (!c1229i4.r(EnumC1221h4.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        g().x().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void h0(x7 x7Var) {
        e().h();
        r();
        String str = x7Var.f9967m;
        AbstractC0549h.d(str);
        C1143C c1143cE = C1143C.e(x7Var.f9960M);
        c().v().c("Setting DMA consent for package", str, c1143cE);
        e().h();
        r();
        EnumC1204f4 enumC1204f4F = C1143C.c(z0(str), 100).f();
        this.f9541C.put(str, c1143cE);
        E0().G(str, c1143cE);
        EnumC1204f4 enumC1204f4F2 = C1143C.c(z0(str), 100).f();
        e().h();
        r();
        EnumC1204f4 enumC1204f4 = EnumC1204f4.DENIED;
        boolean z3 = enumC1204f4F == enumC1204f4 && enumC1204f4F2 == EnumC1204f4.GRANTED;
        boolean z4 = enumC1204f4F == EnumC1204f4.GRANTED && enumC1204f4F2 == enumC1204f4;
        if (z3 || z4) {
            c().v().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (E0().D0(F(), str, false, false, false, false, false, false, false).f9856f < D0().z(str, AbstractC1291q2.f9759m0)) {
                bundle.putLong("_r", 1L);
                c().v().c("_dcu realtime event count", str, Long.valueOf(E0().D0(F(), str, false, false, false, false, false, true, false).f9856f));
            }
            this.f9548J.a(str, "_dcu", bundle);
        }
    }

    public final String i(x7 x7Var) {
        try {
            return (String) e().s(new CallableC1198e7(this, x7Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            c().r().c("Failed to get app instance id. appId", K2.z(x7Var.f9967m), e4);
            return null;
        }
    }

    public final void i0(String str, C1333v5 c1333v5) {
        e().h();
        String str2 = this.f9545G;
        if (str2 == null || str2.equals(str) || c1333v5 != null) {
            this.f9545G = str;
            this.f9544F = c1333v5;
        }
    }

    public final void j0(x7 x7Var) {
        e().h();
        r();
        String str = x7Var.f9967m;
        AbstractC0549h.d(str);
        C1229i4 c1229i4K = C1229i4.k(x7Var.f9954G, x7Var.f9959L);
        N0(str);
        c().v().c("Setting storage consent for package", str, c1229i4K);
        p0(str, c1229i4K);
    }

    public final List k(x7 x7Var, Bundle bundle) {
        e().h();
        com.google.android.gms.internal.measurement.X6.b();
        C1264n c1264nD0 = D0();
        String str = x7Var.f9967m;
        if (!c1264nD0.P(str, AbstractC1291q2.f9715W0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    c().r().a("Uri sources and timestamps do not match");
                } else {
                    for (int i4 = 0; i4 < intArray.length; i4++) {
                        C1343x c1343xE0 = E0();
                        int i5 = intArray[i4];
                        long j4 = longArray[i4];
                        AbstractC0549h.d(str);
                        c1343xE0.h();
                        c1343xE0.i();
                        try {
                            int iDelete = c1343xE0.y0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i5), String.valueOf(j4)});
                            c1343xE0.f9366a.c().v().d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i5), Long.valueOf(j4));
                        } catch (SQLiteException e4) {
                            c1343xE0.f9366a.c().r().c("Error pruning trigger URIs. appId", K2.z(str), e4);
                        }
                    }
                }
            }
        }
        C1343x c1343xE02 = E0();
        String str2 = x7Var.f9967m;
        AbstractC0549h.d(str2);
        c1343xE02.h();
        c1343xE02.i();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c1343xE02.y0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new K6(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e5) {
                c1343xE02.f9366a.c().r().c("Error querying trigger uris. appId", K2.z(str2), e5);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } finally {
        }
    }

    public final void k0(List list) {
        AbstractC0549h.a(!list.isEmpty());
        if (this.f9573y != null) {
            c().r().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f9573y = new ArrayList(list);
        }
    }

    public final void l0() {
        e().h();
        E0().A();
        C1343x c1343xE0 = E0();
        c1343xE0.h();
        c1343xE0.i();
        if (c1343xE0.Z()) {
            C1275o2 c1275o2 = AbstractC1291q2.f9784v0;
            if (((Long) c1275o2.a(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseY0 = c1343xE0.y0();
                C1363z3 c1363z3 = c1343xE0.f9366a;
                int iDelete = sQLiteDatabaseY0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(c1363z3.f().a()), String.valueOf(c1275o2.a(null))});
                if (iDelete > 0) {
                    c1363z3.c().v().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.f9557i.f9658h.a() == 0) {
            this.f9557i.f9658h.b(f().a());
        }
        R();
    }

    public final void m0(C1232j c1232j) {
        x7 x7VarJ = J((String) AbstractC0549h.j(c1232j.f9481m));
        if (x7VarJ != null) {
            n0(c1232j, x7VarJ);
        }
    }

    public final void n0(C1232j c1232j, x7 x7Var) {
        AbstractC0549h.j(c1232j);
        AbstractC0549h.d(c1232j.f9481m);
        AbstractC0549h.j(c1232j.f9482n);
        AbstractC0549h.j(c1232j.f9483o);
        AbstractC0549h.d(c1232j.f9483o.f9845n);
        e().h();
        r();
        if (W(x7Var)) {
            if (!x7Var.f9974t) {
                B0(x7Var);
                return;
            }
            C1232j c1232j2 = new C1232j(c1232j);
            boolean z3 = false;
            c1232j2.f9485q = false;
            E0().t();
            try {
                C1232j c1232jB0 = E0().B0((String) AbstractC0549h.j(c1232j2.f9481m), c1232j2.f9483o.f9845n);
                if (c1232jB0 != null && !c1232jB0.f9482n.equals(c1232j2.f9482n)) {
                    c().w().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f9560l.F().f(c1232j2.f9483o.f9845n), c1232j2.f9482n, c1232jB0.f9482n);
                }
                if (c1232jB0 != null && c1232jB0.f9485q) {
                    c1232j2.f9482n = c1232jB0.f9482n;
                    c1232j2.f9484p = c1232jB0.f9484p;
                    c1232j2.f9488t = c1232jB0.f9488t;
                    c1232j2.f9486r = c1232jB0.f9486r;
                    c1232j2.f9489u = c1232jB0.f9489u;
                    c1232j2.f9485q = true;
                    s7 s7Var = c1232j2.f9483o;
                    c1232j2.f9483o = new s7(s7Var.f9845n, c1232jB0.f9483o.f9846o, s7Var.d(), c1232jB0.f9483o.f9849r);
                } else if (TextUtils.isEmpty(c1232j2.f9486r)) {
                    s7 s7Var2 = c1232j2.f9483o;
                    c1232j2.f9483o = new s7(s7Var2.f9845n, c1232j2.f9484p, s7Var2.d(), c1232j2.f9483o.f9849r);
                    c1232j2.f9485q = true;
                    z3 = true;
                }
                if (c1232j2.f9485q) {
                    s7 s7Var3 = c1232j2.f9483o;
                    u7 u7Var = new u7((String) AbstractC0549h.j(c1232j2.f9481m), c1232j2.f9482n, s7Var3.f9845n, s7Var3.f9846o, AbstractC0549h.j(s7Var3.d()));
                    if (E0().d0(u7Var)) {
                        c().q().d("User property updated immediately", c1232j2.f9481m, this.f9560l.F().f(u7Var.f9879c), u7Var.f9881e);
                    } else {
                        c().r().d("(2)Too many active user properties, ignoring", K2.z(c1232j2.f9481m), this.f9560l.F().f(u7Var.f9879c), u7Var.f9881e);
                    }
                    if (z3 && c1232j2.f9489u != null) {
                        w0(new C1150J(c1232j2.f9489u, c1232j2.f9484p), x7Var);
                    }
                }
                if (E0().c0(c1232j2)) {
                    c().q().d("Conditional property added", c1232j2.f9481m, this.f9560l.F().f(c1232j2.f9483o.f9845n), c1232j2.f9483o.d());
                } else {
                    c().r().d("Too many conditional properties, ignoring", K2.z(c1232j2.f9481m), this.f9560l.F().f(c1232j2.f9483o.f9845n), c1232j2.f9483o.d());
                }
                E0().E();
                E0().x();
            } catch (Throwable th) {
                E0().x();
                throw th;
            }
        }
    }

    public final void o0(String str, C1216h c1216h) {
        C1264n c1264nD0 = D0();
        C1275o2 c1275o2 = AbstractC1291q2.f9703Q0;
        if (c1264nD0.P(null, c1275o2)) {
            e().h();
            r();
            C1343x c1343xE0 = E0();
            long j4 = c1216h.f9450m;
            p7 p7VarM0 = c1343xE0.M0(j4);
            if (p7VarM0 == null) {
                c().w().c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j4));
                return;
            }
            String strH = p7VarM0.h();
            if (c1216h.f9451n != EnumC1309s5.SUCCESS.d()) {
                if (c1216h.f9451n == EnumC1309s5.BACKOFF.d()) {
                    Map map = this.f9543E;
                    j7 j7Var = (j7) map.get(strH);
                    if (j7Var == null) {
                        j7Var = new j7(this);
                        map.put(strH, j7Var);
                    } else {
                        j7Var.b();
                    }
                    c().v().d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strH, Long.valueOf((j7Var.f9522c - f().a()) / 1000));
                }
                C1343x c1343xE02 = E0();
                Long lValueOf = Long.valueOf(c1216h.f9450m);
                c1343xE02.z(lValueOf);
                c().v().c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
                return;
            }
            Map map2 = this.f9543E;
            if (map2.containsKey(strH)) {
                map2.remove(strH);
            }
            C1343x c1343xE03 = E0();
            Long lValueOf2 = Long.valueOf(j4);
            c1343xE03.w(lValueOf2);
            c().v().c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
            long j5 = c1216h.f9452o;
            if (j5 > 0) {
                C1343x c1343xE04 = E0();
                C1363z3 c1363z3 = c1343xE04.f9366a;
                if (c1363z3.B().P(null, c1275o2)) {
                    c1343xE04.h();
                    c1343xE04.i();
                    Long lValueOf3 = Long.valueOf(j5);
                    AbstractC0549h.j(lValueOf3);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(EnumC1317t5.GOOGLE_SIGNAL.d()));
                    contentValues.put("creation_timestamp", Long.valueOf(c1363z3.f().a()));
                    try {
                        if (c1343xE04.y0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j5), str, String.valueOf(EnumC1317t5.GOOGLE_SIGNAL_PENDING.d())}) != 1) {
                            c1363z3.c().w().c("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                        }
                    } catch (SQLiteException e4) {
                        c1343xE04.f9366a.c().r().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j5), e4);
                        throw e4;
                    }
                }
                c().v().c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(c1216h.f9452o));
                u0(str);
            }
        }
    }

    public final void p(Runnable runnable) {
        e().h();
        if (this.f9564p == null) {
            this.f9564p = new ArrayList();
        }
        this.f9564p.add(runnable);
    }

    public final void p0(String str, C1229i4 c1229i4) {
        e().h();
        r();
        this.f9540B.put(str, c1229i4);
        E0().J(str, c1229i4);
    }

    public final void q() {
        e().h();
        r();
        if (this.f9562n) {
            return;
        }
        this.f9562n = true;
        if (y0()) {
            FileChannel fileChannel = this.f9572x;
            e().h();
            int i4 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                c().r().a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i5 = fileChannel.read(byteBufferAllocate);
                    if (i5 == 4) {
                        byteBufferAllocate.flip();
                        i4 = byteBufferAllocate.getInt();
                    } else if (i5 != -1) {
                        c().w().b("Unexpected data length. Bytes read", Integer.valueOf(i5));
                    }
                } catch (IOException e4) {
                    c().r().b("Failed to read from channel", e4);
                }
            }
            int iP = this.f9560l.D().p();
            e().h();
            if (i4 > iP) {
                c().r().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i4), Integer.valueOf(iP));
                return;
            }
            if (i4 < iP) {
                FileChannel fileChannel2 = this.f9572x;
                e().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    c().r().a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iP);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            c().r().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        c().v().c("Storage version upgraded. Previous, current version", Integer.valueOf(i4), Integer.valueOf(iP));
                        return;
                    } catch (IOException e5) {
                        c().r().b("Failed to write to channel", e5);
                    }
                }
                c().r().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i4), Integer.valueOf(iP));
            }
        }
    }

    public final void q0(String str, boolean z3, Long l4, Long l5) {
        F2 f2A0 = E0().A0(str);
        if (f2A0 != null) {
            f2A0.G(z3);
            f2A0.H(l4);
            f2A0.I(l5);
            if (f2A0.L()) {
                E0().F(f2A0, false, false);
            }
        }
    }

    public final void r() {
        if (!this.f9561m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(k1.s7 r22, k1.x7 r23) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.r0(k1.s7, k1.x7):void");
    }

    public final void s(String str, com.google.android.gms.internal.measurement.S2 s22) {
        int iE;
        int iIndexOf;
        Set setJ = K0().J(str);
        if (setJ != null) {
            s22.W0(setJ);
        }
        if (K0().n(str)) {
            s22.d1();
        }
        if (K0().q(str)) {
            String strF0 = s22.f0();
            if (!TextUtils.isEmpty(strF0) && (iIndexOf = strF0.indexOf(".")) != -1) {
                s22.y0(strF0.substring(0, iIndexOf));
            }
        }
        if (K0().r(str) && (iE = r7.E(s22, "_id")) != -1) {
            s22.y(iE);
        }
        if (K0().p(str)) {
            s22.e1();
        }
        if (K0().m(str)) {
            s22.b1();
            if (N0(str).r(EnumC1221h4.ANALYTICS_STORAGE)) {
                Map map = this.f9542D;
                i7 i7Var = (i7) map.get(str);
                if (i7Var == null || i7Var.f9480b + D0().C(str, AbstractC1291q2.f9753k0) < f().b()) {
                    i7Var = new i7(this);
                    map.put(str, i7Var);
                }
                s22.o0(i7Var.f9479a);
            }
        }
        if (K0().o(str)) {
            s22.u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [k1.l7] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    public final void s0() {
        C1343x c1343xE0;
        long jN;
        SQLiteException e4;
        F2 f2A0;
        e().h();
        r();
        this.f9570v = true;
        try {
            C1363z3 c1363z3 = this.f9560l;
            c1363z3.b();
            Boolean boolZ = c1363z3.O().Z();
            if (boolZ == null) {
                c().w().a("Upload data called on the client side before use of service was decided");
            } else if (boolZ.booleanValue()) {
                c().r().a("Upload called in the client side when service should be used");
            } else if (this.f9563o > 0) {
                R();
            } else {
                e().h();
                if (this.f9573y != null) {
                    c().v().a("Uploading requested multiple times");
                } else if (I0().o()) {
                    ?? A3 = f().a();
                    ?? r7 = 0;
                    cursorRawQuery = null;
                    Cursor cursorRawQuery = null;
                    string = null;
                    string = null;
                    String string = null;
                    int iZ = D0().z(null, AbstractC1291q2.f9747i0);
                    D0();
                    long jN2 = A3 - C1264n.n();
                    for (int i4 = 0; i4 < iZ && S(null, jN2); i4++) {
                    }
                    com.google.android.gms.internal.measurement.X6.b();
                    e().h();
                    P();
                    long jA = this.f9557i.f9658h.a();
                    if (jA != 0) {
                        c().q().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(A3 - jA)));
                    }
                    String strM = E0().m();
                    long j4 = -1;
                    if (TextUtils.isEmpty(strM)) {
                        try {
                            this.f9539A = -1L;
                            c1343xE0 = E0();
                            D0();
                            jN = A3 - C1264n.n();
                            c1343xE0.h();
                            c1343xE0.i();
                        } catch (Throwable th) {
                            th = th;
                            r7 = A3;
                        }
                        try {
                            A3 = c1343xE0.y0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jN)});
                            try {
                                if (A3.moveToFirst()) {
                                    string = A3.getString(0);
                                } else {
                                    c1343xE0.f9366a.c().v().a("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e5) {
                                e4 = e5;
                                c1343xE0.f9366a.c().r().b("Error selecting expired configs", e4);
                                if (A3 != 0) {
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    t(f2A0);
                                }
                                this.f9570v = false;
                                N();
                            }
                        } catch (SQLiteException e6) {
                            e4 = e6;
                            A3 = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                        A3.close();
                        if (!TextUtils.isEmpty(string) && (f2A0 = E0().A0(string)) != null) {
                            t(f2A0);
                        }
                    } else {
                        if (this.f9539A == -1) {
                            C1343x c1343xE02 = E0();
                            try {
                                try {
                                    cursorRawQuery = c1343xE02.y0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        j4 = cursorRawQuery.getLong(0);
                                    }
                                } finally {
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            } catch (SQLiteException e7) {
                                c1343xE02.f9366a.c().r().b("Error querying raw events", e7);
                                if (cursorRawQuery != null) {
                                }
                                this.f9539A = j4;
                                t0(strM, A3);
                                this.f9570v = false;
                                N();
                            }
                            cursorRawQuery.close();
                            this.f9539A = j4;
                        }
                        t0(strM, A3);
                    }
                } else {
                    c().v().a("Network not connected, ignoring upload request");
                    R();
                }
            }
            this.f9570v = false;
            N();
        } catch (Throwable th3) {
            this.f9570v = false;
            N();
            throw th3;
        }
    }

    public final void t(F2 f22) {
        e().h();
        if (TextUtils.isEmpty(f22.h()) && TextUtils.isEmpty(f22.a())) {
            B((String) AbstractC0549h.j(f22.c()), 204, null, null, null);
            return;
        }
        String str = (String) AbstractC0549h.j(f22.c());
        c().v().b("Fetching remote configuration", str);
        C0777j2 c0777j2E = K0().E(str);
        String strG = K0().G(str);
        C1475a c1475a = null;
        if (c0777j2E != null) {
            if (!TextUtils.isEmpty(strG)) {
                c1475a = new C1475a();
                c1475a.put("If-Modified-Since", strG);
            }
            String strF = K0().F(str);
            if (!TextUtils.isEmpty(strF)) {
                if (c1475a == null) {
                    c1475a = new C1475a();
                }
                c1475a.put("If-None-Match", strF);
            }
        }
        this.f9568t = true;
        I0().m(f22, c1475a, new M2() { // from class: k1.Z6
            @Override // k1.M2
            public final void a(String str2, int i4, Throwable th, byte[] bArr, Map map) {
                this.f9344a.B(str2, i4, th, bArr, map);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        r21 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(java.lang.String r30, long r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.t0(java.lang.String, long):void");
    }

    public final void u(x7 x7Var, long j4) {
        F2 f2A0 = E0().A0((String) AbstractC0549h.j(x7Var.f9967m));
        if (f2A0 != null && g().o0(x7Var.f9968n, f2A0.h(), x7Var.f9949B, f2A0.a())) {
            c().w().b("New GMP App Id passed in. Removing cached database data. appId", K2.z(f2A0.c()));
            C1343x c1343xE0 = E0();
            String strC = f2A0.c();
            c1343xE0.i();
            c1343xE0.h();
            AbstractC0549h.d(strC);
            try {
                SQLiteDatabase sQLiteDatabaseY0 = c1343xE0.y0();
                String[] strArr = {strC};
                int iDelete = sQLiteDatabaseY0.delete("events", "app_id=?", strArr) + sQLiteDatabaseY0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseY0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseY0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseY0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseY0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseY0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseY0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseY0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseY0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseY0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseY0.delete("trigger_uris", "app_id=?", strArr);
                if (iDelete > 0) {
                    c1343xE0.f9366a.c().v().c("Deleted application data. app, records", strC, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e4) {
                c1343xE0.f9366a.c().r().c("Error deleting application data. appId, error", K2.z(strC), e4);
            }
            f2A0 = null;
        }
        if (f2A0 != null) {
            boolean z3 = (f2A0.s0() == -2147483648L || f2A0.s0() == x7Var.f9976v) ? false : true;
            String strF = f2A0.f();
            if (z3 || ((f2A0.s0() != -2147483648L || strF == null || strF.equals(x7Var.f9969o)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strF);
                C1150J c1150j = new C1150J("_au", new C1148H(bundle), "auto", j4);
                if (D0().P(null, AbstractC1291q2.f9763n1)) {
                    z(c1150j, x7Var);
                } else {
                    x(c1150j, x7Var);
                }
            }
        }
    }

    public final void u0(String str) {
        com.google.android.gms.internal.measurement.R2 r2G;
        e().h();
        r();
        this.f9570v = true;
        try {
            C1363z3 c1363z3 = this.f9560l;
            c1363z3.b();
            Boolean boolZ = c1363z3.O().Z();
            if (boolZ == null) {
                c().w().a("Upload data called on the client side before use of service was decided");
            } else if (boolZ.booleanValue()) {
                c().r().a("Upload called in the client side when service should be used");
            } else if (this.f9563o > 0) {
                R();
            } else if (!I0().o()) {
                c().v().a("Network not connected, ignoring upload request");
                R();
            } else if (E0().K(str)) {
                p7 p7VarL0 = E0().L0(str);
                if (p7VarL0 != null && (r2G = p7VarL0.g()) != null) {
                    c().v().d("[sgtm] Uploading data from upload queue. appId, type, url", str, p7VarL0.d(), p7VarL0.h());
                    byte[] bArrI = r2G.i();
                    if (Log.isLoggable(c().D(), 2)) {
                        c().v().d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrI.length), a().N(r2G));
                    }
                    this.f9569u = true;
                    I0().n(str, p7VarL0.f(), r2G, new C1180c7(this, str, p7VarL0));
                }
            } else {
                c().v().b("[sgtm] Upload queue has no batches for appId", str);
            }
            this.f9570v = false;
            N();
        } catch (Throwable th) {
            this.f9570v = false;
            N();
            throw th;
        }
    }

    public final void v(F2 f22, com.google.android.gms.internal.measurement.S2 s22) {
        C0795l3 c0795l3;
        e().h();
        r();
        C1280p c1280pB = C1280p.b(s22.c0());
        String strC = f22.c();
        e().h();
        r();
        C1229i4 c1229i4N0 = N0(strC);
        EnumC1204f4 enumC1204f4 = EnumC1204f4.UNINITIALIZED;
        int iOrdinal = c1229i4N0.e().ordinal();
        if (iOrdinal == 1) {
            c1280pB.d(EnumC1221h4.AD_STORAGE, EnumC1272o.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            c1280pB.c(EnumC1221h4.AD_STORAGE, c1229i4N0.b());
        } else {
            c1280pB.d(EnumC1221h4.AD_STORAGE, EnumC1272o.FAILSAFE);
        }
        int iOrdinal2 = c1229i4N0.f().ordinal();
        if (iOrdinal2 == 1) {
            c1280pB.d(EnumC1221h4.ANALYTICS_STORAGE, EnumC1272o.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            c1280pB.c(EnumC1221h4.ANALYTICS_STORAGE, c1229i4N0.b());
        } else {
            c1280pB.d(EnumC1221h4.ANALYTICS_STORAGE, EnumC1272o.FAILSAFE);
        }
        String strC2 = f22.c();
        e().h();
        r();
        C1143C c1143cF0 = F0(strC2, G0(strC2), N0(strC2), c1280pB);
        s22.w0(((Boolean) AbstractC0549h.j(c1143cF0.h())).booleanValue());
        if (!TextUtils.isEmpty(c1143cF0.i())) {
            s22.O(c1143cF0.i());
        }
        e().h();
        r();
        Iterator it = s22.i0().iterator();
        while (true) {
            if (it.hasNext()) {
                c0795l3 = (C0795l3) it.next();
                if ("_npa".equals(c0795l3.L())) {
                    break;
                }
            } else {
                c0795l3 = null;
                break;
            }
        }
        if (c0795l3 != null) {
            EnumC1221h4 enumC1221h4 = EnumC1221h4.AD_PERSONALIZATION;
            if (c1280pB.a(enumC1221h4) == EnumC1272o.UNSET) {
                u7 u7VarN0 = E0().N0(f22.c(), "_npa");
                if (u7VarN0 != null) {
                    String str = u7VarN0.f9878b;
                    if ("tcf".equals(str)) {
                        c1280pB.d(enumC1221h4, EnumC1272o.TCF);
                    } else if ("app".equals(str)) {
                        c1280pB.d(enumC1221h4, EnumC1272o.API);
                    } else {
                        c1280pB.d(enumC1221h4, EnumC1272o.MANIFEST);
                    }
                } else {
                    Boolean boolL0 = f22.L0();
                    if (boolL0 == null || ((boolL0.booleanValue() && c0795l3.H() != 1) || !(boolL0.booleanValue() || c0795l3.H() == 0))) {
                        c1280pB.d(enumC1221h4, EnumC1272o.API);
                    } else {
                        c1280pB.d(enumC1221h4, EnumC1272o.MANIFEST);
                    }
                }
            }
        } else {
            int I3 = I(f22.c(), c1280pB);
            C0787k3 c0787k3J = C0795l3.J();
            c0787k3J.z("_npa");
            c0787k3J.A(f().a());
            c0787k3J.y(I3);
            s22.a1((C0795l3) c0787k3J.q());
            c().v().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(I3));
        }
        s22.M(c1280pB.toString());
        boolean zQ = this.f9549a.Q(f22.c());
        List listH0 = s22.h0();
        int i4 = 0;
        for (int i5 = 0; i5 < listH0.size(); i5++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.I2) listH0.get(i5)).M())) {
                com.google.android.gms.internal.measurement.H2 h22 = (com.google.android.gms.internal.measurement.H2) ((com.google.android.gms.internal.measurement.I2) listH0.get(i5)).o();
                List listJ = h22.J();
                int i6 = 0;
                while (true) {
                    if (i6 >= listJ.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.M2) listJ.get(i6)).L())) {
                        String strM = ((com.google.android.gms.internal.measurement.M2) listJ.get(i6)).M();
                        if (zQ && strM.length() > 4) {
                            char[] charArray = strM.toCharArray();
                            int i7 = 1;
                            while (true) {
                                if (i7 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7)) {
                                    i4 = i7;
                                    break;
                                }
                                i7++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i4);
                            strM = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.L2 l2J = com.google.android.gms.internal.measurement.M2.J();
                        l2J.D("_tcfd");
                        l2J.E(strM);
                        h22.D(i6, l2J);
                    } else {
                        i6++;
                    }
                }
                s22.p0(i5, h22);
                return;
            }
        }
    }

    public final void v0(String str, com.google.android.gms.internal.measurement.L2 l22, Bundle bundle, String str2) {
        List listB = b1.e.b("_o", "_sn", "_sc", "_si");
        long jW = (w7.h0(l22.F()) || w7.h0(str)) ? D0().w(str2, true) : D0().v(str2, true);
        long jCodePointCount = l22.G().codePointCount(0, l22.G().length());
        w7 w7VarG = g();
        String strF = l22.F();
        D0();
        String strU = w7VarG.u(strF, 40, true);
        if (jCodePointCount <= jW || listB.contains(l22.F())) {
            return;
        }
        if ("_ev".equals(l22.F())) {
            bundle.putString("_ev", g().u(l22.G(), D0().w(str2, true), true));
            return;
        }
        c().x().c("Param value is too long; discarded. Name, value length", strU, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strU);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(l22.F());
    }

    public final void w(com.google.android.gms.internal.measurement.S2 s22, h7 h7Var) {
        for (int i4 = 0; i4 < s22.N0(); i4++) {
            com.google.android.gms.internal.measurement.H2 h22 = (com.google.android.gms.internal.measurement.H2) s22.S0(i4).o();
            Iterator it = h22.J().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.M2) it.next()).L())) {
                    if (h7Var.f9468a.f0() >= D0().z(h7Var.f9468a.K(), AbstractC1291q2.f9756l0)) {
                        int iZ = D0().z(h7Var.f9468a.K(), AbstractC1291q2.f9790y0);
                        String strT = null;
                        if (iZ <= 0) {
                            if (D0().P(h7Var.f9468a.K(), AbstractC1291q2.f9719Y0)) {
                                strT = g().t();
                                com.google.android.gms.internal.measurement.L2 l2J = com.google.android.gms.internal.measurement.M2.J();
                                l2J.D("_tu");
                                l2J.E(strT);
                                h22.z((com.google.android.gms.internal.measurement.M2) l2J.q());
                            }
                            com.google.android.gms.internal.measurement.L2 l2J2 = com.google.android.gms.internal.measurement.M2.J();
                            l2J2.D("_tr");
                            l2J2.C(1L);
                            h22.z((com.google.android.gms.internal.measurement.M2) l2J2.q());
                            K6 k6K = a().K(h7Var.f9468a.K(), s22, h22, strT);
                            if (k6K != null) {
                                c().v().c("Generated trigger URI. appId, uri", h7Var.f9468a.K(), k6K.f9121m);
                                E0().Y(h7Var.f9468a.K(), k6K);
                                Deque deque = this.f9565q;
                                if (!deque.contains(h7Var.f9468a.K())) {
                                    deque.add(h7Var.f9468a.K());
                                }
                            }
                        } else if (E0().D0(F(), h7Var.f9468a.K(), false, false, false, false, false, false, true).f9857g > iZ) {
                            com.google.android.gms.internal.measurement.L2 l2J3 = com.google.android.gms.internal.measurement.M2.J();
                            l2J3.D("_tnr");
                            l2J3.C(1L);
                            h22.z((com.google.android.gms.internal.measurement.M2) l2J3.q());
                        } else {
                            if (D0().P(h7Var.f9468a.K(), AbstractC1291q2.f9719Y0)) {
                                strT = g().t();
                                com.google.android.gms.internal.measurement.L2 l2J4 = com.google.android.gms.internal.measurement.M2.J();
                                l2J4.D("_tu");
                                l2J4.E(strT);
                                h22.z((com.google.android.gms.internal.measurement.M2) l2J4.q());
                            }
                            com.google.android.gms.internal.measurement.L2 l2J5 = com.google.android.gms.internal.measurement.M2.J();
                            l2J5.D("_tr");
                            l2J5.C(1L);
                            h22.z((com.google.android.gms.internal.measurement.M2) l2J5.q());
                            K6 k6K2 = a().K(h7Var.f9468a.K(), s22, h22, strT);
                            if (k6K2 != null) {
                                c().v().c("Generated trigger URI. appId, uri", h7Var.f9468a.K(), k6K2.f9121m);
                                E0().Y(h7Var.f9468a.K(), k6K2);
                                Deque deque2 = this.f9565q;
                                if (!deque2.contains(h7Var.f9468a.K())) {
                                    deque2.add(h7Var.f9468a.K());
                                }
                            }
                        }
                    }
                    s22.q0(i4, (com.google.android.gms.internal.measurement.I2) h22.q());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0374 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f2, B:100:0x032a, B:102:0x0374, B:104:0x0379, B:105:0x0390, B:107:0x039b, B:109:0x03b3, B:111:0x03b8, B:112:0x03cf, B:115:0x03ed, B:119:0x040e, B:120:0x0425, B:121:0x042e, B:124:0x044b, B:125:0x045f, B:127:0x0467, B:129:0x0475, B:131:0x047b, B:132:0x0482, B:134:0x048e, B:136:0x0496, B:138:0x049e, B:140:0x04a4, B:142:0x04a8, B:143:0x04b4, B:144:0x04c1, B:146:0x04e6, B:155:0x050a, B:156:0x051f, B:158:0x0546, B:161:0x055d, B:164:0x0598, B:167:0x05c2, B:169:0x05fa, B:170:0x05fd, B:172:0x0605, B:173:0x0608, B:175:0x0610, B:176:0x0613, B:178:0x061b, B:179:0x061e, B:181:0x0627, B:182:0x062b, B:184:0x0638, B:185:0x063b, B:187:0x0662, B:189:0x066a, B:190:0x066d, B:192:0x067c, B:194:0x0686, B:198:0x069b, B:203:0x06a8, B:206:0x06b1, B:210:0x06be, B:214:0x06cc, B:218:0x06da, B:222:0x06e8, B:226:0x06f6, B:230:0x0702, B:234:0x0710, B:235:0x071c, B:237:0x0722, B:238:0x0725, B:240:0x074b, B:243:0x0754, B:246:0x075d, B:247:0x0776, B:249:0x077c, B:251:0x0792, B:253:0x079e, B:255:0x07ab, B:260:0x07c9, B:261:0x07d9, B:265:0x07e3, B:266:0x07e6, B:268:0x07f2, B:269:0x07f7, B:271:0x0815, B:273:0x0819, B:275:0x0829, B:277:0x0834, B:278:0x083d, B:280:0x0847, B:282:0x0853, B:284:0x085d, B:286:0x0863, B:288:0x0872, B:290:0x088e, B:292:0x0894, B:293:0x089d, B:295:0x08ac, B:297:0x08e8, B:299:0x08f1, B:300:0x08f6, B:302:0x0900, B:304:0x091c, B:305:0x0927, B:307:0x095f, B:309:0x0967, B:311:0x0971, B:312:0x097e, B:314:0x0988, B:315:0x0995, B:316:0x099e, B:318:0x09a4, B:320:0x09e0, B:322:0x09ea, B:324:0x09fc, B:326:0x0a02, B:327:0x0a47, B:328:0x0a52, B:329:0x0a5d, B:331:0x0a63, B:340:0x0ab0, B:341:0x0afb, B:343:0x0b0a, B:357:0x0b6b, B:348:0x0b22, B:349:0x0b25, B:334:0x0a70, B:336:0x0a9c, B:354:0x0b3e, B:355:0x0b55, B:356:0x0b56, B:241:0x074e, B:166:0x05b5, B:152:0x04f1, B:93:0x0309, B:94:0x0310, B:96:0x0316, B:98:0x0322, B:54:0x0193, B:56:0x019d, B:58:0x01b2, B:64:0x01ce, B:69:0x0202, B:71:0x0208, B:73:0x0216, B:75:0x0226, B:78:0x0233, B:86:0x02b5, B:88:0x02bf, B:80:0x025a, B:81:0x0273, B:85:0x029b, B:84:0x0287, B:67:0x01da, B:68:0x01f8), top: B:367:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x042e A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f2, B:100:0x032a, B:102:0x0374, B:104:0x0379, B:105:0x0390, B:107:0x039b, B:109:0x03b3, B:111:0x03b8, B:112:0x03cf, B:115:0x03ed, B:119:0x040e, B:120:0x0425, B:121:0x042e, B:124:0x044b, B:125:0x045f, B:127:0x0467, B:129:0x0475, B:131:0x047b, B:132:0x0482, B:134:0x048e, B:136:0x0496, B:138:0x049e, B:140:0x04a4, B:142:0x04a8, B:143:0x04b4, B:144:0x04c1, B:146:0x04e6, B:155:0x050a, B:156:0x051f, B:158:0x0546, B:161:0x055d, B:164:0x0598, B:167:0x05c2, B:169:0x05fa, B:170:0x05fd, B:172:0x0605, B:173:0x0608, B:175:0x0610, B:176:0x0613, B:178:0x061b, B:179:0x061e, B:181:0x0627, B:182:0x062b, B:184:0x0638, B:185:0x063b, B:187:0x0662, B:189:0x066a, B:190:0x066d, B:192:0x067c, B:194:0x0686, B:198:0x069b, B:203:0x06a8, B:206:0x06b1, B:210:0x06be, B:214:0x06cc, B:218:0x06da, B:222:0x06e8, B:226:0x06f6, B:230:0x0702, B:234:0x0710, B:235:0x071c, B:237:0x0722, B:238:0x0725, B:240:0x074b, B:243:0x0754, B:246:0x075d, B:247:0x0776, B:249:0x077c, B:251:0x0792, B:253:0x079e, B:255:0x07ab, B:260:0x07c9, B:261:0x07d9, B:265:0x07e3, B:266:0x07e6, B:268:0x07f2, B:269:0x07f7, B:271:0x0815, B:273:0x0819, B:275:0x0829, B:277:0x0834, B:278:0x083d, B:280:0x0847, B:282:0x0853, B:284:0x085d, B:286:0x0863, B:288:0x0872, B:290:0x088e, B:292:0x0894, B:293:0x089d, B:295:0x08ac, B:297:0x08e8, B:299:0x08f1, B:300:0x08f6, B:302:0x0900, B:304:0x091c, B:305:0x0927, B:307:0x095f, B:309:0x0967, B:311:0x0971, B:312:0x097e, B:314:0x0988, B:315:0x0995, B:316:0x099e, B:318:0x09a4, B:320:0x09e0, B:322:0x09ea, B:324:0x09fc, B:326:0x0a02, B:327:0x0a47, B:328:0x0a52, B:329:0x0a5d, B:331:0x0a63, B:340:0x0ab0, B:341:0x0afb, B:343:0x0b0a, B:357:0x0b6b, B:348:0x0b22, B:349:0x0b25, B:334:0x0a70, B:336:0x0a9c, B:354:0x0b3e, B:355:0x0b55, B:356:0x0b56, B:241:0x074e, B:166:0x05b5, B:152:0x04f1, B:93:0x0309, B:94:0x0310, B:96:0x0316, B:98:0x0322, B:54:0x0193, B:56:0x019d, B:58:0x01b2, B:64:0x01ce, B:69:0x0202, B:71:0x0208, B:73:0x0216, B:75:0x0226, B:78:0x0233, B:86:0x02b5, B:88:0x02bf, B:80:0x025a, B:81:0x0273, B:85:0x029b, B:84:0x0287, B:67:0x01da, B:68:0x01f8), top: B:367:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f2, B:100:0x032a, B:102:0x0374, B:104:0x0379, B:105:0x0390, B:107:0x039b, B:109:0x03b3, B:111:0x03b8, B:112:0x03cf, B:115:0x03ed, B:119:0x040e, B:120:0x0425, B:121:0x042e, B:124:0x044b, B:125:0x045f, B:127:0x0467, B:129:0x0475, B:131:0x047b, B:132:0x0482, B:134:0x048e, B:136:0x0496, B:138:0x049e, B:140:0x04a4, B:142:0x04a8, B:143:0x04b4, B:144:0x04c1, B:146:0x04e6, B:155:0x050a, B:156:0x051f, B:158:0x0546, B:161:0x055d, B:164:0x0598, B:167:0x05c2, B:169:0x05fa, B:170:0x05fd, B:172:0x0605, B:173:0x0608, B:175:0x0610, B:176:0x0613, B:178:0x061b, B:179:0x061e, B:181:0x0627, B:182:0x062b, B:184:0x0638, B:185:0x063b, B:187:0x0662, B:189:0x066a, B:190:0x066d, B:192:0x067c, B:194:0x0686, B:198:0x069b, B:203:0x06a8, B:206:0x06b1, B:210:0x06be, B:214:0x06cc, B:218:0x06da, B:222:0x06e8, B:226:0x06f6, B:230:0x0702, B:234:0x0710, B:235:0x071c, B:237:0x0722, B:238:0x0725, B:240:0x074b, B:243:0x0754, B:246:0x075d, B:247:0x0776, B:249:0x077c, B:251:0x0792, B:253:0x079e, B:255:0x07ab, B:260:0x07c9, B:261:0x07d9, B:265:0x07e3, B:266:0x07e6, B:268:0x07f2, B:269:0x07f7, B:271:0x0815, B:273:0x0819, B:275:0x0829, B:277:0x0834, B:278:0x083d, B:280:0x0847, B:282:0x0853, B:284:0x085d, B:286:0x0863, B:288:0x0872, B:290:0x088e, B:292:0x0894, B:293:0x089d, B:295:0x08ac, B:297:0x08e8, B:299:0x08f1, B:300:0x08f6, B:302:0x0900, B:304:0x091c, B:305:0x0927, B:307:0x095f, B:309:0x0967, B:311:0x0971, B:312:0x097e, B:314:0x0988, B:315:0x0995, B:316:0x099e, B:318:0x09a4, B:320:0x09e0, B:322:0x09ea, B:324:0x09fc, B:326:0x0a02, B:327:0x0a47, B:328:0x0a52, B:329:0x0a5d, B:331:0x0a63, B:340:0x0ab0, B:341:0x0afb, B:343:0x0b0a, B:357:0x0b6b, B:348:0x0b22, B:349:0x0b25, B:334:0x0a70, B:336:0x0a9c, B:354:0x0b3e, B:355:0x0b55, B:356:0x0b56, B:241:0x074e, B:166:0x05b5, B:152:0x04f1, B:93:0x0309, B:94:0x0310, B:96:0x0316, B:98:0x0322, B:54:0x0193, B:56:0x019d, B:58:0x01b2, B:64:0x01ce, B:69:0x0202, B:71:0x0208, B:73:0x0216, B:75:0x0226, B:78:0x0233, B:86:0x02b5, B:88:0x02bf, B:80:0x025a, B:81:0x0273, B:85:0x029b, B:84:0x0287, B:67:0x01da, B:68:0x01f8), top: B:367:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f2, B:100:0x032a, B:102:0x0374, B:104:0x0379, B:105:0x0390, B:107:0x039b, B:109:0x03b3, B:111:0x03b8, B:112:0x03cf, B:115:0x03ed, B:119:0x040e, B:120:0x0425, B:121:0x042e, B:124:0x044b, B:125:0x045f, B:127:0x0467, B:129:0x0475, B:131:0x047b, B:132:0x0482, B:134:0x048e, B:136:0x0496, B:138:0x049e, B:140:0x04a4, B:142:0x04a8, B:143:0x04b4, B:144:0x04c1, B:146:0x04e6, B:155:0x050a, B:156:0x051f, B:158:0x0546, B:161:0x055d, B:164:0x0598, B:167:0x05c2, B:169:0x05fa, B:170:0x05fd, B:172:0x0605, B:173:0x0608, B:175:0x0610, B:176:0x0613, B:178:0x061b, B:179:0x061e, B:181:0x0627, B:182:0x062b, B:184:0x0638, B:185:0x063b, B:187:0x0662, B:189:0x066a, B:190:0x066d, B:192:0x067c, B:194:0x0686, B:198:0x069b, B:203:0x06a8, B:206:0x06b1, B:210:0x06be, B:214:0x06cc, B:218:0x06da, B:222:0x06e8, B:226:0x06f6, B:230:0x0702, B:234:0x0710, B:235:0x071c, B:237:0x0722, B:238:0x0725, B:240:0x074b, B:243:0x0754, B:246:0x075d, B:247:0x0776, B:249:0x077c, B:251:0x0792, B:253:0x079e, B:255:0x07ab, B:260:0x07c9, B:261:0x07d9, B:265:0x07e3, B:266:0x07e6, B:268:0x07f2, B:269:0x07f7, B:271:0x0815, B:273:0x0819, B:275:0x0829, B:277:0x0834, B:278:0x083d, B:280:0x0847, B:282:0x0853, B:284:0x085d, B:286:0x0863, B:288:0x0872, B:290:0x088e, B:292:0x0894, B:293:0x089d, B:295:0x08ac, B:297:0x08e8, B:299:0x08f1, B:300:0x08f6, B:302:0x0900, B:304:0x091c, B:305:0x0927, B:307:0x095f, B:309:0x0967, B:311:0x0971, B:312:0x097e, B:314:0x0988, B:315:0x0995, B:316:0x099e, B:318:0x09a4, B:320:0x09e0, B:322:0x09ea, B:324:0x09fc, B:326:0x0a02, B:327:0x0a47, B:328:0x0a52, B:329:0x0a5d, B:331:0x0a63, B:340:0x0ab0, B:341:0x0afb, B:343:0x0b0a, B:357:0x0b6b, B:348:0x0b22, B:349:0x0b25, B:334:0x0a70, B:336:0x0a9c, B:354:0x0b3e, B:355:0x0b55, B:356:0x0b56, B:241:0x074e, B:166:0x05b5, B:152:0x04f1, B:93:0x0309, B:94:0x0310, B:96:0x0316, B:98:0x0322, B:54:0x0193, B:56:0x019d, B:58:0x01b2, B:64:0x01ce, B:69:0x0202, B:71:0x0208, B:73:0x0216, B:75:0x0226, B:78:0x0233, B:86:0x02b5, B:88:0x02bf, B:80:0x025a, B:81:0x0273, B:85:0x029b, B:84:0x0287, B:67:0x01da, B:68:0x01f8), top: B:367:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0208 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f2, B:100:0x032a, B:102:0x0374, B:104:0x0379, B:105:0x0390, B:107:0x039b, B:109:0x03b3, B:111:0x03b8, B:112:0x03cf, B:115:0x03ed, B:119:0x040e, B:120:0x0425, B:121:0x042e, B:124:0x044b, B:125:0x045f, B:127:0x0467, B:129:0x0475, B:131:0x047b, B:132:0x0482, B:134:0x048e, B:136:0x0496, B:138:0x049e, B:140:0x04a4, B:142:0x04a8, B:143:0x04b4, B:144:0x04c1, B:146:0x04e6, B:155:0x050a, B:156:0x051f, B:158:0x0546, B:161:0x055d, B:164:0x0598, B:167:0x05c2, B:169:0x05fa, B:170:0x05fd, B:172:0x0605, B:173:0x0608, B:175:0x0610, B:176:0x0613, B:178:0x061b, B:179:0x061e, B:181:0x0627, B:182:0x062b, B:184:0x0638, B:185:0x063b, B:187:0x0662, B:189:0x066a, B:190:0x066d, B:192:0x067c, B:194:0x0686, B:198:0x069b, B:203:0x06a8, B:206:0x06b1, B:210:0x06be, B:214:0x06cc, B:218:0x06da, B:222:0x06e8, B:226:0x06f6, B:230:0x0702, B:234:0x0710, B:235:0x071c, B:237:0x0722, B:238:0x0725, B:240:0x074b, B:243:0x0754, B:246:0x075d, B:247:0x0776, B:249:0x077c, B:251:0x0792, B:253:0x079e, B:255:0x07ab, B:260:0x07c9, B:261:0x07d9, B:265:0x07e3, B:266:0x07e6, B:268:0x07f2, B:269:0x07f7, B:271:0x0815, B:273:0x0819, B:275:0x0829, B:277:0x0834, B:278:0x083d, B:280:0x0847, B:282:0x0853, B:284:0x085d, B:286:0x0863, B:288:0x0872, B:290:0x088e, B:292:0x0894, B:293:0x089d, B:295:0x08ac, B:297:0x08e8, B:299:0x08f1, B:300:0x08f6, B:302:0x0900, B:304:0x091c, B:305:0x0927, B:307:0x095f, B:309:0x0967, B:311:0x0971, B:312:0x097e, B:314:0x0988, B:315:0x0995, B:316:0x099e, B:318:0x09a4, B:320:0x09e0, B:322:0x09ea, B:324:0x09fc, B:326:0x0a02, B:327:0x0a47, B:328:0x0a52, B:329:0x0a5d, B:331:0x0a63, B:340:0x0ab0, B:341:0x0afb, B:343:0x0b0a, B:357:0x0b6b, B:348:0x0b22, B:349:0x0b25, B:334:0x0a70, B:336:0x0a9c, B:354:0x0b3e, B:355:0x0b55, B:356:0x0b56, B:241:0x074e, B:166:0x05b5, B:152:0x04f1, B:93:0x0309, B:94:0x0310, B:96:0x0316, B:98:0x0322, B:54:0x0193, B:56:0x019d, B:58:0x01b2, B:64:0x01ce, B:69:0x0202, B:71:0x0208, B:73:0x0216, B:75:0x0226, B:78:0x0233, B:86:0x02b5, B:88:0x02bf, B:80:0x025a, B:81:0x0273, B:85:0x029b, B:84:0x0287, B:67:0x01da, B:68:0x01f8), top: B:367:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0309 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f2, B:100:0x032a, B:102:0x0374, B:104:0x0379, B:105:0x0390, B:107:0x039b, B:109:0x03b3, B:111:0x03b8, B:112:0x03cf, B:115:0x03ed, B:119:0x040e, B:120:0x0425, B:121:0x042e, B:124:0x044b, B:125:0x045f, B:127:0x0467, B:129:0x0475, B:131:0x047b, B:132:0x0482, B:134:0x048e, B:136:0x0496, B:138:0x049e, B:140:0x04a4, B:142:0x04a8, B:143:0x04b4, B:144:0x04c1, B:146:0x04e6, B:155:0x050a, B:156:0x051f, B:158:0x0546, B:161:0x055d, B:164:0x0598, B:167:0x05c2, B:169:0x05fa, B:170:0x05fd, B:172:0x0605, B:173:0x0608, B:175:0x0610, B:176:0x0613, B:178:0x061b, B:179:0x061e, B:181:0x0627, B:182:0x062b, B:184:0x0638, B:185:0x063b, B:187:0x0662, B:189:0x066a, B:190:0x066d, B:192:0x067c, B:194:0x0686, B:198:0x069b, B:203:0x06a8, B:206:0x06b1, B:210:0x06be, B:214:0x06cc, B:218:0x06da, B:222:0x06e8, B:226:0x06f6, B:230:0x0702, B:234:0x0710, B:235:0x071c, B:237:0x0722, B:238:0x0725, B:240:0x074b, B:243:0x0754, B:246:0x075d, B:247:0x0776, B:249:0x077c, B:251:0x0792, B:253:0x079e, B:255:0x07ab, B:260:0x07c9, B:261:0x07d9, B:265:0x07e3, B:266:0x07e6, B:268:0x07f2, B:269:0x07f7, B:271:0x0815, B:273:0x0819, B:275:0x0829, B:277:0x0834, B:278:0x083d, B:280:0x0847, B:282:0x0853, B:284:0x085d, B:286:0x0863, B:288:0x0872, B:290:0x088e, B:292:0x0894, B:293:0x089d, B:295:0x08ac, B:297:0x08e8, B:299:0x08f1, B:300:0x08f6, B:302:0x0900, B:304:0x091c, B:305:0x0927, B:307:0x095f, B:309:0x0967, B:311:0x0971, B:312:0x097e, B:314:0x0988, B:315:0x0995, B:316:0x099e, B:318:0x09a4, B:320:0x09e0, B:322:0x09ea, B:324:0x09fc, B:326:0x0a02, B:327:0x0a47, B:328:0x0a52, B:329:0x0a5d, B:331:0x0a63, B:340:0x0ab0, B:341:0x0afb, B:343:0x0b0a, B:357:0x0b6b, B:348:0x0b22, B:349:0x0b25, B:334:0x0a70, B:336:0x0a9c, B:354:0x0b3e, B:355:0x0b55, B:356:0x0b56, B:241:0x074e, B:166:0x05b5, B:152:0x04f1, B:93:0x0309, B:94:0x0310, B:96:0x0316, B:98:0x0322, B:54:0x0193, B:56:0x019d, B:58:0x01b2, B:64:0x01ce, B:69:0x0202, B:71:0x0208, B:73:0x0216, B:75:0x0226, B:78:0x0233, B:86:0x02b5, B:88:0x02bf, B:80:0x025a, B:81:0x0273, B:85:0x029b, B:84:0x0287, B:67:0x01da, B:68:0x01f8), top: B:367:0x0155, inners: #0, #1, #5, #6 }] */
    /* JADX WARN: Type inference failed for: r0v74, types: [k1.n] */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.google.android.gms.internal.measurement.S2, com.google.android.gms.internal.measurement.S4] */
    /* JADX WARN: Type inference failed for: r11v19, types: [k1.n] */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r13v30, types: [k1.o2] */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Long, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r42v0, types: [k1.l7] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v43, types: [k1.o2] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(k1.C1150J r43, k1.x7 r44) {
        /*
            Method dump skipped, instruction units count: 2980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l7.w0(k1.J, k1.x7):void");
    }

    public final void x(C1150J c1150j, x7 x7Var) {
        C1150J c1150j2;
        List<C1232j> listO;
        List<C1232j> listO2;
        List<C1232j> listO3;
        String str;
        AbstractC0549h.j(x7Var);
        String str2 = x7Var.f9967m;
        AbstractC0549h.d(str2);
        e().h();
        r();
        long j4 = c1150j.f9091p;
        L2 l2B = L2.b(c1150j);
        e().h();
        w7.B((this.f9544F == null || (str = this.f9545G) == null || !str.equals(str2)) ? null : this.f9544F, l2B.f9127d, false);
        C1150J c1150jA = l2B.a();
        a();
        if (r7.q(c1150jA, x7Var)) {
            if (!x7Var.f9974t) {
                B0(x7Var);
                return;
            }
            List list = x7Var.f9952E;
            if (list != null) {
                String str3 = c1150jA.f9088m;
                if (!list.contains(str3)) {
                    c().q().d("Dropping non-safelisted event. appId, event name, origin", str2, c1150jA.f9088m, c1150jA.f9090o);
                    return;
                } else {
                    Bundle bundleG = c1150jA.f9089n.g();
                    bundleG.putLong("ga_safelisted", 1L);
                    c1150j2 = new C1150J(str3, new C1148H(bundleG), c1150jA.f9090o, c1150jA.f9091p);
                }
            } else {
                c1150j2 = c1150jA;
            }
            E0().t();
            try {
                C0764h7.b();
                if (D0().P(null, AbstractC1291q2.f9751j1) && "_s".equals(c1150j2.f9088m) && !E0().L(str2, "_s") && c1150j2.f9089n.i("_sid").longValue() != 0) {
                    if (E0().L(str2, "_f") || E0().L(str2, "_v")) {
                        E0().s(str2, null, "_sid", A0(str2, c1150j2));
                    } else {
                        E0().s(str2, Long.valueOf(f().a() - 15000), "_sid", A0(str2, c1150j2));
                    }
                }
                C1343x c1343xE0 = E0();
                AbstractC0549h.d(str2);
                c1343xE0.h();
                c1343xE0.i();
                if (j4 < 0) {
                    c1343xE0.f9366a.c().w().c("Invalid time querying timed out conditional properties", K2.z(str2), Long.valueOf(j4));
                    listO = Collections.EMPTY_LIST;
                } else {
                    listO = c1343xE0.o("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j4)});
                }
                for (C1232j c1232j : listO) {
                    if (c1232j != null) {
                        c().v().d("User property timed out", c1232j.f9481m, this.f9560l.F().f(c1232j.f9483o.f9845n), c1232j.f9483o.d());
                        C1150J c1150j3 = c1232j.f9487s;
                        if (c1150j3 != null) {
                            w0(new C1150J(c1150j3, j4), x7Var);
                        }
                        E0().M(str2, c1232j.f9483o.f9845n);
                    }
                }
                C1343x c1343xE02 = E0();
                AbstractC0549h.d(str2);
                c1343xE02.h();
                c1343xE02.i();
                if (j4 < 0) {
                    c1343xE02.f9366a.c().w().c("Invalid time querying expired conditional properties", K2.z(str2), Long.valueOf(j4));
                    listO2 = Collections.EMPTY_LIST;
                } else {
                    listO2 = c1343xE02.o("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j4)});
                }
                ArrayList arrayList = new ArrayList(listO2.size());
                for (C1232j c1232j2 : listO2) {
                    if (c1232j2 != null) {
                        c().v().d("User property expired", c1232j2.f9481m, this.f9560l.F().f(c1232j2.f9483o.f9845n), c1232j2.f9483o.d());
                        E0().B(str2, c1232j2.f9483o.f9845n);
                        C1150J c1150j4 = c1232j2.f9491w;
                        if (c1150j4 != null) {
                            arrayList.add(c1150j4);
                        }
                        E0().M(str2, c1232j2.f9483o.f9845n);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w0(new C1150J((C1150J) it.next(), j4), x7Var);
                }
                C1343x c1343xE03 = E0();
                String str4 = c1150j2.f9088m;
                AbstractC0549h.d(str2);
                AbstractC0549h.d(str4);
                c1343xE03.h();
                c1343xE03.i();
                if (j4 < 0) {
                    C1363z3 c1363z3 = c1343xE03.f9366a;
                    c1363z3.c().w().d("Invalid time querying triggered conditional properties", K2.z(str2), c1363z3.F().d(str4), Long.valueOf(j4));
                    listO3 = Collections.EMPTY_LIST;
                } else {
                    listO3 = c1343xE03.o("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j4)});
                }
                ArrayList arrayList2 = new ArrayList(listO3.size());
                for (C1232j c1232j3 : listO3) {
                    if (c1232j3 != null) {
                        s7 s7Var = c1232j3.f9483o;
                        u7 u7Var = new u7((String) AbstractC0549h.j(c1232j3.f9481m), c1232j3.f9482n, s7Var.f9845n, j4, AbstractC0549h.j(s7Var.d()));
                        if (E0().d0(u7Var)) {
                            c().v().d("User property triggered", c1232j3.f9481m, this.f9560l.F().f(u7Var.f9879c), u7Var.f9881e);
                        } else {
                            c().r().d("Too many active user properties, ignoring", K2.z(c1232j3.f9481m), this.f9560l.F().f(u7Var.f9879c), u7Var.f9881e);
                        }
                        C1150J c1150j5 = c1232j3.f9489u;
                        if (c1150j5 != null) {
                            arrayList2.add(c1150j5);
                        }
                        c1232j3.f9483o = new s7(u7Var);
                        c1232j3.f9485q = true;
                        E0().c0(c1232j3);
                    }
                }
                w0(c1150j2, x7Var);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    w0(new C1150J((C1150J) it2.next(), j4), x7Var);
                }
                E0().E();
                E0().x();
            } catch (Throwable th) {
                E0().x();
                throw th;
            }
        }
    }

    public final boolean x0(String str, String str2) {
        F2 f2A0 = E0().A0(str);
        if (f2A0 != null && g().c0(str, f2A0.m())) {
            this.f9543E.remove(str2);
            return true;
        }
        j7 j7Var = (j7) this.f9543E.get(str2);
        if (j7Var == null) {
            return true;
        }
        return j7Var.c();
    }

    public final void y(C1150J c1150j, String str) {
        F2 f2A0 = E0().A0(str);
        if (f2A0 == null || TextUtils.isEmpty(f2A0.f())) {
            c().q().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolL = L(f2A0);
        if (boolL == null) {
            if (!"_ui".equals(c1150j.f9088m)) {
                c().w().b("Could not find package. appId", K2.z(str));
            }
        } else if (!boolL.booleanValue()) {
            c().r().b("App version does not match; dropping event. appId", K2.z(str));
            return;
        }
        z(c1150j, new x7(str, f2A0.h(), f2A0.f(), f2A0.s0(), f2A0.e(), f2A0.E0(), f2A0.B0(), (String) null, f2A0.K(), false, f2A0.g(), 0L, 0, f2A0.J(), false, f2A0.a(), f2A0.L0(), f2A0.C0(), f2A0.n(), (String) null, N0(str).q(), "", (String) null, f2A0.M(), f2A0.K0(), N0(str).b(), G0(str).j(), f2A0.A(), f2A0.t0(), f2A0.m(), f2A0.k(), 0L, f2A0.p0()));
    }

    public final boolean y0() {
        e().h();
        FileLock fileLock = this.f9571w;
        if (fileLock != null && fileLock.isValid()) {
            c().v().a("Storage concurrent access okay");
            return true;
        }
        this.f9551c.f9366a.B();
        File filesDir = this.f9560l.d().getFilesDir();
        com.google.android.gms.internal.measurement.Z.a();
        AbstractC0739f0 abstractC0739f0 = AbstractC0739f0.f6707a;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.f9572x = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.f9571w = fileLockTryLock;
            if (fileLockTryLock != null) {
                c().v().a("Storage concurrent access okay");
                return true;
            }
            c().r().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e4) {
            c().r().b("Failed to acquire storage lock", e4);
            return false;
        } catch (IOException e5) {
            c().r().b("Failed to access storage lock file", e5);
            return false;
        } catch (OverlappingFileLockException e6) {
            c().w().b("Storage lock already acquired", e6);
            return false;
        }
    }

    public final void z(C1150J c1150j, x7 x7Var) {
        String str = x7Var.f9967m;
        AbstractC0549h.d(str);
        L2 l2B = L2.b(c1150j);
        g().C(l2B.f9127d, E0().z0(str));
        g().E(l2B, D0().y(str));
        C1150J c1150jA = l2B.a();
        if ("_cmp".equals(c1150jA.f9088m)) {
            C1148H c1148h = c1150jA.f9089n;
            if ("referrer API v2".equals(c1148h.l("_cis"))) {
                String strL = c1148h.l("gclid");
                if (!TextUtils.isEmpty(strL)) {
                    r0(new s7("_lgclid", c1150jA.f9091p, strL, "auto"), x7Var);
                }
            }
        }
        x(c1150jA, x7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Bundle z0(String str) {
        e().h();
        r();
        if (K0().D(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        C1229i4 c1229i4N0 = N0(str);
        bundle.putAll(c1229i4N0.c());
        bundle.putAll(F0(str, G0(str), c1229i4N0, new C1280p()).b());
        u7 u7VarN0 = E0().N0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (u7VarN0 != null ? u7VarN0.f9881e.equals(1L) : I(str, new C1280p())) ? "granted" : "denied");
        return bundle;
    }
}
