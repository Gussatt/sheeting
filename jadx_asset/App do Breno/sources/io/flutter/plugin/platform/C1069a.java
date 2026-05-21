package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: io.flutter.plugin.platform.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1069a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public io.flutter.view.h f7980a;

    public boolean a(MotionEvent motionEvent, boolean z3) {
        io.flutter.view.h hVar = this.f7980a;
        if (hVar == null) {
            return false;
        }
        return hVar.M(motionEvent, z3);
    }

    public boolean b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.h hVar = this.f7980a;
        if (hVar == null) {
            return false;
        }
        return hVar.x(view, view2, accessibilityEvent);
    }

    public void c(io.flutter.view.h hVar) {
        this.f7980a = hVar;
    }
}
