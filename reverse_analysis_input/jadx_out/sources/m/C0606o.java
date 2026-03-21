package m;

import a.AbstractC0149a;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import h.AbstractC0441a;

/* JADX INFO: renamed from: m.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0606o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B0.d f8458b;

    public C0606o(TextView textView) {
        this.f8457a = textView;
        B0.d dVar = new B0.d();
        dVar.f190l = new S.g(textView);
        this.f8458b = dVar;
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f8457a.getContext().obtainStyledAttributes(attributeSet, AbstractC0441a.f5888g, i, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((AbstractC0149a) this.f8458b.f190l).C(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
