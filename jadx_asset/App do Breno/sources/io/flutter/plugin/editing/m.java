package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.n;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import l2.AbstractC1388b;
import v2.C1591B;

/* JADX INFO: loaded from: classes.dex */
public class m extends BaseInputConnection implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f7901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2.w f7903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1591B f7904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f7905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EditorInfo f7906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ExtractedTextRequest f7907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CursorAnchorInfo.Builder f7909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ExtractedText f7910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InputMethodManager f7911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Layout f7912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1059a f7913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f7914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7915o;

    public interface a {
        boolean b(KeyEvent keyEvent);
    }

    public m(View view, int i4, C1591B c1591b, v2.w wVar, a aVar, n nVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f7908h = false;
        this.f7910j = new ExtractedText();
        this.f7915o = 0;
        this.f7901a = view;
        this.f7902b = i4;
        this.f7904d = c1591b;
        this.f7903c = wVar;
        this.f7905e = nVar;
        nVar.a(this);
        this.f7906f = editorInfo;
        this.f7914n = aVar;
        this.f7913m = new C1059a(flutterJNI);
        this.f7912l = new DynamicLayout(nVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7911k = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.n.b
    public void a(boolean z3, boolean z4, boolean z5) {
        this.f7911k.updateSelection(this.f7901a, this.f7905e.i(), this.f7905e.h(), this.f7905e.g(), this.f7905e.f());
        ExtractedTextRequest extractedTextRequest = this.f7907g;
        if (extractedTextRequest != null) {
            this.f7911k.updateExtractedText(this.f7901a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f7908h) {
            this.f7911k.updateCursorAnchorInfo(this.f7901a, c());
        }
    }

    public final boolean b(int i4) {
        if (i4 == 16908319) {
            setSelection(0, this.f7905e.length());
            return true;
        }
        if (i4 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f7905e);
            int selectionEnd = Selection.getSelectionEnd(this.f7905e);
            if (selectionStart != selectionEnd) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f7901a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f7905e.subSequence(iMin, iMax)));
                this.f7905e.delete(iMin, iMax);
                setSelection(iMin, iMin);
            }
            return true;
        }
        if (i4 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f7905e);
            int selectionEnd2 = Selection.getSelectionEnd(this.f7905e);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f7901a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f7905e.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i4 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f7901a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(this.f7901a.getContext());
            int iMax2 = Math.max(0, Selection.getSelectionStart(this.f7905e));
            int iMax3 = Math.max(0, Selection.getSelectionEnd(this.f7905e));
            int iMin2 = Math.min(iMax2, iMax3);
            int iMax4 = Math.max(iMax2, iMax3);
            if (iMin2 != iMax4) {
                this.f7905e.delete(iMin2, iMax4);
            }
            this.f7905e.insert(iMin2, charSequenceCoerceToText);
            int length = iMin2 + charSequenceCoerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f7905e.b();
        this.f7915o++;
        return super.beginBatchEdit();
    }

    public final CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f7909i;
        if (builder == null) {
            this.f7909i = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f7909i.setSelectionRange(this.f7905e.i(), this.f7905e.h());
        int iG = this.f7905e.g();
        int iF = this.f7905e.f();
        if (iG < 0 || iF <= iG) {
            this.f7909i.setComposingText(-1, "");
        } else {
            this.f7909i.setComposingText(iG, this.f7905e.toString().subSequence(iG, iF));
        }
        return this.f7909i.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i4) {
        return super.clearMetaKeyStates(i4);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f7905e.l(this);
        while (this.f7915o > 0) {
            endBatchEdit();
            this.f7915o--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i4 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f7901a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                byte[] bArrH = h(inputStreamOpenInputStream, 65536);
                                HashMap map = new HashMap();
                                map.put("mimeType", mimeType);
                                map.put("data", bArrH);
                                map.put("uri", contentUri.toString());
                                this.f7904d.b(this.f7902b, map);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i4) {
        return super.commitText(charSequence, i4);
    }

    public final ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f7910j;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f7905e.i();
        this.f7910j.selectionEnd = this.f7905e.h();
        this.f7910j.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f7905e.toString() : this.f7905e;
        return this.f7910j;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i4, int i5) {
        if (this.f7905e.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i4, i5);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        return super.deleteSurroundingTextInCodePoints(i4, i5);
    }

    public final boolean e(boolean z3, boolean z4) {
        int selectionStart = Selection.getSelectionStart(this.f7905e);
        int selectionEnd = Selection.getSelectionEnd(this.f7905e);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int iMax = z3 ? Math.max(this.f7913m.b(this.f7905e, selectionEnd), 0) : Math.min(this.f7913m.a(this.f7905e, selectionEnd), this.f7905e.length());
        if (selectionStart != selectionEnd || z4) {
            setSelection(selectionStart, iMax);
            return true;
        }
        setSelection(iMax, iMax);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f7915o--;
        this.f7905e.d();
        return zEndBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f7906f;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f7905e);
            int selectionEnd = Selection.getSelectionEnd(this.f7905e);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int iMin = Math.min(selectionStart, selectionEnd);
                int iMax = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (iMin != iMax) {
                    this.f7905e.delete(iMin, iMax);
                }
                this.f7905e.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                int i4 = iMin + 1;
                setSelection(i4, i4);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public final boolean g(boolean z3, boolean z4) {
        int selectionStart = Selection.getSelectionStart(this.f7905e);
        int selectionEnd = Selection.getSelectionEnd(this.f7905e);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        beginBatchEdit();
        if (z5) {
            if (z3) {
                Selection.moveUp(this.f7905e, this.f7912l);
            } else {
                Selection.moveDown(this.f7905e, this.f7912l);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f7905e);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z3) {
                Selection.extendUp(this.f7905e, this.f7912l);
            } else {
                Selection.extendDown(this.f7905e, this.f7912l);
            }
            setSelection(Selection.getSelectionStart(this.f7905e), Selection.getSelectionEnd(this.f7905e));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f7905e;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i4) {
        boolean z3 = (i4 & 1) != 0;
        if (z3 == (this.f7907g == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z3 ? "on" : "off");
            AbstractC1388b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f7907g = z3 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    public final byte[] h(InputStream inputStream, int i4) {
        int i5;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i4];
        while (true) {
            try {
                i5 = inputStream.read(bArr);
            } catch (IOException unused) {
                i5 = -1;
            }
            if (i5 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i5);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i4) {
        beginBatchEdit();
        boolean zB = b(i4);
        endBatchEdit();
        return zB;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i4) {
        if (i4 == 0) {
            this.f7904d.o(this.f7902b);
        } else if (i4 == 1) {
            this.f7904d.g(this.f7902b);
        } else if (i4 == 2) {
            this.f7904d.f(this.f7902b);
        } else if (i4 == 3) {
            this.f7904d.l(this.f7902b);
        } else if (i4 == 4) {
            this.f7904d.m(this.f7902b);
        } else if (i4 == 5) {
            this.f7904d.h(this.f7902b);
        } else if (i4 != 7) {
            this.f7904d.e(this.f7902b);
        } else {
            this.f7904d.j(this.f7902b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f7904d.i(this.f7902b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i4) {
        if ((i4 & 1) != 0) {
            this.f7911k.updateCursorAnchorInfo(this.f7901a, c());
        }
        boolean z3 = (i4 & 2) != 0;
        if (z3 != this.f7908h) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z3 ? "on" : "off");
            AbstractC1388b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f7908h = z3;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f7914n.b(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i4, int i5) {
        return super.setComposingRegion(i4, i5);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i4) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i4) : super.setComposingText(charSequence, i4);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i4, int i5) {
        beginBatchEdit();
        boolean selection = super.setSelection(i4, i5);
        endBatchEdit();
        return selection;
    }

    public m(View view, int i4, C1591B c1591b, v2.w wVar, a aVar, n nVar, EditorInfo editorInfo) {
        this(view, i4, c1591b, wVar, aVar, nVar, editorInfo, new FlutterJNI());
    }
}
