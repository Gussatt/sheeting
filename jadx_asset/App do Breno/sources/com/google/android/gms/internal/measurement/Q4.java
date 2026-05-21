package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q4 {
    public static L4 a(Class cls) {
        String str;
        ClassLoader classLoader = Q4.class.getClassLoader();
        if (cls.equals(L4.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!cls.getPackage().equals(Q4.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        try {
                            i.d.a(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (InvocationTargetException e4) {
                            throw new IllegalStateException(e4);
                        }
                    } catch (NoSuchMethodException e5) {
                        throw new IllegalStateException(e5);
                    }
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(e6);
                }
            } catch (InstantiationException e7) {
                throw new IllegalStateException(e7);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(Q4.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    i.d.a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e8) {
                    Logger.getLogger(H4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e8);
                }
            }
            if (arrayList.size() == 1) {
                return (L4) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (L4) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException(e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }
}
