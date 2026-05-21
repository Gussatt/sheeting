package q3;

import m3.F;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f11103a = new F("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f11104b = new F("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z3) {
        return new b(z3);
    }

    public static /* synthetic */ a b(boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return a(z3);
    }
}
