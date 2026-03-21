package k2;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: k2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540a implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7687a;

    public C0540a(String str) {
        this.f7687a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f7687a);
    }
}
