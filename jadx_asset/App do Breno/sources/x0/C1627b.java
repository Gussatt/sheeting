package x0;

import java.util.Arrays;

/* JADX INFO: renamed from: x0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1627b extends RuntimeException {
    public C1627b(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
