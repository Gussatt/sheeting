package k1;

import java.util.EnumMap;

/* JADX INFO: renamed from: k1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1280p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f9650a;

    public C1280p() {
        this.f9650a = new EnumMap(EnumC1221h4.class);
    }

    public static C1280p b(String str) {
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        if (str.length() >= EnumC1221h4.values().length) {
            int i4 = 0;
            if (str.charAt(0) == '1') {
                EnumC1221h4[] enumC1221h4ArrValues = EnumC1221h4.values();
                int length = enumC1221h4ArrValues.length;
                int i5 = 1;
                while (i4 < length) {
                    enumMap.put(enumC1221h4ArrValues[i4], EnumC1272o.f(str.charAt(i5)));
                    i4++;
                    i5++;
                }
                return new C1280p(enumMap);
            }
        }
        return new C1280p();
    }

    public final EnumC1272o a(EnumC1221h4 enumC1221h4) {
        EnumC1272o enumC1272o = (EnumC1272o) this.f9650a.get(enumC1221h4);
        return enumC1272o == null ? EnumC1272o.UNSET : enumC1272o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(k1.EnumC1221h4 r3, int r4) {
        /*
            r2 = this;
            k1.o r0 = k1.EnumC1272o.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            k1.o r0 = k1.EnumC1272o.INITIALIZATION
            goto L20
        L18:
            k1.o r0 = k1.EnumC1272o.MANIFEST
            goto L20
        L1b:
            k1.o r0 = k1.EnumC1272o.API
            goto L20
        L1e:
            k1.o r0 = k1.EnumC1272o.TCF
        L20:
            java.util.EnumMap r4 = r2.f9650a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1280p.c(k1.h4, int):void");
    }

    public final void d(EnumC1221h4 enumC1221h4, EnumC1272o enumC1272o) {
        this.f9650a.put(enumC1221h4, enumC1272o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (EnumC1221h4 enumC1221h4 : EnumC1221h4.values()) {
            EnumC1272o enumC1272o = (EnumC1272o) this.f9650a.get(enumC1221h4);
            if (enumC1272o == null) {
                enumC1272o = EnumC1272o.UNSET;
            }
            sb.append(enumC1272o.f9634m);
        }
        return sb.toString();
    }

    public C1280p(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC1221h4.class);
        this.f9650a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
