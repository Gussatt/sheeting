package t3;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: t3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1551g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f11422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f11423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f11424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f11425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f11426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f11427h;

    public C1551g(boolean z3, boolean z4, J j4, Long l4, Long l5, Long l6, Long l7, Map map) {
        X2.l.e(map, "extras");
        this.f11420a = z3;
        this.f11421b = z4;
        this.f11422c = j4;
        this.f11423d = l4;
        this.f11424e = l5;
        this.f11425f = l6;
        this.f11426g = l7;
        this.f11427h = L2.C.l(map);
    }

    public final Long a() {
        return this.f11425f;
    }

    public final Long b() {
        return this.f11423d;
    }

    public final boolean c() {
        return this.f11421b;
    }

    public final boolean d() {
        return this.f11420a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f11420a) {
            arrayList.add("isRegularFile");
        }
        if (this.f11421b) {
            arrayList.add("isDirectory");
        }
        if (this.f11423d != null) {
            arrayList.add("byteCount=" + this.f11423d);
        }
        if (this.f11424e != null) {
            arrayList.add("createdAt=" + this.f11424e);
        }
        if (this.f11425f != null) {
            arrayList.add("lastModifiedAt=" + this.f11425f);
        }
        if (this.f11426g != null) {
            arrayList.add("lastAccessedAt=" + this.f11426g);
        }
        if (!this.f11427h.isEmpty()) {
            arrayList.add("extras=" + this.f11427h);
        }
        return L2.u.z(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C1551g(boolean z3, boolean z4, J j4, Long l4, Long l5, Long l6, Long l7, Map map, int i4, X2.g gVar) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? false : z4, (i4 & 4) != 0 ? null : j4, (i4 & 8) != 0 ? null : l4, (i4 & 16) != 0 ? null : l5, (i4 & 32) != 0 ? null : l6, (i4 & 64) != 0 ? null : l7, (i4 & 128) != 0 ? L2.C.d() : map);
    }
}
