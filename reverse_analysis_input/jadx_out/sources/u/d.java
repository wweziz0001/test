package u;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
