package O;

import X2.l;
import androidx.datastore.preferences.protobuf.C0599v;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2833a = new a(null);

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final f a(InputStream inputStream) throws L.c {
            l.e(inputStream, "input");
            try {
                f fVarV = f.V(inputStream);
                l.d(fVarV, "{\n                Prefer…From(input)\n            }");
                return fVarV;
            } catch (C0599v e4) {
                throw new L.c("Unable to parse preferences proto.", e4);
            }
        }

        public a() {
        }
    }
}
