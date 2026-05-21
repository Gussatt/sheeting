package com.google.android.gms.dynamic;

import V0.AbstractC0549h;
import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f6264l;

    public ObjectWrapper(Object obj) {
        this.f6264l = obj;
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).f6264l;
        }
        IBinder iBinderAsBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i4 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i4++;
                field = field2;
            }
        }
        if (i4 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        AbstractC0549h.j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e4) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException("Binder object is null.", e5);
        }
    }

    public static <T> IObjectWrapper wrap(T t4) {
        return new ObjectWrapper(t4);
    }
}
