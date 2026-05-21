package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends n {
    m h(long j4, q qVar);

    m i(j$.time.g gVar);

    m l(long j4, u uVar);

    default m c(long j4, u uVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j4, uVar);
    }
}
