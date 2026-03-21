package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class k extends l {
    @Override // j$.time.format.l
    protected final l d(String str, String str2, l lVar) {
        return new k(str, str2, lVar, 0);
    }

    @Override // j$.time.format.l
    protected final boolean b(char c5, char c6) {
        return q.b(c5, c6);
    }

    @Override // j$.time.format.l
    protected final boolean f(CharSequence charSequence, int i, int i5) {
        int length = this.f7081a.length();
        if (length > i5 - i) {
            return false;
        }
        int i6 = 0;
        while (true) {
            int i7 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i8 = i6 + 1;
            int i9 = i + 1;
            if (!q.b(this.f7081a.charAt(i6), charSequence.charAt(i))) {
                return false;
            }
            i = i9;
            length = i7;
            i6 = i8;
        }
    }
}
