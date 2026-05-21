package j3;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i4, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }
}
