package U1;

import Q1.q;
import Q1.r;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2270c = q.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f2271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2272b;

    public a(Context context, r rVar) {
        this.f2272b = rVar;
        this.f2271a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
