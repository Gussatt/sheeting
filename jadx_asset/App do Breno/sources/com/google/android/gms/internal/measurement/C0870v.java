package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0870v implements Iterable, r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6979m;

    public C0870v(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f6979m = str;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C0870v(this.f6979m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0870v) {
            return this.f6979m.equals(((C0870v) obj).f6979m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        String str = this.f6979m;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return this.f6979m;
    }

    public final int hashCode() {
        return this.f6979m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        return Boolean.valueOf(!this.f6979m.isEmpty());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0862u(this);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return new C0854t(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.r
    public final r l(String str, U1 u12, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        byte b4;
        int i4;
        String strG;
        int i5;
        int i6;
        int i7;
        U1 u13;
        int iA;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                b4 = str.equals(str4) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    b4 = 14;
                    str4 = str2;
                }
                str4 = str2;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b4 = 12;
                    str4 = str2;
                }
                str4 = str2;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    b4 = 0;
                }
                str4 = str2;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    b4 = 1;
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b4 = 13;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b4 = 7;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b4 = 11;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b4 = 4;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b4 = 15;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b4 = 16;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b4 = 5;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b4 = 8;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b4 = 9;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b4 = 10;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b4 = 6;
                    str4 = str2;
                    str5 = "charAt";
                }
                str4 = str2;
                str5 = "charAt";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    b4 = 3;
                }
                str4 = str2;
                str5 = "charAt";
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                break;
        }
        switch (b4) {
            case 0:
                AbstractC0873v2.j(str5, 1, list);
                int iA2 = !list.isEmpty() ? (int) AbstractC0873v2.a(u12.b((r) list.get(0)).f().doubleValue()) : 0;
                String str6 = this.f6979m;
                return (iA2 < 0 || iA2 >= str6.length()) ? r.f6939i : new C0870v(String.valueOf(str6.charAt(iA2)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.f6979m);
                for (int i8 = 0; i8 < list.size(); i8++) {
                    sb.append(u12.b((r) list.get(i8)).g());
                }
                return new C0870v(sb.toString());
            case 2:
                AbstractC0873v2.h(str4, 1, list);
                String str7 = this.f6979m;
                r rVarB = u12.b((r) list.get(0));
                if ("length".equals(rVarB.g())) {
                    return r.f6937g;
                }
                double dDoubleValue = rVarB.f().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i4 = (int) dDoubleValue) < 0 || i4 >= str7.length()) ? r.f6938h : r.f6937g;
            case 3:
                AbstractC0873v2.j("indexOf", 2, list);
                return new C0774j(Double.valueOf(this.f6979m.indexOf(list.size() > 0 ? u12.b((r) list.get(0)).g() : "undefined", (int) AbstractC0873v2.a(list.size() >= 2 ? u12.b((r) list.get(1)).f().doubleValue() : 0.0d))));
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0873v2.j("lastIndexOf", 2, list);
                String str8 = this.f6979m;
                String strG2 = list.size() > 0 ? u12.b((r) list.get(0)).g() : "undefined";
                return new C0774j(Double.valueOf(str8.lastIndexOf(strG2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : u12.b((r) list.get(1)).f().doubleValue()) ? Double.POSITIVE_INFINITY : AbstractC0873v2.a(r3)))));
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                AbstractC0873v2.j("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : u12.b((r) list.get(0)).g()).matcher(this.f6979m);
                return matcher.find() ? new C0738f(Arrays.asList(new C0870v(matcher.group()))) : r.f6933c;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0873v2.j("replace", 2, list);
                r rVarA = r.f6932b;
                if (!list.isEmpty()) {
                    strG = u12.b((r) list.get(0)).g();
                    if (list.size() > 1) {
                        rVarA = u12.b((r) list.get(1));
                    }
                }
                String str9 = strG;
                String str10 = this.f6979m;
                int iIndexOf = str10.indexOf(str9);
                if (iIndexOf < 0) {
                    return this;
                }
                if (rVarA instanceof AbstractC0783k) {
                    i5 = 0;
                    rVarA = ((AbstractC0783k) rVarA).a(u12, Arrays.asList(new C0870v(str9), new C0774j(Double.valueOf(iIndexOf)), this));
                } else {
                    i5 = 0;
                }
                return new C0870v(str10.substring(i5, iIndexOf) + rVarA.g() + str10.substring(iIndexOf + str9.length()));
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0873v2.j("search", 1, list);
                return Pattern.compile(list.isEmpty() ? "undefined" : u12.b((r) list.get(0)).g()).matcher(this.f6979m).find() ? new C0774j(Double.valueOf(r0.start())) : new C0774j(Double.valueOf(-1.0d));
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0873v2.j("slice", 2, list);
                String str11 = this.f6979m;
                double dA = AbstractC0873v2.a(!list.isEmpty() ? u12.b((r) list.get(0)).f().doubleValue() : 0.0d);
                double dMax = dA < 0.0d ? Math.max(((double) str11.length()) + dA, 0.0d) : Math.min(dA, str11.length());
                double dA2 = AbstractC0873v2.a(list.size() > 1 ? u12.b((r) list.get(1)).f().doubleValue() : str11.length());
                double dMax2 = dA2 < 0.0d ? Math.max(((double) str11.length()) + dA2, 0.0d) : Math.min(dA2, str11.length());
                int i9 = (int) dMax;
                return new C0870v(str11.substring(i9, Math.max(0, ((int) dMax2) - i9) + i9));
            case 9:
                AbstractC0873v2.j("split", 2, list);
                String str12 = this.f6979m;
                if (str12.length() == 0) {
                    return new C0738f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strG3 = u12.b((r) list.get(0)).g();
                    long jD = list.size() > 1 ? AbstractC0873v2.d(u12.b((r) list.get(1)).f().doubleValue()) : 2147483647L;
                    if (jD == 0) {
                        return new C0738f();
                    }
                    String[] strArrSplit = str12.split(Pattern.quote(strG3), ((int) jD) + 1);
                    int length = strArrSplit.length;
                    if (!strG3.isEmpty() || length <= 0) {
                        i6 = length;
                        i7 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i6 = length - 1;
                        i7 = zIsEmpty;
                        if (!strArrSplit[i6].isEmpty()) {
                            i6 = length;
                            i7 = zIsEmpty;
                        }
                    }
                    if (length > jD) {
                        i6--;
                    }
                    while (i7 < i6) {
                        arrayList.add(new C0870v(strArrSplit[i7]));
                        i7++;
                    }
                }
                return new C0738f(arrayList);
            case 10:
                AbstractC0873v2.j("substring", 2, list);
                String str13 = this.f6979m;
                if (list.isEmpty()) {
                    u13 = u12;
                    iA = 0;
                } else {
                    u13 = u12;
                    iA = (int) AbstractC0873v2.a(u13.b((r) list.get(0)).f().doubleValue());
                }
                int iA3 = list.size() > 1 ? (int) AbstractC0873v2.a(u13.b((r) list.get(1)).f().doubleValue()) : str13.length();
                int iMin = Math.min(Math.max(iA, 0), str13.length());
                int iMin2 = Math.min(Math.max(iA3, 0), str13.length());
                return new C0870v(str13.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                AbstractC0873v2.h("toLocaleUpperCase", 0, list);
                return new C0870v(this.f6979m.toUpperCase());
            case 12:
                AbstractC0873v2.h("toLocaleLowerCase", 0, list);
                return new C0870v(this.f6979m.toLowerCase());
            case 13:
                AbstractC0873v2.h("toLowerCase", 0, list);
                return new C0870v(this.f6979m.toLowerCase(Locale.ENGLISH));
            case 14:
                AbstractC0873v2.h("toString", 0, list);
                return this;
            case 15:
                AbstractC0873v2.h("toUpperCase", 0, list);
                return new C0870v(this.f6979m.toUpperCase(Locale.ENGLISH));
            case 16:
                AbstractC0873v2.h("toUpperCase", 0, list);
                return new C0870v(this.f6979m.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        return "\"" + this.f6979m + "\"";
    }
}
