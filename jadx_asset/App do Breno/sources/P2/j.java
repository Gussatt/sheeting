package P2;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends a {
    public j(N2.e eVar) {
        super(eVar);
        if (eVar != null && eVar.b() != N2.j.f2823m) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // N2.e
    public N2.i b() {
        return N2.j.f2823m;
    }
}
