package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.plugin.platform.InterfaceC1085q;
import io.flutter.view.h;
import io.flutter.view.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l2.AbstractC1388b;
import v2.C1592a;

/* JADX INFO: loaded from: classes.dex */
public class h extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f8096A = ((g.SCROLL_RIGHT.f8170m | g.SCROLL_LEFT.f8170m) | g.SCROLL_UP.f8170m) | g.SCROLL_DOWN.f8170m;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f8097B = ((((((((((i.HAS_CHECKED_STATE.f8208m | i.IS_CHECKED.f8208m) | i.IS_SELECTED.f8208m) | i.IS_TEXT_FIELD.f8208m) | i.IS_FOCUSED.f8208m) | i.HAS_ENABLED_STATE.f8208m) | i.IS_ENABLED.f8208m) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f8208m) | i.HAS_TOGGLED_STATE.f8208m) | i.IS_TOGGLED.f8208m) | i.IS_FOCUSABLE.f8208m) | i.IS_SLIDER.f8208m;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static int f8098C = 267386881;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static int f8099D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static int f8100E = (g.DID_GAIN_ACCESSIBILITY_FOCUS.f8170m & g.DID_LOSE_ACCESSIBILITY_FOCUS.f8170m) & g.SHOW_ON_SCREEN.f8170m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f8101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1592a f8102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f8103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f8104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1085q f8105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f8106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f8107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f8108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f8109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f8110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f8111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f8113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f8114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f8115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f8116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f8117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8118r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f8119s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f8120t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8121u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8122v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1592a.b f8123w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AccessibilityManager.AccessibilityStateChangeListener f8124x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f8125y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ContentObserver f8126z;

    public class a implements C1592a.b {
        public a() {
        }

        @Override // v2.C1592a.b
        public void a(String str) {
            if (Build.VERSION.SDK_INT >= 36) {
                AbstractC1388b.g("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
            }
            h.this.f8101a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(String str) {
            h.this.a0(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            h.this.e0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void d(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            h.this.d0(byteBuffer, strArr);
        }

        @Override // v2.C1592a.b
        public void e(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent accessibilityEventI = h.this.I(0, 32);
            accessibilityEventI.getText().add(str);
            h.this.U(accessibilityEventI);
        }

        @Override // v2.C1592a.b
        public void f(int i4) {
            h.this.T(i4, 8);
        }

        @Override // v2.C1592a.b
        public void g(int i4) {
            h.this.T(i4, 2);
        }

        @Override // v2.C1592a.b
        public void h(int i4) {
            h.this.T(i4, 1);
        }
    }

    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z3) {
            if (h.this.f8122v) {
                return;
            }
            if (z3) {
                h.this.f8102b.g(h.this.f8123w);
                h.this.f8102b.e();
            } else {
                h.this.Y(false);
                h.this.f8102b.g(null);
                h.this.f8102b.d();
            }
            if (h.this.f8120t != null) {
                h.this.f8120t.a(z3, h.this.f8103c.isTouchExplorationEnabled());
            }
        }
    }

    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            onChange(z3, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3, Uri uri) {
            if (h.this.f8122v) {
                return;
            }
            if (Settings.Global.getFloat(h.this.f8106f, "transition_animation_scale", 1.0f) == 0.0f) {
                h.f(h.this, f.DISABLE_ANIMATIONS.f8142m);
            } else {
                h.e(h.this, ~f.DISABLE_ANIMATIONS.f8142m);
            }
            h.this.V();
        }
    }

    public class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f8130a;

        public d(AccessibilityManager accessibilityManager) {
            this.f8130a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z3) {
            if (h.this.f8122v) {
                return;
            }
            if (!z3) {
                h.this.Y(false);
                h.this.N();
            }
            if (h.this.f8120t != null) {
                h.this.f8120t.a(this.f8130a.isEnabled(), z3);
            }
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8132a;

        static {
            int[] iArr = new int[i.d.values().length];
            f8132a = iArr;
            try {
                iArr[i.d.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8132a[i.d.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64),
        NO_ANNOUNCE(128);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f8142m;

        f(int i4) {
            this.f8142m = i4;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304),
        SCROLL_TO_OFFSET(8388608),
        EXPAND(16777216),
        COLLAPSE(33554432);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f8170m;

        g(int i4) {
            this.f8170m = i4;
        }
    }

    /* JADX INFO: renamed from: io.flutter.view.h$h, reason: collision with other inner class name */
    public static class C0129h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8171a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8172b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8173c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8175e;
    }

    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728),
        HAS_SELECTED_STATE(268435456),
        HAS_REQUIRED_STATE(536870912),
        IS_REQUIRED(1073741824);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f8208m;

        i(int i4) {
            this.f8208m = i4;
        }
    }

    public interface j {
        void a(boolean z3, boolean z4);
    }

    public static class k {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public String f8209A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public String f8210B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f8211C;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public l f8213E;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public long f8215G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f8216H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f8217I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f8218J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public float f8219K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f8220L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public float f8221M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public String f8222N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public String f8223O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f8224P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public float f8225Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public float f8226R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public float f8227S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public float[] f8228T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public k f8229U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public List f8232X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public C0129h f8233Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public C0129h f8234Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f8235a;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public float[] f8238b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f8239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8241d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public float[] f8242d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8243e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public Rect f8244e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8245f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8246g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8247h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8248i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f8249j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8250k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f8251l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f8252m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f8253n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f8254o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f8255p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List f8256q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f8257r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f8258s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public String f8259t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public List f8260u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public String f8261v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public List f8262w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f8263x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public List f8264y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f8265z;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8237b = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f8212D = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean f8214F = false;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public List f8230V = new ArrayList();

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public List f8231W = new ArrayList();

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f8236a0 = true;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public boolean f8240c0 = true;

        public k(h hVar) {
            this.f8235a = hVar;
        }

        public static boolean B0(k kVar, I2.d dVar) {
            return (kVar == null || kVar.j0(dVar) == null) ? false : true;
        }

        public static /* synthetic */ int n(k kVar, int i4) {
            int i5 = kVar.f8247h + i4;
            kVar.f8247h = i5;
            return i5;
        }

        public static /* synthetic */ int o(k kVar, int i4) {
            int i5 = kVar.f8247h - i4;
            kVar.f8247h = i5;
            return i5;
        }

        public final float A0(float f4, float f5, float f6, float f7) {
            return Math.min(f4, Math.min(f5, Math.min(f6, f7)));
        }

        public final void C0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f4 = fArr[3];
            fArr[0] = fArr[0] / f4;
            fArr[1] = fArr[1] / f4;
            fArr[2] = fArr[2] / f4;
            fArr[3] = 0.0f;
        }

        public final void D0(float[] fArr, Set set, boolean z3) {
            set.add(this);
            if (this.f8240c0) {
                z3 = true;
            }
            if (z3) {
                if (this.f8242d0 == null) {
                    this.f8242d0 = new float[16];
                }
                if (this.f8228T == null) {
                    this.f8228T = new float[16];
                }
                Matrix.multiplyMM(this.f8242d0, 0, fArr, 0, this.f8228T, 0);
                float[] fArr2 = {this.f8224P, this.f8225Q, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                C0(fArr3, this.f8242d0, fArr2);
                fArr2[0] = this.f8226R;
                fArr2[1] = this.f8225Q;
                C0(fArr4, this.f8242d0, fArr2);
                fArr2[0] = this.f8226R;
                fArr2[1] = this.f8227S;
                C0(fArr5, this.f8242d0, fArr2);
                fArr2[0] = this.f8224P;
                fArr2[1] = this.f8227S;
                C0(fArr6, this.f8242d0, fArr2);
                if (this.f8244e0 == null) {
                    this.f8244e0 = new Rect();
                }
                this.f8244e0.set(Math.round(A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(z0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(z0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f8240c0 = false;
            }
            int i4 = -1;
            for (k kVar : this.f8230V) {
                kVar.f8212D = i4;
                i4 = kVar.f8237b;
                kVar.D0(this.f8242d0, set, z3);
            }
        }

        public final void E0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.f8214F = true;
            this.f8222N = this.f8257r;
            this.f8223O = this.f8255p;
            this.f8215G = this.f8239c;
            this.f8216H = this.f8241d;
            this.f8217I = this.f8246g;
            this.f8218J = this.f8247h;
            this.f8219K = this.f8251l;
            this.f8220L = this.f8252m;
            this.f8221M = this.f8253n;
            this.f8239c = byteBuffer.getLong();
            this.f8241d = byteBuffer.getInt();
            this.f8243e = byteBuffer.getInt();
            this.f8245f = byteBuffer.getInt();
            this.f8246g = byteBuffer.getInt();
            this.f8247h = byteBuffer.getInt();
            this.f8248i = byteBuffer.getInt();
            this.f8249j = byteBuffer.getInt();
            this.f8250k = byteBuffer.getInt();
            this.f8251l = byteBuffer.getFloat();
            this.f8252m = byteBuffer.getFloat();
            this.f8253n = byteBuffer.getFloat();
            this.f8254o = h.C(byteBuffer, strArr);
            this.f8255p = h.C(byteBuffer, strArr);
            this.f8256q = p0(byteBuffer, byteBufferArr);
            this.f8257r = h.C(byteBuffer, strArr);
            this.f8258s = p0(byteBuffer, byteBufferArr);
            this.f8259t = h.C(byteBuffer, strArr);
            this.f8260u = p0(byteBuffer, byteBufferArr);
            this.f8261v = h.C(byteBuffer, strArr);
            this.f8262w = p0(byteBuffer, byteBufferArr);
            this.f8263x = h.C(byteBuffer, strArr);
            this.f8264y = p0(byteBuffer, byteBufferArr);
            this.f8265z = h.C(byteBuffer, strArr);
            this.f8209A = h.C(byteBuffer, strArr);
            this.f8210B = h.C(byteBuffer, strArr);
            this.f8211C = byteBuffer.getInt();
            this.f8213E = l.f(byteBuffer.getInt());
            this.f8224P = byteBuffer.getFloat();
            this.f8225Q = byteBuffer.getFloat();
            this.f8226R = byteBuffer.getFloat();
            this.f8227S = byteBuffer.getFloat();
            if (this.f8228T == null) {
                this.f8228T = new float[16];
            }
            for (int i4 = 0; i4 < 16; i4++) {
                this.f8228T[i4] = byteBuffer.getFloat();
            }
            this.f8236a0 = true;
            this.f8240c0 = true;
            int i5 = byteBuffer.getInt();
            this.f8230V.clear();
            this.f8231W.clear();
            for (int i6 = 0; i6 < i5; i6++) {
                k kVarA = this.f8235a.A(byteBuffer.getInt());
                kVarA.f8229U = this;
                this.f8230V.add(kVarA);
            }
            for (int i7 = 0; i7 < i5; i7++) {
                k kVarA2 = this.f8235a.A(byteBuffer.getInt());
                kVarA2.f8229U = this;
                this.f8231W.add(kVarA2);
            }
            int i8 = byteBuffer.getInt();
            if (i8 == 0) {
                this.f8232X = null;
                return;
            }
            List list = this.f8232X;
            if (list == null) {
                this.f8232X = new ArrayList(i8);
            } else {
                list.clear();
            }
            for (int i9 = 0; i9 < i8; i9++) {
                C0129h c0129hZ = this.f8235a.z(byteBuffer.getInt());
                if (c0129hZ.f8173c == g.TAP.f8170m) {
                    this.f8233Y = c0129hZ;
                } else if (c0129hZ.f8173c == g.LONG_PRESS.f8170m) {
                    this.f8234Z = c0129hZ;
                } else {
                    this.f8232X.add(c0129hZ);
                }
                this.f8232X.add(c0129hZ);
            }
        }

        public final void f0(List list) {
            if (w0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator it = this.f8230V.iterator();
            while (it.hasNext()) {
                ((k) it.next()).f0(list);
            }
        }

        public final boolean g0() {
            String str = this.f8255p;
            if (str == null && this.f8223O == null) {
                return false;
            }
            return str == null || !str.equals(this.f8223O);
        }

        public final boolean h0() {
            return (Float.isNaN(this.f8251l) || Float.isNaN(this.f8219K) || this.f8219K == this.f8251l) ? false : true;
        }

        public final void i0() {
            if (this.f8236a0) {
                this.f8236a0 = false;
                if (this.f8238b0 == null) {
                    this.f8238b0 = new float[16];
                }
                if (Matrix.invertM(this.f8238b0, 0, this.f8228T, 0)) {
                    return;
                }
                Arrays.fill(this.f8238b0, 0.0f);
            }
        }

        public final k j0(I2.d dVar) {
            for (k kVar = this.f8229U; kVar != null; kVar = kVar.f8229U) {
                if (dVar.test(kVar)) {
                    return kVar;
                }
            }
            return null;
        }

        public final String k0() {
            String str = this.f8210B;
            return (str == null || str.isEmpty()) ? this.f8235a.f8113m : this.f8210B;
        }

        public final Rect l0() {
            return this.f8244e0;
        }

        public final CharSequence m0() {
            return new io.flutter.view.i().c(this.f8263x).a(this.f8264y).b(k0()).e();
        }

        public final CharSequence n0() {
            return new io.flutter.view.i().c(this.f8255p).a(this.f8256q).d(this.f8209A).b(k0()).e();
        }

        public final String o0() {
            String str;
            if (w0(i.NAMES_ROUTE) && (str = this.f8255p) != null && !str.isEmpty()) {
                return this.f8255p;
            }
            Iterator it = this.f8230V.iterator();
            while (it.hasNext()) {
                String strO0 = ((k) it.next()).o0();
                if (strO0 != null && !strO0.isEmpty()) {
                    return strO0;
                }
            }
            return null;
        }

        public final List p0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i4 = byteBuffer.getInt();
            if (i4 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = byteBuffer.getInt();
                int i7 = byteBuffer.getInt();
                i.d dVar = i.d.values()[byteBuffer.getInt()];
                int i8 = e.f8132a[dVar.ordinal()];
                if (i8 == 1) {
                    byteBuffer.getInt();
                    i.b bVar = new i.b();
                    bVar.f8275a = i6;
                    bVar.f8276b = i7;
                    bVar.f8277c = dVar;
                    arrayList.add(bVar);
                } else if (i8 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    i.a aVar = new i.a();
                    aVar.f8275a = i6;
                    aVar.f8276b = i7;
                    aVar.f8277c = dVar;
                    aVar.f8274d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        public final CharSequence q0() {
            CharSequence[] charSequenceArr = {n0(), m0()};
            CharSequence charSequenceConcat = null;
            for (int i4 = 0; i4 < 2; i4++) {
                CharSequence charSequence = charSequenceArr[i4];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        public final CharSequence r0() {
            return new io.flutter.view.i().c(this.f8257r).a(this.f8258s).b(k0()).e();
        }

        public final CharSequence s0() {
            CharSequence[] charSequenceArr = {r0(), n0(), m0()};
            CharSequence charSequenceConcat = null;
            for (int i4 = 0; i4 < 3; i4++) {
                CharSequence charSequence = charSequenceArr[i4];
                if (charSequence != null && charSequence.length() > 0) {
                    charSequenceConcat = (charSequenceConcat == null || charSequenceConcat.length() == 0) ? charSequence : TextUtils.concat(charSequenceConcat, ", ", charSequence);
                }
            }
            return charSequenceConcat;
        }

        public final boolean t0(g gVar) {
            return (gVar.f8170m & this.f8216H) != 0;
        }

        public final boolean u0(i iVar) {
            return (this.f8215G & ((long) iVar.f8208m)) != 0;
        }

        public final boolean v0(g gVar) {
            return (gVar.f8170m & this.f8241d) != 0;
        }

        public final boolean w0(i iVar) {
            return (this.f8239c & ((long) iVar.f8208m)) != 0;
        }

        public final k x0(float[] fArr, boolean z3) {
            float f4 = fArr[3];
            boolean z4 = false;
            float f5 = fArr[0] / f4;
            float f6 = fArr[1] / f4;
            if (f5 < this.f8224P || f5 >= this.f8226R || f6 < this.f8225Q || f6 >= this.f8227S) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (k kVar : this.f8231W) {
                if (!kVar.w0(i.IS_HIDDEN)) {
                    kVar.i0();
                    float[] fArr3 = fArr;
                    Matrix.multiplyMV(fArr2, 0, kVar.f8238b0, 0, fArr3, 0);
                    k kVarX0 = kVar.x0(fArr2, z3);
                    if (kVarX0 != null) {
                        return kVarX0;
                    }
                    fArr = fArr3;
                }
            }
            if (z3 && this.f8248i != -1) {
                z4 = true;
            }
            if (y0() || z4) {
                return this;
            }
            return null;
        }

        public final boolean y0() {
            String str;
            String str2;
            String str3;
            if (w0(i.SCOPES_ROUTE)) {
                return false;
            }
            return (!w0(i.IS_FOCUSABLE) && (this.f8241d & (~h.f8096A)) == 0 && (this.f8239c & ((long) h.f8097B)) == 0 && ((str = this.f8255p) == null || str.isEmpty()) && (((str2 = this.f8257r) == null || str2.isEmpty()) && ((str3 = this.f8263x) == null || str3.isEmpty()))) ? false : true;
        }

        public final float z0(float f4, float f5, float f6, float f7) {
            return Math.max(f4, Math.max(f5, Math.max(f6, f7)));
        }
    }

    public enum l {
        UNKNOWN,
        LTR,
        RTL;

        public static l f(int i4) {
            return i4 != 1 ? i4 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public h(View view, C1592a c1592a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, InterfaceC1085q interfaceC1085q) {
        this(view, c1592a, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), interfaceC1085q);
    }

    public static String C(ByteBuffer byteBuffer, String[] strArr) {
        int i4 = byteBuffer.getInt();
        if (i4 == f8099D) {
            return null;
        }
        return strArr[i4];
    }

    public static /* synthetic */ boolean a(k kVar, k kVar2) {
        return kVar2 == kVar;
    }

    public static /* synthetic */ int e(h hVar, int i4) {
        int i5 = i4 & hVar.f8112l;
        hVar.f8112l = i5;
        return i5;
    }

    public static /* synthetic */ int f(h hVar, int i4) {
        int i5 = i4 | hVar.f8112l;
        hVar.f8112l = i5;
        return i5;
    }

    public final k A(int i4) {
        k kVar = (k) this.f8107g.get(Integer.valueOf(i4));
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        kVar2.f8237b = i4;
        this.f8107g.put(Integer.valueOf(i4), kVar2);
        return kVar2;
    }

    public final k B() {
        return (k) this.f8107g.get(0);
    }

    public final void D(float f4, float f5, boolean z3) {
        k kVarX0;
        if (this.f8107g.isEmpty() || (kVarX0 = B().x0(new float[]{f4, f5, 0.0f, 1.0f}, z3)) == this.f8116p) {
            return;
        }
        if (kVarX0 != null) {
            T(kVarX0.f8237b, 128);
        }
        k kVar = this.f8116p;
        if (kVar != null) {
            T(kVar.f8237b, 256);
        }
        this.f8116p = kVarX0;
    }

    public boolean E() {
        return this.f8103c.isEnabled();
    }

    public final boolean F(k kVar) {
        if (kVar.w0(i.SCOPES_ROUTE)) {
            return false;
        }
        return (kVar.s0() == null && (kVar.f8241d & (~f8100E)) == 0) ? false : true;
    }

    public boolean G() {
        return this.f8103c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent H(int i4) {
        return AccessibilityEvent.obtain(i4);
    }

    public final AccessibilityEvent I(int i4, int i5) {
        AccessibilityEvent accessibilityEventH = H(i5);
        accessibilityEventH.setPackageName(this.f8101a.getContext().getPackageName());
        accessibilityEventH.setSource(this.f8101a, i4);
        return accessibilityEventH;
    }

    public AccessibilityNodeInfo J(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo K(View view, int i4) {
        return AccessibilityNodeInfo.obtain(view, i4);
    }

    public boolean L(MotionEvent motionEvent) {
        return M(motionEvent, false);
    }

    public boolean M(MotionEvent motionEvent, boolean z3) {
        if (!this.f8103c.isTouchExplorationEnabled() || this.f8107g.isEmpty()) {
            return false;
        }
        k kVarX0 = B().x0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z3);
        if (kVarX0 != null && kVarX0.f8248i != -1) {
            if (z3) {
                return false;
            }
            return this.f8104d.onAccessibilityHoverEvent(kVarX0.f8237b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            D(motionEvent.getX(), motionEvent.getY(), z3);
        } else {
            if (motionEvent.getAction() != 10) {
                AbstractC1388b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            N();
        }
        return true;
    }

    public final void N() {
        k kVar = this.f8116p;
        if (kVar != null) {
            T(kVar.f8237b, 256);
            this.f8116p = null;
        }
    }

    public final void O(k kVar) {
        String strO0 = kVar.o0();
        if (strO0 == null) {
            strO0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            X(strO0);
            return;
        }
        AccessibilityEvent accessibilityEventI = I(kVar.f8237b, 32);
        accessibilityEventI.getText().add(strO0);
        U(accessibilityEventI);
    }

    public final boolean P(k kVar, int i4, Bundle bundle, boolean z3) {
        int i5 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i6 = kVar.f8246g;
        int i7 = kVar.f8247h;
        R(kVar, i5, z3, z4);
        if (i6 != kVar.f8246g || i7 != kVar.f8247h) {
            String str = kVar.f8257r != null ? kVar.f8257r : "";
            AccessibilityEvent accessibilityEventI = I(kVar.f8237b, 8192);
            accessibilityEventI.getText().add(str);
            accessibilityEventI.setFromIndex(kVar.f8246g);
            accessibilityEventI.setToIndex(kVar.f8247h);
            accessibilityEventI.setItemCount(str.length());
            U(accessibilityEventI);
        }
        if (i5 == 1) {
            if (z3) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (kVar.v0(gVar)) {
                    this.f8102b.c(i4, gVar, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (z3) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!kVar.v0(gVar2)) {
                return false;
            }
            this.f8102b.c(i4, gVar2, Boolean.valueOf(z4));
            return true;
        }
        if (i5 != 2) {
            return i5 == 4 || i5 == 8 || i5 == 16;
        }
        if (z3) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (kVar.v0(gVar3)) {
                this.f8102b.c(i4, gVar3, Boolean.valueOf(z4));
                return true;
            }
        }
        if (z3) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!kVar.v0(gVar4)) {
            return false;
        }
        this.f8102b.c(i4, gVar4, Boolean.valueOf(z4));
        return true;
    }

    public final boolean Q(k kVar, int i4, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f8102b.c(i4, g.SET_TEXT, string);
        kVar.f8257r = string;
        kVar.f8258s = null;
        return true;
    }

    public final void R(k kVar, int i4, boolean z3, boolean z4) {
        if (kVar.f8247h < 0 || kVar.f8246g < 0) {
            return;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 == 8 || i4 == 16) {
                        if (z3) {
                            kVar.f8247h = kVar.f8257r.length();
                        } else {
                            kVar.f8247h = 0;
                        }
                    }
                } else if (z3 && kVar.f8247h < kVar.f8257r.length()) {
                    Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(kVar.f8257r.substring(kVar.f8247h));
                    if (matcher.find()) {
                        k.n(kVar, matcher.start(1));
                    } else {
                        kVar.f8247h = kVar.f8257r.length();
                    }
                } else if (!z3 && kVar.f8247h > 0) {
                    Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(kVar.f8257r.substring(0, kVar.f8247h));
                    if (matcher2.find()) {
                        kVar.f8247h = matcher2.start(1);
                    } else {
                        kVar.f8247h = 0;
                    }
                }
            } else if (z3 && kVar.f8247h < kVar.f8257r.length()) {
                Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(kVar.f8257r.substring(kVar.f8247h));
                matcher3.find();
                if (matcher3.find()) {
                    k.n(kVar, matcher3.start(1));
                } else {
                    kVar.f8247h = kVar.f8257r.length();
                }
            } else if (!z3 && kVar.f8247h > 0) {
                Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(kVar.f8257r.substring(0, kVar.f8247h));
                if (matcher4.find()) {
                    kVar.f8247h = matcher4.start(1);
                }
            }
        } else if (z3 && kVar.f8247h < kVar.f8257r.length()) {
            k.n(kVar, 1);
        } else if (!z3 && kVar.f8247h > 0) {
            k.o(kVar, 1);
        }
        if (z4) {
            return;
        }
        kVar.f8246g = kVar.f8247h;
    }

    public void S() {
        this.f8122v = true;
        this.f8105e.l();
        b0(null);
        this.f8103c.removeAccessibilityStateChangeListener(this.f8124x);
        this.f8103c.removeTouchExplorationStateChangeListener(this.f8125y);
        this.f8106f.unregisterContentObserver(this.f8126z);
        this.f8102b.g(null);
    }

    public void T(int i4, int i5) {
        if (this.f8103c.isEnabled()) {
            U(I(i4, i5));
        }
    }

    public final void U(AccessibilityEvent accessibilityEvent) {
        if (this.f8103c.isEnabled()) {
            this.f8101a.getParent().requestSendAccessibilityEvent(this.f8101a, accessibilityEvent);
        }
    }

    public final void V() {
        this.f8102b.f(this.f8112l);
    }

    public final void W(int i4) {
        AccessibilityEvent accessibilityEventI = I(i4, 2048);
        accessibilityEventI.setContentChangeTypes(1);
        U(accessibilityEventI);
    }

    public final void X(String str) {
        this.f8101a.setAccessibilityPaneTitle(str);
    }

    public final void Y(boolean z3) {
        if (this.f8121u == z3) {
            return;
        }
        this.f8121u = z3;
        if (z3) {
            this.f8112l |= f.ACCESSIBLE_NAVIGATION.f8142m;
        } else {
            this.f8112l &= ~f.ACCESSIBLE_NAVIGATION.f8142m;
        }
        V();
    }

    public final void Z() {
        View view = this.f8101a;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i4 = this.f8101a.getResources().getConfiguration().fontWeightAdjustment;
        if (i4 == Integer.MAX_VALUE || i4 < 300) {
            this.f8112l &= ~f.BOLD_TEXT.f8142m;
        } else {
            this.f8112l |= f.BOLD_TEXT.f8142m;
        }
        V();
    }

    public void a0(String str) {
        this.f8113m = str;
    }

    public void b0(j jVar) {
        this.f8120t = jVar;
    }

    public final boolean c0(final k kVar) {
        if (kVar.f8249j > 0) {
            return k.B0(this.f8109i, new I2.d() { // from class: io.flutter.view.f
                @Override // I2.d
                public final boolean test(Object obj) {
                    return h.a(kVar, (h.k) obj);
                }
            }) || !k.B0(this.f8109i, new I2.d() { // from class: io.flutter.view.g
                @Override // I2.d
                public final boolean test(Object obj) {
                    return ((h.k) obj).w0(h.i.HAS_IMPLICIT_SCROLLING);
                }
            });
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        int i5;
        Y(true);
        if (i4 >= 65536) {
            return this.f8104d.createAccessibilityNodeInfo(i4);
        }
        if (i4 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoJ = J(this.f8101a);
            this.f8101a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoJ);
            if (this.f8107g.containsKey(0)) {
                accessibilityNodeInfoJ.addChild(this.f8101a, 0);
            }
            accessibilityNodeInfoJ.setImportantForAccessibility(false);
            return accessibilityNodeInfoJ;
        }
        k kVar = (k) this.f8107g.get(Integer.valueOf(i4));
        if (kVar == null) {
            return null;
        }
        if (kVar.f8248i != -1 && this.f8105e.j(kVar.f8248i)) {
            View viewK = this.f8105e.k(kVar.f8248i);
            if (viewK == null) {
                return null;
            }
            return this.f8104d.getRootNode(viewK, kVar.f8237b, kVar.l0());
        }
        AccessibilityNodeInfo accessibilityNodeInfoK = K(this.f8101a, i4);
        int i6 = Build.VERSION.SDK_INT;
        accessibilityNodeInfoK.setImportantForAccessibility(F(kVar));
        accessibilityNodeInfoK.setViewIdResourceName("");
        if (kVar.f8254o != null) {
            accessibilityNodeInfoK.setViewIdResourceName(kVar.f8254o);
        }
        accessibilityNodeInfoK.setPackageName(this.f8101a.getContext().getPackageName());
        accessibilityNodeInfoK.setClassName("android.view.View");
        accessibilityNodeInfoK.setSource(this.f8101a, i4);
        accessibilityNodeInfoK.setFocusable(kVar.y0());
        k kVar2 = this.f8114n;
        if (kVar2 != null) {
            accessibilityNodeInfoK.setFocused(kVar2.f8237b == i4);
        }
        k kVar3 = this.f8109i;
        if (kVar3 != null) {
            accessibilityNodeInfoK.setAccessibilityFocused(kVar3.f8237b == i4);
        }
        i iVar = i.IS_TEXT_FIELD;
        if (kVar.w0(iVar)) {
            accessibilityNodeInfoK.setPassword(kVar.w0(i.IS_OBSCURED));
            if (!kVar.w0(i.IS_READ_ONLY)) {
                accessibilityNodeInfoK.setClassName("android.widget.EditText");
            }
            accessibilityNodeInfoK.setEditable(!kVar.w0(r9));
            if (kVar.f8246g != -1 && kVar.f8247h != -1) {
                accessibilityNodeInfoK.setTextSelection(kVar.f8246g, kVar.f8247h);
            }
            k kVar4 = this.f8109i;
            if (kVar4 != null && kVar4.f8237b == i4) {
                accessibilityNodeInfoK.setLiveRegion(1);
            }
            if (kVar.v0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                accessibilityNodeInfoK.addAction(256);
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (kVar.v0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                accessibilityNodeInfoK.addAction(512);
                i5 = 1;
            }
            if (kVar.v0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                accessibilityNodeInfoK.addAction(256);
                i5 |= 2;
            }
            if (kVar.v0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                accessibilityNodeInfoK.addAction(512);
                i5 |= 2;
            }
            accessibilityNodeInfoK.setMovementGranularities(i5);
            if (kVar.f8243e >= 0) {
                int length = kVar.f8257r == null ? 0 : kVar.f8257r.length();
                int unused = kVar.f8245f;
                int unused2 = kVar.f8243e;
                accessibilityNodeInfoK.setMaxTextLength((length - kVar.f8245f) + kVar.f8243e);
            }
        }
        if (kVar.v0(g.SET_SELECTION)) {
            accessibilityNodeInfoK.addAction(131072);
        }
        if (kVar.v0(g.COPY)) {
            accessibilityNodeInfoK.addAction(16384);
        }
        if (kVar.v0(g.CUT)) {
            accessibilityNodeInfoK.addAction(65536);
        }
        if (kVar.v0(g.PASTE)) {
            accessibilityNodeInfoK.addAction(32768);
        }
        if (kVar.v0(g.SET_TEXT)) {
            accessibilityNodeInfoK.addAction(2097152);
        }
        if (kVar.w0(i.IS_BUTTON)) {
            accessibilityNodeInfoK.setClassName("android.widget.Button");
        }
        if (kVar.w0(i.IS_IMAGE)) {
            accessibilityNodeInfoK.setClassName("android.widget.ImageView");
        }
        if (kVar.v0(g.DISMISS)) {
            accessibilityNodeInfoK.setDismissable(true);
            accessibilityNodeInfoK.addAction(1048576);
        }
        if (kVar.f8229U != null) {
            accessibilityNodeInfoK.setParent(this.f8101a, kVar.f8229U.f8237b);
        } else {
            accessibilityNodeInfoK.setParent(this.f8101a);
        }
        if (kVar.f8212D != -1) {
            accessibilityNodeInfoK.setTraversalAfter(this.f8101a, kVar.f8212D);
        }
        Rect rectL0 = kVar.l0();
        if (kVar.f8229U != null) {
            Rect rectL02 = kVar.f8229U.l0();
            Rect rect = new Rect(rectL0);
            rect.offset(-rectL02.left, -rectL02.top);
            accessibilityNodeInfoK.setBoundsInParent(rect);
        } else {
            accessibilityNodeInfoK.setBoundsInParent(rectL0);
        }
        accessibilityNodeInfoK.setBoundsInScreen(y(rectL0));
        accessibilityNodeInfoK.setVisibleToUser(true);
        accessibilityNodeInfoK.setEnabled(!kVar.w0(i.HAS_ENABLED_STATE) || kVar.w0(i.IS_ENABLED));
        if (kVar.v0(g.TAP)) {
            if (kVar.f8233Y != null) {
                accessibilityNodeInfoK.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, kVar.f8233Y.f8175e));
                accessibilityNodeInfoK.setClickable(true);
            } else {
                accessibilityNodeInfoK.addAction(16);
                accessibilityNodeInfoK.setClickable(true);
            }
        } else if (kVar.w0(i.IS_SLIDER)) {
            accessibilityNodeInfoK.addAction(16);
            accessibilityNodeInfoK.setClickable(true);
        }
        if (kVar.v0(g.LONG_PRESS)) {
            if (kVar.f8234Z != null) {
                accessibilityNodeInfoK.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, kVar.f8234Z.f8175e));
                accessibilityNodeInfoK.setLongClickable(true);
            } else {
                accessibilityNodeInfoK.addAction(32);
                accessibilityNodeInfoK.setLongClickable(true);
            }
        }
        g gVar = g.SCROLL_LEFT;
        if (kVar.v0(gVar) || kVar.v0(g.SCROLL_UP) || kVar.v0(g.SCROLL_RIGHT) || kVar.v0(g.SCROLL_DOWN)) {
            accessibilityNodeInfoK.setScrollable(true);
            if (kVar.w0(i.HAS_IMPLICIT_SCROLLING)) {
                if (kVar.v0(gVar) || kVar.v0(g.SCROLL_RIGHT)) {
                    if (c0(kVar)) {
                        accessibilityNodeInfoK.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, kVar.f8249j, false));
                    } else {
                        accessibilityNodeInfoK.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (c0(kVar)) {
                    accessibilityNodeInfoK.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(kVar.f8249j, 0, false));
                } else {
                    accessibilityNodeInfoK.setClassName("android.widget.ScrollView");
                }
            }
            if (kVar.v0(gVar) || kVar.v0(g.SCROLL_UP)) {
                accessibilityNodeInfoK.addAction(4096);
            }
            if (kVar.v0(g.SCROLL_RIGHT) || kVar.v0(g.SCROLL_DOWN)) {
                accessibilityNodeInfoK.addAction(8192);
            }
        }
        g gVar2 = g.INCREASE;
        if (kVar.v0(gVar2) || kVar.v0(g.DECREASE)) {
            accessibilityNodeInfoK.setClassName("android.widget.SeekBar");
            if (kVar.v0(gVar2)) {
                accessibilityNodeInfoK.addAction(4096);
            }
            if (kVar.v0(g.DECREASE)) {
                accessibilityNodeInfoK.addAction(8192);
            }
        }
        if (kVar.w0(i.IS_LIVE_REGION)) {
            accessibilityNodeInfoK.setLiveRegion(1);
        }
        if (kVar.w0(iVar)) {
            accessibilityNodeInfoK.setText(kVar.r0());
            if (i6 >= 28) {
                accessibilityNodeInfoK.setHintText(kVar.q0());
            }
        } else if (!kVar.w0(i.SCOPES_ROUTE)) {
            CharSequence charSequenceS0 = kVar.s0();
            if (i6 < 28 && kVar.f8265z != null) {
                charSequenceS0 = ((Object) (charSequenceS0 != null ? charSequenceS0 : "")) + "\n" + kVar.f8265z;
            }
            if (charSequenceS0 != null) {
                accessibilityNodeInfoK.setContentDescription(charSequenceS0);
            }
        }
        if (i6 >= 28 && kVar.f8265z != null) {
            accessibilityNodeInfoK.setTooltipText(kVar.f8265z);
            if (kVar.s0() == null) {
                accessibilityNodeInfoK.setContentDescription(kVar.f8265z);
            }
        }
        boolean zW0 = kVar.w0(i.HAS_CHECKED_STATE);
        boolean zW02 = kVar.w0(i.HAS_TOGGLED_STATE);
        accessibilityNodeInfoK.setCheckable(zW0 || zW02);
        if (zW0) {
            accessibilityNodeInfoK.setChecked(kVar.w0(i.IS_CHECKED));
            if (kVar.w0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                accessibilityNodeInfoK.setClassName("android.widget.RadioButton");
            } else {
                accessibilityNodeInfoK.setClassName("android.widget.CheckBox");
            }
        } else if (zW02) {
            accessibilityNodeInfoK.setChecked(kVar.w0(i.IS_TOGGLED));
            accessibilityNodeInfoK.setClassName("android.widget.Switch");
        }
        accessibilityNodeInfoK.setSelected(kVar.w0(i.IS_SELECTED));
        if (i6 >= 36 && kVar.w0(i.HAS_EXPANDED_STATE)) {
            accessibilityNodeInfoK.setExpandedState(kVar.w0(i.IS_EXPANDED) ? 3 : 1);
            if (kVar.v0(g.EXPAND)) {
                accessibilityNodeInfoK.addAction(262144);
            }
            if (kVar.v0(g.COLLAPSE)) {
                accessibilityNodeInfoK.addAction(524288);
            }
        }
        if (i6 >= 28) {
            accessibilityNodeInfoK.setHeading(kVar.f8211C > 0);
        }
        k kVar5 = this.f8109i;
        if (kVar5 == null || kVar5.f8237b != i4) {
            accessibilityNodeInfoK.addAction(64);
        } else {
            accessibilityNodeInfoK.addAction(128);
        }
        if (kVar.f8232X != null) {
            for (C0129h c0129h : kVar.f8232X) {
                accessibilityNodeInfoK.addAction(new AccessibilityNodeInfo.AccessibilityAction(c0129h.f8171a, c0129h.f8174d));
            }
        }
        for (k kVar6 : kVar.f8230V) {
            if (!kVar6.w0(i.IS_HIDDEN)) {
                if (kVar6.f8248i != -1) {
                    View viewK2 = this.f8105e.k(kVar6.f8248i);
                    if (!this.f8105e.j(kVar6.f8248i)) {
                        viewK2.setImportantForAccessibility(0);
                        accessibilityNodeInfoK.addChild(viewK2);
                    }
                }
                accessibilityNodeInfoK.addChild(this.f8101a, kVar6.f8237b);
            }
        }
        return accessibilityNodeInfoK;
    }

    public void d0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            C0129h c0129hZ = z(byteBuffer.getInt());
            c0129hZ.f8173c = byteBuffer.getInt();
            c0129hZ.f8174d = C(byteBuffer, strArr);
            c0129hZ.f8175e = C(byteBuffer, strArr);
        }
    }

    public void e0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        k kVar;
        k kVar2;
        float f4;
        float f5;
        View viewK;
        ArrayList<k> arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            k kVarA = A(byteBuffer.getInt());
            kVarA.E0(byteBuffer, strArr, byteBufferArr);
            if (!kVarA.w0(i.IS_HIDDEN)) {
                if (kVarA.w0(i.IS_FOCUSED)) {
                    this.f8114n = kVarA;
                }
                if (kVarA.f8214F) {
                    arrayList.add(kVarA);
                }
                if (kVarA.f8248i != -1 && !this.f8105e.j(kVarA.f8248i) && (viewK = this.f8105e.k(kVarA.f8248i)) != null) {
                    viewK.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        k kVarB = B();
        ArrayList<k> arrayList2 = new ArrayList();
        if (kVarB != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            kVarB.D0(fArr, hashSet, false);
            kVarB.f0(arrayList2);
        }
        k kVar3 = null;
        for (k kVar4 : arrayList2) {
            if (!this.f8117q.contains(Integer.valueOf(kVar4.f8237b))) {
                kVar3 = kVar4;
            }
        }
        if (kVar3 == null && !arrayList2.isEmpty()) {
            kVar3 = (k) arrayList2.get(arrayList2.size() - 1);
        }
        if (kVar3 != null && (kVar3.f8237b != this.f8118r || arrayList2.size() != this.f8117q.size())) {
            this.f8118r = kVar3.f8237b;
            O(kVar3);
        }
        this.f8117q.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f8117q.add(Integer.valueOf(((k) it.next()).f8237b));
        }
        Iterator it2 = this.f8107g.entrySet().iterator();
        while (it2.hasNext()) {
            k kVar5 = (k) ((Map.Entry) it2.next()).getValue();
            if (!hashSet.contains(kVar5)) {
                f0(kVar5);
                it2.remove();
            }
        }
        W(0);
        for (k kVar6 : arrayList) {
            if (kVar6.h0()) {
                AccessibilityEvent accessibilityEventI = I(kVar6.f8237b, 4096);
                float f6 = kVar6.f8251l;
                float f7 = kVar6.f8252m;
                if (Float.isInfinite(kVar6.f8252m)) {
                    if (f6 > 70000.0f) {
                        f6 = 70000.0f;
                    }
                    f7 = 100000.0f;
                }
                if (Float.isInfinite(kVar6.f8253n)) {
                    f4 = f7 + 100000.0f;
                    if (f6 < -70000.0f) {
                        f6 = -70000.0f;
                    }
                    f5 = f6 + 100000.0f;
                } else {
                    f4 = f7 - kVar6.f8253n;
                    f5 = f6 - kVar6.f8253n;
                }
                if (kVar6.t0(g.SCROLL_UP) || kVar6.t0(g.SCROLL_DOWN)) {
                    accessibilityEventI.setScrollY((int) f5);
                    accessibilityEventI.setMaxScrollY((int) f4);
                } else if (kVar6.t0(g.SCROLL_LEFT) || kVar6.t0(g.SCROLL_RIGHT)) {
                    accessibilityEventI.setScrollX((int) f5);
                    accessibilityEventI.setMaxScrollX((int) f4);
                }
                if (kVar6.f8249j > 0) {
                    accessibilityEventI.setItemCount(kVar6.f8249j);
                    accessibilityEventI.setFromIndex(kVar6.f8250k);
                    Iterator it3 = kVar6.f8231W.iterator();
                    int i4 = 0;
                    while (it3.hasNext()) {
                        if (!((k) it3.next()).w0(i.IS_HIDDEN)) {
                            i4++;
                        }
                    }
                    accessibilityEventI.setToIndex((kVar6.f8250k + i4) - 1);
                }
                U(accessibilityEventI);
            }
            if (kVar6.w0(i.IS_LIVE_REGION) && kVar6.g0()) {
                W(kVar6.f8237b);
            }
            k kVar7 = this.f8109i;
            if (kVar7 != null && kVar7.f8237b == kVar6.f8237b) {
                i iVar = i.IS_SELECTED;
                if (!kVar6.u0(iVar) && kVar6.w0(iVar)) {
                    AccessibilityEvent accessibilityEventI2 = I(kVar6.f8237b, 4);
                    accessibilityEventI2.getText().add(kVar6.f8255p);
                    U(accessibilityEventI2);
                }
            }
            k kVar8 = this.f8114n;
            if (kVar8 != null && kVar8.f8237b == kVar6.f8237b && ((kVar2 = this.f8115o) == null || kVar2.f8237b != this.f8114n.f8237b)) {
                this.f8115o = this.f8114n;
                U(I(kVar6.f8237b, 8));
            } else if (this.f8114n == null) {
                this.f8115o = null;
            }
            k kVar9 = this.f8114n;
            if (kVar9 != null && kVar9.f8237b == kVar6.f8237b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (kVar6.u0(iVar2) && kVar6.w0(iVar2) && ((kVar = this.f8109i) == null || kVar.f8237b == this.f8114n.f8237b)) {
                    String str = kVar6.f8222N != null ? kVar6.f8222N : "";
                    String str2 = kVar6.f8257r != null ? kVar6.f8257r : "";
                    AccessibilityEvent accessibilityEventW = w(kVar6.f8237b, str, str2);
                    if (accessibilityEventW != null) {
                        U(accessibilityEventW);
                    }
                    if (kVar6.f8217I != kVar6.f8246g || kVar6.f8218J != kVar6.f8247h) {
                        AccessibilityEvent accessibilityEventI3 = I(kVar6.f8237b, 8192);
                        accessibilityEventI3.getText().add(str2);
                        accessibilityEventI3.setFromIndex(kVar6.f8246g);
                        accessibilityEventI3.setToIndex(kVar6.f8247h);
                        accessibilityEventI3.setItemCount(str2.length());
                        U(accessibilityEventI3);
                    }
                }
            }
        }
    }

    public final void f0(k kVar) {
        View viewK;
        Integer num;
        kVar.f8229U = null;
        if (kVar.f8248i != -1 && (num = this.f8110j) != null && this.f8104d.platformViewOfNode(num.intValue()) == this.f8105e.k(kVar.f8248i)) {
            T(this.f8110j.intValue(), 65536);
            this.f8110j = null;
        }
        if (kVar.f8248i != -1 && (viewK = this.f8105e.k(kVar.f8248i)) != null) {
            viewK.setImportantForAccessibility(4);
        }
        k kVar2 = this.f8109i;
        if (kVar2 == kVar) {
            T(kVar2.f8237b, 65536);
            this.f8109i = null;
        }
        if (this.f8114n == kVar) {
            this.f8114n = null;
        }
        if (this.f8116p == kVar) {
            this.f8116p = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i4) {
        if (i4 == 1) {
            k kVar = this.f8114n;
            if (kVar != null) {
                return createAccessibilityNodeInfo(kVar.f8237b);
            }
            Integer num = this.f8111k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i4 != 2) {
            return null;
        }
        k kVar2 = this.f8109i;
        if (kVar2 != null) {
            return createAccessibilityNodeInfo(kVar2.f8237b);
        }
        Integer num2 = this.f8110j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i4, int i5, Bundle bundle) {
        if (i4 >= 65536) {
            boolean zPerformAction = this.f8104d.performAction(i4, i5, bundle);
            if (zPerformAction && i5 == 128) {
                this.f8110j = null;
            }
            return zPerformAction;
        }
        k kVar = (k) this.f8107g.get(Integer.valueOf(i4));
        if (kVar == null) {
            return false;
        }
        switch (i5) {
            case 16:
                this.f8102b.b(i4, g.TAP);
                return true;
            case 32:
                this.f8102b.b(i4, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f8109i == null) {
                    this.f8101a.invalidate();
                }
                this.f8109i = kVar;
                this.f8102b.b(i4, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap map = new HashMap();
                map.put("type", "didGainFocus");
                map.put("nodeId", Integer.valueOf(kVar.f8237b));
                this.f8102b.f11594a.c(map);
                T(i4, 32768);
                if (kVar.v0(g.INCREASE) || kVar.v0(g.DECREASE)) {
                    T(i4, 4);
                }
                return true;
            case 128:
                k kVar2 = this.f8109i;
                if (kVar2 != null && kVar2.f8237b == i4) {
                    this.f8109i = null;
                }
                Integer num = this.f8110j;
                if (num != null && num.intValue() == i4) {
                    this.f8110j = null;
                }
                this.f8102b.b(i4, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                T(i4, 65536);
                return true;
            case 256:
                return P(kVar, i4, bundle, true);
            case 512:
                return P(kVar, i4, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (kVar.v0(gVar)) {
                    this.f8102b.b(i4, gVar);
                } else {
                    g gVar2 = g.SCROLL_LEFT;
                    if (kVar.v0(gVar2)) {
                        this.f8102b.b(i4, gVar2);
                    } else {
                        g gVar3 = g.INCREASE;
                        if (!kVar.v0(gVar3)) {
                            return false;
                        }
                        kVar.f8257r = kVar.f8259t;
                        kVar.f8258s = kVar.f8260u;
                        T(i4, 4);
                        this.f8102b.b(i4, gVar3);
                    }
                }
                return true;
            case 8192:
                g gVar4 = g.SCROLL_DOWN;
                if (kVar.v0(gVar4)) {
                    this.f8102b.b(i4, gVar4);
                } else {
                    g gVar5 = g.SCROLL_RIGHT;
                    if (kVar.v0(gVar5)) {
                        this.f8102b.b(i4, gVar5);
                    } else {
                        g gVar6 = g.DECREASE;
                        if (!kVar.v0(gVar6)) {
                            return false;
                        }
                        kVar.f8257r = kVar.f8261v;
                        kVar.f8258s = kVar.f8262w;
                        T(i4, 4);
                        this.f8102b.b(i4, gVar6);
                    }
                }
                return true;
            case 16384:
                this.f8102b.b(i4, g.COPY);
                return true;
            case 32768:
                this.f8102b.b(i4, g.PASTE);
                return true;
            case 65536:
                this.f8102b.b(i4, g.CUT);
                return true;
            case 131072:
                HashMap map2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    map2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    map2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    map2.put("base", Integer.valueOf(kVar.f8247h));
                    map2.put("extent", Integer.valueOf(kVar.f8247h));
                }
                this.f8102b.c(i4, g.SET_SELECTION, map2);
                k kVar3 = (k) this.f8107g.get(Integer.valueOf(i4));
                kVar3.f8246g = ((Integer) map2.get("base")).intValue();
                kVar3.f8247h = ((Integer) map2.get("extent")).intValue();
                return true;
            case 262144:
                this.f8102b.b(i4, g.EXPAND);
                return true;
            case 524288:
                this.f8102b.b(i4, g.COLLAPSE);
                return true;
            case 1048576:
                this.f8102b.b(i4, g.DISMISS);
                return true;
            case 2097152:
                return Q(kVar, i4, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f8102b.b(i4, g.SHOW_ON_SCREEN);
                return true;
            default:
                C0129h c0129h = (C0129h) this.f8108h.get(Integer.valueOf(i5 - f8098C));
                if (c0129h == null) {
                    return false;
                }
                this.f8102b.c(i4, g.CUSTOM_ACTION, Integer.valueOf(c0129h.f8172b));
                return true;
        }
    }

    public final AccessibilityEvent w(int i4, String str, String str2) {
        AccessibilityEvent accessibilityEventI = I(i4, 16);
        accessibilityEventI.setBeforeText(str);
        accessibilityEventI.getText().add(str2);
        int i5 = 0;
        while (i5 < str.length() && i5 < str2.length() && str.charAt(i5) == str2.charAt(i5)) {
            i5++;
        }
        if (i5 >= str.length() && i5 >= str2.length()) {
            return null;
        }
        accessibilityEventI.setFromIndex(i5);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i5 && length2 >= i5 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        accessibilityEventI.setRemovedCount((length - i5) + 1);
        accessibilityEventI.setAddedCount((length2 - i5) + 1);
        return accessibilityEventI;
    }

    public boolean x(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f8104d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f8104d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f8111k = recordFlutterId;
            this.f8114n = null;
            return true;
        }
        if (eventType == 128) {
            this.f8116p = null;
            return true;
        }
        if (eventType == 32768) {
            this.f8110j = recordFlutterId;
            this.f8109i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.f8111k = null;
        this.f8110j = null;
        return true;
    }

    public final Rect y(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f8101a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final C0129h z(int i4) {
        C0129h c0129h = (C0129h) this.f8108h.get(Integer.valueOf(i4));
        if (c0129h != null) {
            return c0129h;
        }
        C0129h c0129h2 = new C0129h();
        c0129h2.f8172b = i4;
        c0129h2.f8171a = f8098C + i4;
        this.f8108h.put(Integer.valueOf(i4), c0129h2);
        return c0129h2;
    }

    public h(View view, C1592a c1592a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, InterfaceC1085q interfaceC1085q) {
        this.f8107g = new HashMap();
        this.f8108h = new HashMap();
        this.f8112l = 0;
        this.f8117q = new ArrayList();
        this.f8118r = 0;
        this.f8119s = 0;
        this.f8121u = false;
        this.f8122v = false;
        this.f8123w = new a();
        b bVar = new b();
        this.f8124x = bVar;
        c cVar = new c(new Handler());
        this.f8126z = cVar;
        this.f8101a = view;
        this.f8102b = c1592a;
        this.f8103c = accessibilityManager;
        this.f8106f = contentResolver;
        this.f8104d = accessibilityViewEmbedder;
        this.f8105e = interfaceC1085q;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.f8125y = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        this.f8112l |= f.NO_ANNOUNCE.f8142m;
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31) {
            Z();
        }
        interfaceC1085q.h(this);
    }
}
