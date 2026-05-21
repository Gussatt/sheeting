package V1;

/* JADX INFO: loaded from: classes.dex */
public class i extends r1.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f3759m;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public i(a aVar) {
        this.f3759m = aVar;
    }

    public i(String str, a aVar) {
        super(str);
        this.f3759m = aVar;
    }
}
