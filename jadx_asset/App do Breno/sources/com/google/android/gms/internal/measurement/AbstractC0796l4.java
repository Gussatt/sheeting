package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0796l4 implements InterfaceC0852s5 {
    public static void h(List list, int i4) {
        String str = "Element at index " + (list.size() - i4) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i4) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    public static void l(Iterable iterable, List list) {
        Charset charset = AbstractC0717c5.f6667a;
        iterable.getClass();
        if (iterable instanceof A5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof C5) {
                ((C5) list).g(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    h(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Object obj2 = list2.get(i4);
            if (obj2 == null) {
                h(list, size2);
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0852s5
    public final /* synthetic */ InterfaceC0852s5 f(byte[] bArr, L4 l4) {
        return k(bArr, 0, bArr.length, l4);
    }

    public abstract AbstractC0796l4 i(byte[] bArr, int i4, int i5);

    @Override // com.google.android.gms.internal.measurement.InterfaceC0852s5
    public final /* synthetic */ InterfaceC0852s5 j(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public abstract AbstractC0796l4 k(byte[] bArr, int i4, int i5, L4 l4);
}
