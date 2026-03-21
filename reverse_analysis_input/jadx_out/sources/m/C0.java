package m;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f8238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f8239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f8240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f8241e;

    public C0(View view) {
        this.f8237a = (TextView) view.findViewById(R.id.text1);
        this.f8238b = (TextView) view.findViewById(R.id.text2);
        this.f8239c = (ImageView) view.findViewById(R.id.icon1);
        this.f8240d = (ImageView) view.findViewById(R.id.icon2);
        this.f8241e = (ImageView) view.findViewById(com.example.hqp_mobile_app.R.id.edit_query);
    }
}
