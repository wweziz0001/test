package S;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f1983a;

    public j(TransformationMethod transformationMethod) {
        this.f1983a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1983a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || Q.j.a().b() != 1) {
            return charSequence;
        }
        Q.j jVarA = Q.j.a();
        jVarA.getClass();
        return jVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f1983a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i, rect);
        }
    }
}
