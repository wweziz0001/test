package S;

import a.AbstractC0149a;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0149a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1976c = true;

    public f(TextView textView) {
        this.f1974a = textView;
        this.f1975b = new d(textView);
    }

    @Override // a.AbstractC0149a
    public final void B(boolean z4) {
        if (z4) {
            TextView textView = this.f1974a;
            textView.setTransformationMethod(L(textView.getTransformationMethod()));
        }
    }

    @Override // a.AbstractC0149a
    public final void C(boolean z4) {
        this.f1976c = z4;
        TextView textView = this.f1974a;
        textView.setTransformationMethod(L(textView.getTransformationMethod()));
        textView.setFilters(v(textView.getFilters()));
    }

    @Override // a.AbstractC0149a
    public final TransformationMethod L(TransformationMethod transformationMethod) {
        return this.f1976c ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f1983a : transformationMethod;
    }

    @Override // a.AbstractC0149a
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        if (!this.f1976c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            d dVar = this.f1975b;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i7] == dVar) {
                return inputFilterArr;
            }
            i7++;
        }
    }

    @Override // a.AbstractC0149a
    public final boolean x() {
        return this.f1976c;
    }
}
