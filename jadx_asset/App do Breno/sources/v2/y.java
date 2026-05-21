package v2;

import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import l2.AbstractC1388b;
import o2.C1472a;
import w2.C1608a;
import w2.C1612e;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11750b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1608a f11751a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConcurrentLinkedQueue f11752a = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f11753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f11754c;

        /* JADX INFO: renamed from: v2.y$a$a, reason: collision with other inner class name */
        public class C0180a implements C1608a.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f11755a;

            public C0180a(b bVar) {
                this.f11755a = bVar;
            }

            @Override // w2.C1608a.e
            public void a(Object obj) {
                a.this.f11752a.remove(this.f11755a);
                if (a.this.f11752a.isEmpty()) {
                    return;
                }
                AbstractC1388b.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f11755a.f11758a));
            }
        }

        public static class b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f11757c = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f11758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DisplayMetrics f11759b;

            public b(DisplayMetrics displayMetrics) {
                int i4 = f11757c;
                f11757c = i4 + 1;
                this.f11758a = i4;
                this.f11759b = displayMetrics;
            }
        }

        public C1608a.e b(b bVar) {
            this.f11752a.add(bVar);
            b bVar2 = this.f11754c;
            this.f11754c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0180a(bVar2);
        }

        public b c(int i4) {
            b bVar;
            if (this.f11753b == null) {
                this.f11753b = (b) this.f11752a.poll();
            }
            while (true) {
                bVar = this.f11753b;
                if (bVar == null || bVar.f11758a >= i4) {
                    break;
                }
                this.f11753b = (b) this.f11752a.poll();
            }
            if (bVar == null) {
                AbstractC1388b.b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i4) + ", after exhausting the queue.");
                return null;
            }
            if (bVar.f11758a == i4) {
                return bVar;
            }
            AbstractC1388b.b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i4) + ", the oldest config is now: " + String.valueOf(this.f11753b.f11758a));
            return null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1608a f11760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f11761b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DisplayMetrics f11762c;

        public b(C1608a c1608a) {
            this.f11760a = c1608a;
        }

        public void a() {
            AbstractC1388b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f11761b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f11761b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f11761b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f11762c;
            if (!y.c() || displayMetrics == null) {
                this.f11760a.c(this.f11761b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            C1608a.e eVarB = y.f11750b.b(bVar);
            this.f11761b.put("configurationId", Integer.valueOf(bVar.f11758a));
            this.f11760a.d(this.f11761b, eVarB);
        }

        public b b(boolean z3) {
            this.f11761b.put("brieflyShowPassword", Boolean.valueOf(z3));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.f11762c = displayMetrics;
            return this;
        }

        public b d(boolean z3) {
            this.f11761b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z3));
            return this;
        }

        public b e(c cVar) {
            this.f11761b.put("platformBrightness", cVar.f11766m);
            return this;
        }

        public b f(float f4) {
            this.f11761b.put("textScaleFactor", Float.valueOf(f4));
            return this;
        }

        public b g(boolean z3) {
            this.f11761b.put("alwaysUse24HourFormat", Boolean.valueOf(z3));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f11766m;

        c(String str) {
            this.f11766m = str;
        }
    }

    public y(C1472a c1472a) {
        this.f11751a = new C1608a(c1472a, "flutter/settings", C1612e.f11877a);
    }

    public static DisplayMetrics b(int i4) {
        a.b bVarC = f11750b.c(i4);
        if (bVarC == null) {
            return null;
        }
        return bVarC.f11759b;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.f11751a);
    }
}
