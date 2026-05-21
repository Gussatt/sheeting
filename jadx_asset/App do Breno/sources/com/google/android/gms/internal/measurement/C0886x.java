package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0886x extends AbstractC0894y {
    public C0886x() {
        this.f7016a.add(O.BITWISE_AND);
        this.f7016a.add(O.BITWISE_LEFT_SHIFT);
        this.f7016a.add(O.BITWISE_NOT);
        this.f7016a.add(O.BITWISE_OR);
        this.f7016a.add(O.BITWISE_RIGHT_SHIFT);
        this.f7016a.add(O.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f7016a.add(O.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0894y
    public final r a(String str, U1 u12, List list) {
        O o4 = O.ADD;
        switch (AbstractC0873v2.e(str).ordinal()) {
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0873v2.h(O.BITWISE_AND.name(), 2, list);
                return new C0774j(Double.valueOf(AbstractC0873v2.b(u12.b((r) list.get(0)).f().doubleValue()) & AbstractC0873v2.b(u12.b((r) list.get(1)).f().doubleValue())));
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                AbstractC0873v2.h(O.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C0774j(Double.valueOf(AbstractC0873v2.b(u12.b((r) list.get(0)).f().doubleValue()) << ((int) (AbstractC0873v2.d(u12.b((r) list.get(1)).f().doubleValue()) & 31))));
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0873v2.h(O.BITWISE_NOT.name(), 1, list);
                return new C0774j(Double.valueOf(~AbstractC0873v2.b(u12.b((r) list.get(0)).f().doubleValue())));
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0873v2.h(O.BITWISE_OR.name(), 2, list);
                return new C0774j(Double.valueOf(AbstractC0873v2.b(u12.b((r) list.get(0)).f().doubleValue()) | AbstractC0873v2.b(u12.b((r) list.get(1)).f().doubleValue())));
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0873v2.h(O.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C0774j(Double.valueOf(AbstractC0873v2.b(u12.b((r) list.get(0)).f().doubleValue()) >> ((int) (AbstractC0873v2.d(u12.b((r) list.get(1)).f().doubleValue()) & 31))));
            case 9:
                AbstractC0873v2.h(O.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C0774j(Double.valueOf(AbstractC0873v2.d(u12.b((r) list.get(0)).f().doubleValue()) >>> ((int) (AbstractC0873v2.d(u12.b((r) list.get(1)).f().doubleValue()) & 31))));
            case 10:
                AbstractC0873v2.h(O.BITWISE_XOR.name(), 2, list);
                return new C0774j(Double.valueOf(AbstractC0873v2.b(u12.b((r) list.get(0)).f().doubleValue()) ^ AbstractC0873v2.b(u12.b((r) list.get(1)).f().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
