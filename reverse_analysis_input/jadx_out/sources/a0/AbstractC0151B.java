package a0;

import java.util.HashSet;

/* JADX INFO: renamed from: a0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0151B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f3159a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f3160b = "media3.common";

    public static synchronized void a(String str) {
        if (f3159a.add(str)) {
            f3160b += ", " + str;
        }
    }
}
