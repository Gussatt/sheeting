package H;

import A.k;
import O.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class a {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i4) {
            textView.setBreakStrategy(i4);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i4) {
            textView.setHyphenationFrequency(i4);
        }
    }

    public static class b {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    public static class d implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f1696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f1697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class f1698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f1699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1701f = false;

        public d(ActionMode.Callback callback, TextView textView) {
            this.f1696a = callback;
            this.f1697b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (e(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        public final boolean d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        public final void f(Menu menu) {
            Context context = this.f1697b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z3 = this.f1701f;
            Class cls = Integer.TYPE;
            if (!z3) {
                this.f1701f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f1698c = cls2;
                    this.f1699d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f1700e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f1698c = null;
                    this.f1699d = null;
                    this.f1700e = false;
                }
            }
            try {
                Method declaredMethod = (this.f1700e && this.f1698c.isInstance(menu)) ? this.f1699d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List listC = c(context, packageManager);
                for (int i4 = 0; i4 < listC.size(); i4++) {
                    ResolveInfo resolveInfo = (ResolveInfo) listC.get(i4);
                    menu.add(0, 0, i4 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f1697b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f1696a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f1696a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f1696a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            f(menu);
            return this.f1696a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static TextDirectionHeuristic d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(c.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z3 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case h.LONG_FIELD_NUMBER /* 4 */:
                break;
            case h.STRING_FIELD_NUMBER /* 5 */:
                break;
            case h.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case h.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            default:
                if (!z3) {
                }
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    public static k.a e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new k.a(c.c(textView));
        }
        k.a.C0000a c0000a = new k.a.C0000a(new TextPaint(textView.getPaint()));
        c0000a.b(a.a(textView));
        c0000a.c(a.d(textView));
        c0000a.d(d(textView));
        return c0000a.a();
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        B.f.b(textView);
        a.f(textView, colorStateList);
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        B.f.b(textView);
        a.g(textView, mode);
    }

    public static void h(TextView textView, int i4) {
        B.f.a(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            c.d(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void i(TextView textView, int i4) {
        B.f.a(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static void j(TextView textView, int i4) {
        B.f.a(i4);
        if (i4 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public static void k(TextView textView, k kVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        e(textView);
        throw null;
    }

    public static void l(TextView textView, k.a aVar) {
        textView.setTextDirection(c(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.e(textView, aVar.b());
        a.h(textView, aVar.c());
    }

    public static ActionMode.Callback m(TextView textView, ActionMode.Callback callback) {
        int i4 = Build.VERSION.SDK_INT;
        return (i4 < 26 || i4 > 27 || (callback instanceof d) || callback == null) ? callback : new d(callback, textView);
    }

    public static class c {
        public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void d(TextView textView, int i4) {
            textView.setFirstBaselineToTopHeight(i4);
        }

        public static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
