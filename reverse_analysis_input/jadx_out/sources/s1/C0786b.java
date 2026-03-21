package s1;

import android.content.Context;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import m3.C0675i;
import x1.InterfaceC0986b;

/* JADX INFO: renamed from: s1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0786b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0986b f9558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0675i f9559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f9563h;
    public final Executor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f9566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f9567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9568n;

    public C0786b(Context context, String str, InterfaceC0986b interfaceC0986b, C0675i c0675i, ArrayList arrayList, boolean z4, int i, Executor executor, Executor executor2, boolean z5, boolean z6, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        N3.h.e(c0675i, "migrationContainer");
        AbstractC0307a.r("journalMode", i);
        N3.h.e(executor, "queryExecutor");
        N3.h.e(executor2, "transactionExecutor");
        N3.h.e(arrayList2, "typeConverters");
        N3.h.e(arrayList3, "autoMigrationSpecs");
        this.f9556a = context;
        this.f9557b = str;
        this.f9558c = interfaceC0986b;
        this.f9559d = c0675i;
        this.f9560e = arrayList;
        this.f9561f = z4;
        this.f9562g = i;
        this.f9563h = executor;
        this.i = executor2;
        this.f9564j = z5;
        this.f9565k = z6;
        this.f9566l = linkedHashSet;
        this.f9567m = arrayList2;
        this.f9568n = arrayList3;
    }
}
