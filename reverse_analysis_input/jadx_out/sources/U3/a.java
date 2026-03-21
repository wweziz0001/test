package U3;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2287a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        N3.h.d(charsetForName, "forName(...)");
        f2287a = charsetForName;
        N3.h.d(Charset.forName("UTF-16"), "forName(...)");
        N3.h.d(Charset.forName("UTF-16BE"), "forName(...)");
        N3.h.d(Charset.forName("UTF-16LE"), "forName(...)");
        N3.h.d(Charset.forName("US-ASCII"), "forName(...)");
        N3.h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
