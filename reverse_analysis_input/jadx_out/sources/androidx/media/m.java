package androidx.media;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0284a f4604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, C0284a c0284a, int i) {
        super(str);
        this.f4603e = i;
        this.f4604f = c0284a;
    }

    @Override // androidx.media.u
    public final void a() {
        switch (this.f4603e) {
            case 0:
                ((MediaBrowserService.Result) this.f4604f.f4576a).detach();
                break;
            case 1:
                ((MediaBrowserService.Result) this.f4604f.f4576a).detach();
                break;
            default:
                ((MediaBrowserService.Result) this.f4604f.f4576a).detach();
                break;
        }
    }

    @Override // androidx.media.u
    public final void d(Object obj) {
        ArrayList arrayList;
        switch (this.f4603e) {
            case 0:
                List<MediaBrowserCompat$MediaItem> list = (List) obj;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaBrowserCompat$MediaItem.writeToParcel(parcelObtain, 0);
                        arrayList2.add(parcelObtain);
                    }
                    arrayList = arrayList2;
                }
                this.f4604f.d(arrayList);
                break;
            case 1:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) obj;
                C0284a c0284a = this.f4604f;
                if (mediaBrowserCompat$MediaItem2 == null) {
                    c0284a.d(null);
                } else {
                    Parcel parcelObtain2 = Parcel.obtain();
                    mediaBrowserCompat$MediaItem2.writeToParcel(parcelObtain2, 0);
                    c0284a.d(parcelObtain2);
                }
                break;
            default:
                List<MediaBrowserCompat$MediaItem> list2 = (List) obj;
                C0284a c0284a2 = this.f4604f;
                if (list2 == null) {
                    c0284a2.d(null);
                } else {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 : list2) {
                        Parcel parcelObtain3 = Parcel.obtain();
                        mediaBrowserCompat$MediaItem3.writeToParcel(parcelObtain3, 0);
                        arrayList3.add(parcelObtain3);
                    }
                    c0284a2.d(arrayList3);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, String str, C0284a c0284a, Bundle bundle) {
        super(str);
        this.f4603e = 2;
        this.f4604f = c0284a;
    }
}
