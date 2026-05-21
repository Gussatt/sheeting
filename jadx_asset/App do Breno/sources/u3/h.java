package u3;

import X2.l;
import java.util.ArrayList;
import java.util.List;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f11495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f11502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f11504j;

    public h(J j4, boolean z3, String str, long j5, long j6, long j7, int i4, Long l4, long j8) {
        l.e(j4, "canonicalPath");
        l.e(str, "comment");
        this.f11495a = j4;
        this.f11496b = z3;
        this.f11497c = str;
        this.f11498d = j5;
        this.f11499e = j6;
        this.f11500f = j7;
        this.f11501g = i4;
        this.f11502h = l4;
        this.f11503i = j8;
        this.f11504j = new ArrayList();
    }

    public final J a() {
        return this.f11495a;
    }

    public final List b() {
        return this.f11504j;
    }

    public final long c() {
        return this.f11499e;
    }

    public final int d() {
        return this.f11501g;
    }

    public final Long e() {
        return this.f11502h;
    }

    public final long f() {
        return this.f11503i;
    }

    public final long g() {
        return this.f11500f;
    }

    public final boolean h() {
        return this.f11496b;
    }

    public /* synthetic */ h(J j4, boolean z3, String str, long j5, long j6, long j7, int i4, Long l4, long j8, int i5, X2.g gVar) {
        this(j4, (i5 & 2) != 0 ? false : z3, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? -1L : j5, (i5 & 16) != 0 ? -1L : j6, (i5 & 32) != 0 ? -1L : j7, (i5 & 64) != 0 ? -1 : i4, (i5 & 128) != 0 ? null : l4, (i5 & 256) != 0 ? -1L : j8);
    }
}
