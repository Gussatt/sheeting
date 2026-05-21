package f0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import g0.AbstractC0960a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0938a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C0938a f7193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f7194e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7197c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f7196b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7195a = new HashMap();

    public C0938a(Context context) {
        this.f7197c = context.getApplicationContext();
    }

    public static C0938a d(Context context) {
        if (f7193d == null) {
            synchronized (f7194e) {
                try {
                    if (f7193d == null) {
                        f7193d = new C0938a(context);
                    }
                } finally {
                }
            }
        }
        return f7193d;
    }

    public void a() {
        try {
            try {
                AbstractC0960a.c("Startup");
                b(this.f7197c.getPackageManager().getProviderInfo(new ComponentName(this.f7197c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e4) {
                throw new C0941d(e4);
            }
        } finally {
            AbstractC0960a.f();
        }
    }

    public void b(Bundle bundle) {
        String string = this.f7197c.getString(AbstractC0940c.f7198a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC0939b.class.isAssignableFrom(cls)) {
                            this.f7196b.add(cls);
                        }
                    }
                }
                Iterator it = this.f7196b.iterator();
                while (it.hasNext()) {
                    c((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e4) {
                throw new C0941d(e4);
            }
        }
    }

    public final Object c(Class cls, Set set) {
        Object objB;
        if (AbstractC0960a.h()) {
            try {
                AbstractC0960a.c(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC0960a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f7195a.containsKey(cls)) {
            objB = this.f7195a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC0939b interfaceC0939b = (InterfaceC0939b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = interfaceC0939b.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f7195a.containsKey(cls2)) {
                            c(cls2, set);
                        }
                    }
                }
                objB = interfaceC0939b.b(this.f7197c);
                set.remove(cls);
                this.f7195a.put(cls, objB);
            } catch (Throwable th2) {
                throw new C0941d(th2);
            }
        }
        AbstractC0960a.f();
        return objB;
    }

    public boolean e(Class cls) {
        return this.f7196b.contains(cls);
    }
}
