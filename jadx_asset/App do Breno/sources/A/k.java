package A;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f0a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f1b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f4e;

        /* JADX INFO: renamed from: A.k$a$a, reason: collision with other inner class name */
        public static class C0000a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextPaint f5a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f7c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f8d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f6b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0000a(TextPaint textPaint) {
                this.f5a = textPaint;
            }

            public a a() {
                return new a(this.f5a, this.f6b, this.f7c, this.f8d);
            }

            public C0000a b(int i4) {
                this.f7c = i4;
                return this;
            }

            public C0000a c(int i4) {
                this.f8d = i4;
                return this;
            }

            public C0000a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f6b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f4e = j.a(textPaint).setBreakStrategy(i4).setHyphenationFrequency(i5).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f4e = null;
            }
            this.f0a = textPaint;
            this.f1b = textDirectionHeuristic;
            this.f2c = i4;
            this.f3d = i5;
        }

        public boolean a(a aVar) {
            if (this.f2c == aVar.b() && this.f3d == aVar.c() && this.f0a.getTextSize() == aVar.e().getTextSize() && this.f0a.getTextScaleX() == aVar.e().getTextScaleX() && this.f0a.getTextSkewX() == aVar.e().getTextSkewX() && this.f0a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f0a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f0a.getFlags() == aVar.e().getFlags() && this.f0a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f0a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f0a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f2c;
        }

        public int c() {
            return this.f3d;
        }

        public TextDirectionHeuristic d() {
            return this.f1b;
        }

        public TextPaint e() {
            return this.f0a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f1b == aVar.d();
        }

        public int hashCode() {
            return B.c.b(Float.valueOf(this.f0a.getTextSize()), Float.valueOf(this.f0a.getTextScaleX()), Float.valueOf(this.f0a.getTextSkewX()), Float.valueOf(this.f0a.getLetterSpacing()), Integer.valueOf(this.f0a.getFlags()), this.f0a.getTextLocales(), this.f0a.getTypeface(), Boolean.valueOf(this.f0a.isElegantTextHeight()), this.f1b, Integer.valueOf(this.f2c), Integer.valueOf(this.f3d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f0a.getTextSize());
            sb.append(", textScaleX=" + this.f0a.getTextScaleX());
            sb.append(", textSkewX=" + this.f0a.getTextSkewX());
            int i4 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f0a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f0a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f0a.getTextLocales());
            sb.append(", typeface=" + this.f0a.getTypeface());
            if (i4 >= 26) {
                sb.append(", variationSettings=" + this.f0a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f1b);
            sb.append(", breakStrategy=" + this.f2c);
            sb.append(", hyphenationFrequency=" + this.f3d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f0a = params.getTextPaint();
            this.f1b = params.getTextDirection();
            this.f2c = params.getBreakStrategy();
            this.f3d = params.getHyphenationFrequency();
            this.f4e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
