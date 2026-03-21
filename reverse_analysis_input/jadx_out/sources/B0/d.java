package B0;

import D0.B;
import D0.z;
import F0.C0066m;
import F0.J;
import L.InterfaceC0100h;
import L.a0;
import L.b0;
import a0.C0157H;
import a0.C0181g;
import a0.C0187m;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.C0363p;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n.AbstractC0683c;
import n3.C0704n;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import q.C0735e;
import u1.C0889a;
import u1.C0890b;
import u1.C0892d;
import u1.C0893e;
import y1.C1002b;

/* JADX INFO: loaded from: classes.dex */
public class d implements m, B, F1.m, InterfaceC0100h, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f190l;

    public /* synthetic */ d(Object obj) {
        this.f190l = obj;
    }

    public static d e(byte[] bArr, r2.o oVar) {
        if (oVar != null) {
            return new d(F2.a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static void g(C1002b c1002b) {
        c1002b.k("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1002b.k("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c1002b.k("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c1002b.k("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c1002b.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c1002b.k("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c1002b.k("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1002b.k("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c1002b.k("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1002b.k("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1002b.k("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c1002b.k("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1002b.k("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c1002b.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c1002b.k("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    public static ArrayList j(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    public static C0187m m(C1002b c1002b) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new C0889a(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new C0889a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C0890b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C0890b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C0892d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new C0892d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        C0893e c0893e = new C0893e("Dependency", map, hashSet, hashSet2);
        C0893e c0893eA = C0893e.a(c1002b, "Dependency");
        if (!c0893e.equals(c0893eA)) {
            return new C0187m("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c0893e + "\n Found:\n" + c0893eA, false);
        }
        HashMap map2 = new HashMap(30);
        map2.put("id", new C0889a(1, 1, "id", "TEXT", null, true));
        map2.put("state", new C0889a(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new C0889a(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new C0889a(0, 1, "input_merger_class_name", "TEXT", null, true));
        map2.put("input", new C0889a(0, 1, "input", "BLOB", null, true));
        map2.put("output", new C0889a(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new C0889a(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new C0889a(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new C0889a(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new C0889a(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new C0889a(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new C0889a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("last_enqueue_time", new C0889a(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        map2.put("minimum_retention_duration", new C0889a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new C0889a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new C0889a(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new C0889a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("period_count", new C0889a(0, 1, "period_count", "INTEGER", "0", true));
        map2.put("generation", new C0889a(0, 1, "generation", "INTEGER", "0", true));
        map2.put("next_schedule_time_override", new C0889a(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        map2.put("next_schedule_time_override_generation", new C0889a(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        map2.put("stop_reason", new C0889a(0, 1, "stop_reason", "INTEGER", "-256", true));
        map2.put("required_network_type", new C0889a(0, 1, "required_network_type", "INTEGER", null, true));
        map2.put("requires_charging", new C0889a(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new C0889a(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new C0889a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new C0889a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new C0889a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new C0889a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new C0889a(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C0892d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new C0892d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        C0893e c0893e2 = new C0893e("WorkSpec", map2, hashSet3, hashSet4);
        C0893e c0893eA2 = C0893e.a(c1002b, "WorkSpec");
        if (!c0893e2.equals(c0893eA2)) {
            return new C0187m("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c0893e2 + "\n Found:\n" + c0893eA2, false);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new C0889a(1, 1, "tag", "TEXT", null, true));
        map3.put("work_spec_id", new C0889a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C0890b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C0892d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C0893e c0893e3 = new C0893e("WorkTag", map3, hashSet5, hashSet6);
        C0893e c0893eA3 = C0893e.a(c1002b, "WorkTag");
        if (!c0893e3.equals(c0893eA3)) {
            return new C0187m("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c0893e3 + "\n Found:\n" + c0893eA3, false);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new C0889a(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("generation", new C0889a(2, 1, "generation", "INTEGER", "0", true));
        map4.put("system_id", new C0889a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C0890b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C0893e c0893e4 = new C0893e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        C0893e c0893eA4 = C0893e.a(c1002b, "SystemIdInfo");
        if (!c0893e4.equals(c0893eA4)) {
            return new C0187m("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c0893e4 + "\n Found:\n" + c0893eA4, false);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new C0889a(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new C0889a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C0890b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C0892d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        C0893e c0893e5 = new C0893e("WorkName", map5, hashSet8, hashSet9);
        C0893e c0893eA5 = C0893e.a(c1002b, "WorkName");
        if (!c0893e5.equals(c0893eA5)) {
            return new C0187m("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c0893e5 + "\n Found:\n" + c0893eA5, false);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new C0889a(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put("progress", new C0889a(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C0890b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C0893e c0893e6 = new C0893e("WorkProgress", map6, hashSet10, new HashSet(0));
        C0893e c0893eA6 = C0893e.a(c1002b, "WorkProgress");
        if (!c0893e6.equals(c0893eA6)) {
            return new C0187m("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c0893e6 + "\n Found:\n" + c0893eA6, false);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new C0889a(1, 1, "key", "TEXT", null, true));
        map7.put("long_value", new C0889a(0, 1, "long_value", "INTEGER", null, false));
        C0893e c0893e7 = new C0893e("Preference", map7, new HashSet(0), new HashSet(0));
        C0893e c0893eA7 = C0893e.a(c1002b, "Preference");
        if (c0893e7.equals(c0893eA7)) {
            return new C0187m(null, true);
        }
        return new C0187m("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c0893e7 + "\n Found:\n" + c0893eA7, false);
    }

    @Override // F1.m
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f190l).getSupportedFeatures();
    }

    @Override // L.InterfaceC0100h
    public Object b(M3.p pVar, G3.f fVar) {
        return ((InterfaceC0100h) this.f190l).b(new P.c(pVar, null), fVar);
    }

    public void c(int i, boolean z4) {
        C0187m c0187m = (C0187m) this.f190l;
        if (z4) {
            c0187m.a(i);
        } else {
            c0187m.getClass();
        }
    }

    public void d(int i, int i5, C0066m c0066m) throws C0157H, EOFException, InterruptedIOException {
        X0.c cVar;
        X0.c cVar2;
        X0.c cVar3;
        long j5;
        int i6;
        int i7;
        int i8;
        X0.d dVar = (X0.d) this.f190l;
        SparseArray sparseArray = dVar.f2579c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (dVar.f2558I != 2) {
                    return;
                }
                X0.c cVar4 = (X0.c) sparseArray.get(dVar.f2563O);
                if (dVar.f2566R != 4 || !"V_VP9".equals(cVar4.f2521b)) {
                    c0066m.f(i5);
                    return;
                }
                C0363p c0363p = dVar.f2593p;
                c0363p.E(i5);
                c0066m.l(c0363p.f5313a, 0, i5, false);
                return;
            }
            if (i == 16877) {
                dVar.c(i);
                X0.c cVar5 = dVar.f2600w;
                int i12 = cVar5.f2526g;
                if (i12 != 1685485123 && i12 != 1685480259) {
                    c0066m.f(i5);
                    return;
                }
                byte[] bArr = new byte[i5];
                cVar5.f2508O = bArr;
                c0066m.l(bArr, 0, i5, false);
                return;
            }
            if (i == 16981) {
                dVar.c(i);
                X0.c cVar6 = dVar.f2600w;
                byte[] bArr2 = new byte[i5];
                cVar6.i = bArr2;
                c0066m.l(bArr2, 0, i5, false);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i5];
                c0066m.l(bArr3, 0, i5, false);
                dVar.c(i);
                dVar.f2600w.f2528j = new J(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                C0363p c0363p2 = dVar.f2588k;
                Arrays.fill(c0363p2.f5313a, (byte) 0);
                c0066m.l(c0363p2.f5313a, 4 - i5, i5, false);
                c0363p2.H(0);
                dVar.y = (int) c0363p2.x();
                return;
            }
            if (i == 25506) {
                dVar.c(i);
                X0.c cVar7 = dVar.f2600w;
                byte[] bArr4 = new byte[i5];
                cVar7.f2529k = bArr4;
                c0066m.l(bArr4, 0, i5, false);
                return;
            }
            if (i != 30322) {
                throw C0157H.a(null, "Unexpected id: " + i);
            }
            dVar.c(i);
            X0.c cVar8 = dVar.f2600w;
            byte[] bArr5 = new byte[i5];
            cVar8.f2541w = bArr5;
            c0066m.l(bArr5, 0, i5, false);
            return;
        }
        int i13 = dVar.f2558I;
        C0363p c0363p3 = dVar.i;
        if (i13 == 0) {
            X0.e eVar = dVar.f2577b;
            dVar.f2563O = (int) eVar.c(c0066m, false, true, 8);
            dVar.f2564P = eVar.f2606c;
            dVar.f2560K = -9223372036854775807L;
            dVar.f2558I = 1;
            c0363p3.E(0);
        }
        X0.c cVar9 = (X0.c) sparseArray.get(dVar.f2563O);
        if (cVar9 == null) {
            c0066m.f(i5 - dVar.f2564P);
            dVar.f2558I = 0;
            return;
        }
        cVar9.f2518Y.getClass();
        if (dVar.f2558I == 1) {
            dVar.h(c0066m, 3);
            int i14 = (c0363p3.f5313a[2] & 6) >> 1;
            byte b4 = 255;
            if (i14 == 0) {
                dVar.M = 1;
                int[] iArr = dVar.f2562N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f2562N = iArr;
                iArr[0] = (i5 - dVar.f2564P) - 3;
            } else {
                dVar.h(c0066m, 4);
                int i15 = (c0363p3.f5313a[3] & 255) + 1;
                dVar.M = i15;
                int[] iArr2 = dVar.f2562N;
                if (iArr2 == null) {
                    iArr2 = new int[i15];
                } else if (iArr2.length < i15) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i15)];
                }
                dVar.f2562N = iArr2;
                if (i14 == 2) {
                    int i16 = (i5 - dVar.f2564P) - 4;
                    int i17 = dVar.M;
                    Arrays.fill(iArr2, 0, i17, i16 / i17);
                } else {
                    if (i14 != 1) {
                        if (i14 != 3) {
                            throw C0157H.a(null, "Unexpected lacing value: " + i14);
                        }
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = dVar.M - i11;
                            if (i18 >= i20) {
                                cVar2 = cVar9;
                                dVar.f2562N[i20] = ((i5 - dVar.f2564P) - i9) - i19;
                                break;
                            }
                            dVar.f2562N[i18] = i10;
                            int i21 = i9 + 1;
                            dVar.h(c0066m, i21);
                            if (c0363p3.f5313a[i9] == 0) {
                                throw C0157H.a(null, "No valid varint length mask found");
                            }
                            int i22 = i10;
                            while (true) {
                                if (i22 >= 8) {
                                    cVar3 = cVar9;
                                    j5 = 0;
                                    i9 = i21;
                                    break;
                                }
                                int i23 = i11 << (7 - i22);
                                if ((c0363p3.f5313a[i9] & i23) != 0) {
                                    int i24 = i21 + i22;
                                    dVar.h(c0066m, i24);
                                    X0.c cVar10 = cVar9;
                                    j5 = c0363p3.f5313a[i9] & b4 & (~i23);
                                    while (i21 < i24) {
                                        j5 = (j5 << 8) | ((long) (c0363p3.f5313a[i21] & 255));
                                        i21++;
                                        cVar10 = cVar10;
                                    }
                                    cVar3 = cVar10;
                                    if (i18 > 0) {
                                        j5 -= (1 << ((i22 * 7) + 6)) - 1;
                                    }
                                    i9 = i24;
                                } else {
                                    i22++;
                                    b4 = 255;
                                    i11 = 1;
                                }
                            }
                            if (j5 < -2147483648L || j5 > 2147483647L) {
                                break;
                            }
                            int i25 = (int) j5;
                            int[] iArr3 = dVar.f2562N;
                            if (i18 != 0) {
                                i25 += iArr3[i18 - 1];
                            }
                            iArr3[i18] = i25;
                            i19 += i25;
                            i18++;
                            cVar9 = cVar3;
                            b4 = 255;
                            i10 = 0;
                            i11 = 1;
                        }
                        throw C0157H.a(null, "EBML lacing sample size out of range.");
                    }
                    int i26 = 0;
                    int i27 = 0;
                    while (true) {
                        i6 = dVar.M - 1;
                        if (i26 >= i6) {
                            break;
                        }
                        dVar.f2562N[i26] = 0;
                        while (true) {
                            i7 = i9 + 1;
                            dVar.h(c0066m, i7);
                            int i28 = c0363p3.f5313a[i9] & 255;
                            int[] iArr4 = dVar.f2562N;
                            i8 = iArr4[i26] + i28;
                            iArr4[i26] = i8;
                            if (i28 != 255) {
                                break;
                            } else {
                                i9 = i7;
                            }
                        }
                        i27 += i8;
                        i26++;
                        i9 = i7;
                    }
                    dVar.f2562N[i6] = ((i5 - dVar.f2564P) - i9) - i27;
                }
            }
            cVar2 = cVar9;
            byte[] bArr6 = c0363p3.f5313a;
            dVar.f2559J = dVar.l((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.f2553D;
            cVar = cVar2;
            dVar.f2565Q = (cVar.f2523d == 2 || (i == 163 && (c0363p3.f5313a[2] & 128) == 128)) ? 1 : 0;
            dVar.f2558I = 2;
            dVar.f2561L = 0;
        } else {
            cVar = cVar9;
        }
        if (i == 163) {
            while (true) {
                int i29 = dVar.f2561L;
                if (i29 >= dVar.M) {
                    dVar.f2558I = 0;
                    return;
                }
                dVar.f(cVar, ((long) ((dVar.f2561L * cVar.f2524e) / 1000)) + dVar.f2559J, dVar.f2565Q, dVar.m(c0066m, cVar, dVar.f2562N[i29], false), 0);
                dVar.f2561L++;
                cVar = cVar;
            }
        } else {
            X0.c cVar11 = cVar;
            while (true) {
                int i30 = dVar.f2561L;
                if (i30 >= dVar.M) {
                    return;
                }
                int[] iArr5 = dVar.f2562N;
                iArr5[i30] = dVar.m(c0066m, cVar11, iArr5[i30], true);
                dVar.f2561L++;
            }
        }
    }

    @Override // D0.B
    public void f() {
        D0.g gVar = (D0.g) this.f190l;
        Surface surface = gVar.f418a1;
        if (surface != null) {
            Z1.c cVar = gVar.f407P0;
            Handler handler = (Handler) cVar.f2996l;
            if (handler != null) {
                handler.post(new z(cVar, surface, SystemClock.elapsedRealtime()));
            }
            gVar.f420d1 = true;
        }
    }

    @Override // L.InterfaceC0100h
    public Y3.g getData() {
        return ((InterfaceC0100h) this.f190l).getData();
    }

    @Override // F1.m
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) i4.a.j(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f190l).getStatics());
    }

    @Override // F1.m
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) i4.a.j(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f190l).getWebkitToCompatConverter());
    }

    @Override // D0.B
    public void h() {
        D0.g gVar = (D0.g) this.f190l;
        if (gVar.f418a1 != null) {
            gVar.w0(0, 1);
        }
    }

    @Override // B0.m
    public void i(o oVar, long j5, long j6) {
        boolean z4;
        k0.d dVar = (k0.d) this.f190l;
        synchronized (C0.b.f281b) {
            z4 = C0.b.f282c;
        }
        if (z4) {
            dVar.b();
        } else {
            dVar.f7551m.z(new IOException(new ConcurrentModificationException()));
        }
    }

    public a0 k() {
        Y3.v vVar = (Y3.v) this.f190l;
        vVar.getClass();
        F0.p pVar = Z3.q.f3135a;
        Object obj = Y3.v.f2810p.get(vVar);
        if (obj == pVar) {
            obj = null;
        }
        return (a0) obj;
    }

    public void l(long j5, int i) throws C0157H {
        X0.d dVar = (X0.d) this.f190l;
        dVar.getClass();
        if (i == 20529) {
            if (j5 == 0) {
                return;
            }
            throw C0157H.a(null, "ContentEncodingOrder " + j5 + " not supported");
        }
        if (i == 20530) {
            if (j5 == 1) {
                return;
            }
            throw C0157H.a(null, "ContentEncodingScope " + j5 + " not supported");
        }
        switch (i) {
            case 131:
                dVar.c(i);
                dVar.f2600w.f2523d = (int) j5;
                return;
            case 136:
                dVar.c(i);
                dVar.f2600w.f2516W = j5 == 1;
                return;
            case 155:
                dVar.f2560K = dVar.l(j5);
                return;
            case 159:
                dVar.c(i);
                dVar.f2600w.f2509P = (int) j5;
                return;
            case 176:
                dVar.c(i);
                dVar.f2600w.f2531m = (int) j5;
                return;
            case 179:
                dVar.a(i);
                dVar.f2554E.f(dVar.l(j5));
                return;
            case 186:
                dVar.c(i);
                dVar.f2600w.f2532n = (int) j5;
                return;
            case 215:
                dVar.c(i);
                dVar.f2600w.f2522c = (int) j5;
                return;
            case 231:
                dVar.f2553D = dVar.l(j5);
                return;
            case 238:
                dVar.f2566R = (int) j5;
                return;
            case 241:
                if (dVar.f2556G) {
                    return;
                }
                dVar.a(i);
                dVar.f2555F.f(j5);
                dVar.f2556G = true;
                return;
            case 251:
                dVar.f2567S = true;
                return;
            case 16871:
                dVar.c(i);
                dVar.f2600w.f2526g = (int) j5;
                return;
            case 16980:
                if (j5 == 3) {
                    return;
                }
                throw C0157H.a(null, "ContentCompAlgo " + j5 + " not supported");
            case 17029:
                if (j5 < 1 || j5 > 2) {
                    throw C0157H.a(null, "DocTypeReadVersion " + j5 + " not supported");
                }
                return;
            case 17143:
                if (j5 == 1) {
                    return;
                }
                throw C0157H.a(null, "EBMLReadVersion " + j5 + " not supported");
            case 18401:
                if (j5 == 5) {
                    return;
                }
                throw C0157H.a(null, "ContentEncAlgo " + j5 + " not supported");
            case 18408:
                if (j5 == 1) {
                    return;
                }
                throw C0157H.a(null, "AESSettingsCipherMode " + j5 + " not supported");
            case 21420:
                dVar.f2602z = j5 + dVar.f2596s;
                return;
            case 21432:
                int i5 = (int) j5;
                dVar.c(i);
                if (i5 == 0) {
                    dVar.f2600w.f2542x = 0;
                    return;
                }
                if (i5 == 1) {
                    dVar.f2600w.f2542x = 2;
                    return;
                } else if (i5 == 3) {
                    dVar.f2600w.f2542x = 1;
                    return;
                } else {
                    if (i5 != 15) {
                        return;
                    }
                    dVar.f2600w.f2542x = 3;
                    return;
                }
            case 21680:
                dVar.c(i);
                dVar.f2600w.f2534p = (int) j5;
                return;
            case 21682:
                dVar.c(i);
                dVar.f2600w.f2536r = (int) j5;
                return;
            case 21690:
                dVar.c(i);
                dVar.f2600w.f2535q = (int) j5;
                return;
            case 21930:
                dVar.c(i);
                dVar.f2600w.f2515V = j5 == 1;
                return;
            case 21938:
                dVar.c(i);
                X0.c cVar = dVar.f2600w;
                cVar.y = true;
                cVar.f2533o = (int) j5;
                return;
            case 21998:
                dVar.c(i);
                dVar.f2600w.f2525f = (int) j5;
                return;
            case 22186:
                dVar.c(i);
                dVar.f2600w.f2512S = j5;
                return;
            case 22203:
                dVar.c(i);
                dVar.f2600w.f2513T = j5;
                return;
            case 25188:
                dVar.c(i);
                dVar.f2600w.f2510Q = (int) j5;
                return;
            case 30114:
                dVar.f2568T = j5;
                return;
            case 30321:
                dVar.c(i);
                int i6 = (int) j5;
                if (i6 == 0) {
                    dVar.f2600w.f2537s = 0;
                    return;
                }
                if (i6 == 1) {
                    dVar.f2600w.f2537s = 1;
                    return;
                } else if (i6 == 2) {
                    dVar.f2600w.f2537s = 2;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    dVar.f2600w.f2537s = 3;
                    return;
                }
            case 2352003:
                dVar.c(i);
                dVar.f2600w.f2524e = (int) j5;
                return;
            case 2807729:
                dVar.f2597t = j5;
                return;
            default:
                switch (i) {
                    case 21945:
                        dVar.c(i);
                        int i7 = (int) j5;
                        if (i7 == 1) {
                            dVar.f2600w.f2496B = 2;
                            return;
                        } else {
                            if (i7 != 2) {
                                return;
                            }
                            dVar.f2600w.f2496B = 1;
                            return;
                        }
                    case 21946:
                        dVar.c(i);
                        int iG = C0181g.g((int) j5);
                        if (iG != -1) {
                            dVar.f2600w.f2495A = iG;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.c(i);
                        dVar.f2600w.y = true;
                        int iF = C0181g.f((int) j5);
                        if (iF != -1) {
                            dVar.f2600w.f2543z = iF;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.c(i);
                        dVar.f2600w.f2497C = (int) j5;
                        return;
                    case 21949:
                        dVar.c(i);
                        dVar.f2600w.f2498D = (int) j5;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // B0.m
    public k n(o oVar, long j5, long j6, IOException iOException, int i) {
        ((k0.d) this.f190l).f7551m.z(iOException);
        return r.f240p;
    }

    public void o(String str, Bitmap bitmap) {
        C0735e c0735e = MediaMetadataCompat.f3646o;
        if (c0735e.containsKey(str) && ((Integer) c0735e.getOrDefault(str, null)).intValue() != 2) {
            throw new IllegalArgumentException(AbstractC0307a.k("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f190l).putParcelable(str, bitmap);
    }

    @Override // n3.InterfaceC0705o
    public void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        if (!"check".equals(c0704n.f8938a)) {
            ((P2.c) interfaceC0706p).notImplemented();
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) ((d) this.f190l).f190l;
        ((P2.c) interfaceC0706p).success(j(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
    }

    public void p(String str, long j5) {
        C0735e c0735e = MediaMetadataCompat.f3646o;
        if (c0735e.containsKey(str) && ((Integer) c0735e.getOrDefault(str, null)).intValue() != 0) {
            throw new IllegalArgumentException(AbstractC0307a.k("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f190l).putLong(str, j5);
    }

    public void r(String str, String str2) {
        C0735e c0735e = MediaMetadataCompat.f3646o;
        if (c0735e.containsKey(str) && ((Integer) c0735e.getOrDefault(str, null)).intValue() != 1) {
            throw new IllegalArgumentException(AbstractC0307a.k("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f190l).putCharSequence(str, str2);
    }

    public void s(boolean z4) {
        ((WebSettingsBoundaryInterface) this.f190l).setPaymentRequestEnabled(z4);
    }

    public void t(int i, long j5, long j6) throws C0157H {
        X0.d dVar = (X0.d) this.f190l;
        AbstractC0360m.i(dVar.f2582d0);
        if (i == 160) {
            dVar.f2567S = false;
            dVar.f2568T = 0L;
            return;
        }
        if (i != 174) {
            if (i == 187) {
                dVar.f2556G = false;
                return;
            }
            if (i == 19899) {
                dVar.y = -1;
                dVar.f2602z = -1L;
                return;
            }
            if (i == 20533) {
                dVar.c(i);
                dVar.f2600w.f2527h = true;
                return;
            }
            if (i == 21968) {
                dVar.c(i);
                dVar.f2600w.y = true;
                return;
            }
            if (i == 408125543) {
                long j7 = dVar.f2596s;
                if (j7 != -1 && j7 != j5) {
                    throw C0157H.a(null, "Multiple Segment elements not supported");
                }
                dVar.f2596s = j5;
                dVar.f2595r = j6;
                return;
            }
            if (i == 475249515) {
                dVar.f2554E = new A.j(4, (byte) 0);
                dVar.f2555F = new A.j(4, (byte) 0);
                return;
            } else {
                if (i == 524531317 && !dVar.f2601x) {
                    if (dVar.f2581d && dVar.f2551B != -1) {
                        dVar.f2550A = true;
                        return;
                    } else {
                        dVar.f2582d0.d(new F0.v(dVar.f2599v));
                        dVar.f2601x = true;
                        return;
                    }
                }
                return;
            }
        }
        X0.c cVar = new X0.c();
        cVar.f2531m = -1;
        cVar.f2532n = -1;
        cVar.f2533o = -1;
        cVar.f2534p = -1;
        cVar.f2535q = -1;
        cVar.f2536r = 0;
        cVar.f2537s = -1;
        cVar.f2538t = 0.0f;
        cVar.f2539u = 0.0f;
        cVar.f2540v = 0.0f;
        cVar.f2541w = null;
        cVar.f2542x = -1;
        cVar.y = false;
        cVar.f2543z = -1;
        cVar.f2495A = -1;
        cVar.f2496B = -1;
        cVar.f2497C = 1000;
        cVar.f2498D = 200;
        cVar.f2499E = -1.0f;
        cVar.f2500F = -1.0f;
        cVar.f2501G = -1.0f;
        cVar.f2502H = -1.0f;
        cVar.f2503I = -1.0f;
        cVar.f2504J = -1.0f;
        cVar.f2505K = -1.0f;
        cVar.f2506L = -1.0f;
        cVar.M = -1.0f;
        cVar.f2507N = -1.0f;
        cVar.f2509P = 1;
        cVar.f2510Q = -1;
        cVar.f2511R = 8000;
        cVar.f2512S = 0L;
        cVar.f2513T = 0L;
        cVar.f2516W = true;
        cVar.f2517X = "eng";
        dVar.f2600w = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(L.a0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            N3.h.e(r7, r0)
        L5:
            java.lang.Object r0 = r6.f190l
            Y3.v r0 = (Y3.v) r0
            r0.getClass()
            F0.p r1 = Z3.q.f3135a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Y3.v.f2810p
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            L.a0 r3 = (L.a0) r3
            boolean r4 = r3 instanceof L.T
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            L.b0 r4 = L.b0.f1371b
            boolean r4 = N3.h.a(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof L.C0095c
            if (r4 == 0) goto L35
            int r4 = r3.f1370a
            int r5 = r7.f1370a
            if (r5 <= r4) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof L.Q
            if (r4 == 0) goto L47
        L39:
            if (r2 != 0) goto L3c
            r2 = r1
        L3c:
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r1 = r3
        L40:
            boolean r0 = r0.c(r2, r1)
            if (r0 == 0) goto L5
            return
        L47:
            A1.c r7 = new A1.c
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.d.u(L.a0):void");
    }

    public d(int i) {
        Handler handler;
        Handler handlerB;
        switch (i) {
            case 11:
                this.f190l = new AtomicInteger(0);
                return;
            case 12:
                this.f190l = new Y3.v(b0.f1371b);
                return;
            case 15:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT < 28) {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (InstantiationException e6) {
                        e = e6;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (NoSuchMethodException e7) {
                        e = e7;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (InvocationTargetException e8) {
                        Throwable cause = e8.getCause();
                        if (cause instanceof RuntimeException) {
                            throw ((RuntimeException) cause);
                        }
                        if (!(cause instanceof Error)) {
                            throw new RuntimeException(cause);
                        }
                        throw ((Error) cause);
                    }
                    handlerB = handler;
                    break;
                } else {
                    handlerB = AbstractC0683c.b(mainLooper);
                }
                this.f190l = handlerB;
                return;
            case 27:
                this.f190l = new C0187m();
                return;
            case 29:
                this.f190l = new Bundle();
                return;
            default:
                this.f190l = new CopyOnWriteArrayList();
                return;
        }
    }

    @Override // B0.m
    public void q(o oVar, long j5, long j6, boolean z4) {
    }
}
