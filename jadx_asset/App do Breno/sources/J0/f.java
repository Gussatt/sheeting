package J0;

import J0.c;
import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public M0.a f2291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f2292b = new HashMap();

        public a a(z0.e eVar, b bVar) {
            this.f2292b.put(eVar, bVar);
            return this;
        }

        public f b() {
            if (this.f2291a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f2292b.keySet().size() < z0.e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f2292b;
            this.f2292b = new HashMap();
            return f.d(this.f2291a, map);
        }

        public a c(M0.a aVar) {
            this.f2291a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j4);

            public abstract a c(Set set);

            public abstract a d(long j4);
        }

        public static a a() {
            return new c.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static f d(M0.a aVar, Map map) {
        return new J0.b(aVar, map);
    }

    public static f f(M0.a aVar) {
        return b().a(z0.e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(z0.e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(z0.e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i4, long j4) {
        return (long) (Math.pow(3.0d, i4 - 1) * j4 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j4 > 1 ? j4 : 2L) * ((long) r7))));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, z0.e eVar, long j4, int i4) {
        builder.setMinimumLatency(g(eVar, j4, i4));
        j(builder, ((b) h().get(eVar)).c());
        return builder;
    }

    public abstract M0.a e();

    public long g(z0.e eVar, long j4, int i4) {
        long jA = j4 - e().a();
        b bVar = (b) h().get(eVar);
        return Math.min(Math.max(a(i4, bVar.b()), jA), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
