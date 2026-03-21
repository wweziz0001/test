package c4;

import android.view.KeyCharacterMap;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5096a;

    public Character a(int i) {
        char c5 = (char) i;
        if ((Integer.MIN_VALUE & i) != 0) {
            int i5 = i & Integer.MAX_VALUE;
            int i6 = this.f5096a;
            if (i6 != 0) {
                this.f5096a = KeyCharacterMap.getDeadChar(i6, i5);
            } else {
                this.f5096a = i5;
            }
        } else {
            int i7 = this.f5096a;
            if (i7 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i7, i);
                if (deadChar > 0) {
                    c5 = (char) deadChar;
                }
                this.f5096a = 0;
            }
        }
        return Character.valueOf(c5);
    }

    public i() {
        this.f5096a = 0;
    }
}
