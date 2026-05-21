package F2;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class L extends ObjectInputStream {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(InputStream inputStream) {
        super(inputStream);
        X2.l.e(inputStream, "input");
    }

    @Override // java.io.ObjectInputStream
    public Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
        Set setD = L2.E.d("java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;");
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || setD.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
