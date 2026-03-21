package M2;

import J2.AbstractC0074g;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0074g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Class cls, int i) {
        super(cls);
        this.f1511b = i;
    }

    @Override // J2.AbstractC0074g
    public final Date a(Date date) {
        switch (this.f1511b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
