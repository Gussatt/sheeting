package E2;

import E2.h;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import s2.InterfaceC1536a;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public class i implements InterfaceC1536a, h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1009c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1010a;

        static {
            int[] iArr = new int[h.b.values().length];
            f1010a = iArr;
            try {
                iArr[h.b.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1010a[h.b.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1010a[h.b.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1010a[h.b.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1010a[h.b.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1010a[h.b.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1010a[h.b.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1010a[h.b.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1010a[h.b.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1010a[h.b.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1010a[h.b.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        z(bVar.b(), bVar.a());
    }

    @Override // E2.h.a
    public String e() {
        return x();
    }

    @Override // E2.h.a
    public String f() {
        return this.f1009c.getCacheDir().getPath();
    }

    @Override // E2.h.a
    public String g() {
        return t();
    }

    @Override // E2.h.a
    public List h() {
        return u();
    }

    @Override // E2.h.a
    public String j() {
        return s();
    }

    @Override // E2.h.a
    public String o() {
        return w();
    }

    @Override // E2.h.a
    public List q(h.b bVar) {
        return v(bVar);
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        h.a.b(bVar.b(), null);
    }

    public final String s() {
        return I2.b.d(this.f1009c);
    }

    public final String t() {
        return I2.b.c(this.f1009c);
    }

    public final List u() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f1009c.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public final List v(h.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f1009c.getExternalFilesDirs(y(bVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public final String w() {
        File externalFilesDir = this.f1009c.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public final String x() {
        return this.f1009c.getCacheDir().getPath();
    }

    public final String y(h.b bVar) {
        switch (a.f1010a[bVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return "ringtones";
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return "alarms";
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return "notifications";
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return "pictures";
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + bVar);
        }
    }

    public final void z(InterfaceC1609b interfaceC1609b, Context context) {
        try {
            h.a.b(interfaceC1609b, this);
        } catch (Exception e4) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e4);
        }
        this.f1009c = context;
    }
}
