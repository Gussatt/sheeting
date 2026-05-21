package i2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class r implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList f7711d = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f7712e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f7713f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f7714g = new HashMap();

    public r(String str, int i4, int i5) {
        this.f7708a = str;
        this.f7709b = i4;
        this.f7710c = i5;
    }

    @Override // i2.p
    public synchronized void a() {
        for (int i4 = 0; i4 < this.f7709b; i4++) {
            final o oVarG = g(this.f7708a + i4, this.f7710c);
            oVarG.f(new Runnable() { // from class: i2.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7706m.i(oVarG);
                }
            });
            this.f7712e.add(oVarG);
        }
    }

    @Override // i2.p
    public synchronized void c() {
        try {
            Iterator it = this.f7712e.iterator();
            while (it.hasNext()) {
                ((o) it.next()).e();
            }
            Iterator it2 = this.f7713f.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // i2.p
    public synchronized void d(m mVar) {
        this.f7711d.add(mVar);
        Iterator it = new HashSet(this.f7712e).iterator();
        while (it.hasNext()) {
            j((o) it.next());
        }
    }

    public o g(String str, int i4) {
        return new o(str, i4);
    }

    public final synchronized m h(o oVar) {
        m mVar;
        o oVar2;
        try {
            ListIterator listIterator = this.f7711d.listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                mVar = (m) listIterator.next();
                oVar2 = mVar.a() != null ? (o) this.f7714g.get(mVar.a()) : null;
                if (oVar2 == null) {
                    break;
                }
            } while (oVar2 != oVar);
            listIterator.remove();
            return mVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(o oVar) {
        try {
            HashSet hashSet = new HashSet(this.f7712e);
            this.f7713f.remove(oVar);
            this.f7712e.add(oVar);
            if (!oVar.b() && oVar.c() != null) {
                this.f7714g.remove(oVar.c());
            }
            j(oVar);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j((o) it.next());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(o oVar) {
        try {
            m mVarH = h(oVar);
            if (mVarH != null) {
                this.f7713f.add(oVar);
                this.f7712e.remove(oVar);
                if (mVarH.a() != null) {
                    this.f7714g.put(mVarH.a(), oVar);
                }
                oVar.d(mVarH);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
