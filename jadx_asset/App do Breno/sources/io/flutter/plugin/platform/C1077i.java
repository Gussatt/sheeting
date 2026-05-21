package io.flutter.plugin.platform;

import C.e0;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import b.InterfaceC0617e;
import io.flutter.plugin.platform.C1077i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import l2.AbstractC1388b;
import v2.o;

/* JADX INFO: renamed from: io.flutter.plugin.platform.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1077i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f8013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2.o f8014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f8015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o.i f8016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o.g f8018f;

    /* JADX INFO: renamed from: io.flutter.plugin.platform.i$a */
    public class a implements o.g {
        public a() {
        }

        @Override // v2.o.g
        public void a() {
            C1077i.this.t();
        }

        @Override // v2.o.g
        public void b(List list) {
            C1077i.this.A(list);
        }

        @Override // v2.o.g
        public void c(o.j jVar) {
            C1077i.this.z(jVar);
        }

        @Override // v2.o.g
        public void d(o.h hVar) {
            C1077i.this.s(hVar);
        }

        @Override // v2.o.g
        public void e(o.b bVar) {
            C1077i.this.x(bVar);
        }

        @Override // v2.o.g
        public void f() {
            C1077i.this.y();
        }

        @Override // v2.o.g
        public void g(boolean z3) {
            C1077i.this.w(z3);
        }

        @Override // v2.o.g
        public void h(o.i iVar) {
            C1077i.this.C(iVar);
        }

        @Override // v2.o.g
        public void i() {
            C1077i.this.u();
        }

        @Override // v2.o.g
        public void j(String str) {
            C1077i.this.v(str);
        }

        @Override // v2.o.g
        public void k(int i4) {
            C1077i.this.B(i4);
        }

        @Override // v2.o.g
        public void l(String str) {
            C1077i.this.D(str);
        }

        @Override // v2.o.g
        public void m(o.f fVar) {
            C1077i.this.F(fVar);
        }

        @Override // v2.o.g
        public boolean n() {
            return C1077i.this.p();
        }

        @Override // v2.o.g
        public CharSequence o(o.d dVar) {
            return C1077i.this.r(dVar);
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugin.platform.i$b */
    public class b implements View.OnSystemUiVisibilityChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8020a;

        public b(View view) {
            this.f8020a = view;
        }

        public static /* synthetic */ void a(b bVar, int i4) {
            if ((i4 & 4) == 0) {
                C1077i.this.f8014b.m(true);
            } else {
                C1077i.this.f8014b.m(false);
            }
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i4) {
            this.f8020a.post(new Runnable() { // from class: io.flutter.plugin.platform.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1077i.b.a(this.f8025m, i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugin.platform.i$c */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f8023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f8024c;

        static {
            int[] iArr = new int[o.c.values().length];
            f8024c = iArr;
            try {
                iArr[o.c.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8024c[o.c.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[o.k.values().length];
            f8023b = iArr2;
            try {
                iArr2[o.k.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8023b[o.k.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[o.f.values().length];
            f8022a = iArr3;
            try {
                iArr3[o.f.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8022a[o.f.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8022a[o.f.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8022a[o.f.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8022a[o.f.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugin.platform.i$d */
    public interface d {
        boolean a();

        void g(boolean z3);
    }

    public C1077i(Activity activity, v2.o oVar, d dVar) {
        a aVar = new a();
        this.f8018f = aVar;
        this.f8013a = activity;
        this.f8014b = oVar;
        oVar.l(aVar);
        this.f8015c = dVar;
        this.f8017e = 1280;
    }

    public final void A(List list) {
        int i4 = list.isEmpty() ? 5894 : 1798;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int i6 = c.f8023b[((o.k) list.get(i5)).ordinal()];
            if (i6 == 1) {
                i4 &= -5;
            } else if (i6 == 2) {
                i4 &= -515;
            }
        }
        this.f8017e = i4;
        E();
    }

    public final void B(int i4) {
        this.f8013a.setRequestedOrientation(i4);
    }

    public final void C(o.i iVar) {
        Window window = this.f8013a.getWindow();
        e0 e0Var = new e0(window, window.getDecorView());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        o.c cVar = iVar.f11668b;
        if (cVar != null) {
            int i5 = c.f8024c[cVar.ordinal()];
            if (i5 == 1) {
                e0Var.b(true);
            } else if (i5 == 2) {
                e0Var.b(false);
            }
        }
        Integer num = iVar.f11667a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = iVar.f11669c;
        if (bool != null && i4 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i4 >= 26) {
            o.c cVar2 = iVar.f11671e;
            if (cVar2 != null) {
                int i6 = c.f8024c[cVar2.ordinal()];
                if (i6 == 1) {
                    e0Var.a(true);
                } else if (i6 == 2) {
                    e0Var.a(false);
                }
            }
            Integer num2 = iVar.f11670d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = iVar.f11672f;
        if (num3 != null && i4 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = iVar.f11673g;
        if (bool2 != null && i4 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f8016d = iVar;
    }

    public final void D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f8013a.startActivity(Intent.createChooser(intent, null));
    }

    public void E() {
        this.f8013a.getWindow().getDecorView().setSystemUiVisibility(this.f8017e);
        o.i iVar = this.f8016d;
        if (iVar != null) {
            C(iVar);
        }
    }

    public void F(o.f fVar) {
        View decorView = this.f8013a.getWindow().getDecorView();
        int i4 = c.f8022a[fVar.ordinal()];
        if (i4 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i4 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i4 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i4 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i4 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    public final boolean p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f8013a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void q() {
        this.f8014b.l(null);
    }

    public final CharSequence r(o.d dVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f8013a.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (dVar != null && dVar != o.d.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        AbstractC1388b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                        return null;
                    }
                    String scheme = uri.getScheme();
                    if (!scheme.equals("content")) {
                        AbstractC1388b.g("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        return null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = this.f8013a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                    CharSequence charSequenceCoerceToText = itemAt.coerceToText(this.f8013a);
                    if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
                        return charSequenceCoerceToText;
                    }
                    try {
                        assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                        return charSequenceCoerceToText;
                    } catch (IOException e4) {
                        charSequence = charSequenceCoerceToText;
                        e = e4;
                    }
                } catch (IOException e5) {
                    e = e5;
                    charSequence = text;
                }
            } catch (IOException e6) {
                e = e6;
            }
            AbstractC1388b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
            return charSequence;
        } catch (FileNotFoundException unused) {
            AbstractC1388b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e7) {
            AbstractC1388b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e7);
            return null;
        }
    }

    public final void s(o.h hVar) {
        if (hVar == o.h.CLICK) {
            this.f8013a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        d dVar = this.f8015c;
        if (dVar == null || !dVar.a()) {
            Activity activity = this.f8013a;
            if (activity instanceof InterfaceC0617e) {
                ((InterfaceC0617e) activity).k().a();
            } else {
                activity.finish();
            }
        }
    }

    public final void u() {
        E();
    }

    public final void v(String str) {
        ((ClipboardManager) this.f8013a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    public final void w(boolean z3) {
        d dVar = this.f8015c;
        if (dVar != null) {
            dVar.g(z3);
        }
    }

    public final void x(o.b bVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f8013a.setTaskDescription(new ActivityManager.TaskDescription(bVar.f11641b, (Bitmap) null, bVar.f11640a));
            return;
        }
        AbstractC1076h.a();
        this.f8013a.setTaskDescription(AbstractC1075g.a(bVar.f11641b, 0, bVar.f11640a));
    }

    public final void y() {
        View decorView = this.f8013a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    public final void z(o.j jVar) {
        int i4;
        if (jVar == o.j.LEAN_BACK) {
            i4 = 1798;
        } else if (jVar == o.j.IMMERSIVE) {
            i4 = 3846;
        } else if (jVar == o.j.IMMERSIVE_STICKY) {
            i4 = 5894;
        } else if (jVar != o.j.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i4 = 1792;
        }
        this.f8017e = i4;
        E();
    }
}
