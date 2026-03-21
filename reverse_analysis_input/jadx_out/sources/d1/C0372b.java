package d1;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c0.C0317b;
import java.util.ArrayList;

/* JADX INFO: renamed from: d1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0372b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f5346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5351h;

    public C0372b(int i, int i5) {
        ArrayList arrayList = new ArrayList();
        this.f5344a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f5345b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f5346c = sb;
        this.f5350g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f5347d = 15;
        this.f5348e = 0;
        this.f5349f = 0;
        this.f5351h = i5;
    }

    public final void a(char c5) {
        StringBuilder sb = this.f5346c;
        if (sb.length() < 32) {
            sb.append(c5);
        }
    }

    public final void b() {
        StringBuilder sb = this.f5346c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f5344a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0371a c0371a = (C0371a) arrayList.get(size);
                int i = c0371a.f5343c;
                if (i != length) {
                    return;
                }
                c0371a.f5343c = i - 1;
            }
        }
    }

    public final C0317b c(int i) {
        float f2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f5345b;
            if (i5 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i5));
            spannableStringBuilder.append('\n');
            i5++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i6 = this.f5348e + this.f5349f;
        int length = (32 - i6) - spannableStringBuilder.length();
        int i7 = i6 - length;
        int i8 = i != Integer.MIN_VALUE ? i : (this.f5350g != 2 || (Math.abs(i7) >= 3 && length >= 0)) ? (this.f5350g != 2 || i7 <= 0) ? 0 : 2 : 1;
        if (i8 != 1) {
            if (i8 == 2) {
                i6 = 32 - length;
            }
            f2 = ((i6 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f2 = 0.5f;
        }
        int i9 = this.f5347d;
        if (i9 > 7) {
            i9 -= 17;
        } else if (this.f5350g == 1) {
            i9 -= this.f5351h - 1;
        }
        return new C0317b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i9, 1, Integer.MIN_VALUE, f2, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f5346c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f5344a;
            if (i8 >= arrayList.size()) {
                break;
            }
            C0371a c0371a = (C0371a) arrayList.get(i8);
            boolean z5 = c0371a.f5342b;
            int i10 = c0371a.f5341a;
            if (i10 != 8) {
                boolean z6 = i10 == 7;
                if (i10 != 7) {
                    i7 = C0373c.f5353B[i10];
                }
                z4 = z6;
            }
            int i11 = c0371a.f5343c;
            i8++;
            if (i11 != (i8 < arrayList.size() ? ((C0371a) arrayList.get(i8)).f5343c : length)) {
                if (i != -1 && !z5) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i11, 33);
                    i = -1;
                } else if (i == -1 && z5) {
                    i = i11;
                }
                if (i5 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i5, i11, 33);
                    i5 = -1;
                } else if (i5 == -1 && z4) {
                    i5 = i11;
                }
                if (i7 != i6) {
                    if (i6 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i9, i11, 33);
                    }
                    i6 = i7;
                    i9 = i11;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i5 != -1 && i5 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
        }
        if (i9 != length && i6 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i9, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f5344a.isEmpty() && this.f5345b.isEmpty() && this.f5346c.length() == 0;
    }
}
