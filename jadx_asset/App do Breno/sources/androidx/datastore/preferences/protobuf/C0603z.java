package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0598u;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0603z implements InterfaceC0602y {
    public static AbstractC0598u.b d(Object obj, long j4) {
        return (AbstractC0598u.b) i0.z(obj, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0602y
    public void a(Object obj, long j4) {
        d(obj, j4).j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0602y
    public List b(Object obj, long j4) {
        AbstractC0598u.b bVarD = d(obj, j4);
        if (bVarD.r()) {
            return bVarD;
        }
        int size = bVarD.size();
        AbstractC0598u.b bVarN = bVarD.n(size == 0 ? 10 : size * 2);
        i0.O(obj, j4, bVarN);
        return bVarN;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0602y
    public void c(Object obj, Object obj2, long j4) {
        AbstractC0598u.b bVarD = d(obj, j4);
        AbstractC0598u.b bVarD2 = d(obj2, j4);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.r()) {
                bVarD = bVarD.n(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        i0.O(obj, j4, bVarD2);
    }
}
