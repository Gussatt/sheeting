package p1;

import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o1.AbstractC1469f;
import o1.AbstractC1471h;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static boolean a(List list, Object obj) {
        if (obj == AbstractC1471h.h(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return l.a(list.iterator(), list2.iterator());
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (!AbstractC1469f.a(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static int b(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (AbstractC1469f.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int c(List list, Object obj) {
        int size = list.size();
        int i4 = 0;
        if (obj == null) {
            while (i4 < size) {
                if (list.get(i4) == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        while (i4 < size) {
            if (obj.equals(list.get(i4))) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (AbstractC1469f.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int e(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }
}
