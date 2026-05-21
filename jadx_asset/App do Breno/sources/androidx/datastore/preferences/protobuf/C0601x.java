package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0601x implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Iterator f4944m;

    public C0601x(Iterator it) {
        this.f4944m = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f4944m.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4944m.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f4944m.remove();
    }
}
