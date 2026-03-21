package Z1;

import Q1.C;
import Q1.C0121d;
import androidx.work.impl.WorkDatabase;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends s1.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, int i) {
        super(workDatabase);
        this.f2993d = i;
    }

    @Override // s1.l
    public final String c() {
        switch (this.f2993d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void l(y1.h hVar, Object obj) throws Throwable {
        int i;
        switch (this.f2993d) {
            case 0:
                a aVar = (a) obj;
                hVar.h(aVar.f2991a, 1);
                String str = aVar.f2992b;
                if (str == null) {
                    hVar.g(2);
                    return;
                } else {
                    hVar.h(str, 2);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                hVar.h(dVar.f2998a, 1);
                hVar.m(dVar.f2999b.longValue(), 2);
                return;
            case 2:
                String str2 = ((g) obj).f3008a;
                if (str2 == null) {
                    hVar.g(1);
                } else {
                    hVar.h(str2, 1);
                }
                hVar.m(r12.f3009b, 2);
                hVar.m(r12.f3010c, 3);
                return;
            case 3:
                k kVar = (k) obj;
                String str3 = kVar.f3018a;
                if (str3 == null) {
                    hVar.g(1);
                } else {
                    hVar.h(str3, 1);
                }
                hVar.h(kVar.f3019b, 2);
                return;
            case 4:
                throw new ClassCastException();
            case 5:
                p pVar = (p) obj;
                int i5 = 1;
                String str4 = pVar.f3046a;
                if (str4 == null) {
                    hVar.g(1);
                } else {
                    hVar.h(str4, 1);
                }
                hVar.m(C.v0(pVar.f3047b), 2);
                String str5 = pVar.f3048c;
                if (str5 == null) {
                    hVar.g(3);
                } else {
                    hVar.h(str5, 3);
                }
                String str6 = pVar.f3049d;
                if (str6 == null) {
                    hVar.g(4);
                } else {
                    hVar.h(str6, 4);
                }
                byte[] bArrB = Q1.g.b(pVar.f3050e);
                if (bArrB == null) {
                    hVar.g(5);
                } else {
                    hVar.e(5, bArrB);
                }
                byte[] bArrB2 = Q1.g.b(pVar.f3051f);
                if (bArrB2 == null) {
                    hVar.g(6);
                } else {
                    hVar.e(6, bArrB2);
                }
                hVar.m(pVar.f3052g, 7);
                hVar.m(pVar.f3053h, 8);
                hVar.m(pVar.i, 9);
                hVar.m(pVar.f3055k, 10);
                int i6 = pVar.f3056l;
                AbstractC0307a.r("backoffPolicy", i6);
                int iB = O.i.b(i6);
                if (iB == 0) {
                    i = 0;
                } else {
                    if (iB != 1) {
                        throw new A1.c();
                    }
                    i = 1;
                }
                hVar.m(i, 11);
                hVar.m(pVar.f3057m, 12);
                hVar.m(pVar.f3058n, 13);
                hVar.m(pVar.f3059o, 14);
                hVar.m(pVar.f3060p, 15);
                hVar.m(pVar.f3061q ? 1L : 0L, 16);
                int i7 = pVar.f3062r;
                AbstractC0307a.r("policy", i7);
                int iB2 = O.i.b(i7);
                if (iB2 == 0) {
                    i5 = 0;
                } else if (iB2 != 1) {
                    throw new A1.c();
                }
                hVar.m(i5, 17);
                hVar.m(pVar.f3063s, 18);
                hVar.m(pVar.f3064t, 19);
                hVar.m(pVar.f3065u, 20);
                hVar.m(pVar.f3066v, 21);
                hVar.m(pVar.f3067w, 22);
                C0121d c0121d = pVar.f3054j;
                if (c0121d != null) {
                    hVar.m(C.k0(c0121d.f1808a), 23);
                    hVar.m(c0121d.f1809b ? 1L : 0L, 24);
                    hVar.m(c0121d.f1810c ? 1L : 0L, 25);
                    hVar.m(c0121d.f1811d ? 1L : 0L, 26);
                    hVar.m(c0121d.f1812e ? 1L : 0L, 27);
                    hVar.m(c0121d.f1813f, 28);
                    hVar.m(c0121d.f1814g, 29);
                    hVar.e(30, C.p0(c0121d.f1815h));
                    return;
                }
                hVar.g(23);
                hVar.g(24);
                hVar.g(25);
                hVar.g(26);
                hVar.g(27);
                hVar.g(28);
                hVar.g(29);
                hVar.g(30);
                return;
            default:
                r rVar = (r) obj;
                String str7 = rVar.f3082a;
                if (str7 == null) {
                    hVar.g(1);
                } else {
                    hVar.h(str7, 1);
                }
                String str8 = rVar.f3083b;
                if (str8 == null) {
                    hVar.g(2);
                    return;
                } else {
                    hVar.h(str8, 2);
                    return;
                }
        }
    }

    public final void m(Object obj) {
        y1.h hVarA = a();
        try {
            l(hVarA, obj);
            hVarA.f10933m.executeInsert();
        } finally {
            j(hVarA);
        }
    }
}
