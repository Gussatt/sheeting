package f3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, Y2.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f7282r = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CharSequence f7283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7287q;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public d(CharSequence charSequence) {
        X2.l.e(charSequence, "string");
        this.f7283m = charSequence;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7284n = 0;
        int i4 = this.f7286p;
        int i5 = this.f7285o;
        this.f7285o = this.f7287q + i4;
        return this.f7283m.subSequence(i5, i4).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i4;
        int i5;
        int i6 = this.f7284n;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f7287q < 0) {
            this.f7284n = 2;
            return false;
        }
        int length = this.f7283m.length();
        int length2 = this.f7283m.length();
        for (int i7 = this.f7285o; i7 < length2; i7++) {
            char cCharAt = this.f7283m.charAt(i7);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i4 = (cCharAt == '\r' && (i5 = i7 + 1) < this.f7283m.length() && this.f7283m.charAt(i5) == '\n') ? 2 : 1;
                length = i7;
                this.f7284n = 1;
                this.f7287q = i4;
                this.f7286p = length;
                return true;
            }
        }
        i4 = -1;
        this.f7284n = 1;
        this.f7287q = i4;
        this.f7286p = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
