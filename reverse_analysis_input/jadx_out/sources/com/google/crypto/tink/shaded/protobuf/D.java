package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum D {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC0329i.class, AbstractC0329i.f5205m),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    D(Class cls, Serializable serializable) {
    }
}
