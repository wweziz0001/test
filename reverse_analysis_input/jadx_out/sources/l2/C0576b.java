package l2;

/* JADX INFO: renamed from: l2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0576b extends AbstractC0575a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final char f8206l;

    public C0576b(char c5) {
        this.f8206l = c5;
    }

    @Override // l2.AbstractC0575a
    public final boolean a(char c5) {
        return c5 == this.f8206l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c5 = this.f8206l;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c5 & 15);
            c5 = (char) (c5 >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
