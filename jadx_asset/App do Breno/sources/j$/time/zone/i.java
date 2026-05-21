package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class i extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f8533c;

    i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f8533c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.j
    protected final Set c() {
        return this.f8533c;
    }

    @Override // j$.time.zone.j
    protected final f b(String str) {
        if (this.f8533c.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new g("Not a built-in time zone: " + str);
    }
}
