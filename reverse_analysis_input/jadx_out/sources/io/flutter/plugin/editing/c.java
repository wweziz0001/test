package io.flutter.plugin.editing;

import Z1.m;
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
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.E;
import io.flutter.embedding.android.D;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import n3.C0707q;

/* JADX INFO: loaded from: classes.dex */
public final class c extends BaseInputConnection implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f6680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z1.e f6682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f6683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EditorInfo f6684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f6685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f6687h;
    public final ExtractedText i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InputMethodManager f6688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DynamicLayout f6689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E f6690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f6691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6692n;

    public c(D d5, int i, Z1.e eVar, m mVar, f fVar, EditorInfo editorInfo) {
        FlutterJNI flutterJNI = new FlutterJNI();
        super(d5, true);
        this.f6686g = false;
        this.i = new ExtractedText();
        this.f6692n = 0;
        this.f6680a = d5;
        this.f6681b = i;
        this.f6682c = eVar;
        this.f6683d = fVar;
        fVar.a(this);
        this.f6684e = editorInfo;
        this.f6691m = mVar;
        this.f6690l = new E(flutterJNI, 7);
        this.f6689k = new DynamicLayout(fVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f6688j = (InputMethodManager) d5.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.e
    public final void a(boolean z4) {
        f fVar = this.f6683d;
        fVar.getClass();
        this.f6688j.updateSelection(this.f6680a, Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar), BaseInputConnection.getComposingSpanStart(fVar), BaseInputConnection.getComposingSpanEnd(fVar));
        ExtractedTextRequest extractedTextRequest = this.f6685f;
        InputMethodManager inputMethodManager = this.f6688j;
        D d5 = this.f6680a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(d5, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f6686g) {
            inputMethodManager.updateCursorAnchorInfo(d5, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f6687h;
        if (builder == null) {
            this.f6687h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f6687h;
        f fVar = this.f6683d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        fVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(fVar));
        fVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        fVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f6687h.setComposingText(-1, "");
        } else {
            this.f6687h.setComposingText(composingSpanStart, fVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f6687h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f6683d.b();
        this.f6692n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence string = this.f6683d;
        string.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(string);
        string.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(string);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            string = string.toString();
        }
        extractedText.text = string;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f6683d.e(this);
        while (this.f6692n > 0) {
            endBatchEdit();
            this.f6692n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        int i5;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f6680a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (inputStreamOpenInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i5 = inputStreamOpenInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i5 = -1;
                                    }
                                    if (i5 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap map = new HashMap();
                                        map.put("mimeType", mimeType);
                                        map.put("data", byteArray);
                                        map.put("uri", contentUri.toString());
                                        Z1.e eVar = this.f6682c;
                                        eVar.getClass();
                                        ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f6681b), "TextInputAction.commitContent", map), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i5);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028b, code lost:
    
        r14 = r14 + r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x003f A[ADDED_TO_REGION, EDGE_INSN: B:197:0x003f->B:18:0x003f BREAK  A[LOOP:2: B:63:0x00fe->B:200:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01ad A[ADDED_TO_REGION, EDGE_INSN: B:207:0x01ad->B:108:0x01ad BREAK  A[LOOP:4: B:143:0x0232->B:210:?], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.c.d(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i5) {
        f fVar = this.f6683d;
        fVar.getClass();
        if (Selection.getSelectionStart(fVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i, i5);
    }

    public final boolean e(boolean z4, boolean z5) {
        f fVar = this.f6683d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        boolean z6 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z5) {
            z6 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f6689k;
        if (z6) {
            if (z4) {
                Selection.moveUp(fVar, dynamicLayout);
            } else {
                Selection.moveDown(fVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(fVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z4) {
                Selection.extendUp(fVar, dynamicLayout);
            } else {
                Selection.extendDown(fVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean zEndBatchEdit = super.endBatchEdit();
        this.f6692n--;
        this.f6683d.c();
        return zEndBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f6683d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        this.f6685f = (i & 1) != 0 ? extractedTextRequest : null;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        beginBatchEdit();
        boolean z4 = true;
        f fVar = this.f6683d;
        if (i == 16908319) {
            setSelection(0, fVar.length());
        } else {
            D d5 = this.f6680a;
            if (i == 16908320) {
                int selectionStart = Selection.getSelectionStart(fVar);
                int selectionEnd = Selection.getSelectionEnd(fVar);
                if (selectionStart != selectionEnd) {
                    int iMin = Math.min(selectionStart, selectionEnd);
                    int iMax = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) d5.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(iMin, iMax)));
                    fVar.delete(iMin, iMax);
                    setSelection(iMin, iMin);
                }
            } else if (i == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(fVar);
                int selectionEnd2 = Selection.getSelectionEnd(fVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) d5.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i == 16908322) {
                ClipData primaryClip = ((ClipboardManager) d5.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence charSequenceCoerceToText = primaryClip.getItemAt(0).coerceToText(d5.getContext());
                    int iMax2 = Math.max(0, Selection.getSelectionStart(fVar));
                    int iMax3 = Math.max(0, Selection.getSelectionEnd(fVar));
                    int iMin2 = Math.min(iMax2, iMax3);
                    int iMax4 = Math.max(iMax2, iMax3);
                    if (iMin2 != iMax4) {
                        fVar.delete(iMin2, iMax4);
                    }
                    fVar.insert(iMin2, charSequenceCoerceToText);
                    int length = charSequenceCoerceToText.length() + iMin2;
                    setSelection(length, length);
                }
            } else {
                z4 = false;
            }
        }
        endBatchEdit();
        return z4;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i5 = this.f6681b;
        Z1.e eVar = this.f6682c;
        if (i == 0) {
            eVar.getClass();
            ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.unspecified"), null);
        } else if (i == 1) {
            eVar.getClass();
            ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.newline"), null);
        } else if (i == 2) {
            eVar.getClass();
            ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.go"), null);
        } else if (i == 3) {
            eVar.getClass();
            ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.search"), null);
        } else if (i == 4) {
            eVar.getClass();
            ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.send"), null);
        } else if (i == 5) {
            eVar.getClass();
            ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.next"), null);
        } else if (i != 7) {
            eVar.getClass();
            ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.done"), null);
        } else {
            eVar.getClass();
            ((C0707q) eVar.f3001m).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i5), "TextInputAction.previous"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Z1.e eVar = this.f6682c;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        ((C0707q) eVar.f3001m).a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f6681b), map), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        if ((i & 1) != 0) {
            this.f6688j.updateCursorAnchorInfo(this.f6680a, b());
        }
        this.f6686g = (i & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f6691m.w(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        beginBatchEdit();
        boolean zCommitText = charSequence.length() == 0 ? super.commitText(charSequence, i) : super.setComposingText(charSequence, i);
        endBatchEdit();
        return zCommitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i5) {
        beginBatchEdit();
        boolean selection = super.setSelection(i, i5);
        endBatchEdit();
        return selection;
    }
}
