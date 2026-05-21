package R1;

/* JADX INFO: loaded from: classes.dex */
public class i implements O1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3356a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3357b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O1.d f3358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f3359d;

    public i(f fVar) {
        this.f3359d = fVar;
    }

    public final void a() {
        if (this.f3356a) {
            throw new O1.c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3356a = true;
    }

    public void b(O1.d dVar, boolean z3) {
        this.f3356a = false;
        this.f3358c = dVar;
        this.f3357b = z3;
    }

    @Override // O1.h
    public O1.h c(String str) {
        a();
        this.f3359d.i(this.f3358c, str, this.f3357b);
        return this;
    }

    @Override // O1.h
    public O1.h d(boolean z3) {
        a();
        this.f3359d.o(this.f3358c, z3, this.f3357b);
        return this;
    }
}
