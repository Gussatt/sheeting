package I1;

import C1.C0256n;
import C1.G;
import E1.o;
import F1.F;
import G1.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f2258e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f2259f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f2260g = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f2261h = new Comparator() { // from class: I1.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FilenameFilter f2262i = new FilenameFilter() { // from class: I1.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f2263a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f2264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K1.j f2265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0256n f2266d;

    public e(g gVar, K1.j jVar, C0256n c0256n) {
        this.f2264b = gVar;
        this.f2265c = jVar;
        this.f2266d = c0256n;
    }

    public static void D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f2258e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(File file, String str, long j4) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f2258e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j4));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int f(List list, int i4) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i4) {
                break;
            }
            g.u(file);
            size--;
        }
        return size;
    }

    public static long h(long j4) {
        return j4 * 1000;
    }

    public static String m(int i4, boolean z3) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i4)) + (z3 ? "_" : "");
    }

    public static String o(String str) {
        return str.substring(0, f2259f);
    }

    public static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static int v(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public static String y(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i4 = fileInputStream.read(bArr);
                if (i4 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f2258e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void A(String str, long j4) {
        boolean z3;
        List<File> listR = this.f2264b.r(str, f2262i);
        if (listR.isEmpty()) {
            z1.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listR);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z3 = false;
            for (File file : listR) {
                try {
                    arrayList.add(f2260g.j(y(file)));
                } catch (IOException e4) {
                    z1.g.f().l("Could not add event to report for " + file, e4);
                }
                if (z3 || s(file.getName())) {
                    z3 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            B(this.f2264b.q(str, "report"), arrayList, j4, z3, o.k(str, this.f2264b), this.f2266d.d(str));
        } else {
            z1.g.f().k("Could not parse event files for session " + str);
        }
    }

    public final void B(File file, List list, long j4, boolean z3, String str, String str2) {
        try {
            j jVar = f2260g;
            F fR = jVar.L(y(file)).v(j4, z3, str).p(str2).r(list);
            F.e eVarN = fR.n();
            if (eVarN == null) {
                return;
            }
            z1.g.f().b("appQualitySessionId: " + str2);
            D(z3 ? this.f2264b.l(eVarN.i()) : this.f2264b.n(eVarN.i()), jVar.M(fR));
        } catch (IOException e4) {
            z1.g.f().l("Could not synthesize final report file for " + file, e4);
        }
    }

    public final int C(String str, int i4) {
        List listR = this.f2264b.r(str, new FilenameFilter() { // from class: I1.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listR, new Comparator() { // from class: I1.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.v((File) obj, (File) obj2);
            }
        });
        return f(listR, i4);
    }

    public final SortedSet e(String str) {
        this.f2264b.d();
        SortedSet sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() > 8) {
            while (sortedSetP.size() > 8) {
                String str2 = (String) sortedSetP.last();
                z1.g.f().b("Removing session over cap: " + str2);
                this.f2264b.e(str2);
                sortedSetP.remove(str2);
            }
        }
        return sortedSetP;
    }

    public final void g() {
        int i4 = this.f2265c.b().f2461a.f2473b;
        List listN = n();
        int size = listN.size();
        if (size <= i4) {
            return;
        }
        Iterator it = listN.subList(i4, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void i() {
        j(this.f2264b.o());
        j(this.f2264b.m());
        j(this.f2264b.j());
    }

    public final void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void k(String str, long j4) {
        for (String str2 : e(str)) {
            z1.g.f().i("Finalizing report for session " + str2);
            A(str2, j4);
            this.f2264b.e(str2);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File fileQ = this.f2264b.q(str, "report");
        z1.g.f().b("Writing native session report for " + str + " to file: " + fileQ);
        z(fileQ, dVar, str, aVar);
    }

    public final List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f2264b.m());
        arrayList.addAll(this.f2264b.j());
        Comparator comparator = f2261h;
        Collections.sort(arrayList, comparator);
        List listO = this.f2264b.o();
        Collections.sort(listO, comparator);
        arrayList.addAll(listO);
        return arrayList;
    }

    public SortedSet p() {
        return new TreeSet(this.f2264b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f2264b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f2264b.o().isEmpty() && this.f2264b.m().isEmpty() && this.f2264b.j().isEmpty()) ? false : true;
    }

    public List u() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(G.a(f2260g.L(y(file)), file.getName(), file));
            } catch (IOException e4) {
                z1.g.f().l("Could not load report file " + file + "; deleting", e4);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(F.e.d dVar, String str, boolean z3) {
        int i4 = this.f2265c.b().f2461a.f2472a;
        try {
            D(this.f2264b.q(str, m(this.f2263a.getAndIncrement(), z3)), f2260g.k(dVar));
        } catch (IOException e4) {
            z1.g.f().l("Could not persist event for session " + str, e4);
        }
        C(str, i4);
    }

    public void x(F f4) {
        F.e eVarN = f4.n();
        if (eVarN == null) {
            z1.g.f().b("Could not get session for report");
            return;
        }
        String strI = eVarN.i();
        try {
            D(this.f2264b.q(strI, "report"), f2260g.M(f4));
            E(this.f2264b.q(strI, "start-time"), "", eVarN.l());
        } catch (IOException e4) {
            z1.g.f().c("Could not persist report for session " + strI, e4);
        }
    }

    public final void z(File file, F.d dVar, String str, F.a aVar) {
        String strD = this.f2266d.d(str);
        try {
            j jVar = f2260g;
            D(this.f2264b.i(str), jVar.M(jVar.L(y(file)).u(dVar).q(aVar).p(strD)));
        } catch (IOException e4) {
            z1.g.f().l("Could not synthesize final native report file for " + file, e4);
        }
    }
}
