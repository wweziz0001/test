package l2;

/* JADX INFO: renamed from: l2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0575a implements e {
    public abstract boolean a(char c5);

    @Override // l2.e
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
