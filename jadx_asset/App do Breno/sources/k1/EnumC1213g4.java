package k1;

/* JADX INFO: renamed from: k1.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1213g4 {
    STORAGE(EnumC1221h4.AD_STORAGE, EnumC1221h4.ANALYTICS_STORAGE),
    DMA(EnumC1221h4.AD_USER_DATA);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final EnumC1221h4[] f9446m;

    EnumC1213g4(EnumC1221h4... enumC1221h4Arr) {
        this.f9446m = enumC1221h4Arr;
    }

    public final EnumC1221h4[] f() {
        return this.f9446m;
    }
}
