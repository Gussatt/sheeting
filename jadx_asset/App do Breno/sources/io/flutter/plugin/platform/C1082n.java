package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.flutter.plugin.platform.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1082n implements InterfaceC1081m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8028a = new HashMap();

    @Override // io.flutter.plugin.platform.InterfaceC1081m
    public boolean a(String str, AbstractC1080l abstractC1080l) {
        if (this.f8028a.containsKey(str)) {
            return false;
        }
        this.f8028a.put(str, abstractC1080l);
        return true;
    }

    public AbstractC1080l b(String str) {
        return (AbstractC1080l) this.f8028a.get(str);
    }
}
