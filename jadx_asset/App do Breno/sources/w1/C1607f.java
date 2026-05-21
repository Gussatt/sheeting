package w1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: w1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1607f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11813b;

    /* JADX INFO: renamed from: w1.f$b */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f11814a;

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f11814a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f11814a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // w1.C1607f.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public b(Class cls) {
            this.f11814a = cls;
        }
    }

    /* JADX INFO: renamed from: w1.f$c */
    public interface c {
        List a(Object obj);
    }

    public C1607f(Object obj, c cVar) {
        this.f11812a = obj;
        this.f11813b = cVar;
    }

    public static C1607f c(Context context, Class cls) {
        return new C1607f(context, new b(cls));
    }

    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e4) {
            throw new v(String.format("Could not instantiate %s.", str), e4);
        } catch (InstantiationException e5) {
            throw new v(String.format("Could not instantiate %s.", str), e5);
        } catch (NoSuchMethodException e6) {
            throw new v(String.format("Could not instantiate %s", str), e6);
        } catch (InvocationTargetException e7) {
            throw new v(String.format("Could not instantiate %s", str), e7);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f11813b.a(this.f11812a)) {
            arrayList.add(new U1.b() { // from class: w1.e
                @Override // U1.b
                public final Object get() {
                    return C1607f.d(str);
                }
            });
        }
        return arrayList;
    }
}
