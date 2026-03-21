package y1;

import android.database.sqlite.SQLiteStatement;
import x1.InterfaceC0988d;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g implements InterfaceC0988d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SQLiteStatement f10933m;

    public h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f10933m = sQLiteStatement;
    }

    public final int a() {
        return this.f10933m.executeUpdateDelete();
    }
}
