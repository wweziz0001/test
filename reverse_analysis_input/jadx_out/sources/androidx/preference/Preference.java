package androidx.preference;

import a0.C0200z;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.example.hqp_mobile_app.R;
import o1.AbstractC0717a;
import v.AbstractC0905b;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f4673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CharSequence f4675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence f4676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f4677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f4678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0200z f4679r;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f4674m = Integer.MAX_VALUE;
        this.f4673l = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0717a.f9110f, i, 0);
        typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f4677p = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f4675n = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.f4676o = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f4674m = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (typedArrayObtainStyledAttributes.getString(22) == null) {
            typedArrayObtainStyledAttributes.getString(13);
        }
        typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        AbstractC0905b.b(typedArrayObtainStyledAttributes, 19, 10);
        typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z4));
        typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z4));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f4678q = c(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f4678q = c(typedArrayObtainStyledAttributes, 11);
        }
        typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        if (typedArrayObtainStyledAttributes.hasValue(32)) {
            typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        C0200z c0200z = this.f4679r;
        return c0200z != null ? c0200z.v(this) : this.f4676o;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = preference2.f4674m;
        int i5 = this.f4674m;
        if (i5 != i) {
            return i5 - i;
        }
        CharSequence charSequence = preference2.f4675n;
        CharSequence charSequence2 = this.f4675n;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f4675n;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceA = a();
        if (!TextUtils.isEmpty(charSequenceA)) {
            sb.append(charSequenceA);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0905b.a(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
