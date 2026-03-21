package t;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static void a(c0 c0Var, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(c0.a(c0Var), intent, map);
    }

    public static Set<String> b(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    public static Map<String, Uri> c(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z4) {
        return builder.setAllowDataType(str, z4);
    }
}
