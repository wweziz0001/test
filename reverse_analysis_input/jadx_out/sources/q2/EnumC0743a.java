package q2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: q2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0743a implements Executor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final EnumC0743a f9372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0743a[] f9373m;

    static {
        EnumC0743a enumC0743a = new EnumC0743a("INSTANCE", 0);
        f9372l = enumC0743a;
        f9373m = new EnumC0743a[]{enumC0743a};
    }

    public static EnumC0743a valueOf(String str) {
        return (EnumC0743a) Enum.valueOf(EnumC0743a.class, str);
    }

    public static EnumC0743a[] values() {
        return (EnumC0743a[]) f9373m.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
