package com.dexterous.flutterlocalnotifications.utils;

import g.InterfaceC0434a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public class StringUtils {
    public static Boolean isNullOrEmpty(String str) {
        return Boolean.valueOf(str == null || str.isEmpty());
    }
}
