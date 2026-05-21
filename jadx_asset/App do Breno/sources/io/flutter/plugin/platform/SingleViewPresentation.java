package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import l2.AbstractC1388b;

/* JADX INFO: loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C1069a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final d state;
    private int viewId;

    public static class a extends FrameLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1069a f7968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f7969c;

        public a(Context context, C1069a c1069a, View view) {
            super(context);
            this.f7968b = c1069a;
            this.f7969c = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f7968b.b(this.f7969c, view, accessibilityEvent);
        }
    }

    public static class b extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputMethodManager f7970a;

        public b(Context context) {
            this(context, null);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new b(super.createDisplayContext(display), this.f7970a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f7970a : super.getSystemService(str);
        }

        public b(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f7970a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }
    }

    public static class c extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f7971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WindowManager f7972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f7973c;

        public c(Context context, c0 c0Var, Context context2) {
            super(context);
            this.f7971a = c0Var;
            this.f7973c = context2;
        }

        public final WindowManager a() {
            if (this.f7972b == null) {
                this.f7972b = this.f7971a;
            }
            return this.f7972b;
        }

        public final boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i4 = 0; i4 < stackTrace.length && i4 < 11; i4++) {
                if (stackTrace[i4].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i4].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f7973c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC1079k f7974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c0 f7975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public S f7976c;
    }

    public SingleViewPresentation(Context context, Display display, InterfaceC1079k interfaceC1079k, C1069a c1069a, int i4, View.OnFocusChangeListener onFocusChangeListener) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1069a;
        this.viewId = i4;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        d dVar = new d();
        this.state = dVar;
        dVar.f7974a = interfaceC1079k;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        a aVar = this.rootView;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        return this.state;
    }

    public InterfaceC1079k getView() {
        return this.state.f7974a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f7976c == null) {
            this.state.f7976c = new S(getContext());
        }
        if (this.state.f7975b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            d dVar = this.state;
            dVar.f7975b = new c0(windowManager, dVar.f7976c);
        }
        this.container = new FrameLayout(getContext());
        c cVar = new c(getContext(), this.state.f7975b, this.outerContext);
        View view = this.state.f7974a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(cVar);
        } else {
            AbstractC1388b.g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f7976c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C1069a c1069a, d dVar, View.OnFocusChangeListener onFocusChangeListener, boolean z3) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1069a;
        this.state = dVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z3;
    }
}
