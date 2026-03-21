package S;

import a.AbstractC0149a;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0149a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1977a;

    public g(TextView textView) {
        this.f1977a = new f(textView);
    }

    @Override // a.AbstractC0149a
    public final void B(boolean z4) {
        if (Q.j.f1713j != null) {
            this.f1977a.B(z4);
        }
    }

    @Override // a.AbstractC0149a
    public final void C(boolean z4) {
        boolean z5 = Q.j.f1713j != null;
        f fVar = this.f1977a;
        if (z5) {
            fVar.C(z4);
        } else {
            fVar.f1976c = z4;
        }
    }

    @Override // a.AbstractC0149a
    public final TransformationMethod L(TransformationMethod transformationMethod) {
        return !(Q.j.f1713j != null) ? transformationMethod : this.f1977a.L(transformationMethod);
    }

    @Override // a.AbstractC0149a
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        return !(Q.j.f1713j != null) ? inputFilterArr : this.f1977a.v(inputFilterArr);
    }

    @Override // a.AbstractC0149a
    public final boolean x() {
        return this.f1977a.f1976c;
    }
}
