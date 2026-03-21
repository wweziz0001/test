package androidx.core.app;

import D1.c;
import D1.d;
import D1.e;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(c cVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        e eVarH = remoteActionCompat.f4011a;
        if (cVar.e(1)) {
            eVarH = cVar.h();
        }
        remoteActionCompat.f4011a = (IconCompat) eVarH;
        CharSequence charSequence = remoteActionCompat.f4012b;
        if (cVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((d) cVar).f546e);
        }
        remoteActionCompat.f4012b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4013c;
        if (cVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((d) cVar).f546e);
        }
        remoteActionCompat.f4013c = charSequence2;
        remoteActionCompat.f4014d = (PendingIntent) cVar.g(remoteActionCompat.f4014d, 4);
        boolean z4 = remoteActionCompat.f4015e;
        if (cVar.e(5)) {
            z4 = ((d) cVar).f546e.readInt() != 0;
        }
        remoteActionCompat.f4015e = z4;
        boolean z5 = remoteActionCompat.f4016f;
        if (cVar.e(6)) {
            z5 = ((d) cVar).f546e.readInt() != 0;
        }
        remoteActionCompat.f4016f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, c cVar) {
        cVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4011a;
        cVar.i(1);
        cVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4012b;
        cVar.i(2);
        Parcel parcel = ((d) cVar).f546e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4013c;
        cVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        cVar.k(remoteActionCompat.f4014d, 4);
        boolean z4 = remoteActionCompat.f4015e;
        cVar.i(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f4016f;
        cVar.i(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
