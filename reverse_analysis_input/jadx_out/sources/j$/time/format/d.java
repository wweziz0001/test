package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f7065a;

    d(char c5) {
        this.f7065a = c5;
    }

    @Override // j$.time.format.f
    public final boolean p(t tVar, StringBuilder sb) {
        sb.append(this.f7065a);
        return true;
    }

    @Override // j$.time.format.f
    public final int r(q qVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c5 = this.f7065a;
        return (cCharAt == c5 || (!qVar.j() && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c5) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c5)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c5 = this.f7065a;
        if (c5 == '\'') {
            return "''";
        }
        return "'" + c5 + "'";
    }
}
