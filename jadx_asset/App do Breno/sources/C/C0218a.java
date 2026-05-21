package C;

import D.t;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import r.AbstractC1501b;

/* JADX INFO: renamed from: C.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0218a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f357c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f359b;

    /* JADX INFO: renamed from: C.a$a, reason: collision with other inner class name */
    public static final class C0004a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0218a f360a;

        public C0004a(C0218a c0218a) {
            this.f360a = c0218a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f360a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            D.w wVarB = this.f360a.b(view);
            if (wVarB != null) {
                return (AccessibilityNodeProvider) wVarB.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f360a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            D.t tVarE0 = D.t.e0(accessibilityNodeInfo);
            tVarE0.a0(AbstractC0241y.w(view));
            tVarE0.Y(AbstractC0241y.t(view));
            tVarE0.Z(AbstractC0241y.e(view));
            tVarE0.c0(AbstractC0241y.p(view));
            this.f360a.g(view, tVarE0);
            tVarE0.d(accessibilityNodeInfo.getText(), view);
            List listC = C0218a.c(view);
            for (int i4 = 0; i4 < listC.size(); i4++) {
                tVarE0.b((t.a) listC.get(i4));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f360a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f360a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            return this.f360a.j(view, i4, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i4) {
            this.f360a.l(view, i4);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f360a.m(view, accessibilityEvent);
        }
    }

    public C0218a() {
        this(f357c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(AbstractC1501b.f11130H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f358a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public D.w b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f358a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new D.w(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f359b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrN = D.t.n(view.createAccessibilityNodeInfo().getText());
            for (int i4 = 0; clickableSpanArrN != null && i4 < clickableSpanArrN.length; i4++) {
                if (clickableSpan.equals(clickableSpanArrN[i4])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f358a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, D.t tVar) {
        this.f358a.onInitializeAccessibilityNodeInfo(view, tVar.d0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f358a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f358a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i4, Bundle bundle) {
        List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i5 = 0;
        while (true) {
            if (i5 >= listC.size()) {
                break;
            }
            t.a aVar = (t.a) listC.get(i5);
            if (aVar.a() == i4) {
                zPerformAccessibilityAction = aVar.c(view, bundle);
                break;
            }
            i5++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f358a.performAccessibilityAction(view, i4, bundle);
        }
        return (zPerformAccessibilityAction || i4 != AbstractC1501b.f11139a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i4, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC1501b.f11131I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i4)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i4) {
        this.f358a.sendAccessibilityEvent(view, i4);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f358a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0218a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f358a = accessibilityDelegate;
        this.f359b = new C0004a(this);
    }
}
