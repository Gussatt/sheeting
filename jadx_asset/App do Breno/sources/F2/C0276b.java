package F2;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: F2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0276b implements G {
    @Override // F2.G
    public String a(List list) throws IOException {
        X2.l.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        X2.l.d(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // F2.G
    public List b(String str) throws ClassNotFoundException, IOException {
        X2.l.e(str, "listString");
        Object object = new L(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
        X2.l.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) object) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
