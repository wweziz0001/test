package io.flutter.embedding.android;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: io.flutter.embedding.android.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0497p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f6589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e3.k f6593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S f6594h;
    public W i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6597l;

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("initial_route", this.f6590d);
        bundle.putBoolean("handle_deeplinking", this.f6591e);
        bundle.putString("app_bundle_path", this.f6592f);
        bundle.putString("dart_entrypoint", this.f6587a);
        bundle.putString("dart_entrypoint_uri", this.f6588b);
        bundle.putStringArrayList("dart_entrypoint_args", this.f6589c != null ? new ArrayList<>(this.f6589c) : null);
        e3.k kVar = this.f6593g;
        if (kVar != null) {
            HashSet hashSet = kVar.f5640a;
            bundle.putStringArray("initialization_args", (String[]) hashSet.toArray(new String[hashSet.size()]));
        }
        S s4 = this.f6594h;
        bundle.putString("flutterview_render_mode", s4 != null ? s4.name() : "surface");
        bundle.putString("flutterview_transparency_mode", this.i.name());
        bundle.putBoolean("should_attach_engine_to_activity", this.f6595j);
        bundle.putBoolean("destroy_engine_with_fragment", true);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f6596k);
        bundle.putBoolean("should_delay_first_android_view_draw", this.f6597l);
        return bundle;
    }
}
