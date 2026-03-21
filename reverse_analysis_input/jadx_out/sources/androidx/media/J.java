package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private I mCallback;
    private final String mControlId = null;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private VolumeProvider mVolumeProviderFwk;

    public J(int i, int i5, int i6) {
        this.mControlType = i;
        this.mMaxVolume = i5;
        this.mCurrentVolume = i6;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public final String getVolumeControlId() {
        return this.mControlId;
    }

    public Object getVolumeProvider() {
        if (this.mVolumeProviderFwk == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.mVolumeProviderFwk = new F(this, this.mControlType, this.mMaxVolume, this.mCurrentVolume, this.mControlId);
            } else {
                this.mVolumeProviderFwk = new G(this, this.mControlType, this.mMaxVolume, this.mCurrentVolume);
            }
        }
        return this.mVolumeProviderFwk;
    }

    public abstract void onAdjustVolume(int i);

    public abstract void onSetVolumeTo(int i);

    public void setCallback(I i) {
    }

    public final void setCurrentVolume(int i) {
        this.mCurrentVolume = i;
        H.a((VolumeProvider) getVolumeProvider(), i);
    }
}
