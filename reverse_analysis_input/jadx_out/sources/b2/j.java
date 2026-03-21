package b2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f4906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ j[] f4907m;

    static {
        j jVar = new j("INSTANCE", 0);
        f4906l = jVar;
        f4907m = new j[]{jVar};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f4907m.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
