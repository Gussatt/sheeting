package h0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f7473b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7472a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7474c = new ArrayList();

    public s(View view) {
        this.f7473b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f7473b == sVar.f7473b && this.f7472a.equals(sVar.f7472a);
    }

    public int hashCode() {
        return (this.f7473b.hashCode() * 31) + this.f7472a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f7473b + "\n") + "    values:";
        for (String str2 : this.f7472a.keySet()) {
            str = str + "    " + str2 + ": " + this.f7472a.get(str2) + "\n";
        }
        return str;
    }
}
