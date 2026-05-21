package io.flutter.plugin.platform;

import android.view.Surface;

/* JADX INFO: renamed from: io.flutter.plugin.platform.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1083o {
    long a();

    void b(int i4, int i5);

    int getHeight();

    Surface getSurface();

    int getWidth();

    void release();

    default void scheduleFrame() {
    }
}
