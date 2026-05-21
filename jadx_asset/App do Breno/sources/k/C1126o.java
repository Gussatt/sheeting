package k;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: k.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1126o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f8833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextClassifier f8834b;

    public C1126o(TextView textView) {
        this.f8833a = (TextView) B.f.b(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f8834b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerA = AbstractC1123l.a(this.f8833a.getContext().getSystemService(AbstractC1122k.a()));
        return textClassificationManagerA != null ? textClassificationManagerA.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f8834b = textClassifier;
    }
}
