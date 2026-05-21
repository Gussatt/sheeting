package x0;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import x0.AbstractC1628c;
import y0.i;

/* JADX INFO: renamed from: x0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1629d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1628c.b f11901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1628c.a f11902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC1628c.d f11905f;

    /* JADX INFO: renamed from: x0.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f11906m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f11907n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f11908o;

        public a(Context context, String str, String str2, AbstractC1628c.InterfaceC0188c interfaceC0188c) {
            this.f11906m = context;
            this.f11907n = str;
            this.f11908o = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r5 = this;
                r0 = 0
                x0.d r1 = x0.C1629d.this     // Catch: x0.C1627b -> Ld java.lang.UnsatisfiedLinkError -> Le
                android.content.Context r2 = r5.f11906m     // Catch: x0.C1627b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r3 = r5.f11907n     // Catch: x0.C1627b -> Ld java.lang.UnsatisfiedLinkError -> Le
                java.lang.String r4 = r5.f11908o     // Catch: x0.C1627b -> Ld java.lang.UnsatisfiedLinkError -> Le
                x0.C1629d.a(r1, r2, r3, r4)     // Catch: x0.C1627b -> Ld java.lang.UnsatisfiedLinkError -> Le
                throw r0
            Ld:
                throw r0
            Le:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.C1629d.a.run():void");
        }
    }

    /* JADX INFO: renamed from: x0.d$b */
    public class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11910a;

        public b(String str) {
            this.f11910a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f11910a);
        }
    }

    public C1629d() {
        this(new C1630e(), new C1626a());
    }

    public void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f11901b.a(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f11903d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String strA = this.f11901b.a(str);
        if (AbstractC1631f.a(str2)) {
            return new File(c(context), strA);
        }
        return new File(c(context), strA + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, AbstractC1628c.InterfaceC0188c interfaceC0188c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (AbstractC1631f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        j("Beginning load of %s...", str);
        if (interfaceC0188c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0188c)).start();
        }
    }

    public final void g(Context context, String str, String str2) throws Throwable {
        C1629d c1629d;
        Context context2;
        i iVar;
        if (this.f11900a.contains(str) && !this.f11903d) {
            j("%s already loaded previously!", str);
            return;
        }
        try {
            this.f11901b.c(str);
            this.f11900a.add(str);
            j("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e4) {
            j("Loading the library normally failed: %s", Log.getStackTraceString(e4));
            j("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f11903d) {
                if (this.f11903d) {
                    j("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                c1629d = this;
                context2 = context;
                this.f11902c.a(context2, this.f11901b.d(), this.f11901b.a(str), fileD, c1629d);
            } else {
                c1629d = this;
                context2 = context;
            }
            try {
                if (c1629d.f11904e) {
                    try {
                        iVar = new i(fileD);
                        try {
                            List listD = iVar.d();
                            iVar.close();
                            Iterator it = listD.iterator();
                            while (it.hasNext()) {
                                e(context2, c1629d.f11901b.b((String) it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (iVar == null) {
                                throw th2;
                            }
                            iVar.close();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iVar = null;
                    }
                }
            } catch (IOException unused) {
            }
            c1629d.f11901b.e(fileD.getAbsolutePath());
            c1629d.f11900a.add(str);
            j("%s (%s) was re-linked!", str, str2);
        }
    }

    public C1629d h(AbstractC1628c.d dVar) {
        this.f11905f = dVar;
        return this;
    }

    public void i(String str) {
        AbstractC1628c.d dVar = this.f11905f;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public void j(String str, Object... objArr) {
        i(String.format(Locale.US, str, objArr));
    }

    public C1629d(AbstractC1628c.b bVar, AbstractC1628c.a aVar) {
        this.f11900a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f11901b = bVar;
        this.f11902c = aVar;
    }
}
