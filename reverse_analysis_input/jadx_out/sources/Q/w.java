package Q;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class w extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1760b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1759a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1761c = 1.0f;

    public w(p pVar) {
        D1.b.n(pVar, "metadata cannot be null");
        this.f1760b = pVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i5, float f2, int i6, int i7, int i8, Paint paint) {
        j.a().getClass();
        p pVar = this.f1760b;
        Z1.i iVar = pVar.f1733b;
        Typeface typeface = (Typeface) iVar.f3015o;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) iVar.f3013m, pVar.f1732a * 2, 2, f2, i7, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i5, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1759a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        p pVar = this.f1760b;
        this.f1761c = fAbs / (pVar.c().a(14) != 0 ? ((ByteBuffer) r8.f376o).getShort(r1 + r8.f373l) : (short) 0);
        R.a aVarC = pVar.c();
        int iA = aVarC.a(14);
        if (iA != 0) {
            ((ByteBuffer) aVarC.f376o).getShort(iA + aVarC.f373l);
        }
        short s4 = (short) ((pVar.c().a(12) != 0 ? ((ByteBuffer) r5.f376o).getShort(r7 + r5.f373l) : (short) 0) * this.f1761c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s4;
    }
}
