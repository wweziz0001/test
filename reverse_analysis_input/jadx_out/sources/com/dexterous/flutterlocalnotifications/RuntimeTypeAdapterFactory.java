package com.dexterous.flutterlocalnotifications;

import G2.r;
import G2.s;
import J2.E;
import g.InterfaceC0434a;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public final class RuntimeTypeAdapterFactory<T> implements s {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // G2.s
    public <R> r create(G2.e eVar, N2.a<R> aVar) {
        if (aVar.f1601a != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            r rVarD = eVar.d(this, new N2.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), rVarD);
            linkedHashMap2.put(entry.getValue(), rVarD);
        }
        return new E(this, linkedHashMap, linkedHashMap2).a();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
