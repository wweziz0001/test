package com.dexterous.flutterlocalnotifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f5119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e f5120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e f5121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e f5122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f5123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ e[] f5124q;

    static {
        e eVar = new e("None", 0);
        f5119l = eVar;
        e eVar2 = new e("RequestingNotificationPermission", 1);
        f5120m = eVar2;
        e eVar3 = new e("RequestingNotificationPolicyAccess", 2);
        f5121n = eVar3;
        e eVar4 = new e("RequestingExactAlarmsPermission", 3);
        f5122o = eVar4;
        e eVar5 = new e("RequestingFullScreenIntentPermission", 4);
        f5123p = eVar5;
        f5124q = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f5124q.clone();
    }
}
