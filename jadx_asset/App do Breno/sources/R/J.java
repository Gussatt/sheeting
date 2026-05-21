package R;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0609f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0501t f3035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f3036b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3043i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f3047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f3049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f3050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f3051q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f3053s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f3037c = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3044j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3052r = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractComponentCallbacksC0497o f3055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3060g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC0609f.b f3061h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public AbstractC0609f.b f3062i;

        public a() {
        }

        public a(int i4, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
            this.f3054a = i4;
            this.f3055b = abstractComponentCallbacksC0497o;
            this.f3056c = false;
            AbstractC0609f.b bVar = AbstractC0609f.b.RESUMED;
            this.f3061h = bVar;
            this.f3062i = bVar;
        }

        public a(int i4, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, boolean z3) {
            this.f3054a = i4;
            this.f3055b = abstractComponentCallbacksC0497o;
            this.f3056c = z3;
            AbstractC0609f.b bVar = AbstractC0609f.b.RESUMED;
            this.f3061h = bVar;
            this.f3062i = bVar;
        }
    }

    public J(AbstractC0501t abstractC0501t, ClassLoader classLoader) {
        this.f3035a = abstractC0501t;
        this.f3036b = classLoader;
    }

    public J b(int i4, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, String str) {
        g(i4, abstractComponentCallbacksC0497o, str, 1);
        return this;
    }

    public J c(ViewGroup viewGroup, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, String str) {
        abstractComponentCallbacksC0497o.f3227I = viewGroup;
        return b(viewGroup.getId(), abstractComponentCallbacksC0497o, str);
    }

    public void d(a aVar) {
        this.f3037c.add(aVar);
        aVar.f3057d = this.f3038d;
        aVar.f3058e = this.f3039e;
        aVar.f3059f = this.f3040f;
        aVar.f3060g = this.f3041g;
    }

    public abstract void e();

    public J f() {
        if (this.f3043i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f3044j = false;
        return this;
    }

    public void g(int i4, AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, String str, int i5) {
        String str2 = abstractComponentCallbacksC0497o.f3236R;
        if (str2 != null) {
            S.c.f(abstractComponentCallbacksC0497o, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0497o.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0497o.f3219A;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0497o + ": was " + abstractComponentCallbacksC0497o.f3219A + " now " + str);
            }
            abstractComponentCallbacksC0497o.f3219A = str;
        }
        if (i4 != 0) {
            if (i4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0497o + " with tag " + str + " to container view with no id");
            }
            int i6 = abstractComponentCallbacksC0497o.f3270y;
            if (i6 != 0 && i6 != i4) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0497o + ": was " + abstractComponentCallbacksC0497o.f3270y + " now " + i4);
            }
            abstractComponentCallbacksC0497o.f3270y = i4;
            abstractComponentCallbacksC0497o.f3271z = i4;
        }
        d(new a(i5, abstractComponentCallbacksC0497o));
    }

    public J h(boolean z3) {
        this.f3052r = z3;
        return this;
    }
}
