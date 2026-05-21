package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public class TimeConversions {
    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.x(), duration.p());
    }

    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        return Duration.J(duration.getSeconds(), duration.getNano());
    }
}
