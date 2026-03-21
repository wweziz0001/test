package io.flutter.embedding.android;

import android.os.Bundle;

/* JADX INFO: renamed from: io.flutter.embedding.android.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0498q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6599b = "main";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6600c = "/";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6601d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S f6602e = S.f6546l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public W f6603f = W.f6559m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6604g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6605h = false;
    public boolean i = false;

    public C0498q(String str) {
        this.f6598a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("cached_engine_group_id", this.f6598a);
        bundle.putString("dart_entrypoint", this.f6599b);
        bundle.putString("initial_route", this.f6600c);
        bundle.putBoolean("handle_deeplinking", this.f6601d);
        S s4 = this.f6602e;
        bundle.putString("flutterview_render_mode", s4 != null ? s4.name() : "surface");
        bundle.putString("flutterview_transparency_mode", this.f6603f.name());
        bundle.putBoolean("should_attach_engine_to_activity", this.f6604g);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f6605h);
        bundle.putBoolean("should_delay_first_android_view_draw", this.i);
        return bundle;
    }
}
