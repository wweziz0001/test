package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class A implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L f4220l;

    public A(L l3) {
        this.f4220l = l3;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        T tG;
        boolean zEquals = C0257y.class.getName().equals(str);
        L l3 = this.f4220l;
        if (zEquals) {
            return new C0257y(context, attributeSet, l3);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U.a.f2257a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = r.class.isAssignableFrom(F.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                r rVarB = resourceId != -1 ? l3.B(resourceId) : null;
                if (rVarB == null && string != null) {
                    rVarB = l3.C(string);
                }
                if (rVarB == null && id != -1) {
                    rVarB = l3.B(id);
                }
                if (rVarB == null) {
                    F fG = l3.G();
                    context.getClassLoader();
                    rVarB = fG.a(attributeValue);
                    rVarB.y = true;
                    rVarB.f4417H = resourceId != 0 ? resourceId : id;
                    rVarB.f4418I = id;
                    rVarB.f4419J = string;
                    rVarB.f4452z = true;
                    rVarB.f4413D = l3;
                    C0254v c0254v = l3.f4272v;
                    rVarB.f4414E = c0254v;
                    AbstractActivityC0255w abstractActivityC0255w = c0254v.f4459r;
                    rVarB.f4423O = true;
                    if ((c0254v != null ? c0254v.f4458q : null) != null) {
                        rVarB.f4423O = true;
                    }
                    tG = l3.a(rVarB);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + rVarB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (rVarB.f4452z) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    rVarB.f4452z = true;
                    rVarB.f4413D = l3;
                    C0254v c0254v2 = l3.f4272v;
                    rVarB.f4414E = c0254v2;
                    AbstractActivityC0255w abstractActivityC0255w2 = c0254v2.f4459r;
                    rVarB.f4423O = true;
                    if ((c0254v2 != null ? c0254v2.f4458q : null) != null) {
                        rVarB.f4423O = true;
                    }
                    tG = l3.g(rVarB);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + rVarB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                V.c cVar = V.d.f2312a;
                V.d.b(new V.a(rVarB, "Attempting to use <fragment> tag to add fragment " + rVarB + " to container " + viewGroup));
                V.d.a(rVarB).getClass();
                rVarB.f4424P = viewGroup;
                tG.k();
                tG.j();
                io.flutter.embedding.android.D d5 = rVarB.f4425Q;
                if (d5 == null) {
                    throw new IllegalStateException(AbstractC0307a.k("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    d5.setId(resourceId);
                }
                if (rVarB.f4425Q.getTag() == null) {
                    rVarB.f4425Q.setTag(string);
                }
                rVarB.f4425Q.addOnAttachStateChangeListener(new N1.i(this, tG));
                return rVarB.f4425Q;
            }
        }
        return null;
    }
}
