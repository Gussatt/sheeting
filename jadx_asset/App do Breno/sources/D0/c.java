package D0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M0.a f845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M0.a f846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f847d;

    public c(Context context, M0.a aVar, M0.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f844a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f845b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f846c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f847d = str;
    }

    @Override // D0.h
    public Context b() {
        return this.f844a;
    }

    @Override // D0.h
    public String c() {
        return this.f847d;
    }

    @Override // D0.h
    public M0.a d() {
        return this.f846c;
    }

    @Override // D0.h
    public M0.a e() {
        return this.f845b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f844a.equals(hVar.b()) && this.f845b.equals(hVar.e()) && this.f846c.equals(hVar.d()) && this.f847d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f844a.hashCode() ^ 1000003) * 1000003) ^ this.f845b.hashCode()) * 1000003) ^ this.f846c.hashCode()) * 1000003) ^ this.f847d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f844a + ", wallClock=" + this.f845b + ", monotonicClock=" + this.f846c + ", backendName=" + this.f847d + "}";
    }
}
