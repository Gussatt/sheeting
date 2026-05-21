package y2;

import android.view.PointerIcon;
import java.util.HashMap;
import v2.m;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1657a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashMap f12028c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f12030b;

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    public class C0190a implements m.b {
        public C0190a() {
        }

        @Override // v2.m.b
        public void a(String str) {
            C1657a.this.f12029a.setPointerIcon(C1657a.this.d(str));
        }
    }

    /* JADX INFO: renamed from: y2.a$b */
    public class b extends HashMap {
        public b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* JADX INFO: renamed from: y2.a$c */
    public interface c {
        PointerIcon b(int i4);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C1657a(c cVar, m mVar) {
        this.f12029a = cVar;
        this.f12030b = mVar;
        mVar.b(new C0190a());
    }

    public void c() {
        this.f12030b.b(null);
    }

    public final PointerIcon d(String str) {
        if (f12028c == null) {
            f12028c = new b();
        }
        return this.f12029a.b(((Integer) f12028c.getOrDefault(str, 1000)).intValue());
    }
}
