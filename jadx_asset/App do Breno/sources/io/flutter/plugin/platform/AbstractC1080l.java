package io.flutter.plugin.platform;

import android.content.Context;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: io.flutter.plugin.platform.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1080l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1615h f8027a;

    public AbstractC1080l(InterfaceC1615h interfaceC1615h) {
        this.f8027a = interfaceC1615h;
    }

    public abstract InterfaceC1079k a(Context context, int i4, Object obj);

    public final InterfaceC1615h b() {
        return this.f8027a;
    }
}
