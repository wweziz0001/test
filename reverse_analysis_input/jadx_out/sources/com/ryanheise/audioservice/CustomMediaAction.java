package com.ryanheise.audioservice;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class CustomMediaAction {
    public final Map<?, ?> extras;
    public final String name;

    public CustomMediaAction(String str, Map<?, ?> map) {
        this.name = str;
        this.extras = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomMediaAction customMediaAction = (CustomMediaAction) obj;
        return this.name.equals(customMediaAction.name) && Objects.equals(this.extras, customMediaAction.extras);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.extras);
    }
}
