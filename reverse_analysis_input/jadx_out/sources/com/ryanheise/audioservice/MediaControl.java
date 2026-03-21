package com.ryanheise.audioservice;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class MediaControl {
    public final long actionCode;
    public final CustomMediaAction customAction;
    public final String icon;
    public final String label;

    public MediaControl(String str, String str2, long j5, CustomMediaAction customMediaAction) {
        this.icon = str;
        this.label = str2;
        this.actionCode = j5;
        this.customAction = customMediaAction;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaControl)) {
            return false;
        }
        MediaControl mediaControl = (MediaControl) obj;
        return this.icon.equals(mediaControl.icon) && this.label.equals(mediaControl.label) && this.actionCode == mediaControl.actionCode && Objects.equals(this.customAction, mediaControl.customAction);
    }
}
