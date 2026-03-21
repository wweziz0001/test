package Z1;

import Q1.C;
import Q1.C0121d;
import androidx.work.impl.WorkDatabase;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends s1.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(WorkDatabase workDatabase, int i) {
        super(workDatabase);
        this.f3011d = i;
    }

    @Override // s1.l
    public final String c() {
        switch (this.f3011d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 1:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 2:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 3:
                return "DELETE FROM WorkProgress";
            case 4:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 5:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 9:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 10:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 11:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case 12:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            case 13:
                return "DELETE FROM workspec WHERE id=?";
            case 14:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 15:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            case 16:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 17:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 18:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case 19:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public void l(y1.h hVar, Object obj) throws Throwable {
        int i;
        p pVar = (p) obj;
        int i5 = 1;
        String str = pVar.f3046a;
        if (str == null) {
            hVar.g(1);
        } else {
            hVar.h(str, 1);
        }
        hVar.m(C.v0(pVar.f3047b), 2);
        String str2 = pVar.f3048c;
        if (str2 == null) {
            hVar.g(3);
        } else {
            hVar.h(str2, 3);
        }
        String str3 = pVar.f3049d;
        if (str3 == null) {
            hVar.g(4);
        } else {
            hVar.h(str3, 4);
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
        } else {
            hVar.g(23);
            hVar.g(24);
            hVar.g(25);
            hVar.g(26);
            hVar.g(27);
            hVar.g(28);
            hVar.g(29);
            hVar.g(30);
        }
        if (str == null) {
            hVar.g(31);
        } else {
            hVar.h(str, 31);
        }
    }
}
