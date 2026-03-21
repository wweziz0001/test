package i0;

import android.media.metrics.LogSessionId;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f6414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6415c;

    static {
        if (AbstractC0370w.f5326a < 31) {
            new j("");
        } else {
            new j(i.f6411b, "");
        }
    }

    public j(String str) {
        AbstractC0360m.h(AbstractC0370w.f5326a < 31);
        this.f6413a = str;
        this.f6414b = null;
        this.f6415c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f6413a, jVar.f6413a) && Objects.equals(this.f6414b, jVar.f6414b) && Objects.equals(this.f6415c, jVar.f6415c);
    }

    public final int hashCode() {
        return Objects.hash(this.f6413a, this.f6414b, this.f6415c);
    }

    public j(LogSessionId logSessionId, String str) {
        this(new i(logSessionId), str);
    }

    public j(i iVar, String str) {
        this.f6414b = iVar;
        this.f6413a = str;
        this.f6415c = new Object();
    }
}
