package H;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static class a {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean z3) {
            popupWindow.setOverlapAnchor(z3);
        }

        public static void d(PopupWindow popupWindow, int i4) {
            popupWindow.setWindowLayoutType(i4);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z3) {
        a.c(popupWindow, z3);
    }

    public static void b(PopupWindow popupWindow, int i4) {
        a.d(popupWindow, i4);
    }

    public static void c(PopupWindow popupWindow, View view, int i4, int i5, int i6) {
        popupWindow.showAsDropDown(view, i4, i5, i6);
    }
}
