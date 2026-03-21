package F1;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f849c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f851b;

    public c(String str, String str2) {
        this.f850a = str;
        this.f851b = str2;
        f849c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f847a;
        String str = this.f851b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
