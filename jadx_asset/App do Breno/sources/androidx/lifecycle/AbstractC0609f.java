package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0609f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicReference f4968a = new AtomicReference();

    /* JADX INFO: renamed from: androidx.lifecycle.f$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0096a Companion = new C0096a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.f$a$a, reason: collision with other inner class name */
        public static final class C0096a {

            /* JADX INFO: renamed from: androidx.lifecycle.f$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0097a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f4969a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f4969a = iArr;
                }
            }

            public /* synthetic */ C0096a(X2.g gVar) {
                this();
            }

            public final a a(b bVar) {
                X2.l.e(bVar, "state");
                int i4 = C0097a.f4969a[bVar.ordinal()];
                if (i4 == 1) {
                    return a.ON_DESTROY;
                }
                if (i4 == 2) {
                    return a.ON_STOP;
                }
                if (i4 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                X2.l.e(bVar, "state");
                int i4 = C0097a.f4969a[bVar.ordinal()];
                if (i4 == 1) {
                    return a.ON_START;
                }
                if (i4 == 2) {
                    return a.ON_RESUME;
                }
                if (i4 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public C0096a() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.f$a$b */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4970a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f4970a = iArr;
            }
        }

        public final b f() {
            switch (b.f4970a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    return b.STARTED;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    return b.RESUMED;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.f$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean f(b bVar) {
            X2.l.e(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(i iVar);

    public abstract b b();

    public abstract void c(i iVar);
}
