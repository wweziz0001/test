package Q;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v extends SpannableStringBuilder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Class f1757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f1758m;

    public v(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1758m = new ArrayList();
        D1.b.n(cls, "watcherClass cannot be null");
        this.f1757l = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1758m;
            if (i >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i)).f1756m.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1758m;
            if (i >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final u c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1758m;
            if (i >= arrayList.size()) {
                return null;
            }
            u uVar = (u) arrayList.get(i);
            if (uVar.f1755l == obj) {
                return uVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f1757l == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i5) {
        super.delete(i, i5);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1758m;
            if (i >= arrayList.size()) {
                return;
            }
            ((u) arrayList.get(i)).f1756m.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        u uVarC;
        if (d(obj) && (uVarC = c(obj)) != null) {
            obj = uVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i5, Class cls) {
        if (this.f1757l != cls) {
            return super.getSpans(i, i5, cls);
        }
        u[] uVarArr = (u[]) super.getSpans(i, i5, u.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, uVarArr.length);
        for (int i6 = 0; i6 < uVarArr.length; i6++) {
            objArr[i6] = uVarArr[i6].f1755l;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i5, Class cls) {
        if (cls == null || this.f1757l == cls) {
            cls = u.class;
        }
        return super.nextSpanTransition(i, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        u uVarC;
        if (d(obj)) {
            uVarC = c(obj);
            if (uVarC != null) {
                obj = uVarC;
            }
        } else {
            uVarC = null;
        }
        super.removeSpan(obj);
        if (uVarC != null) {
            this.f1758m.remove(uVarC);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i5, CharSequence charSequence) {
        replace(i, i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i5, int i6) {
        if (d(obj)) {
            u uVar = new u(obj);
            this.f1758m.add(uVar);
            obj = uVar;
        }
        super.setSpan(obj, i, i5, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i5) {
        return new v(this.f1757l, this, i, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i5) {
        super.delete(i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i5, CharSequence charSequence, int i6, int i7) {
        replace(i, i5, charSequence, i6, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i5, int i6) {
        super.insert(i, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i5, CharSequence charSequence) {
        a();
        super.replace(i, i5, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i5, int i6) {
        super.insert(i, charSequence, i5, i6);
        return this;
    }

    public v(Class cls, v vVar, int i, int i5) {
        super(vVar, i, i5);
        this.f1758m = new ArrayList();
        D1.b.n(cls, "watcherClass cannot be null");
        this.f1757l = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c5) {
        super.append(c5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i5, CharSequence charSequence, int i6, int i7) {
        a();
        super.replace(i, i5, charSequence, i6, i7);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i5) {
        super.append(charSequence, i, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
