package L2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends t {
    public static Object A(List list) {
        X2.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m.h(list));
    }

    public static Comparable B(Iterable iterable) {
        X2.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List C(Collection collection, Iterable iterable) {
        X2.l.e(collection, "<this>");
        X2.l.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            r.o(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List D(Iterable iterable, Comparator comparator) {
        X2.l.e(iterable, "<this>");
        X2.l.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listG = G(iterable);
            q.n(listG, comparator);
            return listG;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return F(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        i.k(array, comparator);
        return i.c(array);
    }

    public static final Collection E(Iterable iterable, Collection collection) {
        X2.l.e(iterable, "<this>");
        X2.l.e(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static List F(Iterable iterable) {
        X2.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m.k(G(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m.f();
        }
        if (size != 1) {
            return H(collection);
        }
        return l.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List G(Iterable iterable) {
        X2.l.e(iterable, "<this>");
        return iterable instanceof Collection ? H((Collection) iterable) : (List) E(iterable, new ArrayList());
    }

    public static List H(Collection collection) {
        X2.l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set I(Iterable iterable) {
        X2.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return E.c((Set) E(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return E.b();
        }
        if (size != 1) {
            return (Set) E(iterable, new LinkedHashSet(B.a(collection.size())));
        }
        return D.a(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static boolean s(Iterable iterable, Object obj) {
        X2.l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : v(iterable, obj) >= 0;
    }

    public static List t(Iterable iterable) {
        X2.l.e(iterable, "<this>");
        return (List) u(iterable, new ArrayList());
    }

    public static final Collection u(Iterable iterable, Collection collection) {
        X2.l.e(iterable, "<this>");
        X2.l.e(collection, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final int v(Iterable iterable, Object obj) {
        X2.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i4 = 0;
        for (Object obj2 : iterable) {
            if (i4 < 0) {
                m.l();
            }
            if (X2.l.a(obj, obj2)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static final Appendable w(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, W2.l lVar) throws IOException {
        X2.l.e(iterable, "<this>");
        X2.l.e(appendable, "buffer");
        X2.l.e(charSequence, "separator");
        X2.l.e(charSequence2, "prefix");
        X2.l.e(charSequence3, "postfix");
        X2.l.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (Object obj : iterable) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            f3.f.a(appendable, obj, lVar);
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String y(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, W2.l lVar) {
        X2.l.e(iterable, "<this>");
        X2.l.e(charSequence, "separator");
        X2.l.e(charSequence2, "prefix");
        X2.l.e(charSequence3, "postfix");
        X2.l.e(charSequence4, "truncated");
        return ((StringBuilder) w(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String z(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, W2.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i5 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i5 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        W2.l lVar2 = lVar;
        return y(iterable, charSequence, charSequence2, charSequence3, i4, charSequence5, lVar2);
    }
}
