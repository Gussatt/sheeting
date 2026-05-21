package androidx.appcompat.widget;

import C.AbstractC0241y;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import c.AbstractC0637a;
import c.AbstractC0639c;
import c.AbstractC0641e;
import c.AbstractC0642f;
import c.AbstractC0643g;
import c.AbstractC0645i;
import i.InterfaceC1037b;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.AbstractC1114c;
import k.V;
import k.a0;
import k.c0;
import k.g0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements InterfaceC1037b {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final k f4336o0 = new k();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Rect f4337A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Rect f4338B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f4339C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int[] f4340D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f4341E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Drawable f4342F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f4343G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f4344H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Intent f4345I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Intent f4346J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final CharSequence f4347K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View.OnFocusChangeListener f4348L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public View.OnClickListener f4349M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f4350N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f4351O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public I.a f4352P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f4353Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public CharSequence f4354R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f4355S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f4356T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f4357U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f4358V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public CharSequence f4359W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence f4360a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f4361b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f4362c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public SearchableInfo f4363d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Bundle f4364e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Runnable f4365f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Runnable f4366g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final WeakHashMap f4367h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final View.OnClickListener f4368i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public View.OnKeyListener f4369j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f4370k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f4371l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f4372m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public TextWatcher f4373n0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchAutoComplete f4374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f4375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f4376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f4377t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f4378u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f4379v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f4380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f4381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f4382y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f4383z;

    public static class SearchAutoComplete extends AbstractC1114c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f4385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f4386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Runnable f4387h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC0637a.f5562g);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                return (i4 < 640 || i5 < 480) ? 160 : 192;
            }
            return 192;
        }

        public boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void b() {
            if (this.f4386g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f4386g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f4384e <= 0 || super.enoughToFilter();
        }

        @Override // k.AbstractC1114c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4386g) {
                removeCallbacks(this.f4387h);
                post(this.f4387h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z3, int i4, Rect rect) {
            super.onFocusChanged(z3, i4, rect);
            this.f4385f.W();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f4385f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f4385f.hasFocus() && getVisibility() == 0) {
                this.f4386g = true;
                if (SearchView.J(getContext())) {
                    SearchView.f4336o0.c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z3) {
                this.f4386g = false;
                removeCallbacks(this.f4387h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f4386g = true;
                    return;
                }
                this.f4386g = false;
                removeCallbacks(this.f4387h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4385f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f4384e = i4;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f4387h = new a();
            this.f4384e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            SearchView.this.V(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.c0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I.a aVar = SearchView.this.f4352P;
            if (aVar instanceof V) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z3) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f4348L;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z3);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            SearchView.this.y();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f4378u) {
                searchView.S();
                return;
            }
            if (view == searchView.f4380w) {
                searchView.O();
                return;
            }
            if (view == searchView.f4379v) {
                searchView.T();
            } else if (view == searchView.f4381x) {
                searchView.X();
            } else if (view == searchView.f4374q) {
                searchView.E();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f4363d0 == null) {
                return false;
            }
            if (searchView.f4374q.isPopupShowing() && SearchView.this.f4374q.getListSelection() != -1) {
                return SearchView.this.U(view, i4, keyEvent);
            }
            if (SearchView.this.f4374q.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.M(0, null, searchView2.f4374q.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            SearchView.this.T();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
            SearchView.this.P(i4, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            SearchView.this.Q(i4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f4399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f4400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f4401c;

        public k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f4399a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f4400b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f4401c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f4400b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f4399a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView, boolean z3) {
            Method method = this.f4401c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z3));
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    public static class o extends J.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f4402o;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i4) {
                return new o[i4];
            }
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4402o + "}";
        }

        @Override // J.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.f4402o));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4402o = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f4403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f4404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f4405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f4406d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4408f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f4407e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f4404b = new Rect();
            this.f4406d = new Rect();
            this.f4405c = new Rect();
            a(rect, rect2);
            this.f4403a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f4404b.set(rect);
            this.f4406d.set(rect);
            Rect rect3 = this.f4406d;
            int i4 = this.f4407e;
            rect3.inset(-i4, -i4);
            this.f4405c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z3;
            boolean z4;
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z5 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z4 = this.f4408f;
                    if (z4 && !this.f4406d.contains(x3, y3)) {
                        z5 = z4;
                        z3 = false;
                    }
                } else {
                    if (action == 3) {
                        z4 = this.f4408f;
                        this.f4408f = false;
                    }
                    z3 = true;
                    z5 = false;
                }
                z5 = z4;
                z3 = true;
            } else if (this.f4404b.contains(x3, y3)) {
                this.f4408f = true;
                z3 = true;
            } else {
                z3 = true;
                z5 = false;
            }
            if (!z5) {
                return false;
            }
            if (!z3 || this.f4405c.contains(x3, y3)) {
                Rect rect = this.f4405c;
                motionEvent.setLocation(x3 - rect.left, y3 - rect.top);
            } else {
                motionEvent.setLocation(this.f4403a.getWidth() / 2, this.f4403a.getHeight() / 2);
            }
            return this.f4403a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static boolean J(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC0639c.f5586e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC0639c.f5587f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f4374q.setText(charSequence);
        this.f4374q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(Cursor cursor, int i4, String str) {
        int position;
        String strO;
        try {
            String strO2 = V.o(cursor, "suggest_intent_action");
            if (strO2 == null) {
                strO2 = this.f4363d0.getSuggestIntentAction();
            }
            if (strO2 == null) {
                strO2 = "android.intent.action.SEARCH";
            }
            String str2 = strO2;
            String strO3 = V.o(cursor, "suggest_intent_data");
            if (strO3 == null) {
                strO3 = this.f4363d0.getSuggestIntentData();
            }
            if (strO3 != null && (strO = V.o(cursor, "suggest_intent_data_id")) != null) {
                strO3 = strO3 + "/" + Uri.encode(strO);
            }
            return z(str2, strO3 == null ? null : Uri.parse(strO3), V.o(cursor, "suggest_intent_extra_data"), V.o(cursor, "suggest_intent_query"), i4, str);
        } catch (RuntimeException e4) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e4);
            return null;
        }
    }

    public final Intent B(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4364e0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void D() {
        this.f4374q.dismissDropDown();
    }

    public void E() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4374q.refreshAutoCompleteResults();
            return;
        }
        k kVar = f4336o0;
        kVar.b(this.f4374q);
        kVar.a(this.f4374q);
    }

    public final void F(View view, Rect rect) {
        view.getLocationInWindow(this.f4339C);
        getLocationInWindow(this.f4340D);
        int[] iArr = this.f4339C;
        int i4 = iArr[1];
        int[] iArr2 = this.f4340D;
        int i5 = i4 - iArr2[1];
        int i6 = iArr[0] - iArr2[0];
        rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
    }

    public final CharSequence G(CharSequence charSequence) {
        if (!this.f4350N || this.f4342F == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f4374q.getTextSize()) * 1.25d);
        this.f4342F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f4342F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean H() {
        SearchableInfo searchableInfo = this.f4363d0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f4363d0.getVoiceSearchLaunchWebSearch() ? this.f4345I : this.f4363d0.getVoiceSearchLaunchRecognizer() ? this.f4346J : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean I() {
        return this.f4351O;
    }

    public final boolean K() {
        return (this.f4353Q || this.f4358V) && !I();
    }

    public final void L(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e4) {
            Log.e("SearchView", "Failed launch activity: " + intent, e4);
        }
    }

    public void M(int i4, String str, String str2) {
        getContext().startActivity(z("android.intent.action.SEARCH", null, null, str2, i4, str));
    }

    public final boolean N(int i4, int i5, String str) {
        Cursor cursorB = this.f4352P.b();
        if (cursorB == null || !cursorB.moveToPosition(i4)) {
            return false;
        }
        L(A(cursorB, i5, str));
        return true;
    }

    public void O() {
        if (!TextUtils.isEmpty(this.f4374q.getText())) {
            this.f4374q.setText("");
            this.f4374q.requestFocus();
            this.f4374q.setImeVisibility(true);
        } else if (this.f4350N) {
            clearFocus();
            h0(true);
        }
    }

    public boolean P(int i4, int i5, String str) {
        N(i4, 0, null);
        this.f4374q.setImeVisibility(false);
        D();
        return true;
    }

    public boolean Q(int i4) {
        Z(i4);
        return true;
    }

    public void R(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void S() {
        h0(false);
        this.f4374q.requestFocus();
        this.f4374q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f4349M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void T() {
        Editable text = this.f4374q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f4363d0 != null) {
            M(0, null, text.toString());
        }
        this.f4374q.setImeVisibility(false);
        D();
    }

    public boolean U(View view, int i4, KeyEvent keyEvent) {
        if (this.f4363d0 != null && this.f4352P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 == 66 || i4 == 84 || i4 == 61) {
                return P(this.f4374q.getListSelection(), 0, null);
            }
            if (i4 == 21 || i4 == 22) {
                this.f4374q.setSelection(i4 == 21 ? 0 : this.f4374q.length());
                this.f4374q.setListSelection(0);
                this.f4374q.clearListSelection();
                f4336o0.c(this.f4374q, true);
                return true;
            }
            if (i4 == 19) {
                this.f4374q.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void V(CharSequence charSequence) {
        Editable text = this.f4374q.getText();
        this.f4360a0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        g0(!zIsEmpty);
        i0(zIsEmpty);
        b0();
        f0();
        this.f4359W = charSequence.toString();
    }

    public void W() {
        h0(I());
        Y();
        if (this.f4374q.hasFocus()) {
            E();
        }
    }

    public void X() {
        SearchableInfo searchableInfo = this.f4363d0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(C(this.f4345I, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(B(this.f4346J, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void Y() {
        post(this.f4365f0);
    }

    public final void Z(int i4) {
        Editable text = this.f4374q.getText();
        Cursor cursorB = this.f4352P.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceC = this.f4352P.c(cursorB);
        if (charSequenceC != null) {
            setQuery(charSequenceC);
        } else {
            setQuery(text);
        }
    }

    public void a0(CharSequence charSequence, boolean z3) {
        this.f4374q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f4374q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f4360a0 = charSequence;
        }
        if (!z3 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        T();
    }

    @Override // i.InterfaceC1037b
    public void b() {
        if (this.f4361b0) {
            return;
        }
        this.f4361b0 = true;
        int imeOptions = this.f4374q.getImeOptions();
        this.f4362c0 = imeOptions;
        this.f4374q.setImeOptions(imeOptions | 33554432);
        this.f4374q.setText("");
        setIconified(false);
    }

    public final void b0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f4374q.getText());
        this.f4380w.setVisibility(!zIsEmpty || (this.f4350N && !this.f4361b0) ? 0 : 8);
        Drawable drawable = this.f4380w.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // i.InterfaceC1037b
    public void c() {
        a0("", false);
        clearFocus();
        h0(true);
        this.f4374q.setImeOptions(this.f4362c0);
        this.f4361b0 = false;
    }

    public void c0() {
        int[] iArr = this.f4374q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f4376s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4377t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f4356T = true;
        super.clearFocus();
        this.f4374q.clearFocus();
        this.f4374q.setImeVisibility(false);
        this.f4356T = false;
    }

    public final void d0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f4374q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(G(queryHint));
    }

    public final void e0() {
        this.f4374q.setThreshold(this.f4363d0.getSuggestThreshold());
        this.f4374q.setImeOptions(this.f4363d0.getImeOptions());
        int inputType = this.f4363d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f4363d0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f4374q.setInputType(inputType);
        I.a aVar = this.f4352P;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f4363d0.getSuggestAuthority() != null) {
            V v4 = new V(getContext(), this, this.f4363d0, this.f4367h0);
            this.f4352P = v4;
            this.f4374q.setAdapter(v4);
            ((V) this.f4352P).x(this.f4355S ? 2 : 1);
        }
    }

    public final void f0() {
        this.f4377t.setVisibility((K() && (this.f4379v.getVisibility() == 0 || this.f4381x.getVisibility() == 0)) ? 0 : 8);
    }

    public final void g0(boolean z3) {
        this.f4379v.setVisibility((this.f4353Q && K() && hasFocus() && (z3 || !this.f4358V)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f4374q.getImeOptions();
    }

    public int getInputType() {
        return this.f4374q.getInputType();
    }

    public int getMaxWidth() {
        return this.f4357U;
    }

    public CharSequence getQuery() {
        return this.f4374q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f4354R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f4363d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f4347K : getContext().getText(this.f4363d0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f4344H;
    }

    public int getSuggestionRowLayout() {
        return this.f4343G;
    }

    public I.a getSuggestionsAdapter() {
        return this.f4352P;
    }

    public final void h0(boolean z3) {
        this.f4351O = z3;
        int i4 = 8;
        int i5 = z3 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f4374q.getText());
        this.f4378u.setVisibility(i5);
        g0(!zIsEmpty);
        this.f4375r.setVisibility(z3 ? 8 : 0);
        if (this.f4341E.getDrawable() != null && !this.f4350N) {
            i4 = 0;
        }
        this.f4341E.setVisibility(i4);
        b0();
        i0(zIsEmpty);
        f0();
    }

    public final void i0(boolean z3) {
        int i4 = 8;
        if (this.f4358V && !I() && z3) {
            this.f4379v.setVisibility(8);
            i4 = 0;
        }
        this.f4381x.setVisibility(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f4365f0);
        post(this.f4366g0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
            F(this.f4374q, this.f4337A);
            Rect rect = this.f4338B;
            Rect rect2 = this.f4337A;
            rect.set(rect2.left, 0, rect2.right, i7 - i5);
            p pVar = this.f4383z;
            if (pVar != null) {
                pVar.a(this.f4338B, this.f4337A);
                return;
            }
            p pVar2 = new p(this.f4338B, this.f4337A, this.f4374q);
            this.f4383z = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        if (I()) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f4357U;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f4357U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f4357U) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        h0(oVar.f4402o);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f4402o = I();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        if (this.f4356T || !isFocusable()) {
            return false;
        }
        if (I()) {
            return super.requestFocus(i4, rect);
        }
        boolean zRequestFocus = this.f4374q.requestFocus(i4, rect);
        if (zRequestFocus) {
            h0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4364e0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            O();
        } else {
            S();
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f4350N == z3) {
            return;
        }
        this.f4350N = z3;
        h0(z3);
        d0();
    }

    public void setImeOptions(int i4) {
        this.f4374q.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f4374q.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f4357U = i4;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4348L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f4349M = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4354R = charSequence;
        d0();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.f4355S = z3;
        I.a aVar = this.f4352P;
        if (aVar instanceof V) {
            ((V) aVar).x(z3 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f4363d0 = searchableInfo;
        if (searchableInfo != null) {
            e0();
            d0();
        }
        boolean zH = H();
        this.f4358V = zH;
        if (zH) {
            this.f4374q.setPrivateImeOptions("nm");
        }
        h0(I());
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f4353Q = z3;
        h0(I());
    }

    public void setSuggestionsAdapter(I.a aVar) {
        this.f4352P = aVar;
        this.f4374q.setAdapter(aVar);
    }

    public void y() {
        if (this.f4382y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f4376s.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = g0.b(this);
            int dimensionPixelSize = this.f4350N ? resources.getDimensionPixelSize(AbstractC0639c.f5584c) + resources.getDimensionPixelSize(AbstractC0639c.f5585d) : 0;
            this.f4374q.getDropDownBackground().getPadding(rect);
            this.f4374q.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f4374q.setDropDownWidth((((this.f4382y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent z(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4360a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f4364e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f4363d0.getSearchActivity());
        return intent;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0637a.f5571p);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4337A = new Rect();
        this.f4338B = new Rect();
        this.f4339C = new int[2];
        this.f4340D = new int[2];
        this.f4365f0 = new b();
        this.f4366g0 = new c();
        this.f4367h0 = new WeakHashMap();
        f fVar = new f();
        this.f4368i0 = fVar;
        this.f4369j0 = new g();
        h hVar = new h();
        this.f4370k0 = hVar;
        i iVar = new i();
        this.f4371l0 = iVar;
        j jVar = new j();
        this.f4372m0 = jVar;
        this.f4373n0 = new a();
        a0 a0VarR = a0.r(context, attributeSet, AbstractC0645i.f5702C1, i4, 0);
        LayoutInflater.from(context).inflate(a0VarR.l(AbstractC0645i.f5742M1, AbstractC0642f.f5677l), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC0641e.f5659t);
        this.f4374q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f4375r = findViewById(AbstractC0641e.f5655p);
        View viewFindViewById = findViewById(AbstractC0641e.f5658s);
        this.f4376s = viewFindViewById;
        View viewFindViewById2 = findViewById(AbstractC0641e.f5665z);
        this.f4377t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC0641e.f5653n);
        this.f4378u = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC0641e.f5656q);
        this.f4379v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC0641e.f5654o);
        this.f4380w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC0641e.f5660u);
        this.f4381x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC0641e.f5657r);
        this.f4341E = imageView5;
        AbstractC0241y.G(viewFindViewById, a0VarR.f(AbstractC0645i.f5746N1));
        AbstractC0241y.G(viewFindViewById2, a0VarR.f(AbstractC0645i.f5762R1));
        imageView.setImageDrawable(a0VarR.f(AbstractC0645i.f5758Q1));
        imageView2.setImageDrawable(a0VarR.f(AbstractC0645i.f5734K1));
        imageView3.setImageDrawable(a0VarR.f(AbstractC0645i.f5722H1));
        imageView4.setImageDrawable(a0VarR.f(AbstractC0645i.f5770T1));
        imageView5.setImageDrawable(a0VarR.f(AbstractC0645i.f5758Q1));
        this.f4342F = a0VarR.f(AbstractC0645i.f5754P1);
        c0.a(imageView, getResources().getString(AbstractC0643g.f5690l));
        this.f4343G = a0VarR.l(AbstractC0645i.f5766S1, AbstractC0642f.f5676k);
        this.f4344H = a0VarR.l(AbstractC0645i.f5726I1, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f4373n0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f4369j0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a0VarR.a(AbstractC0645i.f5738L1, true));
        int iE = a0VarR.e(AbstractC0645i.f5710E1, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.f4347K = a0VarR.n(AbstractC0645i.f5730J1);
        this.f4354R = a0VarR.n(AbstractC0645i.f5750O1);
        int i5 = a0VarR.i(AbstractC0645i.f5718G1, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i6 = a0VarR.i(AbstractC0645i.f5714F1, -1);
        if (i6 != -1) {
            setInputType(i6);
        }
        setFocusable(a0VarR.a(AbstractC0645i.f5706D1, true));
        a0VarR.s();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4345I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4346J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4382y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        h0(this.f4350N);
        d0();
    }
}
