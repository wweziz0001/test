package R1;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1861a = new a();

    public final File a(Context context) {
        N3.h.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        N3.h.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
