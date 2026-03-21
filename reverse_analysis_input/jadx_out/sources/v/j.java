package v;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f10287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f10288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10289c;

    public j(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f10287a = colorStateList;
        this.f10288b = configuration;
        this.f10289c = theme == null ? 0 : theme.hashCode();
    }
}
