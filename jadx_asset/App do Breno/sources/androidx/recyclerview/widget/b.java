package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0102b f5404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5405b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5406c = new ArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f5407a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f5408b;

        public void a(int i4) {
            if (i4 < 64) {
                this.f5407a &= ~(1 << i4);
                return;
            }
            a aVar = this.f5408b;
            if (aVar != null) {
                aVar.a(i4 - 64);
            }
        }

        public int b(int i4) {
            a aVar = this.f5408b;
            return aVar == null ? i4 >= 64 ? Long.bitCount(this.f5407a) : Long.bitCount(this.f5407a & ((1 << i4) - 1)) : i4 < 64 ? Long.bitCount(this.f5407a & ((1 << i4) - 1)) : aVar.b(i4 - 64) + Long.bitCount(this.f5407a);
        }

        public final void c() {
            if (this.f5408b == null) {
                this.f5408b = new a();
            }
        }

        public boolean d(int i4) {
            if (i4 < 64) {
                return (this.f5407a & (1 << i4)) != 0;
            }
            c();
            return this.f5408b.d(i4 - 64);
        }

        public boolean e(int i4) {
            if (i4 >= 64) {
                c();
                return this.f5408b.e(i4 - 64);
            }
            long j4 = 1 << i4;
            long j5 = this.f5407a;
            boolean z3 = (j5 & j4) != 0;
            long j6 = j5 & (~j4);
            this.f5407a = j6;
            long j7 = j4 - 1;
            this.f5407a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
            a aVar = this.f5408b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    g(63);
                }
                this.f5408b.e(0);
            }
            return z3;
        }

        public void f() {
            this.f5407a = 0L;
            a aVar = this.f5408b;
            if (aVar != null) {
                aVar.f();
            }
        }

        public void g(int i4) {
            if (i4 < 64) {
                this.f5407a |= 1 << i4;
            } else {
                c();
                this.f5408b.g(i4 - 64);
            }
        }

        public String toString() {
            if (this.f5408b == null) {
                return Long.toBinaryString(this.f5407a);
            }
            return this.f5408b.toString() + "xx" + Long.toBinaryString(this.f5407a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0102b {
        View a(int i4);

        RecyclerView.A b(View view);

        void c(int i4);

        void d(View view);

        int e();

        void f();

        int g(View view);
    }

    public b(InterfaceC0102b interfaceC0102b) {
        this.f5404a = interfaceC0102b;
    }

    public void a(int i4) {
        int iE = e(i4);
        this.f5405b.e(iE);
        this.f5404a.c(iE);
    }

    public View b(int i4) {
        if (this.f5406c.size() <= 0) {
            return null;
        }
        this.f5404a.b((View) this.f5406c.get(0));
        throw null;
    }

    public View c(int i4) {
        return this.f5404a.a(e(i4));
    }

    public int d() {
        return this.f5404a.e() - this.f5406c.size();
    }

    public final int e(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int iE = this.f5404a.e();
        int i5 = i4;
        while (i5 < iE) {
            int iB = i4 - (i5 - this.f5405b.b(i5));
            if (iB == 0) {
                while (this.f5405b.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += iB;
        }
        return -1;
    }

    public View f(int i4) {
        return this.f5404a.a(i4);
    }

    public int g() {
        return this.f5404a.e();
    }

    public int h(View view) {
        int iG = this.f5404a.g(view);
        if (iG == -1 || this.f5405b.d(iG)) {
            return -1;
        }
        return iG - this.f5405b.b(iG);
    }

    public void i() {
        this.f5405b.f();
        for (int size = this.f5406c.size() - 1; size >= 0; size--) {
            this.f5404a.d((View) this.f5406c.get(size));
            this.f5406c.remove(size);
        }
        this.f5404a.f();
    }

    public void j(View view) {
        int iG = this.f5404a.g(view);
        if (iG < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f5405b.d(iG)) {
            this.f5405b.a(iG);
            k(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean k(View view) {
        if (!this.f5406c.remove(view)) {
            return false;
        }
        this.f5404a.d(view);
        return true;
    }

    public String toString() {
        return this.f5405b.toString() + ", hidden list:" + this.f5406c.size();
    }
}
