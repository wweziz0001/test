package S;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.b f1967b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        A0.b bVar = new A0.b(26);
        super(inputConnection, false);
        this.f1966a = editText;
        this.f1967b = bVar;
        if (Q.j.f1713j != null) {
            Q.j jVarA = Q.j.a();
            if (jVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            Q.f fVar = jVarA.f1718e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            R.b bVar2 = (R.b) fVar.f1709c.f3012l;
            int iA = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar2.f376o).getInt(iA + bVar2.f373l) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f1707a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i5) {
        Editable editableText = this.f1966a.getEditableText();
        this.f1967b.getClass();
        return A0.b.r(this, editableText, i, i5, false) || super.deleteSurroundingText(i, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i5) {
        Editable editableText = this.f1966a.getEditableText();
        this.f1967b.getClass();
        return A0.b.r(this, editableText, i, i5, true) || super.deleteSurroundingTextInCodePoints(i, i5);
    }
}
