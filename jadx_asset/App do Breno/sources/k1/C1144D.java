package k1;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k1.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1144D extends AbstractC1177c4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8933d;

    public C1144D(C1363z3 c1363z3) {
        super(c1363z3);
    }

    @Override // k1.AbstractC1177c4
    public final boolean j() {
        Calendar calendar = Calendar.getInstance();
        this.f8932c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f8933d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    public final long o() {
        k();
        return this.f8932c;
    }

    public final String p() {
        k();
        return this.f8933d;
    }
}
