package u;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.AbstractC1502c;

/* JADX INFO: renamed from: u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1565a {

    /* JADX INFO: renamed from: u.a$a, reason: collision with other inner class name */
    public static class C0177a {
        public static int a(TypedArray typedArray, int i4) {
            return typedArray.getType(i4);
        }
    }

    /* JADX INFO: renamed from: u.a$b */
    public interface b {
    }

    /* JADX INFO: renamed from: u.a$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d[] f11440a;

        public c(d[] dVarArr) {
            this.f11440a = dVarArr;
        }

        public d[] a() {
            return this.f11440a;
        }
    }

    /* JADX INFO: renamed from: u.a$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f11443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f11444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f11446f;

        public d(String str, int i4, boolean z3, String str2, int i5, int i6) {
            this.f11441a = str;
            this.f11442b = i4;
            this.f11443c = z3;
            this.f11444d = str2;
            this.f11445e = i5;
            this.f11446f = i6;
        }

        public String a() {
            return this.f11441a;
        }

        public int b() {
            return this.f11446f;
        }

        public int c() {
            return this.f11445e;
        }

        public String d() {
            return this.f11444d;
        }

        public int e() {
            return this.f11442b;
        }

        public boolean f() {
            return this.f11443c;
        }
    }

    /* JADX INFO: renamed from: u.a$e */
    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z.e f11447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f11450d;

        public e(z.e eVar, int i4, int i5, String str) {
            this.f11447a = eVar;
            this.f11449c = i4;
            this.f11448b = i5;
            this.f11450d = str;
        }

        public int a() {
            return this.f11449c;
        }

        public z.e b() {
            return this.f11447a;
        }

        public String c() {
            return this.f11450d;
        }

        public int d() {
            return this.f11448b;
        }
    }

    public static int a(TypedArray typedArray, int i4) {
        return C0177a.a(typedArray, i4);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i4) {
        if (i4 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < typedArrayObtainTypedArray.length(); i5++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i4)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1502c.f11167c);
        String string = typedArrayObtainAttributes.getString(AbstractC1502c.f11168d);
        String string2 = typedArrayObtainAttributes.getString(AbstractC1502c.f11172h);
        String string3 = typedArrayObtainAttributes.getString(AbstractC1502c.f11173i);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC1502c.f11169e, 0);
        int integer = typedArrayObtainAttributes.getInteger(AbstractC1502c.f11170f, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(AbstractC1502c.f11171g, 500);
        String string4 = typedArrayObtainAttributes.getString(AbstractC1502c.f11174j);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new z.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1502c.f11175k);
        int i4 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC1502c.f11184t) ? AbstractC1502c.f11184t : AbstractC1502c.f11177m, 400);
        boolean z3 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC1502c.f11182r) ? AbstractC1502c.f11182r : AbstractC1502c.f11178n, 0);
        int i5 = typedArrayObtainAttributes.hasValue(AbstractC1502c.f11185u) ? AbstractC1502c.f11185u : AbstractC1502c.f11179o;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(AbstractC1502c.f11183s) ? AbstractC1502c.f11183s : AbstractC1502c.f11180p);
        int i6 = typedArrayObtainAttributes.getInt(i5, 0);
        int i7 = typedArrayObtainAttributes.hasValue(AbstractC1502c.f11181q) ? AbstractC1502c.f11181q : AbstractC1502c.f11176l;
        int resourceId = typedArrayObtainAttributes.getResourceId(i7, 0);
        String string2 = typedArrayObtainAttributes.getString(i7);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i4, z3, string, i6, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
