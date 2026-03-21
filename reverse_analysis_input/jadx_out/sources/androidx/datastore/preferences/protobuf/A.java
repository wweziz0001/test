package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum A {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0215g.class, C0215g.f4144n),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    A(Class cls, Serializable serializable) {
    }
}
