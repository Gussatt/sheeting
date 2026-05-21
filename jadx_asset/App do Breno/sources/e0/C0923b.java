package e0;

import X2.l;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0609f;
import androidx.lifecycle.InterfaceC0611h;
import androidx.lifecycle.j;
import e0.C0925d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: e0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0923b implements InterfaceC0611h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7168b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f7169a;

    /* JADX INFO: renamed from: e0.b$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public C0923b(f fVar) {
        l.e(fVar, "owner");
        this.f7169a = fVar;
    }

    @Override // androidx.lifecycle.InterfaceC0611h
    public void a(j jVar, AbstractC0609f.a aVar) {
        l.e(jVar, "source");
        l.e(aVar, "event");
        if (aVar != AbstractC0609f.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        jVar.h().c(this);
        Bundle bundleB = this.f7169a.l().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void b(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, C0923b.class.getClassLoader()).asSubclass(C0925d.a.class);
            l.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    l.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                    i.d.a(objNewInstance);
                    throw null;
                } catch (Exception e4) {
                    throw new RuntimeException("Failed to instantiate " + str, e4);
                }
            } catch (NoSuchMethodException e5) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("Class " + str + " wasn't found", e6);
        }
    }
}
