package v0;

import X2.l;
import android.util.Log;
import d3.b;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1585a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1585a f11542a = new C1585a();

    public static final boolean e(String str, W2.a aVar) {
        l.e(aVar, "block");
        try {
            boolean zBooleanValue = ((Boolean) aVar.e()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.e("ReflectionGuard", sb.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        }
    }

    public final boolean a(W2.a aVar) {
        l.e(aVar, "classLoader");
        try {
            aVar.e();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, b bVar) {
        l.e(method, "<this>");
        l.e(bVar, "clazz");
        return c(method, V2.a.a(bVar));
    }

    public final boolean c(Method method, Class cls) {
        l.e(method, "<this>");
        l.e(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean d(Method method) {
        l.e(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
