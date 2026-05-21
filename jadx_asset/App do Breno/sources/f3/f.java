package f3;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(Appendable appendable, Object obj, W2.l lVar) {
        X2.l.e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.k(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
