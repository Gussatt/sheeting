package w1;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r extends s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f11844m;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f11844m = list;
    }
}
